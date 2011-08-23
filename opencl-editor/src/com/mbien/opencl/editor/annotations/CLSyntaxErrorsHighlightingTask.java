/*
 * Created on Tuesday, August 23 2011 02:21
 */
package com.mbien.opencl.editor.annotations;

import com.mbien.opencl.antlr.CLParser.SyntaxError;
import com.mbien.opencl.editor.NBCLParser.CLEditorParserResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.antlr.runtime.RecognitionException;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;

/**
 *
 * @author mbien
 */
public class CLSyntaxErrorsHighlightingTask extends ParserResultTask<CLEditorParserResult> {

    public CLSyntaxErrorsHighlightingTask() {
    }

    public void run(CLEditorParserResult result, SchedulerEvent event) {
        try {

            List<SyntaxError> syntaxErrors = result.getCLParser().syntaxErrors;
            Document document = result.getSnapshot().getSource().getDocument(false);

            List<ErrorDescription> errors = new ArrayList<>();
            for (SyntaxError error : syntaxErrors) {

                RecognitionException exception = error.exception;

                int line = exception.line;
                if (line <= 0) {
                    continue;
                }
                ErrorDescription description = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR, error.message, document,
                        document.createPosition(error.start),
                        document.createPosition(error.stop));
                errors.add(description);
            }
            HintsController.setErrors(document, "opencl-syntax-errors", errors);
        } catch (ParseException | BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    public int getPriority() {
        return 100;
    }

    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    public void cancel() {
    }
}