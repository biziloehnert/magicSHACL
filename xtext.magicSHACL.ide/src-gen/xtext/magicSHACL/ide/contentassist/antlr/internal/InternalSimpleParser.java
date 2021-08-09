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
    // InternalSimple.g:264:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) | ( ( rule__ShapeExpression__Group_2__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:268:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) | ( ( rule__ShapeExpression__Group_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_UNICODE) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=12 && LA2_1<=18)) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||LA2_1==23) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
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
                case 3 :
                    // InternalSimple.g:281:2: ( ( rule__ShapeExpression__Group_2__0 ) )
                    {
                    // InternalSimple.g:281:2: ( ( rule__ShapeExpression__Group_2__0 ) )
                    // InternalSimple.g:282:3: ( rule__ShapeExpression__Group_2__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_2()); 
                    // InternalSimple.g:283:3: ( rule__ShapeExpression__Group_2__0 )
                    // InternalSimple.g:283:4: rule__ShapeExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_2()); 

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
    // InternalSimple.g:291:1: rule__PropertyType__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:295:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) )
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
                    // InternalSimple.g:296:2: ( ( 'MIN' ) )
                    {
                    // InternalSimple.g:296:2: ( ( 'MIN' ) )
                    // InternalSimple.g:297:3: ( 'MIN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalSimple.g:298:3: ( 'MIN' )
                    // InternalSimple.g:298:4: 'MIN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:302:2: ( ( 'MAX' ) )
                    {
                    // InternalSimple.g:302:2: ( ( 'MAX' ) )
                    // InternalSimple.g:303:3: ( 'MAX' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalSimple.g:304:3: ( 'MAX' )
                    // InternalSimple.g:304:4: 'MAX'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:308:2: ( ( 'AND' ) )
                    {
                    // InternalSimple.g:308:2: ( ( 'AND' ) )
                    // InternalSimple.g:309:3: ( 'AND' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalSimple.g:310:3: ( 'AND' )
                    // InternalSimple.g:310:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:314:2: ( ( 'OR' ) )
                    {
                    // InternalSimple.g:314:2: ( ( 'OR' ) )
                    // InternalSimple.g:315:3: ( 'OR' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalSimple.g:316:3: ( 'OR' )
                    // InternalSimple.g:316:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:320:2: ( ( 'NOT' ) )
                    {
                    // InternalSimple.g:320:2: ( ( 'NOT' ) )
                    // InternalSimple.g:321:3: ( 'NOT' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalSimple.g:322:3: ( 'NOT' )
                    // InternalSimple.g:322:4: 'NOT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:326:2: ( ( 'SOME ' ) )
                    {
                    // InternalSimple.g:326:2: ( ( 'SOME ' ) )
                    // InternalSimple.g:327:3: ( 'SOME ' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 
                    // InternalSimple.g:328:3: ( 'SOME ' )
                    // InternalSimple.g:328:4: 'SOME '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:332:2: ( ( 'SOME ^' ) )
                    {
                    // InternalSimple.g:332:2: ( ( 'SOME ^' ) )
                    // InternalSimple.g:333:3: ( 'SOME ^' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 
                    // InternalSimple.g:334:3: ( 'SOME ^' )
                    // InternalSimple.g:334:4: 'SOME ^'
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
    // InternalSimple.g:342:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:346:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalSimple.g:347:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalSimple.g:354:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:358:1: ( ( () ) )
            // InternalSimple.g:359:1: ( () )
            {
            // InternalSimple.g:359:1: ( () )
            // InternalSimple.g:360:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalSimple.g:361:2: ()
            // InternalSimple.g:361:3: 
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
    // InternalSimple.g:369:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:373:1: ( rule__Graph__Group__1__Impl )
            // InternalSimple.g:374:2: rule__Graph__Group__1__Impl
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
    // InternalSimple.g:380:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ShapesGraphAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:384:1: ( ( ( rule__Graph__ShapesGraphAssignment_1 ) ) )
            // InternalSimple.g:385:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            {
            // InternalSimple.g:385:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            // InternalSimple.g:386:2: ( rule__Graph__ShapesGraphAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 
            // InternalSimple.g:387:2: ( rule__Graph__ShapesGraphAssignment_1 )
            // InternalSimple.g:387:3: rule__Graph__ShapesGraphAssignment_1
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
    // InternalSimple.g:396:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:400:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalSimple.g:401:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalSimple.g:408:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:412:1: ( ( () ) )
            // InternalSimple.g:413:1: ( () )
            {
            // InternalSimple.g:413:1: ( () )
            // InternalSimple.g:414:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalSimple.g:415:2: ()
            // InternalSimple.g:415:3: 
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
    // InternalSimple.g:423:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:427:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalSimple.g:428:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalSimple.g:434:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:438:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalSimple.g:439:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalSimple.g:439:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalSimple.g:440:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalSimple.g:441:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:441:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
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
    // InternalSimple.g:450:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:454:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalSimple.g:455:2: rule__Target__Group__0__Impl rule__Target__Group__1
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
    // InternalSimple.g:462:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:466:1: ( ( () ) )
            // InternalSimple.g:467:1: ( () )
            {
            // InternalSimple.g:467:1: ( () )
            // InternalSimple.g:468:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalSimple.g:469:2: ()
            // InternalSimple.g:469:3: 
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
    // InternalSimple.g:477:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:481:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalSimple.g:482:2: rule__Target__Group__1__Impl rule__Target__Group__2
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
    // InternalSimple.g:489:1: rule__Target__Group__1__Impl : ( '(' ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:493:1: ( ( '(' ) )
            // InternalSimple.g:494:1: ( '(' )
            {
            // InternalSimple.g:494:1: ( '(' )
            // InternalSimple.g:495:2: '('
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
    // InternalSimple.g:504:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:508:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalSimple.g:509:2: rule__Target__Group__2__Impl rule__Target__Group__3
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
    // InternalSimple.g:516:1: rule__Target__Group__2__Impl : ( ( rule__Target__TermAssignment_2 ) ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:520:1: ( ( ( rule__Target__TermAssignment_2 ) ) )
            // InternalSimple.g:521:1: ( ( rule__Target__TermAssignment_2 ) )
            {
            // InternalSimple.g:521:1: ( ( rule__Target__TermAssignment_2 ) )
            // InternalSimple.g:522:2: ( rule__Target__TermAssignment_2 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_2()); 
            // InternalSimple.g:523:2: ( rule__Target__TermAssignment_2 )
            // InternalSimple.g:523:3: rule__Target__TermAssignment_2
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
    // InternalSimple.g:531:1: rule__Target__Group__3 : rule__Target__Group__3__Impl ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:535:1: ( rule__Target__Group__3__Impl )
            // InternalSimple.g:536:2: rule__Target__Group__3__Impl
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
    // InternalSimple.g:542:1: rule__Target__Group__3__Impl : ( ')' ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:546:1: ( ( ')' ) )
            // InternalSimple.g:547:1: ( ')' )
            {
            // InternalSimple.g:547:1: ( ')' )
            // InternalSimple.g:548:2: ')'
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
    // InternalSimple.g:558:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:562:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalSimple.g:563:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalSimple.g:570:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:574:1: ( ( () ) )
            // InternalSimple.g:575:1: ( () )
            {
            // InternalSimple.g:575:1: ( () )
            // InternalSimple.g:576:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalSimple.g:577:2: ()
            // InternalSimple.g:577:3: 
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
    // InternalSimple.g:585:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:589:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalSimple.g:590:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
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
    // InternalSimple.g:597:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:601:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalSimple.g:602:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalSimple.g:602:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalSimple.g:603:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalSimple.g:604:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalSimple.g:604:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalSimple.g:612:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:616:1: ( rule__ShapeConstraint__Group__2__Impl )
            // InternalSimple.g:617:2: rule__ShapeConstraint__Group__2__Impl
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
    // InternalSimple.g:623:1: rule__ShapeConstraint__Group__2__Impl : ( ( rule__ShapeConstraint__Alternatives_2 ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:627:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) )
            // InternalSimple.g:628:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            {
            // InternalSimple.g:628:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalSimple.g:629:2: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalSimple.g:630:2: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalSimple.g:630:3: rule__ShapeConstraint__Alternatives_2
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
    // InternalSimple.g:639:1: rule__ShapeConstraint__Group_2_0__0 : rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 ;
    public final void rule__ShapeConstraint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:643:1: ( rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 )
            // InternalSimple.g:644:2: rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1
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
    // InternalSimple.g:651:1: rule__ShapeConstraint__Group_2_0__0__Impl : ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) ) ;
    public final void rule__ShapeConstraint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:655:1: ( ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) ) )
            // InternalSimple.g:656:1: ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) )
            {
            // InternalSimple.g:656:1: ( ( rule__ShapeConstraint__TargetsAssignment_2_0_0 ) )
            // InternalSimple.g:657:2: ( rule__ShapeConstraint__TargetsAssignment_2_0_0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0_0()); 
            // InternalSimple.g:658:2: ( rule__ShapeConstraint__TargetsAssignment_2_0_0 )
            // InternalSimple.g:658:3: rule__ShapeConstraint__TargetsAssignment_2_0_0
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
    // InternalSimple.g:666:1: rule__ShapeConstraint__Group_2_0__1 : rule__ShapeConstraint__Group_2_0__1__Impl ;
    public final void rule__ShapeConstraint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:670:1: ( rule__ShapeConstraint__Group_2_0__1__Impl )
            // InternalSimple.g:671:2: rule__ShapeConstraint__Group_2_0__1__Impl
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
    // InternalSimple.g:677:1: rule__ShapeConstraint__Group_2_0__1__Impl : ( '?' ) ;
    public final void rule__ShapeConstraint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:681:1: ( ( '?' ) )
            // InternalSimple.g:682:1: ( '?' )
            {
            // InternalSimple.g:682:1: ( '?' )
            // InternalSimple.g:683:2: '?'
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
    // InternalSimple.g:693:1: rule__ShapeConstraint__Group_2_1__0 : rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1 ;
    public final void rule__ShapeConstraint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:697:1: ( rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1 )
            // InternalSimple.g:698:2: rule__ShapeConstraint__Group_2_1__0__Impl rule__ShapeConstraint__Group_2_1__1
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
    // InternalSimple.g:705:1: rule__ShapeConstraint__Group_2_1__0__Impl : ( ':-' ) ;
    public final void rule__ShapeConstraint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:709:1: ( ( ':-' ) )
            // InternalSimple.g:710:1: ( ':-' )
            {
            // InternalSimple.g:710:1: ( ':-' )
            // InternalSimple.g:711:2: ':-'
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
    // InternalSimple.g:720:1: rule__ShapeConstraint__Group_2_1__1 : rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2 ;
    public final void rule__ShapeConstraint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:724:1: ( rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2 )
            // InternalSimple.g:725:2: rule__ShapeConstraint__Group_2_1__1__Impl rule__ShapeConstraint__Group_2_1__2
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
    // InternalSimple.g:732:1: rule__ShapeConstraint__Group_2_1__1__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) ) ;
    public final void rule__ShapeConstraint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:736:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) ) )
            // InternalSimple.g:737:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) )
            {
            // InternalSimple.g:737:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 ) )
            // InternalSimple.g:738:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1_1()); 
            // InternalSimple.g:739:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 )
            // InternalSimple.g:739:3: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1
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
    // InternalSimple.g:747:1: rule__ShapeConstraint__Group_2_1__2 : rule__ShapeConstraint__Group_2_1__2__Impl ;
    public final void rule__ShapeConstraint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:751:1: ( rule__ShapeConstraint__Group_2_1__2__Impl )
            // InternalSimple.g:752:2: rule__ShapeConstraint__Group_2_1__2__Impl
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
    // InternalSimple.g:758:1: rule__ShapeConstraint__Group_2_1__2__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:762:1: ( ( ';' ) )
            // InternalSimple.g:763:1: ( ';' )
            {
            // InternalSimple.g:763:1: ( ';' )
            // InternalSimple.g:764:2: ';'
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
    // InternalSimple.g:774:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:778:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalSimple.g:779:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalSimple.g:786:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:790:1: ( ( () ) )
            // InternalSimple.g:791:1: ( () )
            {
            // InternalSimple.g:791:1: ( () )
            // InternalSimple.g:792:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalSimple.g:793:2: ()
            // InternalSimple.g:793:3: 
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
    // InternalSimple.g:801:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:805:1: ( rule__ShapeName__Group__1__Impl )
            // InternalSimple.g:806:2: rule__ShapeName__Group__1__Impl
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
    // InternalSimple.g:812:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:816:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalSimple.g:817:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalSimple.g:817:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalSimple.g:818:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalSimple.g:819:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalSimple.g:819:3: rule__ShapeName__NameAssignment_1
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
    // InternalSimple.g:828:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:832:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalSimple.g:833:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
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
    // InternalSimple.g:840:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:844:1: ( ( () ) )
            // InternalSimple.g:845:1: ( () )
            {
            // InternalSimple.g:845:1: ( () )
            // InternalSimple.g:846:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalSimple.g:847:2: ()
            // InternalSimple.g:847:3: 
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
    // InternalSimple.g:855:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:859:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalSimple.g:860:2: rule__ShapeExpression__Group_0__1__Impl
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
    // InternalSimple.g:866:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:870:1: ( ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) ) )
            // InternalSimple.g:871:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) )
            {
            // InternalSimple.g:871:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) )
            // InternalSimple.g:872:2: ( rule__ShapeExpression__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_0_1()); 
            // InternalSimple.g:873:2: ( rule__ShapeExpression__ValuesAssignment_0_1 )
            // InternalSimple.g:873:3: rule__ShapeExpression__ValuesAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_0_1()); 

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


    // $ANTLR start "rule__ShapeExpression__Group_1__0"
    // InternalSimple.g:882:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:886:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalSimple.g:887:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimple.g:894:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:898:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) )
            // InternalSimple.g:899:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            {
            // InternalSimple.g:899:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            // InternalSimple.g:900:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0()); 
            // InternalSimple.g:901:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            // InternalSimple.g:901:3: rule__ShapeExpression__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0()); 

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
    // InternalSimple.g:909:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:913:1: ( rule__ShapeExpression__Group_1__1__Impl )
            // InternalSimple.g:914:2: rule__ShapeExpression__Group_1__1__Impl
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
    // InternalSimple.g:920:1: rule__ShapeExpression__Group_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:924:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* ) )
            // InternalSimple.g:925:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* )
            {
            // InternalSimple.g:925:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* )
            // InternalSimple.g:926:2: ( rule__ShapeExpression__ValuesAssignment_1_1 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1()); 
            // InternalSimple.g:927:2: ( rule__ShapeExpression__ValuesAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_UNICODE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimple.g:927:3: rule__ShapeExpression__ValuesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapeExpression__ValuesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1()); 

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


    // $ANTLR start "rule__ShapeExpression__Group_2__0"
    // InternalSimple.g:936:1: rule__ShapeExpression__Group_2__0 : rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1 ;
    public final void rule__ShapeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:940:1: ( rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1 )
            // InternalSimple.g:941:2: rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ShapeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_2__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_2__0"


    // $ANTLR start "rule__ShapeExpression__Group_2__0__Impl"
    // InternalSimple.g:948:1: rule__ShapeExpression__Group_2__0__Impl : ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) ) ;
    public final void rule__ShapeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:952:1: ( ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) ) )
            // InternalSimple.g:953:1: ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) )
            {
            // InternalSimple.g:953:1: ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) )
            // InternalSimple.g:954:2: ( rule__ShapeExpression__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_0()); 
            // InternalSimple.g:955:2: ( rule__ShapeExpression__ValuesAssignment_2_0 )
            // InternalSimple.g:955:3: rule__ShapeExpression__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_2__1"
    // InternalSimple.g:963:1: rule__ShapeExpression__Group_2__1 : rule__ShapeExpression__Group_2__1__Impl ;
    public final void rule__ShapeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:967:1: ( rule__ShapeExpression__Group_2__1__Impl )
            // InternalSimple.g:968:2: rule__ShapeExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_2__1"


    // $ANTLR start "rule__ShapeExpression__Group_2__1__Impl"
    // InternalSimple.g:974:1: rule__ShapeExpression__Group_2__1__Impl : ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) ) ;
    public final void rule__ShapeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:978:1: ( ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) ) )
            // InternalSimple.g:979:1: ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) )
            {
            // InternalSimple.g:979:1: ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) )
            // InternalSimple.g:980:2: ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* )
            {
            // InternalSimple.g:980:2: ( ( rule__ShapeExpression__Group_2_1__0 ) )
            // InternalSimple.g:981:3: ( rule__ShapeExpression__Group_2_1__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 
            // InternalSimple.g:982:3: ( rule__ShapeExpression__Group_2_1__0 )
            // InternalSimple.g:982:4: rule__ShapeExpression__Group_2_1__0
            {
            pushFollow(FOLLOW_12);
            rule__ShapeExpression__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 

            }

            // InternalSimple.g:985:2: ( ( rule__ShapeExpression__Group_2_1__0 )* )
            // InternalSimple.g:986:3: ( rule__ShapeExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 
            // InternalSimple.g:987:3: ( rule__ShapeExpression__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimple.g:987:4: rule__ShapeExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ShapeExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_2_1__0"
    // InternalSimple.g:997:1: rule__ShapeExpression__Group_2_1__0 : rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1 ;
    public final void rule__ShapeExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1001:1: ( rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1 )
            // InternalSimple.g:1002:2: rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_2_1__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_2_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_2_1__0__Impl"
    // InternalSimple.g:1009:1: rule__ShapeExpression__Group_2_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1013:1: ( ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) ) )
            // InternalSimple.g:1014:1: ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) )
            {
            // InternalSimple.g:1014:1: ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) )
            // InternalSimple.g:1015:2: ( rule__ShapeExpression__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_2_1_0()); 
            // InternalSimple.g:1016:2: ( rule__ShapeExpression__TypeAssignment_2_1_0 )
            // InternalSimple.g:1016:3: rule__ShapeExpression__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_2_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_2_1__1"
    // InternalSimple.g:1024:1: rule__ShapeExpression__Group_2_1__1 : rule__ShapeExpression__Group_2_1__1__Impl ;
    public final void rule__ShapeExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1028:1: ( rule__ShapeExpression__Group_2_1__1__Impl )
            // InternalSimple.g:1029:2: rule__ShapeExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_2_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_2_1__1__Impl"
    // InternalSimple.g:1035:1: rule__ShapeExpression__Group_2_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__ShapeExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1039:1: ( ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) ) )
            // InternalSimple.g:1040:1: ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) )
            {
            // InternalSimple.g:1040:1: ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) )
            // InternalSimple.g:1041:2: ( rule__ShapeExpression__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_1_1()); 
            // InternalSimple.g:1042:2: ( rule__ShapeExpression__ValuesAssignment_2_1_1 )
            // InternalSimple.g:1042:3: rule__ShapeExpression__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalSimple.g:1051:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1055:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSimple.g:1056:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalSimple.g:1063:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1067:1: ( ( () ) )
            // InternalSimple.g:1068:1: ( () )
            {
            // InternalSimple.g:1068:1: ( () )
            // InternalSimple.g:1069:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSimple.g:1070:2: ()
            // InternalSimple.g:1070:3: 
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
    // InternalSimple.g:1078:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1082:1: ( rule__Value__Group__1__Impl )
            // InternalSimple.g:1083:2: rule__Value__Group__1__Impl
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
    // InternalSimple.g:1089:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1093:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalSimple.g:1094:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalSimple.g:1094:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalSimple.g:1095:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalSimple.g:1096:2: ( rule__Value__NameAssignment_1 )
            // InternalSimple.g:1096:3: rule__Value__NameAssignment_1
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
    // InternalSimple.g:1105:1: rule__Graph__ShapesGraphAssignment_1 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1109:1: ( ( ruleShapesGraph ) )
            // InternalSimple.g:1110:2: ( ruleShapesGraph )
            {
            // InternalSimple.g:1110:2: ( ruleShapesGraph )
            // InternalSimple.g:1111:3: ruleShapesGraph
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
    // InternalSimple.g:1120:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1124:1: ( ( ruleShapeConstraint ) )
            // InternalSimple.g:1125:2: ( ruleShapeConstraint )
            {
            // InternalSimple.g:1125:2: ( ruleShapeConstraint )
            // InternalSimple.g:1126:3: ruleShapeConstraint
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
    // InternalSimple.g:1135:1: rule__Target__TermAssignment_2 : ( RULE_UNICODE ) ;
    public final void rule__Target__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1139:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1140:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1140:2: ( RULE_UNICODE )
            // InternalSimple.g:1141:3: RULE_UNICODE
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
    // InternalSimple.g:1150:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1154:1: ( ( ruleShapeName ) )
            // InternalSimple.g:1155:2: ( ruleShapeName )
            {
            // InternalSimple.g:1155:2: ( ruleShapeName )
            // InternalSimple.g:1156:3: ruleShapeName
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
    // InternalSimple.g:1165:1: rule__ShapeConstraint__TargetsAssignment_2_0_0 : ( ruleTarget ) ;
    public final void rule__ShapeConstraint__TargetsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1169:1: ( ( ruleTarget ) )
            // InternalSimple.g:1170:2: ( ruleTarget )
            {
            // InternalSimple.g:1170:2: ( ruleTarget )
            // InternalSimple.g:1171:3: ruleTarget
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
    // InternalSimple.g:1180:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1184:1: ( ( ruleShapeExpression ) )
            // InternalSimple.g:1185:2: ( ruleShapeExpression )
            {
            // InternalSimple.g:1185:2: ( ruleShapeExpression )
            // InternalSimple.g:1186:3: ruleShapeExpression
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
    // InternalSimple.g:1195:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1199:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1200:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1200:2: ( RULE_UNICODE )
            // InternalSimple.g:1201:3: RULE_UNICODE
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


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_0_1"
    // InternalSimple.g:1210:1: rule__ShapeExpression__ValuesAssignment_0_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1214:1: ( ( ruleValue ) )
            // InternalSimple.g:1215:2: ( ruleValue )
            {
            // InternalSimple.g:1215:2: ( ruleValue )
            // InternalSimple.g:1216:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_0_1"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_0"
    // InternalSimple.g:1225:1: rule__ShapeExpression__TypeAssignment_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1229:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1230:2: ( rulePropertyType )
            {
            // InternalSimple.g:1230:2: ( rulePropertyType )
            // InternalSimple.g:1231:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_1"
    // InternalSimple.g:1240:1: rule__ShapeExpression__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1244:1: ( ( ruleValue ) )
            // InternalSimple.g:1245:2: ( ruleValue )
            {
            // InternalSimple.g:1245:2: ( ruleValue )
            // InternalSimple.g:1246:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_1"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_2_0"
    // InternalSimple.g:1255:1: rule__ShapeExpression__ValuesAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1259:1: ( ( ruleValue ) )
            // InternalSimple.g:1260:2: ( ruleValue )
            {
            // InternalSimple.g:1260:2: ( ruleValue )
            // InternalSimple.g:1261:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_2_0"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_2_1_0"
    // InternalSimple.g:1270:1: rule__ShapeExpression__TypeAssignment_2_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1274:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1275:2: ( rulePropertyType )
            {
            // InternalSimple.g:1275:2: ( rulePropertyType )
            // InternalSimple.g:1276:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_2_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_2_1_1"
    // InternalSimple.g:1285:1: rule__ShapeExpression__ValuesAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1289:1: ( ( ruleValue ) )
            // InternalSimple.g:1290:2: ( ruleValue )
            {
            // InternalSimple.g:1290:2: ( ruleValue )
            // InternalSimple.g:1291:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalSimple.g:1300:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1304:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1305:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1305:2: ( RULE_UNICODE )
            // InternalSimple.g:1306:3: RULE_UNICODE
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000007F002L});

}