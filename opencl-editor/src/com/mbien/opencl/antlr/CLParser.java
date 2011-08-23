// $ANTLR 3.4 src/com/mbien/opencl/antlr/CL.g 2011-08-23 02:24:50

package com.mbien.opencl.antlr;

import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
OpenCL 1.1 ANTLR v3 grammar

original grammar copied from:
ANSI C ANTLR v3 grammar

Translated from Jutta Degener's 1995 ANSI C yacc grammar by Terence Parr
July 2006.  The lexical rules were taken from the Java grammar.

Jutta says: "In 1985, Jeff Lee published his Yacc grammar (which
is accompanied by a matching Lex specification) for the April 30, 1985 draft
version of the ANSI C standard.  Tom Stockfisch reposted it to net.sources in
1987; that original, as mentioned in the answer to question 17.25 of the
comp.lang.c FAQ, can be ftp'ed from ftp.uu.net,
   file usenet/net.sources/ansi.c.grammar.Z.
I intend to keep this version as close to the current C Standard grammar as
possible; please let me know if you discover discrepancies. Jutta Degener, 1995"

Generally speaking, you need symbol table info to parse C; typedefs
define types and then IDENTIFIERS are either types or plain IDs.  I'm doing
the min necessary here tracking only type names.  This is a good example
of the global scope (called Symbols).  Every rule that declares its usage
of Symbols pushes a new copy on the stack effectively creating a new
symbol scope.  Also note rule declaration declares a rule scope that
lets any invoked rule see isTypedef boolean.  It's much easier than
passing that info down as parameters.  Very clean.  Rule
direct_declarator can then easily determine whether the IDENTIFIER
should be declared as a type name.

I have only tested this on a single file, though it is 3500 lines.

This grammar requires ANTLR v3.0.1 or higher.

Terence Parr
July 2006

OpenCL language extensions
Michael Bien
Jan 2011

*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class CLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BUILTIN_TYPE", "CHARACTER_LITERAL", "COMMENT", "DECIMAL_LITERAL", "EscapeSequence", "Exponent", "FLOATING_POINT_LITERAL", "FloatTypeSuffix", "HEX_LITERAL", "HexDigit", "IDENTIFIER", "IntegerTypeSuffix", "LETTER", "LINE_COMMAND", "LINE_COMMENT", "OCTAL_LITERAL", "OctalEscape", "STRING_LITERAL", "UnicodeEscape", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'...'", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'?'", "'['", "']'", "'^'", "'^='", "'auto'", "'bool'", "'break'", "'case'", "'const'", "'constant'", "'continue'", "'default'", "'do'", "'else'", "'enum'", "'extern'", "'for'", "'global'", "'goto'", "'if'", "'intptr_t'", "'kernel'", "'local'", "'ptrdiff_t'", "'register'", "'return'", "'size_t'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int BUILTIN_TYPE=4;
    public static final int CHARACTER_LITERAL=5;
    public static final int COMMENT=6;
    public static final int DECIMAL_LITERAL=7;
    public static final int EscapeSequence=8;
    public static final int Exponent=9;
    public static final int FLOATING_POINT_LITERAL=10;
    public static final int FloatTypeSuffix=11;
    public static final int HEX_LITERAL=12;
    public static final int HexDigit=13;
    public static final int IDENTIFIER=14;
    public static final int IntegerTypeSuffix=15;
    public static final int LETTER=16;
    public static final int LINE_COMMAND=17;
    public static final int LINE_COMMENT=18;
    public static final int OCTAL_LITERAL=19;
    public static final int OctalEscape=20;
    public static final int STRING_LITERAL=21;
    public static final int UnicodeEscape=22;
    public static final int WS=23;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators

    protected static class Symbols_scope {
        Set types;
    }
    protected Stack Symbols_stack = new Stack();



    public CLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[215+1];
         

    }

    public String[] getTokenNames() { return CLParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/mbien/opencl/antlr/CL.g"; }



        public List<SyntaxError> syntaxErrors = new ArrayList<>();

        @Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames) {

            String message = super.getErrorMessage(e, tokenNames);

            SyntaxError syntaxError = new SyntaxError();
            syntaxError.exception = e;
            syntaxError.message = message;

            CommonToken token =  (CommonToken) e.token;

            syntaxError.line = e.token.getLine();
            syntaxError.charPositionInLine = e.token.getCharPositionInLine();
            syntaxError.start = token.getStartIndex();

            syntaxError.stop = token.getStopIndex()+1;

            syntaxErrors.add(syntaxError);
            return message;
        }

        boolean isTypeName(String name) {
            for (int i = Symbols_stack.size()-1; i>=0; i--) {
                Symbols_scope scope = (Symbols_scope)Symbols_stack.get(i);
                if ( scope.types.contains(name) ) {
                    return true;
                }
            }
            return false;
        }

        public static class SyntaxError {
            public RecognitionException exception;
            public String message;
            public int line;
            public int charPositionInLine;
            public int start;
            public int stop;
        }




    // $ANTLR start "translation_unit"
    // src/com/mbien/opencl/antlr/CL.g:110:1: translation_unit : ( external_declaration )+ ;
    public final void translation_unit() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int translation_unit_StartIndex = input.index();


          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:115:5: ( ( external_declaration )+ )
            // src/com/mbien/opencl/antlr/CL.g:115:7: ( external_declaration )+
            {
            // src/com/mbien/opencl/antlr/CL.g:115:7: ( external_declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BUILTIN_TYPE||LA1_0==IDENTIFIER||LA1_0==31||LA1_0==33||(LA1_0 >= 64 && LA1_0 <= 65)||(LA1_0 >= 68 && LA1_0 <= 69)||(LA1_0 >= 74 && LA1_0 <= 75)||LA1_0==77||(LA1_0 >= 80 && LA1_0 <= 84)||LA1_0==86||(LA1_0 >= 88 && LA1_0 <= 89)||(LA1_0 >= 91 && LA1_0 <= 95)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:115:7: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit85);
            	    external_declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, translation_unit_StartIndex); }

            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end "translation_unit"



    // $ANTLR start "external_declaration"
    // src/com/mbien/opencl/antlr/CL.g:132:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );
    public final void external_declaration() throws RecognitionException {
        int external_declaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:134:5: ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==64||LA2_0==75||LA2_0==84||LA2_0==88) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==81) ) {
                int LA2_2 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==94) ) {
                int LA2_3 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==65) ) {
                int LA2_4 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==BUILTIN_TYPE) ) {
                int LA2_5 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==93) ) {
                int LA2_6 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==83) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==80) ) {
                int LA2_8 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==86) ) {
                int LA2_9 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==89||LA2_0==92) ) {
                int LA2_10 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==74) ) {
                int LA2_11 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 11, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==IDENTIFIER) ) {
                int LA2_12 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( ((isTypeName(input.LT(1).getText()))) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 12, input);

                    throw nvae;

                }
            }
            else if ( ((LA2_0 >= 68 && LA2_0 <= 69)||LA2_0==77||LA2_0==82||LA2_0==95) ) {
                int LA2_13 = input.LA(2);

                if ( (synpred4_CL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==33) && (synpred4_CL())) {
                alt2=1;
            }
            else if ( (LA2_0==31) && (synpred4_CL())) {
                alt2=1;
            }
            else if ( (LA2_0==91) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:134:7: ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_external_declaration127);
                    function_definition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:135:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_external_declaration135);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, external_declaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "external_declaration"



    // $ANTLR start "function_definition"
    // src/com/mbien/opencl/antlr/CL.g:138:1: function_definition : ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) ;
    public final void function_definition() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int function_definition_StartIndex = input.index();


          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:143:5: ( ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) )
            // src/com/mbien/opencl/antlr/CL.g:143:10: ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement )
            {
            // src/com/mbien/opencl/antlr/CL.g:143:10: ( declaration_specifiers )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BUILTIN_TYPE||(LA3_0 >= 64 && LA3_0 <= 65)||(LA3_0 >= 68 && LA3_0 <= 69)||(LA3_0 >= 74 && LA3_0 <= 75)||LA3_0==77||(LA3_0 >= 80 && LA3_0 <= 84)||LA3_0==86||(LA3_0 >= 88 && LA3_0 <= 89)||(LA3_0 >= 92 && LA3_0 <= 95)) ) {
                alt3=1;
            }
            else if ( (LA3_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                    case 33:
                        {
                        alt3=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA3_17 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 31:
                        {
                        int LA3_18 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 64:
                    case 75:
                    case 84:
                    case 88:
                        {
                        int LA3_19 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 81:
                        {
                        int LA3_20 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 94:
                        {
                        int LA3_21 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 65:
                        {
                        int LA3_22 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case BUILTIN_TYPE:
                        {
                        int LA3_23 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 93:
                        {
                        int LA3_24 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 83:
                        {
                        int LA3_25 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 80:
                        {
                        int LA3_26 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 86:
                        {
                        int LA3_27 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 89:
                    case 92:
                        {
                        int LA3_28 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 74:
                        {
                        int LA3_29 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 68:
                    case 69:
                    case 77:
                    case 82:
                    case 95:
                        {
                        int LA3_30 = input.LA(3);

                        if ( (((synpred5_CL()&&synpred5_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt3=1;
                        }
                        }
                        break;
                }

            }
            switch (alt3) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:143:10: declaration_specifiers
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_function_definition166);
                    declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_declarator_in_function_definition169);
            declarator();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:144:9: ( ( declaration )+ compound_statement | compound_statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==BUILTIN_TYPE||LA5_0==IDENTIFIER||(LA5_0 >= 64 && LA5_0 <= 65)||(LA5_0 >= 68 && LA5_0 <= 69)||(LA5_0 >= 74 && LA5_0 <= 75)||LA5_0==77||(LA5_0 >= 80 && LA5_0 <= 84)||LA5_0==86||(LA5_0 >= 88 && LA5_0 <= 89)||(LA5_0 >= 91 && LA5_0 <= 95)) ) {
                alt5=1;
            }
            else if ( (LA5_0==97) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:144:14: ( declaration )+ compound_statement
                    {
                    // src/com/mbien/opencl/antlr/CL.g:144:14: ( declaration )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==BUILTIN_TYPE||LA4_0==IDENTIFIER||(LA4_0 >= 64 && LA4_0 <= 65)||(LA4_0 >= 68 && LA4_0 <= 69)||(LA4_0 >= 74 && LA4_0 <= 75)||LA4_0==77||(LA4_0 >= 80 && LA4_0 <= 84)||LA4_0==86||(LA4_0 >= 88 && LA4_0 <= 89)||(LA4_0 >= 91 && LA4_0 <= 95)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:144:14: declaration
                    	    {
                    	    pushFollow(FOLLOW_declaration_in_function_definition184);
                    	    declaration();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    pushFollow(FOLLOW_compound_statement_in_function_definition187);
                    compound_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:145:14: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_function_definition206);
                    compound_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, function_definition_StartIndex); }

            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end "function_definition"


    protected static class declaration_scope {
        boolean isTypedef;
    }
    protected Stack declaration_stack = new Stack();



    // $ANTLR start "declaration"
    // src/com/mbien/opencl/antlr/CL.g:149:1: declaration : ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' );
    public final void declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        int declaration_StartIndex = input.index();


          ((declaration_scope)declaration_stack.peek()).isTypedef = false;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:156:5: ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==91) ) {
                alt8=1;
            }
            else if ( (LA8_0==BUILTIN_TYPE||LA8_0==IDENTIFIER||(LA8_0 >= 64 && LA8_0 <= 65)||(LA8_0 >= 68 && LA8_0 <= 69)||(LA8_0 >= 74 && LA8_0 <= 75)||LA8_0==77||(LA8_0 >= 80 && LA8_0 <= 84)||LA8_0==86||(LA8_0 >= 88 && LA8_0 <= 89)||(LA8_0 >= 92 && LA8_0 <= 95)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:156:7: 'typedef' ( declaration_specifiers )? init_declarator_list ';'
                    {
                    match(input,91,FOLLOW_91_in_declaration258); if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:156:17: ( declaration_specifiers )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BUILTIN_TYPE||(LA6_0 >= 64 && LA6_0 <= 65)||(LA6_0 >= 68 && LA6_0 <= 69)||(LA6_0 >= 74 && LA6_0 <= 75)||LA6_0==77||(LA6_0 >= 80 && LA6_0 <= 84)||LA6_0==86||(LA6_0 >= 88 && LA6_0 <= 89)||(LA6_0 >= 92 && LA6_0 <= 95)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==IDENTIFIER) ) {
                        int LA6_12 = input.LA(2);

                        if ( (LA6_12==BUILTIN_TYPE||LA6_12==IDENTIFIER||LA6_12==33||(LA6_12 >= 64 && LA6_12 <= 65)||(LA6_12 >= 68 && LA6_12 <= 69)||(LA6_12 >= 74 && LA6_12 <= 75)||LA6_12==77||(LA6_12 >= 80 && LA6_12 <= 84)||LA6_12==86||(LA6_12 >= 88 && LA6_12 <= 89)||(LA6_12 >= 92 && LA6_12 <= 95)) ) {
                            alt6=1;
                        }
                        else if ( (LA6_12==31) ) {
                            int LA6_18 = input.LA(3);

                            if ( ((((isTypeName(input.LT(1).getText()))&&(isTypeName(input.LT(1).getText())))&&synpred8_CL())) ) {
                                alt6=1;
                            }
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:156:17: declaration_specifiers
                            {
                            pushFollow(FOLLOW_declaration_specifiers_in_declaration260);
                            declaration_specifiers();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {((declaration_scope)declaration_stack.peek()).isTypedef =true;}

                    pushFollow(FOLLOW_init_declarator_list_in_declaration271);
                    init_declarator_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_declaration273); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:158:7: declaration_specifiers ( init_declarator_list )? ';'
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_declaration282);
                    declaration_specifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:158:30: ( init_declarator_list )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==IDENTIFIER||LA7_0==31||LA7_0==33) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:158:30: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration284);
                            init_declarator_list();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,48,FOLLOW_48_in_declaration287); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, declaration_StartIndex); }

            declaration_stack.pop();
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "declaration_specifiers"
    // src/com/mbien/opencl/antlr/CL.g:161:1: declaration_specifiers : ( storage_class_specifier | ( ( 'kernel' )? type_specifier ) | type_qualifier )+ ;
    public final void declaration_specifiers() throws RecognitionException {
        int declaration_specifiers_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:162:5: ( ( storage_class_specifier | ( ( 'kernel' )? type_specifier ) | type_qualifier )+ )
            // src/com/mbien/opencl/antlr/CL.g:162:9: ( storage_class_specifier | ( ( 'kernel' )? type_specifier ) | type_qualifier )+
            {
            // src/com/mbien/opencl/antlr/CL.g:162:9: ( storage_class_specifier | ( ( 'kernel' )? type_specifier ) | type_qualifier )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA10_2 = input.LA(2);

                    if ( ((((isTypeName(input.LT(1).getText()))&&(isTypeName(input.LT(1).getText())))&&synpred13_CL())) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 64:
                case 75:
                case 84:
                case 88:
                    {
                    alt10=1;
                    }
                    break;
                case BUILTIN_TYPE:
                case 65:
                case 74:
                case 80:
                case 81:
                case 83:
                case 86:
                case 89:
                case 92:
                case 93:
                case 94:
                    {
                    alt10=2;
                    }
                    break;
                case 68:
                case 69:
                case 77:
                case 82:
                case 95:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:162:10: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers307);
            	    storage_class_specifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:162:36: ( ( 'kernel' )? type_specifier )
            	    {
            	    // src/com/mbien/opencl/antlr/CL.g:162:36: ( ( 'kernel' )? type_specifier )
            	    // src/com/mbien/opencl/antlr/CL.g:162:38: ( 'kernel' )? type_specifier
            	    {
            	    // src/com/mbien/opencl/antlr/CL.g:162:38: ( 'kernel' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==81) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // src/com/mbien/opencl/antlr/CL.g:162:38: 'kernel'
            	            {
            	            match(input,81,FOLLOW_81_in_declaration_specifiers313); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers316);
            	    type_specifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/com/mbien/opencl/antlr/CL.g:162:66: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers321);
            	    type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, declaration_specifiers_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "declaration_specifiers"



    // $ANTLR start "init_declarator_list"
    // src/com/mbien/opencl/antlr/CL.g:165:1: init_declarator_list : init_declarator ( ',' init_declarator )* ;
    public final void init_declarator_list() throws RecognitionException {
        int init_declarator_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:166:5: ( init_declarator ( ',' init_declarator )* )
            // src/com/mbien/opencl/antlr/CL.g:166:7: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list340);
            init_declarator();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:166:23: ( ',' init_declarator )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:166:24: ',' init_declarator
            	    {
            	    match(input,38,FOLLOW_38_in_init_declarator_list343); if (state.failed) return ;

            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list345);
            	    init_declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, init_declarator_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "init_declarator_list"



    // $ANTLR start "init_declarator"
    // src/com/mbien/opencl/antlr/CL.g:169:1: init_declarator : declarator ( '=' initializer )? ;
    public final void init_declarator() throws RecognitionException {
        int init_declarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:170:5: ( declarator ( '=' initializer )? )
            // src/com/mbien/opencl/antlr/CL.g:170:7: declarator ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator364);
            declarator();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:170:18: ( '=' initializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==53) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:170:19: '=' initializer
                    {
                    match(input,53,FOLLOW_53_in_init_declarator367); if (state.failed) return ;

                    pushFollow(FOLLOW_initializer_in_init_declarator369);
                    initializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, init_declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "init_declarator"



    // $ANTLR start "storage_class_specifier"
    // src/com/mbien/opencl/antlr/CL.g:173:1: storage_class_specifier : ( 'extern' | 'static' | 'auto' | 'register' );
    public final void storage_class_specifier() throws RecognitionException {
        int storage_class_specifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:174:5: ( 'extern' | 'static' | 'auto' | 'register' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)==64||input.LA(1)==75||input.LA(1)==84||input.LA(1)==88 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, storage_class_specifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "storage_class_specifier"



    // $ANTLR start "type_specifier"
    // src/com/mbien/opencl/antlr/CL.g:180:1: type_specifier : ( 'void' | 'bool' | BUILTIN_TYPE | 'unsigned' | 'ptrdiff_t' | 'intptr_t' | 'size_t' | struct_or_union_specifier | enum_specifier | type_id );
    public final void type_specifier() throws RecognitionException {
        int type_specifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:181:5: ( 'void' | 'bool' | BUILTIN_TYPE | 'unsigned' | 'ptrdiff_t' | 'intptr_t' | 'size_t' | struct_or_union_specifier | enum_specifier | type_id )
            int alt13=10;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt13=1;
                }
                break;
            case 65:
                {
                alt13=2;
                }
                break;
            case BUILTIN_TYPE:
                {
                alt13=3;
                }
                break;
            case 93:
                {
                alt13=4;
                }
                break;
            case 83:
                {
                alt13=5;
                }
                break;
            case 80:
                {
                alt13=6;
                }
                break;
            case 86:
                {
                alt13=7;
                }
                break;
            case 89:
            case 92:
                {
                alt13=8;
                }
                break;
            case 74:
                {
                alt13=9;
                }
                break;
            case IDENTIFIER:
                {
                alt13=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:181:7: 'void'
                    {
                    match(input,94,FOLLOW_94_in_type_specifier429); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:182:7: 'bool'
                    {
                    match(input,65,FOLLOW_65_in_type_specifier437); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:183:7: BUILTIN_TYPE
                    {
                    match(input,BUILTIN_TYPE,FOLLOW_BUILTIN_TYPE_in_type_specifier445); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:184:7: 'unsigned'
                    {
                    match(input,93,FOLLOW_93_in_type_specifier453); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:185:7: 'ptrdiff_t'
                    {
                    match(input,83,FOLLOW_83_in_type_specifier461); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/com/mbien/opencl/antlr/CL.g:186:7: 'intptr_t'
                    {
                    match(input,80,FOLLOW_80_in_type_specifier469); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/com/mbien/opencl/antlr/CL.g:187:7: 'size_t'
                    {
                    match(input,86,FOLLOW_86_in_type_specifier477); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/com/mbien/opencl/antlr/CL.g:188:7: struct_or_union_specifier
                    {
                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier485);
                    struct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/com/mbien/opencl/antlr/CL.g:189:7: enum_specifier
                    {
                    pushFollow(FOLLOW_enum_specifier_in_type_specifier493);
                    enum_specifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/com/mbien/opencl/antlr/CL.g:190:7: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type_specifier501);
                    type_id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, type_specifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type_specifier"



    // $ANTLR start "type_id"
    // src/com/mbien/opencl/antlr/CL.g:193:1: type_id :{...}? IDENTIFIER ;
    public final void type_id() throws RecognitionException {
        int type_id_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:194:5: ({...}? IDENTIFIER )
            // src/com/mbien/opencl/antlr/CL.g:194:9: {...}? IDENTIFIER
            {
            if ( !((isTypeName(input.LT(1).getText()))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "type_id", "isTypeName(input.LT(1).getText())");
            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_id522); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, type_id_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type_id"



    // $ANTLR start "struct_or_union_specifier"
    // src/com/mbien/opencl/antlr/CL.g:198:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );
    public final void struct_or_union_specifier() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int struct_or_union_specifier_StartIndex = input.index();


          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:204:5: ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==89||LA15_0==92) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==IDENTIFIER) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==97) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==EOF||LA15_2==BUILTIN_TYPE||LA15_2==IDENTIFIER||(LA15_2 >= 31 && LA15_2 <= 33)||LA15_2==38||(LA15_2 >= 47 && LA15_2 <= 48)||LA15_2==60||(LA15_2 >= 64 && LA15_2 <= 65)||(LA15_2 >= 68 && LA15_2 <= 69)||(LA15_2 >= 74 && LA15_2 <= 75)||LA15_2==77||(LA15_2 >= 80 && LA15_2 <= 84)||LA15_2==86||(LA15_2 >= 88 && LA15_2 <= 89)||(LA15_2 >= 92 && LA15_2 <= 95)) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA15_1==97) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:204:7: struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier558);
                    struct_or_union();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:204:23: ( IDENTIFIER )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IDENTIFIER) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:204:23: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier560); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,97,FOLLOW_97_in_struct_or_union_specifier563); if (state.failed) return ;

                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier565);
                    struct_declaration_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,101,FOLLOW_101_in_struct_or_union_specifier567); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:205:7: struct_or_union IDENTIFIER
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier575);
                    struct_or_union();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier577); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, struct_or_union_specifier_StartIndex); }

            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end "struct_or_union_specifier"



    // $ANTLR start "struct_or_union"
    // src/com/mbien/opencl/antlr/CL.g:208:1: struct_or_union : ( 'struct' | 'union' );
    public final void struct_or_union() throws RecognitionException {
        int struct_or_union_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:209:5: ( 'struct' | 'union' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)==89||input.LA(1)==92 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, struct_or_union_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "struct_or_union"



    // $ANTLR start "struct_declaration_list"
    // src/com/mbien/opencl/antlr/CL.g:213:1: struct_declaration_list : ( struct_declaration )+ ;
    public final void struct_declaration_list() throws RecognitionException {
        int struct_declaration_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:214:5: ( ( struct_declaration )+ )
            // src/com/mbien/opencl/antlr/CL.g:214:7: ( struct_declaration )+
            {
            // src/com/mbien/opencl/antlr/CL.g:214:7: ( struct_declaration )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BUILTIN_TYPE||LA16_0==IDENTIFIER||LA16_0==65||(LA16_0 >= 68 && LA16_0 <= 69)||LA16_0==74||LA16_0==77||LA16_0==80||(LA16_0 >= 82 && LA16_0 <= 83)||LA16_0==86||LA16_0==89||(LA16_0 >= 92 && LA16_0 <= 95)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:214:7: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list619);
            	    struct_declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, struct_declaration_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "struct_declaration_list"



    // $ANTLR start "struct_declaration"
    // src/com/mbien/opencl/antlr/CL.g:217:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' ;
    public final void struct_declaration() throws RecognitionException {
        int struct_declaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:218:5: ( specifier_qualifier_list struct_declarator_list ';' )
            // src/com/mbien/opencl/antlr/CL.g:218:7: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration637);
            specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration639);
            struct_declarator_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,48,FOLLOW_48_in_struct_declaration641); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, struct_declaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "struct_declaration"



    // $ANTLR start "specifier_qualifier_list"
    // src/com/mbien/opencl/antlr/CL.g:221:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
    public final void specifier_qualifier_list() throws RecognitionException {
        int specifier_qualifier_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:222:5: ( ( type_qualifier | type_specifier )+ )
            // src/com/mbien/opencl/antlr/CL.g:222:7: ( type_qualifier | type_specifier )+
            {
            // src/com/mbien/opencl/antlr/CL.g:222:7: ( type_qualifier | type_specifier )+
            int cnt17=0;
            loop17:
            do {
                int alt17=3;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    switch ( input.LA(2) ) {
                    case 60:
                        {
                        int LA17_17 = input.LA(3);

                        if ( (((synpred34_CL()&&synpred34_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt17=2;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA17_18 = input.LA(3);

                        if ( (((synpred34_CL()&&synpred34_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt17=2;
                        }


                        }
                        break;
                    case 47:
                        {
                        int LA17_19 = input.LA(3);

                        if ( (((synpred34_CL()&&synpred34_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                            alt17=2;
                        }


                        }
                        break;
                    case BUILTIN_TYPE:
                    case IDENTIFIER:
                    case 32:
                    case 33:
                    case 65:
                    case 68:
                    case 69:
                    case 74:
                    case 77:
                    case 80:
                    case 82:
                    case 83:
                    case 86:
                    case 89:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                        {
                        alt17=2;
                        }
                        break;

                    }

                    }
                    break;
                case 68:
                case 69:
                case 77:
                case 82:
                case 95:
                    {
                    alt17=1;
                    }
                    break;
                case BUILTIN_TYPE:
                case 65:
                case 74:
                case 80:
                case 83:
                case 86:
                case 89:
                case 92:
                case 93:
                case 94:
                    {
                    alt17=2;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:222:9: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list660);
            	    type_qualifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:222:26: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list664);
            	    type_specifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, specifier_qualifier_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "specifier_qualifier_list"



    // $ANTLR start "struct_declarator_list"
    // src/com/mbien/opencl/antlr/CL.g:225:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* ;
    public final void struct_declarator_list() throws RecognitionException {
        int struct_declarator_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:226:5: ( struct_declarator ( ',' struct_declarator )* )
            // src/com/mbien/opencl/antlr/CL.g:226:7: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list684);
            struct_declarator();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:226:25: ( ',' struct_declarator )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:226:26: ',' struct_declarator
            	    {
            	    match(input,38,FOLLOW_38_in_struct_declarator_list687); if (state.failed) return ;

            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list689);
            	    struct_declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, struct_declarator_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "struct_declarator_list"



    // $ANTLR start "struct_declarator"
    // src/com/mbien/opencl/antlr/CL.g:229:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final void struct_declarator() throws RecognitionException {
        int struct_declarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:230:5: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER||LA20_0==31||LA20_0==33) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:230:7: declarator ( ':' constant_expression )?
                    {
                    pushFollow(FOLLOW_declarator_in_struct_declarator708);
                    declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:230:18: ( ':' constant_expression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==47) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:230:19: ':' constant_expression
                            {
                            match(input,47,FOLLOW_47_in_struct_declarator711); if (state.failed) return ;

                            pushFollow(FOLLOW_constant_expression_in_struct_declarator713);
                            constant_expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:231:7: ':' constant_expression
                    {
                    match(input,47,FOLLOW_47_in_struct_declarator723); if (state.failed) return ;

                    pushFollow(FOLLOW_constant_expression_in_struct_declarator725);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, struct_declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "struct_declarator"



    // $ANTLR start "enum_specifier"
    // src/com/mbien/opencl/antlr/CL.g:234:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );
    public final void enum_specifier() throws RecognitionException {
        int enum_specifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:236:5: ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==74) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==97) ) {
                    alt21=1;
                }
                else if ( (LA21_1==IDENTIFIER) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==97) ) {
                        alt21=2;
                    }
                    else if ( (LA21_3==EOF||LA21_3==BUILTIN_TYPE||LA21_3==IDENTIFIER||(LA21_3 >= 31 && LA21_3 <= 33)||LA21_3==38||(LA21_3 >= 47 && LA21_3 <= 48)||LA21_3==60||(LA21_3 >= 64 && LA21_3 <= 65)||(LA21_3 >= 68 && LA21_3 <= 69)||(LA21_3 >= 74 && LA21_3 <= 75)||LA21_3==77||(LA21_3 >= 80 && LA21_3 <= 84)||LA21_3==86||(LA21_3 >= 88 && LA21_3 <= 89)||(LA21_3 >= 92 && LA21_3 <= 95)) ) {
                        alt21=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:236:7: 'enum' '{' enumerator_list '}'
                    {
                    match(input,74,FOLLOW_74_in_enum_specifier749); if (state.failed) return ;

                    match(input,97,FOLLOW_97_in_enum_specifier751); if (state.failed) return ;

                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier753);
                    enumerator_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,101,FOLLOW_101_in_enum_specifier755); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:237:7: 'enum' IDENTIFIER '{' enumerator_list '}'
                    {
                    match(input,74,FOLLOW_74_in_enum_specifier763); if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier765); if (state.failed) return ;

                    match(input,97,FOLLOW_97_in_enum_specifier767); if (state.failed) return ;

                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier769);
                    enumerator_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,101,FOLLOW_101_in_enum_specifier771); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:238:7: 'enum' IDENTIFIER
                    {
                    match(input,74,FOLLOW_74_in_enum_specifier779); if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier781); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, enum_specifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enum_specifier"



    // $ANTLR start "enumerator_list"
    // src/com/mbien/opencl/antlr/CL.g:241:1: enumerator_list : enumerator ( ',' enumerator )* ;
    public final void enumerator_list() throws RecognitionException {
        int enumerator_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:242:5: ( enumerator ( ',' enumerator )* )
            // src/com/mbien/opencl/antlr/CL.g:242:7: enumerator ( ',' enumerator )*
            {
            pushFollow(FOLLOW_enumerator_in_enumerator_list798);
            enumerator();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:242:18: ( ',' enumerator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:242:19: ',' enumerator
            	    {
            	    match(input,38,FOLLOW_38_in_enumerator_list801); if (state.failed) return ;

            	    pushFollow(FOLLOW_enumerator_in_enumerator_list803);
            	    enumerator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, enumerator_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumerator_list"



    // $ANTLR start "enumerator"
    // src/com/mbien/opencl/antlr/CL.g:245:1: enumerator : IDENTIFIER ( '=' constant_expression )? ;
    public final void enumerator() throws RecognitionException {
        int enumerator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:246:5: ( IDENTIFIER ( '=' constant_expression )? )
            // src/com/mbien/opencl/antlr/CL.g:246:7: IDENTIFIER ( '=' constant_expression )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerator822); if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:246:18: ( '=' constant_expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:246:19: '=' constant_expression
                    {
                    match(input,53,FOLLOW_53_in_enumerator825); if (state.failed) return ;

                    pushFollow(FOLLOW_constant_expression_in_enumerator827);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, enumerator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumerator"



    // $ANTLR start "type_qualifier"
    // src/com/mbien/opencl/antlr/CL.g:249:1: type_qualifier : ( 'const' | 'constant' | 'global' | 'local' | 'volatile' );
    public final void type_qualifier() throws RecognitionException {
        int type_qualifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:250:5: ( 'const' | 'constant' | 'global' | 'local' | 'volatile' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( (input.LA(1) >= 68 && input.LA(1) <= 69)||input.LA(1)==77||input.LA(1)==82||input.LA(1)==95 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, type_qualifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type_qualifier"



    // $ANTLR start "declarator"
    // src/com/mbien/opencl/antlr/CL.g:257:1: declarator : ( ( pointer )? direct_declarator | pointer );
    public final void declarator() throws RecognitionException {
        int declarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:258:5: ( ( pointer )? direct_declarator | pointer )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred47_CL()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA25_0==IDENTIFIER||LA25_0==31) ) {
                alt25=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:258:7: ( pointer )? direct_declarator
                    {
                    // src/com/mbien/opencl/antlr/CL.g:258:7: ( pointer )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==33) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:258:7: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_declarator895);
                            pointer();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_direct_declarator_in_declarator898);
                    direct_declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:259:7: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator906);
                    pointer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "direct_declarator"
    // src/com/mbien/opencl/antlr/CL.g:262:1: direct_declarator : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
    public final void direct_declarator() throws RecognitionException {
        int direct_declarator_StartIndex = input.index();

        Token IDENTIFIER1=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:263:5: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
            // src/com/mbien/opencl/antlr/CL.g:263:9: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
            {
            // src/com/mbien/opencl/antlr/CL.g:263:9: ( IDENTIFIER | '(' declarator ')' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENTIFIER) ) {
                alt26=1;
            }
            else if ( (LA26_0==31) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:263:14: IDENTIFIER
                    {
                    IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator930); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if (declaration_stack.size()>0&&((declaration_scope)declaration_stack.peek()).isTypedef) {
                                    ((Symbols_scope)Symbols_stack.peek()).types.add((IDENTIFIER1!=null?IDENTIFIER1.getText():null));
                                    System.out.println("define type "+(IDENTIFIER1!=null?IDENTIFIER1.getText():null));
                                }
                                }

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:270:14: '(' declarator ')'
                    {
                    match(input,31,FOLLOW_31_in_direct_declarator959); if (state.failed) return ;

                    pushFollow(FOLLOW_declarator_in_direct_declarator961);
                    declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_direct_declarator963); if (state.failed) return ;

                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:272:9: ( declarator_suffix )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    switch ( input.LA(2) ) {
                    case 32:
                        {
                        int LA27_25 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA27_27 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 64:
                    case 75:
                    case 84:
                    case 88:
                        {
                        int LA27_30 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 81:
                        {
                        int LA27_31 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 94:
                        {
                        int LA27_32 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 65:
                        {
                        int LA27_33 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case BUILTIN_TYPE:
                        {
                        int LA27_34 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 93:
                        {
                        int LA27_35 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 83:
                        {
                        int LA27_36 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 80:
                        {
                        int LA27_37 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 86:
                        {
                        int LA27_38 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 89:
                    case 92:
                        {
                        int LA27_39 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 74:
                        {
                        int LA27_40 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 68:
                    case 69:
                    case 77:
                    case 82:
                    case 95:
                        {
                        int LA27_41 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;

                    }

                }
                else if ( (LA27_0==60) ) {
                    switch ( input.LA(2) ) {
                    case 61:
                        {
                        int LA27_42 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA27_43 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA27_44 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case CHARACTER_LITERAL:
                    case DECIMAL_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case STRING_LITERAL:
                        {
                        int LA27_45 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 36:
                        {
                        int LA27_46 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 40:
                        {
                        int LA27_47 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 24:
                    case 29:
                    case 33:
                    case 35:
                    case 39:
                    case 102:
                        {
                        int LA27_48 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case 87:
                        {
                        int LA27_49 = input.LA(3);

                        if ( (synpred49_CL()) ) {
                            alt27=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt27) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:272:9: declarator_suffix
            	    {
            	    pushFollow(FOLLOW_declarator_suffix_in_direct_declarator983);
            	    declarator_suffix();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, direct_declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "direct_declarator"



    // $ANTLR start "declarator_suffix"
    // src/com/mbien/opencl/antlr/CL.g:275:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
    public final void declarator_suffix() throws RecognitionException {
        int declarator_suffix_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:276:5: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
            int alt28=5;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==60) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==61) ) {
                    alt28=2;
                }
                else if ( (LA28_1==CHARACTER_LITERAL||LA28_1==DECIMAL_LITERAL||LA28_1==FLOATING_POINT_LITERAL||LA28_1==HEX_LITERAL||LA28_1==IDENTIFIER||LA28_1==OCTAL_LITERAL||LA28_1==STRING_LITERAL||LA28_1==24||LA28_1==29||LA28_1==31||LA28_1==33||(LA28_1 >= 35 && LA28_1 <= 36)||(LA28_1 >= 39 && LA28_1 <= 40)||LA28_1==87||LA28_1==102) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA28_0==31) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt28=5;
                    }
                    break;
                case BUILTIN_TYPE:
                case 64:
                case 65:
                case 68:
                case 69:
                case 74:
                case 75:
                case 77:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 86:
                case 88:
                case 89:
                case 92:
                case 93:
                case 94:
                case 95:
                    {
                    alt28=3;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA28_23 = input.LA(3);

                    if ( (synpred52_CL()) ) {
                        alt28=3;
                    }
                    else if ( (synpred53_CL()) ) {
                        alt28=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 23, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:276:9: '[' constant_expression ']'
                    {
                    match(input,60,FOLLOW_60_in_declarator_suffix1003); if (state.failed) return ;

                    pushFollow(FOLLOW_constant_expression_in_declarator_suffix1005);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,61,FOLLOW_61_in_declarator_suffix1007); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:277:9: '[' ']'
                    {
                    match(input,60,FOLLOW_60_in_declarator_suffix1017); if (state.failed) return ;

                    match(input,61,FOLLOW_61_in_declarator_suffix1019); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:278:9: '(' parameter_type_list ')'
                    {
                    match(input,31,FOLLOW_31_in_declarator_suffix1029); if (state.failed) return ;

                    pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix1031);
                    parameter_type_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_declarator_suffix1033); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:279:9: '(' identifier_list ')'
                    {
                    match(input,31,FOLLOW_31_in_declarator_suffix1043); if (state.failed) return ;

                    pushFollow(FOLLOW_identifier_list_in_declarator_suffix1045);
                    identifier_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_declarator_suffix1047); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:280:9: '(' ')'
                    {
                    match(input,31,FOLLOW_31_in_declarator_suffix1057); if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_declarator_suffix1059); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, declarator_suffix_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "declarator_suffix"



    // $ANTLR start "pointer"
    // src/com/mbien/opencl/antlr/CL.g:283:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
    public final void pointer() throws RecognitionException {
        int pointer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:284:5: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                switch ( input.LA(2) ) {
                case 68:
                case 69:
                case 77:
                case 82:
                case 95:
                    {
                    int LA31_2 = input.LA(3);

                    if ( (synpred56_CL()) ) {
                        alt31=1;
                    }
                    else if ( (true) ) {
                        alt31=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case 33:
                    {
                    int LA31_3 = input.LA(3);

                    if ( (synpred57_CL()) ) {
                        alt31=2;
                    }
                    else if ( (true) ) {
                        alt31=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 3, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case BUILTIN_TYPE:
                case IDENTIFIER:
                case 31:
                case 32:
                case 38:
                case 47:
                case 48:
                case 53:
                case 60:
                case 64:
                case 65:
                case 74:
                case 75:
                case 80:
                case 81:
                case 83:
                case 84:
                case 86:
                case 88:
                case 89:
                case 91:
                case 92:
                case 93:
                case 94:
                case 97:
                    {
                    alt31=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:284:7: '*' ( type_qualifier )+ ( pointer )?
                    {
                    match(input,33,FOLLOW_33_in_pointer1076); if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:284:11: ( type_qualifier )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0 >= 68 && LA29_0 <= 69)||LA29_0==77||LA29_0==82||LA29_0==95) ) {
                            int LA29_16 = input.LA(2);

                            if ( (synpred54_CL()) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:284:11: type_qualifier
                    	    {
                    	    pushFollow(FOLLOW_type_qualifier_in_pointer1078);
                    	    type_qualifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    // src/com/mbien/opencl/antlr/CL.g:284:27: ( pointer )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==33) ) {
                        int LA30_1 = input.LA(2);

                        if ( (synpred55_CL()) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:284:27: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_pointer1081);
                            pointer();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:285:7: '*' pointer
                    {
                    match(input,33,FOLLOW_33_in_pointer1090); if (state.failed) return ;

                    pushFollow(FOLLOW_pointer_in_pointer1092);
                    pointer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:286:7: '*'
                    {
                    match(input,33,FOLLOW_33_in_pointer1100); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, pointer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "pointer"



    // $ANTLR start "parameter_type_list"
    // src/com/mbien/opencl/antlr/CL.g:289:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final void parameter_type_list() throws RecognitionException {
        int parameter_type_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:290:5: ( parameter_list ( ',' '...' )? )
            // src/com/mbien/opencl/antlr/CL.g:290:7: parameter_list ( ',' '...' )?
            {
            pushFollow(FOLLOW_parameter_list_in_parameter_type_list1117);
            parameter_list();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:290:22: ( ',' '...' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:290:23: ',' '...'
                    {
                    match(input,38,FOLLOW_38_in_parameter_type_list1120); if (state.failed) return ;

                    match(input,44,FOLLOW_44_in_parameter_type_list1122); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parameter_type_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameter_type_list"



    // $ANTLR start "parameter_list"
    // src/com/mbien/opencl/antlr/CL.g:293:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
    public final void parameter_list() throws RecognitionException {
        int parameter_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:294:5: ( parameter_declaration ( ',' parameter_declaration )* )
            // src/com/mbien/opencl/antlr/CL.g:294:7: parameter_declaration ( ',' parameter_declaration )*
            {
            pushFollow(FOLLOW_parameter_declaration_in_parameter_list1141);
            parameter_declaration();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:294:29: ( ',' parameter_declaration )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==BUILTIN_TYPE||LA33_1==IDENTIFIER||(LA33_1 >= 64 && LA33_1 <= 65)||(LA33_1 >= 68 && LA33_1 <= 69)||(LA33_1 >= 74 && LA33_1 <= 75)||LA33_1==77||(LA33_1 >= 80 && LA33_1 <= 84)||LA33_1==86||(LA33_1 >= 88 && LA33_1 <= 89)||(LA33_1 >= 92 && LA33_1 <= 95)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:294:30: ',' parameter_declaration
            	    {
            	    match(input,38,FOLLOW_38_in_parameter_list1144); if (state.failed) return ;

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list1146);
            	    parameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parameter_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameter_list"



    // $ANTLR start "parameter_declaration"
    // src/com/mbien/opencl/antlr/CL.g:297:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
    public final void parameter_declaration() throws RecognitionException {
        int parameter_declaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:298:5: ( declaration_specifiers ( declarator | abstract_declarator )* )
            // src/com/mbien/opencl/antlr/CL.g:298:7: declaration_specifiers ( declarator | abstract_declarator )*
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration1165);
            declaration_specifiers();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:298:30: ( declarator | abstract_declarator )*
            loop34:
            do {
                int alt34=3;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred60_CL()) ) {
                        alt34=1;
                    }
                    else if ( (synpred61_CL()) ) {
                        alt34=2;
                    }


                    }
                    break;
                case IDENTIFIER:
                    {
                    alt34=1;
                    }
                    break;
                case 31:
                    {
                    switch ( input.LA(2) ) {
                    case BUILTIN_TYPE:
                    case 32:
                    case 60:
                    case 64:
                    case 65:
                    case 68:
                    case 69:
                    case 74:
                    case 75:
                    case 77:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 86:
                    case 88:
                    case 89:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                        {
                        alt34=2;
                        }
                        break;
                    case 33:
                        {
                        int LA34_17 = input.LA(3);

                        if ( (synpred60_CL()) ) {
                            alt34=1;
                        }
                        else if ( (synpred61_CL()) ) {
                            alt34=2;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA34_18 = input.LA(3);

                        if ( (synpred60_CL()) ) {
                            alt34=1;
                        }
                        else if ( (synpred61_CL()) ) {
                            alt34=2;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA34_19 = input.LA(3);

                        if ( (synpred60_CL()) ) {
                            alt34=1;
                        }
                        else if ( (synpred61_CL()) ) {
                            alt34=2;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case 60:
                    {
                    alt34=2;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:298:31: declarator
            	    {
            	    pushFollow(FOLLOW_declarator_in_parameter_declaration1168);
            	    declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:298:42: abstract_declarator
            	    {
            	    pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration1170);
            	    abstract_declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parameter_declaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameter_declaration"



    // $ANTLR start "identifier_list"
    // src/com/mbien/opencl/antlr/CL.g:301:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
    public final void identifier_list() throws RecognitionException {
        int identifier_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:302:5: ( IDENTIFIER ( ',' IDENTIFIER )* )
            // src/com/mbien/opencl/antlr/CL.g:302:7: IDENTIFIER ( ',' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1189); if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:302:18: ( ',' IDENTIFIER )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:302:19: ',' IDENTIFIER
            	    {
            	    match(input,38,FOLLOW_38_in_identifier_list1192); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1194); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, identifier_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "identifier_list"



    // $ANTLR start "type_name"
    // src/com/mbien/opencl/antlr/CL.g:305:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final void type_name() throws RecognitionException {
        int type_name_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:306:5: ( specifier_qualifier_list ( abstract_declarator )? )
            // src/com/mbien/opencl/antlr/CL.g:306:7: specifier_qualifier_list ( abstract_declarator )?
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name1213);
            specifier_qualifier_list();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:306:32: ( abstract_declarator )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31||LA36_0==33||LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:306:32: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name1215);
                    abstract_declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, type_name_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type_name"



    // $ANTLR start "abstract_declarator"
    // src/com/mbien/opencl/antlr/CL.g:309:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
    public final void abstract_declarator() throws RecognitionException {
        int abstract_declarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:310:5: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            else if ( (LA38_0==31||LA38_0==60) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:310:7: pointer ( direct_abstract_declarator )?
                    {
                    pushFollow(FOLLOW_pointer_in_abstract_declarator1233);
                    pointer();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:310:15: ( direct_abstract_declarator )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==31) ) {
                        switch ( input.LA(2) ) {
                            case 32:
                                {
                                int LA37_8 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 33:
                                {
                                int LA37_9 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA37_10 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA37_11 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 64:
                            case 75:
                            case 84:
                            case 88:
                                {
                                int LA37_12 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 81:
                                {
                                int LA37_13 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 94:
                                {
                                int LA37_14 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 65:
                                {
                                int LA37_15 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case BUILTIN_TYPE:
                                {
                                int LA37_16 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 93:
                                {
                                int LA37_17 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 83:
                                {
                                int LA37_18 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 80:
                                {
                                int LA37_19 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 86:
                                {
                                int LA37_20 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 89:
                            case 92:
                                {
                                int LA37_21 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 74:
                                {
                                int LA37_22 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA37_23 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 68:
                            case 69:
                            case 77:
                            case 82:
                            case 95:
                                {
                                int LA37_24 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                        }

                    }
                    else if ( (LA37_0==60) ) {
                        switch ( input.LA(2) ) {
                            case 61:
                                {
                                int LA37_25 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA37_26 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA37_27 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case CHARACTER_LITERAL:
                            case DECIMAL_LITERAL:
                            case FLOATING_POINT_LITERAL:
                            case HEX_LITERAL:
                            case OCTAL_LITERAL:
                            case STRING_LITERAL:
                                {
                                int LA37_28 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 36:
                                {
                                int LA37_29 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 40:
                                {
                                int LA37_30 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 24:
                            case 29:
                            case 33:
                            case 35:
                            case 39:
                            case 102:
                                {
                                int LA37_31 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                            case 87:
                                {
                                int LA37_32 = input.LA(3);

                                if ( (synpred64_CL()) ) {
                                    alt37=1;
                                }
                                }
                                break;
                        }

                    }
                    switch (alt37) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:310:15: direct_abstract_declarator
                            {
                            pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1235);
                            direct_abstract_declarator();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:311:7: direct_abstract_declarator
                    {
                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1244);
                    direct_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, abstract_declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "abstract_declarator"



    // $ANTLR start "direct_abstract_declarator"
    // src/com/mbien/opencl/antlr/CL.g:314:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
    public final void direct_abstract_declarator() throws RecognitionException {
        int direct_abstract_declarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:315:5: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
            // src/com/mbien/opencl/antlr/CL.g:315:10: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
            {
            // src/com/mbien/opencl/antlr/CL.g:315:10: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==BUILTIN_TYPE||LA39_1==IDENTIFIER||LA39_1==32||(LA39_1 >= 64 && LA39_1 <= 65)||(LA39_1 >= 68 && LA39_1 <= 69)||(LA39_1 >= 74 && LA39_1 <= 75)||LA39_1==77||(LA39_1 >= 80 && LA39_1 <= 84)||LA39_1==86||(LA39_1 >= 88 && LA39_1 <= 89)||(LA39_1 >= 92 && LA39_1 <= 95)) ) {
                    alt39=2;
                }
                else if ( (LA39_1==31||LA39_1==33||LA39_1==60) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA39_0==60) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:315:12: '(' abstract_declarator ')'
                    {
                    match(input,31,FOLLOW_31_in_direct_abstract_declarator1266); if (state.failed) return ;

                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator1268);
                    abstract_declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_direct_abstract_declarator1270); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:315:42: abstract_declarator_suffix
                    {
                    pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1274);
                    abstract_declarator_suffix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:315:71: ( abstract_declarator_suffix )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    switch ( input.LA(2) ) {
                    case 32:
                        {
                        int LA40_8 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA40_10 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 64:
                    case 75:
                    case 84:
                    case 88:
                        {
                        int LA40_13 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 81:
                        {
                        int LA40_14 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 94:
                        {
                        int LA40_15 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 65:
                        {
                        int LA40_16 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case BUILTIN_TYPE:
                        {
                        int LA40_17 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 93:
                        {
                        int LA40_18 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 83:
                        {
                        int LA40_19 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 80:
                        {
                        int LA40_20 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 86:
                        {
                        int LA40_21 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 89:
                    case 92:
                        {
                        int LA40_22 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 74:
                        {
                        int LA40_23 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 68:
                    case 69:
                    case 77:
                    case 82:
                    case 95:
                        {
                        int LA40_24 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;

                    }

                }
                else if ( (LA40_0==60) ) {
                    switch ( input.LA(2) ) {
                    case 61:
                        {
                        int LA40_25 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA40_26 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA40_27 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case CHARACTER_LITERAL:
                    case DECIMAL_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case STRING_LITERAL:
                        {
                        int LA40_28 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 36:
                        {
                        int LA40_29 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 40:
                        {
                        int LA40_30 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 24:
                    case 29:
                    case 33:
                    case 35:
                    case 39:
                    case 102:
                        {
                        int LA40_31 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;
                    case 87:
                        {
                        int LA40_32 = input.LA(3);

                        if ( (synpred67_CL()) ) {
                            alt40=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt40) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:315:71: abstract_declarator_suffix
            	    {
            	    pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1278);
            	    abstract_declarator_suffix();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, direct_abstract_declarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "direct_abstract_declarator"



    // $ANTLR start "abstract_declarator_suffix"
    // src/com/mbien/opencl/antlr/CL.g:318:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
    public final void abstract_declarator_suffix() throws RecognitionException {
        int abstract_declarator_suffix_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:319:5: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
            int alt41=4;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==60) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==61) ) {
                    alt41=1;
                }
                else if ( (LA41_1==CHARACTER_LITERAL||LA41_1==DECIMAL_LITERAL||LA41_1==FLOATING_POINT_LITERAL||LA41_1==HEX_LITERAL||LA41_1==IDENTIFIER||LA41_1==OCTAL_LITERAL||LA41_1==STRING_LITERAL||LA41_1==24||LA41_1==29||LA41_1==31||LA41_1==33||(LA41_1 >= 35 && LA41_1 <= 36)||(LA41_1 >= 39 && LA41_1 <= 40)||LA41_1==87||LA41_1==102) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA41_0==31) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==32) ) {
                    alt41=3;
                }
                else if ( (LA41_2==BUILTIN_TYPE||LA41_2==IDENTIFIER||(LA41_2 >= 64 && LA41_2 <= 65)||(LA41_2 >= 68 && LA41_2 <= 69)||(LA41_2 >= 74 && LA41_2 <= 75)||LA41_2==77||(LA41_2 >= 80 && LA41_2 <= 84)||LA41_2==86||(LA41_2 >= 88 && LA41_2 <= 89)||(LA41_2 >= 92 && LA41_2 <= 95)) ) {
                    alt41=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:319:10: '[' ']'
                    {
                    match(input,60,FOLLOW_60_in_abstract_declarator_suffix1299); if (state.failed) return ;

                    match(input,61,FOLLOW_61_in_abstract_declarator_suffix1301); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:320:10: '[' constant_expression ']'
                    {
                    match(input,60,FOLLOW_60_in_abstract_declarator_suffix1312); if (state.failed) return ;

                    pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix1314);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,61,FOLLOW_61_in_abstract_declarator_suffix1316); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:321:10: '(' ')'
                    {
                    match(input,31,FOLLOW_31_in_abstract_declarator_suffix1327); if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_abstract_declarator_suffix1329); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:322:10: '(' parameter_type_list ')'
                    {
                    match(input,31,FOLLOW_31_in_abstract_declarator_suffix1340); if (state.failed) return ;

                    pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix1342);
                    parameter_type_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_abstract_declarator_suffix1344); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, abstract_declarator_suffix_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "abstract_declarator_suffix"



    // $ANTLR start "initializer"
    // src/com/mbien/opencl/antlr/CL.g:325:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
    public final void initializer() throws RecognitionException {
        int initializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:326:5: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==CHARACTER_LITERAL||LA43_0==DECIMAL_LITERAL||LA43_0==FLOATING_POINT_LITERAL||LA43_0==HEX_LITERAL||LA43_0==IDENTIFIER||LA43_0==OCTAL_LITERAL||LA43_0==STRING_LITERAL||LA43_0==24||LA43_0==29||LA43_0==31||LA43_0==33||(LA43_0 >= 35 && LA43_0 <= 36)||(LA43_0 >= 39 && LA43_0 <= 40)||LA43_0==87||LA43_0==102) ) {
                alt43=1;
            }
            else if ( (LA43_0==97) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:326:7: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_initializer1361);
                    assignment_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:327:7: '{' initializer_list ( ',' )? '}'
                    {
                    match(input,97,FOLLOW_97_in_initializer1369); if (state.failed) return ;

                    pushFollow(FOLLOW_initializer_list_in_initializer1371);
                    initializer_list();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:327:28: ( ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==38) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:327:28: ','
                            {
                            match(input,38,FOLLOW_38_in_initializer1373); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,101,FOLLOW_101_in_initializer1376); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, initializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "initializer"



    // $ANTLR start "initializer_list"
    // src/com/mbien/opencl/antlr/CL.g:330:1: initializer_list : initializer ( ',' initializer )* ;
    public final void initializer_list() throws RecognitionException {
        int initializer_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:331:5: ( initializer ( ',' initializer )* )
            // src/com/mbien/opencl/antlr/CL.g:331:7: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list1393);
            initializer();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:331:19: ( ',' initializer )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==38) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==CHARACTER_LITERAL||LA44_1==DECIMAL_LITERAL||LA44_1==FLOATING_POINT_LITERAL||LA44_1==HEX_LITERAL||LA44_1==IDENTIFIER||LA44_1==OCTAL_LITERAL||LA44_1==STRING_LITERAL||LA44_1==24||LA44_1==29||LA44_1==31||LA44_1==33||(LA44_1 >= 35 && LA44_1 <= 36)||(LA44_1 >= 39 && LA44_1 <= 40)||LA44_1==87||LA44_1==97||LA44_1==102) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:331:20: ',' initializer
            	    {
            	    match(input,38,FOLLOW_38_in_initializer_list1396); if (state.failed) return ;

            	    pushFollow(FOLLOW_initializer_in_initializer_list1398);
            	    initializer();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, initializer_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "initializer_list"



    // $ANTLR start "argument_expression_list"
    // src/com/mbien/opencl/antlr/CL.g:336:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
    public final void argument_expression_list() throws RecognitionException {
        int argument_expression_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:337:5: ( assignment_expression ( ',' assignment_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:337:9: assignment_expression ( ',' assignment_expression )*
            {
            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1421);
            assignment_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:337:31: ( ',' assignment_expression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:337:32: ',' assignment_expression
            	    {
            	    match(input,38,FOLLOW_38_in_argument_expression_list1424); if (state.failed) return ;

            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1426);
            	    assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, argument_expression_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "argument_expression_list"



    // $ANTLR start "additive_expression"
    // src/com/mbien/opencl/antlr/CL.g:340:1: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final void additive_expression() throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:341:5: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:341:7: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            // src/com/mbien/opencl/antlr/CL.g:341:7: ( multiplicative_expression )
            // src/com/mbien/opencl/antlr/CL.g:341:8: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1446);
            multiplicative_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // src/com/mbien/opencl/antlr/CL.g:341:35: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==35) ) {
                    alt46=1;
                }
                else if ( (LA46_0==39) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:341:36: '+' multiplicative_expression
            	    {
            	    match(input,35,FOLLOW_35_in_additive_expression1450); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1452);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:341:68: '-' multiplicative_expression
            	    {
            	    match(input,39,FOLLOW_39_in_additive_expression1456); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1458);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, additive_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // src/com/mbien/opencl/antlr/CL.g:344:1: multiplicative_expression : ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* ;
    public final void multiplicative_expression() throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:345:5: ( ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:345:7: ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
            {
            // src/com/mbien/opencl/antlr/CL.g:345:7: ( cast_expression )
            // src/com/mbien/opencl/antlr/CL.g:345:8: cast_expression
            {
            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1478);
            cast_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // src/com/mbien/opencl/antlr/CL.g:345:25: ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt47=1;
                    }
                    break;
                case 45:
                    {
                    alt47=2;
                    }
                    break;
                case 26:
                    {
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:345:26: '*' cast_expression
            	    {
            	    match(input,33,FOLLOW_33_in_multiplicative_expression1482); if (state.failed) return ;

            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1484);
            	    cast_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:345:48: '/' cast_expression
            	    {
            	    match(input,45,FOLLOW_45_in_multiplicative_expression1488); if (state.failed) return ;

            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1490);
            	    cast_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/com/mbien/opencl/antlr/CL.g:345:70: '%' cast_expression
            	    {
            	    match(input,26,FOLLOW_26_in_multiplicative_expression1494); if (state.failed) return ;

            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1496);
            	    cast_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, multiplicative_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "cast_expression"
    // src/com/mbien/opencl/antlr/CL.g:348:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );
    public final void cast_expression() throws RecognitionException {
        int cast_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:349:5: ( '(' type_name ')' cast_expression | unary_expression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                switch ( input.LA(2) ) {
                case BUILTIN_TYPE:
                case 65:
                case 68:
                case 69:
                case 74:
                case 77:
                case 80:
                case 82:
                case 83:
                case 86:
                case 89:
                case 92:
                case 93:
                case 94:
                case 95:
                    {
                    alt48=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA48_18 = input.LA(3);

                    if ( (synpred80_CL()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 18, input);

                        throw nvae;

                    }
                    }
                    break;
                case CHARACTER_LITERAL:
                case DECIMAL_LITERAL:
                case FLOATING_POINT_LITERAL:
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case STRING_LITERAL:
                case 24:
                case 29:
                case 31:
                case 33:
                case 35:
                case 36:
                case 39:
                case 40:
                case 87:
                case 102:
                    {
                    alt48=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA48_0==CHARACTER_LITERAL||LA48_0==DECIMAL_LITERAL||LA48_0==FLOATING_POINT_LITERAL||LA48_0==HEX_LITERAL||LA48_0==IDENTIFIER||LA48_0==OCTAL_LITERAL||LA48_0==STRING_LITERAL||LA48_0==24||LA48_0==29||LA48_0==33||(LA48_0 >= 35 && LA48_0 <= 36)||(LA48_0 >= 39 && LA48_0 <= 40)||LA48_0==87||LA48_0==102) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:349:7: '(' type_name ')' cast_expression
                    {
                    match(input,31,FOLLOW_31_in_cast_expression1515); if (state.failed) return ;

                    pushFollow(FOLLOW_type_name_in_cast_expression1517);
                    type_name();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_cast_expression1519); if (state.failed) return ;

                    pushFollow(FOLLOW_cast_expression_in_cast_expression1521);
                    cast_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:350:7: unary_expression
                    {
                    pushFollow(FOLLOW_unary_expression_in_cast_expression1529);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, cast_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "cast_expression"



    // $ANTLR start "unary_expression"
    // src/com/mbien/opencl/antlr/CL.g:353:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
    public final void unary_expression() throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:354:5: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
            int alt49=6;
            switch ( input.LA(1) ) {
            case CHARACTER_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case IDENTIFIER:
            case OCTAL_LITERAL:
            case STRING_LITERAL:
            case 31:
                {
                alt49=1;
                }
                break;
            case 36:
                {
                alt49=2;
                }
                break;
            case 40:
                {
                alt49=3;
                }
                break;
            case 24:
            case 29:
            case 33:
            case 35:
            case 39:
            case 102:
                {
                alt49=4;
                }
                break;
            case 87:
                {
                int LA49_7 = input.LA(2);

                if ( (LA49_7==31) ) {
                    int LA49_8 = input.LA(3);

                    if ( (synpred85_CL()) ) {
                        alt49=5;
                    }
                    else if ( (true) ) {
                        alt49=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA49_7==CHARACTER_LITERAL||LA49_7==DECIMAL_LITERAL||LA49_7==FLOATING_POINT_LITERAL||LA49_7==HEX_LITERAL||LA49_7==IDENTIFIER||LA49_7==OCTAL_LITERAL||LA49_7==STRING_LITERAL||LA49_7==24||LA49_7==29||LA49_7==33||(LA49_7 >= 35 && LA49_7 <= 36)||(LA49_7 >= 39 && LA49_7 <= 40)||LA49_7==87||LA49_7==102) ) {
                    alt49=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 7, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:354:7: postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1546);
                    postfix_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:355:7: '++' unary_expression
                    {
                    match(input,36,FOLLOW_36_in_unary_expression1554); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1556);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:356:7: '--' unary_expression
                    {
                    match(input,40,FOLLOW_40_in_unary_expression1564); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1566);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:357:7: unary_operator cast_expression
                    {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression1574);
                    unary_operator();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_cast_expression_in_unary_expression1576);
                    cast_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:358:7: 'sizeof' unary_expression
                    {
                    match(input,87,FOLLOW_87_in_unary_expression1584); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1586);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/com/mbien/opencl/antlr/CL.g:359:7: 'sizeof' '(' type_name ')'
                    {
                    match(input,87,FOLLOW_87_in_unary_expression1594); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_unary_expression1596); if (state.failed) return ;

                    pushFollow(FOLLOW_type_name_in_unary_expression1598);
                    type_name();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_unary_expression1600); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, unary_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // src/com/mbien/opencl/antlr/CL.g:362:1: postfix_expression : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
    public final void postfix_expression() throws RecognitionException {
        int postfix_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:363:5: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
            // src/com/mbien/opencl/antlr/CL.g:363:9: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1619);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:364:9: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
            loop50:
            do {
                int alt50=8;
                switch ( input.LA(1) ) {
                case 60:
                    {
                    alt50=1;
                    }
                    break;
                case 31:
                    {
                    int LA50_24 = input.LA(2);

                    if ( (LA50_24==32) ) {
                        alt50=2;
                    }
                    else if ( (LA50_24==CHARACTER_LITERAL||LA50_24==DECIMAL_LITERAL||LA50_24==FLOATING_POINT_LITERAL||LA50_24==HEX_LITERAL||LA50_24==IDENTIFIER||LA50_24==OCTAL_LITERAL||LA50_24==STRING_LITERAL||LA50_24==24||LA50_24==29||LA50_24==31||LA50_24==33||(LA50_24 >= 35 && LA50_24 <= 36)||(LA50_24 >= 39 && LA50_24 <= 40)||LA50_24==87||LA50_24==102) ) {
                        alt50=3;
                    }


                    }
                    break;
                case 43:
                    {
                    alt50=4;
                    }
                    break;
                case 42:
                    {
                    alt50=5;
                    }
                    break;
                case 36:
                    {
                    alt50=6;
                    }
                    break;
                case 40:
                    {
                    alt50=7;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:364:13: '[' expression ']'
            	    {
            	    match(input,60,FOLLOW_60_in_postfix_expression1633); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_postfix_expression1635);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,61,FOLLOW_61_in_postfix_expression1637); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:365:13: '(' ')'
            	    {
            	    match(input,31,FOLLOW_31_in_postfix_expression1651); if (state.failed) return ;

            	    match(input,32,FOLLOW_32_in_postfix_expression1653); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/com/mbien/opencl/antlr/CL.g:366:13: '(' argument_expression_list ')'
            	    {
            	    match(input,31,FOLLOW_31_in_postfix_expression1667); if (state.failed) return ;

            	    pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1669);
            	    argument_expression_list();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,32,FOLLOW_32_in_postfix_expression1671); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // src/com/mbien/opencl/antlr/CL.g:367:13: '.' IDENTIFIER
            	    {
            	    match(input,43,FOLLOW_43_in_postfix_expression1685); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1687); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // src/com/mbien/opencl/antlr/CL.g:368:13: '->' IDENTIFIER
            	    {
            	    match(input,42,FOLLOW_42_in_postfix_expression1701); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1703); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // src/com/mbien/opencl/antlr/CL.g:369:13: '++'
            	    {
            	    match(input,36,FOLLOW_36_in_postfix_expression1717); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // src/com/mbien/opencl/antlr/CL.g:370:13: '--'
            	    {
            	    match(input,40,FOLLOW_40_in_postfix_expression1731); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, postfix_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "unary_operator"
    // src/com/mbien/opencl/antlr/CL.g:374:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
    public final void unary_operator() throws RecognitionException {
        int unary_operator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:375:5: ( '&' | '*' | '+' | '-' | '~' | '!' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)==24||input.LA(1)==29||input.LA(1)==33||input.LA(1)==35||input.LA(1)==39||input.LA(1)==102 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, unary_operator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unary_operator"



    // $ANTLR start "primary_expression"
    // src/com/mbien/opencl/antlr/CL.g:383:1: primary_expression : ( IDENTIFIER | constant | '(' expression ')' );
    public final void primary_expression() throws RecognitionException {
        int primary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:384:5: ( IDENTIFIER | constant | '(' expression ')' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt51=1;
                }
                break;
            case CHARACTER_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case STRING_LITERAL:
                {
                alt51=2;
                }
                break;
            case 31:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:384:7: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1816); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:385:7: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expression1824);
                    constant();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:386:7: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_primary_expression1832); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_primary_expression1834);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_primary_expression1836); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, primary_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "constant"
    // src/com/mbien/opencl/antlr/CL.g:389:1: constant : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
    public final void constant() throws RecognitionException {
        int constant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:390:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)==CHARACTER_LITERAL||input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, constant_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "constant"



    // $ANTLR start "expression"
    // src/com/mbien/opencl/antlr/CL.g:400:1: expression : assignment_expression ( ',' assignment_expression )* ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:401:5: ( assignment_expression ( ',' assignment_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:401:7: assignment_expression ( ',' assignment_expression )*
            {
            pushFollow(FOLLOW_assignment_expression_in_expression1926);
            assignment_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:401:29: ( ',' assignment_expression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==38) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:401:30: ',' assignment_expression
            	    {
            	    match(input,38,FOLLOW_38_in_expression1929); if (state.failed) return ;

            	    pushFollow(FOLLOW_assignment_expression_in_expression1931);
            	    assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "constant_expression"
    // src/com/mbien/opencl/antlr/CL.g:404:1: constant_expression : conditional_expression ;
    public final void constant_expression() throws RecognitionException {
        int constant_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:405:5: ( conditional_expression )
            // src/com/mbien/opencl/antlr/CL.g:405:7: conditional_expression
            {
            pushFollow(FOLLOW_conditional_expression_in_constant_expression1950);
            conditional_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, constant_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "constant_expression"



    // $ANTLR start "assignment_expression"
    // src/com/mbien/opencl/antlr/CL.g:408:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );
    public final void assignment_expression() throws RecognitionException {
        int assignment_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:409:5: ( lvalue assignment_operator assignment_expression | conditional_expression )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:409:7: lvalue assignment_operator assignment_expression
                    {
                    pushFollow(FOLLOW_lvalue_in_assignment_expression1967);
                    lvalue();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression1969);
                    assignment_operator();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression1971);
                    assignment_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:410:7: conditional_expression
                    {
                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression1979);
                    conditional_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, assignment_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignment_expression"



    // $ANTLR start "lvalue"
    // src/com/mbien/opencl/antlr/CL.g:413:1: lvalue : unary_expression ;
    public final void lvalue() throws RecognitionException {
        int lvalue_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:414:5: ( unary_expression )
            // src/com/mbien/opencl/antlr/CL.g:414:10: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_lvalue1999);
            unary_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, lvalue_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "lvalue"



    // $ANTLR start "assignment_operator"
    // src/com/mbien/opencl/antlr/CL.g:417:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignment_operator() throws RecognitionException {
        int assignment_operator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:418:5: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)==27||input.LA(1)==30||input.LA(1)==34||input.LA(1)==37||input.LA(1)==41||input.LA(1)==46||input.LA(1)==51||input.LA(1)==53||input.LA(1)==58||input.LA(1)==63||input.LA(1)==99 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, assignment_operator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignment_operator"



    // $ANTLR start "conditional_expression"
    // src/com/mbien/opencl/antlr/CL.g:431:1: conditional_expression : logical_or_expression ( '?' expression ':' conditional_expression )? ;
    public final void conditional_expression() throws RecognitionException {
        int conditional_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:432:5: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
            // src/com/mbien/opencl/antlr/CL.g:432:7: logical_or_expression ( '?' expression ':' conditional_expression )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2113);
            logical_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:432:29: ( '?' expression ':' conditional_expression )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==59) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:432:30: '?' expression ':' conditional_expression
                    {
                    match(input,59,FOLLOW_59_in_conditional_expression2116); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_conditional_expression2118);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,47,FOLLOW_47_in_conditional_expression2120); if (state.failed) return ;

                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression2122);
                    conditional_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, conditional_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "conditional_expression"



    // $ANTLR start "logical_or_expression"
    // src/com/mbien/opencl/antlr/CL.g:435:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
    public final void logical_or_expression() throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:436:5: ( logical_and_expression ( '||' logical_and_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:436:7: logical_and_expression ( '||' logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2141);
            logical_and_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:436:30: ( '||' logical_and_expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==100) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:436:31: '||' logical_and_expression
            	    {
            	    match(input,100,FOLLOW_100_in_logical_or_expression2144); if (state.failed) return ;

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2146);
            	    logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, logical_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // src/com/mbien/opencl/antlr/CL.g:439:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
    public final void logical_and_expression() throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:440:5: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:440:7: inclusive_or_expression ( '&&' inclusive_or_expression )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2165);
            inclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:440:31: ( '&&' inclusive_or_expression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==28) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:440:32: '&&' inclusive_or_expression
            	    {
            	    match(input,28,FOLLOW_28_in_logical_and_expression2168); if (state.failed) return ;

            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2170);
            	    inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, logical_and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // src/com/mbien/opencl/antlr/CL.g:443:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
    public final void inclusive_or_expression() throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:444:5: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:444:7: exclusive_or_expression ( '|' exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2189);
            exclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:444:31: ( '|' exclusive_or_expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==98) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:444:32: '|' exclusive_or_expression
            	    {
            	    match(input,98,FOLLOW_98_in_inclusive_or_expression2192); if (state.failed) return ;

            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2194);
            	    exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, inclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // src/com/mbien/opencl/antlr/CL.g:447:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
    public final void exclusive_or_expression() throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:448:5: ( and_expression ( '^' and_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:448:7: and_expression ( '^' and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2213);
            and_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:448:22: ( '^' and_expression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==62) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:448:23: '^' and_expression
            	    {
            	    match(input,62,FOLLOW_62_in_exclusive_or_expression2216); if (state.failed) return ;

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2218);
            	    and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, exclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // src/com/mbien/opencl/antlr/CL.g:451:1: and_expression : equality_expression ( '&' equality_expression )* ;
    public final void and_expression() throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:452:5: ( equality_expression ( '&' equality_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:452:7: equality_expression ( '&' equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression2237);
            equality_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:452:27: ( '&' equality_expression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==29) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:452:28: '&' equality_expression
            	    {
            	    match(input,29,FOLLOW_29_in_and_expression2240); if (state.failed) return ;

            	    pushFollow(FOLLOW_equality_expression_in_and_expression2242);
            	    equality_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // src/com/mbien/opencl/antlr/CL.g:454:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final void equality_expression() throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:455:5: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:455:7: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression2260);
            relational_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:455:29: ( ( '==' | '!=' ) relational_expression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==25||LA60_0==54) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:455:30: ( '==' | '!=' ) relational_expression
            	    {
            	    if ( input.LA(1)==25||input.LA(1)==54 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression2269);
            	    relational_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, equality_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // src/com/mbien/opencl/antlr/CL.g:458:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final void relational_expression() throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:459:5: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:459:7: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression2288);
            shift_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:459:24: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==49||LA61_0==52||(LA61_0 >= 55 && LA61_0 <= 56)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:459:25: ( '<' | '>' | '<=' | '>=' ) shift_expression
            	    {
            	    if ( input.LA(1)==49||input.LA(1)==52||(input.LA(1) >= 55 && input.LA(1) <= 56) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression2301);
            	    shift_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, relational_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // src/com/mbien/opencl/antlr/CL.g:462:1: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final void shift_expression() throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:463:5: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            // src/com/mbien/opencl/antlr/CL.g:463:7: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression2320);
            additive_expression();

            state._fsp--;
            if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:463:27: ( ( '<<' | '>>' ) additive_expression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==50||LA62_0==57) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:463:28: ( '<<' | '>>' ) additive_expression
            	    {
            	    if ( input.LA(1)==50||input.LA(1)==57 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression2329);
            	    additive_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, shift_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "statement"
    // src/com/mbien/opencl/antlr/CL.g:468:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:469:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
            int alt63=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==47) ) {
                    alt63=1;
                }
                else if ( ((LA63_1 >= 25 && LA63_1 <= 31)||(LA63_1 >= 33 && LA63_1 <= 43)||(LA63_1 >= 45 && LA63_1 <= 46)||(LA63_1 >= 48 && LA63_1 <= 60)||(LA63_1 >= 62 && LA63_1 <= 63)||(LA63_1 >= 98 && LA63_1 <= 100)) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
                }
                break;
            case 67:
            case 71:
                {
                alt63=1;
                }
                break;
            case 97:
                {
                alt63=2;
                }
                break;
            case CHARACTER_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case STRING_LITERAL:
            case 24:
            case 29:
            case 31:
            case 33:
            case 35:
            case 36:
            case 39:
            case 40:
            case 48:
            case 87:
            case 102:
                {
                alt63=3;
                }
                break;
            case 79:
            case 90:
                {
                alt63=4;
                }
                break;
            case 72:
            case 76:
            case 96:
                {
                alt63=5;
                }
                break;
            case 66:
            case 70:
            case 78:
            case 85:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:469:7: labeled_statement
                    {
                    pushFollow(FOLLOW_labeled_statement_in_statement2350);
                    labeled_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:470:7: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_statement2358);
                    compound_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:471:7: expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement2366);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:472:7: selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement2374);
                    selection_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:473:7: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement2382);
                    iteration_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/com/mbien/opencl/antlr/CL.g:474:7: jump_statement
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement2390);
                    jump_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "labeled_statement"
    // src/com/mbien/opencl/antlr/CL.g:477:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
    public final void labeled_statement() throws RecognitionException {
        int labeled_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:478:5: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
            int alt64=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt64=1;
                }
                break;
            case 67:
                {
                alt64=2;
                }
                break;
            case 71:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:478:7: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement2407); if (state.failed) return ;

                    match(input,47,FOLLOW_47_in_labeled_statement2409); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_labeled_statement2411);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:479:7: 'case' constant_expression ':' statement
                    {
                    match(input,67,FOLLOW_67_in_labeled_statement2419); if (state.failed) return ;

                    pushFollow(FOLLOW_constant_expression_in_labeled_statement2421);
                    constant_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,47,FOLLOW_47_in_labeled_statement2423); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_labeled_statement2425);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:480:7: 'default' ':' statement
                    {
                    match(input,71,FOLLOW_71_in_labeled_statement2433); if (state.failed) return ;

                    match(input,47,FOLLOW_47_in_labeled_statement2435); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_labeled_statement2437);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, labeled_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "labeled_statement"



    // $ANTLR start "compound_statement"
    // src/com/mbien/opencl/antlr/CL.g:483:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
    public final void compound_statement() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int compound_statement_StartIndex = input.index();


          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:488:5: ( '{' ( declaration )* ( statement_list )? '}' )
            // src/com/mbien/opencl/antlr/CL.g:488:7: '{' ( declaration )* ( statement_list )? '}'
            {
            match(input,97,FOLLOW_97_in_compound_statement2465); if (state.failed) return ;

            // src/com/mbien/opencl/antlr/CL.g:488:11: ( declaration )*
            loop65:
            do {
                int alt65=2;
                alt65 = dfa65.predict(input);
                switch (alt65) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:488:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement2467);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            // src/com/mbien/opencl/antlr/CL.g:488:24: ( statement_list )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CHARACTER_LITERAL||LA66_0==DECIMAL_LITERAL||LA66_0==FLOATING_POINT_LITERAL||LA66_0==HEX_LITERAL||LA66_0==IDENTIFIER||LA66_0==OCTAL_LITERAL||LA66_0==STRING_LITERAL||LA66_0==24||LA66_0==29||LA66_0==31||LA66_0==33||(LA66_0 >= 35 && LA66_0 <= 36)||(LA66_0 >= 39 && LA66_0 <= 40)||LA66_0==48||(LA66_0 >= 66 && LA66_0 <= 67)||(LA66_0 >= 70 && LA66_0 <= 72)||LA66_0==76||(LA66_0 >= 78 && LA66_0 <= 79)||LA66_0==85||LA66_0==87||LA66_0==90||(LA66_0 >= 96 && LA66_0 <= 97)||LA66_0==102) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:488:24: statement_list
                    {
                    pushFollow(FOLLOW_statement_list_in_compound_statement2470);
                    statement_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,101,FOLLOW_101_in_compound_statement2473); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, compound_statement_StartIndex); }

            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end "compound_statement"



    // $ANTLR start "statement_list"
    // src/com/mbien/opencl/antlr/CL.g:491:1: statement_list : ( statement )+ ;
    public final void statement_list() throws RecognitionException {
        int statement_list_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:492:5: ( ( statement )+ )
            // src/com/mbien/opencl/antlr/CL.g:492:7: ( statement )+
            {
            // src/com/mbien/opencl/antlr/CL.g:492:7: ( statement )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==CHARACTER_LITERAL||LA67_0==DECIMAL_LITERAL||LA67_0==FLOATING_POINT_LITERAL||LA67_0==HEX_LITERAL||LA67_0==IDENTIFIER||LA67_0==OCTAL_LITERAL||LA67_0==STRING_LITERAL||LA67_0==24||LA67_0==29||LA67_0==31||LA67_0==33||(LA67_0 >= 35 && LA67_0 <= 36)||(LA67_0 >= 39 && LA67_0 <= 40)||LA67_0==48||(LA67_0 >= 66 && LA67_0 <= 67)||(LA67_0 >= 70 && LA67_0 <= 72)||LA67_0==76||(LA67_0 >= 78 && LA67_0 <= 79)||LA67_0==85||LA67_0==87||LA67_0==90||(LA67_0 >= 96 && LA67_0 <= 97)||LA67_0==102) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:492:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_list2490);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, statement_list_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement_list"



    // $ANTLR start "expression_statement"
    // src/com/mbien/opencl/antlr/CL.g:495:1: expression_statement : ( ';' | expression ';' );
    public final void expression_statement() throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:496:5: ( ';' | expression ';' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==48) ) {
                alt68=1;
            }
            else if ( (LA68_0==CHARACTER_LITERAL||LA68_0==DECIMAL_LITERAL||LA68_0==FLOATING_POINT_LITERAL||LA68_0==HEX_LITERAL||LA68_0==IDENTIFIER||LA68_0==OCTAL_LITERAL||LA68_0==STRING_LITERAL||LA68_0==24||LA68_0==29||LA68_0==31||LA68_0==33||(LA68_0 >= 35 && LA68_0 <= 36)||(LA68_0 >= 39 && LA68_0 <= 40)||LA68_0==87||LA68_0==102) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:496:7: ';'
                    {
                    match(input,48,FOLLOW_48_in_expression_statement2508); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:497:7: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement2516);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_expression_statement2518); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, expression_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression_statement"



    // $ANTLR start "selection_statement"
    // src/com/mbien/opencl/antlr/CL.g:500:1: selection_statement : ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement );
    public final void selection_statement() throws RecognitionException {
        int selection_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:501:5: ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==79) ) {
                alt70=1;
            }
            else if ( (LA70_0==90) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:501:7: 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )?
                    {
                    match(input,79,FOLLOW_79_in_selection_statement2535); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_selection_statement2537); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_selection_statement2539);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_selection_statement2541); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_selection_statement2543);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:501:41: ( options {k=1; backtrack=false; } : 'else' statement )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==73) ) {
                        int LA69_1 = input.LA(2);

                        if ( (true) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:501:74: 'else' statement
                            {
                            match(input,73,FOLLOW_73_in_selection_statement2558); if (state.failed) return ;

                            pushFollow(FOLLOW_statement_in_selection_statement2560);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:502:7: 'switch' '(' expression ')' statement
                    {
                    match(input,90,FOLLOW_90_in_selection_statement2570); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_selection_statement2572); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_selection_statement2574);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_selection_statement2576); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_selection_statement2578);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, selection_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "selection_statement"



    // $ANTLR start "iteration_statement"
    // src/com/mbien/opencl/antlr/CL.g:505:1: iteration_statement : ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );
    public final void iteration_statement() throws RecognitionException {
        int iteration_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:506:5: ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt72=1;
                }
                break;
            case 72:
                {
                alt72=2;
                }
                break;
            case 76:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:506:7: 'while' '(' expression ')' statement
                    {
                    match(input,96,FOLLOW_96_in_iteration_statement2595); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_iteration_statement2597); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement2599);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_iteration_statement2601); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_iteration_statement2603);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:507:7: 'do' statement 'while' '(' expression ')' ';'
                    {
                    match(input,72,FOLLOW_72_in_iteration_statement2611); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_iteration_statement2613);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,96,FOLLOW_96_in_iteration_statement2615); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_iteration_statement2617); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement2619);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_iteration_statement2621); if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_iteration_statement2623); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:508:7: 'for' '(' expression_statement expression_statement ( expression )? ')' statement
                    {
                    match(input,76,FOLLOW_76_in_iteration_statement2631); if (state.failed) return ;

                    match(input,31,FOLLOW_31_in_iteration_statement2633); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement2635);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement2637);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // src/com/mbien/opencl/antlr/CL.g:508:59: ( expression )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==CHARACTER_LITERAL||LA71_0==DECIMAL_LITERAL||LA71_0==FLOATING_POINT_LITERAL||LA71_0==HEX_LITERAL||LA71_0==IDENTIFIER||LA71_0==OCTAL_LITERAL||LA71_0==STRING_LITERAL||LA71_0==24||LA71_0==29||LA71_0==31||LA71_0==33||(LA71_0 >= 35 && LA71_0 <= 36)||(LA71_0 >= 39 && LA71_0 <= 40)||LA71_0==87||LA71_0==102) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:508:59: expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement2639);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,32,FOLLOW_32_in_iteration_statement2642); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_iteration_statement2644);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, iteration_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "iteration_statement"



    // $ANTLR start "jump_statement"
    // src/com/mbien/opencl/antlr/CL.g:511:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
    public final void jump_statement() throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }

            // src/com/mbien/opencl/antlr/CL.g:512:5: ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt73=1;
                }
                break;
            case 70:
                {
                alt73=2;
                }
                break;
            case 66:
                {
                alt73=3;
                }
                break;
            case 85:
                {
                int LA73_4 = input.LA(2);

                if ( (LA73_4==48) ) {
                    alt73=4;
                }
                else if ( (LA73_4==CHARACTER_LITERAL||LA73_4==DECIMAL_LITERAL||LA73_4==FLOATING_POINT_LITERAL||LA73_4==HEX_LITERAL||LA73_4==IDENTIFIER||LA73_4==OCTAL_LITERAL||LA73_4==STRING_LITERAL||LA73_4==24||LA73_4==29||LA73_4==31||LA73_4==33||(LA73_4 >= 35 && LA73_4 <= 36)||(LA73_4 >= 39 && LA73_4 <= 40)||LA73_4==87||LA73_4==102) ) {
                    alt73=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:512:7: 'goto' IDENTIFIER ';'
                    {
                    match(input,78,FOLLOW_78_in_jump_statement2661); if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement2663); if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_jump_statement2665); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:513:7: 'continue' ';'
                    {
                    match(input,70,FOLLOW_70_in_jump_statement2673); if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_jump_statement2675); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:514:7: 'break' ';'
                    {
                    match(input,66,FOLLOW_66_in_jump_statement2683); if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_jump_statement2685); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:515:7: 'return' ';'
                    {
                    match(input,85,FOLLOW_85_in_jump_statement2693); if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_jump_statement2695); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:516:7: 'return' expression ';'
                    {
                    match(input,85,FOLLOW_85_in_jump_statement2703); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_jump_statement2705);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,48,FOLLOW_48_in_jump_statement2707); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, jump_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "jump_statement"

    // $ANTLR start synpred2_CL
    public final void synpred2_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:134:9: ( declaration_specifiers )
        // src/com/mbien/opencl/antlr/CL.g:134:9: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred2_CL114);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_CL

    // $ANTLR start synpred4_CL
    public final void synpred4_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:134:7: ( ( declaration_specifiers )? declarator ( declaration )* '{' )
        // src/com/mbien/opencl/antlr/CL.g:134:9: ( declaration_specifiers )? declarator ( declaration )* '{'
        {
        // src/com/mbien/opencl/antlr/CL.g:134:9: ( declaration_specifiers )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==BUILTIN_TYPE||(LA74_0 >= 64 && LA74_0 <= 65)||(LA74_0 >= 68 && LA74_0 <= 69)||(LA74_0 >= 74 && LA74_0 <= 75)||LA74_0==77||(LA74_0 >= 80 && LA74_0 <= 84)||LA74_0==86||(LA74_0 >= 88 && LA74_0 <= 89)||(LA74_0 >= 92 && LA74_0 <= 95)) ) {
            alt74=1;
        }
        else if ( (LA74_0==IDENTIFIER) ) {
            switch ( input.LA(2) ) {
                case 33:
                    {
                    alt74=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA74_17 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA74_18 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 64:
                case 75:
                case 84:
                case 88:
                    {
                    int LA74_19 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 81:
                    {
                    int LA74_20 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 94:
                    {
                    int LA74_21 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 65:
                    {
                    int LA74_22 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case BUILTIN_TYPE:
                    {
                    int LA74_23 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 93:
                    {
                    int LA74_24 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 83:
                    {
                    int LA74_25 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 80:
                    {
                    int LA74_26 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 86:
                    {
                    int LA74_27 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 89:
                case 92:
                    {
                    int LA74_28 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 74:
                    {
                    int LA74_29 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
                case 68:
                case 69:
                case 77:
                case 82:
                case 95:
                    {
                    int LA74_30 = input.LA(3);

                    if ( (((synpred2_CL()&&synpred2_CL())&&(isTypeName(input.LT(1).getText())))) ) {
                        alt74=1;
                    }
                    }
                    break;
            }

        }
        switch (alt74) {
            case 1 :
                // src/com/mbien/opencl/antlr/CL.g:134:9: declaration_specifiers
                {
                pushFollow(FOLLOW_declaration_specifiers_in_synpred4_CL114);
                declaration_specifiers();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_declarator_in_synpred4_CL117);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        // src/com/mbien/opencl/antlr/CL.g:134:44: ( declaration )*
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BUILTIN_TYPE||LA75_0==IDENTIFIER||(LA75_0 >= 64 && LA75_0 <= 65)||(LA75_0 >= 68 && LA75_0 <= 69)||(LA75_0 >= 74 && LA75_0 <= 75)||LA75_0==77||(LA75_0 >= 80 && LA75_0 <= 84)||LA75_0==86||(LA75_0 >= 88 && LA75_0 <= 89)||(LA75_0 >= 91 && LA75_0 <= 95)) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // src/com/mbien/opencl/antlr/CL.g:134:44: declaration
        	    {
        	    pushFollow(FOLLOW_declaration_in_synpred4_CL119);
        	    declaration();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop75;
            }
        } while (true);


        match(input,97,FOLLOW_97_in_synpred4_CL122); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_CL

    // $ANTLR start synpred5_CL
    public final void synpred5_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:143:10: ( declaration_specifiers )
        // src/com/mbien/opencl/antlr/CL.g:143:10: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred5_CL166);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_CL

    // $ANTLR start synpred8_CL
    public final void synpred8_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:156:17: ( declaration_specifiers )
        // src/com/mbien/opencl/antlr/CL.g:156:17: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred8_CL260);
        declaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_CL

    // $ANTLR start synpred13_CL
    public final void synpred13_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:162:36: ( ( ( 'kernel' )? type_specifier ) )
        // src/com/mbien/opencl/antlr/CL.g:162:36: ( ( 'kernel' )? type_specifier )
        {
        // src/com/mbien/opencl/antlr/CL.g:162:36: ( ( 'kernel' )? type_specifier )
        // src/com/mbien/opencl/antlr/CL.g:162:38: ( 'kernel' )? type_specifier
        {
        // src/com/mbien/opencl/antlr/CL.g:162:38: ( 'kernel' )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==81) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // src/com/mbien/opencl/antlr/CL.g:162:38: 'kernel'
                {
                match(input,81,FOLLOW_81_in_synpred13_CL313); if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_type_specifier_in_synpred13_CL316);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred13_CL

    // $ANTLR start synpred34_CL
    public final void synpred34_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:222:26: ( type_specifier )
        // src/com/mbien/opencl/antlr/CL.g:222:26: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred34_CL664);
        type_specifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_CL

    // $ANTLR start synpred47_CL
    public final void synpred47_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:258:7: ( ( pointer )? direct_declarator )
        // src/com/mbien/opencl/antlr/CL.g:258:7: ( pointer )? direct_declarator
        {
        // src/com/mbien/opencl/antlr/CL.g:258:7: ( pointer )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==33) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // src/com/mbien/opencl/antlr/CL.g:258:7: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred47_CL895);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_direct_declarator_in_synpred47_CL898);
        direct_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_CL

    // $ANTLR start synpred49_CL
    public final void synpred49_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:272:9: ( declarator_suffix )
        // src/com/mbien/opencl/antlr/CL.g:272:9: declarator_suffix
        {
        pushFollow(FOLLOW_declarator_suffix_in_synpred49_CL983);
        declarator_suffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_CL

    // $ANTLR start synpred52_CL
    public final void synpred52_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:278:9: ( '(' parameter_type_list ')' )
        // src/com/mbien/opencl/antlr/CL.g:278:9: '(' parameter_type_list ')'
        {
        match(input,31,FOLLOW_31_in_synpred52_CL1029); if (state.failed) return ;

        pushFollow(FOLLOW_parameter_type_list_in_synpred52_CL1031);
        parameter_type_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,32,FOLLOW_32_in_synpred52_CL1033); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_CL

    // $ANTLR start synpred53_CL
    public final void synpred53_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:279:9: ( '(' identifier_list ')' )
        // src/com/mbien/opencl/antlr/CL.g:279:9: '(' identifier_list ')'
        {
        match(input,31,FOLLOW_31_in_synpred53_CL1043); if (state.failed) return ;

        pushFollow(FOLLOW_identifier_list_in_synpred53_CL1045);
        identifier_list();

        state._fsp--;
        if (state.failed) return ;

        match(input,32,FOLLOW_32_in_synpred53_CL1047); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_CL

    // $ANTLR start synpred54_CL
    public final void synpred54_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:284:11: ( type_qualifier )
        // src/com/mbien/opencl/antlr/CL.g:284:11: type_qualifier
        {
        pushFollow(FOLLOW_type_qualifier_in_synpred54_CL1078);
        type_qualifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_CL

    // $ANTLR start synpred55_CL
    public final void synpred55_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:284:27: ( pointer )
        // src/com/mbien/opencl/antlr/CL.g:284:27: pointer
        {
        pushFollow(FOLLOW_pointer_in_synpred55_CL1081);
        pointer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred55_CL

    // $ANTLR start synpred56_CL
    public final void synpred56_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:284:7: ( '*' ( type_qualifier )+ ( pointer )? )
        // src/com/mbien/opencl/antlr/CL.g:284:7: '*' ( type_qualifier )+ ( pointer )?
        {
        match(input,33,FOLLOW_33_in_synpred56_CL1076); if (state.failed) return ;

        // src/com/mbien/opencl/antlr/CL.g:284:11: ( type_qualifier )+
        int cnt82=0;
        loop82:
        do {
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0 >= 68 && LA82_0 <= 69)||LA82_0==77||LA82_0==82||LA82_0==95) ) {
                alt82=1;
            }


            switch (alt82) {
        	case 1 :
        	    // src/com/mbien/opencl/antlr/CL.g:284:11: type_qualifier
        	    {
        	    pushFollow(FOLLOW_type_qualifier_in_synpred56_CL1078);
        	    type_qualifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt82 >= 1 ) break loop82;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(82, input);
                    throw eee;
            }
            cnt82++;
        } while (true);


        // src/com/mbien/opencl/antlr/CL.g:284:27: ( pointer )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==33) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // src/com/mbien/opencl/antlr/CL.g:284:27: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred56_CL1081);
                pointer();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred56_CL

    // $ANTLR start synpred57_CL
    public final void synpred57_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:285:7: ( '*' pointer )
        // src/com/mbien/opencl/antlr/CL.g:285:7: '*' pointer
        {
        match(input,33,FOLLOW_33_in_synpred57_CL1090); if (state.failed) return ;

        pushFollow(FOLLOW_pointer_in_synpred57_CL1092);
        pointer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_CL

    // $ANTLR start synpred60_CL
    public final void synpred60_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:298:31: ( declarator )
        // src/com/mbien/opencl/antlr/CL.g:298:31: declarator
        {
        pushFollow(FOLLOW_declarator_in_synpred60_CL1168);
        declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_CL

    // $ANTLR start synpred61_CL
    public final void synpred61_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:298:42: ( abstract_declarator )
        // src/com/mbien/opencl/antlr/CL.g:298:42: abstract_declarator
        {
        pushFollow(FOLLOW_abstract_declarator_in_synpred61_CL1170);
        abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_CL

    // $ANTLR start synpred64_CL
    public final void synpred64_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:310:15: ( direct_abstract_declarator )
        // src/com/mbien/opencl/antlr/CL.g:310:15: direct_abstract_declarator
        {
        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred64_CL1235);
        direct_abstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_CL

    // $ANTLR start synpred67_CL
    public final void synpred67_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:315:71: ( abstract_declarator_suffix )
        // src/com/mbien/opencl/antlr/CL.g:315:71: abstract_declarator_suffix
        {
        pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred67_CL1278);
        abstract_declarator_suffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred67_CL

    // $ANTLR start synpred80_CL
    public final void synpred80_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:349:7: ( '(' type_name ')' cast_expression )
        // src/com/mbien/opencl/antlr/CL.g:349:7: '(' type_name ')' cast_expression
        {
        match(input,31,FOLLOW_31_in_synpred80_CL1515); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred80_CL1517);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,32,FOLLOW_32_in_synpred80_CL1519); if (state.failed) return ;

        pushFollow(FOLLOW_cast_expression_in_synpred80_CL1521);
        cast_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_CL

    // $ANTLR start synpred85_CL
    public final void synpred85_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:358:7: ( 'sizeof' unary_expression )
        // src/com/mbien/opencl/antlr/CL.g:358:7: 'sizeof' unary_expression
        {
        match(input,87,FOLLOW_87_in_synpred85_CL1584); if (state.failed) return ;

        pushFollow(FOLLOW_unary_expression_in_synpred85_CL1586);
        unary_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_CL

    // $ANTLR start synpred106_CL
    public final void synpred106_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:409:7: ( lvalue assignment_operator assignment_expression )
        // src/com/mbien/opencl/antlr/CL.g:409:7: lvalue assignment_operator assignment_expression
        {
        pushFollow(FOLLOW_lvalue_in_synpred106_CL1967);
        lvalue();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignment_operator_in_synpred106_CL1969);
        assignment_operator();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignment_expression_in_synpred106_CL1971);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred106_CL

    // $ANTLR start synpred138_CL
    public final void synpred138_CL_fragment() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:488:11: ( declaration )
        // src/com/mbien/opencl/antlr/CL.g:488:11: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred138_CL2467);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred138_CL

    // Delegated rules

    public final boolean synpred47_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_CL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_CL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA53 dfa53 = new DFA53(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA53_eotS =
        "\155\uffff";
    static final String DFA53_eofS =
        "\1\uffff\2\17\152\uffff";
    static final String DFA53_minS =
        "\1\5\2\31\1\4\4\5\6\0\26\uffff\6\0\26\uffff\7\0\12\uffff\34\0";
    static final String DFA53_maxS =
        "\1\146\2\145\5\146\6\0\26\uffff\6\0\26\uffff\7\0\12\uffff\34\0";
    static final String DFA53_acceptS =
        "\16\uffff\1\1\1\2\135\uffff";
    static final String DFA53_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\26\uffff\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\26\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\12\uffff\1\23"+
        "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
        "\1\56}>";
    static final String[] DFA53_transitionS = {
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\1\4\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\6\4\uffff\1\6\1\uffff\1\3\1\uffff"+
            "\1\6\1\uffff\1\6\1\4\2\uffff\1\6\1\5\56\uffff\1\7\16\uffff\1"+
            "\6",
            "\2\17\1\16\2\17\1\16\1\11\2\17\1\16\1\17\1\14\1\16\2\17\1\15"+
            "\1\16\1\13\1\12\1\uffff\1\17\1\16\4\17\1\16\1\17\1\16\4\17\1"+
            "\16\1\17\1\10\2\17\1\16\42\uffff\1\17\1\16\2\17",
            "\2\17\1\16\2\17\1\16\1\45\2\17\1\16\1\17\1\50\1\16\2\17\1\51"+
            "\1\16\1\47\1\46\1\uffff\1\17\1\16\4\17\1\16\1\17\1\16\4\17\1"+
            "\16\1\17\1\44\2\17\1\16\42\uffff\1\17\1\16\2\17",
            "\1\17\1\101\1\uffff\1\101\2\uffff\1\101\1\uffff\1\101\1\uffff"+
            "\1\100\4\uffff\1\101\1\uffff\1\101\2\uffff\1\105\4\uffff\1\105"+
            "\1\uffff\1\102\1\uffff\1\105\1\uffff\1\105\1\103\2\uffff\1\105"+
            "\1\104\30\uffff\1\17\2\uffff\2\17\4\uffff\1\17\2\uffff\1\17"+
            "\2\uffff\1\17\1\uffff\2\17\2\uffff\1\17\1\106\1\uffff\1\17\2"+
            "\uffff\4\17\6\uffff\1\105",
            "\1\122\1\uffff\1\122\2\uffff\1\122\1\uffff\1\122\1\uffff\1"+
            "\121\4\uffff\1\122\1\uffff\1\122\2\uffff\1\126\4\uffff\1\126"+
            "\1\uffff\1\123\1\uffff\1\126\1\uffff\1\126\1\124\2\uffff\1\126"+
            "\1\125\56\uffff\1\127\16\uffff\1\126",
            "\1\131\1\uffff\1\131\2\uffff\1\131\1\uffff\1\131\1\uffff\1"+
            "\130\4\uffff\1\131\1\uffff\1\131\2\uffff\1\135\4\uffff\1\135"+
            "\1\uffff\1\132\1\uffff\1\135\1\uffff\1\135\1\133\2\uffff\1\135"+
            "\1\134\56\uffff\1\136\16\uffff\1\135",
            "\1\141\1\uffff\1\141\2\uffff\1\141\1\uffff\1\141\1\uffff\1"+
            "\140\4\uffff\1\141\1\uffff\1\141\2\uffff\1\144\4\uffff\1\144"+
            "\1\uffff\1\137\1\uffff\1\144\1\uffff\1\144\1\142\2\uffff\1\144"+
            "\1\143\56\uffff\1\145\16\uffff\1\144",
            "\1\150\1\uffff\1\150\2\uffff\1\150\1\uffff\1\150\1\uffff\1"+
            "\147\4\uffff\1\150\1\uffff\1\150\2\uffff\1\153\4\uffff\1\153"+
            "\1\uffff\1\146\1\uffff\1\153\1\uffff\1\153\1\151\2\uffff\1\153"+
            "\1\152\56\uffff\1\154\16\uffff\1\153",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "408:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_8);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_9);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_10);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_11);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_12);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_13);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA53_36 = input.LA(1);

                         
                        int index53_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_36);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA53_37 = input.LA(1);

                         
                        int index53_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_37);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA53_38 = input.LA(1);

                         
                        int index53_38 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_38);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA53_39 = input.LA(1);

                         
                        int index53_39 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_39);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA53_40 = input.LA(1);

                         
                        int index53_40 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_40);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA53_41 = input.LA(1);

                         
                        int index53_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_41);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA53_64 = input.LA(1);

                         
                        int index53_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_64);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA53_65 = input.LA(1);

                         
                        int index53_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_65);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA53_66 = input.LA(1);

                         
                        int index53_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_66);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA53_67 = input.LA(1);

                         
                        int index53_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_67);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA53_68 = input.LA(1);

                         
                        int index53_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_68);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA53_69 = input.LA(1);

                         
                        int index53_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_69);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA53_70 = input.LA(1);

                         
                        int index53_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_70);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA53_81 = input.LA(1);

                         
                        int index53_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_81);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA53_82 = input.LA(1);

                         
                        int index53_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_82);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA53_83 = input.LA(1);

                         
                        int index53_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_83);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA53_84 = input.LA(1);

                         
                        int index53_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_84);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA53_85 = input.LA(1);

                         
                        int index53_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_85);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA53_86 = input.LA(1);

                         
                        int index53_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_86);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA53_87 = input.LA(1);

                         
                        int index53_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_87);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA53_88 = input.LA(1);

                         
                        int index53_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_88);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA53_89 = input.LA(1);

                         
                        int index53_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_89);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA53_90 = input.LA(1);

                         
                        int index53_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_90);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA53_91 = input.LA(1);

                         
                        int index53_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_91);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA53_92 = input.LA(1);

                         
                        int index53_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_92);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA53_93 = input.LA(1);

                         
                        int index53_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_93);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA53_94 = input.LA(1);

                         
                        int index53_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_94);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA53_95 = input.LA(1);

                         
                        int index53_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_95);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA53_96 = input.LA(1);

                         
                        int index53_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_96);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA53_97 = input.LA(1);

                         
                        int index53_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_97);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA53_98 = input.LA(1);

                         
                        int index53_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_98);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA53_99 = input.LA(1);

                         
                        int index53_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_99);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA53_100 = input.LA(1);

                         
                        int index53_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_100);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA53_101 = input.LA(1);

                         
                        int index53_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_101);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA53_102 = input.LA(1);

                         
                        int index53_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_102);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA53_103 = input.LA(1);

                         
                        int index53_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_103);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA53_104 = input.LA(1);

                         
                        int index53_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_104);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA53_105 = input.LA(1);

                         
                        int index53_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_105);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA53_106 = input.LA(1);

                         
                        int index53_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_106);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA53_107 = input.LA(1);

                         
                        int index53_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_107);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA53_108 = input.LA(1);

                         
                        int index53_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred106_CL()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index53_108);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA65_eotS =
        "\110\uffff";
    static final String DFA65_eofS =
        "\110\uffff";
    static final String DFA65_minS =
        "\2\4\43\uffff\1\0\5\uffff\1\0\16\uffff\1\0\15\uffff";
    static final String DFA65_maxS =
        "\1\146\1\144\43\uffff\1\0\5\uffff\1\0\16\uffff\1\0\15\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\23\uffff\1\1\61\uffff";
    static final String DFA65_specialS =
        "\45\uffff\1\0\5\uffff\1\1\16\uffff\1\2\15\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\26\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\1\4"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\2\2\2\uffff\2\2\7\uffff\1\2\17\uffff\2\26"+
            "\2\2\2\26\3\2\1\uffff\2\26\1\2\1\26\2\2\5\26\1\2\1\26\1\2\2"+
            "\26\1\2\5\26\2\2\3\uffff\2\2",
            "\1\26\11\uffff\1\26\12\uffff\6\2\1\45\1\uffff\1\53\12\2\1\uffff"+
            "\3\2\1\72\14\2\1\uffff\2\2\2\26\2\uffff\2\26\4\uffff\2\26\1"+
            "\uffff\1\26\2\uffff\5\26\1\uffff\1\26\1\uffff\2\26\2\uffff\4"+
            "\26\2\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "()* loopback of 488:11: ( declaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_37 = input.LA(1);

                         
                        int index65_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((isTypeName(input.LT(1).getText()))&&(isTypeName(input.LT(1).getText())))&&synpred138_CL())) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_37);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA65_43 = input.LA(1);

                         
                        int index65_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((isTypeName(input.LT(1).getText()))&&(isTypeName(input.LT(1).getText())))&&synpred138_CL())) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_43);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA65_58 = input.LA(1);

                         
                        int index65_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((isTypeName(input.LT(1).getText()))&&(isTypeName(input.LT(1).getText())))&&synpred138_CL())) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_58);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_external_declaration_in_translation_unit85 = new BitSet(new long[]{0x0000000280004012L,0x00000000FB5F2C33L});
    public static final BitSet FOLLOW_function_definition_in_external_declaration127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_external_declaration135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition166 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_declarator_in_function_definition169 = new BitSet(new long[]{0x0000000000004010L,0x00000002FB5F2C33L});
    public static final BitSet FOLLOW_declaration_in_function_definition184 = new BitSet(new long[]{0x0000000000004010L,0x00000002FB5F2C33L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_declaration258 = new BitSet(new long[]{0x0000000280004010L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration260 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration271 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_declaration273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration282 = new BitSet(new long[]{0x0001000280004000L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration284 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_declaration287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers307 = new BitSet(new long[]{0x0000000000004012L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_81_in_declaration_specifiers313 = new BitSet(new long[]{0x0000000000004010L,0x0000000072490402L});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers316 = new BitSet(new long[]{0x0000000000004012L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers321 = new BitSet(new long[]{0x0000000000004012L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list340 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_init_declarator_list343 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list345 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator364 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_init_declarator367 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004200800000L});
    public static final BitSet FOLLOW_initializer_in_init_declarator369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_type_specifier429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_type_specifier437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUILTIN_TYPE_in_type_specifier445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_type_specifier453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_type_specifier461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_type_specifier469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_type_specifier477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_type_specifier501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_id522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier558 = new BitSet(new long[]{0x0000000000004000L,0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier560 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_struct_or_union_specifier563 = new BitSet(new long[]{0x0000000000004010L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier565 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_struct_or_union_specifier567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier575 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list619 = new BitSet(new long[]{0x0000000000004012L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration637 = new BitSet(new long[]{0x0000800280004000L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration639 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_struct_declaration641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list660 = new BitSet(new long[]{0x0000000000004012L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list664 = new BitSet(new long[]{0x0000000000004012L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list684 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_struct_declarator_list687 = new BitSet(new long[]{0x0000800280004000L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list689 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator708 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_struct_declarator711 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_struct_declarator723 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_enum_specifier749 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_enum_specifier751 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier753 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_enum_specifier755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_enum_specifier763 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier765 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_enum_specifier767 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier769 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_enum_specifier771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_enum_specifier779 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list798 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_enumerator_list801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list803 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerator822 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_enumerator825 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator895 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator930 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_31_in_direct_declarator959 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator961 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_direct_declarator963 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator983 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_60_in_declarator_suffix1003 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_declarator_suffix1005 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator_suffix1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_declarator_suffix1017 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator_suffix1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_declarator_suffix1029 = new BitSet(new long[]{0x0000000000004010L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix1031 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declarator_suffix1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_declarator_suffix1043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_list_in_declarator_suffix1045 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declarator_suffix1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_declarator_suffix1057 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declarator_suffix1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_pointer1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000080042030L});
    public static final BitSet FOLLOW_type_qualifier_in_pointer1078 = new BitSet(new long[]{0x0000000200000002L,0x0000000080042030L});
    public static final BitSet FOLLOW_pointer_in_pointer1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_pointer1090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_pointer_in_pointer1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_pointer1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list1117 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_parameter_type_list1120 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parameter_type_list1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list1141 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_parameter_list1144 = new BitSet(new long[]{0x0000000000004010L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list1146 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration1165 = new BitSet(new long[]{0x1000000280004002L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration1168 = new BitSet(new long[]{0x1000000280004002L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration1170 = new BitSet(new long[]{0x1000000280004002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1189 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_identifier_list1192 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1194 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name1213 = new BitSet(new long[]{0x1000000280000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator1233 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_direct_abstract_declarator1266 = new BitSet(new long[]{0x1000000280000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator1268 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_direct_abstract_declarator1270 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1274 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1278 = new BitSet(new long[]{0x1000000080000002L});
    public static final BitSet FOLLOW_60_in_abstract_declarator_suffix1299 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_abstract_declarator_suffix1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_abstract_declarator_suffix1312 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix1314 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_abstract_declarator_suffix1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_abstract_declarator_suffix1327 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_abstract_declarator_suffix1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_abstract_declarator_suffix1340 = new BitSet(new long[]{0x0000000000004010L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix1342 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_abstract_declarator_suffix1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_initializer1369 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004200800000L});
    public static final BitSet FOLLOW_initializer_list_in_initializer1371 = new BitSet(new long[]{0x0000004000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_38_in_initializer1373 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_initializer1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list1393 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_initializer_list1396 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004200800000L});
    public static final BitSet FOLLOW_initializer_in_initializer_list1398 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1421 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_argument_expression_list1424 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1426 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1446 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_additive_expression1450 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1452 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_39_in_additive_expression1456 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1458 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1478 = new BitSet(new long[]{0x0000200204000002L});
    public static final BitSet FOLLOW_33_in_multiplicative_expression1482 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1484 = new BitSet(new long[]{0x0000200204000002L});
    public static final BitSet FOLLOW_45_in_multiplicative_expression1488 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1490 = new BitSet(new long[]{0x0000200204000002L});
    public static final BitSet FOLLOW_26_in_multiplicative_expression1494 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1496 = new BitSet(new long[]{0x0000200204000002L});
    public static final BitSet FOLLOW_31_in_cast_expression1515 = new BitSet(new long[]{0x0000000000004010L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_type_name_in_cast_expression1517 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cast_expression1519 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unary_expression1554 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_unary_expression1564 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1574 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_unary_expression1584 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_unary_expression1594 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_unary_expression1596 = new BitSet(new long[]{0x0000000000004010L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_type_name_in_unary_expression1598 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_unary_expression1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1619 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_60_in_postfix_expression1633 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1635 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_postfix_expression1637 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_31_in_postfix_expression1651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfix_expression1653 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_31_in_postfix_expression1667 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1669 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfix_expression1671 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_43_in_postfix_expression1685 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1687 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_42_in_postfix_expression1701 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1703 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_36_in_postfix_expression1717 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_40_in_postfix_expression1731 = new BitSet(new long[]{0x10000D1080000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primary_expression1832 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_primary_expression1834 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_primary_expression1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1926 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_expression1929 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1931 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_assignment_expression1967 = new BitSet(new long[]{0x8428422448000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1969 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_lvalue1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2113 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_conditional_expression2116 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_conditional_expression2118 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_conditional_expression2120 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2141 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_logical_or_expression2144 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2146 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2165 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_logical_and_expression2168 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2170 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2189 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_inclusive_or_expression2192 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2194 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2213 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_exclusive_or_expression2216 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2218 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2237 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_and_expression2240 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression2242 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2260 = new BitSet(new long[]{0x0040000002000002L});
    public static final BitSet FOLLOW_set_in_equality_expression2263 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression2269 = new BitSet(new long[]{0x0040000002000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2288 = new BitSet(new long[]{0x0192000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expression2291 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2301 = new BitSet(new long[]{0x0192000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2320 = new BitSet(new long[]{0x0204000000000002L});
    public static final BitSet FOLLOW_set_in_shift_expression2323 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2329 = new BitSet(new long[]{0x0204000000000002L});
    public static final BitSet FOLLOW_labeled_statement_in_statement2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement2407 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_labeled_statement2409 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_labeled_statement2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_labeled_statement2419 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement2421 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_labeled_statement2423 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_labeled_statement2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_labeled_statement2433 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_labeled_statement2435 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_labeled_statement2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_compound_statement2465 = new BitSet(new long[]{0x0001019AA12854B0L,0x00000063FFFFFDFFL});
    public static final BitSet FOLLOW_declaration_in_compound_statement2467 = new BitSet(new long[]{0x0001019AA12854B0L,0x00000063FFFFFDFFL});
    public static final BitSet FOLLOW_statement_list_in_compound_statement2470 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_compound_statement2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list2490 = new BitSet(new long[]{0x0001019AA12854A2L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_48_in_expression_statement2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement2516 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_expression_statement2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_selection_statement2535 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_selection_statement2537 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_selection_statement2539 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_selection_statement2541 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_selection_statement2543 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_selection_statement2558 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_selection_statement2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_selection_statement2570 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_selection_statement2572 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_selection_statement2574 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_selection_statement2576 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_selection_statement2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_iteration_statement2595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration_statement2597 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement2599 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_iteration_statement2601 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_iteration_statement2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_iteration_statement2611 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_iteration_statement2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_iteration_statement2615 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration_statement2617 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement2619 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_iteration_statement2621 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_iteration_statement2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_iteration_statement2631 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration_statement2633 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement2635 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement2637 = new BitSet(new long[]{0x0000019BA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_iteration_statement2639 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_iteration_statement2642 = new BitSet(new long[]{0x0001019AA12854A0L,0x0000004304A0D1CCL});
    public static final BitSet FOLLOW_statement_in_iteration_statement2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_jump_statement2661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement2663 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_jump_statement2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_jump_statement2673 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_jump_statement2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_jump_statement2683 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_jump_statement2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_jump_statement2693 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_jump_statement2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_jump_statement2703 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_expression_in_jump_statement2705 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_jump_statement2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred2_CL114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_CL114 = new BitSet(new long[]{0x0000000280004000L});
    public static final BitSet FOLLOW_declarator_in_synpred4_CL117 = new BitSet(new long[]{0x0000000000004010L,0x00000002FB5F2C33L});
    public static final BitSet FOLLOW_declaration_in_synpred4_CL119 = new BitSet(new long[]{0x0000000000004010L,0x00000002FB5F2C33L});
    public static final BitSet FOLLOW_97_in_synpred4_CL122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred5_CL166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred8_CL260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred13_CL313 = new BitSet(new long[]{0x0000000000004010L,0x0000000072490402L});
    public static final BitSet FOLLOW_type_specifier_in_synpred13_CL316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred34_CL664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred47_CL895 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_direct_declarator_in_synpred47_CL898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_suffix_in_synpred49_CL983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred52_CL1029 = new BitSet(new long[]{0x0000000000004010L,0x00000000F35F2C33L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred52_CL1031 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred52_CL1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred53_CL1043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_identifier_list_in_synpred53_CL1045 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred53_CL1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_synpred54_CL1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred55_CL1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred56_CL1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000080042030L});
    public static final BitSet FOLLOW_type_qualifier_in_synpred56_CL1078 = new BitSet(new long[]{0x0000000200000002L,0x0000000080042030L});
    public static final BitSet FOLLOW_pointer_in_synpred56_CL1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred57_CL1090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_pointer_in_synpred57_CL1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred60_CL1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred61_CL1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred64_CL1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred67_CL1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred80_CL1515 = new BitSet(new long[]{0x0000000000004010L,0x00000000F24D2432L});
    public static final BitSet FOLLOW_type_name_in_synpred80_CL1517 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred80_CL1519 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_cast_expression_in_synpred80_CL1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_synpred85_CL1584 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_unary_expression_in_synpred85_CL1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_synpred106_CL1967 = new BitSet(new long[]{0x8428422448000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_assignment_operator_in_synpred106_CL1969 = new BitSet(new long[]{0x0000019AA12854A0L,0x0000004000800000L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred106_CL1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred138_CL2467 = new BitSet(new long[]{0x0000000000000002L});

}