// $ANTLR 3.4 src/com/mbien/opencl/antlr/CL.g 2011-08-22 05:32:56

package com.mbien.opencl.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CLLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CLLexer() {} 
    public CLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/com/mbien/opencl/antlr/CL.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:6:7: ( '!' )
            // src/com/mbien/opencl/antlr/CL.g:6:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:7:7: ( '!=' )
            // src/com/mbien/opencl/antlr/CL.g:7:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:8:7: ( '%' )
            // src/com/mbien/opencl/antlr/CL.g:8:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:9:7: ( '%=' )
            // src/com/mbien/opencl/antlr/CL.g:9:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:10:7: ( '&&' )
            // src/com/mbien/opencl/antlr/CL.g:10:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:11:7: ( '&' )
            // src/com/mbien/opencl/antlr/CL.g:11:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:12:7: ( '&=' )
            // src/com/mbien/opencl/antlr/CL.g:12:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:13:7: ( '(' )
            // src/com/mbien/opencl/antlr/CL.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:14:7: ( ')' )
            // src/com/mbien/opencl/antlr/CL.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:15:7: ( '*' )
            // src/com/mbien/opencl/antlr/CL.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:16:7: ( '*=' )
            // src/com/mbien/opencl/antlr/CL.g:16:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:17:7: ( '+' )
            // src/com/mbien/opencl/antlr/CL.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:18:7: ( '++' )
            // src/com/mbien/opencl/antlr/CL.g:18:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:19:7: ( '+=' )
            // src/com/mbien/opencl/antlr/CL.g:19:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:20:7: ( ',' )
            // src/com/mbien/opencl/antlr/CL.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:21:7: ( '-' )
            // src/com/mbien/opencl/antlr/CL.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:22:7: ( '--' )
            // src/com/mbien/opencl/antlr/CL.g:22:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:23:7: ( '-=' )
            // src/com/mbien/opencl/antlr/CL.g:23:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:24:7: ( '->' )
            // src/com/mbien/opencl/antlr/CL.g:24:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:25:7: ( '.' )
            // src/com/mbien/opencl/antlr/CL.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:26:7: ( '...' )
            // src/com/mbien/opencl/antlr/CL.g:26:9: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:27:7: ( '/' )
            // src/com/mbien/opencl/antlr/CL.g:27:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:28:7: ( '/=' )
            // src/com/mbien/opencl/antlr/CL.g:28:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:29:7: ( ':' )
            // src/com/mbien/opencl/antlr/CL.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:30:7: ( ';' )
            // src/com/mbien/opencl/antlr/CL.g:30:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:31:7: ( '<' )
            // src/com/mbien/opencl/antlr/CL.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:32:7: ( '<<' )
            // src/com/mbien/opencl/antlr/CL.g:32:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:33:7: ( '<<=' )
            // src/com/mbien/opencl/antlr/CL.g:33:9: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:34:7: ( '<=' )
            // src/com/mbien/opencl/antlr/CL.g:34:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:35:7: ( '=' )
            // src/com/mbien/opencl/antlr/CL.g:35:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:36:7: ( '==' )
            // src/com/mbien/opencl/antlr/CL.g:36:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:37:7: ( '>' )
            // src/com/mbien/opencl/antlr/CL.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:38:7: ( '>=' )
            // src/com/mbien/opencl/antlr/CL.g:38:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:39:7: ( '>>' )
            // src/com/mbien/opencl/antlr/CL.g:39:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:40:7: ( '>>=' )
            // src/com/mbien/opencl/antlr/CL.g:40:9: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:41:7: ( '?' )
            // src/com/mbien/opencl/antlr/CL.g:41:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:42:7: ( '[' )
            // src/com/mbien/opencl/antlr/CL.g:42:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:43:7: ( ']' )
            // src/com/mbien/opencl/antlr/CL.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:44:7: ( '^' )
            // src/com/mbien/opencl/antlr/CL.g:44:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:45:7: ( '^=' )
            // src/com/mbien/opencl/antlr/CL.g:45:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:46:7: ( 'auto' )
            // src/com/mbien/opencl/antlr/CL.g:46:9: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:47:7: ( 'bool' )
            // src/com/mbien/opencl/antlr/CL.g:47:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:48:7: ( 'break' )
            // src/com/mbien/opencl/antlr/CL.g:48:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:49:7: ( 'case' )
            // src/com/mbien/opencl/antlr/CL.g:49:9: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:50:7: ( 'const' )
            // src/com/mbien/opencl/antlr/CL.g:50:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:51:7: ( 'constant' )
            // src/com/mbien/opencl/antlr/CL.g:51:9: 'constant'
            {
            match("constant"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:52:7: ( 'continue' )
            // src/com/mbien/opencl/antlr/CL.g:52:9: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:53:7: ( 'default' )
            // src/com/mbien/opencl/antlr/CL.g:53:9: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:54:7: ( 'do' )
            // src/com/mbien/opencl/antlr/CL.g:54:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:55:7: ( 'else' )
            // src/com/mbien/opencl/antlr/CL.g:55:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:56:7: ( 'enum' )
            // src/com/mbien/opencl/antlr/CL.g:56:9: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:57:7: ( 'extern' )
            // src/com/mbien/opencl/antlr/CL.g:57:9: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:58:7: ( 'for' )
            // src/com/mbien/opencl/antlr/CL.g:58:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:59:7: ( 'global' )
            // src/com/mbien/opencl/antlr/CL.g:59:9: 'global'
            {
            match("global"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:60:7: ( 'goto' )
            // src/com/mbien/opencl/antlr/CL.g:60:9: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:61:7: ( 'if' )
            // src/com/mbien/opencl/antlr/CL.g:61:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:62:7: ( 'intptr_t' )
            // src/com/mbien/opencl/antlr/CL.g:62:9: 'intptr_t'
            {
            match("intptr_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:63:7: ( 'kernel' )
            // src/com/mbien/opencl/antlr/CL.g:63:9: 'kernel'
            {
            match("kernel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:64:7: ( 'local' )
            // src/com/mbien/opencl/antlr/CL.g:64:9: 'local'
            {
            match("local"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:65:7: ( 'ptrdiff_t' )
            // src/com/mbien/opencl/antlr/CL.g:65:9: 'ptrdiff_t'
            {
            match("ptrdiff_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:66:7: ( 'register' )
            // src/com/mbien/opencl/antlr/CL.g:66:9: 'register'
            {
            match("register"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:67:7: ( 'return' )
            // src/com/mbien/opencl/antlr/CL.g:67:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:68:7: ( 'size_t' )
            // src/com/mbien/opencl/antlr/CL.g:68:9: 'size_t'
            {
            match("size_t"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:69:7: ( 'sizeof' )
            // src/com/mbien/opencl/antlr/CL.g:69:9: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:70:7: ( 'static' )
            // src/com/mbien/opencl/antlr/CL.g:70:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:71:7: ( 'struct' )
            // src/com/mbien/opencl/antlr/CL.g:71:9: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:72:7: ( 'switch' )
            // src/com/mbien/opencl/antlr/CL.g:72:9: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:73:7: ( 'typedef' )
            // src/com/mbien/opencl/antlr/CL.g:73:9: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:74:7: ( 'union' )
            // src/com/mbien/opencl/antlr/CL.g:74:9: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:75:7: ( 'unsigned' )
            // src/com/mbien/opencl/antlr/CL.g:75:9: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:76:7: ( 'void' )
            // src/com/mbien/opencl/antlr/CL.g:76:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:77:7: ( 'volatile' )
            // src/com/mbien/opencl/antlr/CL.g:77:9: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:78:7: ( 'while' )
            // src/com/mbien/opencl/antlr/CL.g:78:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:79:7: ( '{' )
            // src/com/mbien/opencl/antlr/CL.g:79:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:80:7: ( '|' )
            // src/com/mbien/opencl/antlr/CL.g:80:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:81:7: ( '|=' )
            // src/com/mbien/opencl/antlr/CL.g:81:9: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:82:8: ( '||' )
            // src/com/mbien/opencl/antlr/CL.g:82:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:83:8: ( '}' )
            // src/com/mbien/opencl/antlr/CL.g:83:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:84:8: ( '~' )
            // src/com/mbien/opencl/antlr/CL.g:84:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "BUILTIN_TYPE"
    public final void mBUILTIN_TYPE() throws RecognitionException {
        try {
            int _type = BUILTIN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:486:9: ( ( 'u' )? ( 'char' | 'short' | 'int' | 'long' | 'float' | 'double' ) ( '2' | '3' | '4' | '8' | '16' )? )
            // src/com/mbien/opencl/antlr/CL.g:486:11: ( 'u' )? ( 'char' | 'short' | 'int' | 'long' | 'float' | 'double' ) ( '2' | '3' | '4' | '8' | '16' )?
            {
            // src/com/mbien/opencl/antlr/CL.g:486:11: ( 'u' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='u') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:486:11: 'u'
                    {
                    match('u'); 

                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:486:16: ( 'char' | 'short' | 'int' | 'long' | 'float' | 'double' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt2=1;
                }
                break;
            case 's':
                {
                alt2=2;
                }
                break;
            case 'i':
                {
                alt2=3;
                }
                break;
            case 'l':
                {
                alt2=4;
                }
                break;
            case 'f':
                {
                alt2=5;
                }
                break;
            case 'd':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:486:17: 'char'
                    {
                    match("char"); 



                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:486:26: 'short'
                    {
                    match("short"); 



                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:486:36: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:486:44: 'long'
                    {
                    match("long"); 



                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:486:53: 'float'
                    {
                    match("float"); 



                    }
                    break;
                case 6 :
                    // src/com/mbien/opencl/antlr/CL.g:486:63: 'double'
                    {
                    match("double"); 



                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:486:73: ( '2' | '3' | '4' | '8' | '16' )?
            int alt3=6;
            switch ( input.LA(1) ) {
                case '2':
                    {
                    alt3=1;
                    }
                    break;
                case '3':
                    {
                    alt3=2;
                    }
                    break;
                case '4':
                    {
                    alt3=3;
                    }
                    break;
                case '8':
                    {
                    alt3=4;
                    }
                    break;
                case '1':
                    {
                    alt3=5;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:486:74: '2'
                    {
                    match('2'); 

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:486:80: '3'
                    {
                    match('3'); 

                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:486:86: '4'
                    {
                    match('4'); 

                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:486:92: '8'
                    {
                    match('8'); 

                    }
                    break;
                case 5 :
                    // src/com/mbien/opencl/antlr/CL.g:486:98: '16'
                    {
                    match("16"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BUILTIN_TYPE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:489:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // src/com/mbien/opencl/antlr/CL.g:489:10: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 


            // src/com/mbien/opencl/antlr/CL.g:489:17: ( LETTER | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:495:5: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:497:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // src/com/mbien/opencl/antlr/CL.g:497:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // src/com/mbien/opencl/antlr/CL.g:497:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:497:16: EscapeSequence
                    {
                    mEscapeSequence(); 


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:497:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:501:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/com/mbien/opencl/antlr/CL.g:501:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/com/mbien/opencl/antlr/CL.g:501:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:501:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // src/com/mbien/opencl/antlr/CL.g:501:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:504:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // src/com/mbien/opencl/antlr/CL.g:504:15: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/com/mbien/opencl/antlr/CL.g:504:29: ( HexDigit )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'F')||(LA7_0 >= 'a' && LA7_0 <= 'f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            // src/com/mbien/opencl/antlr/CL.g:504:39: ( IntegerTypeSuffix )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:504:39: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:506:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // src/com/mbien/opencl/antlr/CL.g:506:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // src/com/mbien/opencl/antlr/CL.g:506:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                alt10=1;
            }
            else if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:506:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:506:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // src/com/mbien/opencl/antlr/CL.g:506:35: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:506:46: ( IntegerTypeSuffix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='U'||LA11_0=='l'||LA11_0=='u') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:506:46: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:508:15: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // src/com/mbien/opencl/antlr/CL.g:508:17: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            // src/com/mbien/opencl/antlr/CL.g:508:21: ( '0' .. '7' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '7')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            // src/com/mbien/opencl/antlr/CL.g:508:33: ( IntegerTypeSuffix )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='L'||LA13_0=='U'||LA13_0=='l'||LA13_0=='u') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:508:33: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:512:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:516:5: ( ( 'u' | 'U' )? ( 'l' | 'L' ) | ( 'u' | 'U' ) ( 'l' | 'L' )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='U'||LA16_0=='u') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='L'||LA16_1=='l') ) {
                    alt16=1;
                }
                else {
                    alt16=2;
                }
            }
            else if ( (LA16_0=='L'||LA16_0=='l') ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:516:10: ( 'u' | 'U' )? ( 'l' | 'L' )
                    {
                    // src/com/mbien/opencl/antlr/CL.g:516:10: ( 'u' | 'U' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='U'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:517:10: ( 'u' | 'U' ) ( 'l' | 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // src/com/mbien/opencl/antlr/CL.g:517:21: ( 'l' | 'L' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='L'||LA15_0=='l') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:520:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix )
            int alt28=4;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:520:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // src/com/mbien/opencl/antlr/CL.g:520:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    match('.'); 

                    // src/com/mbien/opencl/antlr/CL.g:520:25: ( '0' .. '9' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    // src/com/mbien/opencl/antlr/CL.g:520:37: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:520:37: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // src/com/mbien/opencl/antlr/CL.g:520:47: ( FloatTypeSuffix )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:521:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 

                    // src/com/mbien/opencl/antlr/CL.g:521:13: ( '0' .. '9' )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    // src/com/mbien/opencl/antlr/CL.g:521:25: ( Exponent )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:521:25: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // src/com/mbien/opencl/antlr/CL.g:521:35: ( FloatTypeSuffix )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:522:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // src/com/mbien/opencl/antlr/CL.g:522:9: ( '0' .. '9' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    mExponent(); 


                    // src/com/mbien/opencl/antlr/CL.g:522:30: ( FloatTypeSuffix )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // src/com/mbien/opencl/antlr/CL.g:523:9: ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix
                    {
                    // src/com/mbien/opencl/antlr/CL.g:523:9: ( '0' .. '9' )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // src/com/mbien/opencl/antlr/CL.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    // src/com/mbien/opencl/antlr/CL.g:523:21: ( Exponent )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='E'||LA27_0=='e') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // src/com/mbien/opencl/antlr/CL.g:523:21: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    mFloatTypeSuffix(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:528:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // src/com/mbien/opencl/antlr/CL.g:528:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/com/mbien/opencl/antlr/CL.g:528:22: ( '+' | '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='+'||LA29_0=='-') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // src/com/mbien/opencl/antlr/CL.g:528:33: ( '0' .. '9' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:531:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // src/com/mbien/opencl/antlr/CL.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:535:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\\') ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1=='\"'||LA31_1=='\''||LA31_1=='\\'||LA31_1=='b'||LA31_1=='f'||LA31_1=='n'||LA31_1=='r'||LA31_1=='t') ) {
                    alt31=1;
                }
                else if ( ((LA31_1 >= '0' && LA31_1 <= '7')) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:535:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:536:9: OctalEscape
                    {
                    mOctalEscape(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:541:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\\') ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1 >= '0' && LA32_1 <= '3')) ) {
                    int LA32_2 = input.LA(3);

                    if ( ((LA32_2 >= '0' && LA32_2 <= '7')) ) {
                        int LA32_4 = input.LA(4);

                        if ( ((LA32_4 >= '0' && LA32_4 <= '7')) ) {
                            alt32=1;
                        }
                        else {
                            alt32=2;
                        }
                    }
                    else {
                        alt32=3;
                    }
                }
                else if ( ((LA32_1 >= '4' && LA32_1 <= '7')) ) {
                    int LA32_3 = input.LA(3);

                    if ( ((LA32_3 >= '0' && LA32_3 <= '7')) ) {
                        alt32=2;
                    }
                    else {
                        alt32=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:541:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/com/mbien/opencl/antlr/CL.g:542:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // src/com/mbien/opencl/antlr/CL.g:543:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // src/com/mbien/opencl/antlr/CL.g:548:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/com/mbien/opencl/antlr/CL.g:548:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 

            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:550:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/com/mbien/opencl/antlr/CL.g:550:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:554:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/com/mbien/opencl/antlr/CL.g:554:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // src/com/mbien/opencl/antlr/CL.g:554:14: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1=='/') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_1 >= '\u0000' && LA33_1 <= '.')||(LA33_1 >= '0' && LA33_1 <= '\uFFFF')) ) {
                        alt33=1;
                    }


                }
                else if ( ((LA33_0 >= '\u0000' && LA33_0 <= ')')||(LA33_0 >= '+' && LA33_0 <= '\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:554:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:558:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/com/mbien/opencl/antlr/CL.g:558:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // src/com/mbien/opencl/antlr/CL.g:558:12: (~ ( '\\n' | '\\r' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\t')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // src/com/mbien/opencl/antlr/CL.g:558:26: ( '\\r' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\r') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:558:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "LINE_COMMAND"
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/mbien/opencl/antlr/CL.g:563:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/com/mbien/opencl/antlr/CL.g:563:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 

            // src/com/mbien/opencl/antlr/CL.g:563:11: (~ ( '\\n' | '\\r' ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0 >= '\u0000' && LA36_0 <= '\t')||(LA36_0 >= '\u000B' && LA36_0 <= '\f')||(LA36_0 >= '\u000E' && LA36_0 <= '\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // src/com/mbien/opencl/antlr/CL.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // src/com/mbien/opencl/antlr/CL.g:563:25: ( '\\r' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\r') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/com/mbien/opencl/antlr/CL.g:563:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMAND"

    public void mTokens() throws RecognitionException {
        // src/com/mbien/opencl/antlr/CL.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | BUILTIN_TYPE | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
        int alt38=91;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // src/com/mbien/opencl/antlr/CL.g:1:10: T__24
                {
                mT__24(); 


                }
                break;
            case 2 :
                // src/com/mbien/opencl/antlr/CL.g:1:16: T__25
                {
                mT__25(); 


                }
                break;
            case 3 :
                // src/com/mbien/opencl/antlr/CL.g:1:22: T__26
                {
                mT__26(); 


                }
                break;
            case 4 :
                // src/com/mbien/opencl/antlr/CL.g:1:28: T__27
                {
                mT__27(); 


                }
                break;
            case 5 :
                // src/com/mbien/opencl/antlr/CL.g:1:34: T__28
                {
                mT__28(); 


                }
                break;
            case 6 :
                // src/com/mbien/opencl/antlr/CL.g:1:40: T__29
                {
                mT__29(); 


                }
                break;
            case 7 :
                // src/com/mbien/opencl/antlr/CL.g:1:46: T__30
                {
                mT__30(); 


                }
                break;
            case 8 :
                // src/com/mbien/opencl/antlr/CL.g:1:52: T__31
                {
                mT__31(); 


                }
                break;
            case 9 :
                // src/com/mbien/opencl/antlr/CL.g:1:58: T__32
                {
                mT__32(); 


                }
                break;
            case 10 :
                // src/com/mbien/opencl/antlr/CL.g:1:64: T__33
                {
                mT__33(); 


                }
                break;
            case 11 :
                // src/com/mbien/opencl/antlr/CL.g:1:70: T__34
                {
                mT__34(); 


                }
                break;
            case 12 :
                // src/com/mbien/opencl/antlr/CL.g:1:76: T__35
                {
                mT__35(); 


                }
                break;
            case 13 :
                // src/com/mbien/opencl/antlr/CL.g:1:82: T__36
                {
                mT__36(); 


                }
                break;
            case 14 :
                // src/com/mbien/opencl/antlr/CL.g:1:88: T__37
                {
                mT__37(); 


                }
                break;
            case 15 :
                // src/com/mbien/opencl/antlr/CL.g:1:94: T__38
                {
                mT__38(); 


                }
                break;
            case 16 :
                // src/com/mbien/opencl/antlr/CL.g:1:100: T__39
                {
                mT__39(); 


                }
                break;
            case 17 :
                // src/com/mbien/opencl/antlr/CL.g:1:106: T__40
                {
                mT__40(); 


                }
                break;
            case 18 :
                // src/com/mbien/opencl/antlr/CL.g:1:112: T__41
                {
                mT__41(); 


                }
                break;
            case 19 :
                // src/com/mbien/opencl/antlr/CL.g:1:118: T__42
                {
                mT__42(); 


                }
                break;
            case 20 :
                // src/com/mbien/opencl/antlr/CL.g:1:124: T__43
                {
                mT__43(); 


                }
                break;
            case 21 :
                // src/com/mbien/opencl/antlr/CL.g:1:130: T__44
                {
                mT__44(); 


                }
                break;
            case 22 :
                // src/com/mbien/opencl/antlr/CL.g:1:136: T__45
                {
                mT__45(); 


                }
                break;
            case 23 :
                // src/com/mbien/opencl/antlr/CL.g:1:142: T__46
                {
                mT__46(); 


                }
                break;
            case 24 :
                // src/com/mbien/opencl/antlr/CL.g:1:148: T__47
                {
                mT__47(); 


                }
                break;
            case 25 :
                // src/com/mbien/opencl/antlr/CL.g:1:154: T__48
                {
                mT__48(); 


                }
                break;
            case 26 :
                // src/com/mbien/opencl/antlr/CL.g:1:160: T__49
                {
                mT__49(); 


                }
                break;
            case 27 :
                // src/com/mbien/opencl/antlr/CL.g:1:166: T__50
                {
                mT__50(); 


                }
                break;
            case 28 :
                // src/com/mbien/opencl/antlr/CL.g:1:172: T__51
                {
                mT__51(); 


                }
                break;
            case 29 :
                // src/com/mbien/opencl/antlr/CL.g:1:178: T__52
                {
                mT__52(); 


                }
                break;
            case 30 :
                // src/com/mbien/opencl/antlr/CL.g:1:184: T__53
                {
                mT__53(); 


                }
                break;
            case 31 :
                // src/com/mbien/opencl/antlr/CL.g:1:190: T__54
                {
                mT__54(); 


                }
                break;
            case 32 :
                // src/com/mbien/opencl/antlr/CL.g:1:196: T__55
                {
                mT__55(); 


                }
                break;
            case 33 :
                // src/com/mbien/opencl/antlr/CL.g:1:202: T__56
                {
                mT__56(); 


                }
                break;
            case 34 :
                // src/com/mbien/opencl/antlr/CL.g:1:208: T__57
                {
                mT__57(); 


                }
                break;
            case 35 :
                // src/com/mbien/opencl/antlr/CL.g:1:214: T__58
                {
                mT__58(); 


                }
                break;
            case 36 :
                // src/com/mbien/opencl/antlr/CL.g:1:220: T__59
                {
                mT__59(); 


                }
                break;
            case 37 :
                // src/com/mbien/opencl/antlr/CL.g:1:226: T__60
                {
                mT__60(); 


                }
                break;
            case 38 :
                // src/com/mbien/opencl/antlr/CL.g:1:232: T__61
                {
                mT__61(); 


                }
                break;
            case 39 :
                // src/com/mbien/opencl/antlr/CL.g:1:238: T__62
                {
                mT__62(); 


                }
                break;
            case 40 :
                // src/com/mbien/opencl/antlr/CL.g:1:244: T__63
                {
                mT__63(); 


                }
                break;
            case 41 :
                // src/com/mbien/opencl/antlr/CL.g:1:250: T__64
                {
                mT__64(); 


                }
                break;
            case 42 :
                // src/com/mbien/opencl/antlr/CL.g:1:256: T__65
                {
                mT__65(); 


                }
                break;
            case 43 :
                // src/com/mbien/opencl/antlr/CL.g:1:262: T__66
                {
                mT__66(); 


                }
                break;
            case 44 :
                // src/com/mbien/opencl/antlr/CL.g:1:268: T__67
                {
                mT__67(); 


                }
                break;
            case 45 :
                // src/com/mbien/opencl/antlr/CL.g:1:274: T__68
                {
                mT__68(); 


                }
                break;
            case 46 :
                // src/com/mbien/opencl/antlr/CL.g:1:280: T__69
                {
                mT__69(); 


                }
                break;
            case 47 :
                // src/com/mbien/opencl/antlr/CL.g:1:286: T__70
                {
                mT__70(); 


                }
                break;
            case 48 :
                // src/com/mbien/opencl/antlr/CL.g:1:292: T__71
                {
                mT__71(); 


                }
                break;
            case 49 :
                // src/com/mbien/opencl/antlr/CL.g:1:298: T__72
                {
                mT__72(); 


                }
                break;
            case 50 :
                // src/com/mbien/opencl/antlr/CL.g:1:304: T__73
                {
                mT__73(); 


                }
                break;
            case 51 :
                // src/com/mbien/opencl/antlr/CL.g:1:310: T__74
                {
                mT__74(); 


                }
                break;
            case 52 :
                // src/com/mbien/opencl/antlr/CL.g:1:316: T__75
                {
                mT__75(); 


                }
                break;
            case 53 :
                // src/com/mbien/opencl/antlr/CL.g:1:322: T__76
                {
                mT__76(); 


                }
                break;
            case 54 :
                // src/com/mbien/opencl/antlr/CL.g:1:328: T__77
                {
                mT__77(); 


                }
                break;
            case 55 :
                // src/com/mbien/opencl/antlr/CL.g:1:334: T__78
                {
                mT__78(); 


                }
                break;
            case 56 :
                // src/com/mbien/opencl/antlr/CL.g:1:340: T__79
                {
                mT__79(); 


                }
                break;
            case 57 :
                // src/com/mbien/opencl/antlr/CL.g:1:346: T__80
                {
                mT__80(); 


                }
                break;
            case 58 :
                // src/com/mbien/opencl/antlr/CL.g:1:352: T__81
                {
                mT__81(); 


                }
                break;
            case 59 :
                // src/com/mbien/opencl/antlr/CL.g:1:358: T__82
                {
                mT__82(); 


                }
                break;
            case 60 :
                // src/com/mbien/opencl/antlr/CL.g:1:364: T__83
                {
                mT__83(); 


                }
                break;
            case 61 :
                // src/com/mbien/opencl/antlr/CL.g:1:370: T__84
                {
                mT__84(); 


                }
                break;
            case 62 :
                // src/com/mbien/opencl/antlr/CL.g:1:376: T__85
                {
                mT__85(); 


                }
                break;
            case 63 :
                // src/com/mbien/opencl/antlr/CL.g:1:382: T__86
                {
                mT__86(); 


                }
                break;
            case 64 :
                // src/com/mbien/opencl/antlr/CL.g:1:388: T__87
                {
                mT__87(); 


                }
                break;
            case 65 :
                // src/com/mbien/opencl/antlr/CL.g:1:394: T__88
                {
                mT__88(); 


                }
                break;
            case 66 :
                // src/com/mbien/opencl/antlr/CL.g:1:400: T__89
                {
                mT__89(); 


                }
                break;
            case 67 :
                // src/com/mbien/opencl/antlr/CL.g:1:406: T__90
                {
                mT__90(); 


                }
                break;
            case 68 :
                // src/com/mbien/opencl/antlr/CL.g:1:412: T__91
                {
                mT__91(); 


                }
                break;
            case 69 :
                // src/com/mbien/opencl/antlr/CL.g:1:418: T__92
                {
                mT__92(); 


                }
                break;
            case 70 :
                // src/com/mbien/opencl/antlr/CL.g:1:424: T__93
                {
                mT__93(); 


                }
                break;
            case 71 :
                // src/com/mbien/opencl/antlr/CL.g:1:430: T__94
                {
                mT__94(); 


                }
                break;
            case 72 :
                // src/com/mbien/opencl/antlr/CL.g:1:436: T__95
                {
                mT__95(); 


                }
                break;
            case 73 :
                // src/com/mbien/opencl/antlr/CL.g:1:442: T__96
                {
                mT__96(); 


                }
                break;
            case 74 :
                // src/com/mbien/opencl/antlr/CL.g:1:448: T__97
                {
                mT__97(); 


                }
                break;
            case 75 :
                // src/com/mbien/opencl/antlr/CL.g:1:454: T__98
                {
                mT__98(); 


                }
                break;
            case 76 :
                // src/com/mbien/opencl/antlr/CL.g:1:460: T__99
                {
                mT__99(); 


                }
                break;
            case 77 :
                // src/com/mbien/opencl/antlr/CL.g:1:466: T__100
                {
                mT__100(); 


                }
                break;
            case 78 :
                // src/com/mbien/opencl/antlr/CL.g:1:473: T__101
                {
                mT__101(); 


                }
                break;
            case 79 :
                // src/com/mbien/opencl/antlr/CL.g:1:480: T__102
                {
                mT__102(); 


                }
                break;
            case 80 :
                // src/com/mbien/opencl/antlr/CL.g:1:487: BUILTIN_TYPE
                {
                mBUILTIN_TYPE(); 


                }
                break;
            case 81 :
                // src/com/mbien/opencl/antlr/CL.g:1:500: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 82 :
                // src/com/mbien/opencl/antlr/CL.g:1:511: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 83 :
                // src/com/mbien/opencl/antlr/CL.g:1:529: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 84 :
                // src/com/mbien/opencl/antlr/CL.g:1:544: HEX_LITERAL
                {
                mHEX_LITERAL(); 


                }
                break;
            case 85 :
                // src/com/mbien/opencl/antlr/CL.g:1:556: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 


                }
                break;
            case 86 :
                // src/com/mbien/opencl/antlr/CL.g:1:572: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 


                }
                break;
            case 87 :
                // src/com/mbien/opencl/antlr/CL.g:1:586: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 


                }
                break;
            case 88 :
                // src/com/mbien/opencl/antlr/CL.g:1:609: WS
                {
                mWS(); 


                }
                break;
            case 89 :
                // src/com/mbien/opencl/antlr/CL.g:1:612: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 90 :
                // src/com/mbien/opencl/antlr/CL.g:1:620: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 91 :
                // src/com/mbien/opencl/antlr/CL.g:1:633: LINE_COMMAND
                {
                mLINE_COMMAND(); 


                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA28_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA28_eofS =
        "\12\uffff";
    static final String DFA28_minS =
        "\2\56\2\uffff\1\53\1\uffff\2\60\2\uffff";
    static final String DFA28_maxS =
        "\1\71\1\146\2\uffff\1\71\1\uffff\1\71\1\146\2\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\1\1\1\uffff\1\4\2\uffff\2\3";
    static final String DFA28_specialS =
        "\12\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
            "",
            "",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "",
            "\12\7",
            "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "519:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix );";
        }
    }
    static final String DFA38_eotS =
        "\1\uffff\1\62\1\64\1\67\2\uffff\1\71\1\74\1\uffff\1\100\1\102\1"+
        "\107\2\uffff\1\112\1\114\1\117\3\uffff\1\121\21\52\1\uffff\1\167"+
        "\5\uffff\2\171\31\uffff\1\175\5\uffff\1\177\3\uffff\7\52\1\u0088"+
        "\7\52\1\u0090\23\52\5\uffff\1\u00a6\1\171\4\uffff\10\52\1\uffff"+
        "\3\52\1\u00b3\3\52\1\uffff\1\u00bd\24\52\1\uffff\1\u00d0\1\u00d1"+
        "\1\52\1\u00d3\2\52\1\u00bd\2\52\1\u00d8\1\u00d9\1\52\1\uffff\2\52"+
        "\1\u00dd\1\52\4\u00bd\1\52\1\uffff\2\52\1\u00bd\13\52\1\u00bd\1"+
        "\u00ee\2\52\2\uffff\1\u00f1\1\uffff\1\u00f3\3\52\2\uffff\1\52\1"+
        "\u00bd\1\52\1\uffff\1\52\1\u00bd\1\52\1\u00fb\10\52\1\u00bd\1\52"+
        "\1\u0105\1\52\1\uffff\1\52\1\u0108\1\uffff\1\52\1\uffff\2\52\1\u00bd"+
        "\1\u010c\1\u010d\1\52\1\u010f\1\uffff\2\52\1\u0112\1\u0113\1\u0114"+
        "\1\u0115\1\u0116\1\u0117\1\52\1\uffff\2\52\1\uffff\2\52\1\u011d"+
        "\2\uffff\1\52\1\uffff\2\52\6\uffff\1\u0121\2\52\1\u0124\1\u0125"+
        "\1\uffff\1\u0126\1\52\1\u0128\1\uffff\1\u0129\1\u012a\3\uffff\1"+
        "\u012b\4\uffff";
    static final String DFA38_eofS =
        "\u012c\uffff";
    static final String DFA38_minS =
        "\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\56\1\52\2\uffff"+
        "\1\74\2\75\3\uffff\1\75\1\165\1\157\1\141\1\145\3\154\1\146\1\145"+
        "\1\157\1\164\1\145\1\150\1\171\1\143\1\157\1\150\1\uffff\1\75\5"+
        "\uffff\2\56\31\uffff\1\75\5\uffff\1\75\3\uffff\1\164\1\157\1\145"+
        "\1\163\1\156\1\141\1\146\1\44\1\163\1\165\1\164\1\162\2\157\1\164"+
        "\1\44\1\164\1\162\1\143\1\162\1\147\1\172\1\141\1\151\1\157\1\160"+
        "\1\151\2\150\1\156\1\157\1\154\1\157\2\151\5\uffff\2\56\4\uffff"+
        "\1\157\1\154\1\141\1\145\1\163\1\162\1\141\1\142\1\uffff\1\145\1"+
        "\155\1\145\1\44\1\141\1\142\1\157\1\uffff\1\44\1\156\1\141\1\147"+
        "\1\144\1\151\1\165\1\145\1\164\1\165\1\164\1\162\1\145\1\157\1\151"+
        "\1\164\1\156\1\165\1\144\1\141\1\154\1\uffff\2\44\1\153\1\44\1\164"+
        "\1\151\1\44\1\165\1\154\2\44\1\162\1\uffff\1\164\1\141\1\44\1\164"+
        "\4\44\1\66\1\uffff\1\145\1\154\1\44\1\151\1\163\1\162\1\137\1\151"+
        "\2\143\1\164\1\144\1\156\1\147\2\44\1\164\1\145\2\uffff\1\44\1\uffff"+
        "\1\44\1\156\1\154\1\145\2\uffff\1\156\1\44\1\154\1\uffff\1\162\1"+
        "\44\1\154\1\44\1\146\1\164\1\156\1\164\1\146\1\143\1\164\1\150\1"+
        "\44\1\145\1\44\1\156\1\uffff\1\151\1\44\1\uffff\1\156\1\uffff\1"+
        "\165\1\164\3\44\1\137\1\44\1\uffff\1\146\1\145\6\44\1\146\1\uffff"+
        "\1\145\1\154\1\uffff\1\164\1\145\1\44\2\uffff\1\164\1\uffff\1\137"+
        "\1\162\6\uffff\1\44\1\144\1\145\2\44\1\uffff\1\44\1\164\1\44\1\uffff"+
        "\2\44\3\uffff\1\44\4\uffff";
    static final String DFA38_maxS =
        "\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\71\1\75\2\uffff\2\75\1\76"+
        "\3\uffff\1\75\1\165\1\162\2\157\1\170\2\157\1\156\1\145\1\157\1"+
        "\164\1\145\1\167\1\171\1\163\1\157\1\150\1\uffff\1\174\5\uffff\1"+
        "\170\1\146\31\uffff\1\75\5\uffff\1\75\3\uffff\1\164\1\157\1\145"+
        "\1\163\1\156\1\141\1\146\1\172\1\163\1\165\1\164\1\162\2\157\1\164"+
        "\1\172\1\164\1\162\1\156\1\162\1\164\1\172\1\162\1\151\1\157\1\160"+
        "\1\163\2\150\1\156\1\157\1\154\1\157\1\154\1\151\5\uffff\2\146\4"+
        "\uffff\1\157\1\154\1\141\1\145\1\164\1\162\1\141\1\142\1\uffff\1"+
        "\145\1\155\1\145\1\172\1\141\1\142\1\157\1\uffff\1\172\1\156\1\141"+
        "\1\147\1\144\1\151\1\165\1\145\1\164\1\165\1\164\1\162\1\145\1\157"+
        "\1\151\1\164\1\156\1\165\1\144\1\141\1\154\1\uffff\2\172\1\153\1"+
        "\172\1\164\1\151\1\172\1\165\1\154\2\172\1\162\1\uffff\1\164\1\141"+
        "\1\172\1\164\4\172\1\66\1\uffff\1\145\1\154\1\172\1\151\1\163\1"+
        "\162\1\157\1\151\2\143\1\164\1\144\1\156\1\147\2\172\1\164\1\145"+
        "\2\uffff\1\172\1\uffff\1\172\1\156\1\154\1\145\2\uffff\1\156\1\172"+
        "\1\154\1\uffff\1\162\1\172\1\154\1\172\1\146\1\164\1\156\1\164\1"+
        "\146\1\143\1\164\1\150\1\172\1\145\1\172\1\156\1\uffff\1\151\1\172"+
        "\1\uffff\1\156\1\uffff\1\165\1\164\3\172\1\137\1\172\1\uffff\1\146"+
        "\1\145\6\172\1\146\1\uffff\1\145\1\154\1\uffff\1\164\1\145\1\172"+
        "\2\uffff\1\164\1\uffff\1\137\1\162\6\uffff\1\172\1\144\1\145\2\172"+
        "\1\uffff\1\172\1\164\1\172\1\uffff\2\172\3\uffff\1\172\4\uffff";
    static final String DFA38_acceptS =
        "\4\uffff\1\10\1\11\2\uffff\1\17\3\uffff\1\30\1\31\3\uffff\1\44\1"+
        "\45\1\46\22\uffff\1\112\1\uffff\1\116\1\117\1\121\1\122\1\123\2"+
        "\uffff\1\130\1\133\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1"+
        "\16\1\14\1\21\1\22\1\23\1\20\1\25\1\24\1\127\1\27\1\131\1\132\1"+
        "\26\1\uffff\1\35\1\32\1\37\1\36\1\41\1\uffff\1\40\1\50\1\47\43\uffff"+
        "\1\114\1\115\1\113\1\124\1\125\2\uffff\1\34\1\33\1\43\1\42\10\uffff"+
        "\1\61\7\uffff\1\70\25\uffff\1\126\14\uffff\1\65\11\uffff\1\120\22"+
        "\uffff\1\51\1\52\1\uffff\1\54\4\uffff\1\62\1\63\3\uffff\1\67\20"+
        "\uffff\1\107\2\uffff\1\53\1\uffff\1\55\7\uffff\1\73\11\uffff\1\105"+
        "\2\uffff\1\111\3\uffff\1\64\1\66\1\uffff\1\72\2\uffff\1\76\1\77"+
        "\1\100\1\101\1\102\1\103\5\uffff\1\60\3\uffff\1\104\2\uffff\1\56"+
        "\1\57\1\71\1\uffff\1\75\1\106\1\110\1\74";
    static final String DFA38_specialS =
        "\u012c\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\57\1\uffff\2\57\22\uffff\1\57\1\1\1\54\1\60\1\52\1\2\1\3"+
            "\1\53\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\55\11\56\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\uffff\32\52\1\22\1\uffff\1\23\1\24"+
            "\1\52\1\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\52\1\34\1"+
            "\52\1\35\1\36\3\52\1\37\1\52\1\40\1\41\1\42\1\43\1\44\1\45\3"+
            "\52\1\46\1\47\1\50\1\51",
            "\1\61",
            "\1\63",
            "\1\65\26\uffff\1\66",
            "",
            "",
            "\1\70",
            "\1\72\21\uffff\1\73",
            "",
            "\1\75\17\uffff\1\76\1\77",
            "\1\101\1\uffff\12\103",
            "\1\105\4\uffff\1\106\15\uffff\1\104",
            "",
            "",
            "\1\110\1\111",
            "\1\113",
            "\1\115\1\116",
            "",
            "",
            "",
            "\1\120",
            "\1\122",
            "\1\123\2\uffff\1\124",
            "\1\125\6\uffff\1\127\6\uffff\1\126",
            "\1\130\11\uffff\1\131",
            "\1\132\1\uffff\1\133\11\uffff\1\134",
            "\1\136\2\uffff\1\135",
            "\1\137\2\uffff\1\140",
            "\1\141\7\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\152\1\147\12\uffff\1\150\2\uffff\1\151",
            "\1\153",
            "\1\155\1\162\1\uffff\1\161\2\uffff\1\157\2\uffff\1\160\1\uffff"+
            "\1\154\4\uffff\1\156",
            "\1\163",
            "\1\164",
            "",
            "\1\165\76\uffff\1\166",
            "",
            "",
            "",
            "",
            "",
            "\1\103\1\uffff\10\172\2\103\12\uffff\3\103\21\uffff\1\170\13"+
            "\uffff\3\103\21\uffff\1\170",
            "\1\103\1\uffff\12\173\12\uffff\3\103\35\uffff\3\103",
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
            "\1\174",
            "",
            "",
            "",
            "",
            "",
            "\1\176",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24"+
            "\52\1\u0087\5\52",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\12\uffff\1\u0094",
            "\1\u0095",
            "\1\u0096\14\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099\20\uffff\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\11\uffff\1\u009f",
            "\1\127",
            "\1\152",
            "\1\u00a0",
            "\1\u00a1",
            "\1\136",
            "\1\u00a2",
            "\1\u00a3\2\uffff\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "\1\103\1\uffff\10\172\2\103\12\uffff\3\103\35\uffff\3\103",
            "\1\103\1\uffff\12\173\12\uffff\3\103\35\uffff\3\103",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\u00b7"+
            "\12\52",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u0094",
            "\1\u0087",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00d2",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00d4",
            "\1\u00d5",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d6",
            "\1\u00d7",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00de",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5\17\uffff\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00f2"+
            "\31\52",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "\1\u00f7",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00fa",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0104",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\52\13\uffff\1\52\1\u00bc\1\u00b8\1\u00b9\1\u00ba\3\52\1"+
            "\u00bb\1\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u010e",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u0122",
            "\1\u0123",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\u0127",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "",
            "",
            "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | BUILTIN_TYPE | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
        }
    }
 

}