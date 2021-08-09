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
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=6;
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
    public static final int RULE_IRI=4;
    public static final int RULE_STRING=5;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
            // InternalTurtle.g:11:7: ( 'sh:targetClass' )
            // InternalTurtle.g:11:9: 'sh:targetClass'
            {
            match("sh:targetClass"); 


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
            // InternalTurtle.g:12:7: ( 'sh:targetNode' )
            // InternalTurtle.g:12:9: 'sh:targetNode'
            {
            match("sh:targetNode"); 


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
            // InternalTurtle.g:13:7: ( 'sh:minCount' )
            // InternalTurtle.g:13:9: 'sh:minCount'
            {
            match("sh:minCount"); 


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
            // InternalTurtle.g:14:7: ( 'sh:maxCount' )
            // InternalTurtle.g:14:9: 'sh:maxCount'
            {
            match("sh:maxCount"); 


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
            // InternalTurtle.g:15:7: ( 'sh:and' )
            // InternalTurtle.g:15:9: 'sh:and'
            {
            match("sh:and"); 


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
            // InternalTurtle.g:16:7: ( 'sh:or' )
            // InternalTurtle.g:16:9: 'sh:or'
            {
            match("sh:or"); 


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
            // InternalTurtle.g:17:7: ( 'sh:not' )
            // InternalTurtle.g:17:9: 'sh:not'
            {
            match("sh:not"); 


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
            // InternalTurtle.g:18:7: ( 'sh:class' )
            // InternalTurtle.g:18:9: 'sh:class'
            {
            match("sh:class"); 


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
            // InternalTurtle.g:19:7: ( 'sh:hasValue' )
            // InternalTurtle.g:19:9: 'sh:hasValue'
            {
            match("sh:hasValue"); 


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
            // InternalTurtle.g:20:7: ( 'sh:nodeKind' )
            // InternalTurtle.g:20:9: 'sh:nodeKind'
            {
            match("sh:nodeKind"); 


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
            // InternalTurtle.g:21:7: ( 'sh:node' )
            // InternalTurtle.g:21:9: 'sh:node'
            {
            match("sh:node"); 


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
            // InternalTurtle.g:22:7: ( 'sh:datatype' )
            // InternalTurtle.g:22:9: 'sh:datatype'
            {
            match("sh:datatype"); 


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
            // InternalTurtle.g:23:7: ( 'sh:pattern' )
            // InternalTurtle.g:23:9: 'sh:pattern'
            {
            match("sh:pattern"); 


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
            // InternalTurtle.g:24:7: ( 'sh:closed' )
            // InternalTurtle.g:24:9: 'sh:closed'
            {
            match("sh:closed"); 


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
            // InternalTurtle.g:25:7: ( 'sh:ignoredProperties' )
            // InternalTurtle.g:25:9: 'sh:ignoredProperties'
            {
            match("sh:ignoredProperties"); 


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
            // InternalTurtle.g:26:7: ( 'sh:path' )
            // InternalTurtle.g:26:9: 'sh:path'
            {
            match("sh:path"); 


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
            // InternalTurtle.g:27:7: ( 'sh:inversePath' )
            // InternalTurtle.g:27:9: 'sh:inversePath'
            {
            match("sh:inversePath"); 


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
            // InternalTurtle.g:28:7: ( 'sh:property' )
            // InternalTurtle.g:28:9: 'sh:property'
            {
            match("sh:property"); 


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
            // InternalTurtle.g:29:7: ( 'sh:name' )
            // InternalTurtle.g:29:9: 'sh:name'
            {
            match("sh:name"); 


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
            // InternalTurtle.g:31:7: ( 'sh:equals' )
            // InternalTurtle.g:31:9: 'sh:equals'
            {
            match("sh:equals"); 


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
            // InternalTurtle.g:32:7: ( 'sh:minExclusive' )
            // InternalTurtle.g:32:9: 'sh:minExclusive'
            {
            match("sh:minExclusive"); 


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
            // InternalTurtle.g:33:7: ( 'sh:minInclusive' )
            // InternalTurtle.g:33:9: 'sh:minInclusive'
            {
            match("sh:minInclusive"); 


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
            // InternalTurtle.g:34:7: ( 'sh:maxExclusive' )
            // InternalTurtle.g:34:9: 'sh:maxExclusive'
            {
            match("sh:maxExclusive"); 


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
            // InternalTurtle.g:35:7: ( 'sh:maxInclusive' )
            // InternalTurtle.g:35:9: 'sh:maxInclusive'
            {
            match("sh:maxInclusive"); 


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
            // InternalTurtle.g:36:7: ( 'sh:maxLength' )
            // InternalTurtle.g:36:9: 'sh:maxLength'
            {
            match("sh:maxLength"); 


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
            // InternalTurtle.g:37:7: ( 'sh:minLength' )
            // InternalTurtle.g:37:9: 'sh:minLength'
            {
            match("sh:minLength"); 


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
            // InternalTurtle.g:38:7: ( 'sh:qualifiedValueShape' )
            // InternalTurtle.g:38:9: 'sh:qualifiedValueShape'
            {
            match("sh:qualifiedValueShape"); 


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
            // InternalTurtle.g:39:7: ( 'sh:qualifiedMaxCount' )
            // InternalTurtle.g:39:9: 'sh:qualifiedMaxCount'
            {
            match("sh:qualifiedMaxCount"); 


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
            // InternalTurtle.g:40:7: ( 'sh:qualifiedMinCount' )
            // InternalTurtle.g:40:9: 'sh:qualifiedMinCount'
            {
            match("sh:qualifiedMinCount"); 


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
            // InternalTurtle.g:41:7: ( 'a' )
            // InternalTurtle.g:41:9: 'a'
            {
            match('a'); 

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
            // InternalTurtle.g:42:7: ( 'rdfs:label' )
            // InternalTurtle.g:42:9: 'rdfs:label'
            {
            match("rdfs:label"); 


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
            // InternalTurtle.g:43:7: ( 'sh:description' )
            // InternalTurtle.g:43:9: 'sh:description'
            {
            match("sh:description"); 


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
            // InternalTurtle.g:44:7: ( '@prefix' )
            // InternalTurtle.g:44:9: '@prefix'
            {
            match("@prefix"); 


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
            // InternalTurtle.g:45:7: ( '.' )
            // InternalTurtle.g:45:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:46:7: ( ';' )
            // InternalTurtle.g:46:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:47:7: ( '^^' )
            // InternalTurtle.g:47:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:48:7: ( ',' )
            // InternalTurtle.g:48:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:49:7: ( '(' )
            // InternalTurtle.g:49:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:50:7: ( ')' )
            // InternalTurtle.g:50:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:51:7: ( '[' )
            // InternalTurtle.g:51:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:52:7: ( ']' )
            // InternalTurtle.g:52:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTurtle.g:2925:17: ( ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTurtle.g:2925:19: ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalTurtle.g:2925:19: ( '#' | '//' )
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
                    // InternalTurtle.g:2925:20: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:2925:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalTurtle.g:2925:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTurtle.g:2925:30: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTurtle.g:2925:46: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:2925:47: ( '\\r' )? '\\n'
                    {
                    // InternalTurtle.g:2925:47: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTurtle.g:2925:47: '\\r'
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
            // InternalTurtle.g:2927:10: ( '<' (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )* '>' )
            // InternalTurtle.g:2927:12: '<' (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )* '>'
            {
            match('<'); 
            // InternalTurtle.g:2927:16: (~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='!'||(LA5_0>='#' && LA5_0<=';')||LA5_0=='='||(LA5_0>='?' && LA5_0<='[')||LA5_0==']'||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:2927:16: ~ ( ( '<' | '>' | '\"' | '{' | '}' | '|' | '^' | '`' | '\\\\' | '\\u0000' .. ' ' ) )
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
            // InternalTurtle.g:2929:9: ( ( '@' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )* )
            // InternalTurtle.g:2929:11: ( '@' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )*
            {
            // InternalTurtle.g:2929:11: ( '@' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='@') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTurtle.g:2929:11: '@'
                    {
                    match('@'); 

                    }
                    break;

            }

            // InternalTurtle.g:2929:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ( '.' '0' .. '9' )? | ':' | '-' )*
            loop8:
            do {
                int alt8=7;
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
                    alt8=1;
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
                    alt8=2;
                    }
                    break;
                case '_':
                    {
                    alt8=3;
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
                    alt8=4;
                    }
                    break;
                case ':':
                    {
                    alt8=5;
                    }
                    break;
                case '-':
                    {
                    alt8=6;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalTurtle.g:2929:17: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalTurtle.g:2929:26: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalTurtle.g:2929:35: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalTurtle.g:2929:39: '0' .. '9' ( '.' '0' .. '9' )?
            	    {
            	    matchRange('0','9'); 
            	    // InternalTurtle.g:2929:48: ( '.' '0' .. '9' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='.') ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalTurtle.g:2929:49: '.' '0' .. '9'
            	            {
            	            match('.'); 
            	            matchRange('0','9'); 

            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTurtle.g:2929:64: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalTurtle.g:2929:68: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalTurtle.g:2931:10: ( ( '0' .. '9' )+ )
            // InternalTurtle.g:2931:12: ( '0' .. '9' )+
            {
            // InternalTurtle.g:2931:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTurtle.g:2931:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalTurtle.g:2933:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTurtle.g:2933:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTurtle.g:2933:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTurtle.g:2933:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTurtle.g:2933:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTurtle.g:2933:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:2933:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:2933:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTurtle.g:2933:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTurtle.g:2933:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:2933:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalTurtle.g:2935:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTurtle.g:2935:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTurtle.g:2935:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTurtle.g:2935:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalTurtle.g:2937:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTurtle.g:2937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTurtle.g:2937:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalTurtle.g:2939:16: ( . )
            // InternalTurtle.g:2939:18: .
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
        // InternalTurtle.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_SL_COMMENT | RULE_IRI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=50;
        alt15 = dfa15.predict(input);
        switch (alt15) {
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
                // InternalTurtle.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalTurtle.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalTurtle.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalTurtle.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalTurtle.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalTurtle.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalTurtle.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalTurtle.g:1:262: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalTurtle.g:1:278: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 45 :
                // InternalTurtle.g:1:287: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalTurtle.g:1:295: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // InternalTurtle.g:1:304: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // InternalTurtle.g:1:316: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalTurtle.g:1:332: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalTurtle.g:1:340: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\26\1\34\2\26\2\uffff\1\32\6\uffff\2\32\3\uffff\1\26\3\uffff\2\32\2\uffff\1\26\1\uffff\2\26\13\uffff\1\26\2\uffff\26\26\1\127\22\26\1\162\1\uffff\1\163\31\26\2\uffff\1\u008f\1\u0090\6\26\1\u0097\6\26\1\u009e\13\26\2\uffff\1\u00aa\5\26\1\uffff\6\26\1\uffff\13\26\1\uffff\1\u00c2\7\26\1\u00ca\14\26\1\u00d7\1\26\1\uffff\3\26\1\u00dc\3\26\1\uffff\1\26\1\u00e1\2\26\1\u00e4\3\26\1\u00e8\3\26\1\uffff\1\u00ec\1\u00ed\1\u00ee\1\26\1\uffff\1\u00f0\3\26\1\uffff\2\26\1\uffff\2\26\1\u00f8\1\uffff\2\26\1\u00fb\3\uffff\1\26\1\uffff\4\26\1\u0102\2\26\1\uffff\2\26\1\uffff\5\26\1\u010d\1\uffff\4\26\1\u0112\1\26\1\u0114\3\26\1\uffff\1\u0118\1\u0119\1\u011a\1\u011b\1\uffff\1\26\1\uffff\3\26\4\uffff\20\26\1\u0130\1\26\1\u0132\1\u0133\1\uffff\1\26\2\uffff\1\u0135\1\uffff";
    static final String DFA15_eofS =
        "\u0136\uffff";
    static final String DFA15_minS =
        "\1\0\1\150\1\55\1\144\1\160\2\uffff\1\136\6\uffff\1\52\1\41\3\uffff\1\60\3\uffff\2\0\2\uffff\1\72\1\uffff\1\146\1\162\13\uffff\1\60\2\uffff\1\141\1\163\1\145\2\141\1\156\1\162\1\141\1\154\3\141\1\147\1\161\1\165\1\72\1\146\1\162\1\156\1\170\1\163\1\144\1\55\1\144\1\155\1\141\1\163\1\164\1\163\1\164\1\157\1\156\1\166\1\165\1\141\1\154\1\151\1\147\2\103\1\163\1\55\1\uffff\1\55\2\145\2\163\1\126\1\141\1\143\1\150\1\160\1\157\1\145\1\141\1\154\1\141\1\170\1\145\1\157\1\170\1\156\1\145\1\157\1\170\1\156\1\145\1\141\2\uffff\2\55\1\163\1\145\1\141\1\164\1\162\1\145\1\55\1\145\2\162\1\154\1\151\1\142\1\55\1\164\1\165\2\143\1\156\1\165\2\143\1\156\1\147\1\151\2\uffff\1\55\1\144\1\154\1\171\1\151\1\162\1\uffff\1\162\1\145\2\163\1\146\1\145\1\uffff\1\103\1\156\2\154\1\147\1\156\2\154\1\147\1\145\1\156\1\uffff\1\55\1\165\2\160\1\156\1\164\1\144\1\145\1\55\1\151\2\154\1\157\1\164\2\165\2\164\2\165\1\164\1\55\1\144\1\uffff\2\145\1\164\1\55\1\171\2\120\1\uffff\1\145\1\55\1\141\1\144\1\55\2\163\1\150\1\55\2\163\1\150\1\uffff\3\55\1\151\1\uffff\1\55\1\162\1\141\1\144\1\uffff\1\163\1\145\1\uffff\2\151\1\55\1\uffff\2\151\1\55\3\uffff\1\157\1\uffff\1\157\1\164\1\115\1\163\1\55\2\166\1\uffff\2\166\1\uffff\1\156\1\160\1\150\2\141\1\55\1\uffff\4\145\1\55\1\145\1\55\1\154\1\170\1\156\1\uffff\4\55\1\uffff\1\162\1\uffff\1\165\2\103\4\uffff\1\164\1\145\2\157\1\151\1\123\2\165\1\145\1\150\2\156\1\163\1\141\2\164\1\55\1\160\2\55\1\uffff\1\145\2\uffff\1\55\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\150\1\172\1\144\1\160\2\uffff\1\136\6\uffff\1\57\1\uffff\3\uffff\1\71\3\uffff\2\uffff\2\uffff\1\72\1\uffff\1\146\1\162\13\uffff\1\71\2\uffff\1\164\1\163\1\145\1\141\1\151\1\156\1\162\1\157\1\154\1\141\1\145\1\162\1\156\1\161\1\165\1\72\1\146\1\162\1\156\1\170\1\163\1\144\1\172\1\164\1\155\1\157\1\163\1\164\1\163\1\164\1\157\1\156\1\166\1\165\1\141\1\154\1\151\1\147\2\114\1\163\1\172\1\uffff\1\172\2\145\2\163\1\126\1\141\1\143\1\164\1\160\1\157\1\145\1\141\1\154\1\141\1\170\1\145\1\157\1\170\1\156\1\145\1\157\1\170\1\156\1\145\1\141\2\uffff\2\172\1\163\1\145\1\141\1\164\1\162\1\145\1\172\1\145\2\162\1\154\1\151\1\142\1\172\1\164\1\165\2\143\1\156\1\165\2\143\1\156\1\147\1\151\2\uffff\1\172\1\144\1\154\1\171\1\151\1\162\1\uffff\1\162\1\145\2\163\1\146\1\145\1\uffff\1\116\1\156\2\154\1\147\1\156\2\154\1\147\1\145\1\156\1\uffff\1\172\1\165\2\160\1\156\1\164\1\144\1\145\1\172\1\151\2\154\1\157\1\164\2\165\2\164\2\165\1\164\1\172\1\144\1\uffff\2\145\1\164\1\172\1\171\2\120\1\uffff\1\145\1\172\1\141\1\144\1\172\2\163\1\150\1\172\2\163\1\150\1\uffff\3\172\1\151\1\uffff\1\172\1\162\1\141\1\144\1\uffff\1\163\1\145\1\uffff\2\151\1\172\1\uffff\2\151\1\172\3\uffff\1\157\1\uffff\1\157\1\164\1\126\1\163\1\172\2\166\1\uffff\2\166\1\uffff\1\156\1\160\1\150\1\141\1\151\1\172\1\uffff\4\145\1\172\1\145\1\172\1\154\1\170\1\156\1\uffff\4\172\1\uffff\1\162\1\uffff\1\165\2\103\4\uffff\1\164\1\145\2\157\1\151\1\123\2\165\1\145\1\150\2\156\1\163\1\141\2\164\1\172\1\160\2\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\5\uffff\1\43\1\44\1\uffff\1\46\1\47\1\50\1\51\1\52\1\53\2\uffff\3\55\1\uffff\3\55\2\uffff\1\61\1\62\1\uffff\1\37\2\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\60\1\54\1\uffff\1\57\1\61\52\uffff\1\6\32\uffff\1\5\1\7\33\uffff\1\13\1\23\6\uffff\1\20\6\uffff\1\42\13\uffff\1\10\27\uffff\1\16\7\uffff\1\25\14\uffff\1\24\4\uffff\1\15\4\uffff\1\40\2\uffff\1\3\3\uffff\1\4\3\uffff\1\12\1\11\1\14\1\uffff\1\22\7\uffff\1\33\2\uffff\1\32\6\uffff\1\2\12\uffff\1\1\4\uffff\1\41\1\uffff\1\21\3\uffff\1\26\1\27\1\30\1\31\24\uffff\1\17\1\uffff\1\35\1\36\1\uffff\1\34";
    static final String DFA15_specialS =
        "\1\1\26\uffff\1\2\1\0\u011d\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\27\1\15\3\32\1\30\1\11\1\12\2\32\1\10\1\25\1\5\1\16\12\23\1\24\1\6\1\17\3\32\1\4\32\21\1\13\1\32\1\14\1\7\1\22\1\32\1\2\20\20\1\3\1\1\7\20\uff85\32",
            "\1\33",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\35",
            "\1\36",
            "",
            "",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\4\uffff\1\47",
            "\1\51\1\uffff\31\51\1\uffff\37\51\1\uffff\1\51\1\uffff\1\51\1\uffff\32\51\3\uffff\uff82\51",
            "",
            "",
            "",
            "\12\52",
            "",
            "",
            "",
            "\0\53",
            "\0\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
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
            "\12\52",
            "",
            "",
            "\1\62\1\uffff\1\65\1\67\1\72\2\uffff\1\66\1\71\3\uffff\1\61\1\64\1\63\1\70\1\73\2\uffff\1\60",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\3\uffff\1\101\3\uffff\1\77",
            "\1\102",
            "\1\103",
            "\1\105\15\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110\3\uffff\1\111",
            "\1\112\20\uffff\1\113",
            "\1\114\6\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\131\17\uffff\1\130",
            "\1\132",
            "\1\133\15\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\1\uffff\1\152\3\uffff\1\153\2\uffff\1\154",
            "\1\155\1\uffff\1\156\3\uffff\1\157\2\uffff\1\160",
            "\1\161",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\174\13\uffff\1\173",
            "\1\175",
            "\1\176",
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
            "\1\26\2\uffff\13\26\6\uffff\12\26\1\u008e\17\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6\12\uffff\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e2",
            "\1\u00e3",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00ef",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\10\uffff\1\u00ff",
            "\1\u0101",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b\7\uffff\1\u010c",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0113",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "",
            "",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0131",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0134",
            "",
            "",
            "\1\26\2\uffff\13\26\6\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_SL_COMMENT | RULE_IRI | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_24 = input.LA(1);

                        s = -1;
                        if ( ((LA15_24>='\u0000' && LA15_24<='\uFFFF')) ) {s = 43;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='s') ) {s = 1;}

                        else if ( (LA15_0=='a') ) {s = 2;}

                        else if ( (LA15_0=='r') ) {s = 3;}

                        else if ( (LA15_0=='@') ) {s = 4;}

                        else if ( (LA15_0=='.') ) {s = 5;}

                        else if ( (LA15_0==';') ) {s = 6;}

                        else if ( (LA15_0=='^') ) {s = 7;}

                        else if ( (LA15_0==',') ) {s = 8;}

                        else if ( (LA15_0=='(') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='[') ) {s = 11;}

                        else if ( (LA15_0==']') ) {s = 12;}

                        else if ( (LA15_0=='#') ) {s = 13;}

                        else if ( (LA15_0=='/') ) {s = 14;}

                        else if ( (LA15_0=='<') ) {s = 15;}

                        else if ( ((LA15_0>='b' && LA15_0<='q')||(LA15_0>='t' && LA15_0<='z')) ) {s = 16;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 17;}

                        else if ( (LA15_0=='_') ) {s = 18;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 19;}

                        else if ( (LA15_0==':') ) {s = 20;}

                        else if ( (LA15_0=='-') ) {s = 21;}

                        else if ( (LA15_0=='\"') ) {s = 23;}

                        else if ( (LA15_0=='\'') ) {s = 24;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 25;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='=' && LA15_0<='?')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 26;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_23 = input.LA(1);

                        s = -1;
                        if ( ((LA15_23>='\u0000' && LA15_23<='\uFFFF')) ) {s = 43;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}