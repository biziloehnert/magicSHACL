package xtext.magicSHACL.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_IRI=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:11:7: ( 'sh:minCount' )
            // InternalTurtle.g:11:9: 'sh:minCount'
            {
            match("sh:minCount"); 


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
            // InternalTurtle.g:12:7: ( 'sh:maxCount' )
            // InternalTurtle.g:12:9: 'sh:maxCount'
            {
            match("sh:maxCount"); 


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
            // InternalTurtle.g:13:7: ( 'sh:and' )
            // InternalTurtle.g:13:9: 'sh:and'
            {
            match("sh:and"); 


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
            // InternalTurtle.g:14:7: ( 'sh:or' )
            // InternalTurtle.g:14:9: 'sh:or'
            {
            match("sh:or"); 


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
            // InternalTurtle.g:15:7: ( 'sh:not' )
            // InternalTurtle.g:15:9: 'sh:not'
            {
            match("sh:not"); 


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
            // InternalTurtle.g:16:7: ( 'sh:class' )
            // InternalTurtle.g:16:9: 'sh:class'
            {
            match("sh:class"); 


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
            // InternalTurtle.g:17:7: ( 'sh:hasValue' )
            // InternalTurtle.g:17:9: 'sh:hasValue'
            {
            match("sh:hasValue"); 


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
            // InternalTurtle.g:18:7: ( 'sh:nodeKind' )
            // InternalTurtle.g:18:9: 'sh:nodeKind'
            {
            match("sh:nodeKind"); 


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
            // InternalTurtle.g:19:7: ( 'sh:node' )
            // InternalTurtle.g:19:9: 'sh:node'
            {
            match("sh:node"); 


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
            // InternalTurtle.g:20:7: ( 'sh:datatype' )
            // InternalTurtle.g:20:9: 'sh:datatype'
            {
            match("sh:datatype"); 


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
            // InternalTurtle.g:21:7: ( 'sh:pattern' )
            // InternalTurtle.g:21:9: 'sh:pattern'
            {
            match("sh:pattern"); 


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
            // InternalTurtle.g:22:7: ( 'sh:closed' )
            // InternalTurtle.g:22:9: 'sh:closed'
            {
            match("sh:closed"); 


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
            // InternalTurtle.g:23:7: ( 'sh:ignoredProperties' )
            // InternalTurtle.g:23:9: 'sh:ignoredProperties'
            {
            match("sh:ignoredProperties"); 


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
            // InternalTurtle.g:24:7: ( 'sh:path' )
            // InternalTurtle.g:24:9: 'sh:path'
            {
            match("sh:path"); 


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
            // InternalTurtle.g:25:7: ( 'sh:inversePath' )
            // InternalTurtle.g:25:9: 'sh:inversePath'
            {
            match("sh:inversePath"); 


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
            // InternalTurtle.g:26:7: ( 'sh:property' )
            // InternalTurtle.g:26:9: 'sh:property'
            {
            match("sh:property"); 


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
            // InternalTurtle.g:27:7: ( 'sh:name' )
            // InternalTurtle.g:27:9: 'sh:name'
            {
            match("sh:name"); 


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
            // InternalTurtle.g:28:7: ( 'sh:targetClass' )
            // InternalTurtle.g:28:9: 'sh:targetClass'
            {
            match("sh:targetClass"); 


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
            // InternalTurtle.g:29:7: ( 'sh:targetNode' )
            // InternalTurtle.g:29:9: 'sh:targetNode'
            {
            match("sh:targetNode"); 


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
            // InternalTurtle.g:30:7: ( 'sh:message' )
            // InternalTurtle.g:30:9: 'sh:message'
            {
            match("sh:message"); 


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
            // InternalTurtle.g:31:7: ( 'sh:minExclusive' )
            // InternalTurtle.g:31:9: 'sh:minExclusive'
            {
            match("sh:minExclusive"); 


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
            // InternalTurtle.g:32:7: ( 'sh:minInclusive' )
            // InternalTurtle.g:32:9: 'sh:minInclusive'
            {
            match("sh:minInclusive"); 


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
            // InternalTurtle.g:33:7: ( 'sh:maxExclusive' )
            // InternalTurtle.g:33:9: 'sh:maxExclusive'
            {
            match("sh:maxExclusive"); 


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
            // InternalTurtle.g:34:7: ( 'sh:maxInclusive' )
            // InternalTurtle.g:34:9: 'sh:maxInclusive'
            {
            match("sh:maxInclusive"); 


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
            // InternalTurtle.g:35:7: ( 'sh:maxLength' )
            // InternalTurtle.g:35:9: 'sh:maxLength'
            {
            match("sh:maxLength"); 


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
            // InternalTurtle.g:36:7: ( 'sh:minLength' )
            // InternalTurtle.g:36:9: 'sh:minLength'
            {
            match("sh:minLength"); 


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
            // InternalTurtle.g:37:7: ( '@prefix' )
            // InternalTurtle.g:37:9: '@prefix'
            {
            match("@prefix"); 


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
            // InternalTurtle.g:38:7: ( '.' )
            // InternalTurtle.g:38:9: '.'
            {
            match('.'); 

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
            // InternalTurtle.g:39:7: ( ';' )
            // InternalTurtle.g:39:9: ';'
            {
            match(';'); 

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
            // InternalTurtle.g:40:7: ( '^^' )
            // InternalTurtle.g:40:9: '^^'
            {
            match("^^"); 


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
            // InternalTurtle.g:41:7: ( 'sh:NodeShape' )
            // InternalTurtle.g:41:9: 'sh:NodeShape'
            {
            match("sh:NodeShape"); 


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
            // InternalTurtle.g:42:7: ( '(' )
            // InternalTurtle.g:42:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:43:7: ( ')' )
            // InternalTurtle.g:43:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:44:7: ( '[' )
            // InternalTurtle.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:45:7: ( ']' )
            // InternalTurtle.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:2402:17: ( ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTurtle.g:2402:19: ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalTurtle.g:2402:19: ( '#' | '//' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                alt1=1;
            }
            else if ( (LA1_0=='/') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTurtle.g:2402:20: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:2402:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalTurtle.g:2402:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTurtle.g:2402:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // InternalTurtle.g:2402:46: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:2402:47: ( '\\r' )? '\\n'
                    {
                    // InternalTurtle.g:2402:47: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTurtle.g:2402:47: '\\r'
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

    // $ANTLR start "RULE_IRI"
    public final void mRULE_IRI() throws RecognitionException {
        try {
            int _type = RULE_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:2404:10: ( '<' (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )* '>' )
            // InternalTurtle.g:2404:12: '<' (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )* '>'
            {
            match('<'); 
            // InternalTurtle.g:2404:16: (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='!'||(LA5_0>='#' && LA5_0<=';')||LA5_0=='='||(LA5_0>='?' && LA5_0<='[')||LA5_0==']'||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:2404:16: ~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) )
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
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

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRI"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:2406:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )* )
            // InternalTurtle.g:2406:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )*
            {
            // InternalTurtle.g:2406:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )*
            loop7:
            do {
                int alt7=7;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt7=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt7=2;
                    }
                    break;
                case '_':
                    {
                    alt7=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt7=4;
                    }
                    break;
                case ':':
                    {
                    alt7=5;
                    }
                    break;
                case '-':
                    {
                    alt7=6;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalTurtle.g:2406:12: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalTurtle.g:2406:21: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalTurtle.g:2406:30: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalTurtle.g:2406:34: '0' .. '9' ( '.' '0' .. '9' )?
            	    {
            	    matchRange('0','9'); 
            	    // InternalTurtle.g:2406:43: ( '.' '0' .. '9' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0=='.') ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalTurtle.g:2406:44: '.' '0' .. '9'
            	            {
            	            match('.'); 
            	            matchRange('0','9'); 

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTurtle.g:2406:59: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalTurtle.g:2406:63: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalTurtle.g:2408:10: ( ( '0' .. '9' )+ )
            // InternalTurtle.g:2408:12: ( '0' .. '9' )+
            {
            // InternalTurtle.g:2408:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTurtle.g:2408:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalTurtle.g:2410:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTurtle.g:2410:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTurtle.g:2410:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTurtle.g:2410:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTurtle.g:2410:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTurtle.g:2410:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:2410:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:2410:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTurtle.g:2410:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTurtle.g:2410:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:2410:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalTurtle.g:2412:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTurtle.g:2412:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTurtle.g:2412:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtle.g:2412:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:2414:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTurtle.g:2414:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTurtle.g:2414:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTurtle.g:2416:16: ( . )
            // InternalTurtle.g:2416:18: .
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
        // InternalTurtle.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_SL_COMMENT | RULE_IRI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTurtle.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalTurtle.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalTurtle.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalTurtle.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalTurtle.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalTurtle.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalTurtle.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalTurtle.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalTurtle.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalTurtle.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalTurtle.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalTurtle.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalTurtle.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalTurtle.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalTurtle.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalTurtle.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalTurtle.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalTurtle.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalTurtle.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalTurtle.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalTurtle.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalTurtle.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalTurtle.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalTurtle.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalTurtle.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalTurtle.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalTurtle.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalTurtle.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalTurtle.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalTurtle.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalTurtle.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalTurtle.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalTurtle.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalTurtle.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalTurtle.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalTurtle.g:1:220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalTurtle.g:1:236: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 38 :
                // InternalTurtle.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalTurtle.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalTurtle.g:1:262: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalTurtle.g:1:274: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalTurtle.g:1:290: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalTurtle.g:1:298: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\23\1\27\2\uffff\1\27\5\uffff\2\27\3\uffff\1\23\3\uffff\2\27\2\uffff\1\23\13\uffff\1\23\2\uffff\20\23\1\107\16\23\1\136\1\uffff\1\137\25\23\2\uffff\1\167\1\170\5\23\1\176\17\23\2\uffff\1\u008e\4\23\1\uffff\17\23\1\uffff\1\u00a2\20\23\1\u00b4\1\23\1\uffff\2\23\1\u00b8\6\23\1\u00bf\3\23\1\u00c3\3\23\1\uffff\1\u00c7\1\u00c8\1\u00c9\1\uffff\1\u00ca\5\23\1\uffff\2\23\1\u00d2\1\uffff\2\23\1\u00d5\4\uffff\4\23\1\u00da\2\23\1\uffff\2\23\1\uffff\3\23\1\u00e2\1\uffff\5\23\1\u00e8\1\u00e9\1\uffff\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\23\6\uffff\4\23\1\u00f3\1\uffff";
    static final String DFA14_eofS =
        "\u00f4\uffff";
    static final String DFA14_minS =
        "\1\0\1\150\1\160\2\uffff\1\136\5\uffff\1\52\1\41\3\uffff\1\60\3\uffff\2\0\2\uffff\1\72\13\uffff\1\60\2\uffff\1\116\1\141\1\156\1\162\1\141\1\154\3\141\1\147\1\141\1\157\1\156\1\170\1\163\1\144\1\55\1\144\1\155\1\141\1\163\2\164\1\157\1\156\1\166\1\162\1\144\2\103\1\163\1\55\1\uffff\1\55\2\145\2\163\1\126\1\141\1\150\1\160\1\157\1\145\1\147\1\145\1\157\1\170\1\156\1\145\1\157\1\170\1\156\1\145\1\141\2\uffff\2\55\1\163\1\145\1\141\1\164\1\145\1\55\1\145\2\162\1\145\1\123\1\165\2\143\1\156\1\165\2\143\1\156\1\147\1\151\2\uffff\1\55\1\144\1\154\1\171\1\162\1\uffff\1\162\1\145\1\163\1\164\1\150\1\156\2\154\1\147\1\156\2\154\1\147\1\145\1\156\1\uffff\1\55\1\165\1\160\1\156\1\164\1\144\1\145\1\103\1\141\1\164\2\165\2\164\2\165\1\164\1\55\1\144\1\uffff\2\145\1\55\1\171\2\120\1\154\1\157\1\160\1\55\2\163\1\150\1\55\2\163\1\150\1\uffff\3\55\1\uffff\1\55\1\162\2\141\1\144\1\145\1\uffff\2\151\1\55\1\uffff\2\151\1\55\4\uffff\1\157\1\164\1\163\1\145\1\55\2\166\1\uffff\2\166\1\uffff\1\160\1\150\1\163\1\55\1\uffff\5\145\2\55\1\uffff\4\55\1\162\6\uffff\1\164\1\151\1\145\1\163\1\55\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\150\1\160\2\uffff\1\136\5\uffff\1\57\1\uffff\3\uffff\1\71\3\uffff\2\uffff\2\uffff\1\72\13\uffff\1\71\2\uffff\1\164\1\151\1\156\1\162\1\157\1\154\2\141\1\162\1\156\1\141\1\157\1\156\1\170\1\163\1\144\1\172\1\164\1\155\1\157\1\163\2\164\1\157\1\156\1\166\1\162\1\144\2\114\1\163\1\172\1\uffff\1\172\2\145\2\163\1\126\1\141\1\164\1\160\1\157\1\145\1\147\1\145\1\157\1\170\1\156\1\145\1\157\1\170\1\156\1\145\1\141\2\uffff\2\172\1\163\1\145\1\141\1\164\1\145\1\172\1\145\2\162\1\145\1\123\1\165\2\143\1\156\1\165\2\143\1\156\1\147\1\151\2\uffff\1\172\1\144\1\154\1\171\1\162\1\uffff\1\162\1\145\1\163\1\164\1\150\1\156\2\154\1\147\1\156\2\154\1\147\1\145\1\156\1\uffff\1\172\1\165\1\160\1\156\1\164\1\144\1\145\1\116\1\141\1\164\2\165\2\164\2\165\1\164\1\172\1\144\1\uffff\2\145\1\172\1\171\2\120\1\154\1\157\1\160\1\172\2\163\1\150\1\172\2\163\1\150\1\uffff\3\172\1\uffff\1\172\1\162\2\141\1\144\1\145\1\uffff\2\151\1\172\1\uffff\2\151\1\172\4\uffff\1\157\1\164\1\163\1\145\1\172\2\166\1\uffff\2\166\1\uffff\1\160\1\150\1\163\1\172\1\uffff\5\145\2\172\1\uffff\4\172\1\162\6\uffff\1\164\1\151\1\145\1\163\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\34\1\35\1\uffff\1\40\1\41\1\42\1\43\1\44\2\uffff\3\46\1\uffff\3\46\2\uffff\1\52\1\53\1\uffff\1\33\1\34\1\35\1\36\1\40\1\41\1\42\1\43\1\44\1\51\1\45\1\uffff\1\50\1\52\40\uffff\1\4\26\uffff\1\3\1\5\27\uffff\1\11\1\21\5\uffff\1\16\17\uffff\1\6\23\uffff\1\14\21\uffff\1\24\3\uffff\1\13\6\uffff\1\1\3\uffff\1\2\3\uffff\1\10\1\7\1\12\1\20\7\uffff\1\32\2\uffff\1\31\4\uffff\1\37\7\uffff\1\23\5\uffff\1\17\1\22\1\25\1\26\1\27\1\30\5\uffff\1\15";
    static final String DFA14_specialS =
        "\1\2\23\uffff\1\0\1\1\u00de\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\24\1\12\3\27\1\25\1\6\1\7\3\27\1\22\1\3\1\13\12\20\1\21\1\4\1\14\3\27\1\2\32\16\1\10\1\27\1\11\1\5\1\17\1\27\22\15\1\1\7\15\uff85\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "\1\42\4\uffff\1\41",
            "\1\43\1\uffff\31\43\1\uffff\37\43\1\uffff\1\43\1\uffff\1\43\1\uffff\32\43\3\uffff\uff82\43",
            "",
            "",
            "",
            "\12\44",
            "",
            "",
            "",
            "\0\45",
            "\0\45",
            "",
            "",
            "\1\47",
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
            "\12\44",
            "",
            "",
            "\1\62\22\uffff\1\51\1\uffff\1\54\1\56\3\uffff\1\55\1\60\3\uffff\1\50\1\53\1\52\1\57\3\uffff\1\61",
            "\1\64\3\uffff\1\65\3\uffff\1\63",
            "\1\66",
            "\1\67",
            "\1\71\15\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\20\uffff\1\76",
            "\1\77\6\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\111\17\uffff\1\110",
            "\1\112",
            "\1\113\15\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\1\uffff\1\126\3\uffff\1\127\2\uffff\1\130",
            "\1\131\1\uffff\1\132\3\uffff\1\133\2\uffff\1\134",
            "\1\135",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147\13\uffff\1\146",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\23\2\uffff\13\23\6\uffff\12\23\1\166\17\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\12\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\u00ee",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\23\2\uffff\13\23\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_SL_COMMENT | RULE_IRI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 37;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_21 = input.LA(1);

                        s = -1;
                        if ( ((LA14_21>='\u0000' && LA14_21<='\uFFFF')) ) {s = 37;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='@') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0==';') ) {s = 4;}

                        else if ( (LA14_0=='^') ) {s = 5;}

                        else if ( (LA14_0=='(') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='[') ) {s = 8;}

                        else if ( (LA14_0==']') ) {s = 9;}

                        else if ( (LA14_0=='#') ) {s = 10;}

                        else if ( (LA14_0=='/') ) {s = 11;}

                        else if ( (LA14_0=='<') ) {s = 12;}

                        else if ( ((LA14_0>='a' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {s = 13;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 14;}

                        else if ( (LA14_0=='_') ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0==':') ) {s = 17;}

                        else if ( (LA14_0=='-') ) {s = 18;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='\'') ) {s = 21;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 22;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||(LA14_0>='=' && LA14_0<='?')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 23;}

                        else s = 19;

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