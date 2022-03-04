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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_UNICODE=4;
    public static final int RULE_INT=6;
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
            // InternalSimple.g:16:7: ( 'MIN' )
            // InternalSimple.g:16:9: 'MIN'
            {
            match("MIN"); 


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
            // InternalSimple.g:17:7: ( 'MAX' )
            // InternalSimple.g:17:9: 'MAX'
            {
            match("MAX"); 


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
            // InternalSimple.g:18:7: ( 'AND' )
            // InternalSimple.g:18:9: 'AND'
            {
            match("AND"); 


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
            // InternalSimple.g:593:14: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )* )
            // InternalSimple.g:593:16: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            {
            // InternalSimple.g:593:16: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimple.g:593:16: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalSimple.g:593:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ':' | '#' | '/' | '.' | '-' | '\"' | '{' | '}' | '\\\\' | '$' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\"' && LA2_0<='$')||(LA2_0>='-' && LA2_0<=':')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='{')||LA2_0=='}') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimple.g:
            	    {
            	    if ( (input.LA(1)>='\"' && input.LA(1)<='$')||(input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
            // InternalSimple.g:595:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSimple.g:595:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSimple.g:595:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimple.g:595:11: '^'
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

            // InternalSimple.g:595:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimple.g:597:10: ( ( '0' .. '9' )+ )
            // InternalSimple.g:597:12: ( '0' .. '9' )+
            {
            // InternalSimple.g:597:12: ( '0' .. '9' )+
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
            	    // InternalSimple.g:597:13: '0' .. '9'
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

            state.type = _type;
            state.channel = _channel;
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
            // InternalSimple.g:599:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSimple.g:599:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSimple.g:599:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSimple.g:599:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSimple.g:599:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSimple.g:599:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:599:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSimple.g:599:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSimple.g:599:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSimple.g:599:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimple.g:599:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSimple.g:601:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSimple.g:601:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSimple.g:601:24: ( options {greedy=false; } : . )*
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
            	    // InternalSimple.g:601:52: .
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
            // InternalSimple.g:603:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimple.g:603:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSimple.g:603:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimple.g:603:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSimple.g:603:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimple.g:603:41: ( '\\r' )? '\\n'
                    {
                    // InternalSimple.g:603:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSimple.g:603:41: '\\r'
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
            // InternalSimple.g:605:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSimple.g:605:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSimple.g:605:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSimple.g:607:16: ( . )
            // InternalSimple.g:607:18: .
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
        // InternalSimple.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_UNICODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
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
                // InternalSimple.g:1:103: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalSimple.g:1:112: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalSimple.g:1:124: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalSimple.g:1:140: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalSimple.g:1:156: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalSimple.g:1:164: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\15\3\uffff\1\15\1\uffff\7\15\1\uffff\3\15\1\24\6\uffff\1\52\1\uffff\4\15\1\56\6\15\3\uffff\1\15\2\uffff\1\64\1\65\1\66\1\uffff\1\67\3\15\5\uffff\1\15\1\73\2\uffff";
    static final String DFA14_eofS =
        "\74\uffff";
    static final String DFA14_minS =
        "\1\0\3\uffff\1\55\1\uffff\5\60\1\101\1\60\1\uffff\1\60\1\0\1\52\1\0\6\uffff\1\42\1\uffff\4\60\1\42\4\60\2\0\3\uffff\1\0\2\uffff\3\42\1\uffff\1\42\1\60\2\0\5\uffff\1\40\1\136\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\3\uffff\1\55\1\uffff\7\172\1\uffff\1\71\1\uffff\1\57\1\uffff\6\uffff\1\175\1\uffff\4\172\1\175\3\172\1\71\2\uffff\3\uffff\1\uffff\2\uffff\3\175\1\uffff\1\175\1\172\2\uffff\5\uffff\1\172\1\136\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\7\uffff\1\15\4\uffff\1\15\1\23\1\24\1\1\1\2\1\3\1\uffff\1\5\13\uffff\1\15\1\20\1\21\1\uffff\1\23\1\4\3\uffff\1\11\4\uffff\1\22\1\6\1\7\1\10\1\12\2\uffff\1\14\1\13";
    static final String DFA14_specialS =
        "\1\3\16\uffff\1\4\1\uffff\1\2\21\uffff\1\6\1\1\3\uffff\1\7\10\uffff\1\0\1\5\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\17\2\22\2\24\1\21\1\1\1\2\3\24\2\22\1\20\12\16\1\4\1\5\3\24\1\3\1\24\1\7\13\14\1\6\1\11\1\10\3\14\1\12\7\14\1\24\1\22\1\24\1\13\1\14\1\24\32\14\1\22\1\24\1\22\uff82\24",
            "",
            "",
            "",
            "\1\30",
            "",
            "\12\34\7\uffff\1\33\7\34\1\32\21\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\15\34\1\35\14\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\21\34\1\36\10\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\16\34\1\37\13\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\16\34\1\40\13\34\4\uffff\1\34\1\uffff\32\34",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\42",
            "\42\46\1\45\2\44\10\46\16\44\6\46\32\44\1\46\1\43\2\46\1\44\1\46\33\44\1\46\1\44\uff82\46",
            "\1\47\4\uffff\1\50",
            "\0\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\15\10\uffff\16\15\6\uffff\32\15\1\uffff\1\15\2\uffff\1\15\1\uffff\33\15\1\uffff\1\15",
            "",
            "\12\34\7\uffff\15\34\1\53\14\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\27\34\1\54\2\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\3\34\1\55\26\34\4\uffff\1\34\1\uffff\32\34",
            "\3\15\10\uffff\3\15\12\34\1\15\6\uffff\32\34\1\uffff\1\15\2\uffff\1\34\1\uffff\32\34\1\15\1\uffff\1\15",
            "\12\34\7\uffff\23\34\1\57\6\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\14\34\1\60\15\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\42",
            "\42\46\3\61\10\46\16\61\6\46\32\61\1\46\1\61\2\46\1\61\1\46\33\61\1\46\1\61\uff82\46",
            "\42\46\1\45\2\44\10\46\16\44\6\46\32\44\1\46\1\43\2\46\1\44\1\46\33\44\1\46\1\44\uff82\46",
            "",
            "",
            "",
            "\42\63\3\62\10\63\16\62\6\63\32\62\1\63\1\62\2\63\1\62\1\63\33\62\1\63\1\62\uff82\63",
            "",
            "",
            "\3\15\10\uffff\3\15\12\34\1\15\6\uffff\32\34\1\uffff\1\15\2\uffff\1\34\1\uffff\32\34\1\15\1\uffff\1\15",
            "\3\15\10\uffff\3\15\12\34\1\15\6\uffff\32\34\1\uffff\1\15\2\uffff\1\34\1\uffff\32\34\1\15\1\uffff\1\15",
            "\3\15\10\uffff\3\15\12\34\1\15\6\uffff\32\34\1\uffff\1\15\2\uffff\1\34\1\uffff\32\34\1\15\1\uffff\1\15",
            "",
            "\3\15\10\uffff\3\15\12\34\1\15\6\uffff\32\34\1\uffff\1\15\2\uffff\1\34\1\uffff\32\34\1\15\1\uffff\1\15",
            "\12\34\7\uffff\4\34\1\70\25\34\4\uffff\1\34\1\uffff\32\34",
            "\42\46\1\45\2\44\10\46\16\44\6\46\32\44\1\46\1\43\2\46\1\44\1\46\33\44\1\46\1\44\uff82\46",
            "\42\63\3\62\10\63\16\62\6\63\32\62\1\63\1\62\2\63\1\62\1\63\33\62\1\63\1\62\uff82\63",
            "",
            "",
            "",
            "",
            "",
            "\1\71\17\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\72",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_UNICODE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( (LA14_49=='\"') ) {s = 37;}

                        else if ( (LA14_49=='\\') ) {s = 35;}

                        else if ( ((LA14_49>='#' && LA14_49<='$')||(LA14_49>='-' && LA14_49<=':')||(LA14_49>='A' && LA14_49<='Z')||LA14_49=='_'||(LA14_49>='a' && LA14_49<='{')||LA14_49=='}') ) {s = 36;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='!')||(LA14_49>='%' && LA14_49<=',')||(LA14_49>=';' && LA14_49<='@')||LA14_49=='['||(LA14_49>=']' && LA14_49<='^')||LA14_49=='`'||LA14_49=='|'||(LA14_49>='~' && LA14_49<='\uFFFF')) ) {s = 38;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( (LA14_36=='\"') ) {s = 37;}

                        else if ( (LA14_36=='\\') ) {s = 35;}

                        else if ( ((LA14_36>='#' && LA14_36<='$')||(LA14_36>='-' && LA14_36<=':')||(LA14_36>='A' && LA14_36<='Z')||LA14_36=='_'||(LA14_36>='a' && LA14_36<='{')||LA14_36=='}') ) {s = 36;}

                        else if ( ((LA14_36>='\u0000' && LA14_36<='!')||(LA14_36>='%' && LA14_36<=',')||(LA14_36>=';' && LA14_36<='@')||LA14_36=='['||(LA14_36>=']' && LA14_36<='^')||LA14_36=='`'||LA14_36=='|'||(LA14_36>='~' && LA14_36<='\uFFFF')) ) {s = 38;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='(') ) {s = 1;}

                        else if ( (LA14_0==')') ) {s = 2;}

                        else if ( (LA14_0=='?') ) {s = 3;}

                        else if ( (LA14_0==':') ) {s = 4;}

                        else if ( (LA14_0==';') ) {s = 5;}

                        else if ( (LA14_0=='M') ) {s = 6;}

                        else if ( (LA14_0=='A') ) {s = 7;}

                        else if ( (LA14_0=='O') ) {s = 8;}

                        else if ( (LA14_0=='N') ) {s = 9;}

                        else if ( (LA14_0=='S') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( ((LA14_0>='B' && LA14_0<='L')||(LA14_0>='P' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 12;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='\"') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( (LA14_0=='\'') ) {s = 17;}

                        else if ( ((LA14_0>='#' && LA14_0<='$')||(LA14_0>='-' && LA14_0<='.')||LA14_0=='\\'||LA14_0=='{'||LA14_0=='}') ) {s = 18;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 19;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||(LA14_0>='<' && LA14_0<='>')||LA14_0=='@'||LA14_0=='['||LA14_0==']'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 20;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( (LA14_15=='\\') ) {s = 35;}

                        else if ( ((LA14_15>='#' && LA14_15<='$')||(LA14_15>='-' && LA14_15<=':')||(LA14_15>='A' && LA14_15<='Z')||LA14_15=='_'||(LA14_15>='a' && LA14_15<='{')||LA14_15=='}') ) {s = 36;}

                        else if ( (LA14_15=='\"') ) {s = 37;}

                        else if ( ((LA14_15>='\u0000' && LA14_15<='!')||(LA14_15>='%' && LA14_15<=',')||(LA14_15>=';' && LA14_15<='@')||LA14_15=='['||(LA14_15>=']' && LA14_15<='^')||LA14_15=='`'||LA14_15=='|'||(LA14_15>='~' && LA14_15<='\uFFFF')) ) {s = 38;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( ((LA14_50>='\u0000' && LA14_50<='!')||(LA14_50>='%' && LA14_50<=',')||(LA14_50>=';' && LA14_50<='@')||LA14_50=='['||(LA14_50>=']' && LA14_50<='^')||LA14_50=='`'||LA14_50=='|'||(LA14_50>='~' && LA14_50<='\uFFFF')) ) {s = 51;}

                        else if ( ((LA14_50>='\"' && LA14_50<='$')||(LA14_50>='-' && LA14_50<=':')||(LA14_50>='A' && LA14_50<='Z')||LA14_50=='\\'||LA14_50=='_'||(LA14_50>='a' && LA14_50<='{')||LA14_50=='}') ) {s = 50;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\"' && LA14_35<='$')||(LA14_35>='-' && LA14_35<=':')||(LA14_35>='A' && LA14_35<='Z')||LA14_35=='\\'||LA14_35=='_'||(LA14_35>='a' && LA14_35<='{')||LA14_35=='}') ) {s = 49;}

                        else if ( ((LA14_35>='\u0000' && LA14_35<='!')||(LA14_35>='%' && LA14_35<=',')||(LA14_35>=';' && LA14_35<='@')||LA14_35=='['||(LA14_35>=']' && LA14_35<='^')||LA14_35=='`'||LA14_35=='|'||(LA14_35>='~' && LA14_35<='\uFFFF')) ) {s = 38;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\"' && LA14_40<='$')||(LA14_40>='-' && LA14_40<=':')||(LA14_40>='A' && LA14_40<='Z')||LA14_40=='\\'||LA14_40=='_'||(LA14_40>='a' && LA14_40<='{')||LA14_40=='}') ) {s = 50;}

                        else if ( ((LA14_40>='\u0000' && LA14_40<='!')||(LA14_40>='%' && LA14_40<=',')||(LA14_40>=';' && LA14_40<='@')||LA14_40=='['||(LA14_40>=']' && LA14_40<='^')||LA14_40=='`'||LA14_40=='|'||(LA14_40>='~' && LA14_40<='\uFFFF')) ) {s = 51;}

                        else s = 13;

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