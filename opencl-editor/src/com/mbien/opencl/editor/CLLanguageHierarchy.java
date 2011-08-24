/*
 * Created on Monday, August 22 2011 01:45
 */
package com.mbien.opencl.editor;

import com.mbien.opencl.antlr.AntlrUtils;
import com.mbien.opencl.editor.file.CLDataObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Michael Bien
 */
public class CLLanguageHierarchy extends LanguageHierarchy<CLTokenID> {

    private final static List<CLTokenID> tokens;
    private final static Map<Integer, CLTokenID> idToToken = new HashMap<>(64);

    static {
        tokens = AntlrUtils.readTokens("CL.tokens");

        for (CLTokenID token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static CLTokenID getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected Collection<CLTokenID> createTokenIds() {
        return tokens;
    }

    @Override
    protected Lexer<CLTokenID> createLexer(LexerRestartInfo<CLTokenID> info) {
        return new NBCLLexer(info);
    }

    @Override
    protected String mimeType() {
        return CLDataObject.MIME_TYPE;
    }
}