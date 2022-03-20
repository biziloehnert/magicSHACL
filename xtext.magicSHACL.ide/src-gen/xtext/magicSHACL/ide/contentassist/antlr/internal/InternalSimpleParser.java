package xtext.magicSHACL.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.magicSHACL.services.SimpleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'", "'('", "')'", "'?'", "':-'", "';'"
    };
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


        public InternalSimpleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimple.g"; }


    	private SimpleGrammarAccess grammarAccess;

    	public void setGrammarAccess(SimpleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGraph"
    // InternalSimple.g:53:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalSimple.g:54:1: ( ruleGraph EOF )
            // InternalSimple.g:55:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalSimple.g:62:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:66:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalSimple.g:67:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalSimple.g:67:2: ( ( rule__Graph__Group__0 ) )
            // InternalSimple.g:68:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalSimple.g:69:3: ( rule__Graph__Group__0 )
            // InternalSimple.g:69:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalSimple.g:78:1: entryRuleShapesGraph : ruleShapesGraph EOF ;
    public final void entryRuleShapesGraph() throws RecognitionException {
        try {
            // InternalSimple.g:79:1: ( ruleShapesGraph EOF )
            // InternalSimple.g:80:1: ruleShapesGraph EOF
            {
             before(grammarAccess.getShapesGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleShapesGraph();

            state._fsp--;

             after(grammarAccess.getShapesGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapesGraph"


    // $ANTLR start "ruleShapesGraph"
    // InternalSimple.g:87:1: ruleShapesGraph : ( ( rule__ShapesGraph__Group__0 ) ) ;
    public final void ruleShapesGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:91:2: ( ( ( rule__ShapesGraph__Group__0 ) ) )
            // InternalSimple.g:92:2: ( ( rule__ShapesGraph__Group__0 ) )
            {
            // InternalSimple.g:92:2: ( ( rule__ShapesGraph__Group__0 ) )
            // InternalSimple.g:93:3: ( rule__ShapesGraph__Group__0 )
            {
             before(grammarAccess.getShapesGraphAccess().getGroup()); 
            // InternalSimple.g:94:3: ( rule__ShapesGraph__Group__0 )
            // InternalSimple.g:94:4: rule__ShapesGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapesGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapesGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapesGraph"


    // $ANTLR start "entryRuleTarget"
    // InternalSimple.g:103:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalSimple.g:104:1: ( ruleTarget EOF )
            // InternalSimple.g:105:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalSimple.g:112:1: ruleTarget : ( ( rule__Target__Group__0 ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:116:2: ( ( ( rule__Target__Group__0 ) ) )
            // InternalSimple.g:117:2: ( ( rule__Target__Group__0 ) )
            {
            // InternalSimple.g:117:2: ( ( rule__Target__Group__0 ) )
            // InternalSimple.g:118:3: ( rule__Target__Group__0 )
            {
             before(grammarAccess.getTargetAccess().getGroup()); 
            // InternalSimple.g:119:3: ( rule__Target__Group__0 )
            // InternalSimple.g:119:4: rule__Target__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleShapeConstraint"
    // InternalSimple.g:128:1: entryRuleShapeConstraint : ruleShapeConstraint EOF ;
    public final void entryRuleShapeConstraint() throws RecognitionException {
        try {
            // InternalSimple.g:129:1: ( ruleShapeConstraint EOF )
            // InternalSimple.g:130:1: ruleShapeConstraint EOF
            {
             before(grammarAccess.getShapeConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeConstraint();

            state._fsp--;

             after(grammarAccess.getShapeConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeConstraint"


    // $ANTLR start "ruleShapeConstraint"
    // InternalSimple.g:137:1: ruleShapeConstraint : ( ( rule__ShapeConstraint__Group__0 ) ) ;
    public final void ruleShapeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:141:2: ( ( ( rule__ShapeConstraint__Group__0 ) ) )
            // InternalSimple.g:142:2: ( ( rule__ShapeConstraint__Group__0 ) )
            {
            // InternalSimple.g:142:2: ( ( rule__ShapeConstraint__Group__0 ) )
            // InternalSimple.g:143:3: ( rule__ShapeConstraint__Group__0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getGroup()); 
            // InternalSimple.g:144:3: ( rule__ShapeConstraint__Group__0 )
            // InternalSimple.g:144:4: rule__ShapeConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeConstraint"


    // $ANTLR start "entryRuleShapeName"
    // InternalSimple.g:153:1: entryRuleShapeName : ruleShapeName EOF ;
    public final void entryRuleShapeName() throws RecognitionException {
        try {
            // InternalSimple.g:154:1: ( ruleShapeName EOF )
            // InternalSimple.g:155:1: ruleShapeName EOF
            {
             before(grammarAccess.getShapeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeName();

            state._fsp--;

             after(grammarAccess.getShapeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeName"


    // $ANTLR start "ruleShapeName"
    // InternalSimple.g:162:1: ruleShapeName : ( ( rule__ShapeName__Group__0 ) ) ;
    public final void ruleShapeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:166:2: ( ( ( rule__ShapeName__Group__0 ) ) )
            // InternalSimple.g:167:2: ( ( rule__ShapeName__Group__0 ) )
            {
            // InternalSimple.g:167:2: ( ( rule__ShapeName__Group__0 ) )
            // InternalSimple.g:168:3: ( rule__ShapeName__Group__0 )
            {
             before(grammarAccess.getShapeNameAccess().getGroup()); 
            // InternalSimple.g:169:3: ( rule__ShapeName__Group__0 )
            // InternalSimple.g:169:4: rule__ShapeName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeName"


    // $ANTLR start "entryRuleShapeExpression"
    // InternalSimple.g:178:1: entryRuleShapeExpression : ruleShapeExpression EOF ;
    public final void entryRuleShapeExpression() throws RecognitionException {
        try {
            // InternalSimple.g:179:1: ( ruleShapeExpression EOF )
            // InternalSimple.g:180:1: ruleShapeExpression EOF
            {
             before(grammarAccess.getShapeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeExpression"


    // $ANTLR start "ruleShapeExpression"
    // InternalSimple.g:187:1: ruleShapeExpression : ( ( rule__ShapeExpression__Alternatives ) ) ;
    public final void ruleShapeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:191:2: ( ( ( rule__ShapeExpression__Alternatives ) ) )
            // InternalSimple.g:192:2: ( ( rule__ShapeExpression__Alternatives ) )
            {
            // InternalSimple.g:192:2: ( ( rule__ShapeExpression__Alternatives ) )
            // InternalSimple.g:193:3: ( rule__ShapeExpression__Alternatives )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives()); 
            // InternalSimple.g:194:3: ( rule__ShapeExpression__Alternatives )
            // InternalSimple.g:194:4: rule__ShapeExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeExpression"


    // $ANTLR start "entryRuleValue"
    // InternalSimple.g:203:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSimple.g:204:1: ( ruleValue EOF )
            // InternalSimple.g:205:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSimple.g:212:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:216:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSimple.g:217:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSimple.g:217:2: ( ( rule__Value__Group__0 ) )
            // InternalSimple.g:218:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSimple.g:219:3: ( rule__Value__Group__0 )
            // InternalSimple.g:219:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rulePropertyType"
    // InternalSimple.g:228:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:232:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalSimple.g:233:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalSimple.g:233:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalSimple.g:234:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalSimple.g:235:3: ( rule__PropertyType__Alternatives )
            // InternalSimple.g:235:4: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "rule__ShapeConstraint__Alternatives_2"
    // InternalSimple.g:243:1: rule__ShapeConstraint__Alternatives_2 : ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__Group_2_1__0 ) ) );
    public final void rule__ShapeConstraint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:247:1: ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimple.g:248:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    {
                    // InternalSimple.g:248:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    // InternalSimple.g:249:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getGroup_2_0()); 
                    // InternalSimple.g:250:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    // InternalSimple.g:250:4: rule__ShapeConstraint__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstraint__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeConstraintAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:254:2: ( ( rule__ShapeConstraint__Group_2_1__0 ) )
                    {
                    // InternalSimple.g:254:2: ( ( rule__ShapeConstraint__Group_2_1__0 ) )
                    // InternalSimple.g:255:3: ( rule__ShapeConstraint__Group_2_1__0 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getGroup_2_1()); 
                    // InternalSimple.g:256:3: ( rule__ShapeConstraint__Group_2_1__0 )
                    // InternalSimple.g:256:4: rule__ShapeConstraint__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstraint__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeConstraintAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Alternatives_2"


    // $ANTLR start "rule__ShapeExpression__Alternatives"
    // InternalSimple.g:264:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:268:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNICODE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimple.g:269:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalSimple.g:269:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalSimple.g:270:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalSimple.g:271:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalSimple.g:271:4: rule__ShapeExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:275:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    {
                    // InternalSimple.g:275:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    // InternalSimple.g:276:3: ( rule__ShapeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1()); 
                    // InternalSimple.g:277:3: ( rule__ShapeExpression__Group_1__0 )
                    // InternalSimple.g:277:4: rule__ShapeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalSimple.g:285:1: rule__PropertyType__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:289:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSimple.g:290:2: ( ( 'MIN' ) )
                    {
                    // InternalSimple.g:290:2: ( ( 'MIN' ) )
                    // InternalSimple.g:291:3: ( 'MIN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalSimple.g:292:3: ( 'MIN' )
                    // InternalSimple.g:292:4: 'MIN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:296:2: ( ( 'MAX' ) )
                    {
                    // InternalSimple.g:296:2: ( ( 'MAX' ) )
                    // InternalSimple.g:297:3: ( 'MAX' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalSimple.g:298:3: ( 'MAX' )
                    // InternalSimple.g:298:4: 'MAX'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:302:2: ( ( 'AND' ) )
                    {
                    // InternalSimple.g:302:2: ( ( 'AND' ) )
                    // InternalSimple.g:303:3: ( 'AND' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalSimple.g:304:3: ( 'AND' )
                    // InternalSimple.g:304:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:308:2: ( ( 'OR' ) )
                    {
                    // InternalSimple.g:308:2: ( ( 'OR' ) )
                    // InternalSimple.g:309:3: ( 'OR' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalSimple.g:310:3: ( 'OR' )
                    // InternalSimple.g:310:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:314:2: ( ( 'NOT' ) )
                    {
                    // InternalSimple.g:314:2: ( ( 'NOT' ) )
                    // InternalSimple.g:315:3: ( 'NOT' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalSimple.g:316:3: ( 'NOT' )
                    // InternalSimple.g:316:4: 'NOT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:320:2: ( ( 'SOME ' ) )
                    {
                    // InternalSimple.g:320:2: ( ( 'SOME ' ) )
                    // InternalSimple.g:321:3: ( 'SOME ' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 
                    // InternalSimple.g:322:3: ( 'SOME ' )
                    // InternalSimple.g:322:4: 'SOME '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:326:2: ( ( 'SOME ^' ) )
                    {
                    // InternalSimple.g:326:2: ( ( 'SOME ^' ) )
                    // InternalSimple.g:327:3: ( 'SOME ^' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 
                    // InternalSimple.g:328:3: ( 'SOME ^' )
                    // InternalSimple.g:328:4: 'SOME ^'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalSimple.g:336:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:340:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalSimple.g:341:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalSimple.g:348:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:352:1: ( ( () ) )
            // InternalSimple.g:353:1: ( () )
            {
            // InternalSimple.g:353:1: ( () )
            // InternalSimple.g:354:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalSimple.g:355:2: ()
            // InternalSimple.g:355:3: 
            {
            }

             after(grammarAccess.getGraphAccess().getGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalSimple.g:363:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:367:1: ( rule__Graph__Group__1__Impl )
            // InternalSimple.g:368:2: rule__Graph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalSimple.g:374:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ShapesGraphAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:378:1: ( ( ( rule__Graph__ShapesGraphAssignment_1 ) ) )
            // InternalSimple.g:379:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            {
            // InternalSimple.g:379:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            // InternalSimple.g:380:2: ( rule__Graph__ShapesGraphAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 
            // InternalSimple.g:381:2: ( rule__Graph__ShapesGraphAssignment_1 )
            // InternalSimple.g:381:3: rule__Graph__ShapesGraphAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__ShapesGraphAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__ShapesGraph__Group__0"
    // InternalSimple.g:390:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:394:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalSimple.g:395:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapesGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapesGraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapesGraph__Group__0"


    // $ANTLR start "rule__ShapesGraph__Group__0__Impl"
    // InternalSimple.g:402:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:406:1: ( ( () ) )
            // InternalSimple.g:407:1: ( () )
            {
            // InternalSimple.g:407:1: ( () )
            // InternalSimple.g:408:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalSimple.g:409:2: ()
            // InternalSimple.g:409:3: 
            {
            }

             after(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapesGraph__Group__0__Impl"


    // $ANTLR start "rule__ShapesGraph__Group__1"
    // InternalSimple.g:417:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:421:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalSimple.g:422:2: rule__ShapesGraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapesGraph__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapesGraph__Group__1"


    // $ANTLR start "rule__ShapesGraph__Group__1__Impl"
    // InternalSimple.g:428:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:432:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalSimple.g:433:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalSimple.g:433:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalSimple.g:434:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalSimple.g:435:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:435:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapesGraph__Group__1__Impl"


    // $ANTLR start "rule__Target__Group__0"
    // InternalSimple.g:444:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:448:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalSimple.g:449:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Target__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0"


    // $ANTLR start "rule__Target__Group__0__Impl"
    // InternalSimple.g:456:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:460:1: ( ( () ) )
            // InternalSimple.g:461:1: ( () )
            {
            // InternalSimple.g:461:1: ( () )
            // InternalSimple.g:462:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalSimple.g:463:2: ()
            // InternalSimple.g:463:3: 
            {
            }

             after(grammarAccess.getTargetAccess().getTargetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0__Impl"


    // $ANTLR start "rule__Target__Group__1"
    // InternalSimple.g:471:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:475:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalSimple.g:476:2: rule__Target__Group__1__Impl rule__Target__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Target__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1"


    // $ANTLR start "rule__Target__Group__1__Impl"
    // InternalSimple.g:483:1: rule__Target__Group__1__Impl : ( '(' ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:487:1: ( ( '(' ) )
            // InternalSimple.g:488:1: ( '(' )
            {
            // InternalSimple.g:488:1: ( '(' )
            // InternalSimple.g:489:2: '('
            {
             before(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1__Impl"


    // $ANTLR start "rule__Target__Group__2"
    // InternalSimple.g:498:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:502:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalSimple.g:503:2: rule__Target__Group__2__Impl rule__Target__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Target__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2"


    // $ANTLR start "rule__Target__Group__2__Impl"
    // InternalSimple.g:510:1: rule__Target__Group__2__Impl : ( ( rule__Target__TermAssignment_2 ) ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:514:1: ( ( ( rule__Target__TermAssignment_2 ) ) )
            // InternalSimple.g:515:1: ( ( rule__Target__TermAssignment_2 ) )
            {
            // InternalSimple.g:515:1: ( ( rule__Target__TermAssignment_2 ) )
            // InternalSimple.g:516:2: ( rule__Target__TermAssignment_2 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_2()); 
            // InternalSimple.g:517:2: ( rule__Target__TermAssignment_2 )
            // InternalSimple.g:517:3: rule__Target__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Target__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTermAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2__Impl"


    // $ANTLR start "rule__Target__Group__3"
    // InternalSimple.g:525:1: rule__Target__Group__3 : rule__Target__Group__3__Impl ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:529:1: ( rule__Target__Group__3__Impl )
            // InternalSimple.g:530:2: rule__Target__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__3"


    // $ANTLR start "rule__Target__Group__3__Impl"
    // InternalSimple.g:536:1: rule__Target__Group__3__Impl : ( ')' ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:540:1: ( ( ')' ) )
            // InternalSimple.g:541:1: ( ')' )
            {
            // InternalSimple.g:541:1: ( ')' )
            // InternalSimple.g:542:2: ')'
            {
             before(grammarAccess.getTargetAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__3__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__0"
    // InternalSimple.g:552:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:556:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalSimple.g:557:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__0"


    // $ANTLR start "rule__ShapeConstraint__Group__0__Impl"
    // InternalSimple.g:564:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:568:1: ( ( () ) )
            // InternalSimple.g:569:1: ( () )
            {
            // InternalSimple.g:569:1: ( () )
            // InternalSimple.g:570:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalSimple.g:571:2: ()
            // InternalSimple.g:571:3: 
            {
            }

             after(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__0__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__1"
    // InternalSimple.g:579:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:583:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalSimple.g:584:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ShapeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__1"


    // $ANTLR start "rule__ShapeConstraint__Group__1__Impl"
    // InternalSimple.g:591:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:595:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalSimple.g:596:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalSimple.g:596:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalSimple.g:597:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalSimple.g:598:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalSimple.g:598:3: rule__ShapeConstraint__ShapeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__ShapeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__1__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__2"
    // InternalSimple.g:606:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:610:1: ( rule__ShapeConstraint__Group__2__Impl )
            // InternalSimple.g:611:2: rule__ShapeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__2"


    // $ANTLR start "rule__ShapeConstraint__Group__2__Impl"
    // InternalSimple.g:617:1: rule__ShapeConstraint__Group__2__Impl : ( ( rule__ShapeConstraint__Alternatives_2 ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:621:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) )
            // InternalSimple.g:622:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            {
            // InternalSimple.g:622:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalSimple.g:623:2: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalSimple.g:624:2: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalSimple.g:624:3: rule__ShapeConstraint__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__2__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__0"
    // InternalSimple.g:633:1: rule__ShapeConstraint__Group_2_0__0 : rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 ;
    public final void rule__ShapeConstraint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:637:1: ( rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 )
            // InternalSimple.g:638:2: rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ShapeConstraint__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__0"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__0__Impl"
    // InternalSimple.g:645:1: rule__ShapeConstraint__Group_2_0__0__Impl : ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) ) ;
    public final void rule__ShapeConstraint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:649:1: ( ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) ) )
            // InternalSimple.g:650:1: ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) )
            {
            // InternalSimple.g:650:1: ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) )
            // InternalSimple.g:651:2: ( rule__ShapeConstraint__TargetsAssignment_2_0_0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0_0()); 
            // InternalSimple.g:652:2: ( rule__ShapeConstraint__TargetsAssignment_2_0_0 )
            // InternalSimple.g:652:3: rule__ShapeConstraint__TargetsAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__TargetsAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__0__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__1"
    // InternalSimple.g:660:1: rule__ShapeConstraint__Group_2_0__1 : rule__ShapeConstraint__Group_2_0__1__Impl ;
    public final void rule__ShapeConstraint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:664:1: ( rule__ShapeConstraint__Group_2_0__1__Impl )
            // InternalSimple.g:665:2: rule__ShapeConstraint__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__1"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__1__Impl"
    // InternalSimple.g:671:1: rule__ShapeConstraint__Group_2_0__1__Impl : ( '?' ) ;
    public final void rule__ShapeConstraint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:675:1: ( ( '?' ) )
            // InternalSimple.g:676:1: ( '?' )
            {
            // InternalSimple.g:676:1: ( '?' )
            // InternalSimple.g:677:2: '?'
            {
             before(grammarAccess.getShapeConstraintAccess().getQuestionMarkKeyword_2_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getQuestionMarkKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__1__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__0"
    // InternalSimple.g:687:1: rule__ShapeConstraint__Group_2_1__0 : rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1 ;
    public final void rule__ShapeConstraint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:691:1: ( rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1 )
            // InternalSimple.g:692:2: rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ShapeConstraint__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__0"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__0__Impl"
    // InternalSimple.g:699:1: rule__ShapeConstraint__Group_2_1__0__Impl : ( ':-' ) ;
    public final void rule__ShapeConstraint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:703:1: ( ( ':-' ) )
            // InternalSimple.g:704:1: ( ':-' )
            {
            // InternalSimple.g:704:1: ( ':-' )
            // InternalSimple.g:705:2: ':-'
            {
             before(grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__0__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__1"
    // InternalSimple.g:714:1: rule__ShapeConstraint__Group_2_1__1 : rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2 ;
    public final void rule__ShapeConstraint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:718:1: ( rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2 )
            // InternalSimple.g:719:2: rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
            rule__ShapeConstraint__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__1"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__1__Impl"
    // InternalSimple.g:726:1: rule__ShapeConstraint__Group_2_1__1__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) ) ;
    public final void rule__ShapeConstraint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:730:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) ) )
            // InternalSimple.g:731:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) )
            {
            // InternalSimple.g:731:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) )
            // InternalSimple.g:732:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1_1()); 
            // InternalSimple.g:733:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 )
            // InternalSimple.g:733:3: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__1__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__2"
    // InternalSimple.g:741:1: rule__ShapeConstraint__Group_2_1__2 : rule__ShapeConstraint__Group_2_1__2__Impl ;
    public final void rule__ShapeConstraint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:745:1: ( rule__ShapeConstraint__Group_2_1__2__Impl )
            // InternalSimple.g:746:2: rule__ShapeConstraint__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__2"


    // $ANTLR start "rule__ShapeConstraint__Group_2_1__2__Impl"
    // InternalSimple.g:752:1: rule__ShapeConstraint__Group_2_1__2__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:756:1: ( ( ';' ) )
            // InternalSimple.g:757:1: ( ';' )
            {
            // InternalSimple.g:757:1: ( ';' )
            // InternalSimple.g:758:2: ';'
            {
             before(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_1__2__Impl"


    // $ANTLR start "rule__ShapeName__Group__0"
    // InternalSimple.g:768:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:772:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalSimple.g:773:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeName__Group__0"


    // $ANTLR start "rule__ShapeName__Group__0__Impl"
    // InternalSimple.g:780:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:784:1: ( ( () ) )
            // InternalSimple.g:785:1: ( () )
            {
            // InternalSimple.g:785:1: ( () )
            // InternalSimple.g:786:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalSimple.g:787:2: ()
            // InternalSimple.g:787:3: 
            {
            }

             after(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeName__Group__0__Impl"


    // $ANTLR start "rule__ShapeName__Group__1"
    // InternalSimple.g:795:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:799:1: ( rule__ShapeName__Group__1__Impl )
            // InternalSimple.g:800:2: rule__ShapeName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeName__Group__1"


    // $ANTLR start "rule__ShapeName__Group__1__Impl"
    // InternalSimple.g:806:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:810:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalSimple.g:811:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalSimple.g:811:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalSimple.g:812:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalSimple.g:813:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalSimple.g:813:3: rule__ShapeName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeName__Group__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0__0"
    // InternalSimple.g:822:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:826:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalSimple.g:827:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ShapeExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0__0"


    // $ANTLR start "rule__ShapeExpression__Group_0__0__Impl"
    // InternalSimple.g:834:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:838:1: ( ( () ) )
            // InternalSimple.g:839:1: ( () )
            {
            // InternalSimple.g:839:1: ( () )
            // InternalSimple.g:840:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalSimple.g:841:2: ()
            // InternalSimple.g:841:3: 
            {
            }

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0__1"
    // InternalSimple.g:849:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:853:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalSimple.g:854:2: rule__ShapeExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0__1"


    // $ANTLR start "rule__ShapeExpression__Group_0__1__Impl"
    // InternalSimple.g:860:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__Group_0_1__0 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:864:1: ( ( ( rule__ShapeExpression__Group_0_1__0 ) ) )
            // InternalSimple.g:865:1: ( ( rule__ShapeExpression__Group_0_1__0 ) )
            {
            // InternalSimple.g:865:1: ( ( rule__ShapeExpression__Group_0_1__0 ) )
            // InternalSimple.g:866:2: ( rule__ShapeExpression__Group_0_1__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_0_1()); 
            // InternalSimple.g:867:2: ( rule__ShapeExpression__Group_0_1__0 )
            // InternalSimple.g:867:3: rule__ShapeExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__0"
    // InternalSimple.g:876:1: rule__ShapeExpression__Group_0_1__0 : rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1 ;
    public final void rule__ShapeExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:880:1: ( rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1 )
            // InternalSimple.g:881:2: rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ShapeExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__0__Impl"
    // InternalSimple.g:888:1: rule__ShapeExpression__Group_0_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_0_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:892:1: ( ( ( rule__ShapeExpression__TypeAssignment_0_1_0 ) ) )
            // InternalSimple.g:893:1: ( ( rule__ShapeExpression__TypeAssignment_0_1_0 ) )
            {
            // InternalSimple.g:893:1: ( ( rule__ShapeExpression__TypeAssignment_0_1_0 ) )
            // InternalSimple.g:894:2: ( rule__ShapeExpression__TypeAssignment_0_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_0_1_0()); 
            // InternalSimple.g:895:2: ( rule__ShapeExpression__TypeAssignment_0_1_0 )
            // InternalSimple.g:895:3: rule__ShapeExpression__TypeAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__1"
    // InternalSimple.g:903:1: rule__ShapeExpression__Group_0_1__1 : rule__ShapeExpression__Group_0_1__1__Impl ;
    public final void rule__ShapeExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:907:1: ( rule__ShapeExpression__Group_0_1__1__Impl )
            // InternalSimple.g:908:2: rule__ShapeExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__1__Impl"
    // InternalSimple.g:914:1: rule__ShapeExpression__Group_0_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_0_1_1 )* ) ;
    public final void rule__ShapeExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:918:1: ( ( ( rule__ShapeExpression__ValuesAssignment_0_1_1 )* ) )
            // InternalSimple.g:919:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1_1 )* )
            {
            // InternalSimple.g:919:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1_1 )* )
            // InternalSimple.g:920:2: ( rule__ShapeExpression__ValuesAssignment_0_1_1 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_0_1_1()); 
            // InternalSimple.g:921:2: ( rule__ShapeExpression__ValuesAssignment_0_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_UNICODE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimple.g:921:3: rule__ShapeExpression__ValuesAssignment_0_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ShapeExpression__ValuesAssignment_0_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__0"
    // InternalSimple.g:930:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:934:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalSimple.g:935:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ShapeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_1__0__Impl"
    // InternalSimple.g:942:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:946:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_0 ) ) )
            // InternalSimple.g:947:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0 ) )
            {
            // InternalSimple.g:947:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0 ) )
            // InternalSimple.g:948:2: ( rule__ShapeExpression__ValuesAssignment_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0()); 
            // InternalSimple.g:949:2: ( rule__ShapeExpression__ValuesAssignment_1_0 )
            // InternalSimple.g:949:3: rule__ShapeExpression__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__1"
    // InternalSimple.g:957:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:961:1: ( rule__ShapeExpression__Group_1__1__Impl )
            // InternalSimple.g:962:2: rule__ShapeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_1__1__Impl"
    // InternalSimple.g:968:1: rule__ShapeExpression__Group_1__1__Impl : ( ( rule__ShapeExpression__Group_1_1__0 )* ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:972:1: ( ( ( rule__ShapeExpression__Group_1_1__0 )* ) )
            // InternalSimple.g:973:1: ( ( rule__ShapeExpression__Group_1_1__0 )* )
            {
            // InternalSimple.g:973:1: ( ( rule__ShapeExpression__Group_1_1__0 )* )
            // InternalSimple.g:974:2: ( rule__ShapeExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 
            // InternalSimple.g:975:2: ( rule__ShapeExpression__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimple.g:975:3: rule__ShapeExpression__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ShapeExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__0"
    // InternalSimple.g:984:1: rule__ShapeExpression__Group_1_1__0 : rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 ;
    public final void rule__ShapeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:988:1: ( rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 )
            // InternalSimple.g:989:2: rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ShapeExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__0__Impl"
    // InternalSimple.g:996:1: rule__ShapeExpression__Group_1_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1000:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) )
            // InternalSimple.g:1001:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            {
            // InternalSimple.g:1001:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            // InternalSimple.g:1002:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0()); 
            // InternalSimple.g:1003:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            // InternalSimple.g:1003:3: rule__ShapeExpression__TypeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__1"
    // InternalSimple.g:1011:1: rule__ShapeExpression__Group_1_1__1 : rule__ShapeExpression__Group_1_1__1__Impl ;
    public final void rule__ShapeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1015:1: ( rule__ShapeExpression__Group_1_1__1__Impl )
            // InternalSimple.g:1016:2: rule__ShapeExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__1__Impl"
    // InternalSimple.g:1022:1: rule__ShapeExpression__Group_1_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_1_1 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1026:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_1_1 ) ) )
            // InternalSimple.g:1027:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1_1 ) )
            {
            // InternalSimple.g:1027:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1_1 ) )
            // InternalSimple.g:1028:2: ( rule__ShapeExpression__ValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1_1()); 
            // InternalSimple.g:1029:2: ( rule__ShapeExpression__ValuesAssignment_1_1_1 )
            // InternalSimple.g:1029:3: rule__ShapeExpression__ValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalSimple.g:1038:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1042:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSimple.g:1043:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalSimple.g:1050:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1054:1: ( ( () ) )
            // InternalSimple.g:1055:1: ( () )
            {
            // InternalSimple.g:1055:1: ( () )
            // InternalSimple.g:1056:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSimple.g:1057:2: ()
            // InternalSimple.g:1057:3: 
            {
            }

             after(grammarAccess.getValueAccess().getValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalSimple.g:1065:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1069:1: ( rule__Value__Group__1__Impl )
            // InternalSimple.g:1070:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalSimple.g:1076:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1080:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalSimple.g:1081:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalSimple.g:1081:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalSimple.g:1082:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalSimple.g:1083:2: ( rule__Value__NameAssignment_1 )
            // InternalSimple.g:1083:3: rule__Value__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Graph__ShapesGraphAssignment_1"
    // InternalSimple.g:1092:1: rule__Graph__ShapesGraphAssignment_1 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1096:1: ( ( ruleShapesGraph ) )
            // InternalSimple.g:1097:2: ( ruleShapesGraph )
            {
            // InternalSimple.g:1097:2: ( ruleShapesGraph )
            // InternalSimple.g:1098:3: ruleShapesGraph
            {
             before(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapesGraph();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__ShapesGraphAssignment_1"


    // $ANTLR start "rule__ShapesGraph__ShapeConstraintsAssignment_1"
    // InternalSimple.g:1107:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1111:1: ( ( ruleShapeConstraint ) )
            // InternalSimple.g:1112:2: ( ruleShapeConstraint )
            {
            // InternalSimple.g:1112:2: ( ruleShapeConstraint )
            // InternalSimple.g:1113:3: ruleShapeConstraint
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeConstraint();

            state._fsp--;

             after(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapesGraph__ShapeConstraintsAssignment_1"


    // $ANTLR start "rule__Target__TermAssignment_2"
    // InternalSimple.g:1122:1: rule__Target__TermAssignment_2 : ( RULE_UNICODE ) ;
    public final void rule__Target__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1126:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1127:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1127:2: ( RULE_UNICODE )
            // InternalSimple.g:1128:3: RULE_UNICODE
            {
             before(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_2_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__TermAssignment_2"


    // $ANTLR start "rule__ShapeConstraint__ShapeNameAssignment_1"
    // InternalSimple.g:1137:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1141:1: ( ( ruleShapeName ) )
            // InternalSimple.g:1142:2: ( ruleShapeName )
            {
            // InternalSimple.g:1142:2: ( ruleShapeName )
            // InternalSimple.g:1143:3: ruleShapeName
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeName();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__ShapeNameAssignment_1"


    // $ANTLR start "rule__ShapeConstraint__TargetsAssignment_2_0_0"
    // InternalSimple.g:1152:1: rule__ShapeConstraint__TargetsAssignment_2_0_0 : ( ruleTarget ) ;
    public final void rule__ShapeConstraint__TargetsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1156:1: ( ( ruleTarget ) )
            // InternalSimple.g:1157:2: ( ruleTarget )
            {
            // InternalSimple.g:1157:2: ( ruleTarget )
            // InternalSimple.g:1158:3: ruleTarget
            {
             before(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__TargetsAssignment_2_0_0"


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1"
    // InternalSimple.g:1167:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1171:1: ( ( ruleShapeExpression ) )
            // InternalSimple.g:1172:2: ( ruleShapeExpression )
            {
            // InternalSimple.g:1172:2: ( ruleShapeExpression )
            // InternalSimple.g:1173:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1"


    // $ANTLR start "rule__ShapeName__NameAssignment_1"
    // InternalSimple.g:1182:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1186:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1187:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1187:2: ( RULE_UNICODE )
            // InternalSimple.g:1188:3: RULE_UNICODE
            {
             before(grammarAccess.getShapeNameAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getShapeNameAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeName__NameAssignment_1"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_0_1_0"
    // InternalSimple.g:1197:1: rule__ShapeExpression__TypeAssignment_0_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1201:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1202:2: ( rulePropertyType )
            {
            // InternalSimple.g:1202:2: ( rulePropertyType )
            // InternalSimple.g:1203:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_0_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_0_1_1"
    // InternalSimple.g:1212:1: rule__ShapeExpression__ValuesAssignment_0_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1216:1: ( ( ruleValue ) )
            // InternalSimple.g:1217:2: ( ruleValue )
            {
            // InternalSimple.g:1217:2: ( ruleValue )
            // InternalSimple.g:1218:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_0_1_1"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_0"
    // InternalSimple.g:1227:1: rule__ShapeExpression__ValuesAssignment_1_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1231:1: ( ( ruleValue ) )
            // InternalSimple.g:1232:2: ( ruleValue )
            {
            // InternalSimple.g:1232:2: ( ruleValue )
            // InternalSimple.g:1233:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_0"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_1_0"
    // InternalSimple.g:1242:1: rule__ShapeExpression__TypeAssignment_1_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1246:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1247:2: ( rulePropertyType )
            {
            // InternalSimple.g:1247:2: ( rulePropertyType )
            // InternalSimple.g:1248:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_1_1"
    // InternalSimple.g:1257:1: rule__ShapeExpression__ValuesAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1261:1: ( ( ruleValue ) )
            // InternalSimple.g:1262:2: ( ruleValue )
            {
            // InternalSimple.g:1262:2: ( ruleValue )
            // InternalSimple.g:1263:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_1_1"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalSimple.g:1272:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1276:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1277:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1277:2: ( RULE_UNICODE )
            // InternalSimple.g:1278:3: RULE_UNICODE
            {
             before(grammarAccess.getValueAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000007F012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000007F002L});

}