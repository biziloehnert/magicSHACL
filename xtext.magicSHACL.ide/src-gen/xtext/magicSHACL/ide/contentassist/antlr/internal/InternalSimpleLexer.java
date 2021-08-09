package xtext.magicSHACL.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_UNICODE=4;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSimpleLexer() {;} 
    public InternalSimpleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSimple.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimple.g:11:7: ( 'MIN' )
            // InternalSimple.g:11:9: 'MIN'
            {
            match("MIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimple.g:12:7: ( 'MAX' )
            // InternalSimple.g:12:9: 'MAX'
            {
            match("MAX"); 


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
            // InternalSimple.g:13:7: ( 'AND' )
            // InternalSimple.g:13:9: 'AND'
            {
            match("AND"); 


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
            // InternalSimple.g:14:7: ( 'OR' )
            // InternalSimple.g:14:9: 'OR'
            {
            match("OR"); 


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
            // InternalSimple.g:15:7: ( 'NOT' )
            // InternalSimple.g:15:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalSimple.g:16:7: ( 'SOME ' )
            // InternalSimple.g:16:9: 'SOME '
            {
            match("SOME "); 


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
            // InternalSimple.g:17:7: ( 'SOME ^' )
            // InternalSimple.g:17:9: 'SOME ^'
            {
            match("SOME ^"); 


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
            // InternalSimple.g:18:7: ( '(' )
            // InternalSimple.g:18:9: '('
            {
            match('('); 

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
            // InternalSimple.g:19:7: ( ')' )
            // InternalSimple.g:19:9: ')'
            {
            match(')'); 

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
            // InternalSimple.g:20:7: ( '?' )
            // InternalSimple.g:20:9: '?'
            {
            match('?'); 

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
            // InternalSimple.g:21:7: ( ':-' )
            // InternalSimple.g:21:9: ':-'
            {
            match(":-"); 


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
            // InternalSimple.g:22:7: ( ';' )
            // InternalSimple.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_UNICODE"
    public final void mRULE_UNICODE() throws RecognitionException {
        try {
            int _type = RULE_UNICODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimple.g:1315:14: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )* )
            // InternalSimple.g:1315:16: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            {
            // InternalSimple.g:1315:16: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimple.g:1315:16: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalSimple.g:1315:21: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            loop2:
            do {
                int alt2=15;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalSimple.g:1315:22: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSimple.g:1315:31: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalSimple.g:1315:40: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalSimple.g:1315:49: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalSimple.g:1315:53: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalSimple.g:1315:57: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalSimple.g:1315:61: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalSimple.g:1315:65: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalSimple.g:1315:69: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 10 :
            	    // InternalSimple.g:1315:73: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;
            	case 11 :
            	    // InternalSimple.g:1315:77: '{'
            	    {
            	    match('{'); 

            	    }
            	    break;
            	case 12 :
            	    // InternalSimple.g:1315:81: '}'
            	    {
            	    match('}'); 

            	    }
            	    break;
            	case 13 :
            	    // InternalSimple.g:1315:85: '\\\\'
            	    {
            	    match('\\'); 

            	    }
            	    break;
            	case 14 :
            	    // InternalSimple.g:1315:90: '$'
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
            // InternalSimple.g:1317:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSimple.g:1317:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSimple.g:1317:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimple.g:1317:11: '^'
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

            // InternalSimple.g:1317:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:
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
            // InternalSimple.g:1319:19: ( ( '0' .. '9' )+ )
            // InternalSimple.g:1319:21: ( '0' .. '9' )+
            {
            // InternalSimple.g:1319:21: ( '0' .. '9' )+
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
            	    // InternalSimple.g:1319:22: '0' .. '9'
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
            // InternalSimple.g:1321:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSimple.g:1321:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSimple.g:1321:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSimple.g:1321:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSimple.g:1321:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSimple.g:1321:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:1321:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSimple.g:1321:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSimple.g:1321:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSimple.g:1321:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:1321:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSimple.g:1323:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSimple.g:1323:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSimple.g:1323:24: ( options {greedy=false; } : . )*
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
            	    // InternalSimple.g:1323:52: .
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
            // InternalSimple.g:1325:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimple.g:1325:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSimple.g:1325:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimple.g:1325:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSimple.g:1325:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimple.g:1325:41: ( '\\r' )? '\\n'
                    {
                    // InternalSimple.g:1325:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSimple.g:1325:41: '\\r'
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
            // InternalSimple.g:1327:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSimple.g:1327:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSimple.g:1327:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalSimple.g:
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
            // InternalSimple.g:1329:16: ( . )
            // InternalSimple.g:1329:18: .
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
        // InternalSimple.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_UNICODE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=19;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalSimple.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSimple.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSimple.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSimple.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSimple.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSimple.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSimple.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSimple.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSimple.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSimple.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSimple.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSimple.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSimple.g:1:82: RULE_UNICODE
                {
                mRULE_UNICODE(); 

                }
                break;
            case 14 :
                // InternalSimple.g:1:95: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalSimple.g:1:103: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalSimple.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalSimple.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalSimple.g:1:147: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalSimple.g:1:155: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\1\1\17\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\1\42\17\uffff";
    static final String DFA2_maxS =
        "\1\175\17\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\13\1\7\1\17\10\uffff\1\12\1\11\1\10\12\4\1\6\6\uffff\32\3\1\uffff\1\16\2\uffff\1\5\1\uffff\32\2\1\14\1\uffff\1\15",
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
            return "()* loopback of 1315:21: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*";
        }
    }
    static final String DFA14_eotS =
        "\6\31\3\uffff\1\31\1\uffff\3\31\1\uffff\1\31\1\uffff\1\31\2\uffff\1\31\5\uffff\1\34\2\uffff\7\31\1\104\2\31\3\uffff\1\107\1\uffff\3\31\1\uffff\12\31\1\uffff\4\31\2\uffff\1\145\1\146\1\147\1\uffff\1\150\1\31\1\uffff\1\31\1\uffff\33\31\4\uffff\1\31\1\154\2\uffff";
    static final String DFA14_eofS =
        "\155\uffff";
    static final String DFA14_minS =
        "\1\0\5\60\3\uffff\1\55\1\uffff\1\101\2\60\1\uffff\1\60\1\uffff\1\52\2\uffff\1\0\5\uffff\1\0\2\uffff\7\60\1\42\2\60\3\uffff\1\42\1\uffff\3\60\1\uffff\12\0\1\uffff\4\0\2\uffff\3\42\1\uffff\1\42\1\60\1\uffff\1\0\1\uffff\33\0\4\uffff\1\40\1\136\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\5\172\3\uffff\1\55\1\uffff\3\172\1\uffff\1\172\1\uffff\1\57\2\uffff\1\uffff\5\uffff\1\uffff\2\uffff\7\172\1\175\2\172\3\uffff\1\175\1\uffff\3\172\1\uffff\12\uffff\1\uffff\4\uffff\2\uffff\3\175\1\uffff\1\175\1\172\1\uffff\1\uffff\1\uffff\33\uffff\4\uffff\1\172\1\136\2\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\10\1\11\1\12\1\uffff\1\14\3\uffff\1\15\1\uffff\1\15\1\uffff\2\15\1\uffff\5\15\1\uffff\1\22\1\23\12\uffff\1\10\1\11\1\12\1\uffff\1\14\3\uffff\1\20\12\uffff\1\15\4\uffff\1\17\1\22\3\uffff\1\4\2\uffff\1\13\1\uffff\1\21\33\uffff\1\1\1\2\1\3\1\5\2\uffff\1\7\1\6";
    static final String DFA14_specialS =
        "\1\10\23\uffff\1\23\5\uffff\1\24\25\uffff\1\5\1\27\1\31\1\3\1\34\1\36\1\40\1\42\1\44\1\46\1\uffff\1\51\1\53\1\1\1\54\11\uffff\1\4\1\uffff\1\6\1\0\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\25\1\26\1\2\1\30\1\32\1\33\1\35\1\37\1\41\1\43\1\45\1\47\1\50\1\52\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\24\1\20\1\30\2\34\1\32\1\6\1\7\3\34\1\23\1\22\1\21\12\16\1\11\1\12\3\34\1\10\1\34\1\2\13\15\1\1\1\4\1\3\3\15\1\5\7\15\1\34\1\27\1\34\1\13\1\17\1\34\32\14\1\25\1\34\1\26\uff82\34",
            "\12\41\7\uffff\1\36\7\40\1\35\21\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\15\40\1\43\14\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\21\40\1\44\10\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\16\40\1\45\13\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\16\40\1\46\13\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "",
            "",
            "\1\52",
            "",
            "\32\55\4\uffff\1\56\1\uffff\32\54",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "",
            "",
            "",
            "",
            "",
            "\0\77",
            "",
            "",
            "\12\41\7\uffff\15\40\1\101\14\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\27\40\1\102\2\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\3\40\1\103\26\40\4\uffff\1\42\1\uffff\32\37",
            "\3\31\10\uffff\3\31\12\41\1\31\6\uffff\32\40\1\uffff\1\31\2\uffff\1\42\1\uffff\32\37\1\31\1\uffff\1\31",
            "\12\41\7\uffff\23\40\1\105\6\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\14\40\1\106\15\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "",
            "",
            "\3\31\10\uffff\16\31\6\uffff\32\31\1\uffff\1\31\2\uffff\1\31\1\uffff\33\31\1\uffff\1\31",
            "",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\140\1\134\1\144\10\77\1\137\1\136\1\135\12\131\1\133\6\77\32\130\1\77\1\143\2\77\1\132\1\77\32\127\1\141\1\77\1\142\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "",
            "",
            "\3\31\10\uffff\3\31\12\41\1\31\6\uffff\32\40\1\uffff\1\31\2\uffff\1\42\1\uffff\32\37\1\31\1\uffff\1\31",
            "\3\31\10\uffff\3\31\12\41\1\31\6\uffff\32\40\1\uffff\1\31\2\uffff\1\42\1\uffff\32\37\1\31\1\uffff\1\31",
            "\3\31\10\uffff\3\31\12\41\1\31\6\uffff\32\40\1\uffff\1\31\2\uffff\1\42\1\uffff\32\37\1\31\1\uffff\1\31",
            "",
            "\3\31\10\uffff\3\31\12\41\1\31\6\uffff\32\40\1\uffff\1\31\2\uffff\1\42\1\uffff\32\37\1\31\1\uffff\1\31",
            "\12\41\7\uffff\4\40\1\151\25\40\4\uffff\1\42\1\uffff\32\37",
            "",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\111\1\122\1\116\1\126\10\111\1\121\1\120\1\117\12\113\1\115\6\111\32\112\1\111\1\125\2\111\1\114\1\111\32\110\1\123\1\111\1\124\uff82\111",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "\42\77\1\72\1\66\1\76\10\77\1\71\1\70\1\67\12\63\1\65\6\77\32\62\1\77\1\75\2\77\1\64\1\77\32\61\1\73\1\77\1\74\uff82\77",
            "",
            "",
            "",
            "",
            "\1\152\17\uffff\12\41\7\uffff\32\40\4\uffff\1\42\1\uffff\32\37",
            "\1\153",
            "",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_UNICODE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_75 = input.LA(1);

                        s = -1;
                        if ( ((LA14_75>='a' && LA14_75<='z')) ) {s = 72;}

                        else if ( ((LA14_75>='A' && LA14_75<='Z')) ) {s = 74;}

                        else if ( ((LA14_75>='0' && LA14_75<='9')) ) {s = 75;}

                        else if ( (LA14_75=='_') ) {s = 76;}

                        else if ( (LA14_75==':') ) {s = 77;}

                        else if ( (LA14_75=='#') ) {s = 78;}

                        else if ( (LA14_75=='/') ) {s = 79;}

                        else if ( (LA14_75=='.') ) {s = 80;}

                        else if ( (LA14_75=='-') ) {s = 81;}

                        else if ( (LA14_75=='\"') ) {s = 82;}

                        else if ( (LA14_75=='{') ) {s = 83;}

                        else if ( (LA14_75=='}') ) {s = 84;}

                        else if ( (LA14_75=='\\') ) {s = 85;}

                        else if ( (LA14_75=='$') ) {s = 86;}

                        else if ( ((LA14_75>='\u0000' && LA14_75<='!')||(LA14_75>='%' && LA14_75<=',')||(LA14_75>=';' && LA14_75<='@')||LA14_75=='['||(LA14_75>=']' && LA14_75<='^')||LA14_75=='`'||LA14_75=='|'||(LA14_75>='~' && LA14_75<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_61 = input.LA(1);

                        s = -1;
                        if ( ((LA14_61>='a' && LA14_61<='z')) ) {s = 87;}

                        else if ( ((LA14_61>='A' && LA14_61<='Z')) ) {s = 88;}

                        else if ( ((LA14_61>='0' && LA14_61<='9')) ) {s = 89;}

                        else if ( (LA14_61=='_') ) {s = 90;}

                        else if ( (LA14_61==':') ) {s = 91;}

                        else if ( (LA14_61=='#') ) {s = 92;}

                        else if ( (LA14_61=='/') ) {s = 93;}

                        else if ( (LA14_61=='.') ) {s = 94;}

                        else if ( (LA14_61=='-') ) {s = 95;}

                        else if ( (LA14_61=='\"') ) {s = 96;}

                        else if ( (LA14_61=='{') ) {s = 97;}

                        else if ( (LA14_61=='}') ) {s = 98;}

                        else if ( (LA14_61=='\\') ) {s = 99;}

                        else if ( (LA14_61=='$') ) {s = 100;}

                        else if ( ((LA14_61>='\u0000' && LA14_61<='!')||(LA14_61>='%' && LA14_61<=',')||(LA14_61>=';' && LA14_61<='@')||LA14_61=='['||(LA14_61>=']' && LA14_61<='^')||LA14_61=='`'||LA14_61=='|'||(LA14_61>='~' && LA14_61<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_89 = input.LA(1);

                        s = -1;
                        if ( ((LA14_89>='a' && LA14_89<='z')) ) {s = 49;}

                        else if ( ((LA14_89>='A' && LA14_89<='Z')) ) {s = 50;}

                        else if ( ((LA14_89>='0' && LA14_89<='9')) ) {s = 51;}

                        else if ( (LA14_89=='_') ) {s = 52;}

                        else if ( (LA14_89==':') ) {s = 53;}

                        else if ( (LA14_89=='#') ) {s = 54;}

                        else if ( (LA14_89=='/') ) {s = 55;}

                        else if ( (LA14_89=='.') ) {s = 56;}

                        else if ( (LA14_89=='-') ) {s = 57;}

                        else if ( (LA14_89=='\"') ) {s = 58;}

                        else if ( (LA14_89=='{') ) {s = 59;}

                        else if ( (LA14_89=='}') ) {s = 60;}

                        else if ( (LA14_89=='\\') ) {s = 61;}

                        else if ( (LA14_89=='$') ) {s = 62;}

                        else if ( ((LA14_89>='\u0000' && LA14_89<='!')||(LA14_89>='%' && LA14_89<=',')||(LA14_89>=';' && LA14_89<='@')||LA14_89=='['||(LA14_89>=']' && LA14_89<='^')||LA14_89=='`'||LA14_89=='|'||(LA14_89>='~' && LA14_89<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( (LA14_51=='\"') ) {s = 58;}

                        else if ( (LA14_51=='\\') ) {s = 61;}

                        else if ( ((LA14_51>='a' && LA14_51<='z')) ) {s = 49;}

                        else if ( ((LA14_51>='A' && LA14_51<='Z')) ) {s = 50;}

                        else if ( ((LA14_51>='0' && LA14_51<='9')) ) {s = 51;}

                        else if ( (LA14_51=='_') ) {s = 52;}

                        else if ( (LA14_51==':') ) {s = 53;}

                        else if ( (LA14_51=='#') ) {s = 54;}

                        else if ( (LA14_51=='/') ) {s = 55;}

                        else if ( (LA14_51=='.') ) {s = 56;}

                        else if ( (LA14_51=='-') ) {s = 57;}

                        else if ( (LA14_51=='{') ) {s = 59;}

                        else if ( (LA14_51=='}') ) {s = 60;}

                        else if ( (LA14_51=='$') ) {s = 62;}

                        else if ( ((LA14_51>='\u0000' && LA14_51<='!')||(LA14_51>='%' && LA14_51<=',')||(LA14_51>=';' && LA14_51<='@')||LA14_51=='['||(LA14_51>=']' && LA14_51<='^')||LA14_51=='`'||LA14_51=='|'||(LA14_51>='~' && LA14_51<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_72 = input.LA(1);

                        s = -1;
                        if ( ((LA14_72>='\u0000' && LA14_72<='!')||(LA14_72>='%' && LA14_72<=',')||(LA14_72>=';' && LA14_72<='@')||LA14_72=='['||(LA14_72>=']' && LA14_72<='^')||LA14_72=='`'||LA14_72=='|'||(LA14_72>='~' && LA14_72<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA14_72>='a' && LA14_72<='z')) ) {s = 72;}

                        else if ( ((LA14_72>='A' && LA14_72<='Z')) ) {s = 74;}

                        else if ( ((LA14_72>='0' && LA14_72<='9')) ) {s = 75;}

                        else if ( (LA14_72=='_') ) {s = 76;}

                        else if ( (LA14_72==':') ) {s = 77;}

                        else if ( (LA14_72=='#') ) {s = 78;}

                        else if ( (LA14_72=='/') ) {s = 79;}

                        else if ( (LA14_72=='.') ) {s = 80;}

                        else if ( (LA14_72=='-') ) {s = 81;}

                        else if ( (LA14_72=='\"') ) {s = 82;}

                        else if ( (LA14_72=='{') ) {s = 83;}

                        else if ( (LA14_72=='}') ) {s = 84;}

                        else if ( (LA14_72=='\\') ) {s = 85;}

                        else if ( (LA14_72=='$') ) {s = 86;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( ((LA14_48>='a' && LA14_48<='z')) ) {s = 72;}

                        else if ( ((LA14_48>='\u0000' && LA14_48<='!')||(LA14_48>='%' && LA14_48<=',')||(LA14_48>=';' && LA14_48<='@')||LA14_48=='['||(LA14_48>=']' && LA14_48<='^')||LA14_48=='`'||LA14_48=='|'||(LA14_48>='~' && LA14_48<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA14_48>='A' && LA14_48<='Z')) ) {s = 74;}

                        else if ( ((LA14_48>='0' && LA14_48<='9')) ) {s = 75;}

                        else if ( (LA14_48=='_') ) {s = 76;}

                        else if ( (LA14_48==':') ) {s = 77;}

                        else if ( (LA14_48=='#') ) {s = 78;}

                        else if ( (LA14_48=='/') ) {s = 79;}

                        else if ( (LA14_48=='.') ) {s = 80;}

                        else if ( (LA14_48=='-') ) {s = 81;}

                        else if ( (LA14_48=='\"') ) {s = 82;}

                        else if ( (LA14_48=='{') ) {s = 83;}

                        else if ( (LA14_48=='}') ) {s = 84;}

                        else if ( (LA14_48=='\\') ) {s = 85;}

                        else if ( (LA14_48=='$') ) {s = 86;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_74 = input.LA(1);

                        s = -1;
                        if ( ((LA14_74>='a' && LA14_74<='z')) ) {s = 72;}

                        else if ( ((LA14_74>='A' && LA14_74<='Z')) ) {s = 74;}

                        else if ( ((LA14_74>='0' && LA14_74<='9')) ) {s = 75;}

                        else if ( (LA14_74=='_') ) {s = 76;}

                        else if ( (LA14_74==':') ) {s = 77;}

                        else if ( (LA14_74=='#') ) {s = 78;}

                        else if ( (LA14_74=='/') ) {s = 79;}

                        else if ( (LA14_74=='.') ) {s = 80;}

                        else if ( (LA14_74=='-') ) {s = 81;}

                        else if ( (LA14_74=='\"') ) {s = 82;}

                        else if ( (LA14_74=='{') ) {s = 83;}

                        else if ( (LA14_74=='}') ) {s = 84;}

                        else if ( (LA14_74=='\\') ) {s = 85;}

                        else if ( (LA14_74=='$') ) {s = 86;}

                        else if ( ((LA14_74>='\u0000' && LA14_74<='!')||(LA14_74>='%' && LA14_74<=',')||(LA14_74>=';' && LA14_74<='@')||LA14_74=='['||(LA14_74>=']' && LA14_74<='^')||LA14_74=='`'||LA14_74=='|'||(LA14_74>='~' && LA14_74<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_76 = input.LA(1);

                        s = -1;
                        if ( ((LA14_76>='a' && LA14_76<='z')) ) {s = 72;}

                        else if ( ((LA14_76>='A' && LA14_76<='Z')) ) {s = 74;}

                        else if ( ((LA14_76>='0' && LA14_76<='9')) ) {s = 75;}

                        else if ( (LA14_76=='_') ) {s = 76;}

                        else if ( (LA14_76==':') ) {s = 77;}

                        else if ( (LA14_76=='#') ) {s = 78;}

                        else if ( (LA14_76=='/') ) {s = 79;}

                        else if ( (LA14_76=='.') ) {s = 80;}

                        else if ( (LA14_76=='-') ) {s = 81;}

                        else if ( (LA14_76=='\"') ) {s = 82;}

                        else if ( (LA14_76=='{') ) {s = 83;}

                        else if ( (LA14_76=='}') ) {s = 84;}

                        else if ( (LA14_76=='\\') ) {s = 85;}

                        else if ( (LA14_76=='$') ) {s = 86;}

                        else if ( ((LA14_76>='\u0000' && LA14_76<='!')||(LA14_76>='%' && LA14_76<=',')||(LA14_76>=';' && LA14_76<='@')||LA14_76=='['||(LA14_76>=']' && LA14_76<='^')||LA14_76=='`'||LA14_76=='|'||(LA14_76>='~' && LA14_76<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='M') ) {s = 1;}

                        else if ( (LA14_0=='A') ) {s = 2;}

                        else if ( (LA14_0=='O') ) {s = 3;}

                        else if ( (LA14_0=='N') ) {s = 4;}

                        else if ( (LA14_0=='S') ) {s = 5;}

                        else if ( (LA14_0=='(') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='?') ) {s = 8;}

                        else if ( (LA14_0==':') ) {s = 9;}

                        else if ( (LA14_0==';') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( ((LA14_0>='a' && LA14_0<='z')) ) {s = 12;}

                        else if ( ((LA14_0>='B' && LA14_0<='L')||(LA14_0>='P' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')) ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='_') ) {s = 15;}

                        else if ( (LA14_0=='#') ) {s = 16;}

                        else if ( (LA14_0=='/') ) {s = 17;}

                        else if ( (LA14_0=='.') ) {s = 18;}

                        else if ( (LA14_0=='-') ) {s = 19;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='{') ) {s = 21;}

                        else if ( (LA14_0=='}') ) {s = 22;}

                        else if ( (LA14_0=='\\') ) {s = 23;}

                        else if ( (LA14_0=='$') ) {s = 24;}

                        else if ( (LA14_0=='\'') ) {s = 26;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 27;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||(LA14_0>='<' && LA14_0<='>')||LA14_0=='@'||LA14_0=='['||LA14_0==']'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 28;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_77 = input.LA(1);

                        s = -1;
                        if ( ((LA14_77>='a' && LA14_77<='z')) ) {s = 72;}

                        else if ( ((LA14_77>='A' && LA14_77<='Z')) ) {s = 74;}

                        else if ( ((LA14_77>='0' && LA14_77<='9')) ) {s = 75;}

                        else if ( (LA14_77=='_') ) {s = 76;}

                        else if ( (LA14_77==':') ) {s = 77;}

                        else if ( (LA14_77=='#') ) {s = 78;}

                        else if ( (LA14_77=='/') ) {s = 79;}

                        else if ( (LA14_77=='.') ) {s = 80;}

                        else if ( (LA14_77=='-') ) {s = 81;}

                        else if ( (LA14_77=='\"') ) {s = 82;}

                        else if ( (LA14_77=='{') ) {s = 83;}

                        else if ( (LA14_77=='}') ) {s = 84;}

                        else if ( (LA14_77=='\\') ) {s = 85;}

                        else if ( (LA14_77=='$') ) {s = 86;}

                        else if ( ((LA14_77>='\u0000' && LA14_77<='!')||(LA14_77>='%' && LA14_77<=',')||(LA14_77>=';' && LA14_77<='@')||LA14_77=='['||(LA14_77>=']' && LA14_77<='^')||LA14_77=='`'||LA14_77=='|'||(LA14_77>='~' && LA14_77<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_78 = input.LA(1);

                        s = -1;
                        if ( ((LA14_78>='a' && LA14_78<='z')) ) {s = 72;}

                        else if ( ((LA14_78>='A' && LA14_78<='Z')) ) {s = 74;}

                        else if ( ((LA14_78>='0' && LA14_78<='9')) ) {s = 75;}

                        else if ( (LA14_78=='_') ) {s = 76;}

                        else if ( (LA14_78==':') ) {s = 77;}

                        else if ( (LA14_78=='#') ) {s = 78;}

                        else if ( (LA14_78=='/') ) {s = 79;}

                        else if ( (LA14_78=='.') ) {s = 80;}

                        else if ( (LA14_78=='-') ) {s = 81;}

                        else if ( (LA14_78=='\"') ) {s = 82;}

                        else if ( (LA14_78=='{') ) {s = 83;}

                        else if ( (LA14_78=='}') ) {s = 84;}

                        else if ( (LA14_78=='\\') ) {s = 85;}

                        else if ( (LA14_78=='$') ) {s = 86;}

                        else if ( ((LA14_78>='\u0000' && LA14_78<='!')||(LA14_78>='%' && LA14_78<=',')||(LA14_78>=';' && LA14_78<='@')||LA14_78=='['||(LA14_78>=']' && LA14_78<='^')||LA14_78=='`'||LA14_78=='|'||(LA14_78>='~' && LA14_78<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_79 = input.LA(1);

                        s = -1;
                        if ( ((LA14_79>='a' && LA14_79<='z')) ) {s = 72;}

                        else if ( ((LA14_79>='A' && LA14_79<='Z')) ) {s = 74;}

                        else if ( ((LA14_79>='0' && LA14_79<='9')) ) {s = 75;}

                        else if ( (LA14_79=='_') ) {s = 76;}

                        else if ( (LA14_79==':') ) {s = 77;}

                        else if ( (LA14_79=='#') ) {s = 78;}

                        else if ( (LA14_79=='/') ) {s = 79;}

                        else if ( (LA14_79=='.') ) {s = 80;}

                        else if ( (LA14_79=='-') ) {s = 81;}

                        else if ( (LA14_79=='\"') ) {s = 82;}

                        else if ( (LA14_79=='{') ) {s = 83;}

                        else if ( (LA14_79=='}') ) {s = 84;}

                        else if ( (LA14_79=='\\') ) {s = 85;}

                        else if ( (LA14_79=='$') ) {s = 86;}

                        else if ( ((LA14_79>='\u0000' && LA14_79<='!')||(LA14_79>='%' && LA14_79<=',')||(LA14_79>=';' && LA14_79<='@')||LA14_79=='['||(LA14_79>=']' && LA14_79<='^')||LA14_79=='`'||LA14_79=='|'||(LA14_79>='~' && LA14_79<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_80 = input.LA(1);

                        s = -1;
                        if ( ((LA14_80>='a' && LA14_80<='z')) ) {s = 72;}

                        else if ( ((LA14_80>='A' && LA14_80<='Z')) ) {s = 74;}

                        else if ( ((LA14_80>='0' && LA14_80<='9')) ) {s = 75;}

                        else if ( (LA14_80=='_') ) {s = 76;}

                        else if ( (LA14_80==':') ) {s = 77;}

                        else if ( (LA14_80=='#') ) {s = 78;}

                        else if ( (LA14_80=='/') ) {s = 79;}

                        else if ( (LA14_80=='.') ) {s = 80;}

                        else if ( (LA14_80=='-') ) {s = 81;}

                        else if ( (LA14_80=='\"') ) {s = 82;}

                        else if ( (LA14_80=='{') ) {s = 83;}

                        else if ( (LA14_80=='}') ) {s = 84;}

                        else if ( (LA14_80=='\\') ) {s = 85;}

                        else if ( (LA14_80=='$') ) {s = 86;}

                        else if ( ((LA14_80>='\u0000' && LA14_80<='!')||(LA14_80>='%' && LA14_80<=',')||(LA14_80>=';' && LA14_80<='@')||LA14_80=='['||(LA14_80>=']' && LA14_80<='^')||LA14_80=='`'||LA14_80=='|'||(LA14_80>='~' && LA14_80<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_81 = input.LA(1);

                        s = -1;
                        if ( ((LA14_81>='\u0000' && LA14_81<='!')||(LA14_81>='%' && LA14_81<=',')||(LA14_81>=';' && LA14_81<='@')||LA14_81=='['||(LA14_81>=']' && LA14_81<='^')||LA14_81=='`'||LA14_81=='|'||(LA14_81>='~' && LA14_81<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA14_81>='a' && LA14_81<='z')) ) {s = 72;}

                        else if ( ((LA14_81>='A' && LA14_81<='Z')) ) {s = 74;}

                        else if ( ((LA14_81>='0' && LA14_81<='9')) ) {s = 75;}

                        else if ( (LA14_81=='_') ) {s = 76;}

                        else if ( (LA14_81==':') ) {s = 77;}

                        else if ( (LA14_81=='#') ) {s = 78;}

                        else if ( (LA14_81=='/') ) {s = 79;}

                        else if ( (LA14_81=='.') ) {s = 80;}

                        else if ( (LA14_81=='-') ) {s = 81;}

                        else if ( (LA14_81=='\"') ) {s = 82;}

                        else if ( (LA14_81=='{') ) {s = 83;}

                        else if ( (LA14_81=='}') ) {s = 84;}

                        else if ( (LA14_81=='\\') ) {s = 85;}

                        else if ( (LA14_81=='$') ) {s = 86;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( ((LA14_82>='a' && LA14_82<='z')) ) {s = 72;}

                        else if ( ((LA14_82>='A' && LA14_82<='Z')) ) {s = 74;}

                        else if ( ((LA14_82>='0' && LA14_82<='9')) ) {s = 75;}

                        else if ( (LA14_82=='_') ) {s = 76;}

                        else if ( (LA14_82==':') ) {s = 77;}

                        else if ( (LA14_82=='#') ) {s = 78;}

                        else if ( (LA14_82=='/') ) {s = 79;}

                        else if ( (LA14_82=='.') ) {s = 80;}

                        else if ( (LA14_82=='-') ) {s = 81;}

                        else if ( (LA14_82=='\"') ) {s = 82;}

                        else if ( (LA14_82=='{') ) {s = 83;}

                        else if ( (LA14_82=='}') ) {s = 84;}

                        else if ( (LA14_82=='\\') ) {s = 85;}

                        else if ( (LA14_82=='$') ) {s = 86;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<='!')||(LA14_82>='%' && LA14_82<=',')||(LA14_82>=';' && LA14_82<='@')||LA14_82=='['||(LA14_82>=']' && LA14_82<='^')||LA14_82=='`'||LA14_82=='|'||(LA14_82>='~' && LA14_82<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( ((LA14_83>='a' && LA14_83<='z')) ) {s = 72;}

                        else if ( ((LA14_83>='A' && LA14_83<='Z')) ) {s = 74;}

                        else if ( ((LA14_83>='0' && LA14_83<='9')) ) {s = 75;}

                        else if ( (LA14_83=='_') ) {s = 76;}

                        else if ( (LA14_83==':') ) {s = 77;}

                        else if ( (LA14_83=='#') ) {s = 78;}

                        else if ( (LA14_83=='/') ) {s = 79;}

                        else if ( (LA14_83=='.') ) {s = 80;}

                        else if ( (LA14_83=='-') ) {s = 81;}

                        else if ( (LA14_83=='\"') ) {s = 82;}

                        else if ( (LA14_83=='{') ) {s = 83;}

                        else if ( (LA14_83=='}') ) {s = 84;}

                        else if ( (LA14_83=='\\') ) {s = 85;}

                        else if ( (LA14_83=='$') ) {s = 86;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<='!')||(LA14_83>='%' && LA14_83<=',')||(LA14_83>=';' && LA14_83<='@')||LA14_83=='['||(LA14_83>=']' && LA14_83<='^')||LA14_83=='`'||LA14_83=='|'||(LA14_83>='~' && LA14_83<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_84 = input.LA(1);

                        s = -1;
                        if ( ((LA14_84>='a' && LA14_84<='z')) ) {s = 72;}

                        else if ( ((LA14_84>='A' && LA14_84<='Z')) ) {s = 74;}

                        else if ( ((LA14_84>='0' && LA14_84<='9')) ) {s = 75;}

                        else if ( (LA14_84=='_') ) {s = 76;}

                        else if ( (LA14_84==':') ) {s = 77;}

                        else if ( (LA14_84=='#') ) {s = 78;}

                        else if ( (LA14_84=='/') ) {s = 79;}

                        else if ( (LA14_84=='.') ) {s = 80;}

                        else if ( (LA14_84=='-') ) {s = 81;}

                        else if ( (LA14_84=='\"') ) {s = 82;}

                        else if ( (LA14_84=='{') ) {s = 83;}

                        else if ( (LA14_84=='}') ) {s = 84;}

                        else if ( (LA14_84=='\\') ) {s = 85;}

                        else if ( (LA14_84=='$') ) {s = 86;}

                        else if ( ((LA14_84>='\u0000' && LA14_84<='!')||(LA14_84>='%' && LA14_84<=',')||(LA14_84>=';' && LA14_84<='@')||LA14_84=='['||(LA14_84>=']' && LA14_84<='^')||LA14_84=='`'||LA14_84=='|'||(LA14_84>='~' && LA14_84<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( ((LA14_85>='a' && LA14_85<='z')) ) {s = 72;}

                        else if ( ((LA14_85>='A' && LA14_85<='Z')) ) {s = 74;}

                        else if ( ((LA14_85>='0' && LA14_85<='9')) ) {s = 75;}

                        else if ( (LA14_85=='_') ) {s = 76;}

                        else if ( (LA14_85==':') ) {s = 77;}

                        else if ( (LA14_85=='#') ) {s = 78;}

                        else if ( (LA14_85=='/') ) {s = 79;}

                        else if ( (LA14_85=='.') ) {s = 80;}

                        else if ( (LA14_85=='-') ) {s = 81;}

                        else if ( (LA14_85=='\"') ) {s = 82;}

                        else if ( (LA14_85=='{') ) {s = 83;}

                        else if ( (LA14_85=='}') ) {s = 84;}

                        else if ( (LA14_85=='\\') ) {s = 85;}

                        else if ( (LA14_85=='$') ) {s = 86;}

                        else if ( ((LA14_85>='\u0000' && LA14_85<='!')||(LA14_85>='%' && LA14_85<=',')||(LA14_85>=';' && LA14_85<='@')||LA14_85=='['||(LA14_85>=']' && LA14_85<='^')||LA14_85=='`'||LA14_85=='|'||(LA14_85>='~' && LA14_85<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( ((LA14_86>='a' && LA14_86<='z')) ) {s = 72;}

                        else if ( ((LA14_86>='A' && LA14_86<='Z')) ) {s = 74;}

                        else if ( ((LA14_86>='0' && LA14_86<='9')) ) {s = 75;}

                        else if ( (LA14_86=='_') ) {s = 76;}

                        else if ( (LA14_86==':') ) {s = 77;}

                        else if ( (LA14_86=='#') ) {s = 78;}

                        else if ( (LA14_86=='/') ) {s = 79;}

                        else if ( (LA14_86=='.') ) {s = 80;}

                        else if ( (LA14_86=='-') ) {s = 81;}

                        else if ( (LA14_86=='\"') ) {s = 82;}

                        else if ( (LA14_86=='{') ) {s = 83;}

                        else if ( (LA14_86=='}') ) {s = 84;}

                        else if ( (LA14_86=='\\') ) {s = 85;}

                        else if ( (LA14_86=='$') ) {s = 86;}

                        else if ( ((LA14_86>='\u0000' && LA14_86<='!')||(LA14_86>='%' && LA14_86<=',')||(LA14_86>=';' && LA14_86<='@')||LA14_86=='['||(LA14_86>=']' && LA14_86<='^')||LA14_86=='`'||LA14_86=='|'||(LA14_86>='~' && LA14_86<='\uFFFF')) ) {s = 73;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='a' && LA14_20<='z')) ) {s = 49;}

                        else if ( ((LA14_20>='A' && LA14_20<='Z')) ) {s = 50;}

                        else if ( ((LA14_20>='0' && LA14_20<='9')) ) {s = 51;}

                        else if ( (LA14_20=='_') ) {s = 52;}

                        else if ( (LA14_20==':') ) {s = 53;}

                        else if ( (LA14_20=='#') ) {s = 54;}

                        else if ( (LA14_20=='/') ) {s = 55;}

                        else if ( (LA14_20=='.') ) {s = 56;}

                        else if ( (LA14_20=='-') ) {s = 57;}

                        else if ( (LA14_20=='\"') ) {s = 58;}

                        else if ( (LA14_20=='{') ) {s = 59;}

                        else if ( (LA14_20=='}') ) {s = 60;}

                        else if ( (LA14_20=='\\') ) {s = 61;}

                        else if ( (LA14_20=='$') ) {s = 62;}

                        else if ( ((LA14_20>='\u0000' && LA14_20<='!')||(LA14_20>='%' && LA14_20<=',')||(LA14_20>=';' && LA14_20<='@')||LA14_20=='['||(LA14_20>=']' && LA14_20<='^')||LA14_20=='`'||LA14_20=='|'||(LA14_20>='~' && LA14_20<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 63;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_87 = input.LA(1);

                        s = -1;
                        if ( (LA14_87=='\"') ) {s = 58;}

                        else if ( (LA14_87=='\\') ) {s = 61;}

                        else if ( ((LA14_87>='a' && LA14_87<='z')) ) {s = 49;}

                        else if ( ((LA14_87>='A' && LA14_87<='Z')) ) {s = 50;}

                        else if ( ((LA14_87>='0' && LA14_87<='9')) ) {s = 51;}

                        else if ( (LA14_87=='_') ) {s = 52;}

                        else if ( (LA14_87==':') ) {s = 53;}

                        else if ( (LA14_87=='#') ) {s = 54;}

                        else if ( (LA14_87=='/') ) {s = 55;}

                        else if ( (LA14_87=='.') ) {s = 56;}

                        else if ( (LA14_87=='-') ) {s = 57;}

                        else if ( (LA14_87=='{') ) {s = 59;}

                        else if ( (LA14_87=='}') ) {s = 60;}

                        else if ( (LA14_87=='$') ) {s = 62;}

                        else if ( ((LA14_87>='\u0000' && LA14_87<='!')||(LA14_87>='%' && LA14_87<=',')||(LA14_87>=';' && LA14_87<='@')||LA14_87=='['||(LA14_87>=']' && LA14_87<='^')||LA14_87=='`'||LA14_87=='|'||(LA14_87>='~' && LA14_87<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_88 = input.LA(1);

                        s = -1;
                        if ( ((LA14_88>='a' && LA14_88<='z')) ) {s = 49;}

                        else if ( ((LA14_88>='A' && LA14_88<='Z')) ) {s = 50;}

                        else if ( ((LA14_88>='0' && LA14_88<='9')) ) {s = 51;}

                        else if ( (LA14_88=='_') ) {s = 52;}

                        else if ( (LA14_88==':') ) {s = 53;}

                        else if ( (LA14_88=='#') ) {s = 54;}

                        else if ( (LA14_88=='/') ) {s = 55;}

                        else if ( (LA14_88=='.') ) {s = 56;}

                        else if ( (LA14_88=='-') ) {s = 57;}

                        else if ( (LA14_88=='\"') ) {s = 58;}

                        else if ( (LA14_88=='{') ) {s = 59;}

                        else if ( (LA14_88=='}') ) {s = 60;}

                        else if ( (LA14_88=='\\') ) {s = 61;}

                        else if ( (LA14_88=='$') ) {s = 62;}

                        else if ( ((LA14_88>='\u0000' && LA14_88<='!')||(LA14_88>='%' && LA14_88<=',')||(LA14_88>=';' && LA14_88<='@')||LA14_88=='['||(LA14_88>=']' && LA14_88<='^')||LA14_88=='`'||LA14_88=='|'||(LA14_88>='~' && LA14_88<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( (LA14_49=='\"') ) {s = 58;}

                        else if ( (LA14_49=='\\') ) {s = 61;}

                        else if ( ((LA14_49>='a' && LA14_49<='z')) ) {s = 49;}

                        else if ( ((LA14_49>='A' && LA14_49<='Z')) ) {s = 50;}

                        else if ( ((LA14_49>='0' && LA14_49<='9')) ) {s = 51;}

                        else if ( (LA14_49=='_') ) {s = 52;}

                        else if ( (LA14_49==':') ) {s = 53;}

                        else if ( (LA14_49=='#') ) {s = 54;}

                        else if ( (LA14_49=='/') ) {s = 55;}

                        else if ( (LA14_49=='.') ) {s = 56;}

                        else if ( (LA14_49=='-') ) {s = 57;}

                        else if ( (LA14_49=='{') ) {s = 59;}

                        else if ( (LA14_49=='}') ) {s = 60;}

                        else if ( (LA14_49=='$') ) {s = 62;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='!')||(LA14_49>='%' && LA14_49<=',')||(LA14_49>=';' && LA14_49<='@')||LA14_49=='['||(LA14_49>=']' && LA14_49<='^')||LA14_49=='`'||LA14_49=='|'||(LA14_49>='~' && LA14_49<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_90 = input.LA(1);

                        s = -1;
                        if ( ((LA14_90>='a' && LA14_90<='z')) ) {s = 49;}

                        else if ( ((LA14_90>='A' && LA14_90<='Z')) ) {s = 50;}

                        else if ( ((LA14_90>='0' && LA14_90<='9')) ) {s = 51;}

                        else if ( (LA14_90=='_') ) {s = 52;}

                        else if ( (LA14_90==':') ) {s = 53;}

                        else if ( (LA14_90=='#') ) {s = 54;}

                        else if ( (LA14_90=='/') ) {s = 55;}

                        else if ( (LA14_90=='.') ) {s = 56;}

                        else if ( (LA14_90=='-') ) {s = 57;}

                        else if ( (LA14_90=='\"') ) {s = 58;}

                        else if ( (LA14_90=='{') ) {s = 59;}

                        else if ( (LA14_90=='}') ) {s = 60;}

                        else if ( (LA14_90=='\\') ) {s = 61;}

                        else if ( (LA14_90=='$') ) {s = 62;}

                        else if ( ((LA14_90>='\u0000' && LA14_90<='!')||(LA14_90>='%' && LA14_90<=',')||(LA14_90>=';' && LA14_90<='@')||LA14_90=='['||(LA14_90>=']' && LA14_90<='^')||LA14_90=='`'||LA14_90=='|'||(LA14_90>='~' && LA14_90<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( ((LA14_50>='a' && LA14_50<='z')) ) {s = 49;}

                        else if ( ((LA14_50>='A' && LA14_50<='Z')) ) {s = 50;}

                        else if ( ((LA14_50>='0' && LA14_50<='9')) ) {s = 51;}

                        else if ( (LA14_50=='_') ) {s = 52;}

                        else if ( (LA14_50==':') ) {s = 53;}

                        else if ( (LA14_50=='#') ) {s = 54;}

                        else if ( (LA14_50=='/') ) {s = 55;}

                        else if ( (LA14_50=='.') ) {s = 56;}

                        else if ( (LA14_50=='-') ) {s = 57;}

                        else if ( (LA14_50=='\"') ) {s = 58;}

                        else if ( (LA14_50=='{') ) {s = 59;}

                        else if ( (LA14_50=='}') ) {s = 60;}

                        else if ( (LA14_50=='\\') ) {s = 61;}

                        else if ( (LA14_50=='$') ) {s = 62;}

                        else if ( ((LA14_50>='\u0000' && LA14_50<='!')||(LA14_50>='%' && LA14_50<=',')||(LA14_50>=';' && LA14_50<='@')||LA14_50=='['||(LA14_50>=']' && LA14_50<='^')||LA14_50=='`'||LA14_50=='|'||(LA14_50>='~' && LA14_50<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_91 = input.LA(1);

                        s = -1;
                        if ( ((LA14_91>='a' && LA14_91<='z')) ) {s = 49;}

                        else if ( ((LA14_91>='A' && LA14_91<='Z')) ) {s = 50;}

                        else if ( ((LA14_91>='0' && LA14_91<='9')) ) {s = 51;}

                        else if ( (LA14_91=='_') ) {s = 52;}

                        else if ( (LA14_91==':') ) {s = 53;}

                        else if ( (LA14_91=='#') ) {s = 54;}

                        else if ( (LA14_91=='/') ) {s = 55;}

                        else if ( (LA14_91=='.') ) {s = 56;}

                        else if ( (LA14_91=='-') ) {s = 57;}

                        else if ( (LA14_91=='\"') ) {s = 58;}

                        else if ( (LA14_91=='{') ) {s = 59;}

                        else if ( (LA14_91=='}') ) {s = 60;}

                        else if ( (LA14_91=='\\') ) {s = 61;}

                        else if ( (LA14_91=='$') ) {s = 62;}

                        else if ( ((LA14_91>='\u0000' && LA14_91<='!')||(LA14_91>='%' && LA14_91<=',')||(LA14_91>=';' && LA14_91<='@')||LA14_91=='['||(LA14_91>=']' && LA14_91<='^')||LA14_91=='`'||LA14_91=='|'||(LA14_91>='~' && LA14_91<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_92 = input.LA(1);

                        s = -1;
                        if ( ((LA14_92>='a' && LA14_92<='z')) ) {s = 49;}

                        else if ( ((LA14_92>='A' && LA14_92<='Z')) ) {s = 50;}

                        else if ( ((LA14_92>='0' && LA14_92<='9')) ) {s = 51;}

                        else if ( (LA14_92=='_') ) {s = 52;}

                        else if ( (LA14_92==':') ) {s = 53;}

                        else if ( (LA14_92=='#') ) {s = 54;}

                        else if ( (LA14_92=='/') ) {s = 55;}

                        else if ( (LA14_92=='.') ) {s = 56;}

                        else if ( (LA14_92=='-') ) {s = 57;}

                        else if ( (LA14_92=='\"') ) {s = 58;}

                        else if ( (LA14_92=='{') ) {s = 59;}

                        else if ( (LA14_92=='}') ) {s = 60;}

                        else if ( (LA14_92=='\\') ) {s = 61;}

                        else if ( (LA14_92=='$') ) {s = 62;}

                        else if ( ((LA14_92>='\u0000' && LA14_92<='!')||(LA14_92>='%' && LA14_92<=',')||(LA14_92>=';' && LA14_92<='@')||LA14_92=='['||(LA14_92>=']' && LA14_92<='^')||LA14_92=='`'||LA14_92=='|'||(LA14_92>='~' && LA14_92<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( (LA14_52=='\"') ) {s = 58;}

                        else if ( (LA14_52=='\\') ) {s = 61;}

                        else if ( ((LA14_52>='a' && LA14_52<='z')) ) {s = 49;}

                        else if ( ((LA14_52>='A' && LA14_52<='Z')) ) {s = 50;}

                        else if ( ((LA14_52>='0' && LA14_52<='9')) ) {s = 51;}

                        else if ( (LA14_52=='_') ) {s = 52;}

                        else if ( (LA14_52==':') ) {s = 53;}

                        else if ( (LA14_52=='#') ) {s = 54;}

                        else if ( (LA14_52=='/') ) {s = 55;}

                        else if ( (LA14_52=='.') ) {s = 56;}

                        else if ( (LA14_52=='-') ) {s = 57;}

                        else if ( (LA14_52=='{') ) {s = 59;}

                        else if ( (LA14_52=='}') ) {s = 60;}

                        else if ( (LA14_52=='$') ) {s = 62;}

                        else if ( ((LA14_52>='\u0000' && LA14_52<='!')||(LA14_52>='%' && LA14_52<=',')||(LA14_52>=';' && LA14_52<='@')||LA14_52=='['||(LA14_52>=']' && LA14_52<='^')||LA14_52=='`'||LA14_52=='|'||(LA14_52>='~' && LA14_52<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_93 = input.LA(1);

                        s = -1;
                        if ( ((LA14_93>='a' && LA14_93<='z')) ) {s = 49;}

                        else if ( ((LA14_93>='A' && LA14_93<='Z')) ) {s = 50;}

                        else if ( ((LA14_93>='0' && LA14_93<='9')) ) {s = 51;}

                        else if ( (LA14_93=='_') ) {s = 52;}

                        else if ( (LA14_93==':') ) {s = 53;}

                        else if ( (LA14_93=='#') ) {s = 54;}

                        else if ( (LA14_93=='/') ) {s = 55;}

                        else if ( (LA14_93=='.') ) {s = 56;}

                        else if ( (LA14_93=='-') ) {s = 57;}

                        else if ( (LA14_93=='\"') ) {s = 58;}

                        else if ( (LA14_93=='{') ) {s = 59;}

                        else if ( (LA14_93=='}') ) {s = 60;}

                        else if ( (LA14_93=='\\') ) {s = 61;}

                        else if ( (LA14_93=='$') ) {s = 62;}

                        else if ( ((LA14_93>='\u0000' && LA14_93<='!')||(LA14_93>='%' && LA14_93<=',')||(LA14_93>=';' && LA14_93<='@')||LA14_93=='['||(LA14_93>=']' && LA14_93<='^')||LA14_93=='`'||LA14_93=='|'||(LA14_93>='~' && LA14_93<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( (LA14_53=='\"') ) {s = 58;}

                        else if ( (LA14_53=='\\') ) {s = 61;}

                        else if ( ((LA14_53>='a' && LA14_53<='z')) ) {s = 49;}

                        else if ( ((LA14_53>='A' && LA14_53<='Z')) ) {s = 50;}

                        else if ( ((LA14_53>='0' && LA14_53<='9')) ) {s = 51;}

                        else if ( (LA14_53=='_') ) {s = 52;}

                        else if ( (LA14_53==':') ) {s = 53;}

                        else if ( (LA14_53=='#') ) {s = 54;}

                        else if ( (LA14_53=='/') ) {s = 55;}

                        else if ( (LA14_53=='.') ) {s = 56;}

                        else if ( (LA14_53=='-') ) {s = 57;}

                        else if ( (LA14_53=='{') ) {s = 59;}

                        else if ( (LA14_53=='}') ) {s = 60;}

                        else if ( (LA14_53=='$') ) {s = 62;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='!')||(LA14_53>='%' && LA14_53<=',')||(LA14_53>=';' && LA14_53<='@')||LA14_53=='['||(LA14_53>=']' && LA14_53<='^')||LA14_53=='`'||LA14_53=='|'||(LA14_53>='~' && LA14_53<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA14_94 = input.LA(1);

                        s = -1;
                        if ( (LA14_94=='\"') ) {s = 58;}

                        else if ( (LA14_94=='\\') ) {s = 61;}

                        else if ( ((LA14_94>='a' && LA14_94<='z')) ) {s = 49;}

                        else if ( ((LA14_94>='A' && LA14_94<='Z')) ) {s = 50;}

                        else if ( ((LA14_94>='0' && LA14_94<='9')) ) {s = 51;}

                        else if ( (LA14_94=='_') ) {s = 52;}

                        else if ( (LA14_94==':') ) {s = 53;}

                        else if ( (LA14_94=='#') ) {s = 54;}

                        else if ( (LA14_94=='/') ) {s = 55;}

                        else if ( (LA14_94=='.') ) {s = 56;}

                        else if ( (LA14_94=='-') ) {s = 57;}

                        else if ( (LA14_94=='{') ) {s = 59;}

                        else if ( (LA14_94=='}') ) {s = 60;}

                        else if ( (LA14_94=='$') ) {s = 62;}

                        else if ( ((LA14_94>='\u0000' && LA14_94<='!')||(LA14_94>='%' && LA14_94<=',')||(LA14_94>=';' && LA14_94<='@')||LA14_94=='['||(LA14_94>=']' && LA14_94<='^')||LA14_94=='`'||LA14_94=='|'||(LA14_94>='~' && LA14_94<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA14_54 = input.LA(1);

                        s = -1;
                        if ( (LA14_54=='\"') ) {s = 58;}

                        else if ( (LA14_54=='\\') ) {s = 61;}

                        else if ( ((LA14_54>='a' && LA14_54<='z')) ) {s = 49;}

                        else if ( ((LA14_54>='A' && LA14_54<='Z')) ) {s = 50;}

                        else if ( ((LA14_54>='0' && LA14_54<='9')) ) {s = 51;}

                        else if ( (LA14_54=='_') ) {s = 52;}

                        else if ( (LA14_54==':') ) {s = 53;}

                        else if ( (LA14_54=='#') ) {s = 54;}

                        else if ( (LA14_54=='/') ) {s = 55;}

                        else if ( (LA14_54=='.') ) {s = 56;}

                        else if ( (LA14_54=='-') ) {s = 57;}

                        else if ( (LA14_54=='{') ) {s = 59;}

                        else if ( (LA14_54=='}') ) {s = 60;}

                        else if ( (LA14_54=='$') ) {s = 62;}

                        else if ( ((LA14_54>='\u0000' && LA14_54<='!')||(LA14_54>='%' && LA14_54<=',')||(LA14_54>=';' && LA14_54<='@')||LA14_54=='['||(LA14_54>=']' && LA14_54<='^')||LA14_54=='`'||LA14_54=='|'||(LA14_54>='~' && LA14_54<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA14_95 = input.LA(1);

                        s = -1;
                        if ( (LA14_95=='\"') ) {s = 58;}

                        else if ( (LA14_95=='\\') ) {s = 61;}

                        else if ( ((LA14_95>='a' && LA14_95<='z')) ) {s = 49;}

                        else if ( ((LA14_95>='A' && LA14_95<='Z')) ) {s = 50;}

                        else if ( ((LA14_95>='0' && LA14_95<='9')) ) {s = 51;}

                        else if ( (LA14_95=='_') ) {s = 52;}

                        else if ( (LA14_95==':') ) {s = 53;}

                        else if ( (LA14_95=='#') ) {s = 54;}

                        else if ( (LA14_95=='/') ) {s = 55;}

                        else if ( (LA14_95=='.') ) {s = 56;}

                        else if ( (LA14_95=='-') ) {s = 57;}

                        else if ( (LA14_95=='{') ) {s = 59;}

                        else if ( (LA14_95=='}') ) {s = 60;}

                        else if ( (LA14_95=='$') ) {s = 62;}

                        else if ( ((LA14_95>='\u0000' && LA14_95<='!')||(LA14_95>='%' && LA14_95<=',')||(LA14_95>=';' && LA14_95<='@')||LA14_95=='['||(LA14_95>=']' && LA14_95<='^')||LA14_95=='`'||LA14_95=='|'||(LA14_95>='~' && LA14_95<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA14_55 = input.LA(1);

                        s = -1;
                        if ( (LA14_55=='\"') ) {s = 58;}

                        else if ( (LA14_55=='\\') ) {s = 61;}

                        else if ( ((LA14_55>='a' && LA14_55<='z')) ) {s = 49;}

                        else if ( ((LA14_55>='A' && LA14_55<='Z')) ) {s = 50;}

                        else if ( ((LA14_55>='0' && LA14_55<='9')) ) {s = 51;}

                        else if ( (LA14_55=='_') ) {s = 52;}

                        else if ( (LA14_55==':') ) {s = 53;}

                        else if ( (LA14_55=='#') ) {s = 54;}

                        else if ( (LA14_55=='/') ) {s = 55;}

                        else if ( (LA14_55=='.') ) {s = 56;}

                        else if ( (LA14_55=='-') ) {s = 57;}

                        else if ( (LA14_55=='{') ) {s = 59;}

                        else if ( (LA14_55=='}') ) {s = 60;}

                        else if ( (LA14_55=='$') ) {s = 62;}

                        else if ( ((LA14_55>='\u0000' && LA14_55<='!')||(LA14_55>='%' && LA14_55<=',')||(LA14_55>=';' && LA14_55<='@')||LA14_55=='['||(LA14_55>=']' && LA14_55<='^')||LA14_55=='`'||LA14_55=='|'||(LA14_55>='~' && LA14_55<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA14_96 = input.LA(1);

                        s = -1;
                        if ( ((LA14_96>='a' && LA14_96<='z')) ) {s = 49;}

                        else if ( ((LA14_96>='A' && LA14_96<='Z')) ) {s = 50;}

                        else if ( ((LA14_96>='0' && LA14_96<='9')) ) {s = 51;}

                        else if ( (LA14_96=='_') ) {s = 52;}

                        else if ( (LA14_96==':') ) {s = 53;}

                        else if ( (LA14_96=='#') ) {s = 54;}

                        else if ( (LA14_96=='/') ) {s = 55;}

                        else if ( (LA14_96=='.') ) {s = 56;}

                        else if ( (LA14_96=='-') ) {s = 57;}

                        else if ( (LA14_96=='\"') ) {s = 58;}

                        else if ( (LA14_96=='{') ) {s = 59;}

                        else if ( (LA14_96=='}') ) {s = 60;}

                        else if ( (LA14_96=='\\') ) {s = 61;}

                        else if ( (LA14_96=='$') ) {s = 62;}

                        else if ( ((LA14_96>='\u0000' && LA14_96<='!')||(LA14_96>='%' && LA14_96<=',')||(LA14_96>=';' && LA14_96<='@')||LA14_96=='['||(LA14_96>=']' && LA14_96<='^')||LA14_96=='`'||LA14_96=='|'||(LA14_96>='~' && LA14_96<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( (LA14_56=='\"') ) {s = 58;}

                        else if ( (LA14_56=='\\') ) {s = 61;}

                        else if ( ((LA14_56>='a' && LA14_56<='z')) ) {s = 49;}

                        else if ( ((LA14_56>='A' && LA14_56<='Z')) ) {s = 50;}

                        else if ( ((LA14_56>='0' && LA14_56<='9')) ) {s = 51;}

                        else if ( (LA14_56=='_') ) {s = 52;}

                        else if ( (LA14_56==':') ) {s = 53;}

                        else if ( (LA14_56=='#') ) {s = 54;}

                        else if ( (LA14_56=='/') ) {s = 55;}

                        else if ( (LA14_56=='.') ) {s = 56;}

                        else if ( (LA14_56=='-') ) {s = 57;}

                        else if ( (LA14_56=='{') ) {s = 59;}

                        else if ( (LA14_56=='}') ) {s = 60;}

                        else if ( (LA14_56=='$') ) {s = 62;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='!')||(LA14_56>='%' && LA14_56<=',')||(LA14_56>=';' && LA14_56<='@')||LA14_56=='['||(LA14_56>=']' && LA14_56<='^')||LA14_56=='`'||LA14_56=='|'||(LA14_56>='~' && LA14_56<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA14_97 = input.LA(1);

                        s = -1;
                        if ( ((LA14_97>='a' && LA14_97<='z')) ) {s = 49;}

                        else if ( ((LA14_97>='A' && LA14_97<='Z')) ) {s = 50;}

                        else if ( ((LA14_97>='0' && LA14_97<='9')) ) {s = 51;}

                        else if ( (LA14_97=='_') ) {s = 52;}

                        else if ( (LA14_97==':') ) {s = 53;}

                        else if ( (LA14_97=='#') ) {s = 54;}

                        else if ( (LA14_97=='/') ) {s = 55;}

                        else if ( (LA14_97=='.') ) {s = 56;}

                        else if ( (LA14_97=='-') ) {s = 57;}

                        else if ( (LA14_97=='\"') ) {s = 58;}

                        else if ( (LA14_97=='{') ) {s = 59;}

                        else if ( (LA14_97=='}') ) {s = 60;}

                        else if ( (LA14_97=='\\') ) {s = 61;}

                        else if ( (LA14_97=='$') ) {s = 62;}

                        else if ( ((LA14_97>='\u0000' && LA14_97<='!')||(LA14_97>='%' && LA14_97<=',')||(LA14_97>=';' && LA14_97<='@')||LA14_97=='['||(LA14_97>=']' && LA14_97<='^')||LA14_97=='`'||LA14_97=='|'||(LA14_97>='~' && LA14_97<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA14_57 = input.LA(1);

                        s = -1;
                        if ( (LA14_57=='\"') ) {s = 58;}

                        else if ( (LA14_57=='\\') ) {s = 61;}

                        else if ( ((LA14_57>='a' && LA14_57<='z')) ) {s = 49;}

                        else if ( ((LA14_57>='A' && LA14_57<='Z')) ) {s = 50;}

                        else if ( ((LA14_57>='0' && LA14_57<='9')) ) {s = 51;}

                        else if ( (LA14_57=='_') ) {s = 52;}

                        else if ( (LA14_57==':') ) {s = 53;}

                        else if ( (LA14_57=='#') ) {s = 54;}

                        else if ( (LA14_57=='/') ) {s = 55;}

                        else if ( (LA14_57=='.') ) {s = 56;}

                        else if ( (LA14_57=='-') ) {s = 57;}

                        else if ( (LA14_57=='{') ) {s = 59;}

                        else if ( (LA14_57=='}') ) {s = 60;}

                        else if ( (LA14_57=='$') ) {s = 62;}

                        else if ( ((LA14_57>='\u0000' && LA14_57<='!')||(LA14_57>='%' && LA14_57<=',')||(LA14_57>=';' && LA14_57<='@')||LA14_57=='['||(LA14_57>=']' && LA14_57<='^')||LA14_57=='`'||LA14_57=='|'||(LA14_57>='~' && LA14_57<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA14_98 = input.LA(1);

                        s = -1;
                        if ( ((LA14_98>='a' && LA14_98<='z')) ) {s = 49;}

                        else if ( ((LA14_98>='A' && LA14_98<='Z')) ) {s = 50;}

                        else if ( ((LA14_98>='0' && LA14_98<='9')) ) {s = 51;}

                        else if ( (LA14_98=='_') ) {s = 52;}

                        else if ( (LA14_98==':') ) {s = 53;}

                        else if ( (LA14_98=='#') ) {s = 54;}

                        else if ( (LA14_98=='/') ) {s = 55;}

                        else if ( (LA14_98=='.') ) {s = 56;}

                        else if ( (LA14_98=='-') ) {s = 57;}

                        else if ( (LA14_98=='\"') ) {s = 58;}

                        else if ( (LA14_98=='{') ) {s = 59;}

                        else if ( (LA14_98=='}') ) {s = 60;}

                        else if ( (LA14_98=='\\') ) {s = 61;}

                        else if ( (LA14_98=='$') ) {s = 62;}

                        else if ( ((LA14_98>='\u0000' && LA14_98<='!')||(LA14_98>='%' && LA14_98<=',')||(LA14_98>=';' && LA14_98<='@')||LA14_98=='['||(LA14_98>=']' && LA14_98<='^')||LA14_98=='`'||LA14_98=='|'||(LA14_98>='~' && LA14_98<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( ((LA14_99>='a' && LA14_99<='z')) ) {s = 49;}

                        else if ( ((LA14_99>='A' && LA14_99<='Z')) ) {s = 50;}

                        else if ( ((LA14_99>='0' && LA14_99<='9')) ) {s = 51;}

                        else if ( (LA14_99=='_') ) {s = 52;}

                        else if ( (LA14_99==':') ) {s = 53;}

                        else if ( (LA14_99=='#') ) {s = 54;}

                        else if ( (LA14_99=='/') ) {s = 55;}

                        else if ( (LA14_99=='.') ) {s = 56;}

                        else if ( (LA14_99=='-') ) {s = 57;}

                        else if ( (LA14_99=='\"') ) {s = 58;}

                        else if ( (LA14_99=='{') ) {s = 59;}

                        else if ( (LA14_99=='}') ) {s = 60;}

                        else if ( (LA14_99=='\\') ) {s = 61;}

                        else if ( (LA14_99=='$') ) {s = 62;}

                        else if ( ((LA14_99>='\u0000' && LA14_99<='!')||(LA14_99>='%' && LA14_99<=',')||(LA14_99>=';' && LA14_99<='@')||LA14_99=='['||(LA14_99>=']' && LA14_99<='^')||LA14_99=='`'||LA14_99=='|'||(LA14_99>='~' && LA14_99<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA14_59 = input.LA(1);

                        s = -1;
                        if ( (LA14_59=='\"') ) {s = 58;}

                        else if ( (LA14_59=='\\') ) {s = 61;}

                        else if ( ((LA14_59>='a' && LA14_59<='z')) ) {s = 49;}

                        else if ( ((LA14_59>='A' && LA14_59<='Z')) ) {s = 50;}

                        else if ( ((LA14_59>='0' && LA14_59<='9')) ) {s = 51;}

                        else if ( (LA14_59=='_') ) {s = 52;}

                        else if ( (LA14_59==':') ) {s = 53;}

                        else if ( (LA14_59=='#') ) {s = 54;}

                        else if ( (LA14_59=='/') ) {s = 55;}

                        else if ( (LA14_59=='.') ) {s = 56;}

                        else if ( (LA14_59=='-') ) {s = 57;}

                        else if ( (LA14_59=='{') ) {s = 59;}

                        else if ( (LA14_59=='}') ) {s = 60;}

                        else if ( (LA14_59=='$') ) {s = 62;}

                        else if ( ((LA14_59>='\u0000' && LA14_59<='!')||(LA14_59>='%' && LA14_59<=',')||(LA14_59>=';' && LA14_59<='@')||LA14_59=='['||(LA14_59>=']' && LA14_59<='^')||LA14_59=='`'||LA14_59=='|'||(LA14_59>='~' && LA14_59<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA14_100 = input.LA(1);

                        s = -1;
                        if ( ((LA14_100>='a' && LA14_100<='z')) ) {s = 49;}

                        else if ( ((LA14_100>='A' && LA14_100<='Z')) ) {s = 50;}

                        else if ( ((LA14_100>='0' && LA14_100<='9')) ) {s = 51;}

                        else if ( (LA14_100=='_') ) {s = 52;}

                        else if ( (LA14_100==':') ) {s = 53;}

                        else if ( (LA14_100=='#') ) {s = 54;}

                        else if ( (LA14_100=='/') ) {s = 55;}

                        else if ( (LA14_100=='.') ) {s = 56;}

                        else if ( (LA14_100=='-') ) {s = 57;}

                        else if ( (LA14_100=='\"') ) {s = 58;}

                        else if ( (LA14_100=='{') ) {s = 59;}

                        else if ( (LA14_100=='}') ) {s = 60;}

                        else if ( (LA14_100=='\\') ) {s = 61;}

                        else if ( (LA14_100=='$') ) {s = 62;}

                        else if ( ((LA14_100>='\u0000' && LA14_100<='!')||(LA14_100>='%' && LA14_100<=',')||(LA14_100>=';' && LA14_100<='@')||LA14_100=='['||(LA14_100>=']' && LA14_100<='^')||LA14_100=='`'||LA14_100=='|'||(LA14_100>='~' && LA14_100<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA14_60 = input.LA(1);

                        s = -1;
                        if ( (LA14_60=='\"') ) {s = 58;}

                        else if ( (LA14_60=='\\') ) {s = 61;}

                        else if ( ((LA14_60>='a' && LA14_60<='z')) ) {s = 49;}

                        else if ( ((LA14_60>='A' && LA14_60<='Z')) ) {s = 50;}

                        else if ( ((LA14_60>='0' && LA14_60<='9')) ) {s = 51;}

                        else if ( (LA14_60=='_') ) {s = 52;}

                        else if ( (LA14_60==':') ) {s = 53;}

                        else if ( (LA14_60=='#') ) {s = 54;}

                        else if ( (LA14_60=='/') ) {s = 55;}

                        else if ( (LA14_60=='.') ) {s = 56;}

                        else if ( (LA14_60=='-') ) {s = 57;}

                        else if ( (LA14_60=='{') ) {s = 59;}

                        else if ( (LA14_60=='}') ) {s = 60;}

                        else if ( (LA14_60=='$') ) {s = 62;}

                        else if ( ((LA14_60>='\u0000' && LA14_60<='!')||(LA14_60>='%' && LA14_60<=',')||(LA14_60>=';' && LA14_60<='@')||LA14_60=='['||(LA14_60>=']' && LA14_60<='^')||LA14_60=='`'||LA14_60=='|'||(LA14_60>='~' && LA14_60<='\uFFFF')) ) {s = 63;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA14_62 = input.LA(1);

                        s = -1;
                        if ( (LA14_62=='\"') ) {s = 58;}

                        else if ( (LA14_62=='\\') ) {s = 61;}

                        else if ( ((LA14_62>='a' && LA14_62<='z')) ) {s = 49;}

                        else if ( ((LA14_62>='A' && LA14_62<='Z')) ) {s = 50;}

                        else if ( ((LA14_62>='0' && LA14_62<='9')) ) {s = 51;}

                        else if ( (LA14_62=='_') ) {s = 52;}

                        else if ( (LA14_62==':') ) {s = 53;}

                        else if ( (LA14_62=='#') ) {s = 54;}

                        else if ( (LA14_62=='/') ) {s = 55;}

                        else if ( (LA14_62=='.') ) {s = 56;}

                        else if ( (LA14_62=='-') ) {s = 57;}

                        else if ( (LA14_62=='{') ) {s = 59;}

                        else if ( (LA14_62=='}') ) {s = 60;}

                        else if ( (LA14_62=='$') ) {s = 62;}

                        else if ( ((LA14_62>='\u0000' && LA14_62<='!')||(LA14_62>='%' && LA14_62<=',')||(LA14_62>=';' && LA14_62<='@')||LA14_62=='['||(LA14_62>=']' && LA14_62<='^')||LA14_62=='`'||LA14_62=='|'||(LA14_62>='~' && LA14_62<='\uFFFF')) ) {s = 63;}

                        else s = 25;

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