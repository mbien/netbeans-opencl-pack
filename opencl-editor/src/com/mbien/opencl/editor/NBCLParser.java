/*
 * Created on Monday, August 22 2011 03:05
 */
package com.mbien.opencl.editor;

import com.mbien.opencl.antlr.CLLexer;
import com.mbien.opencl.antlr.CLParser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author mbien
 */
public class NBCLParser extends Parser {

    private Snapshot snapshot;
    private CLParser parser;

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
        this.snapshot = snapshot;

        ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
        Lexer lexer = new CLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new CLParser(tokens);
        try {
            parser.translation_unit();
        } catch (RecognitionException ex) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, "error parsing document.", ex);
        }
    }

    @Override
    public Result getResult(Task task) {
        return new CLEditorParserResult(snapshot, parser);
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class CLEditorParserResult extends Result {

        private CLParser parser;
        private boolean valid = true;

        CLEditorParserResult(Snapshot snapshot, CLParser parser) {
            super(snapshot);
            this.parser = parser;
        }

        public CLParser getCLParser() throws ParseException {
            if (!valid) {
                throw new ParseException();
            }
            return parser;
        }

        @Override
        protected void invalidate() {
            valid = false;
        }
    }
}
