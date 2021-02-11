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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'", "'('", "')'", "'?'", "':-'", "';'"
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


    // $ANTLR start "entryRulePropertyValues"
    // InternalSimple.g:203:1: entryRulePropertyValues : rulePropertyValues EOF ;
    public final void entryRulePropertyValues() throws RecognitionException {
        try {
            // InternalSimple.g:204:1: ( rulePropertyValues EOF )
            // InternalSimple.g:205:1: rulePropertyValues EOF
            {
             before(grammarAccess.getPropertyValuesRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValues();

            state._fsp--;

             after(grammarAccess.getPropertyValuesRule()); 
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
    // $ANTLR end "entryRulePropertyValues"


    // $ANTLR start "rulePropertyValues"
    // InternalSimple.g:212:1: rulePropertyValues : ( ( rule__PropertyValues__Alternatives ) ) ;
    public final void rulePropertyValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:216:2: ( ( ( rule__PropertyValues__Alternatives ) ) )
            // InternalSimple.g:217:2: ( ( rule__PropertyValues__Alternatives ) )
            {
            // InternalSimple.g:217:2: ( ( rule__PropertyValues__Alternatives ) )
            // InternalSimple.g:218:3: ( rule__PropertyValues__Alternatives )
            {
             before(grammarAccess.getPropertyValuesAccess().getAlternatives()); 
            // InternalSimple.g:219:3: ( rule__PropertyValues__Alternatives )
            // InternalSimple.g:219:4: rule__PropertyValues__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getAlternatives()); 

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
    // $ANTLR end "rulePropertyValues"


    // $ANTLR start "entryRuleProperty"
    // InternalSimple.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSimple.g:229:1: ( ruleProperty EOF )
            // InternalSimple.g:230:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSimple.g:237:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:241:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalSimple.g:242:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalSimple.g:242:2: ( ( rule__Property__Group__0 ) )
            // InternalSimple.g:243:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalSimple.g:244:3: ( rule__Property__Group__0 )
            // InternalSimple.g:244:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValue"
    // InternalSimple.g:253:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSimple.g:254:1: ( ruleValue EOF )
            // InternalSimple.g:255:1: ruleValue EOF
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
    // InternalSimple.g:262:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:266:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSimple.g:267:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSimple.g:267:2: ( ( rule__Value__Group__0 ) )
            // InternalSimple.g:268:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSimple.g:269:3: ( rule__Value__Group__0 )
            // InternalSimple.g:269:4: rule__Value__Group__0
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
    // InternalSimple.g:278:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:282:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalSimple.g:283:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalSimple.g:283:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalSimple.g:284:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalSimple.g:285:3: ( rule__PropertyType__Alternatives )
            // InternalSimple.g:285:4: rule__PropertyType__Alternatives
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


    // $ANTLR start "rule__ShapeExpression__Alternatives"
    // InternalSimple.g:293:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__PropertyValuesAssignment_1 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:297:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__PropertyValuesAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_UNICODE) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=12 && LA1_1<=18)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==23) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>=12 && LA1_0<=18)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimple.g:298:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalSimple.g:298:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalSimple.g:299:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalSimple.g:300:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalSimple.g:300:4: rule__ShapeExpression__Group_0__0
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
                    // InternalSimple.g:304:2: ( ( rule__ShapeExpression__PropertyValuesAssignment_1 ) )
                    {
                    // InternalSimple.g:304:2: ( ( rule__ShapeExpression__PropertyValuesAssignment_1 ) )
                    // InternalSimple.g:305:3: ( rule__ShapeExpression__PropertyValuesAssignment_1 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1()); 
                    // InternalSimple.g:306:3: ( rule__ShapeExpression__PropertyValuesAssignment_1 )
                    // InternalSimple.g:306:4: rule__ShapeExpression__PropertyValuesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__PropertyValuesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1()); 

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


    // $ANTLR start "rule__PropertyValues__Alternatives"
    // InternalSimple.g:314:1: rule__PropertyValues__Alternatives : ( ( ( rule__PropertyValues__Group_0__0 ) ) | ( ( rule__PropertyValues__Group_1__0 ) ) );
    public final void rule__PropertyValues__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:318:1: ( ( ( rule__PropertyValues__Group_0__0 ) ) | ( ( rule__PropertyValues__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_UNICODE) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimple.g:319:2: ( ( rule__PropertyValues__Group_0__0 ) )
                    {
                    // InternalSimple.g:319:2: ( ( rule__PropertyValues__Group_0__0 ) )
                    // InternalSimple.g:320:3: ( rule__PropertyValues__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyValuesAccess().getGroup_0()); 
                    // InternalSimple.g:321:3: ( rule__PropertyValues__Group_0__0 )
                    // InternalSimple.g:321:4: rule__PropertyValues__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValues__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValuesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:325:2: ( ( rule__PropertyValues__Group_1__0 ) )
                    {
                    // InternalSimple.g:325:2: ( ( rule__PropertyValues__Group_1__0 ) )
                    // InternalSimple.g:326:3: ( rule__PropertyValues__Group_1__0 )
                    {
                     before(grammarAccess.getPropertyValuesAccess().getGroup_1()); 
                    // InternalSimple.g:327:3: ( rule__PropertyValues__Group_1__0 )
                    // InternalSimple.g:327:4: rule__PropertyValues__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValues__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValuesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PropertyValues__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalSimple.g:335:1: rule__PropertyType__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:339:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) )
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
                    // InternalSimple.g:340:2: ( ( 'MIN' ) )
                    {
                    // InternalSimple.g:340:2: ( ( 'MIN' ) )
                    // InternalSimple.g:341:3: ( 'MIN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalSimple.g:342:3: ( 'MIN' )
                    // InternalSimple.g:342:4: 'MIN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:346:2: ( ( 'MAX' ) )
                    {
                    // InternalSimple.g:346:2: ( ( 'MAX' ) )
                    // InternalSimple.g:347:3: ( 'MAX' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalSimple.g:348:3: ( 'MAX' )
                    // InternalSimple.g:348:4: 'MAX'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:352:2: ( ( 'AND' ) )
                    {
                    // InternalSimple.g:352:2: ( ( 'AND' ) )
                    // InternalSimple.g:353:3: ( 'AND' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalSimple.g:354:3: ( 'AND' )
                    // InternalSimple.g:354:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:358:2: ( ( 'OR' ) )
                    {
                    // InternalSimple.g:358:2: ( ( 'OR' ) )
                    // InternalSimple.g:359:3: ( 'OR' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalSimple.g:360:3: ( 'OR' )
                    // InternalSimple.g:360:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:364:2: ( ( 'NOT' ) )
                    {
                    // InternalSimple.g:364:2: ( ( 'NOT' ) )
                    // InternalSimple.g:365:3: ( 'NOT' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalSimple.g:366:3: ( 'NOT' )
                    // InternalSimple.g:366:4: 'NOT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:370:2: ( ( 'SOME ' ) )
                    {
                    // InternalSimple.g:370:2: ( ( 'SOME ' ) )
                    // InternalSimple.g:371:3: ( 'SOME ' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 
                    // InternalSimple.g:372:3: ( 'SOME ' )
                    // InternalSimple.g:372:4: 'SOME '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:376:2: ( ( 'SOME ^' ) )
                    {
                    // InternalSimple.g:376:2: ( ( 'SOME ^' ) )
                    // InternalSimple.g:377:3: ( 'SOME ^' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 
                    // InternalSimple.g:378:3: ( 'SOME ^' )
                    // InternalSimple.g:378:4: 'SOME ^'
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
    // InternalSimple.g:386:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:390:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalSimple.g:391:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalSimple.g:398:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:402:1: ( ( () ) )
            // InternalSimple.g:403:1: ( () )
            {
            // InternalSimple.g:403:1: ( () )
            // InternalSimple.g:404:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalSimple.g:405:2: ()
            // InternalSimple.g:405:3: 
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
    // InternalSimple.g:413:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:417:1: ( rule__Graph__Group__1__Impl )
            // InternalSimple.g:418:2: rule__Graph__Group__1__Impl
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
    // InternalSimple.g:424:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ShapesGraphAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:428:1: ( ( ( rule__Graph__ShapesGraphAssignment_1 ) ) )
            // InternalSimple.g:429:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            {
            // InternalSimple.g:429:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            // InternalSimple.g:430:2: ( rule__Graph__ShapesGraphAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 
            // InternalSimple.g:431:2: ( rule__Graph__ShapesGraphAssignment_1 )
            // InternalSimple.g:431:3: rule__Graph__ShapesGraphAssignment_1
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
    // InternalSimple.g:440:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:444:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalSimple.g:445:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalSimple.g:452:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:456:1: ( ( () ) )
            // InternalSimple.g:457:1: ( () )
            {
            // InternalSimple.g:457:1: ( () )
            // InternalSimple.g:458:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalSimple.g:459:2: ()
            // InternalSimple.g:459:3: 
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
    // InternalSimple.g:467:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2 ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:471:1: ( rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2 )
            // InternalSimple.g:472:2: rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ShapesGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapesGraph__Group__2();

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
    // InternalSimple.g:479:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__TargetsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:483:1: ( ( ( rule__ShapesGraph__TargetsAssignment_1 )* ) )
            // InternalSimple.g:484:1: ( ( rule__ShapesGraph__TargetsAssignment_1 )* )
            {
            // InternalSimple.g:484:1: ( ( rule__ShapesGraph__TargetsAssignment_1 )* )
            // InternalSimple.g:485:2: ( rule__ShapesGraph__TargetsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getTargetsAssignment_1()); 
            // InternalSimple.g:486:2: ( rule__ShapesGraph__TargetsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==19) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:486:3: rule__ShapesGraph__TargetsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__TargetsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShapesGraphAccess().getTargetsAssignment_1()); 

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


    // $ANTLR start "rule__ShapesGraph__Group__2"
    // InternalSimple.g:494:1: rule__ShapesGraph__Group__2 : rule__ShapesGraph__Group__2__Impl ;
    public final void rule__ShapesGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:498:1: ( rule__ShapesGraph__Group__2__Impl )
            // InternalSimple.g:499:2: rule__ShapesGraph__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapesGraph__Group__2__Impl();

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
    // $ANTLR end "rule__ShapesGraph__Group__2"


    // $ANTLR start "rule__ShapesGraph__Group__2__Impl"
    // InternalSimple.g:505:1: rule__ShapesGraph__Group__2__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* ) ;
    public final void rule__ShapesGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:509:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* ) )
            // InternalSimple.g:510:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* )
            {
            // InternalSimple.g:510:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* )
            // InternalSimple.g:511:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_2()); 
            // InternalSimple.g:512:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_UNICODE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimple.g:512:3: rule__ShapesGraph__ShapeConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__ShapesGraph__Group__2__Impl"


    // $ANTLR start "rule__Target__Group__0"
    // InternalSimple.g:521:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:525:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalSimple.g:526:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimple.g:533:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:537:1: ( ( () ) )
            // InternalSimple.g:538:1: ( () )
            {
            // InternalSimple.g:538:1: ( () )
            // InternalSimple.g:539:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalSimple.g:540:2: ()
            // InternalSimple.g:540:3: 
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
    // InternalSimple.g:548:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:552:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalSimple.g:553:2: rule__Target__Group__1__Impl rule__Target__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimple.g:560:1: rule__Target__Group__1__Impl : ( ( rule__Target__NameAssignment_1 ) ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:564:1: ( ( ( rule__Target__NameAssignment_1 ) ) )
            // InternalSimple.g:565:1: ( ( rule__Target__NameAssignment_1 ) )
            {
            // InternalSimple.g:565:1: ( ( rule__Target__NameAssignment_1 ) )
            // InternalSimple.g:566:2: ( rule__Target__NameAssignment_1 )
            {
             before(grammarAccess.getTargetAccess().getNameAssignment_1()); 
            // InternalSimple.g:567:2: ( rule__Target__NameAssignment_1 )
            // InternalSimple.g:567:3: rule__Target__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getNameAssignment_1()); 

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
    // InternalSimple.g:575:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:579:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalSimple.g:580:2: rule__Target__Group__2__Impl rule__Target__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimple.g:587:1: rule__Target__Group__2__Impl : ( '(' ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:591:1: ( ( '(' ) )
            // InternalSimple.g:592:1: ( '(' )
            {
            // InternalSimple.g:592:1: ( '(' )
            // InternalSimple.g:593:2: '('
            {
             before(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalSimple.g:602:1: rule__Target__Group__3 : rule__Target__Group__3__Impl rule__Target__Group__4 ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:606:1: ( rule__Target__Group__3__Impl rule__Target__Group__4 )
            // InternalSimple.g:607:2: rule__Target__Group__3__Impl rule__Target__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Target__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__4();

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
    // InternalSimple.g:614:1: rule__Target__Group__3__Impl : ( ( rule__Target__TermAssignment_3 ) ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:618:1: ( ( ( rule__Target__TermAssignment_3 ) ) )
            // InternalSimple.g:619:1: ( ( rule__Target__TermAssignment_3 ) )
            {
            // InternalSimple.g:619:1: ( ( rule__Target__TermAssignment_3 ) )
            // InternalSimple.g:620:2: ( rule__Target__TermAssignment_3 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_3()); 
            // InternalSimple.g:621:2: ( rule__Target__TermAssignment_3 )
            // InternalSimple.g:621:3: rule__Target__TermAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Target__TermAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTermAssignment_3()); 

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


    // $ANTLR start "rule__Target__Group__4"
    // InternalSimple.g:629:1: rule__Target__Group__4 : rule__Target__Group__4__Impl rule__Target__Group__5 ;
    public final void rule__Target__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:633:1: ( rule__Target__Group__4__Impl rule__Target__Group__5 )
            // InternalSimple.g:634:2: rule__Target__Group__4__Impl rule__Target__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Target__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__5();

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
    // $ANTLR end "rule__Target__Group__4"


    // $ANTLR start "rule__Target__Group__4__Impl"
    // InternalSimple.g:641:1: rule__Target__Group__4__Impl : ( ')' ) ;
    public final void rule__Target__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:645:1: ( ( ')' ) )
            // InternalSimple.g:646:1: ( ')' )
            {
            // InternalSimple.g:646:1: ( ')' )
            // InternalSimple.g:647:2: ')'
            {
             before(grammarAccess.getTargetAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Target__Group__4__Impl"


    // $ANTLR start "rule__Target__Group__5"
    // InternalSimple.g:656:1: rule__Target__Group__5 : rule__Target__Group__5__Impl ;
    public final void rule__Target__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:660:1: ( rule__Target__Group__5__Impl )
            // InternalSimple.g:661:2: rule__Target__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__5__Impl();

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
    // $ANTLR end "rule__Target__Group__5"


    // $ANTLR start "rule__Target__Group__5__Impl"
    // InternalSimple.g:667:1: rule__Target__Group__5__Impl : ( '?' ) ;
    public final void rule__Target__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:671:1: ( ( '?' ) )
            // InternalSimple.g:672:1: ( '?' )
            {
            // InternalSimple.g:672:1: ( '?' )
            // InternalSimple.g:673:2: '?'
            {
             before(grammarAccess.getTargetAccess().getQuestionMarkKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getQuestionMarkKeyword_5()); 

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
    // $ANTLR end "rule__Target__Group__5__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__0"
    // InternalSimple.g:683:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:687:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalSimple.g:688:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalSimple.g:695:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:699:1: ( ( () ) )
            // InternalSimple.g:700:1: ( () )
            {
            // InternalSimple.g:700:1: ( () )
            // InternalSimple.g:701:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalSimple.g:702:2: ()
            // InternalSimple.g:702:3: 
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
    // InternalSimple.g:710:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:714:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalSimple.g:715:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSimple.g:722:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:726:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalSimple.g:727:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalSimple.g:727:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalSimple.g:728:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalSimple.g:729:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalSimple.g:729:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalSimple.g:737:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:741:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalSimple.g:742:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ShapeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__3();

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
    // InternalSimple.g:749:1: rule__ShapeConstraint__Group__2__Impl : ( ':-' ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:753:1: ( ( ':-' ) )
            // InternalSimple.g:754:1: ( ':-' )
            {
            // InternalSimple.g:754:1: ( ':-' )
            // InternalSimple.g:755:2: ':-'
            {
             before(grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2()); 

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


    // $ANTLR start "rule__ShapeConstraint__Group__3"
    // InternalSimple.g:764:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:768:1: ( rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 )
            // InternalSimple.g:769:2: rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ShapeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__4();

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
    // $ANTLR end "rule__ShapeConstraint__Group__3"


    // $ANTLR start "rule__ShapeConstraint__Group__3__Impl"
    // InternalSimple.g:776:1: rule__ShapeConstraint__Group__3__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:780:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) )
            // InternalSimple.g:781:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            {
            // InternalSimple.g:781:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            // InternalSimple.g:782:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 
            // InternalSimple.g:783:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            // InternalSimple.g:783:3: rule__ShapeConstraint__ShapeExpressionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__ShapeExpressionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 

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
    // $ANTLR end "rule__ShapeConstraint__Group__3__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__4"
    // InternalSimple.g:791:1: rule__ShapeConstraint__Group__4 : rule__ShapeConstraint__Group__4__Impl ;
    public final void rule__ShapeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:795:1: ( rule__ShapeConstraint__Group__4__Impl )
            // InternalSimple.g:796:2: rule__ShapeConstraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__4__Impl();

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
    // $ANTLR end "rule__ShapeConstraint__Group__4"


    // $ANTLR start "rule__ShapeConstraint__Group__4__Impl"
    // InternalSimple.g:802:1: rule__ShapeConstraint__Group__4__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:806:1: ( ( ';' ) )
            // InternalSimple.g:807:1: ( ';' )
            {
            // InternalSimple.g:807:1: ( ';' )
            // InternalSimple.g:808:2: ';'
            {
             before(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ShapeConstraint__Group__4__Impl"


    // $ANTLR start "rule__ShapeName__Group__0"
    // InternalSimple.g:818:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:822:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalSimple.g:823:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalSimple.g:830:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:834:1: ( ( () ) )
            // InternalSimple.g:835:1: ( () )
            {
            // InternalSimple.g:835:1: ( () )
            // InternalSimple.g:836:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalSimple.g:837:2: ()
            // InternalSimple.g:837:3: 
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
    // InternalSimple.g:845:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:849:1: ( rule__ShapeName__Group__1__Impl )
            // InternalSimple.g:850:2: rule__ShapeName__Group__1__Impl
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
    // InternalSimple.g:856:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:860:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalSimple.g:861:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalSimple.g:861:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalSimple.g:862:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalSimple.g:863:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalSimple.g:863:3: rule__ShapeName__NameAssignment_1
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
    // InternalSimple.g:872:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:876:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalSimple.g:877:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimple.g:884:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:888:1: ( ( () ) )
            // InternalSimple.g:889:1: ( () )
            {
            // InternalSimple.g:889:1: ( () )
            // InternalSimple.g:890:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalSimple.g:891:2: ()
            // InternalSimple.g:891:3: 
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
    // InternalSimple.g:899:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:903:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalSimple.g:904:2: rule__ShapeExpression__Group_0__1__Impl
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
    // InternalSimple.g:910:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:914:1: ( ( ( rule__ShapeExpression__ValueAssignment_0_1 ) ) )
            // InternalSimple.g:915:1: ( ( rule__ShapeExpression__ValueAssignment_0_1 ) )
            {
            // InternalSimple.g:915:1: ( ( rule__ShapeExpression__ValueAssignment_0_1 ) )
            // InternalSimple.g:916:2: ( rule__ShapeExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValueAssignment_0_1()); 
            // InternalSimple.g:917:2: ( rule__ShapeExpression__ValueAssignment_0_1 )
            // InternalSimple.g:917:3: rule__ShapeExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValueAssignment_0_1()); 

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


    // $ANTLR start "rule__PropertyValues__Group_0__0"
    // InternalSimple.g:926:1: rule__PropertyValues__Group_0__0 : rule__PropertyValues__Group_0__0__Impl rule__PropertyValues__Group_0__1 ;
    public final void rule__PropertyValues__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:930:1: ( rule__PropertyValues__Group_0__0__Impl rule__PropertyValues__Group_0__1 )
            // InternalSimple.g:931:2: rule__PropertyValues__Group_0__0__Impl rule__PropertyValues__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValues__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0__1();

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
    // $ANTLR end "rule__PropertyValues__Group_0__0"


    // $ANTLR start "rule__PropertyValues__Group_0__0__Impl"
    // InternalSimple.g:938:1: rule__PropertyValues__Group_0__0__Impl : ( () ) ;
    public final void rule__PropertyValues__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:942:1: ( ( () ) )
            // InternalSimple.g:943:1: ( () )
            {
            // InternalSimple.g:943:1: ( () )
            // InternalSimple.g:944:2: ()
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0_0()); 
            // InternalSimple.g:945:2: ()
            // InternalSimple.g:945:3: 
            {
            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group_0__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0__1"
    // InternalSimple.g:953:1: rule__PropertyValues__Group_0__1 : rule__PropertyValues__Group_0__1__Impl ;
    public final void rule__PropertyValues__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:957:1: ( rule__PropertyValues__Group_0__1__Impl )
            // InternalSimple.g:958:2: rule__PropertyValues__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0__1__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group_0__1"


    // $ANTLR start "rule__PropertyValues__Group_0__1__Impl"
    // InternalSimple.g:964:1: rule__PropertyValues__Group_0__1__Impl : ( ( rule__PropertyValues__Group_0_1__0 ) ) ;
    public final void rule__PropertyValues__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:968:1: ( ( ( rule__PropertyValues__Group_0_1__0 ) ) )
            // InternalSimple.g:969:1: ( ( rule__PropertyValues__Group_0_1__0 ) )
            {
            // InternalSimple.g:969:1: ( ( rule__PropertyValues__Group_0_1__0 ) )
            // InternalSimple.g:970:2: ( rule__PropertyValues__Group_0_1__0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getGroup_0_1()); 
            // InternalSimple.g:971:2: ( rule__PropertyValues__Group_0_1__0 )
            // InternalSimple.g:971:3: rule__PropertyValues__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1__0"
    // InternalSimple.g:980:1: rule__PropertyValues__Group_0_1__0 : rule__PropertyValues__Group_0_1__0__Impl rule__PropertyValues__Group_0_1__1 ;
    public final void rule__PropertyValues__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:984:1: ( rule__PropertyValues__Group_0_1__0__Impl rule__PropertyValues__Group_0_1__1 )
            // InternalSimple.g:985:2: rule__PropertyValues__Group_0_1__0__Impl rule__PropertyValues__Group_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__PropertyValues__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1__1();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__0"


    // $ANTLR start "rule__PropertyValues__Group_0_1__0__Impl"
    // InternalSimple.g:992:1: rule__PropertyValues__Group_0_1__0__Impl : ( ( rule__PropertyValues__ValuesAssignment_0_1_0 ) ) ;
    public final void rule__PropertyValues__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:996:1: ( ( ( rule__PropertyValues__ValuesAssignment_0_1_0 ) ) )
            // InternalSimple.g:997:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_0 ) )
            {
            // InternalSimple.g:997:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_0 ) )
            // InternalSimple.g:998:2: ( rule__PropertyValues__ValuesAssignment_0_1_0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_0()); 
            // InternalSimple.g:999:2: ( rule__PropertyValues__ValuesAssignment_0_1_0 )
            // InternalSimple.g:999:3: rule__PropertyValues__ValuesAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__ValuesAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1__1"
    // InternalSimple.g:1007:1: rule__PropertyValues__Group_0_1__1 : rule__PropertyValues__Group_0_1__1__Impl rule__PropertyValues__Group_0_1__2 ;
    public final void rule__PropertyValues__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1011:1: ( rule__PropertyValues__Group_0_1__1__Impl rule__PropertyValues__Group_0_1__2 )
            // InternalSimple.g:1012:2: rule__PropertyValues__Group_0_1__1__Impl rule__PropertyValues__Group_0_1__2
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValues__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1__2();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__1"


    // $ANTLR start "rule__PropertyValues__Group_0_1__1__Impl"
    // InternalSimple.g:1019:1: rule__PropertyValues__Group_0_1__1__Impl : ( ( rule__PropertyValues__PropertyAssignment_0_1_1 ) ) ;
    public final void rule__PropertyValues__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1023:1: ( ( ( rule__PropertyValues__PropertyAssignment_0_1_1 ) ) )
            // InternalSimple.g:1024:1: ( ( rule__PropertyValues__PropertyAssignment_0_1_1 ) )
            {
            // InternalSimple.g:1024:1: ( ( rule__PropertyValues__PropertyAssignment_0_1_1 ) )
            // InternalSimple.g:1025:2: ( rule__PropertyValues__PropertyAssignment_0_1_1 )
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0_1_1()); 
            // InternalSimple.g:1026:2: ( rule__PropertyValues__PropertyAssignment_0_1_1 )
            // InternalSimple.g:1026:3: rule__PropertyValues__PropertyAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__PropertyAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0_1_1()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1__2"
    // InternalSimple.g:1034:1: rule__PropertyValues__Group_0_1__2 : rule__PropertyValues__Group_0_1__2__Impl rule__PropertyValues__Group_0_1__3 ;
    public final void rule__PropertyValues__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1038:1: ( rule__PropertyValues__Group_0_1__2__Impl rule__PropertyValues__Group_0_1__3 )
            // InternalSimple.g:1039:2: rule__PropertyValues__Group_0_1__2__Impl rule__PropertyValues__Group_0_1__3
            {
            pushFollow(FOLLOW_11);
            rule__PropertyValues__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1__3();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__2"


    // $ANTLR start "rule__PropertyValues__Group_0_1__2__Impl"
    // InternalSimple.g:1046:1: rule__PropertyValues__Group_0_1__2__Impl : ( ( rule__PropertyValues__ValuesAssignment_0_1_2 ) ) ;
    public final void rule__PropertyValues__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1050:1: ( ( ( rule__PropertyValues__ValuesAssignment_0_1_2 ) ) )
            // InternalSimple.g:1051:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_2 ) )
            {
            // InternalSimple.g:1051:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_2 ) )
            // InternalSimple.g:1052:2: ( rule__PropertyValues__ValuesAssignment_0_1_2 )
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_2()); 
            // InternalSimple.g:1053:2: ( rule__PropertyValues__ValuesAssignment_0_1_2 )
            // InternalSimple.g:1053:3: rule__PropertyValues__ValuesAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__ValuesAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_2()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__2__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1__3"
    // InternalSimple.g:1061:1: rule__PropertyValues__Group_0_1__3 : rule__PropertyValues__Group_0_1__3__Impl ;
    public final void rule__PropertyValues__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1065:1: ( rule__PropertyValues__Group_0_1__3__Impl )
            // InternalSimple.g:1066:2: rule__PropertyValues__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1__3__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__3"


    // $ANTLR start "rule__PropertyValues__Group_0_1__3__Impl"
    // InternalSimple.g:1072:1: rule__PropertyValues__Group_0_1__3__Impl : ( ( rule__PropertyValues__Group_0_1_3__0 )* ) ;
    public final void rule__PropertyValues__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1076:1: ( ( ( rule__PropertyValues__Group_0_1_3__0 )* ) )
            // InternalSimple.g:1077:1: ( ( rule__PropertyValues__Group_0_1_3__0 )* )
            {
            // InternalSimple.g:1077:1: ( ( rule__PropertyValues__Group_0_1_3__0 )* )
            // InternalSimple.g:1078:2: ( rule__PropertyValues__Group_0_1_3__0 )*
            {
             before(grammarAccess.getPropertyValuesAccess().getGroup_0_1_3()); 
            // InternalSimple.g:1079:2: ( rule__PropertyValues__Group_0_1_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimple.g:1079:3: rule__PropertyValues__Group_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PropertyValues__Group_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPropertyValuesAccess().getGroup_0_1_3()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1__3__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1_3__0"
    // InternalSimple.g:1088:1: rule__PropertyValues__Group_0_1_3__0 : rule__PropertyValues__Group_0_1_3__0__Impl rule__PropertyValues__Group_0_1_3__1 ;
    public final void rule__PropertyValues__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1092:1: ( rule__PropertyValues__Group_0_1_3__0__Impl rule__PropertyValues__Group_0_1_3__1 )
            // InternalSimple.g:1093:2: rule__PropertyValues__Group_0_1_3__0__Impl rule__PropertyValues__Group_0_1_3__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValues__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1_3__1();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1_3__0"


    // $ANTLR start "rule__PropertyValues__Group_0_1_3__0__Impl"
    // InternalSimple.g:1100:1: rule__PropertyValues__Group_0_1_3__0__Impl : ( 'AND' ) ;
    public final void rule__PropertyValues__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1104:1: ( ( 'AND' ) )
            // InternalSimple.g:1105:1: ( 'AND' )
            {
            // InternalSimple.g:1105:1: ( 'AND' )
            // InternalSimple.g:1106:2: 'AND'
            {
             before(grammarAccess.getPropertyValuesAccess().getANDKeyword_0_1_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyValuesAccess().getANDKeyword_0_1_3_0()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group_0_1_3__1"
    // InternalSimple.g:1115:1: rule__PropertyValues__Group_0_1_3__1 : rule__PropertyValues__Group_0_1_3__1__Impl ;
    public final void rule__PropertyValues__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1119:1: ( rule__PropertyValues__Group_0_1_3__1__Impl )
            // InternalSimple.g:1120:2: rule__PropertyValues__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_0_1_3__1__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group_0_1_3__1"


    // $ANTLR start "rule__PropertyValues__Group_0_1_3__1__Impl"
    // InternalSimple.g:1126:1: rule__PropertyValues__Group_0_1_3__1__Impl : ( ( rule__PropertyValues__ValuesAssignment_0_1_3_1 ) ) ;
    public final void rule__PropertyValues__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1130:1: ( ( ( rule__PropertyValues__ValuesAssignment_0_1_3_1 ) ) )
            // InternalSimple.g:1131:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_3_1 ) )
            {
            // InternalSimple.g:1131:1: ( ( rule__PropertyValues__ValuesAssignment_0_1_3_1 ) )
            // InternalSimple.g:1132:2: ( rule__PropertyValues__ValuesAssignment_0_1_3_1 )
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_3_1()); 
            // InternalSimple.g:1133:2: ( rule__PropertyValues__ValuesAssignment_0_1_3_1 )
            // InternalSimple.g:1133:3: rule__PropertyValues__ValuesAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__ValuesAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_3_1()); 

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
    // $ANTLR end "rule__PropertyValues__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group_1__0"
    // InternalSimple.g:1142:1: rule__PropertyValues__Group_1__0 : rule__PropertyValues__Group_1__0__Impl rule__PropertyValues__Group_1__1 ;
    public final void rule__PropertyValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1146:1: ( rule__PropertyValues__Group_1__0__Impl rule__PropertyValues__Group_1__1 )
            // InternalSimple.g:1147:2: rule__PropertyValues__Group_1__0__Impl rule__PropertyValues__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValues__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_1__1();

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
    // $ANTLR end "rule__PropertyValues__Group_1__0"


    // $ANTLR start "rule__PropertyValues__Group_1__0__Impl"
    // InternalSimple.g:1154:1: rule__PropertyValues__Group_1__0__Impl : ( ( rule__PropertyValues__PropertyAssignment_1_0 ) ) ;
    public final void rule__PropertyValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1158:1: ( ( ( rule__PropertyValues__PropertyAssignment_1_0 ) ) )
            // InternalSimple.g:1159:1: ( ( rule__PropertyValues__PropertyAssignment_1_0 ) )
            {
            // InternalSimple.g:1159:1: ( ( rule__PropertyValues__PropertyAssignment_1_0 ) )
            // InternalSimple.g:1160:2: ( rule__PropertyValues__PropertyAssignment_1_0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_1_0()); 
            // InternalSimple.g:1161:2: ( rule__PropertyValues__PropertyAssignment_1_0 )
            // InternalSimple.g:1161:3: rule__PropertyValues__PropertyAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__PropertyAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group_1__1"
    // InternalSimple.g:1169:1: rule__PropertyValues__Group_1__1 : rule__PropertyValues__Group_1__1__Impl ;
    public final void rule__PropertyValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1173:1: ( rule__PropertyValues__Group_1__1__Impl )
            // InternalSimple.g:1174:2: rule__PropertyValues__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group_1__1__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group_1__1"


    // $ANTLR start "rule__PropertyValues__Group_1__1__Impl"
    // InternalSimple.g:1180:1: rule__PropertyValues__Group_1__1__Impl : ( ( ( rule__PropertyValues__ValuesAssignment_1_1 ) ) ( ( rule__PropertyValues__ValuesAssignment_1_1 )* ) ) ;
    public final void rule__PropertyValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1184:1: ( ( ( ( rule__PropertyValues__ValuesAssignment_1_1 ) ) ( ( rule__PropertyValues__ValuesAssignment_1_1 )* ) ) )
            // InternalSimple.g:1185:1: ( ( ( rule__PropertyValues__ValuesAssignment_1_1 ) ) ( ( rule__PropertyValues__ValuesAssignment_1_1 )* ) )
            {
            // InternalSimple.g:1185:1: ( ( ( rule__PropertyValues__ValuesAssignment_1_1 ) ) ( ( rule__PropertyValues__ValuesAssignment_1_1 )* ) )
            // InternalSimple.g:1186:2: ( ( rule__PropertyValues__ValuesAssignment_1_1 ) ) ( ( rule__PropertyValues__ValuesAssignment_1_1 )* )
            {
            // InternalSimple.g:1186:2: ( ( rule__PropertyValues__ValuesAssignment_1_1 ) )
            // InternalSimple.g:1187:3: ( rule__PropertyValues__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1_1()); 
            // InternalSimple.g:1188:3: ( rule__PropertyValues__ValuesAssignment_1_1 )
            // InternalSimple.g:1188:4: rule__PropertyValues__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_4);
            rule__PropertyValues__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1_1()); 

            }

            // InternalSimple.g:1191:2: ( ( rule__PropertyValues__ValuesAssignment_1_1 )* )
            // InternalSimple.g:1192:3: ( rule__PropertyValues__ValuesAssignment_1_1 )*
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1_1()); 
            // InternalSimple.g:1193:3: ( rule__PropertyValues__ValuesAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_UNICODE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimple.g:1193:4: rule__PropertyValues__ValuesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PropertyValues__ValuesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1_1()); 

            }


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
    // $ANTLR end "rule__PropertyValues__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalSimple.g:1203:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1207:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalSimple.g:1208:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalSimple.g:1215:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1219:1: ( ( () ) )
            // InternalSimple.g:1220:1: ( () )
            {
            // InternalSimple.g:1220:1: ( () )
            // InternalSimple.g:1221:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalSimple.g:1222:2: ()
            // InternalSimple.g:1222:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalSimple.g:1230:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1234:1: ( rule__Property__Group__1__Impl )
            // InternalSimple.g:1235:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__1__Impl();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalSimple.g:1241:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1245:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // InternalSimple.g:1246:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // InternalSimple.g:1246:1: ( ( rule__Property__TypeAssignment_1 ) )
            // InternalSimple.g:1247:2: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // InternalSimple.g:1248:2: ( rule__Property__TypeAssignment_1 )
            // InternalSimple.g:1248:3: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalSimple.g:1257:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1261:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSimple.g:1262:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimple.g:1269:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1273:1: ( ( () ) )
            // InternalSimple.g:1274:1: ( () )
            {
            // InternalSimple.g:1274:1: ( () )
            // InternalSimple.g:1275:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSimple.g:1276:2: ()
            // InternalSimple.g:1276:3: 
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
    // InternalSimple.g:1284:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1288:1: ( rule__Value__Group__1__Impl )
            // InternalSimple.g:1289:2: rule__Value__Group__1__Impl
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
    // InternalSimple.g:1295:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1299:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalSimple.g:1300:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalSimple.g:1300:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalSimple.g:1301:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalSimple.g:1302:2: ( rule__Value__NameAssignment_1 )
            // InternalSimple.g:1302:3: rule__Value__NameAssignment_1
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
    // InternalSimple.g:1311:1: rule__Graph__ShapesGraphAssignment_1 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1315:1: ( ( ruleShapesGraph ) )
            // InternalSimple.g:1316:2: ( ruleShapesGraph )
            {
            // InternalSimple.g:1316:2: ( ruleShapesGraph )
            // InternalSimple.g:1317:3: ruleShapesGraph
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


    // $ANTLR start "rule__ShapesGraph__TargetsAssignment_1"
    // InternalSimple.g:1326:1: rule__ShapesGraph__TargetsAssignment_1 : ( ruleTarget ) ;
    public final void rule__ShapesGraph__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1330:1: ( ( ruleTarget ) )
            // InternalSimple.g:1331:2: ( ruleTarget )
            {
            // InternalSimple.g:1331:2: ( ruleTarget )
            // InternalSimple.g:1332:3: ruleTarget
            {
             before(grammarAccess.getShapesGraphAccess().getTargetsTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getShapesGraphAccess().getTargetsTargetParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ShapesGraph__TargetsAssignment_1"


    // $ANTLR start "rule__ShapesGraph__ShapeConstraintsAssignment_2"
    // InternalSimple.g:1341:1: rule__ShapesGraph__ShapeConstraintsAssignment_2 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1345:1: ( ( ruleShapeConstraint ) )
            // InternalSimple.g:1346:2: ( ruleShapeConstraint )
            {
            // InternalSimple.g:1346:2: ( ruleShapeConstraint )
            // InternalSimple.g:1347:3: ruleShapeConstraint
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeConstraint();

            state._fsp--;

             after(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ShapesGraph__ShapeConstraintsAssignment_2"


    // $ANTLR start "rule__Target__NameAssignment_1"
    // InternalSimple.g:1356:1: rule__Target__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Target__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1360:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1361:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1361:2: ( RULE_UNICODE )
            // InternalSimple.g:1362:3: RULE_UNICODE
            {
             before(grammarAccess.getTargetAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getNameUNICODETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Target__NameAssignment_1"


    // $ANTLR start "rule__Target__TermAssignment_3"
    // InternalSimple.g:1371:1: rule__Target__TermAssignment_3 : ( RULE_UNICODE ) ;
    public final void rule__Target__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1375:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1376:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1376:2: ( RULE_UNICODE )
            // InternalSimple.g:1377:3: RULE_UNICODE
            {
             before(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_3_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Target__TermAssignment_3"


    // $ANTLR start "rule__ShapeConstraint__ShapeNameAssignment_1"
    // InternalSimple.g:1386:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1390:1: ( ( ruleShapeName ) )
            // InternalSimple.g:1391:2: ( ruleShapeName )
            {
            // InternalSimple.g:1391:2: ( ruleShapeName )
            // InternalSimple.g:1392:3: ruleShapeName
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


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_3"
    // InternalSimple.g:1401:1: rule__ShapeConstraint__ShapeExpressionsAssignment_3 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1405:1: ( ( ruleShapeExpression ) )
            // InternalSimple.g:1406:2: ( ruleShapeExpression )
            {
            // InternalSimple.g:1406:2: ( ruleShapeExpression )
            // InternalSimple.g:1407:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ShapeConstraint__ShapeExpressionsAssignment_3"


    // $ANTLR start "rule__ShapeName__NameAssignment_1"
    // InternalSimple.g:1416:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1420:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1421:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1421:2: ( RULE_UNICODE )
            // InternalSimple.g:1422:3: RULE_UNICODE
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


    // $ANTLR start "rule__ShapeExpression__ValueAssignment_0_1"
    // InternalSimple.g:1431:1: rule__ShapeExpression__ValueAssignment_0_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1435:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1436:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1436:2: ( RULE_UNICODE )
            // InternalSimple.g:1437:3: RULE_UNICODE
            {
             before(grammarAccess.getShapeExpressionAccess().getValueUNICODETerminalRuleCall_0_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getValueUNICODETerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__ShapeExpression__PropertyValuesAssignment_1"
    // InternalSimple.g:1446:1: rule__ShapeExpression__PropertyValuesAssignment_1 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1450:1: ( ( rulePropertyValues ) )
            // InternalSimple.g:1451:2: ( rulePropertyValues )
            {
            // InternalSimple.g:1451:2: ( rulePropertyValues )
            // InternalSimple.g:1452:3: rulePropertyValues
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValues();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__PropertyValuesAssignment_1"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_0_1_0"
    // InternalSimple.g:1461:1: rule__PropertyValues__ValuesAssignment_0_1_0 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1465:1: ( ( ruleValue ) )
            // InternalSimple.g:1466:2: ( ruleValue )
            {
            // InternalSimple.g:1466:2: ( ruleValue )
            // InternalSimple.g:1467:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_0_1_0"


    // $ANTLR start "rule__PropertyValues__PropertyAssignment_0_1_1"
    // InternalSimple.g:1476:1: rule__PropertyValues__PropertyAssignment_0_1_1 : ( ruleProperty ) ;
    public final void rule__PropertyValues__PropertyAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1480:1: ( ( ruleProperty ) )
            // InternalSimple.g:1481:2: ( ruleProperty )
            {
            // InternalSimple.g:1481:2: ( ruleProperty )
            // InternalSimple.g:1482:3: ruleProperty
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__PropertyAssignment_0_1_1"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_0_1_2"
    // InternalSimple.g:1491:1: rule__PropertyValues__ValuesAssignment_0_1_2 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1495:1: ( ( ruleValue ) )
            // InternalSimple.g:1496:2: ( ruleValue )
            {
            // InternalSimple.g:1496:2: ( ruleValue )
            // InternalSimple.g:1497:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_0_1_2"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_0_1_3_1"
    // InternalSimple.g:1506:1: rule__PropertyValues__ValuesAssignment_0_1_3_1 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1510:1: ( ( ruleValue ) )
            // InternalSimple.g:1511:2: ( ruleValue )
            {
            // InternalSimple.g:1511:2: ( ruleValue )
            // InternalSimple.g:1512:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_3_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_0_1_3_1"


    // $ANTLR start "rule__PropertyValues__PropertyAssignment_1_0"
    // InternalSimple.g:1521:1: rule__PropertyValues__PropertyAssignment_1_0 : ( ruleProperty ) ;
    public final void rule__PropertyValues__PropertyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1525:1: ( ( ruleProperty ) )
            // InternalSimple.g:1526:2: ( ruleProperty )
            {
            // InternalSimple.g:1526:2: ( ruleProperty )
            // InternalSimple.g:1527:3: ruleProperty
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__PropertyValues__PropertyAssignment_1_0"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_1_1"
    // InternalSimple.g:1536:1: rule__PropertyValues__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1540:1: ( ( ruleValue ) )
            // InternalSimple.g:1541:2: ( ruleValue )
            {
            // InternalSimple.g:1541:2: ( ruleValue )
            // InternalSimple.g:1542:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_1_1"


    // $ANTLR start "rule__Property__TypeAssignment_1"
    // InternalSimple.g:1551:1: rule__Property__TypeAssignment_1 : ( rulePropertyType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1555:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1556:2: ( rulePropertyType )
            {
            // InternalSimple.g:1556:2: ( rulePropertyType )
            // InternalSimple.g:1557:3: rulePropertyType
            {
             before(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_1"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalSimple.g:1566:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1570:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1571:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1571:2: ( RULE_UNICODE )
            // InternalSimple.g:1572:3: RULE_UNICODE
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});

}