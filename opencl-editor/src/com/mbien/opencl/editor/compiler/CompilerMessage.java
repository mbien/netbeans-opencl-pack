/*
 * Created on Friday, August 26 2011 01:39
 */
package com.mbien.opencl.editor.compiler;

import com.jogamp.opencl.CLDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mbien
 */
public class CompilerMessage {

    private final int line;
    private final int column;

    private final KIND kind;
    private final String msg;
    private final int lineInLog;

    public enum KIND {
        ERROR, WARNING, MSG;
    }

    private CompilerMessage(int line, int column, KIND kind, String msg, int lineInLog) {
        this.line = line;
        this.column = column;
        this.kind = kind;
        this.msg = msg;
        this.lineInLog = lineInLog;
    }

    public static List<CompilerMessage> parse(CLDevice device, String log) {

        String name = device.getPlatform().getName().toLowerCase();

        List<CompilerMessage> list = new ArrayList<>();
        Scanner scanner = new Scanner(log).useDelimiter("\n");
        
        if (name.contains("intel")) {
            parseIntelLog(scanner, list);
        } else if (name.contains("cuda") || name.contains("nvidia")) {
            parseNvidiaLog(scanner, list);
        } else if (name.contains("amd")) {
            parseAMDLog(scanner, list);
        }
        return list;
    }

    private static void parseIntelLog(Scanner scanner, List<CompilerMessage> list) {

        //:7:14: error: <msg>
        Pattern pattern = Pattern.compile(":(\\d+):(\\d+):\\s+(\\w+):");

        int lineInLog = 0;
        while (scanner.hasNext()) {
            String part = scanner.next();
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                int line = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));
                String kind = matcher.group(3);
                list.add(new CompilerMessage(line, column, parseKind(kind), part, lineInLog));
            }
            lineInLog++;
        }

    }

    private static void parseNvidiaLog(Scanner scanner, List<CompilerMessage> list) {

        //:7:14: error: <msg>
        //    int id = get_gl obal_id(0);
        //             ^
        Pattern pattern = Pattern.compile(":(\\d+):(\\d+):\\s+(\\w+):");

        int lineInLog = 0;
        while (scanner.hasNext()) {
            String part = scanner.next();
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                int line = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));
                KIND kind = parseKind(matcher.group(3));
//                part+="\n"+scanner.next();
//                part+="\n"+scanner.next();
                list.add(new CompilerMessage(line, column, kind, part, lineInLog));
//                lineInLog+=2;
            }
            lineInLog++;
        }
    }

    private static void parseAMDLog(Scanner scanner, List<CompilerMessage> list) {

        ///tmp/OCLdEIgLI.cl(7): error: <msg>
        //int id = get_gl obal_id(0);
        //         ^
        Pattern pattern = Pattern.compile("[^\\(]*\\((\\d+)\\):\\s+(\\w+):");

        int lineInLog = 0;
        while (scanner.hasNext()) {
            String part = scanner.next();
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                int line = Integer.parseInt(matcher.group(1));
                String kind = matcher.group(2);
//                part+="\n"+scanner.next();
//                String col = scanner.next();
//                int column = col.indexOf('^');
//                part+="\n"+col;
                int column = 0;
                list.add(new CompilerMessage(line, column, parseKind(kind), part, lineInLog));
//                lineInLog+=2;
            }
            lineInLog++;
        }
    }

    private static KIND parseKind(String kind) {
        try{
            return KIND.valueOf(kind.toUpperCase());
        }catch(IllegalArgumentException ignore) {
            return KIND.MSG;
        }
    }

    public int getColumn() {
        return column;
    }

    public KIND getKind() {
        return kind;
    }

    public int getLine() {
        return line;
    }

    public String getMsg() {
        return msg;
    }

    public int getLineInLog() {
        return lineInLog;
    }


}
