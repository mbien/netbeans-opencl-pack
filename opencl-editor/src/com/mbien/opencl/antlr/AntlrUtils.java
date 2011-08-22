/*
 * Created on Monday, August 22 2011 03:59
 */
package com.mbien.opencl.antlr;

import com.mbien.opencl.editor.CLTokenID;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michael Bien
 */
public class AntlrUtils {

    public static List<CLTokenID> readTokens(String file) {

        List<CLTokenID> tokens = new ArrayList<>(64);
        Scanner scanner = new Scanner(AntlrUtils.class.getResourceAsStream(file));

        while(scanner.hasNext()) {

            String mapping = scanner.next();
            int cut = mapping.lastIndexOf('=');
            String name = mapping.substring(0, cut);

            if(!name.startsWith("T__")) {

                // unquote
                if(name.startsWith("'")) {
                    name = name.substring(1, name.length()-1);
                }

                String category;
                switch(name) {
                    case "BUILTIN_TYPE":
                    //todo: maybe we could get rid of this list by modifying the grammar a bit
                    case "auto":
                    case "bool":
                    case "break":
                    case "case":
                    case "const":
                    case "constant":
                    case "continue":
                    case "default":
                    case "do":
                    case "else":
                    case "enum":
                    case "extern":
                    case "for":
                    case "global":
                    case "goto":
                    case "if":
                    case "intptr_t":
                    case "kernel":
                    case "local":
                    case "ptrdiff_t":
                    case "register":
                    case "return":
                    case "size_t":
                    case "sizeof":
                    case "static":
                    case "struct":
                    case "switch":
                    case "typedef":
                    case "union":
                    case "unsigned":
                    case "void":
                    case "volatile":
                    case "while":
                        category = "keyword";
                        break;
                    case "LINE_COMMENT":
                    case "COMMENT":
                        category = "comment";
                        break;
                    case "LINE_COMMAND":
                        category = "command";
                        break;
                    default:
                        category = "character";
                }

                int id = Integer.parseInt(mapping.substring(cut+1, mapping.length()));
                tokens.add(new CLTokenID(name, category, id));
            }
        }
        
        return tokens;
    }

}
