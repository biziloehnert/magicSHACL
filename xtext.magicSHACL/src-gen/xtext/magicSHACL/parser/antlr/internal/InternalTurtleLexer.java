package xtext.magicSHACL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleLexer extends Lexer {
    public static final int RULE_PREFIX=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_UNICODE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalTurtleLexer() {;} 
    public InternalTurtleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTurtleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTurtle.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:11:7: ( '<>' )
            // InternalTurtle.g:11:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:12:7: ( '.' )
            // InternalTurtle.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:13:7: ( '@prefix' )
            // InternalTurtle.g:13:9: '@prefix'
            {
            match("@prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:14:7: ( '<' )
            // InternalTurtle.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:15:7: ( '>' )
            // InternalTurtle.g:15:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:16:7: ( ';' )
            // InternalTurtle.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:17:7: ( 'a' )
            // InternalTurtle.g:17:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:18:7: ( 'sh:NodeShape' )
            // InternalTurtle.g:18:9: 'sh:NodeShape'
            {
            match("sh:NodeShape"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:19:7: ( '[' )
            // InternalTurtle.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:20:7: ( 'sh:property' )
            // InternalTurtle.g:20:9: 'sh:property'
            {
            match("sh:property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:21:7: ( 'sh:path' )
            // InternalTurtle.g:21:9: 'sh:path'
            {
            match("sh:path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:22:7: ( ']' )
            // InternalTurtle.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:23:7: ( '(' )
            // InternalTurtle.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:24:7: ( ')' )
            // InternalTurtle.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:25:7: ( 'sh:minCount' )
            // InternalTurtle.g:25:9: 'sh:minCount'
            {
            match("sh:minCount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:26:7: ( 'sh:maxCount' )
            // InternalTurtle.g:26:9: 'sh:maxCount'
            {
            match("sh:maxCount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:27:7: ( 'sh:and' )
            // InternalTurtle.g:27:9: 'sh:and'
            {
            match("sh:and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:28:7: ( 'sh:or' )
            // InternalTurtle.g:28:9: 'sh:or'
            {
            match("sh:or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:29:7: ( 'sh:not' )
            // InternalTurtle.g:29:9: 'sh:not'
            {
            match("sh:not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:30:7: ( 'sh:class' )
            // InternalTurtle.g:30:9: 'sh:class'
            {
            match("sh:class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:31:7: ( 'sh:hasValue' )
            // InternalTurtle.g:31:9: 'sh:hasValue'
            {
            match("sh:hasValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:32:7: ( 'sh:nodeKind' )
            // InternalTurtle.g:32:9: 'sh:nodeKind'
            {
            match("sh:nodeKind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:33:7: ( 'sh:node' )
            // InternalTurtle.g:33:9: 'sh:node'
            {
            match("sh:node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:34:7: ( 'sh:datatype' )
            // InternalTurtle.g:34:9: 'sh:datatype'
            {
            match("sh:datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:35:7: ( 'sh:pattern' )
            // InternalTurtle.g:35:9: 'sh:pattern'
            {
            match("sh:pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:36:7: ( 'sh:closed' )
            // InternalTurtle.g:36:9: 'sh:closed'
            {
            match("sh:closed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:37:7: ( 'sh:ignoredProperties' )
            // InternalTurtle.g:37:9: 'sh:ignoredProperties'
            {
            match("sh:ignoredProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:38:7: ( 'sh:inversePath' )
            // InternalTurtle.g:38:9: 'sh:inversePath'
            {
            match("sh:inversePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:39:7: ( 'sh:name' )
            // InternalTurtle.g:39:9: 'sh:name'
            {
            match("sh:name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:40:7: ( 'sh:targetClass' )
            // InternalTurtle.g:40:9: 'sh:targetClass'
            {
            match("sh:targetClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:41:7: ( 'sh:targetNode' )
            // InternalTurtle.g:41:9: 'sh:targetNode'
            {
            match("sh:targetNode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_PREFIX"
    public final void mRULE_PREFIX() throws RecognitionException {
        try {
            int _type = RULE_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1248:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* ':' )
            // InternalTurtle.g:1248:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* ':'
            {
            // InternalTurtle.g:1248:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtle.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFIX"

    // $ANTLR start "RULE_UNICODE"
    public final void mRULE_UNICODE() throws RecognitionException {
        try {
            int _type = RULE_UNICODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1250:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '^' | '{' | '}' | '\\\\' | '$' )* )
            // InternalTurtle.g:1250:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '^' | '{' | '}' | '\\\\' | '$' )*
            {
            // InternalTurtle.g:1250:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '^' | '{' | '}' | '\\\\' | '$' )*
            loop2:
            do {
                int alt2=16;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalTurtle.g:1250:17: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalTurtle.g:1250:26: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalTurtle.g:1250:35: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalTurtle.g:1250:44: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalTurtle.g:1250:48: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalTurtle.g:1250:52: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalTurtle.g:1250:56: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalTurtle.g:1250:60: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalTurtle.g:1250:64: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 10 :
            	    // InternalTurtle.g:1250:68: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;
            	case 11 :
            	    // InternalTurtle.g:1250:72: '^'
            	    {
            	    match('^'); 

            	    }
            	    break;
            	case 12 :
            	    // InternalTurtle.g:1250:76: '{'
            	    {
            	    match('{'); 

            	    }
            	    break;
            	case 13 :
            	    // InternalTurtle.g:1250:80: '}'
            	    {
            	    match('}'); 

            	    }
            	    break;
            	case 14 :
            	    // InternalTurtle.g:1250:84: '\\\\'
            	    {
            	    match('\\'); 

            	    }
            	    break;
            	case 15 :
            	    // InternalTurtle.g:1250:89: '$'
            	    {
            	    match('$'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1252:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTurtle.g:1252:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTurtle.g:1252:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:1252:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTurtle.g:1252:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTurtle.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalTurtle.g:1254:19: ( ( '0' .. '9' )+ )
            // InternalTurtle.g:1254:21: ( '0' .. '9' )+
            {
            // InternalTurtle.g:1254:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:1254:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1256:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTurtle.g:1256:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTurtle.g:1256:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtle.g:1256:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTurtle.g:1256:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTurtle.g:1256:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:1256:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1256:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTurtle.g:1256:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTurtle.g:1256:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:1256:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1258:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTurtle.g:1258:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTurtle.g:1258:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTurtle.g:1258:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1260:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTurtle.g:1260:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTurtle.g:1260:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTurtle.g:1260:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTurtle.g:1260:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTurtle.g:1260:41: ( '\\r' )? '\\n'
                    {
                    // InternalTurtle.g:1260:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTurtle.g:1260:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1262:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTurtle.g:1262:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTurtle.g:1262:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTurtle.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:1264:16: ( . )
            // InternalTurtle.g:1264:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTurtle.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_PREFIX | RULE_UNICODE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=39;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTurtle.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTurtle.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTurtle.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTurtle.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTurtle.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTurtle.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTurtle.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTurtle.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTurtle.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalTurtle.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalTurtle.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalTurtle.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalTurtle.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalTurtle.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalTurtle.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalTurtle.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalTurtle.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalTurtle.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalTurtle.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalTurtle.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalTurtle.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalTurtle.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalTurtle.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalTurtle.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalTurtle.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalTurtle.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalTurtle.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalTurtle.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalTurtle.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalTurtle.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalTurtle.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalTurtle.g:1:196: RULE_PREFIX
                {
                mRULE_PREFIX(); 

                }
                break;
            case 33 :
                // InternalTurtle.g:1:208: RULE_UNICODE
                {
                mRULE_UNICODE(); 

                }
                break;
            case 34 :
                // InternalTurtle.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalTurtle.g:1:229: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalTurtle.g:1:241: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalTurtle.g:1:257: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalTurtle.g:1:273: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalTurtle.g:1:281: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\1\1\20\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\42\20\uffff";
    static final String DFA2_maxS =
        "\1\175\20\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\13\1\7\1\20\10\uffff\1\12\1\11\1\10\12\4\1\6\6\uffff\32\3\1\uffff\1\17\1\uffff\1\14\1\5\1\uffff\32\2\1\15\1\uffff\1\16",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 1250:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '^' | '{' | '}' | '\\\\' | '$' )*";
        }
    }
    static final String DFA14_eotS =
        "\1\32\1\37\1\40\1\35\2\uffff\1\44\1\32\4\uffff\1\32\1\57\2\32\2\uffff\1\32\1\uffff\2\32\5\uffff\1\35\11\uffff\4\32\1\57\1\32\6\uffff\12\32\1\uffff\5\32\1\uffff\3\32\1\uffff\3\32\1\57\1\32\1\uffff\56\32\1\u0089\15\32\1\u009a\1\uffff\1\u009b\13\32\1\u00a7\3\32\2\uffff\1\u00ac\1\u00ad\11\32\1\uffff\4\32\2\uffff\1\u00bb\14\32\1\uffff\1\u00c8\7\32\1\u00d1\3\32\1\uffff\7\32\1\u00dc\1\uffff\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\4\32\1\u00e6\6\uffff\4\32\1\uffff\3\32\1\u00ee\1\32\1\u00f0\1\u00f1\1\uffff\1\32\2\uffff\4\32\1\u00f7\1\uffff";
    static final String DFA14_eofS =
        "\u00f8\uffff";
    static final String DFA14_minS =
        "\1\0\1\76\1\42\1\160\2\uffff\1\42\1\60\4\uffff\1\60\1\42\2\60\2\uffff\1\52\1\uffff\1\0\1\101\5\uffff\1\0\11\uffff\4\60\1\42\1\60\6\uffff\12\0\1\uffff\5\0\1\uffff\3\60\1\uffff\3\60\1\42\1\0\1\uffff\35\0\1\157\2\141\1\156\1\162\1\141\1\154\2\141\1\147\1\141\1\144\1\157\1\164\1\156\1\170\1\144\1\42\1\144\1\155\1\141\1\163\1\164\1\156\1\166\1\162\1\145\1\160\1\150\2\103\1\42\1\uffff\1\42\2\145\2\163\1\126\1\141\1\157\1\145\1\147\1\123\1\145\1\42\1\145\2\157\2\uffff\2\42\1\163\1\145\1\141\1\164\2\162\1\145\1\150\1\162\1\uffff\1\162\2\165\1\151\2\uffff\1\42\1\144\1\154\1\171\1\145\1\163\1\164\1\141\1\164\4\156\1\uffff\1\42\1\165\1\160\1\144\1\145\1\103\1\160\1\171\1\42\2\164\1\144\1\uffff\2\145\2\120\1\154\1\157\1\145\1\42\1\uffff\5\42\1\162\2\141\1\144\1\42\6\uffff\1\157\1\164\1\163\1\145\1\uffff\1\160\1\150\1\163\1\42\1\145\2\42\1\uffff\1\162\2\uffff\1\164\1\151\1\145\1\163\1\42\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\76\1\175\1\160\2\uffff\1\175\1\172\4\uffff\1\172\1\175\2\172\2\uffff\1\57\1\uffff\1\uffff\1\172\5\uffff\1\uffff\11\uffff\4\172\1\175\1\172\6\uffff\12\uffff\1\uffff\5\uffff\1\uffff\3\172\1\uffff\3\172\1\175\1\uffff\1\uffff\35\uffff\1\157\1\162\1\151\1\156\1\162\1\157\1\154\2\141\1\156\1\141\1\144\1\157\1\164\1\156\1\170\1\144\1\175\1\164\1\155\1\157\1\163\1\164\1\156\1\166\1\162\1\145\1\160\1\164\2\103\1\175\1\uffff\1\175\2\145\2\163\1\126\1\141\1\157\1\145\1\147\1\123\1\145\1\175\1\145\2\157\2\uffff\2\175\1\163\1\145\1\141\1\164\2\162\1\145\1\150\1\162\1\uffff\1\162\2\165\1\151\2\uffff\1\175\1\144\1\154\1\171\1\145\1\163\1\164\1\141\1\164\4\156\1\uffff\1\175\1\165\1\160\1\144\1\145\1\116\1\160\1\171\1\175\2\164\1\144\1\uffff\2\145\2\120\1\154\1\157\1\145\1\175\1\uffff\5\175\1\162\2\141\1\144\1\175\6\uffff\1\157\1\164\1\163\1\145\1\uffff\1\160\1\150\1\163\1\175\1\145\2\175\1\uffff\1\162\2\uffff\1\164\1\151\1\145\1\163\1\175\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\5\1\6\2\uffff\1\11\1\14\1\15\1\16\4\uffff\2\41\1\uffff\1\41\2\uffff\5\41\1\uffff\1\46\1\47\1\1\1\4\1\2\1\3\1\5\1\6\1\7\6\uffff\1\11\1\14\1\15\1\16\1\40\1\44\12\uffff\1\41\5\uffff\1\43\3\uffff\1\46\5\uffff\1\45\75\uffff\1\22\20\uffff\1\21\1\23\13\uffff\1\13\4\uffff\1\27\1\35\15\uffff\1\24\14\uffff\1\32\10\uffff\1\31\12\uffff\1\12\1\17\1\20\1\26\1\25\1\30\4\uffff\1\10\7\uffff\1\37\1\uffff\1\34\1\36\5\uffff\1\33";
    static final String DFA14_specialS =
        "\1\50\23\uffff\1\35\6\uffff\1\0\25\uffff\1\57\1\3\1\5\1\34\1\10\1\12\1\14\1\16\1\20\1\22\1\uffff\1\25\1\27\1\31\1\56\1\33\11\uffff\1\36\1\uffff\1\37\1\55\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\51\1\52\1\53\1\54\1\1\1\2\1\32\1\4\1\6\1\7\1\11\1\13\1\15\1\17\1\21\1\23\1\24\1\26\1\30\u008f\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\24\1\21\1\31\2\35\1\33\1\12\1\13\3\35\1\23\1\2\1\22\12\20\1\15\1\5\1\1\1\35\1\4\1\35\1\3\32\16\1\10\1\30\1\11\1\25\1\17\1\35\1\6\21\14\1\7\7\14\1\26\1\35\1\27\uff82\35",
            "\1\36",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\41",
            "",
            "",
            "\3\32\10\uffff\3\32\12\47\1\51\6\uffff\32\46\1\uffff\1\32\1\uffff\1\32\1\50\1\uffff\32\45\1\32\1\uffff\1\32",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\7\45\1\52\22\45",
            "",
            "",
            "",
            "",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\32\103\4\uffff\1\104\1\uffff\32\102",
            "",
            "",
            "",
            "",
            "",
            "\0\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\12\47\1\51\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\12\47\1\111\6\uffff\32\46\4\uffff\1\50\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\143\1\137\1\150\10\101\1\142\1\141\1\140\12\134\1\136\6\101\32\133\1\101\1\147\1\101\1\144\1\135\1\101\32\132\1\145\1\101\1\146\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\12\47\7\uffff\32\107\4\uffff\1\110\1\uffff\32\106",
            "\3\32\10\uffff\16\32\6\uffff\15\32\1\151\14\32\1\uffff\1\32\1\uffff\2\32\1\uffff\1\154\1\32\1\157\1\161\3\32\1\160\1\162\3\32\1\153\1\156\1\155\1\152\3\32\1\163\7\32\1\uffff\1\32",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\113\1\124\1\120\1\131\10\113\1\123\1\122\1\121\12\115\1\117\6\113\32\114\1\113\1\130\1\113\1\125\1\116\1\113\32\112\1\126\1\113\1\127\uff82\113",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\42\101\1\73\1\67\1\100\10\101\1\72\1\71\1\70\12\64\1\66\6\101\32\63\1\101\1\77\1\101\1\74\1\65\1\101\32\62\1\75\1\101\1\76\uff82\101",
            "\1\164",
            "\1\166\20\uffff\1\165",
            "\1\170\7\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\174\15\uffff\1\173",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080\6\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u008b\17\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d\15\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\13\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "\3\32\10\uffff\16\32\6\uffff\12\32\1\u00ab\17\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00bc",
            "\1\u00bd",
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
            "",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\12\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\1\u00ef",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            "",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\3\32\10\uffff\16\32\6\uffff\32\32\1\uffff\1\32\1\uffff\2\32\1\uffff\33\32\1\uffff\1\32",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_PREFIX | RULE_UNICODE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 65;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_90 = input.LA(1);

                        s = -1;
                        if ( (LA14_90=='\"') ) {s = 59;}

                        else if ( (LA14_90=='\\') ) {s = 63;}

                        else if ( ((LA14_90>='a' && LA14_90<='z')) ) {s = 50;}

                        else if ( ((LA14_90>='A' && LA14_90<='Z')) ) {s = 51;}

                        else if ( ((LA14_90>='0' && LA14_90<='9')) ) {s = 52;}

                        else if ( (LA14_90=='_') ) {s = 53;}

                        else if ( (LA14_90==':') ) {s = 54;}

                        else if ( (LA14_90=='#') ) {s = 55;}

                        else if ( (LA14_90=='/') ) {s = 56;}

                        else if ( (LA14_90=='.') ) {s = 57;}

                        else if ( (LA14_90=='-') ) {s = 58;}

                        else if ( (LA14_90=='^') ) {s = 60;}

                        else if ( (LA14_90=='{') ) {s = 61;}

                        else if ( (LA14_90=='}') ) {s = 62;}

                        else if ( (LA14_90=='$') ) {s = 64;}

                        else if ( ((LA14_90>='\u0000' && LA14_90<='!')||(LA14_90>='%' && LA14_90<=',')||(LA14_90>=';' && LA14_90<='@')||LA14_90=='['||LA14_90==']'||LA14_90=='`'||LA14_90=='|'||(LA14_90>='~' && LA14_90<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_91 = input.LA(1);

                        s = -1;
                        if ( (LA14_91=='\"') ) {s = 59;}

                        else if ( (LA14_91=='\\') ) {s = 63;}

                        else if ( ((LA14_91>='a' && LA14_91<='z')) ) {s = 50;}

                        else if ( ((LA14_91>='A' && LA14_91<='Z')) ) {s = 51;}

                        else if ( ((LA14_91>='0' && LA14_91<='9')) ) {s = 52;}

                        else if ( (LA14_91=='_') ) {s = 53;}

                        else if ( (LA14_91==':') ) {s = 54;}

                        else if ( (LA14_91=='#') ) {s = 55;}

                        else if ( (LA14_91=='/') ) {s = 56;}

                        else if ( (LA14_91=='.') ) {s = 57;}

                        else if ( (LA14_91=='-') ) {s = 58;}

                        else if ( (LA14_91=='^') ) {s = 60;}

                        else if ( (LA14_91=='{') ) {s = 61;}

                        else if ( (LA14_91=='}') ) {s = 62;}

                        else if ( (LA14_91=='$') ) {s = 64;}

                        else if ( ((LA14_91>='\u0000' && LA14_91<='!')||(LA14_91>='%' && LA14_91<=',')||(LA14_91>=';' && LA14_91<='@')||LA14_91=='['||LA14_91==']'||LA14_91=='`'||LA14_91=='|'||(LA14_91>='~' && LA14_91<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( ((LA14_50>='a' && LA14_50<='z')) ) {s = 50;}

                        else if ( ((LA14_50>='A' && LA14_50<='Z')) ) {s = 51;}

                        else if ( ((LA14_50>='0' && LA14_50<='9')) ) {s = 52;}

                        else if ( (LA14_50=='_') ) {s = 53;}

                        else if ( (LA14_50==':') ) {s = 54;}

                        else if ( (LA14_50=='#') ) {s = 55;}

                        else if ( (LA14_50=='/') ) {s = 56;}

                        else if ( (LA14_50=='.') ) {s = 57;}

                        else if ( (LA14_50=='-') ) {s = 58;}

                        else if ( (LA14_50=='\"') ) {s = 59;}

                        else if ( (LA14_50=='^') ) {s = 60;}

                        else if ( (LA14_50=='{') ) {s = 61;}

                        else if ( (LA14_50=='}') ) {s = 62;}

                        else if ( (LA14_50=='\\') ) {s = 63;}

                        else if ( (LA14_50=='$') ) {s = 64;}

                        else if ( ((LA14_50>='\u0000' && LA14_50<='!')||(LA14_50>='%' && LA14_50<=',')||(LA14_50>=';' && LA14_50<='@')||LA14_50=='['||LA14_50==']'||LA14_50=='`'||LA14_50=='|'||(LA14_50>='~' && LA14_50<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_93 = input.LA(1);

                        s = -1;
                        if ( (LA14_93=='\"') ) {s = 59;}

                        else if ( (LA14_93=='\\') ) {s = 63;}

                        else if ( ((LA14_93>='a' && LA14_93<='z')) ) {s = 50;}

                        else if ( ((LA14_93>='A' && LA14_93<='Z')) ) {s = 51;}

                        else if ( ((LA14_93>='0' && LA14_93<='9')) ) {s = 52;}

                        else if ( (LA14_93=='_') ) {s = 53;}

                        else if ( (LA14_93==':') ) {s = 54;}

                        else if ( (LA14_93=='#') ) {s = 55;}

                        else if ( (LA14_93=='/') ) {s = 56;}

                        else if ( (LA14_93=='.') ) {s = 57;}

                        else if ( (LA14_93=='-') ) {s = 58;}

                        else if ( (LA14_93=='^') ) {s = 60;}

                        else if ( (LA14_93=='{') ) {s = 61;}

                        else if ( (LA14_93=='}') ) {s = 62;}

                        else if ( (LA14_93=='$') ) {s = 64;}

                        else if ( ((LA14_93>='\u0000' && LA14_93<='!')||(LA14_93>='%' && LA14_93<=',')||(LA14_93>=';' && LA14_93<='@')||LA14_93=='['||LA14_93==']'||LA14_93=='`'||LA14_93=='|'||(LA14_93>='~' && LA14_93<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( ((LA14_51>='a' && LA14_51<='z')) ) {s = 50;}

                        else if ( ((LA14_51>='A' && LA14_51<='Z')) ) {s = 51;}

                        else if ( ((LA14_51>='0' && LA14_51<='9')) ) {s = 52;}

                        else if ( (LA14_51=='_') ) {s = 53;}

                        else if ( (LA14_51==':') ) {s = 54;}

                        else if ( (LA14_51=='#') ) {s = 55;}

                        else if ( (LA14_51=='/') ) {s = 56;}

                        else if ( (LA14_51=='.') ) {s = 57;}

                        else if ( (LA14_51=='-') ) {s = 58;}

                        else if ( (LA14_51=='\"') ) {s = 59;}

                        else if ( (LA14_51=='^') ) {s = 60;}

                        else if ( (LA14_51=='{') ) {s = 61;}

                        else if ( (LA14_51=='}') ) {s = 62;}

                        else if ( (LA14_51=='\\') ) {s = 63;}

                        else if ( (LA14_51=='$') ) {s = 64;}

                        else if ( ((LA14_51>='\u0000' && LA14_51<='!')||(LA14_51>='%' && LA14_51<=',')||(LA14_51>=';' && LA14_51<='@')||LA14_51=='['||LA14_51==']'||LA14_51=='`'||LA14_51=='|'||(LA14_51>='~' && LA14_51<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_94 = input.LA(1);

                        s = -1;
                        if ( (LA14_94=='\"') ) {s = 59;}

                        else if ( (LA14_94=='\\') ) {s = 63;}

                        else if ( ((LA14_94>='a' && LA14_94<='z')) ) {s = 50;}

                        else if ( ((LA14_94>='A' && LA14_94<='Z')) ) {s = 51;}

                        else if ( ((LA14_94>='0' && LA14_94<='9')) ) {s = 52;}

                        else if ( (LA14_94=='_') ) {s = 53;}

                        else if ( (LA14_94==':') ) {s = 54;}

                        else if ( (LA14_94=='#') ) {s = 55;}

                        else if ( (LA14_94=='/') ) {s = 56;}

                        else if ( (LA14_94=='.') ) {s = 57;}

                        else if ( (LA14_94=='-') ) {s = 58;}

                        else if ( (LA14_94=='^') ) {s = 60;}

                        else if ( (LA14_94=='{') ) {s = 61;}

                        else if ( (LA14_94=='}') ) {s = 62;}

                        else if ( (LA14_94=='$') ) {s = 64;}

                        else if ( ((LA14_94>='\u0000' && LA14_94<='!')||(LA14_94>='%' && LA14_94<=',')||(LA14_94>=';' && LA14_94<='@')||LA14_94=='['||LA14_94==']'||LA14_94=='`'||LA14_94=='|'||(LA14_94>='~' && LA14_94<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_95 = input.LA(1);

                        s = -1;
                        if ( (LA14_95=='\"') ) {s = 59;}

                        else if ( (LA14_95=='\\') ) {s = 63;}

                        else if ( ((LA14_95>='a' && LA14_95<='z')) ) {s = 50;}

                        else if ( ((LA14_95>='A' && LA14_95<='Z')) ) {s = 51;}

                        else if ( ((LA14_95>='0' && LA14_95<='9')) ) {s = 52;}

                        else if ( (LA14_95=='_') ) {s = 53;}

                        else if ( (LA14_95==':') ) {s = 54;}

                        else if ( (LA14_95=='#') ) {s = 55;}

                        else if ( (LA14_95=='/') ) {s = 56;}

                        else if ( (LA14_95=='.') ) {s = 57;}

                        else if ( (LA14_95=='-') ) {s = 58;}

                        else if ( (LA14_95=='^') ) {s = 60;}

                        else if ( (LA14_95=='{') ) {s = 61;}

                        else if ( (LA14_95=='}') ) {s = 62;}

                        else if ( (LA14_95=='$') ) {s = 64;}

                        else if ( ((LA14_95>='\u0000' && LA14_95<='!')||(LA14_95>='%' && LA14_95<=',')||(LA14_95>=';' && LA14_95<='@')||LA14_95=='['||LA14_95==']'||LA14_95=='`'||LA14_95=='|'||(LA14_95>='~' && LA14_95<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( ((LA14_53>='a' && LA14_53<='z')) ) {s = 50;}

                        else if ( ((LA14_53>='A' && LA14_53<='Z')) ) {s = 51;}

                        else if ( ((LA14_53>='0' && LA14_53<='9')) ) {s = 52;}

                        else if ( (LA14_53=='_') ) {s = 53;}

                        else if ( (LA14_53==':') ) {s = 54;}

                        else if ( (LA14_53=='#') ) {s = 55;}

                        else if ( (LA14_53=='/') ) {s = 56;}

                        else if ( (LA14_53=='.') ) {s = 57;}

                        else if ( (LA14_53=='-') ) {s = 58;}

                        else if ( (LA14_53=='\"') ) {s = 59;}

                        else if ( (LA14_53=='^') ) {s = 60;}

                        else if ( (LA14_53=='{') ) {s = 61;}

                        else if ( (LA14_53=='}') ) {s = 62;}

                        else if ( (LA14_53=='\\') ) {s = 63;}

                        else if ( (LA14_53=='$') ) {s = 64;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='!')||(LA14_53>='%' && LA14_53<=',')||(LA14_53>=';' && LA14_53<='@')||LA14_53=='['||LA14_53==']'||LA14_53=='`'||LA14_53=='|'||(LA14_53>='~' && LA14_53<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_96 = input.LA(1);

                        s = -1;
                        if ( (LA14_96=='\"') ) {s = 59;}

                        else if ( (LA14_96=='\\') ) {s = 63;}

                        else if ( ((LA14_96>='a' && LA14_96<='z')) ) {s = 50;}

                        else if ( ((LA14_96>='A' && LA14_96<='Z')) ) {s = 51;}

                        else if ( ((LA14_96>='0' && LA14_96<='9')) ) {s = 52;}

                        else if ( (LA14_96=='_') ) {s = 53;}

                        else if ( (LA14_96==':') ) {s = 54;}

                        else if ( (LA14_96=='#') ) {s = 55;}

                        else if ( (LA14_96=='/') ) {s = 56;}

                        else if ( (LA14_96=='.') ) {s = 57;}

                        else if ( (LA14_96=='-') ) {s = 58;}

                        else if ( (LA14_96=='^') ) {s = 60;}

                        else if ( (LA14_96=='{') ) {s = 61;}

                        else if ( (LA14_96=='}') ) {s = 62;}

                        else if ( (LA14_96=='$') ) {s = 64;}

                        else if ( ((LA14_96>='\u0000' && LA14_96<='!')||(LA14_96>='%' && LA14_96<=',')||(LA14_96>=';' && LA14_96<='@')||LA14_96=='['||LA14_96==']'||LA14_96=='`'||LA14_96=='|'||(LA14_96>='~' && LA14_96<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_54 = input.LA(1);

                        s = -1;
                        if ( (LA14_54=='\"') ) {s = 59;}

                        else if ( (LA14_54=='\\') ) {s = 63;}

                        else if ( ((LA14_54>='a' && LA14_54<='z')) ) {s = 50;}

                        else if ( ((LA14_54>='A' && LA14_54<='Z')) ) {s = 51;}

                        else if ( ((LA14_54>='0' && LA14_54<='9')) ) {s = 52;}

                        else if ( (LA14_54=='_') ) {s = 53;}

                        else if ( (LA14_54==':') ) {s = 54;}

                        else if ( (LA14_54=='#') ) {s = 55;}

                        else if ( (LA14_54=='/') ) {s = 56;}

                        else if ( (LA14_54=='.') ) {s = 57;}

                        else if ( (LA14_54=='-') ) {s = 58;}

                        else if ( (LA14_54=='^') ) {s = 60;}

                        else if ( (LA14_54=='{') ) {s = 61;}

                        else if ( (LA14_54=='}') ) {s = 62;}

                        else if ( (LA14_54=='$') ) {s = 64;}

                        else if ( ((LA14_54>='\u0000' && LA14_54<='!')||(LA14_54>='%' && LA14_54<=',')||(LA14_54>=';' && LA14_54<='@')||LA14_54=='['||LA14_54==']'||LA14_54=='`'||LA14_54=='|'||(LA14_54>='~' && LA14_54<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_97 = input.LA(1);

                        s = -1;
                        if ( (LA14_97=='\"') ) {s = 59;}

                        else if ( (LA14_97=='\\') ) {s = 63;}

                        else if ( ((LA14_97>='a' && LA14_97<='z')) ) {s = 50;}

                        else if ( ((LA14_97>='A' && LA14_97<='Z')) ) {s = 51;}

                        else if ( ((LA14_97>='0' && LA14_97<='9')) ) {s = 52;}

                        else if ( (LA14_97=='_') ) {s = 53;}

                        else if ( (LA14_97==':') ) {s = 54;}

                        else if ( (LA14_97=='#') ) {s = 55;}

                        else if ( (LA14_97=='/') ) {s = 56;}

                        else if ( (LA14_97=='.') ) {s = 57;}

                        else if ( (LA14_97=='-') ) {s = 58;}

                        else if ( (LA14_97=='^') ) {s = 60;}

                        else if ( (LA14_97=='{') ) {s = 61;}

                        else if ( (LA14_97=='}') ) {s = 62;}

                        else if ( (LA14_97=='$') ) {s = 64;}

                        else if ( ((LA14_97>='\u0000' && LA14_97<='!')||(LA14_97>='%' && LA14_97<=',')||(LA14_97>=';' && LA14_97<='@')||LA14_97=='['||LA14_97==']'||LA14_97=='`'||LA14_97=='|'||(LA14_97>='~' && LA14_97<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_55 = input.LA(1);

                        s = -1;
                        if ( (LA14_55=='\"') ) {s = 59;}

                        else if ( (LA14_55=='\\') ) {s = 63;}

                        else if ( ((LA14_55>='a' && LA14_55<='z')) ) {s = 50;}

                        else if ( ((LA14_55>='A' && LA14_55<='Z')) ) {s = 51;}

                        else if ( ((LA14_55>='0' && LA14_55<='9')) ) {s = 52;}

                        else if ( (LA14_55=='_') ) {s = 53;}

                        else if ( (LA14_55==':') ) {s = 54;}

                        else if ( (LA14_55=='#') ) {s = 55;}

                        else if ( (LA14_55=='/') ) {s = 56;}

                        else if ( (LA14_55=='.') ) {s = 57;}

                        else if ( (LA14_55=='-') ) {s = 58;}

                        else if ( (LA14_55=='^') ) {s = 60;}

                        else if ( (LA14_55=='{') ) {s = 61;}

                        else if ( (LA14_55=='}') ) {s = 62;}

                        else if ( (LA14_55=='$') ) {s = 64;}

                        else if ( ((LA14_55>='\u0000' && LA14_55<='!')||(LA14_55>='%' && LA14_55<=',')||(LA14_55>=';' && LA14_55<='@')||LA14_55=='['||LA14_55==']'||LA14_55=='`'||LA14_55=='|'||(LA14_55>='~' && LA14_55<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_98 = input.LA(1);

                        s = -1;
                        if ( (LA14_98=='\"') ) {s = 59;}

                        else if ( (LA14_98=='\\') ) {s = 63;}

                        else if ( ((LA14_98>='a' && LA14_98<='z')) ) {s = 50;}

                        else if ( ((LA14_98>='A' && LA14_98<='Z')) ) {s = 51;}

                        else if ( ((LA14_98>='0' && LA14_98<='9')) ) {s = 52;}

                        else if ( (LA14_98=='_') ) {s = 53;}

                        else if ( (LA14_98==':') ) {s = 54;}

                        else if ( (LA14_98=='#') ) {s = 55;}

                        else if ( (LA14_98=='/') ) {s = 56;}

                        else if ( (LA14_98=='.') ) {s = 57;}

                        else if ( (LA14_98=='-') ) {s = 58;}

                        else if ( (LA14_98=='^') ) {s = 60;}

                        else if ( (LA14_98=='{') ) {s = 61;}

                        else if ( (LA14_98=='}') ) {s = 62;}

                        else if ( (LA14_98=='$') ) {s = 64;}

                        else if ( ((LA14_98>='\u0000' && LA14_98<='!')||(LA14_98>='%' && LA14_98<=',')||(LA14_98>=';' && LA14_98<='@')||LA14_98=='['||LA14_98==']'||LA14_98=='`'||LA14_98=='|'||(LA14_98>='~' && LA14_98<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( (LA14_56=='\"') ) {s = 59;}

                        else if ( (LA14_56=='\\') ) {s = 63;}

                        else if ( ((LA14_56>='a' && LA14_56<='z')) ) {s = 50;}

                        else if ( ((LA14_56>='A' && LA14_56<='Z')) ) {s = 51;}

                        else if ( ((LA14_56>='0' && LA14_56<='9')) ) {s = 52;}

                        else if ( (LA14_56=='_') ) {s = 53;}

                        else if ( (LA14_56==':') ) {s = 54;}

                        else if ( (LA14_56=='#') ) {s = 55;}

                        else if ( (LA14_56=='/') ) {s = 56;}

                        else if ( (LA14_56=='.') ) {s = 57;}

                        else if ( (LA14_56=='-') ) {s = 58;}

                        else if ( (LA14_56=='^') ) {s = 60;}

                        else if ( (LA14_56=='{') ) {s = 61;}

                        else if ( (LA14_56=='}') ) {s = 62;}

                        else if ( (LA14_56=='$') ) {s = 64;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='!')||(LA14_56>='%' && LA14_56<=',')||(LA14_56>=';' && LA14_56<='@')||LA14_56=='['||LA14_56==']'||LA14_56=='`'||LA14_56=='|'||(LA14_56>='~' && LA14_56<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( (LA14_99=='\"') ) {s = 59;}

                        else if ( (LA14_99=='\\') ) {s = 63;}

                        else if ( ((LA14_99>='a' && LA14_99<='z')) ) {s = 50;}

                        else if ( ((LA14_99>='A' && LA14_99<='Z')) ) {s = 51;}

                        else if ( ((LA14_99>='0' && LA14_99<='9')) ) {s = 52;}

                        else if ( (LA14_99=='_') ) {s = 53;}

                        else if ( (LA14_99==':') ) {s = 54;}

                        else if ( (LA14_99=='#') ) {s = 55;}

                        else if ( (LA14_99=='/') ) {s = 56;}

                        else if ( (LA14_99=='.') ) {s = 57;}

                        else if ( (LA14_99=='-') ) {s = 58;}

                        else if ( (LA14_99=='^') ) {s = 60;}

                        else if ( (LA14_99=='{') ) {s = 61;}

                        else if ( (LA14_99=='}') ) {s = 62;}

                        else if ( (LA14_99=='$') ) {s = 64;}

                        else if ( ((LA14_99>='\u0000' && LA14_99<='!')||(LA14_99>='%' && LA14_99<=',')||(LA14_99>=';' && LA14_99<='@')||LA14_99=='['||LA14_99==']'||LA14_99=='`'||LA14_99=='|'||(LA14_99>='~' && LA14_99<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_57 = input.LA(1);

                        s = -1;
                        if ( (LA14_57=='\"') ) {s = 59;}

                        else if ( (LA14_57=='\\') ) {s = 63;}

                        else if ( ((LA14_57>='a' && LA14_57<='z')) ) {s = 50;}

                        else if ( ((LA14_57>='A' && LA14_57<='Z')) ) {s = 51;}

                        else if ( ((LA14_57>='0' && LA14_57<='9')) ) {s = 52;}

                        else if ( (LA14_57=='_') ) {s = 53;}

                        else if ( (LA14_57==':') ) {s = 54;}

                        else if ( (LA14_57=='#') ) {s = 55;}

                        else if ( (LA14_57=='/') ) {s = 56;}

                        else if ( (LA14_57=='.') ) {s = 57;}

                        else if ( (LA14_57=='-') ) {s = 58;}

                        else if ( (LA14_57=='^') ) {s = 60;}

                        else if ( (LA14_57=='{') ) {s = 61;}

                        else if ( (LA14_57=='}') ) {s = 62;}

                        else if ( (LA14_57=='$') ) {s = 64;}

                        else if ( ((LA14_57>='\u0000' && LA14_57<='!')||(LA14_57>='%' && LA14_57<=',')||(LA14_57>=';' && LA14_57<='@')||LA14_57=='['||LA14_57==']'||LA14_57=='`'||LA14_57=='|'||(LA14_57>='~' && LA14_57<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_100 = input.LA(1);

                        s = -1;
                        if ( (LA14_100=='\"') ) {s = 59;}

                        else if ( (LA14_100=='\\') ) {s = 63;}

                        else if ( ((LA14_100>='a' && LA14_100<='z')) ) {s = 50;}

                        else if ( ((LA14_100>='A' && LA14_100<='Z')) ) {s = 51;}

                        else if ( ((LA14_100>='0' && LA14_100<='9')) ) {s = 52;}

                        else if ( (LA14_100=='_') ) {s = 53;}

                        else if ( (LA14_100==':') ) {s = 54;}

                        else if ( (LA14_100=='#') ) {s = 55;}

                        else if ( (LA14_100=='/') ) {s = 56;}

                        else if ( (LA14_100=='.') ) {s = 57;}

                        else if ( (LA14_100=='-') ) {s = 58;}

                        else if ( (LA14_100=='^') ) {s = 60;}

                        else if ( (LA14_100=='{') ) {s = 61;}

                        else if ( (LA14_100=='}') ) {s = 62;}

                        else if ( (LA14_100=='$') ) {s = 64;}

                        else if ( ((LA14_100>='\u0000' && LA14_100<='!')||(LA14_100>='%' && LA14_100<=',')||(LA14_100>=';' && LA14_100<='@')||LA14_100=='['||LA14_100==']'||LA14_100=='`'||LA14_100=='|'||(LA14_100>='~' && LA14_100<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_58 = input.LA(1);

                        s = -1;
                        if ( ((LA14_58>='a' && LA14_58<='z')) ) {s = 50;}

                        else if ( ((LA14_58>='A' && LA14_58<='Z')) ) {s = 51;}

                        else if ( ((LA14_58>='0' && LA14_58<='9')) ) {s = 52;}

                        else if ( (LA14_58=='_') ) {s = 53;}

                        else if ( (LA14_58==':') ) {s = 54;}

                        else if ( (LA14_58=='#') ) {s = 55;}

                        else if ( (LA14_58=='/') ) {s = 56;}

                        else if ( (LA14_58=='.') ) {s = 57;}

                        else if ( (LA14_58=='-') ) {s = 58;}

                        else if ( (LA14_58=='\"') ) {s = 59;}

                        else if ( (LA14_58=='^') ) {s = 60;}

                        else if ( (LA14_58=='{') ) {s = 61;}

                        else if ( (LA14_58=='}') ) {s = 62;}

                        else if ( (LA14_58=='\\') ) {s = 63;}

                        else if ( (LA14_58=='$') ) {s = 64;}

                        else if ( ((LA14_58>='\u0000' && LA14_58<='!')||(LA14_58>='%' && LA14_58<=',')||(LA14_58>=';' && LA14_58<='@')||LA14_58=='['||LA14_58==']'||LA14_58=='`'||LA14_58=='|'||(LA14_58>='~' && LA14_58<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_101 = input.LA(1);

                        s = -1;
                        if ( (LA14_101=='\"') ) {s = 59;}

                        else if ( (LA14_101=='\\') ) {s = 63;}

                        else if ( ((LA14_101>='a' && LA14_101<='z')) ) {s = 50;}

                        else if ( ((LA14_101>='A' && LA14_101<='Z')) ) {s = 51;}

                        else if ( ((LA14_101>='0' && LA14_101<='9')) ) {s = 52;}

                        else if ( (LA14_101=='_') ) {s = 53;}

                        else if ( (LA14_101==':') ) {s = 54;}

                        else if ( (LA14_101=='#') ) {s = 55;}

                        else if ( (LA14_101=='/') ) {s = 56;}

                        else if ( (LA14_101=='.') ) {s = 57;}

                        else if ( (LA14_101=='-') ) {s = 58;}

                        else if ( (LA14_101=='^') ) {s = 60;}

                        else if ( (LA14_101=='{') ) {s = 61;}

                        else if ( (LA14_101=='}') ) {s = 62;}

                        else if ( (LA14_101=='$') ) {s = 64;}

                        else if ( ((LA14_101>='\u0000' && LA14_101<='!')||(LA14_101>='%' && LA14_101<=',')||(LA14_101>=';' && LA14_101<='@')||LA14_101=='['||LA14_101==']'||LA14_101=='`'||LA14_101=='|'||(LA14_101>='~' && LA14_101<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_102 = input.LA(1);

                        s = -1;
                        if ( (LA14_102=='\"') ) {s = 59;}

                        else if ( (LA14_102=='\\') ) {s = 63;}

                        else if ( ((LA14_102>='a' && LA14_102<='z')) ) {s = 50;}

                        else if ( ((LA14_102>='A' && LA14_102<='Z')) ) {s = 51;}

                        else if ( ((LA14_102>='0' && LA14_102<='9')) ) {s = 52;}

                        else if ( (LA14_102=='_') ) {s = 53;}

                        else if ( (LA14_102==':') ) {s = 54;}

                        else if ( (LA14_102=='#') ) {s = 55;}

                        else if ( (LA14_102=='/') ) {s = 56;}

                        else if ( (LA14_102=='.') ) {s = 57;}

                        else if ( (LA14_102=='-') ) {s = 58;}

                        else if ( (LA14_102=='^') ) {s = 60;}

                        else if ( (LA14_102=='{') ) {s = 61;}

                        else if ( (LA14_102=='}') ) {s = 62;}

                        else if ( (LA14_102=='$') ) {s = 64;}

                        else if ( ((LA14_102>='\u0000' && LA14_102<='!')||(LA14_102>='%' && LA14_102<=',')||(LA14_102>=';' && LA14_102<='@')||LA14_102=='['||LA14_102==']'||LA14_102=='`'||LA14_102=='|'||(LA14_102>='~' && LA14_102<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_60 = input.LA(1);

                        s = -1;
                        if ( ((LA14_60>='a' && LA14_60<='z')) ) {s = 50;}

                        else if ( ((LA14_60>='A' && LA14_60<='Z')) ) {s = 51;}

                        else if ( ((LA14_60>='0' && LA14_60<='9')) ) {s = 52;}

                        else if ( (LA14_60=='_') ) {s = 53;}

                        else if ( (LA14_60==':') ) {s = 54;}

                        else if ( (LA14_60=='#') ) {s = 55;}

                        else if ( (LA14_60=='/') ) {s = 56;}

                        else if ( (LA14_60=='.') ) {s = 57;}

                        else if ( (LA14_60=='-') ) {s = 58;}

                        else if ( (LA14_60=='\"') ) {s = 59;}

                        else if ( (LA14_60=='^') ) {s = 60;}

                        else if ( (LA14_60=='{') ) {s = 61;}

                        else if ( (LA14_60=='}') ) {s = 62;}

                        else if ( (LA14_60=='\\') ) {s = 63;}

                        else if ( (LA14_60=='$') ) {s = 64;}

                        else if ( ((LA14_60>='\u0000' && LA14_60<='!')||(LA14_60>='%' && LA14_60<=',')||(LA14_60>=';' && LA14_60<='@')||LA14_60=='['||LA14_60==']'||LA14_60=='`'||LA14_60=='|'||(LA14_60>='~' && LA14_60<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_103 = input.LA(1);

                        s = -1;
                        if ( (LA14_103=='\"') ) {s = 59;}

                        else if ( (LA14_103=='\\') ) {s = 63;}

                        else if ( ((LA14_103>='a' && LA14_103<='z')) ) {s = 50;}

                        else if ( ((LA14_103>='A' && LA14_103<='Z')) ) {s = 51;}

                        else if ( ((LA14_103>='0' && LA14_103<='9')) ) {s = 52;}

                        else if ( (LA14_103=='_') ) {s = 53;}

                        else if ( (LA14_103==':') ) {s = 54;}

                        else if ( (LA14_103=='#') ) {s = 55;}

                        else if ( (LA14_103=='/') ) {s = 56;}

                        else if ( (LA14_103=='.') ) {s = 57;}

                        else if ( (LA14_103=='-') ) {s = 58;}

                        else if ( (LA14_103=='^') ) {s = 60;}

                        else if ( (LA14_103=='{') ) {s = 61;}

                        else if ( (LA14_103=='}') ) {s = 62;}

                        else if ( (LA14_103=='$') ) {s = 64;}

                        else if ( ((LA14_103>='\u0000' && LA14_103<='!')||(LA14_103>='%' && LA14_103<=',')||(LA14_103>=';' && LA14_103<='@')||LA14_103=='['||LA14_103==']'||LA14_103=='`'||LA14_103=='|'||(LA14_103>='~' && LA14_103<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_61 = input.LA(1);

                        s = -1;
                        if ( ((LA14_61>='a' && LA14_61<='z')) ) {s = 50;}

                        else if ( ((LA14_61>='A' && LA14_61<='Z')) ) {s = 51;}

                        else if ( ((LA14_61>='0' && LA14_61<='9')) ) {s = 52;}

                        else if ( (LA14_61=='_') ) {s = 53;}

                        else if ( (LA14_61==':') ) {s = 54;}

                        else if ( (LA14_61=='#') ) {s = 55;}

                        else if ( (LA14_61=='/') ) {s = 56;}

                        else if ( (LA14_61=='.') ) {s = 57;}

                        else if ( (LA14_61=='-') ) {s = 58;}

                        else if ( (LA14_61=='\"') ) {s = 59;}

                        else if ( (LA14_61=='^') ) {s = 60;}

                        else if ( (LA14_61=='{') ) {s = 61;}

                        else if ( (LA14_61=='}') ) {s = 62;}

                        else if ( (LA14_61=='\\') ) {s = 63;}

                        else if ( (LA14_61=='$') ) {s = 64;}

                        else if ( ((LA14_61>='\u0000' && LA14_61<='!')||(LA14_61>='%' && LA14_61<=',')||(LA14_61>=';' && LA14_61<='@')||LA14_61=='['||LA14_61==']'||LA14_61=='`'||LA14_61=='|'||(LA14_61>='~' && LA14_61<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_104 = input.LA(1);

                        s = -1;
                        if ( (LA14_104=='\"') ) {s = 59;}

                        else if ( (LA14_104=='\\') ) {s = 63;}

                        else if ( ((LA14_104>='a' && LA14_104<='z')) ) {s = 50;}

                        else if ( ((LA14_104>='A' && LA14_104<='Z')) ) {s = 51;}

                        else if ( ((LA14_104>='0' && LA14_104<='9')) ) {s = 52;}

                        else if ( (LA14_104=='_') ) {s = 53;}

                        else if ( (LA14_104==':') ) {s = 54;}

                        else if ( (LA14_104=='#') ) {s = 55;}

                        else if ( (LA14_104=='/') ) {s = 56;}

                        else if ( (LA14_104=='.') ) {s = 57;}

                        else if ( (LA14_104=='-') ) {s = 58;}

                        else if ( (LA14_104=='^') ) {s = 60;}

                        else if ( (LA14_104=='{') ) {s = 61;}

                        else if ( (LA14_104=='}') ) {s = 62;}

                        else if ( (LA14_104=='$') ) {s = 64;}

                        else if ( ((LA14_104>='\u0000' && LA14_104<='!')||(LA14_104>='%' && LA14_104<=',')||(LA14_104>=';' && LA14_104<='@')||LA14_104=='['||LA14_104==']'||LA14_104=='`'||LA14_104=='|'||(LA14_104>='~' && LA14_104<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_62 = input.LA(1);

                        s = -1;
                        if ( (LA14_62=='\"') ) {s = 59;}

                        else if ( (LA14_62=='\\') ) {s = 63;}

                        else if ( ((LA14_62>='a' && LA14_62<='z')) ) {s = 50;}

                        else if ( ((LA14_62>='A' && LA14_62<='Z')) ) {s = 51;}

                        else if ( ((LA14_62>='0' && LA14_62<='9')) ) {s = 52;}

                        else if ( (LA14_62=='_') ) {s = 53;}

                        else if ( (LA14_62==':') ) {s = 54;}

                        else if ( (LA14_62=='#') ) {s = 55;}

                        else if ( (LA14_62=='/') ) {s = 56;}

                        else if ( (LA14_62=='.') ) {s = 57;}

                        else if ( (LA14_62=='-') ) {s = 58;}

                        else if ( (LA14_62=='^') ) {s = 60;}

                        else if ( (LA14_62=='{') ) {s = 61;}

                        else if ( (LA14_62=='}') ) {s = 62;}

                        else if ( (LA14_62=='$') ) {s = 64;}

                        else if ( ((LA14_62>='\u0000' && LA14_62<='!')||(LA14_62>='%' && LA14_62<=',')||(LA14_62>=';' && LA14_62<='@')||LA14_62=='['||LA14_62==']'||LA14_62=='`'||LA14_62=='|'||(LA14_62>='~' && LA14_62<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_92 = input.LA(1);

                        s = -1;
                        if ( (LA14_92=='\"') ) {s = 59;}

                        else if ( (LA14_92=='\\') ) {s = 63;}

                        else if ( ((LA14_92>='a' && LA14_92<='z')) ) {s = 50;}

                        else if ( ((LA14_92>='A' && LA14_92<='Z')) ) {s = 51;}

                        else if ( ((LA14_92>='0' && LA14_92<='9')) ) {s = 52;}

                        else if ( (LA14_92=='_') ) {s = 53;}

                        else if ( (LA14_92==':') ) {s = 54;}

                        else if ( (LA14_92=='#') ) {s = 55;}

                        else if ( (LA14_92=='/') ) {s = 56;}

                        else if ( (LA14_92=='.') ) {s = 57;}

                        else if ( (LA14_92=='-') ) {s = 58;}

                        else if ( (LA14_92=='^') ) {s = 60;}

                        else if ( (LA14_92=='{') ) {s = 61;}

                        else if ( (LA14_92=='}') ) {s = 62;}

                        else if ( (LA14_92=='$') ) {s = 64;}

                        else if ( ((LA14_92>='\u0000' && LA14_92<='!')||(LA14_92>='%' && LA14_92<=',')||(LA14_92>=';' && LA14_92<='@')||LA14_92=='['||LA14_92==']'||LA14_92=='`'||LA14_92=='|'||(LA14_92>='~' && LA14_92<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_64 = input.LA(1);

                        s = -1;
                        if ( (LA14_64=='\"') ) {s = 59;}

                        else if ( (LA14_64=='\\') ) {s = 63;}

                        else if ( ((LA14_64>='a' && LA14_64<='z')) ) {s = 50;}

                        else if ( ((LA14_64>='A' && LA14_64<='Z')) ) {s = 51;}

                        else if ( ((LA14_64>='0' && LA14_64<='9')) ) {s = 52;}

                        else if ( (LA14_64=='_') ) {s = 53;}

                        else if ( (LA14_64==':') ) {s = 54;}

                        else if ( (LA14_64=='#') ) {s = 55;}

                        else if ( (LA14_64=='/') ) {s = 56;}

                        else if ( (LA14_64=='.') ) {s = 57;}

                        else if ( (LA14_64=='-') ) {s = 58;}

                        else if ( (LA14_64=='^') ) {s = 60;}

                        else if ( (LA14_64=='{') ) {s = 61;}

                        else if ( (LA14_64=='}') ) {s = 62;}

                        else if ( (LA14_64=='$') ) {s = 64;}

                        else if ( ((LA14_64>='\u0000' && LA14_64<='!')||(LA14_64>='%' && LA14_64<=',')||(LA14_64>=';' && LA14_64<='@')||LA14_64=='['||LA14_64==']'||LA14_64=='`'||LA14_64=='|'||(LA14_64>='~' && LA14_64<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( (LA14_52=='\"') ) {s = 59;}

                        else if ( (LA14_52=='\\') ) {s = 63;}

                        else if ( ((LA14_52>='a' && LA14_52<='z')) ) {s = 50;}

                        else if ( ((LA14_52>='A' && LA14_52<='Z')) ) {s = 51;}

                        else if ( ((LA14_52>='0' && LA14_52<='9')) ) {s = 52;}

                        else if ( (LA14_52=='_') ) {s = 53;}

                        else if ( (LA14_52==':') ) {s = 54;}

                        else if ( (LA14_52=='#') ) {s = 55;}

                        else if ( (LA14_52=='/') ) {s = 56;}

                        else if ( (LA14_52=='.') ) {s = 57;}

                        else if ( (LA14_52=='-') ) {s = 58;}

                        else if ( (LA14_52=='^') ) {s = 60;}

                        else if ( (LA14_52=='{') ) {s = 61;}

                        else if ( (LA14_52=='}') ) {s = 62;}

                        else if ( (LA14_52=='$') ) {s = 64;}

                        else if ( ((LA14_52>='\u0000' && LA14_52<='!')||(LA14_52>='%' && LA14_52<=',')||(LA14_52>=';' && LA14_52<='@')||LA14_52=='['||LA14_52==']'||LA14_52=='`'||LA14_52=='|'||(LA14_52>='~' && LA14_52<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='a' && LA14_20<='z')) ) {s = 50;}

                        else if ( ((LA14_20>='A' && LA14_20<='Z')) ) {s = 51;}

                        else if ( ((LA14_20>='0' && LA14_20<='9')) ) {s = 52;}

                        else if ( (LA14_20=='_') ) {s = 53;}

                        else if ( (LA14_20==':') ) {s = 54;}

                        else if ( (LA14_20=='#') ) {s = 55;}

                        else if ( (LA14_20=='/') ) {s = 56;}

                        else if ( (LA14_20=='.') ) {s = 57;}

                        else if ( (LA14_20=='-') ) {s = 58;}

                        else if ( (LA14_20=='\"') ) {s = 59;}

                        else if ( (LA14_20=='^') ) {s = 60;}

                        else if ( (LA14_20=='{') ) {s = 61;}

                        else if ( (LA14_20=='}') ) {s = 62;}

                        else if ( (LA14_20=='\\') ) {s = 63;}

                        else if ( (LA14_20=='$') ) {s = 64;}

                        else if ( ((LA14_20>='\u0000' && LA14_20<='!')||(LA14_20>='%' && LA14_20<=',')||(LA14_20>=';' && LA14_20<='@')||LA14_20=='['||LA14_20==']'||LA14_20=='`'||LA14_20=='|'||(LA14_20>='~' && LA14_20<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA14_74 = input.LA(1);

                        s = -1;
                        if ( ((LA14_74>='a' && LA14_74<='z')) ) {s = 74;}

                        else if ( ((LA14_74>='A' && LA14_74<='Z')) ) {s = 76;}

                        else if ( ((LA14_74>='0' && LA14_74<='9')) ) {s = 77;}

                        else if ( (LA14_74=='_') ) {s = 78;}

                        else if ( (LA14_74==':') ) {s = 79;}

                        else if ( (LA14_74=='#') ) {s = 80;}

                        else if ( (LA14_74=='/') ) {s = 81;}

                        else if ( (LA14_74=='.') ) {s = 82;}

                        else if ( (LA14_74=='-') ) {s = 83;}

                        else if ( (LA14_74=='\"') ) {s = 84;}

                        else if ( (LA14_74=='^') ) {s = 85;}

                        else if ( (LA14_74=='{') ) {s = 86;}

                        else if ( (LA14_74=='}') ) {s = 87;}

                        else if ( (LA14_74=='\\') ) {s = 88;}

                        else if ( (LA14_74=='$') ) {s = 89;}

                        else if ( ((LA14_74>='\u0000' && LA14_74<='!')||(LA14_74>='%' && LA14_74<=',')||(LA14_74>=';' && LA14_74<='@')||LA14_74=='['||LA14_74==']'||LA14_74=='`'||LA14_74=='|'||(LA14_74>='~' && LA14_74<='\uFFFF')) ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA14_76 = input.LA(1);

                        s = -1;
                        if ( ((LA14_76>='\u0000' && LA14_76<='!')||(LA14_76>='%' && LA14_76<=',')||(LA14_76>=';' && LA14_76<='@')||LA14_76=='['||LA14_76==']'||LA14_76=='`'||LA14_76=='|'||(LA14_76>='~' && LA14_76<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_76>='a' && LA14_76<='z')) ) {s = 74;}

                        else if ( ((LA14_76>='A' && LA14_76<='Z')) ) {s = 76;}

                        else if ( ((LA14_76>='0' && LA14_76<='9')) ) {s = 77;}

                        else if ( (LA14_76=='_') ) {s = 78;}

                        else if ( (LA14_76==':') ) {s = 79;}

                        else if ( (LA14_76=='#') ) {s = 80;}

                        else if ( (LA14_76=='/') ) {s = 81;}

                        else if ( (LA14_76=='.') ) {s = 82;}

                        else if ( (LA14_76=='-') ) {s = 83;}

                        else if ( (LA14_76=='\"') ) {s = 84;}

                        else if ( (LA14_76=='^') ) {s = 85;}

                        else if ( (LA14_76=='{') ) {s = 86;}

                        else if ( (LA14_76=='}') ) {s = 87;}

                        else if ( (LA14_76=='\\') ) {s = 88;}

                        else if ( (LA14_76=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA14_78 = input.LA(1);

                        s = -1;
                        if ( ((LA14_78>='\u0000' && LA14_78<='!')||(LA14_78>='%' && LA14_78<=',')||(LA14_78>=';' && LA14_78<='@')||LA14_78=='['||LA14_78==']'||LA14_78=='`'||LA14_78=='|'||(LA14_78>='~' && LA14_78<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_78>='a' && LA14_78<='z')) ) {s = 74;}

                        else if ( ((LA14_78>='A' && LA14_78<='Z')) ) {s = 76;}

                        else if ( ((LA14_78>='0' && LA14_78<='9')) ) {s = 77;}

                        else if ( (LA14_78=='_') ) {s = 78;}

                        else if ( (LA14_78==':') ) {s = 79;}

                        else if ( (LA14_78=='#') ) {s = 80;}

                        else if ( (LA14_78=='/') ) {s = 81;}

                        else if ( (LA14_78=='.') ) {s = 82;}

                        else if ( (LA14_78=='-') ) {s = 83;}

                        else if ( (LA14_78=='\"') ) {s = 84;}

                        else if ( (LA14_78=='^') ) {s = 85;}

                        else if ( (LA14_78=='{') ) {s = 86;}

                        else if ( (LA14_78=='}') ) {s = 87;}

                        else if ( (LA14_78=='\\') ) {s = 88;}

                        else if ( (LA14_78=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA14_79 = input.LA(1);

                        s = -1;
                        if ( ((LA14_79>='\u0000' && LA14_79<='!')||(LA14_79>='%' && LA14_79<=',')||(LA14_79>=';' && LA14_79<='@')||LA14_79=='['||LA14_79==']'||LA14_79=='`'||LA14_79=='|'||(LA14_79>='~' && LA14_79<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_79>='a' && LA14_79<='z')) ) {s = 74;}

                        else if ( ((LA14_79>='A' && LA14_79<='Z')) ) {s = 76;}

                        else if ( ((LA14_79>='0' && LA14_79<='9')) ) {s = 77;}

                        else if ( (LA14_79=='_') ) {s = 78;}

                        else if ( (LA14_79==':') ) {s = 79;}

                        else if ( (LA14_79=='#') ) {s = 80;}

                        else if ( (LA14_79=='/') ) {s = 81;}

                        else if ( (LA14_79=='.') ) {s = 82;}

                        else if ( (LA14_79=='-') ) {s = 83;}

                        else if ( (LA14_79=='\"') ) {s = 84;}

                        else if ( (LA14_79=='^') ) {s = 85;}

                        else if ( (LA14_79=='{') ) {s = 86;}

                        else if ( (LA14_79=='}') ) {s = 87;}

                        else if ( (LA14_79=='\\') ) {s = 88;}

                        else if ( (LA14_79=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA14_80 = input.LA(1);

                        s = -1;
                        if ( ((LA14_80>='\u0000' && LA14_80<='!')||(LA14_80>='%' && LA14_80<=',')||(LA14_80>=';' && LA14_80<='@')||LA14_80=='['||LA14_80==']'||LA14_80=='`'||LA14_80=='|'||(LA14_80>='~' && LA14_80<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_80>='a' && LA14_80<='z')) ) {s = 74;}

                        else if ( ((LA14_80>='A' && LA14_80<='Z')) ) {s = 76;}

                        else if ( ((LA14_80>='0' && LA14_80<='9')) ) {s = 77;}

                        else if ( (LA14_80=='_') ) {s = 78;}

                        else if ( (LA14_80==':') ) {s = 79;}

                        else if ( (LA14_80=='#') ) {s = 80;}

                        else if ( (LA14_80=='/') ) {s = 81;}

                        else if ( (LA14_80=='.') ) {s = 82;}

                        else if ( (LA14_80=='-') ) {s = 83;}

                        else if ( (LA14_80=='\"') ) {s = 84;}

                        else if ( (LA14_80=='^') ) {s = 85;}

                        else if ( (LA14_80=='{') ) {s = 86;}

                        else if ( (LA14_80=='}') ) {s = 87;}

                        else if ( (LA14_80=='\\') ) {s = 88;}

                        else if ( (LA14_80=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA14_81 = input.LA(1);

                        s = -1;
                        if ( ((LA14_81>='\u0000' && LA14_81<='!')||(LA14_81>='%' && LA14_81<=',')||(LA14_81>=';' && LA14_81<='@')||LA14_81=='['||LA14_81==']'||LA14_81=='`'||LA14_81=='|'||(LA14_81>='~' && LA14_81<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_81>='a' && LA14_81<='z')) ) {s = 74;}

                        else if ( ((LA14_81>='A' && LA14_81<='Z')) ) {s = 76;}

                        else if ( ((LA14_81>='0' && LA14_81<='9')) ) {s = 77;}

                        else if ( (LA14_81=='_') ) {s = 78;}

                        else if ( (LA14_81==':') ) {s = 79;}

                        else if ( (LA14_81=='#') ) {s = 80;}

                        else if ( (LA14_81=='/') ) {s = 81;}

                        else if ( (LA14_81=='.') ) {s = 82;}

                        else if ( (LA14_81=='-') ) {s = 83;}

                        else if ( (LA14_81=='\"') ) {s = 84;}

                        else if ( (LA14_81=='^') ) {s = 85;}

                        else if ( (LA14_81=='{') ) {s = 86;}

                        else if ( (LA14_81=='}') ) {s = 87;}

                        else if ( (LA14_81=='\\') ) {s = 88;}

                        else if ( (LA14_81=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( ((LA14_82>='\u0000' && LA14_82<='!')||(LA14_82>='%' && LA14_82<=',')||(LA14_82>=';' && LA14_82<='@')||LA14_82=='['||LA14_82==']'||LA14_82=='`'||LA14_82=='|'||(LA14_82>='~' && LA14_82<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_82>='a' && LA14_82<='z')) ) {s = 74;}

                        else if ( ((LA14_82>='A' && LA14_82<='Z')) ) {s = 76;}

                        else if ( ((LA14_82>='0' && LA14_82<='9')) ) {s = 77;}

                        else if ( (LA14_82=='_') ) {s = 78;}

                        else if ( (LA14_82==':') ) {s = 79;}

                        else if ( (LA14_82=='#') ) {s = 80;}

                        else if ( (LA14_82=='/') ) {s = 81;}

                        else if ( (LA14_82=='.') ) {s = 82;}

                        else if ( (LA14_82=='-') ) {s = 83;}

                        else if ( (LA14_82=='\"') ) {s = 84;}

                        else if ( (LA14_82=='^') ) {s = 85;}

                        else if ( (LA14_82=='{') ) {s = 86;}

                        else if ( (LA14_82=='}') ) {s = 87;}

                        else if ( (LA14_82=='\\') ) {s = 88;}

                        else if ( (LA14_82=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( ((LA14_83>='a' && LA14_83<='z')) ) {s = 74;}

                        else if ( ((LA14_83>='A' && LA14_83<='Z')) ) {s = 76;}

                        else if ( ((LA14_83>='0' && LA14_83<='9')) ) {s = 77;}

                        else if ( (LA14_83=='_') ) {s = 78;}

                        else if ( (LA14_83==':') ) {s = 79;}

                        else if ( (LA14_83=='#') ) {s = 80;}

                        else if ( (LA14_83=='/') ) {s = 81;}

                        else if ( (LA14_83=='.') ) {s = 82;}

                        else if ( (LA14_83=='-') ) {s = 83;}

                        else if ( (LA14_83=='\"') ) {s = 84;}

                        else if ( (LA14_83=='^') ) {s = 85;}

                        else if ( (LA14_83=='{') ) {s = 86;}

                        else if ( (LA14_83=='}') ) {s = 87;}

                        else if ( (LA14_83=='\\') ) {s = 88;}

                        else if ( (LA14_83=='$') ) {s = 89;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<='!')||(LA14_83>='%' && LA14_83<=',')||(LA14_83>=';' && LA14_83<='@')||LA14_83=='['||LA14_83==']'||LA14_83=='`'||LA14_83=='|'||(LA14_83>='~' && LA14_83<='\uFFFF')) ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA14_84 = input.LA(1);

                        s = -1;
                        if ( ((LA14_84>='\u0000' && LA14_84<='!')||(LA14_84>='%' && LA14_84<=',')||(LA14_84>=';' && LA14_84<='@')||LA14_84=='['||LA14_84==']'||LA14_84=='`'||LA14_84=='|'||(LA14_84>='~' && LA14_84<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_84>='a' && LA14_84<='z')) ) {s = 74;}

                        else if ( ((LA14_84>='A' && LA14_84<='Z')) ) {s = 76;}

                        else if ( ((LA14_84>='0' && LA14_84<='9')) ) {s = 77;}

                        else if ( (LA14_84=='_') ) {s = 78;}

                        else if ( (LA14_84==':') ) {s = 79;}

                        else if ( (LA14_84=='#') ) {s = 80;}

                        else if ( (LA14_84=='/') ) {s = 81;}

                        else if ( (LA14_84=='.') ) {s = 82;}

                        else if ( (LA14_84=='-') ) {s = 83;}

                        else if ( (LA14_84=='\"') ) {s = 84;}

                        else if ( (LA14_84=='^') ) {s = 85;}

                        else if ( (LA14_84=='{') ) {s = 86;}

                        else if ( (LA14_84=='}') ) {s = 87;}

                        else if ( (LA14_84=='\\') ) {s = 88;}

                        else if ( (LA14_84=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( ((LA14_85>='\u0000' && LA14_85<='!')||(LA14_85>='%' && LA14_85<=',')||(LA14_85>=';' && LA14_85<='@')||LA14_85=='['||LA14_85==']'||LA14_85=='`'||LA14_85=='|'||(LA14_85>='~' && LA14_85<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_85>='a' && LA14_85<='z')) ) {s = 74;}

                        else if ( ((LA14_85>='A' && LA14_85<='Z')) ) {s = 76;}

                        else if ( ((LA14_85>='0' && LA14_85<='9')) ) {s = 77;}

                        else if ( (LA14_85=='_') ) {s = 78;}

                        else if ( (LA14_85==':') ) {s = 79;}

                        else if ( (LA14_85=='#') ) {s = 80;}

                        else if ( (LA14_85=='/') ) {s = 81;}

                        else if ( (LA14_85=='.') ) {s = 82;}

                        else if ( (LA14_85=='-') ) {s = 83;}

                        else if ( (LA14_85=='\"') ) {s = 84;}

                        else if ( (LA14_85=='^') ) {s = 85;}

                        else if ( (LA14_85=='{') ) {s = 86;}

                        else if ( (LA14_85=='}') ) {s = 87;}

                        else if ( (LA14_85=='\\') ) {s = 88;}

                        else if ( (LA14_85=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='<') ) {s = 1;}

                        else if ( (LA14_0=='.') ) {s = 2;}

                        else if ( (LA14_0=='@') ) {s = 3;}

                        else if ( (LA14_0=='>') ) {s = 4;}

                        else if ( (LA14_0==';') ) {s = 5;}

                        else if ( (LA14_0=='a') ) {s = 6;}

                        else if ( (LA14_0=='s') ) {s = 7;}

                        else if ( (LA14_0=='[') ) {s = 8;}

                        else if ( (LA14_0==']') ) {s = 9;}

                        else if ( (LA14_0=='(') ) {s = 10;}

                        else if ( (LA14_0==')') ) {s = 11;}

                        else if ( ((LA14_0>='b' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {s = 12;}

                        else if ( (LA14_0==':') ) {s = 13;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 14;}

                        else if ( (LA14_0=='_') ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='#') ) {s = 17;}

                        else if ( (LA14_0=='/') ) {s = 18;}

                        else if ( (LA14_0=='-') ) {s = 19;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='^') ) {s = 21;}

                        else if ( (LA14_0=='{') ) {s = 22;}

                        else if ( (LA14_0=='}') ) {s = 23;}

                        else if ( (LA14_0=='\\') ) {s = 24;}

                        else if ( (LA14_0=='$') ) {s = 25;}

                        else if ( (LA14_0=='\'') ) {s = 27;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 28;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||LA14_0=='='||LA14_0=='?'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 29;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( ((LA14_86>='\u0000' && LA14_86<='!')||(LA14_86>='%' && LA14_86<=',')||(LA14_86>=';' && LA14_86<='@')||LA14_86=='['||LA14_86==']'||LA14_86=='`'||LA14_86=='|'||(LA14_86>='~' && LA14_86<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_86>='a' && LA14_86<='z')) ) {s = 74;}

                        else if ( ((LA14_86>='A' && LA14_86<='Z')) ) {s = 76;}

                        else if ( ((LA14_86>='0' && LA14_86<='9')) ) {s = 77;}

                        else if ( (LA14_86=='_') ) {s = 78;}

                        else if ( (LA14_86==':') ) {s = 79;}

                        else if ( (LA14_86=='#') ) {s = 80;}

                        else if ( (LA14_86=='/') ) {s = 81;}

                        else if ( (LA14_86=='.') ) {s = 82;}

                        else if ( (LA14_86=='-') ) {s = 83;}

                        else if ( (LA14_86=='\"') ) {s = 84;}

                        else if ( (LA14_86=='^') ) {s = 85;}

                        else if ( (LA14_86=='{') ) {s = 86;}

                        else if ( (LA14_86=='}') ) {s = 87;}

                        else if ( (LA14_86=='\\') ) {s = 88;}

                        else if ( (LA14_86=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA14_87 = input.LA(1);

                        s = -1;
                        if ( ((LA14_87>='\u0000' && LA14_87<='!')||(LA14_87>='%' && LA14_87<=',')||(LA14_87>=';' && LA14_87<='@')||LA14_87=='['||LA14_87==']'||LA14_87=='`'||LA14_87=='|'||(LA14_87>='~' && LA14_87<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_87>='a' && LA14_87<='z')) ) {s = 74;}

                        else if ( ((LA14_87>='A' && LA14_87<='Z')) ) {s = 76;}

                        else if ( ((LA14_87>='0' && LA14_87<='9')) ) {s = 77;}

                        else if ( (LA14_87=='_') ) {s = 78;}

                        else if ( (LA14_87==':') ) {s = 79;}

                        else if ( (LA14_87=='#') ) {s = 80;}

                        else if ( (LA14_87=='/') ) {s = 81;}

                        else if ( (LA14_87=='.') ) {s = 82;}

                        else if ( (LA14_87=='-') ) {s = 83;}

                        else if ( (LA14_87=='\"') ) {s = 84;}

                        else if ( (LA14_87=='^') ) {s = 85;}

                        else if ( (LA14_87=='{') ) {s = 86;}

                        else if ( (LA14_87=='}') ) {s = 87;}

                        else if ( (LA14_87=='\\') ) {s = 88;}

                        else if ( (LA14_87=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA14_88 = input.LA(1);

                        s = -1;
                        if ( ((LA14_88>='\u0000' && LA14_88<='!')||(LA14_88>='%' && LA14_88<=',')||(LA14_88>=';' && LA14_88<='@')||LA14_88=='['||LA14_88==']'||LA14_88=='`'||LA14_88=='|'||(LA14_88>='~' && LA14_88<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_88>='a' && LA14_88<='z')) ) {s = 74;}

                        else if ( ((LA14_88>='A' && LA14_88<='Z')) ) {s = 76;}

                        else if ( ((LA14_88>='0' && LA14_88<='9')) ) {s = 77;}

                        else if ( (LA14_88=='_') ) {s = 78;}

                        else if ( (LA14_88==':') ) {s = 79;}

                        else if ( (LA14_88=='#') ) {s = 80;}

                        else if ( (LA14_88=='/') ) {s = 81;}

                        else if ( (LA14_88=='.') ) {s = 82;}

                        else if ( (LA14_88=='-') ) {s = 83;}

                        else if ( (LA14_88=='\"') ) {s = 84;}

                        else if ( (LA14_88=='^') ) {s = 85;}

                        else if ( (LA14_88=='{') ) {s = 86;}

                        else if ( (LA14_88=='}') ) {s = 87;}

                        else if ( (LA14_88=='\\') ) {s = 88;}

                        else if ( (LA14_88=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA14_89 = input.LA(1);

                        s = -1;
                        if ( ((LA14_89>='\u0000' && LA14_89<='!')||(LA14_89>='%' && LA14_89<=',')||(LA14_89>=';' && LA14_89<='@')||LA14_89=='['||LA14_89==']'||LA14_89=='`'||LA14_89=='|'||(LA14_89>='~' && LA14_89<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_89>='a' && LA14_89<='z')) ) {s = 74;}

                        else if ( ((LA14_89>='A' && LA14_89<='Z')) ) {s = 76;}

                        else if ( ((LA14_89>='0' && LA14_89<='9')) ) {s = 77;}

                        else if ( (LA14_89=='_') ) {s = 78;}

                        else if ( (LA14_89==':') ) {s = 79;}

                        else if ( (LA14_89=='#') ) {s = 80;}

                        else if ( (LA14_89=='/') ) {s = 81;}

                        else if ( (LA14_89=='.') ) {s = 82;}

                        else if ( (LA14_89=='-') ) {s = 83;}

                        else if ( (LA14_89=='\"') ) {s = 84;}

                        else if ( (LA14_89=='^') ) {s = 85;}

                        else if ( (LA14_89=='{') ) {s = 86;}

                        else if ( (LA14_89=='}') ) {s = 87;}

                        else if ( (LA14_89=='\\') ) {s = 88;}

                        else if ( (LA14_89=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA14_77 = input.LA(1);

                        s = -1;
                        if ( ((LA14_77>='\u0000' && LA14_77<='!')||(LA14_77>='%' && LA14_77<=',')||(LA14_77>=';' && LA14_77<='@')||LA14_77=='['||LA14_77==']'||LA14_77=='`'||LA14_77=='|'||(LA14_77>='~' && LA14_77<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_77>='a' && LA14_77<='z')) ) {s = 74;}

                        else if ( ((LA14_77>='A' && LA14_77<='Z')) ) {s = 76;}

                        else if ( ((LA14_77>='0' && LA14_77<='9')) ) {s = 77;}

                        else if ( (LA14_77=='_') ) {s = 78;}

                        else if ( (LA14_77==':') ) {s = 79;}

                        else if ( (LA14_77=='#') ) {s = 80;}

                        else if ( (LA14_77=='/') ) {s = 81;}

                        else if ( (LA14_77=='.') ) {s = 82;}

                        else if ( (LA14_77=='-') ) {s = 83;}

                        else if ( (LA14_77=='\"') ) {s = 84;}

                        else if ( (LA14_77=='^') ) {s = 85;}

                        else if ( (LA14_77=='{') ) {s = 86;}

                        else if ( (LA14_77=='}') ) {s = 87;}

                        else if ( (LA14_77=='\\') ) {s = 88;}

                        else if ( (LA14_77=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA14_63 = input.LA(1);

                        s = -1;
                        if ( ((LA14_63>='a' && LA14_63<='z')) ) {s = 90;}

                        else if ( ((LA14_63>='A' && LA14_63<='Z')) ) {s = 91;}

                        else if ( ((LA14_63>='0' && LA14_63<='9')) ) {s = 92;}

                        else if ( (LA14_63=='_') ) {s = 93;}

                        else if ( (LA14_63==':') ) {s = 94;}

                        else if ( (LA14_63=='#') ) {s = 95;}

                        else if ( (LA14_63=='/') ) {s = 96;}

                        else if ( (LA14_63=='.') ) {s = 97;}

                        else if ( (LA14_63=='-') ) {s = 98;}

                        else if ( (LA14_63=='\"') ) {s = 99;}

                        else if ( (LA14_63=='^') ) {s = 100;}

                        else if ( (LA14_63=='{') ) {s = 101;}

                        else if ( (LA14_63=='}') ) {s = 102;}

                        else if ( (LA14_63=='\\') ) {s = 103;}

                        else if ( (LA14_63=='$') ) {s = 104;}

                        else if ( ((LA14_63>='\u0000' && LA14_63<='!')||(LA14_63>='%' && LA14_63<=',')||(LA14_63>=';' && LA14_63<='@')||LA14_63=='['||LA14_63==']'||LA14_63=='`'||LA14_63=='|'||(LA14_63>='~' && LA14_63<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( ((LA14_49>='a' && LA14_49<='z')) ) {s = 74;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='!')||(LA14_49>='%' && LA14_49<=',')||(LA14_49>=';' && LA14_49<='@')||LA14_49=='['||LA14_49==']'||LA14_49=='`'||LA14_49=='|'||(LA14_49>='~' && LA14_49<='\uFFFF')) ) {s = 75;}

                        else if ( ((LA14_49>='A' && LA14_49<='Z')) ) {s = 76;}

                        else if ( ((LA14_49>='0' && LA14_49<='9')) ) {s = 77;}

                        else if ( (LA14_49=='_') ) {s = 78;}

                        else if ( (LA14_49==':') ) {s = 79;}

                        else if ( (LA14_49=='#') ) {s = 80;}

                        else if ( (LA14_49=='/') ) {s = 81;}

                        else if ( (LA14_49=='.') ) {s = 82;}

                        else if ( (LA14_49=='-') ) {s = 83;}

                        else if ( (LA14_49=='\"') ) {s = 84;}

                        else if ( (LA14_49=='^') ) {s = 85;}

                        else if ( (LA14_49=='{') ) {s = 86;}

                        else if ( (LA14_49=='}') ) {s = 87;}

                        else if ( (LA14_49=='\\') ) {s = 88;}

                        else if ( (LA14_49=='$') ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}