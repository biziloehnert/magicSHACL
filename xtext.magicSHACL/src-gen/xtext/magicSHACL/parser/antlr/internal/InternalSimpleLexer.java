package xtext.magicSHACL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
            // InternalSimple.g:11:7: ( '(' )
            // InternalSimple.g:11:9: '('
            {
            match('('); 

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
            // InternalSimple.g:12:7: ( ')' )
            // InternalSimple.g:12:9: ')'
            {
            match(')'); 

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
            // InternalSimple.g:13:7: ( '?' )
            // InternalSimple.g:13:9: '?'
            {
            match('?'); 

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
            // InternalSimple.g:14:7: ( ':-' )
            // InternalSimple.g:14:9: ':-'
            {
            match(":-"); 


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
            // InternalSimple.g:15:7: ( ';' )
            // InternalSimple.g:15:9: ';'
            {
            match(';'); 

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
            // InternalSimple.g:16:7: ( 'AND' )
            // InternalSimple.g:16:9: 'AND'
            {
            match("AND"); 


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
            // InternalSimple.g:17:7: ( 'MIN' )
            // InternalSimple.g:17:9: 'MIN'
            {
            match("MIN"); 


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
            // InternalSimple.g:18:7: ( 'MAX' )
            // InternalSimple.g:18:9: 'MAX'
            {
            match("MAX"); 


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
            // InternalSimple.g:19:7: ( 'OR' )
            // InternalSimple.g:19:9: 'OR'
            {
            match("OR"); 


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
            // InternalSimple.g:20:7: ( 'NOT' )
            // InternalSimple.g:20:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalSimple.g:21:7: ( 'SOME ' )
            // InternalSimple.g:21:9: 'SOME '
            {
            match("SOME "); 


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
            // InternalSimple.g:22:7: ( 'SOME ^' )
            // InternalSimple.g:22:9: 'SOME ^'
            {
            match("SOME ^"); 


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
            // InternalSimple.g:738:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )* )
            // InternalSimple.g:738:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            {
            // InternalSimple.g:738:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            loop1:
            do {
                int alt1=15;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalSimple.g:738:17: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSimple.g:738:26: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalSimple.g:738:35: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalSimple.g:738:44: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalSimple.g:738:48: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalSimple.g:738:52: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalSimple.g:738:56: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalSimple.g:738:60: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalSimple.g:738:64: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 10 :
            	    // InternalSimple.g:738:68: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;
            	case 11 :
            	    // InternalSimple.g:738:72: '{'
            	    {
            	    match('{'); 

            	    }
            	    break;
            	case 12 :
            	    // InternalSimple.g:738:76: '}'
            	    {
            	    match('}'); 

            	    }
            	    break;
            	case 13 :
            	    // InternalSimple.g:738:80: '\\\\'
            	    {
            	    match('\\'); 

            	    }
            	    break;
            	case 14 :
            	    // InternalSimple.g:738:85: '$'
            	    {
            	    match('$'); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
            // InternalSimple.g:740:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSimple.g:740:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSimple.g:740:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimple.g:740:11: '^'
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

            // InternalSimple.g:740:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalSimple.g:742:19: ( ( '0' .. '9' )+ )
            // InternalSimple.g:742:21: ( '0' .. '9' )+
            {
            // InternalSimple.g:742:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:742:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalSimple.g:744:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSimple.g:744:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSimple.g:744:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimple.g:744:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSimple.g:744:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimple.g:744:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:744:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSimple.g:744:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSimple.g:744:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimple.g:744:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:744:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalSimple.g:746:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSimple.g:746:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSimple.g:746:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimple.g:746:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalSimple.g:748:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimple.g:748:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSimple.g:748:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimple.g:748:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalSimple.g:748:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimple.g:748:41: ( '\\r' )? '\\n'
                    {
                    // InternalSimple.g:748:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSimple.g:748:41: '\\r'
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
            // InternalSimple.g:750:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSimple.g:750:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSimple.g:750:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalSimple.g:752:16: ( . )
            // InternalSimple.g:752:18: .
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
        int alt13=19;
        alt13 = dfa13.predict(input);
        switch (alt13) {
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\1\1\17\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\42\17\uffff";
    static final String DFA1_maxS =
        "\1\175\17\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 738:16: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*";
        }
    }
    static final String DFA13_eotS =
        "\1\30\3\uffff\1\30\1\uffff\7\30\1\uffff\1\30\1\uffff\1\30\2\uffff\1\30\5\uffff\2\34\5\uffff\1\77\1\uffff\7\30\1\103\2\30\1\uffff\12\30\1\uffff\4\30\4\uffff\1\143\1\144\1\145\1\uffff\1\146\17\30\1\uffff\16\30\4\uffff\1\30\1\152\2\uffff";
    static final String DFA13_eofS =
        "\153\uffff";
    static final String DFA13_minS =
        "\1\0\3\uffff\1\55\1\uffff\7\60\1\uffff\1\60\1\uffff\1\52\2\uffff\1\0\5\uffff\1\101\1\0\5\uffff\1\42\1\uffff\7\60\1\42\2\60\1\uffff\12\0\1\uffff\4\0\4\uffff\3\42\1\uffff\1\42\1\60\16\0\1\uffff\16\0\4\uffff\1\40\1\136\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\3\uffff\1\55\1\uffff\7\172\1\uffff\1\172\1\uffff\1\57\2\uffff\1\uffff\5\uffff\1\172\1\uffff\5\uffff\1\175\1\uffff\7\172\1\175\2\172\1\uffff\12\uffff\1\uffff\4\uffff\4\uffff\3\175\1\uffff\1\175\1\172\16\uffff\1\uffff\16\uffff\4\uffff\1\172\1\136\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\7\uffff\1\15\1\uffff\1\15\1\uffff\2\15\1\uffff\5\15\2\uffff\1\22\1\23\1\1\1\2\1\3\1\uffff\1\5\12\uffff\1\20\12\uffff\1\15\4\uffff\1\17\1\16\1\22\1\4\3\uffff\1\11\20\uffff\1\21\16\uffff\1\6\1\7\1\10\1\12\2\uffff\1\14\1\13";
    static final String DFA13_specialS =
        "\1\51\22\uffff\1\54\6\uffff\1\33\22\uffff\1\31\1\2\1\4\1\43\1\10\1\12\1\14\1\16\1\20\1\22\1\uffff\1\25\1\27\1\53\1\30\12\uffff\1\32\1\34\1\5\1\35\1\36\1\37\1\41\1\42\1\44\1\45\1\46\1\47\1\50\1\52\1\uffff\1\0\1\1\1\40\1\3\1\6\1\7\1\11\1\13\1\15\1\17\1\21\1\23\1\24\1\26\10\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\23\1\17\1\27\2\34\1\32\1\1\1\2\3\34\1\22\1\21\1\20\12\15\1\4\1\5\3\34\1\3\1\34\1\6\13\14\1\7\1\11\1\10\3\14\1\12\7\14\1\34\1\26\1\34\1\31\1\16\1\34\32\13\1\24\1\34\1\25\uff82\34",
            "",
            "",
            "",
            "\1\40",
            "",
            "\12\45\7\uffff\15\44\1\42\14\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\1\50\7\44\1\47\21\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\21\44\1\51\10\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\16\44\1\52\13\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\16\44\1\53\13\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "",
            "",
            "",
            "",
            "",
            "\32\75\4\uffff\1\75\1\uffff\32\75",
            "\0\74",
            "",
            "",
            "",
            "",
            "",
            "\3\30\10\uffff\16\30\6\uffff\32\30\1\uffff\1\30\2\uffff\1\30\1\uffff\33\30\1\uffff\1\30",
            "",
            "\12\45\7\uffff\3\44\1\100\26\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\15\44\1\101\14\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\27\44\1\102\2\44\4\uffff\1\46\1\uffff\32\43",
            "\3\30\10\uffff\3\30\12\45\1\30\6\uffff\32\44\1\uffff\1\30\2\uffff\1\46\1\uffff\32\43\1\30\1\uffff\1\30",
            "\12\45\7\uffff\23\44\1\104\6\44\4\uffff\1\46\1\uffff\32\43",
            "\12\45\7\uffff\14\44\1\105\15\44\4\uffff\1\46\1\uffff\32\43",
            "",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\136\1\132\1\142\10\74\1\135\1\134\1\133\12\127\1\131\6\74\32\126\1\74\1\141\2\74\1\130\1\74\32\125\1\137\1\74\1\140\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "",
            "",
            "",
            "",
            "\3\30\10\uffff\3\30\12\45\1\30\6\uffff\32\44\1\uffff\1\30\2\uffff\1\46\1\uffff\32\43\1\30\1\uffff\1\30",
            "\3\30\10\uffff\3\30\12\45\1\30\6\uffff\32\44\1\uffff\1\30\2\uffff\1\46\1\uffff\32\43\1\30\1\uffff\1\30",
            "\3\30\10\uffff\3\30\12\45\1\30\6\uffff\32\44\1\uffff\1\30\2\uffff\1\46\1\uffff\32\43\1\30\1\uffff\1\30",
            "",
            "\3\30\10\uffff\3\30\12\45\1\30\6\uffff\32\44\1\uffff\1\30\2\uffff\1\46\1\uffff\32\43\1\30\1\uffff\1\30",
            "\12\45\7\uffff\4\44\1\147\25\44\4\uffff\1\46\1\uffff\32\43",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "\42\124\1\117\1\113\1\123\10\124\1\116\1\115\1\114\12\110\1\112\6\124\32\107\1\124\1\122\2\124\1\111\1\124\32\106\1\120\1\124\1\121\uff82\124",
            "",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "\42\74\1\67\1\63\1\73\10\74\1\66\1\65\1\64\12\60\1\62\6\74\32\57\1\74\1\72\2\74\1\61\1\74\32\56\1\70\1\74\1\71\uff82\74",
            "",
            "",
            "",
            "",
            "\1\150\17\uffff\12\45\7\uffff\32\44\4\uffff\1\46\1\uffff\32\43",
            "\1\151",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_UNICODE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_85 = input.LA(1);

                        s = -1;
                        if ( (LA13_85=='\"') ) {s = 55;}

                        else if ( (LA13_85=='\\') ) {s = 58;}

                        else if ( ((LA13_85>='a' && LA13_85<='z')) ) {s = 46;}

                        else if ( ((LA13_85>='A' && LA13_85<='Z')) ) {s = 47;}

                        else if ( ((LA13_85>='0' && LA13_85<='9')) ) {s = 48;}

                        else if ( (LA13_85=='_') ) {s = 49;}

                        else if ( (LA13_85==':') ) {s = 50;}

                        else if ( (LA13_85=='#') ) {s = 51;}

                        else if ( (LA13_85=='/') ) {s = 52;}

                        else if ( (LA13_85=='.') ) {s = 53;}

                        else if ( (LA13_85=='-') ) {s = 54;}

                        else if ( (LA13_85=='{') ) {s = 56;}

                        else if ( (LA13_85=='}') ) {s = 57;}

                        else if ( (LA13_85=='$') ) {s = 59;}

                        else if ( ((LA13_85>='\u0000' && LA13_85<='!')||(LA13_85>='%' && LA13_85<=',')||(LA13_85>=';' && LA13_85<='@')||LA13_85=='['||(LA13_85>=']' && LA13_85<='^')||LA13_85=='`'||LA13_85=='|'||(LA13_85>='~' && LA13_85<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_86 = input.LA(1);

                        s = -1;
                        if ( (LA13_86=='\"') ) {s = 55;}

                        else if ( (LA13_86=='\\') ) {s = 58;}

                        else if ( ((LA13_86>='a' && LA13_86<='z')) ) {s = 46;}

                        else if ( ((LA13_86>='A' && LA13_86<='Z')) ) {s = 47;}

                        else if ( ((LA13_86>='0' && LA13_86<='9')) ) {s = 48;}

                        else if ( (LA13_86=='_') ) {s = 49;}

                        else if ( (LA13_86==':') ) {s = 50;}

                        else if ( (LA13_86=='#') ) {s = 51;}

                        else if ( (LA13_86=='/') ) {s = 52;}

                        else if ( (LA13_86=='.') ) {s = 53;}

                        else if ( (LA13_86=='-') ) {s = 54;}

                        else if ( (LA13_86=='{') ) {s = 56;}

                        else if ( (LA13_86=='}') ) {s = 57;}

                        else if ( (LA13_86=='$') ) {s = 59;}

                        else if ( ((LA13_86>='\u0000' && LA13_86<='!')||(LA13_86>='%' && LA13_86<=',')||(LA13_86>=';' && LA13_86<='@')||LA13_86=='['||(LA13_86>=']' && LA13_86<='^')||LA13_86=='`'||LA13_86=='|'||(LA13_86>='~' && LA13_86<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='a' && LA13_46<='z')) ) {s = 46;}

                        else if ( ((LA13_46>='A' && LA13_46<='Z')) ) {s = 47;}

                        else if ( ((LA13_46>='0' && LA13_46<='9')) ) {s = 48;}

                        else if ( (LA13_46=='_') ) {s = 49;}

                        else if ( (LA13_46==':') ) {s = 50;}

                        else if ( (LA13_46=='#') ) {s = 51;}

                        else if ( (LA13_46=='/') ) {s = 52;}

                        else if ( (LA13_46=='.') ) {s = 53;}

                        else if ( (LA13_46=='-') ) {s = 54;}

                        else if ( (LA13_46=='\"') ) {s = 55;}

                        else if ( (LA13_46=='{') ) {s = 56;}

                        else if ( (LA13_46=='}') ) {s = 57;}

                        else if ( (LA13_46=='\\') ) {s = 58;}

                        else if ( (LA13_46=='$') ) {s = 59;}

                        else if ( ((LA13_46>='\u0000' && LA13_46<='!')||(LA13_46>='%' && LA13_46<=',')||(LA13_46>=';' && LA13_46<='@')||LA13_46=='['||(LA13_46>=']' && LA13_46<='^')||LA13_46=='`'||LA13_46=='|'||(LA13_46>='~' && LA13_46<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_88 = input.LA(1);

                        s = -1;
                        if ( (LA13_88=='\"') ) {s = 55;}

                        else if ( (LA13_88=='\\') ) {s = 58;}

                        else if ( ((LA13_88>='a' && LA13_88<='z')) ) {s = 46;}

                        else if ( ((LA13_88>='A' && LA13_88<='Z')) ) {s = 47;}

                        else if ( ((LA13_88>='0' && LA13_88<='9')) ) {s = 48;}

                        else if ( (LA13_88=='_') ) {s = 49;}

                        else if ( (LA13_88==':') ) {s = 50;}

                        else if ( (LA13_88=='#') ) {s = 51;}

                        else if ( (LA13_88=='/') ) {s = 52;}

                        else if ( (LA13_88=='.') ) {s = 53;}

                        else if ( (LA13_88=='-') ) {s = 54;}

                        else if ( (LA13_88=='{') ) {s = 56;}

                        else if ( (LA13_88=='}') ) {s = 57;}

                        else if ( (LA13_88=='$') ) {s = 59;}

                        else if ( ((LA13_88>='\u0000' && LA13_88<='!')||(LA13_88>='%' && LA13_88<=',')||(LA13_88>=';' && LA13_88<='@')||LA13_88=='['||(LA13_88>=']' && LA13_88<='^')||LA13_88=='`'||LA13_88=='|'||(LA13_88>='~' && LA13_88<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_47 = input.LA(1);

                        s = -1;
                        if ( ((LA13_47>='a' && LA13_47<='z')) ) {s = 46;}

                        else if ( ((LA13_47>='A' && LA13_47<='Z')) ) {s = 47;}

                        else if ( ((LA13_47>='0' && LA13_47<='9')) ) {s = 48;}

                        else if ( (LA13_47=='_') ) {s = 49;}

                        else if ( (LA13_47==':') ) {s = 50;}

                        else if ( (LA13_47=='#') ) {s = 51;}

                        else if ( (LA13_47=='/') ) {s = 52;}

                        else if ( (LA13_47=='.') ) {s = 53;}

                        else if ( (LA13_47=='-') ) {s = 54;}

                        else if ( (LA13_47=='\"') ) {s = 55;}

                        else if ( (LA13_47=='{') ) {s = 56;}

                        else if ( (LA13_47=='}') ) {s = 57;}

                        else if ( (LA13_47=='\\') ) {s = 58;}

                        else if ( (LA13_47=='$') ) {s = 59;}

                        else if ( ((LA13_47>='\u0000' && LA13_47<='!')||(LA13_47>='%' && LA13_47<=',')||(LA13_47>=';' && LA13_47<='@')||LA13_47=='['||(LA13_47>=']' && LA13_47<='^')||LA13_47=='`'||LA13_47=='|'||(LA13_47>='~' && LA13_47<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_72 = input.LA(1);

                        s = -1;
                        if ( ((LA13_72>='\u0000' && LA13_72<='!')||(LA13_72>='%' && LA13_72<=',')||(LA13_72>=';' && LA13_72<='@')||LA13_72=='['||(LA13_72>=']' && LA13_72<='^')||LA13_72=='`'||LA13_72=='|'||(LA13_72>='~' && LA13_72<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_72>='a' && LA13_72<='z')) ) {s = 70;}

                        else if ( ((LA13_72>='A' && LA13_72<='Z')) ) {s = 71;}

                        else if ( ((LA13_72>='0' && LA13_72<='9')) ) {s = 72;}

                        else if ( (LA13_72=='_') ) {s = 73;}

                        else if ( (LA13_72==':') ) {s = 74;}

                        else if ( (LA13_72=='#') ) {s = 75;}

                        else if ( (LA13_72=='/') ) {s = 76;}

                        else if ( (LA13_72=='.') ) {s = 77;}

                        else if ( (LA13_72=='-') ) {s = 78;}

                        else if ( (LA13_72=='\"') ) {s = 79;}

                        else if ( (LA13_72=='{') ) {s = 80;}

                        else if ( (LA13_72=='}') ) {s = 81;}

                        else if ( (LA13_72=='\\') ) {s = 82;}

                        else if ( (LA13_72=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_89 = input.LA(1);

                        s = -1;
                        if ( (LA13_89=='\"') ) {s = 55;}

                        else if ( (LA13_89=='\\') ) {s = 58;}

                        else if ( ((LA13_89>='a' && LA13_89<='z')) ) {s = 46;}

                        else if ( ((LA13_89>='A' && LA13_89<='Z')) ) {s = 47;}

                        else if ( ((LA13_89>='0' && LA13_89<='9')) ) {s = 48;}

                        else if ( (LA13_89=='_') ) {s = 49;}

                        else if ( (LA13_89==':') ) {s = 50;}

                        else if ( (LA13_89=='#') ) {s = 51;}

                        else if ( (LA13_89=='/') ) {s = 52;}

                        else if ( (LA13_89=='.') ) {s = 53;}

                        else if ( (LA13_89=='-') ) {s = 54;}

                        else if ( (LA13_89=='{') ) {s = 56;}

                        else if ( (LA13_89=='}') ) {s = 57;}

                        else if ( (LA13_89=='$') ) {s = 59;}

                        else if ( ((LA13_89>='\u0000' && LA13_89<='!')||(LA13_89>='%' && LA13_89<=',')||(LA13_89>=';' && LA13_89<='@')||LA13_89=='['||(LA13_89>=']' && LA13_89<='^')||LA13_89=='`'||LA13_89=='|'||(LA13_89>='~' && LA13_89<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_90 = input.LA(1);

                        s = -1;
                        if ( (LA13_90=='\"') ) {s = 55;}

                        else if ( (LA13_90=='\\') ) {s = 58;}

                        else if ( ((LA13_90>='a' && LA13_90<='z')) ) {s = 46;}

                        else if ( ((LA13_90>='A' && LA13_90<='Z')) ) {s = 47;}

                        else if ( ((LA13_90>='0' && LA13_90<='9')) ) {s = 48;}

                        else if ( (LA13_90=='_') ) {s = 49;}

                        else if ( (LA13_90==':') ) {s = 50;}

                        else if ( (LA13_90=='#') ) {s = 51;}

                        else if ( (LA13_90=='/') ) {s = 52;}

                        else if ( (LA13_90=='.') ) {s = 53;}

                        else if ( (LA13_90=='-') ) {s = 54;}

                        else if ( (LA13_90=='{') ) {s = 56;}

                        else if ( (LA13_90=='}') ) {s = 57;}

                        else if ( (LA13_90=='$') ) {s = 59;}

                        else if ( ((LA13_90>='\u0000' && LA13_90<='!')||(LA13_90>='%' && LA13_90<=',')||(LA13_90>=';' && LA13_90<='@')||LA13_90=='['||(LA13_90>=']' && LA13_90<='^')||LA13_90=='`'||LA13_90=='|'||(LA13_90>='~' && LA13_90<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_49 = input.LA(1);

                        s = -1;
                        if ( (LA13_49=='\"') ) {s = 55;}

                        else if ( (LA13_49=='\\') ) {s = 58;}

                        else if ( ((LA13_49>='a' && LA13_49<='z')) ) {s = 46;}

                        else if ( ((LA13_49>='A' && LA13_49<='Z')) ) {s = 47;}

                        else if ( ((LA13_49>='0' && LA13_49<='9')) ) {s = 48;}

                        else if ( (LA13_49=='_') ) {s = 49;}

                        else if ( (LA13_49==':') ) {s = 50;}

                        else if ( (LA13_49=='#') ) {s = 51;}

                        else if ( (LA13_49=='/') ) {s = 52;}

                        else if ( (LA13_49=='.') ) {s = 53;}

                        else if ( (LA13_49=='-') ) {s = 54;}

                        else if ( (LA13_49=='{') ) {s = 56;}

                        else if ( (LA13_49=='}') ) {s = 57;}

                        else if ( (LA13_49=='$') ) {s = 59;}

                        else if ( ((LA13_49>='\u0000' && LA13_49<='!')||(LA13_49>='%' && LA13_49<=',')||(LA13_49>=';' && LA13_49<='@')||LA13_49=='['||(LA13_49>=']' && LA13_49<='^')||LA13_49=='`'||LA13_49=='|'||(LA13_49>='~' && LA13_49<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_91 = input.LA(1);

                        s = -1;
                        if ( ((LA13_91>='a' && LA13_91<='z')) ) {s = 46;}

                        else if ( ((LA13_91>='A' && LA13_91<='Z')) ) {s = 47;}

                        else if ( ((LA13_91>='0' && LA13_91<='9')) ) {s = 48;}

                        else if ( (LA13_91=='_') ) {s = 49;}

                        else if ( (LA13_91==':') ) {s = 50;}

                        else if ( (LA13_91=='#') ) {s = 51;}

                        else if ( (LA13_91=='/') ) {s = 52;}

                        else if ( (LA13_91=='.') ) {s = 53;}

                        else if ( (LA13_91=='-') ) {s = 54;}

                        else if ( (LA13_91=='\"') ) {s = 55;}

                        else if ( (LA13_91=='{') ) {s = 56;}

                        else if ( (LA13_91=='}') ) {s = 57;}

                        else if ( (LA13_91=='\\') ) {s = 58;}

                        else if ( (LA13_91=='$') ) {s = 59;}

                        else if ( ((LA13_91>='\u0000' && LA13_91<='!')||(LA13_91>='%' && LA13_91<=',')||(LA13_91>=';' && LA13_91<='@')||LA13_91=='['||(LA13_91>=']' && LA13_91<='^')||LA13_91=='`'||LA13_91=='|'||(LA13_91>='~' && LA13_91<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_50 = input.LA(1);

                        s = -1;
                        if ( (LA13_50=='\"') ) {s = 55;}

                        else if ( (LA13_50=='\\') ) {s = 58;}

                        else if ( ((LA13_50>='a' && LA13_50<='z')) ) {s = 46;}

                        else if ( ((LA13_50>='A' && LA13_50<='Z')) ) {s = 47;}

                        else if ( ((LA13_50>='0' && LA13_50<='9')) ) {s = 48;}

                        else if ( (LA13_50=='_') ) {s = 49;}

                        else if ( (LA13_50==':') ) {s = 50;}

                        else if ( (LA13_50=='#') ) {s = 51;}

                        else if ( (LA13_50=='/') ) {s = 52;}

                        else if ( (LA13_50=='.') ) {s = 53;}

                        else if ( (LA13_50=='-') ) {s = 54;}

                        else if ( (LA13_50=='{') ) {s = 56;}

                        else if ( (LA13_50=='}') ) {s = 57;}

                        else if ( (LA13_50=='$') ) {s = 59;}

                        else if ( ((LA13_50>='\u0000' && LA13_50<='!')||(LA13_50>='%' && LA13_50<=',')||(LA13_50>=';' && LA13_50<='@')||LA13_50=='['||(LA13_50>=']' && LA13_50<='^')||LA13_50=='`'||LA13_50=='|'||(LA13_50>='~' && LA13_50<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_92 = input.LA(1);

                        s = -1;
                        if ( (LA13_92=='\"') ) {s = 55;}

                        else if ( (LA13_92=='\\') ) {s = 58;}

                        else if ( ((LA13_92>='a' && LA13_92<='z')) ) {s = 46;}

                        else if ( ((LA13_92>='A' && LA13_92<='Z')) ) {s = 47;}

                        else if ( ((LA13_92>='0' && LA13_92<='9')) ) {s = 48;}

                        else if ( (LA13_92=='_') ) {s = 49;}

                        else if ( (LA13_92==':') ) {s = 50;}

                        else if ( (LA13_92=='#') ) {s = 51;}

                        else if ( (LA13_92=='/') ) {s = 52;}

                        else if ( (LA13_92=='.') ) {s = 53;}

                        else if ( (LA13_92=='-') ) {s = 54;}

                        else if ( (LA13_92=='{') ) {s = 56;}

                        else if ( (LA13_92=='}') ) {s = 57;}

                        else if ( (LA13_92=='$') ) {s = 59;}

                        else if ( ((LA13_92>='\u0000' && LA13_92<='!')||(LA13_92>='%' && LA13_92<=',')||(LA13_92>=';' && LA13_92<='@')||LA13_92=='['||(LA13_92>=']' && LA13_92<='^')||LA13_92=='`'||LA13_92=='|'||(LA13_92>='~' && LA13_92<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_51 = input.LA(1);

                        s = -1;
                        if ( (LA13_51=='\"') ) {s = 55;}

                        else if ( (LA13_51=='\\') ) {s = 58;}

                        else if ( ((LA13_51>='a' && LA13_51<='z')) ) {s = 46;}

                        else if ( ((LA13_51>='A' && LA13_51<='Z')) ) {s = 47;}

                        else if ( ((LA13_51>='0' && LA13_51<='9')) ) {s = 48;}

                        else if ( (LA13_51=='_') ) {s = 49;}

                        else if ( (LA13_51==':') ) {s = 50;}

                        else if ( (LA13_51=='#') ) {s = 51;}

                        else if ( (LA13_51=='/') ) {s = 52;}

                        else if ( (LA13_51=='.') ) {s = 53;}

                        else if ( (LA13_51=='-') ) {s = 54;}

                        else if ( (LA13_51=='{') ) {s = 56;}

                        else if ( (LA13_51=='}') ) {s = 57;}

                        else if ( (LA13_51=='$') ) {s = 59;}

                        else if ( ((LA13_51>='\u0000' && LA13_51<='!')||(LA13_51>='%' && LA13_51<=',')||(LA13_51>=';' && LA13_51<='@')||LA13_51=='['||(LA13_51>=']' && LA13_51<='^')||LA13_51=='`'||LA13_51=='|'||(LA13_51>='~' && LA13_51<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_93 = input.LA(1);

                        s = -1;
                        if ( (LA13_93=='\"') ) {s = 55;}

                        else if ( (LA13_93=='\\') ) {s = 58;}

                        else if ( ((LA13_93>='a' && LA13_93<='z')) ) {s = 46;}

                        else if ( ((LA13_93>='A' && LA13_93<='Z')) ) {s = 47;}

                        else if ( ((LA13_93>='0' && LA13_93<='9')) ) {s = 48;}

                        else if ( (LA13_93=='_') ) {s = 49;}

                        else if ( (LA13_93==':') ) {s = 50;}

                        else if ( (LA13_93=='#') ) {s = 51;}

                        else if ( (LA13_93=='/') ) {s = 52;}

                        else if ( (LA13_93=='.') ) {s = 53;}

                        else if ( (LA13_93=='-') ) {s = 54;}

                        else if ( (LA13_93=='{') ) {s = 56;}

                        else if ( (LA13_93=='}') ) {s = 57;}

                        else if ( (LA13_93=='$') ) {s = 59;}

                        else if ( ((LA13_93>='\u0000' && LA13_93<='!')||(LA13_93>='%' && LA13_93<=',')||(LA13_93>=';' && LA13_93<='@')||LA13_93=='['||(LA13_93>=']' && LA13_93<='^')||LA13_93=='`'||LA13_93=='|'||(LA13_93>='~' && LA13_93<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( ((LA13_52>='a' && LA13_52<='z')) ) {s = 46;}

                        else if ( ((LA13_52>='A' && LA13_52<='Z')) ) {s = 47;}

                        else if ( ((LA13_52>='0' && LA13_52<='9')) ) {s = 48;}

                        else if ( (LA13_52=='_') ) {s = 49;}

                        else if ( (LA13_52==':') ) {s = 50;}

                        else if ( (LA13_52=='#') ) {s = 51;}

                        else if ( (LA13_52=='/') ) {s = 52;}

                        else if ( (LA13_52=='.') ) {s = 53;}

                        else if ( (LA13_52=='-') ) {s = 54;}

                        else if ( (LA13_52=='\"') ) {s = 55;}

                        else if ( (LA13_52=='{') ) {s = 56;}

                        else if ( (LA13_52=='}') ) {s = 57;}

                        else if ( (LA13_52=='\\') ) {s = 58;}

                        else if ( (LA13_52=='$') ) {s = 59;}

                        else if ( ((LA13_52>='\u0000' && LA13_52<='!')||(LA13_52>='%' && LA13_52<=',')||(LA13_52>=';' && LA13_52<='@')||LA13_52=='['||(LA13_52>=']' && LA13_52<='^')||LA13_52=='`'||LA13_52=='|'||(LA13_52>='~' && LA13_52<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_94 = input.LA(1);

                        s = -1;
                        if ( (LA13_94=='\"') ) {s = 55;}

                        else if ( (LA13_94=='\\') ) {s = 58;}

                        else if ( ((LA13_94>='a' && LA13_94<='z')) ) {s = 46;}

                        else if ( ((LA13_94>='A' && LA13_94<='Z')) ) {s = 47;}

                        else if ( ((LA13_94>='0' && LA13_94<='9')) ) {s = 48;}

                        else if ( (LA13_94=='_') ) {s = 49;}

                        else if ( (LA13_94==':') ) {s = 50;}

                        else if ( (LA13_94=='#') ) {s = 51;}

                        else if ( (LA13_94=='/') ) {s = 52;}

                        else if ( (LA13_94=='.') ) {s = 53;}

                        else if ( (LA13_94=='-') ) {s = 54;}

                        else if ( (LA13_94=='{') ) {s = 56;}

                        else if ( (LA13_94=='}') ) {s = 57;}

                        else if ( (LA13_94=='$') ) {s = 59;}

                        else if ( ((LA13_94>='\u0000' && LA13_94<='!')||(LA13_94>='%' && LA13_94<=',')||(LA13_94>=';' && LA13_94<='@')||LA13_94=='['||(LA13_94>=']' && LA13_94<='^')||LA13_94=='`'||LA13_94=='|'||(LA13_94>='~' && LA13_94<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_53 = input.LA(1);

                        s = -1;
                        if ( ((LA13_53>='a' && LA13_53<='z')) ) {s = 46;}

                        else if ( ((LA13_53>='A' && LA13_53<='Z')) ) {s = 47;}

                        else if ( ((LA13_53>='0' && LA13_53<='9')) ) {s = 48;}

                        else if ( (LA13_53=='_') ) {s = 49;}

                        else if ( (LA13_53==':') ) {s = 50;}

                        else if ( (LA13_53=='#') ) {s = 51;}

                        else if ( (LA13_53=='/') ) {s = 52;}

                        else if ( (LA13_53=='.') ) {s = 53;}

                        else if ( (LA13_53=='-') ) {s = 54;}

                        else if ( (LA13_53=='\"') ) {s = 55;}

                        else if ( (LA13_53=='{') ) {s = 56;}

                        else if ( (LA13_53=='}') ) {s = 57;}

                        else if ( (LA13_53=='\\') ) {s = 58;}

                        else if ( (LA13_53=='$') ) {s = 59;}

                        else if ( ((LA13_53>='\u0000' && LA13_53<='!')||(LA13_53>='%' && LA13_53<=',')||(LA13_53>=';' && LA13_53<='@')||LA13_53=='['||(LA13_53>=']' && LA13_53<='^')||LA13_53=='`'||LA13_53=='|'||(LA13_53>='~' && LA13_53<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA13_95 = input.LA(1);

                        s = -1;
                        if ( (LA13_95=='\"') ) {s = 55;}

                        else if ( (LA13_95=='\\') ) {s = 58;}

                        else if ( ((LA13_95>='a' && LA13_95<='z')) ) {s = 46;}

                        else if ( ((LA13_95>='A' && LA13_95<='Z')) ) {s = 47;}

                        else if ( ((LA13_95>='0' && LA13_95<='9')) ) {s = 48;}

                        else if ( (LA13_95=='_') ) {s = 49;}

                        else if ( (LA13_95==':') ) {s = 50;}

                        else if ( (LA13_95=='#') ) {s = 51;}

                        else if ( (LA13_95=='/') ) {s = 52;}

                        else if ( (LA13_95=='.') ) {s = 53;}

                        else if ( (LA13_95=='-') ) {s = 54;}

                        else if ( (LA13_95=='{') ) {s = 56;}

                        else if ( (LA13_95=='}') ) {s = 57;}

                        else if ( (LA13_95=='$') ) {s = 59;}

                        else if ( ((LA13_95>='\u0000' && LA13_95<='!')||(LA13_95>='%' && LA13_95<=',')||(LA13_95>=';' && LA13_95<='@')||LA13_95=='['||(LA13_95>=']' && LA13_95<='^')||LA13_95=='`'||LA13_95=='|'||(LA13_95>='~' && LA13_95<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA13_54 = input.LA(1);

                        s = -1;
                        if ( ((LA13_54>='a' && LA13_54<='z')) ) {s = 46;}

                        else if ( ((LA13_54>='A' && LA13_54<='Z')) ) {s = 47;}

                        else if ( ((LA13_54>='0' && LA13_54<='9')) ) {s = 48;}

                        else if ( (LA13_54=='_') ) {s = 49;}

                        else if ( (LA13_54==':') ) {s = 50;}

                        else if ( (LA13_54=='#') ) {s = 51;}

                        else if ( (LA13_54=='/') ) {s = 52;}

                        else if ( (LA13_54=='.') ) {s = 53;}

                        else if ( (LA13_54=='-') ) {s = 54;}

                        else if ( (LA13_54=='\"') ) {s = 55;}

                        else if ( (LA13_54=='{') ) {s = 56;}

                        else if ( (LA13_54=='}') ) {s = 57;}

                        else if ( (LA13_54=='\\') ) {s = 58;}

                        else if ( (LA13_54=='$') ) {s = 59;}

                        else if ( ((LA13_54>='\u0000' && LA13_54<='!')||(LA13_54>='%' && LA13_54<=',')||(LA13_54>=';' && LA13_54<='@')||LA13_54=='['||(LA13_54>=']' && LA13_54<='^')||LA13_54=='`'||LA13_54=='|'||(LA13_54>='~' && LA13_54<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA13_96 = input.LA(1);

                        s = -1;
                        if ( (LA13_96=='\"') ) {s = 55;}

                        else if ( (LA13_96=='\\') ) {s = 58;}

                        else if ( ((LA13_96>='a' && LA13_96<='z')) ) {s = 46;}

                        else if ( ((LA13_96>='A' && LA13_96<='Z')) ) {s = 47;}

                        else if ( ((LA13_96>='0' && LA13_96<='9')) ) {s = 48;}

                        else if ( (LA13_96=='_') ) {s = 49;}

                        else if ( (LA13_96==':') ) {s = 50;}

                        else if ( (LA13_96=='#') ) {s = 51;}

                        else if ( (LA13_96=='/') ) {s = 52;}

                        else if ( (LA13_96=='.') ) {s = 53;}

                        else if ( (LA13_96=='-') ) {s = 54;}

                        else if ( (LA13_96=='{') ) {s = 56;}

                        else if ( (LA13_96=='}') ) {s = 57;}

                        else if ( (LA13_96=='$') ) {s = 59;}

                        else if ( ((LA13_96>='\u0000' && LA13_96<='!')||(LA13_96>='%' && LA13_96<=',')||(LA13_96>=';' && LA13_96<='@')||LA13_96=='['||(LA13_96>=']' && LA13_96<='^')||LA13_96=='`'||LA13_96=='|'||(LA13_96>='~' && LA13_96<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA13_97 = input.LA(1);

                        s = -1;
                        if ( (LA13_97=='\"') ) {s = 55;}

                        else if ( (LA13_97=='\\') ) {s = 58;}

                        else if ( ((LA13_97>='a' && LA13_97<='z')) ) {s = 46;}

                        else if ( ((LA13_97>='A' && LA13_97<='Z')) ) {s = 47;}

                        else if ( ((LA13_97>='0' && LA13_97<='9')) ) {s = 48;}

                        else if ( (LA13_97=='_') ) {s = 49;}

                        else if ( (LA13_97==':') ) {s = 50;}

                        else if ( (LA13_97=='#') ) {s = 51;}

                        else if ( (LA13_97=='/') ) {s = 52;}

                        else if ( (LA13_97=='.') ) {s = 53;}

                        else if ( (LA13_97=='-') ) {s = 54;}

                        else if ( (LA13_97=='{') ) {s = 56;}

                        else if ( (LA13_97=='}') ) {s = 57;}

                        else if ( (LA13_97=='$') ) {s = 59;}

                        else if ( ((LA13_97>='\u0000' && LA13_97<='!')||(LA13_97>='%' && LA13_97<=',')||(LA13_97>=';' && LA13_97<='@')||LA13_97=='['||(LA13_97>=']' && LA13_97<='^')||LA13_97=='`'||LA13_97=='|'||(LA13_97>='~' && LA13_97<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA13_56 = input.LA(1);

                        s = -1;
                        if ( (LA13_56=='\"') ) {s = 55;}

                        else if ( (LA13_56=='\\') ) {s = 58;}

                        else if ( ((LA13_56>='a' && LA13_56<='z')) ) {s = 46;}

                        else if ( ((LA13_56>='A' && LA13_56<='Z')) ) {s = 47;}

                        else if ( ((LA13_56>='0' && LA13_56<='9')) ) {s = 48;}

                        else if ( (LA13_56=='_') ) {s = 49;}

                        else if ( (LA13_56==':') ) {s = 50;}

                        else if ( (LA13_56=='#') ) {s = 51;}

                        else if ( (LA13_56=='/') ) {s = 52;}

                        else if ( (LA13_56=='.') ) {s = 53;}

                        else if ( (LA13_56=='-') ) {s = 54;}

                        else if ( (LA13_56=='{') ) {s = 56;}

                        else if ( (LA13_56=='}') ) {s = 57;}

                        else if ( (LA13_56=='$') ) {s = 59;}

                        else if ( ((LA13_56>='\u0000' && LA13_56<='!')||(LA13_56>='%' && LA13_56<=',')||(LA13_56>=';' && LA13_56<='@')||LA13_56=='['||(LA13_56>=']' && LA13_56<='^')||LA13_56=='`'||LA13_56=='|'||(LA13_56>='~' && LA13_56<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( (LA13_98=='\"') ) {s = 55;}

                        else if ( (LA13_98=='\\') ) {s = 58;}

                        else if ( ((LA13_98>='a' && LA13_98<='z')) ) {s = 46;}

                        else if ( ((LA13_98>='A' && LA13_98<='Z')) ) {s = 47;}

                        else if ( ((LA13_98>='0' && LA13_98<='9')) ) {s = 48;}

                        else if ( (LA13_98=='_') ) {s = 49;}

                        else if ( (LA13_98==':') ) {s = 50;}

                        else if ( (LA13_98=='#') ) {s = 51;}

                        else if ( (LA13_98=='/') ) {s = 52;}

                        else if ( (LA13_98=='.') ) {s = 53;}

                        else if ( (LA13_98=='-') ) {s = 54;}

                        else if ( (LA13_98=='{') ) {s = 56;}

                        else if ( (LA13_98=='}') ) {s = 57;}

                        else if ( (LA13_98=='$') ) {s = 59;}

                        else if ( ((LA13_98>='\u0000' && LA13_98<='!')||(LA13_98>='%' && LA13_98<=',')||(LA13_98>=';' && LA13_98<='@')||LA13_98=='['||(LA13_98>=']' && LA13_98<='^')||LA13_98=='`'||LA13_98=='|'||(LA13_98>='~' && LA13_98<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA13_57 = input.LA(1);

                        s = -1;
                        if ( (LA13_57=='\"') ) {s = 55;}

                        else if ( (LA13_57=='\\') ) {s = 58;}

                        else if ( ((LA13_57>='a' && LA13_57<='z')) ) {s = 46;}

                        else if ( ((LA13_57>='A' && LA13_57<='Z')) ) {s = 47;}

                        else if ( ((LA13_57>='0' && LA13_57<='9')) ) {s = 48;}

                        else if ( (LA13_57=='_') ) {s = 49;}

                        else if ( (LA13_57==':') ) {s = 50;}

                        else if ( (LA13_57=='#') ) {s = 51;}

                        else if ( (LA13_57=='/') ) {s = 52;}

                        else if ( (LA13_57=='.') ) {s = 53;}

                        else if ( (LA13_57=='-') ) {s = 54;}

                        else if ( (LA13_57=='{') ) {s = 56;}

                        else if ( (LA13_57=='}') ) {s = 57;}

                        else if ( (LA13_57=='$') ) {s = 59;}

                        else if ( ((LA13_57>='\u0000' && LA13_57<='!')||(LA13_57>='%' && LA13_57<=',')||(LA13_57>=';' && LA13_57<='@')||LA13_57=='['||(LA13_57>=']' && LA13_57<='^')||LA13_57=='`'||LA13_57=='|'||(LA13_57>='~' && LA13_57<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA13_59 = input.LA(1);

                        s = -1;
                        if ( (LA13_59=='\"') ) {s = 55;}

                        else if ( (LA13_59=='\\') ) {s = 58;}

                        else if ( ((LA13_59>='a' && LA13_59<='z')) ) {s = 46;}

                        else if ( ((LA13_59>='A' && LA13_59<='Z')) ) {s = 47;}

                        else if ( ((LA13_59>='0' && LA13_59<='9')) ) {s = 48;}

                        else if ( (LA13_59=='_') ) {s = 49;}

                        else if ( (LA13_59==':') ) {s = 50;}

                        else if ( (LA13_59=='#') ) {s = 51;}

                        else if ( (LA13_59=='/') ) {s = 52;}

                        else if ( (LA13_59=='.') ) {s = 53;}

                        else if ( (LA13_59=='-') ) {s = 54;}

                        else if ( (LA13_59=='{') ) {s = 56;}

                        else if ( (LA13_59=='}') ) {s = 57;}

                        else if ( (LA13_59=='$') ) {s = 59;}

                        else if ( ((LA13_59>='\u0000' && LA13_59<='!')||(LA13_59>='%' && LA13_59<=',')||(LA13_59>=';' && LA13_59<='@')||LA13_59=='['||(LA13_59>=']' && LA13_59<='^')||LA13_59=='`'||LA13_59=='|'||(LA13_59>='~' && LA13_59<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA13_45 = input.LA(1);

                        s = -1;
                        if ( ((LA13_45>='a' && LA13_45<='z')) ) {s = 70;}

                        else if ( ((LA13_45>='A' && LA13_45<='Z')) ) {s = 71;}

                        else if ( ((LA13_45>='0' && LA13_45<='9')) ) {s = 72;}

                        else if ( (LA13_45=='_') ) {s = 73;}

                        else if ( (LA13_45==':') ) {s = 74;}

                        else if ( (LA13_45=='#') ) {s = 75;}

                        else if ( (LA13_45=='/') ) {s = 76;}

                        else if ( (LA13_45=='.') ) {s = 77;}

                        else if ( (LA13_45=='-') ) {s = 78;}

                        else if ( (LA13_45=='\"') ) {s = 79;}

                        else if ( (LA13_45=='{') ) {s = 80;}

                        else if ( (LA13_45=='}') ) {s = 81;}

                        else if ( (LA13_45=='\\') ) {s = 82;}

                        else if ( (LA13_45=='$') ) {s = 83;}

                        else if ( ((LA13_45>='\u0000' && LA13_45<='!')||(LA13_45>='%' && LA13_45<=',')||(LA13_45>=';' && LA13_45<='@')||LA13_45=='['||(LA13_45>=']' && LA13_45<='^')||LA13_45=='`'||LA13_45=='|'||(LA13_45>='~' && LA13_45<='\uFFFF')) ) {s = 84;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( ((LA13_70>='\u0000' && LA13_70<='!')||(LA13_70>='%' && LA13_70<=',')||(LA13_70>=';' && LA13_70<='@')||LA13_70=='['||(LA13_70>=']' && LA13_70<='^')||LA13_70=='`'||LA13_70=='|'||(LA13_70>='~' && LA13_70<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_70>='a' && LA13_70<='z')) ) {s = 70;}

                        else if ( ((LA13_70>='A' && LA13_70<='Z')) ) {s = 71;}

                        else if ( ((LA13_70>='0' && LA13_70<='9')) ) {s = 72;}

                        else if ( (LA13_70=='_') ) {s = 73;}

                        else if ( (LA13_70==':') ) {s = 74;}

                        else if ( (LA13_70=='#') ) {s = 75;}

                        else if ( (LA13_70=='/') ) {s = 76;}

                        else if ( (LA13_70=='.') ) {s = 77;}

                        else if ( (LA13_70=='-') ) {s = 78;}

                        else if ( (LA13_70=='\"') ) {s = 79;}

                        else if ( (LA13_70=='{') ) {s = 80;}

                        else if ( (LA13_70=='}') ) {s = 81;}

                        else if ( (LA13_70=='\\') ) {s = 82;}

                        else if ( (LA13_70=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA13_26 = input.LA(1);

                        s = -1;
                        if ( ((LA13_26>='\u0000' && LA13_26<='\uFFFF')) ) {s = 60;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( ((LA13_71>='\u0000' && LA13_71<='!')||(LA13_71>='%' && LA13_71<=',')||(LA13_71>=';' && LA13_71<='@')||LA13_71=='['||(LA13_71>=']' && LA13_71<='^')||LA13_71=='`'||LA13_71=='|'||(LA13_71>='~' && LA13_71<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_71>='a' && LA13_71<='z')) ) {s = 70;}

                        else if ( ((LA13_71>='A' && LA13_71<='Z')) ) {s = 71;}

                        else if ( ((LA13_71>='0' && LA13_71<='9')) ) {s = 72;}

                        else if ( (LA13_71=='_') ) {s = 73;}

                        else if ( (LA13_71==':') ) {s = 74;}

                        else if ( (LA13_71=='#') ) {s = 75;}

                        else if ( (LA13_71=='/') ) {s = 76;}

                        else if ( (LA13_71=='.') ) {s = 77;}

                        else if ( (LA13_71=='-') ) {s = 78;}

                        else if ( (LA13_71=='\"') ) {s = 79;}

                        else if ( (LA13_71=='{') ) {s = 80;}

                        else if ( (LA13_71=='}') ) {s = 81;}

                        else if ( (LA13_71=='\\') ) {s = 82;}

                        else if ( (LA13_71=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA13_73 = input.LA(1);

                        s = -1;
                        if ( ((LA13_73>='\u0000' && LA13_73<='!')||(LA13_73>='%' && LA13_73<=',')||(LA13_73>=';' && LA13_73<='@')||LA13_73=='['||(LA13_73>=']' && LA13_73<='^')||LA13_73=='`'||LA13_73=='|'||(LA13_73>='~' && LA13_73<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_73>='a' && LA13_73<='z')) ) {s = 70;}

                        else if ( ((LA13_73>='A' && LA13_73<='Z')) ) {s = 71;}

                        else if ( ((LA13_73>='0' && LA13_73<='9')) ) {s = 72;}

                        else if ( (LA13_73=='_') ) {s = 73;}

                        else if ( (LA13_73==':') ) {s = 74;}

                        else if ( (LA13_73=='#') ) {s = 75;}

                        else if ( (LA13_73=='/') ) {s = 76;}

                        else if ( (LA13_73=='.') ) {s = 77;}

                        else if ( (LA13_73=='-') ) {s = 78;}

                        else if ( (LA13_73=='\"') ) {s = 79;}

                        else if ( (LA13_73=='{') ) {s = 80;}

                        else if ( (LA13_73=='}') ) {s = 81;}

                        else if ( (LA13_73=='\\') ) {s = 82;}

                        else if ( (LA13_73=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA13_74 = input.LA(1);

                        s = -1;
                        if ( ((LA13_74>='\u0000' && LA13_74<='!')||(LA13_74>='%' && LA13_74<=',')||(LA13_74>=';' && LA13_74<='@')||LA13_74=='['||(LA13_74>=']' && LA13_74<='^')||LA13_74=='`'||LA13_74=='|'||(LA13_74>='~' && LA13_74<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_74>='a' && LA13_74<='z')) ) {s = 70;}

                        else if ( ((LA13_74>='A' && LA13_74<='Z')) ) {s = 71;}

                        else if ( ((LA13_74>='0' && LA13_74<='9')) ) {s = 72;}

                        else if ( (LA13_74=='_') ) {s = 73;}

                        else if ( (LA13_74==':') ) {s = 74;}

                        else if ( (LA13_74=='#') ) {s = 75;}

                        else if ( (LA13_74=='/') ) {s = 76;}

                        else if ( (LA13_74=='.') ) {s = 77;}

                        else if ( (LA13_74=='-') ) {s = 78;}

                        else if ( (LA13_74=='\"') ) {s = 79;}

                        else if ( (LA13_74=='{') ) {s = 80;}

                        else if ( (LA13_74=='}') ) {s = 81;}

                        else if ( (LA13_74=='\\') ) {s = 82;}

                        else if ( (LA13_74=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA13_75 = input.LA(1);

                        s = -1;
                        if ( ((LA13_75>='\u0000' && LA13_75<='!')||(LA13_75>='%' && LA13_75<=',')||(LA13_75>=';' && LA13_75<='@')||LA13_75=='['||(LA13_75>=']' && LA13_75<='^')||LA13_75=='`'||LA13_75=='|'||(LA13_75>='~' && LA13_75<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_75>='a' && LA13_75<='z')) ) {s = 70;}

                        else if ( ((LA13_75>='A' && LA13_75<='Z')) ) {s = 71;}

                        else if ( ((LA13_75>='0' && LA13_75<='9')) ) {s = 72;}

                        else if ( (LA13_75=='_') ) {s = 73;}

                        else if ( (LA13_75==':') ) {s = 74;}

                        else if ( (LA13_75=='#') ) {s = 75;}

                        else if ( (LA13_75=='/') ) {s = 76;}

                        else if ( (LA13_75=='.') ) {s = 77;}

                        else if ( (LA13_75=='-') ) {s = 78;}

                        else if ( (LA13_75=='\"') ) {s = 79;}

                        else if ( (LA13_75=='{') ) {s = 80;}

                        else if ( (LA13_75=='}') ) {s = 81;}

                        else if ( (LA13_75=='\\') ) {s = 82;}

                        else if ( (LA13_75=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA13_87 = input.LA(1);

                        s = -1;
                        if ( (LA13_87=='\"') ) {s = 55;}

                        else if ( (LA13_87=='\\') ) {s = 58;}

                        else if ( ((LA13_87>='a' && LA13_87<='z')) ) {s = 46;}

                        else if ( ((LA13_87>='A' && LA13_87<='Z')) ) {s = 47;}

                        else if ( ((LA13_87>='0' && LA13_87<='9')) ) {s = 48;}

                        else if ( (LA13_87=='_') ) {s = 49;}

                        else if ( (LA13_87==':') ) {s = 50;}

                        else if ( (LA13_87=='#') ) {s = 51;}

                        else if ( (LA13_87=='/') ) {s = 52;}

                        else if ( (LA13_87=='.') ) {s = 53;}

                        else if ( (LA13_87=='-') ) {s = 54;}

                        else if ( (LA13_87=='{') ) {s = 56;}

                        else if ( (LA13_87=='}') ) {s = 57;}

                        else if ( (LA13_87=='$') ) {s = 59;}

                        else if ( ((LA13_87>='\u0000' && LA13_87<='!')||(LA13_87>='%' && LA13_87<=',')||(LA13_87>=';' && LA13_87<='@')||LA13_87=='['||(LA13_87>=']' && LA13_87<='^')||LA13_87=='`'||LA13_87=='|'||(LA13_87>='~' && LA13_87<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA13_76 = input.LA(1);

                        s = -1;
                        if ( ((LA13_76>='a' && LA13_76<='z')) ) {s = 70;}

                        else if ( ((LA13_76>='A' && LA13_76<='Z')) ) {s = 71;}

                        else if ( ((LA13_76>='0' && LA13_76<='9')) ) {s = 72;}

                        else if ( (LA13_76=='_') ) {s = 73;}

                        else if ( (LA13_76==':') ) {s = 74;}

                        else if ( (LA13_76=='#') ) {s = 75;}

                        else if ( (LA13_76=='/') ) {s = 76;}

                        else if ( (LA13_76=='.') ) {s = 77;}

                        else if ( (LA13_76=='-') ) {s = 78;}

                        else if ( (LA13_76=='\"') ) {s = 79;}

                        else if ( (LA13_76=='{') ) {s = 80;}

                        else if ( (LA13_76=='}') ) {s = 81;}

                        else if ( (LA13_76=='\\') ) {s = 82;}

                        else if ( (LA13_76=='$') ) {s = 83;}

                        else if ( ((LA13_76>='\u0000' && LA13_76<='!')||(LA13_76>='%' && LA13_76<=',')||(LA13_76>=';' && LA13_76<='@')||LA13_76=='['||(LA13_76>=']' && LA13_76<='^')||LA13_76=='`'||LA13_76=='|'||(LA13_76>='~' && LA13_76<='\uFFFF')) ) {s = 84;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA13_77 = input.LA(1);

                        s = -1;
                        if ( ((LA13_77>='a' && LA13_77<='z')) ) {s = 70;}

                        else if ( ((LA13_77>='A' && LA13_77<='Z')) ) {s = 71;}

                        else if ( ((LA13_77>='0' && LA13_77<='9')) ) {s = 72;}

                        else if ( (LA13_77=='_') ) {s = 73;}

                        else if ( (LA13_77==':') ) {s = 74;}

                        else if ( (LA13_77=='#') ) {s = 75;}

                        else if ( (LA13_77=='/') ) {s = 76;}

                        else if ( (LA13_77=='.') ) {s = 77;}

                        else if ( (LA13_77=='-') ) {s = 78;}

                        else if ( (LA13_77=='\"') ) {s = 79;}

                        else if ( (LA13_77=='{') ) {s = 80;}

                        else if ( (LA13_77=='}') ) {s = 81;}

                        else if ( (LA13_77=='\\') ) {s = 82;}

                        else if ( (LA13_77=='$') ) {s = 83;}

                        else if ( ((LA13_77>='\u0000' && LA13_77<='!')||(LA13_77>='%' && LA13_77<=',')||(LA13_77>=';' && LA13_77<='@')||LA13_77=='['||(LA13_77>=']' && LA13_77<='^')||LA13_77=='`'||LA13_77=='|'||(LA13_77>='~' && LA13_77<='\uFFFF')) ) {s = 84;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA13_48 = input.LA(1);

                        s = -1;
                        if ( ((LA13_48>='a' && LA13_48<='z')) ) {s = 46;}

                        else if ( ((LA13_48>='A' && LA13_48<='Z')) ) {s = 47;}

                        else if ( ((LA13_48>='0' && LA13_48<='9')) ) {s = 48;}

                        else if ( (LA13_48=='_') ) {s = 49;}

                        else if ( (LA13_48==':') ) {s = 50;}

                        else if ( (LA13_48=='#') ) {s = 51;}

                        else if ( (LA13_48=='/') ) {s = 52;}

                        else if ( (LA13_48=='.') ) {s = 53;}

                        else if ( (LA13_48=='-') ) {s = 54;}

                        else if ( (LA13_48=='\"') ) {s = 55;}

                        else if ( (LA13_48=='{') ) {s = 56;}

                        else if ( (LA13_48=='}') ) {s = 57;}

                        else if ( (LA13_48=='\\') ) {s = 58;}

                        else if ( (LA13_48=='$') ) {s = 59;}

                        else if ( ((LA13_48>='\u0000' && LA13_48<='!')||(LA13_48>='%' && LA13_48<=',')||(LA13_48>=';' && LA13_48<='@')||LA13_48=='['||(LA13_48>=']' && LA13_48<='^')||LA13_48=='`'||LA13_48=='|'||(LA13_48>='~' && LA13_48<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA13_78 = input.LA(1);

                        s = -1;
                        if ( ((LA13_78>='\u0000' && LA13_78<='!')||(LA13_78>='%' && LA13_78<=',')||(LA13_78>=';' && LA13_78<='@')||LA13_78=='['||(LA13_78>=']' && LA13_78<='^')||LA13_78=='`'||LA13_78=='|'||(LA13_78>='~' && LA13_78<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_78>='a' && LA13_78<='z')) ) {s = 70;}

                        else if ( ((LA13_78>='A' && LA13_78<='Z')) ) {s = 71;}

                        else if ( ((LA13_78>='0' && LA13_78<='9')) ) {s = 72;}

                        else if ( (LA13_78=='_') ) {s = 73;}

                        else if ( (LA13_78==':') ) {s = 74;}

                        else if ( (LA13_78=='#') ) {s = 75;}

                        else if ( (LA13_78=='/') ) {s = 76;}

                        else if ( (LA13_78=='.') ) {s = 77;}

                        else if ( (LA13_78=='-') ) {s = 78;}

                        else if ( (LA13_78=='\"') ) {s = 79;}

                        else if ( (LA13_78=='{') ) {s = 80;}

                        else if ( (LA13_78=='}') ) {s = 81;}

                        else if ( (LA13_78=='\\') ) {s = 82;}

                        else if ( (LA13_78=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA13_79 = input.LA(1);

                        s = -1;
                        if ( ((LA13_79>='\u0000' && LA13_79<='!')||(LA13_79>='%' && LA13_79<=',')||(LA13_79>=';' && LA13_79<='@')||LA13_79=='['||(LA13_79>=']' && LA13_79<='^')||LA13_79=='`'||LA13_79=='|'||(LA13_79>='~' && LA13_79<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_79>='a' && LA13_79<='z')) ) {s = 70;}

                        else if ( ((LA13_79>='A' && LA13_79<='Z')) ) {s = 71;}

                        else if ( ((LA13_79>='0' && LA13_79<='9')) ) {s = 72;}

                        else if ( (LA13_79=='_') ) {s = 73;}

                        else if ( (LA13_79==':') ) {s = 74;}

                        else if ( (LA13_79=='#') ) {s = 75;}

                        else if ( (LA13_79=='/') ) {s = 76;}

                        else if ( (LA13_79=='.') ) {s = 77;}

                        else if ( (LA13_79=='-') ) {s = 78;}

                        else if ( (LA13_79=='\"') ) {s = 79;}

                        else if ( (LA13_79=='{') ) {s = 80;}

                        else if ( (LA13_79=='}') ) {s = 81;}

                        else if ( (LA13_79=='\\') ) {s = 82;}

                        else if ( (LA13_79=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( ((LA13_80>='\u0000' && LA13_80<='!')||(LA13_80>='%' && LA13_80<=',')||(LA13_80>=';' && LA13_80<='@')||LA13_80=='['||(LA13_80>=']' && LA13_80<='^')||LA13_80=='`'||LA13_80=='|'||(LA13_80>='~' && LA13_80<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_80>='a' && LA13_80<='z')) ) {s = 70;}

                        else if ( ((LA13_80>='A' && LA13_80<='Z')) ) {s = 71;}

                        else if ( ((LA13_80>='0' && LA13_80<='9')) ) {s = 72;}

                        else if ( (LA13_80=='_') ) {s = 73;}

                        else if ( (LA13_80==':') ) {s = 74;}

                        else if ( (LA13_80=='#') ) {s = 75;}

                        else if ( (LA13_80=='/') ) {s = 76;}

                        else if ( (LA13_80=='.') ) {s = 77;}

                        else if ( (LA13_80=='-') ) {s = 78;}

                        else if ( (LA13_80=='\"') ) {s = 79;}

                        else if ( (LA13_80=='{') ) {s = 80;}

                        else if ( (LA13_80=='}') ) {s = 81;}

                        else if ( (LA13_80=='\\') ) {s = 82;}

                        else if ( (LA13_80=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA13_81 = input.LA(1);

                        s = -1;
                        if ( ((LA13_81>='\u0000' && LA13_81<='!')||(LA13_81>='%' && LA13_81<=',')||(LA13_81>=';' && LA13_81<='@')||LA13_81=='['||(LA13_81>=']' && LA13_81<='^')||LA13_81=='`'||LA13_81=='|'||(LA13_81>='~' && LA13_81<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_81>='a' && LA13_81<='z')) ) {s = 70;}

                        else if ( ((LA13_81>='A' && LA13_81<='Z')) ) {s = 71;}

                        else if ( ((LA13_81>='0' && LA13_81<='9')) ) {s = 72;}

                        else if ( (LA13_81=='_') ) {s = 73;}

                        else if ( (LA13_81==':') ) {s = 74;}

                        else if ( (LA13_81=='#') ) {s = 75;}

                        else if ( (LA13_81=='/') ) {s = 76;}

                        else if ( (LA13_81=='.') ) {s = 77;}

                        else if ( (LA13_81=='-') ) {s = 78;}

                        else if ( (LA13_81=='\"') ) {s = 79;}

                        else if ( (LA13_81=='{') ) {s = 80;}

                        else if ( (LA13_81=='}') ) {s = 81;}

                        else if ( (LA13_81=='\\') ) {s = 82;}

                        else if ( (LA13_81=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA13_82 = input.LA(1);

                        s = -1;
                        if ( ((LA13_82>='\u0000' && LA13_82<='!')||(LA13_82>='%' && LA13_82<=',')||(LA13_82>=';' && LA13_82<='@')||LA13_82=='['||(LA13_82>=']' && LA13_82<='^')||LA13_82=='`'||LA13_82=='|'||(LA13_82>='~' && LA13_82<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_82>='a' && LA13_82<='z')) ) {s = 70;}

                        else if ( ((LA13_82>='A' && LA13_82<='Z')) ) {s = 71;}

                        else if ( ((LA13_82>='0' && LA13_82<='9')) ) {s = 72;}

                        else if ( (LA13_82=='_') ) {s = 73;}

                        else if ( (LA13_82==':') ) {s = 74;}

                        else if ( (LA13_82=='#') ) {s = 75;}

                        else if ( (LA13_82=='/') ) {s = 76;}

                        else if ( (LA13_82=='.') ) {s = 77;}

                        else if ( (LA13_82=='-') ) {s = 78;}

                        else if ( (LA13_82=='\"') ) {s = 79;}

                        else if ( (LA13_82=='{') ) {s = 80;}

                        else if ( (LA13_82=='}') ) {s = 81;}

                        else if ( (LA13_82=='\\') ) {s = 82;}

                        else if ( (LA13_82=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='(') ) {s = 1;}

                        else if ( (LA13_0==')') ) {s = 2;}

                        else if ( (LA13_0=='?') ) {s = 3;}

                        else if ( (LA13_0==':') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0=='A') ) {s = 6;}

                        else if ( (LA13_0=='M') ) {s = 7;}

                        else if ( (LA13_0=='O') ) {s = 8;}

                        else if ( (LA13_0=='N') ) {s = 9;}

                        else if ( (LA13_0=='S') ) {s = 10;}

                        else if ( ((LA13_0>='a' && LA13_0<='z')) ) {s = 11;}

                        else if ( ((LA13_0>='B' && LA13_0<='L')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')) ) {s = 12;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 13;}

                        else if ( (LA13_0=='_') ) {s = 14;}

                        else if ( (LA13_0=='#') ) {s = 15;}

                        else if ( (LA13_0=='/') ) {s = 16;}

                        else if ( (LA13_0=='.') ) {s = 17;}

                        else if ( (LA13_0=='-') ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='{') ) {s = 20;}

                        else if ( (LA13_0=='}') ) {s = 21;}

                        else if ( (LA13_0=='\\') ) {s = 22;}

                        else if ( (LA13_0=='$') ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 25;}

                        else if ( (LA13_0=='\'') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='%' && LA13_0<='&')||(LA13_0>='*' && LA13_0<=',')||(LA13_0>='<' && LA13_0<='>')||LA13_0=='@'||LA13_0=='['||LA13_0==']'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 28;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA13_83 = input.LA(1);

                        s = -1;
                        if ( ((LA13_83>='\u0000' && LA13_83<='!')||(LA13_83>='%' && LA13_83<=',')||(LA13_83>=';' && LA13_83<='@')||LA13_83=='['||(LA13_83>=']' && LA13_83<='^')||LA13_83=='`'||LA13_83=='|'||(LA13_83>='~' && LA13_83<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA13_83>='a' && LA13_83<='z')) ) {s = 70;}

                        else if ( ((LA13_83>='A' && LA13_83<='Z')) ) {s = 71;}

                        else if ( ((LA13_83>='0' && LA13_83<='9')) ) {s = 72;}

                        else if ( (LA13_83=='_') ) {s = 73;}

                        else if ( (LA13_83==':') ) {s = 74;}

                        else if ( (LA13_83=='#') ) {s = 75;}

                        else if ( (LA13_83=='/') ) {s = 76;}

                        else if ( (LA13_83=='.') ) {s = 77;}

                        else if ( (LA13_83=='-') ) {s = 78;}

                        else if ( (LA13_83=='\"') ) {s = 79;}

                        else if ( (LA13_83=='{') ) {s = 80;}

                        else if ( (LA13_83=='}') ) {s = 81;}

                        else if ( (LA13_83=='\\') ) {s = 82;}

                        else if ( (LA13_83=='$') ) {s = 83;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA13_58 = input.LA(1);

                        s = -1;
                        if ( ((LA13_58>='a' && LA13_58<='z')) ) {s = 85;}

                        else if ( ((LA13_58>='A' && LA13_58<='Z')) ) {s = 86;}

                        else if ( ((LA13_58>='0' && LA13_58<='9')) ) {s = 87;}

                        else if ( (LA13_58=='_') ) {s = 88;}

                        else if ( (LA13_58==':') ) {s = 89;}

                        else if ( (LA13_58=='#') ) {s = 90;}

                        else if ( (LA13_58=='/') ) {s = 91;}

                        else if ( (LA13_58=='.') ) {s = 92;}

                        else if ( (LA13_58=='-') ) {s = 93;}

                        else if ( (LA13_58=='\"') ) {s = 94;}

                        else if ( (LA13_58=='{') ) {s = 95;}

                        else if ( (LA13_58=='}') ) {s = 96;}

                        else if ( (LA13_58=='\\') ) {s = 97;}

                        else if ( (LA13_58=='$') ) {s = 98;}

                        else if ( ((LA13_58>='\u0000' && LA13_58<='!')||(LA13_58>='%' && LA13_58<=',')||(LA13_58>=';' && LA13_58<='@')||LA13_58=='['||(LA13_58>=']' && LA13_58<='^')||LA13_58=='`'||LA13_58=='|'||(LA13_58>='~' && LA13_58<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='a' && LA13_19<='z')) ) {s = 46;}

                        else if ( ((LA13_19>='A' && LA13_19<='Z')) ) {s = 47;}

                        else if ( ((LA13_19>='0' && LA13_19<='9')) ) {s = 48;}

                        else if ( (LA13_19=='_') ) {s = 49;}

                        else if ( (LA13_19==':') ) {s = 50;}

                        else if ( (LA13_19=='#') ) {s = 51;}

                        else if ( (LA13_19=='/') ) {s = 52;}

                        else if ( (LA13_19=='.') ) {s = 53;}

                        else if ( (LA13_19=='-') ) {s = 54;}

                        else if ( (LA13_19=='\"') ) {s = 55;}

                        else if ( (LA13_19=='{') ) {s = 56;}

                        else if ( (LA13_19=='}') ) {s = 57;}

                        else if ( (LA13_19=='\\') ) {s = 58;}

                        else if ( (LA13_19=='$') ) {s = 59;}

                        else if ( ((LA13_19>='\u0000' && LA13_19<='!')||(LA13_19>='%' && LA13_19<=',')||(LA13_19>=';' && LA13_19<='@')||LA13_19=='['||(LA13_19>=']' && LA13_19<='^')||LA13_19=='`'||LA13_19=='|'||(LA13_19>='~' && LA13_19<='\uFFFF')) ) {s = 60;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}