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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'", "'?'", "'('", "')'", "':-'", "';'"
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


    // $ANTLR start "rule__ShapeExpression__Alternatives"
    // InternalSimple.g:243:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) | ( ( rule__ShapeExpression__Group_2__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:247:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) | ( ( rule__ShapeExpression__Group_2__0 ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_UNICODE) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==23) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=12 && LA1_1<=18)) ) {
                    alt1=3;
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
                    // InternalSimple.g:248:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalSimple.g:248:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalSimple.g:249:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalSimple.g:250:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalSimple.g:250:4: rule__ShapeExpression__Group_0__0
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
                    // InternalSimple.g:254:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    {
                    // InternalSimple.g:254:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    // InternalSimple.g:255:3: ( rule__ShapeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1()); 
                    // InternalSimple.g:256:3: ( rule__ShapeExpression__Group_1__0 )
                    // InternalSimple.g:256:4: rule__ShapeExpression__Group_1__0
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
                    // InternalSimple.g:260:2: ( ( rule__ShapeExpression__Group_2__0 ) )
                    {
                    // InternalSimple.g:260:2: ( ( rule__ShapeExpression__Group_2__0 ) )
                    // InternalSimple.g:261:3: ( rule__ShapeExpression__Group_2__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_2()); 
                    // InternalSimple.g:262:3: ( rule__ShapeExpression__Group_2__0 )
                    // InternalSimple.g:262:4: rule__ShapeExpression__Group_2__0
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
    // InternalSimple.g:270:1: rule__PropertyType__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:274:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimple.g:275:2: ( ( 'MIN' ) )
                    {
                    // InternalSimple.g:275:2: ( ( 'MIN' ) )
                    // InternalSimple.g:276:3: ( 'MIN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalSimple.g:277:3: ( 'MIN' )
                    // InternalSimple.g:277:4: 'MIN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:281:2: ( ( 'MAX' ) )
                    {
                    // InternalSimple.g:281:2: ( ( 'MAX' ) )
                    // InternalSimple.g:282:3: ( 'MAX' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalSimple.g:283:3: ( 'MAX' )
                    // InternalSimple.g:283:4: 'MAX'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:287:2: ( ( 'AND' ) )
                    {
                    // InternalSimple.g:287:2: ( ( 'AND' ) )
                    // InternalSimple.g:288:3: ( 'AND' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalSimple.g:289:3: ( 'AND' )
                    // InternalSimple.g:289:4: 'AND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:293:2: ( ( 'OR' ) )
                    {
                    // InternalSimple.g:293:2: ( ( 'OR' ) )
                    // InternalSimple.g:294:3: ( 'OR' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalSimple.g:295:3: ( 'OR' )
                    // InternalSimple.g:295:4: 'OR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:299:2: ( ( 'NOT' ) )
                    {
                    // InternalSimple.g:299:2: ( ( 'NOT' ) )
                    // InternalSimple.g:300:3: ( 'NOT' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalSimple.g:301:3: ( 'NOT' )
                    // InternalSimple.g:301:4: 'NOT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:305:2: ( ( 'SOME ' ) )
                    {
                    // InternalSimple.g:305:2: ( ( 'SOME ' ) )
                    // InternalSimple.g:306:3: ( 'SOME ' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 
                    // InternalSimple.g:307:3: ( 'SOME ' )
                    // InternalSimple.g:307:4: 'SOME '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:311:2: ( ( 'SOME ^' ) )
                    {
                    // InternalSimple.g:311:2: ( ( 'SOME ^' ) )
                    // InternalSimple.g:312:3: ( 'SOME ^' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 
                    // InternalSimple.g:313:3: ( 'SOME ^' )
                    // InternalSimple.g:313:4: 'SOME ^'
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
    // InternalSimple.g:321:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:325:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalSimple.g:326:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalSimple.g:333:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:337:1: ( ( () ) )
            // InternalSimple.g:338:1: ( () )
            {
            // InternalSimple.g:338:1: ( () )
            // InternalSimple.g:339:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalSimple.g:340:2: ()
            // InternalSimple.g:340:3: 
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
    // InternalSimple.g:348:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:352:1: ( rule__Graph__Group__1__Impl )
            // InternalSimple.g:353:2: rule__Graph__Group__1__Impl
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
    // InternalSimple.g:359:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ShapesGraphAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:363:1: ( ( ( rule__Graph__ShapesGraphAssignment_1 ) ) )
            // InternalSimple.g:364:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            {
            // InternalSimple.g:364:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            // InternalSimple.g:365:2: ( rule__Graph__ShapesGraphAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 
            // InternalSimple.g:366:2: ( rule__Graph__ShapesGraphAssignment_1 )
            // InternalSimple.g:366:3: rule__Graph__ShapesGraphAssignment_1
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
    // InternalSimple.g:375:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:379:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalSimple.g:380:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalSimple.g:387:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:391:1: ( ( () ) )
            // InternalSimple.g:392:1: ( () )
            {
            // InternalSimple.g:392:1: ( () )
            // InternalSimple.g:393:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalSimple.g:394:2: ()
            // InternalSimple.g:394:3: 
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
    // InternalSimple.g:402:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2 ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:406:1: ( rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2 )
            // InternalSimple.g:407:2: rule__ShapesGraph__Group__1__Impl rule__ShapesGraph__Group__2
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
    // InternalSimple.g:414:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__TargetsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:418:1: ( ( ( rule__ShapesGraph__TargetsAssignment_1 )* ) )
            // InternalSimple.g:419:1: ( ( rule__ShapesGraph__TargetsAssignment_1 )* )
            {
            // InternalSimple.g:419:1: ( ( rule__ShapesGraph__TargetsAssignment_1 )* )
            // InternalSimple.g:420:2: ( rule__ShapesGraph__TargetsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getTargetsAssignment_1()); 
            // InternalSimple.g:421:2: ( rule__ShapesGraph__TargetsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_UNICODE) ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>=19 && LA3_1<=20)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimple.g:421:3: rule__ShapesGraph__TargetsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__TargetsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalSimple.g:429:1: rule__ShapesGraph__Group__2 : rule__ShapesGraph__Group__2__Impl ;
    public final void rule__ShapesGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:433:1: ( rule__ShapesGraph__Group__2__Impl )
            // InternalSimple.g:434:2: rule__ShapesGraph__Group__2__Impl
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
    // InternalSimple.g:440:1: rule__ShapesGraph__Group__2__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* ) ;
    public final void rule__ShapesGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:444:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* ) )
            // InternalSimple.g:445:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* )
            {
            // InternalSimple.g:445:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )* )
            // InternalSimple.g:446:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_2()); 
            // InternalSimple.g:447:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:447:3: rule__ShapesGraph__ShapeConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSimple.g:456:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:460:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalSimple.g:461:2: rule__Target__Group__0__Impl rule__Target__Group__1
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
    // InternalSimple.g:468:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:472:1: ( ( () ) )
            // InternalSimple.g:473:1: ( () )
            {
            // InternalSimple.g:473:1: ( () )
            // InternalSimple.g:474:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalSimple.g:475:2: ()
            // InternalSimple.g:475:3: 
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
    // InternalSimple.g:483:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:487:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalSimple.g:488:2: rule__Target__Group__1__Impl rule__Target__Group__2
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
    // InternalSimple.g:495:1: rule__Target__Group__1__Impl : ( ( rule__Target__NameAssignment_1 ) ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:499:1: ( ( ( rule__Target__NameAssignment_1 ) ) )
            // InternalSimple.g:500:1: ( ( rule__Target__NameAssignment_1 ) )
            {
            // InternalSimple.g:500:1: ( ( rule__Target__NameAssignment_1 ) )
            // InternalSimple.g:501:2: ( rule__Target__NameAssignment_1 )
            {
             before(grammarAccess.getTargetAccess().getNameAssignment_1()); 
            // InternalSimple.g:502:2: ( rule__Target__NameAssignment_1 )
            // InternalSimple.g:502:3: rule__Target__NameAssignment_1
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
    // InternalSimple.g:510:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:514:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalSimple.g:515:2: rule__Target__Group__2__Impl rule__Target__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimple.g:522:1: rule__Target__Group__2__Impl : ( ( rule__Target__Group_2__0 )? ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:526:1: ( ( ( rule__Target__Group_2__0 )? ) )
            // InternalSimple.g:527:1: ( ( rule__Target__Group_2__0 )? )
            {
            // InternalSimple.g:527:1: ( ( rule__Target__Group_2__0 )? )
            // InternalSimple.g:528:2: ( rule__Target__Group_2__0 )?
            {
             before(grammarAccess.getTargetAccess().getGroup_2()); 
            // InternalSimple.g:529:2: ( rule__Target__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimple.g:529:3: rule__Target__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetAccess().getGroup_2()); 

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
    // InternalSimple.g:537:1: rule__Target__Group__3 : rule__Target__Group__3__Impl ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:541:1: ( rule__Target__Group__3__Impl )
            // InternalSimple.g:542:2: rule__Target__Group__3__Impl
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
    // InternalSimple.g:548:1: rule__Target__Group__3__Impl : ( '?' ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:552:1: ( ( '?' ) )
            // InternalSimple.g:553:1: ( '?' )
            {
            // InternalSimple.g:553:1: ( '?' )
            // InternalSimple.g:554:2: '?'
            {
             before(grammarAccess.getTargetAccess().getQuestionMarkKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getQuestionMarkKeyword_3()); 

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


    // $ANTLR start "rule__Target__Group_2__0"
    // InternalSimple.g:564:1: rule__Target__Group_2__0 : rule__Target__Group_2__0__Impl rule__Target__Group_2__1 ;
    public final void rule__Target__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:568:1: ( rule__Target__Group_2__0__Impl rule__Target__Group_2__1 )
            // InternalSimple.g:569:2: rule__Target__Group_2__0__Impl rule__Target__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Target__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2__1();

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
    // $ANTLR end "rule__Target__Group_2__0"


    // $ANTLR start "rule__Target__Group_2__0__Impl"
    // InternalSimple.g:576:1: rule__Target__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Target__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:580:1: ( ( '(' ) )
            // InternalSimple.g:581:1: ( '(' )
            {
            // InternalSimple.g:581:1: ( '(' )
            // InternalSimple.g:582:2: '('
            {
             before(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Target__Group_2__0__Impl"


    // $ANTLR start "rule__Target__Group_2__1"
    // InternalSimple.g:591:1: rule__Target__Group_2__1 : rule__Target__Group_2__1__Impl rule__Target__Group_2__2 ;
    public final void rule__Target__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:595:1: ( rule__Target__Group_2__1__Impl rule__Target__Group_2__2 )
            // InternalSimple.g:596:2: rule__Target__Group_2__1__Impl rule__Target__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Target__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2__2();

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
    // $ANTLR end "rule__Target__Group_2__1"


    // $ANTLR start "rule__Target__Group_2__1__Impl"
    // InternalSimple.g:603:1: rule__Target__Group_2__1__Impl : ( ( rule__Target__TermAssignment_2_1 ) ) ;
    public final void rule__Target__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:607:1: ( ( ( rule__Target__TermAssignment_2_1 ) ) )
            // InternalSimple.g:608:1: ( ( rule__Target__TermAssignment_2_1 ) )
            {
            // InternalSimple.g:608:1: ( ( rule__Target__TermAssignment_2_1 ) )
            // InternalSimple.g:609:2: ( rule__Target__TermAssignment_2_1 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_2_1()); 
            // InternalSimple.g:610:2: ( rule__Target__TermAssignment_2_1 )
            // InternalSimple.g:610:3: rule__Target__TermAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__TermAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTermAssignment_2_1()); 

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
    // $ANTLR end "rule__Target__Group_2__1__Impl"


    // $ANTLR start "rule__Target__Group_2__2"
    // InternalSimple.g:618:1: rule__Target__Group_2__2 : rule__Target__Group_2__2__Impl ;
    public final void rule__Target__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:622:1: ( rule__Target__Group_2__2__Impl )
            // InternalSimple.g:623:2: rule__Target__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2__2__Impl();

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
    // $ANTLR end "rule__Target__Group_2__2"


    // $ANTLR start "rule__Target__Group_2__2__Impl"
    // InternalSimple.g:629:1: rule__Target__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Target__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:633:1: ( ( ')' ) )
            // InternalSimple.g:634:1: ( ')' )
            {
            // InternalSimple.g:634:1: ( ')' )
            // InternalSimple.g:635:2: ')'
            {
             before(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Target__Group_2__2__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__0"
    // InternalSimple.g:645:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:649:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalSimple.g:650:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalSimple.g:657:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:661:1: ( ( () ) )
            // InternalSimple.g:662:1: ( () )
            {
            // InternalSimple.g:662:1: ( () )
            // InternalSimple.g:663:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalSimple.g:664:2: ()
            // InternalSimple.g:664:3: 
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
    // InternalSimple.g:672:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:676:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalSimple.g:677:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
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
    // InternalSimple.g:684:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:688:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalSimple.g:689:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalSimple.g:689:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalSimple.g:690:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalSimple.g:691:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalSimple.g:691:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalSimple.g:699:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:703:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalSimple.g:704:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSimple.g:711:1: rule__ShapeConstraint__Group__2__Impl : ( ':-' ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:715:1: ( ( ':-' ) )
            // InternalSimple.g:716:1: ( ':-' )
            {
            // InternalSimple.g:716:1: ( ':-' )
            // InternalSimple.g:717:2: ':-'
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
    // InternalSimple.g:726:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:730:1: ( rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 )
            // InternalSimple.g:731:2: rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimple.g:738:1: rule__ShapeConstraint__Group__3__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:742:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) )
            // InternalSimple.g:743:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            {
            // InternalSimple.g:743:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            // InternalSimple.g:744:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 
            // InternalSimple.g:745:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            // InternalSimple.g:745:3: rule__ShapeConstraint__ShapeExpressionsAssignment_3
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
    // InternalSimple.g:753:1: rule__ShapeConstraint__Group__4 : rule__ShapeConstraint__Group__4__Impl ;
    public final void rule__ShapeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:757:1: ( rule__ShapeConstraint__Group__4__Impl )
            // InternalSimple.g:758:2: rule__ShapeConstraint__Group__4__Impl
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
    // InternalSimple.g:764:1: rule__ShapeConstraint__Group__4__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:768:1: ( ( ';' ) )
            // InternalSimple.g:769:1: ( ';' )
            {
            // InternalSimple.g:769:1: ( ';' )
            // InternalSimple.g:770:2: ';'
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
    // InternalSimple.g:780:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:784:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalSimple.g:785:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalSimple.g:792:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:796:1: ( ( () ) )
            // InternalSimple.g:797:1: ( () )
            {
            // InternalSimple.g:797:1: ( () )
            // InternalSimple.g:798:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalSimple.g:799:2: ()
            // InternalSimple.g:799:3: 
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
    // InternalSimple.g:807:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:811:1: ( rule__ShapeName__Group__1__Impl )
            // InternalSimple.g:812:2: rule__ShapeName__Group__1__Impl
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
    // InternalSimple.g:818:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:822:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalSimple.g:823:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalSimple.g:823:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalSimple.g:824:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalSimple.g:825:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalSimple.g:825:3: rule__ShapeName__NameAssignment_1
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
    // InternalSimple.g:834:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:838:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalSimple.g:839:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
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
    // InternalSimple.g:846:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:850:1: ( ( () ) )
            // InternalSimple.g:851:1: ( () )
            {
            // InternalSimple.g:851:1: ( () )
            // InternalSimple.g:852:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalSimple.g:853:2: ()
            // InternalSimple.g:853:3: 
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
    // InternalSimple.g:861:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:865:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalSimple.g:866:2: rule__ShapeExpression__Group_0__1__Impl
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
    // InternalSimple.g:872:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:876:1: ( ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) ) )
            // InternalSimple.g:877:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) )
            {
            // InternalSimple.g:877:1: ( ( rule__ShapeExpression__ValuesAssignment_0_1 ) )
            // InternalSimple.g:878:2: ( rule__ShapeExpression__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_0_1()); 
            // InternalSimple.g:879:2: ( rule__ShapeExpression__ValuesAssignment_0_1 )
            // InternalSimple.g:879:3: rule__ShapeExpression__ValuesAssignment_0_1
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
    // InternalSimple.g:888:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:892:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalSimple.g:893:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
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
    // InternalSimple.g:900:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:904:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) )
            // InternalSimple.g:905:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            {
            // InternalSimple.g:905:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            // InternalSimple.g:906:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0()); 
            // InternalSimple.g:907:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            // InternalSimple.g:907:3: rule__ShapeExpression__TypeAssignment_1_0
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
    // InternalSimple.g:915:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:919:1: ( rule__ShapeExpression__Group_1__1__Impl )
            // InternalSimple.g:920:2: rule__ShapeExpression__Group_1__1__Impl
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
    // InternalSimple.g:926:1: rule__ShapeExpression__Group_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:930:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* ) )
            // InternalSimple.g:931:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* )
            {
            // InternalSimple.g:931:1: ( ( rule__ShapeExpression__ValuesAssignment_1_1 )* )
            // InternalSimple.g:932:2: ( rule__ShapeExpression__ValuesAssignment_1_1 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1()); 
            // InternalSimple.g:933:2: ( rule__ShapeExpression__ValuesAssignment_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_UNICODE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimple.g:933:3: rule__ShapeExpression__ValuesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapeExpression__ValuesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSimple.g:942:1: rule__ShapeExpression__Group_2__0 : rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1 ;
    public final void rule__ShapeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:946:1: ( rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1 )
            // InternalSimple.g:947:2: rule__ShapeExpression__Group_2__0__Impl rule__ShapeExpression__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimple.g:954:1: rule__ShapeExpression__Group_2__0__Impl : ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) ) ;
    public final void rule__ShapeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:958:1: ( ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) ) )
            // InternalSimple.g:959:1: ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) )
            {
            // InternalSimple.g:959:1: ( ( rule__ShapeExpression__ValuesAssignment_2_0 ) )
            // InternalSimple.g:960:2: ( rule__ShapeExpression__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_0()); 
            // InternalSimple.g:961:2: ( rule__ShapeExpression__ValuesAssignment_2_0 )
            // InternalSimple.g:961:3: rule__ShapeExpression__ValuesAssignment_2_0
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
    // InternalSimple.g:969:1: rule__ShapeExpression__Group_2__1 : rule__ShapeExpression__Group_2__1__Impl ;
    public final void rule__ShapeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:973:1: ( rule__ShapeExpression__Group_2__1__Impl )
            // InternalSimple.g:974:2: rule__ShapeExpression__Group_2__1__Impl
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
    // InternalSimple.g:980:1: rule__ShapeExpression__Group_2__1__Impl : ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) ) ;
    public final void rule__ShapeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:984:1: ( ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) ) )
            // InternalSimple.g:985:1: ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) )
            {
            // InternalSimple.g:985:1: ( ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* ) )
            // InternalSimple.g:986:2: ( ( rule__ShapeExpression__Group_2_1__0 ) ) ( ( rule__ShapeExpression__Group_2_1__0 )* )
            {
            // InternalSimple.g:986:2: ( ( rule__ShapeExpression__Group_2_1__0 ) )
            // InternalSimple.g:987:3: ( rule__ShapeExpression__Group_2_1__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 
            // InternalSimple.g:988:3: ( rule__ShapeExpression__Group_2_1__0 )
            // InternalSimple.g:988:4: rule__ShapeExpression__Group_2_1__0
            {
            pushFollow(FOLLOW_11);
            rule__ShapeExpression__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 

            }

            // InternalSimple.g:991:2: ( ( rule__ShapeExpression__Group_2_1__0 )* )
            // InternalSimple.g:992:3: ( rule__ShapeExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_2_1()); 
            // InternalSimple.g:993:3: ( rule__ShapeExpression__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=12 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimple.g:993:4: rule__ShapeExpression__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ShapeExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSimple.g:1003:1: rule__ShapeExpression__Group_2_1__0 : rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1 ;
    public final void rule__ShapeExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1007:1: ( rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1 )
            // InternalSimple.g:1008:2: rule__ShapeExpression__Group_2_1__0__Impl rule__ShapeExpression__Group_2_1__1
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
    // InternalSimple.g:1015:1: rule__ShapeExpression__Group_2_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1019:1: ( ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) ) )
            // InternalSimple.g:1020:1: ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) )
            {
            // InternalSimple.g:1020:1: ( ( rule__ShapeExpression__TypeAssignment_2_1_0 ) )
            // InternalSimple.g:1021:2: ( rule__ShapeExpression__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_2_1_0()); 
            // InternalSimple.g:1022:2: ( rule__ShapeExpression__TypeAssignment_2_1_0 )
            // InternalSimple.g:1022:3: rule__ShapeExpression__TypeAssignment_2_1_0
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
    // InternalSimple.g:1030:1: rule__ShapeExpression__Group_2_1__1 : rule__ShapeExpression__Group_2_1__1__Impl ;
    public final void rule__ShapeExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1034:1: ( rule__ShapeExpression__Group_2_1__1__Impl )
            // InternalSimple.g:1035:2: rule__ShapeExpression__Group_2_1__1__Impl
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
    // InternalSimple.g:1041:1: rule__ShapeExpression__Group_2_1__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__ShapeExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1045:1: ( ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) ) )
            // InternalSimple.g:1046:1: ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) )
            {
            // InternalSimple.g:1046:1: ( ( rule__ShapeExpression__ValuesAssignment_2_1_1 ) )
            // InternalSimple.g:1047:2: ( rule__ShapeExpression__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_2_1_1()); 
            // InternalSimple.g:1048:2: ( rule__ShapeExpression__ValuesAssignment_2_1_1 )
            // InternalSimple.g:1048:3: rule__ShapeExpression__ValuesAssignment_2_1_1
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
    // InternalSimple.g:1057:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1061:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSimple.g:1062:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalSimple.g:1069:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1073:1: ( ( () ) )
            // InternalSimple.g:1074:1: ( () )
            {
            // InternalSimple.g:1074:1: ( () )
            // InternalSimple.g:1075:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSimple.g:1076:2: ()
            // InternalSimple.g:1076:3: 
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
    // InternalSimple.g:1084:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1088:1: ( rule__Value__Group__1__Impl )
            // InternalSimple.g:1089:2: rule__Value__Group__1__Impl
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
    // InternalSimple.g:1095:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1099:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalSimple.g:1100:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalSimple.g:1100:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalSimple.g:1101:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalSimple.g:1102:2: ( rule__Value__NameAssignment_1 )
            // InternalSimple.g:1102:3: rule__Value__NameAssignment_1
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
    // InternalSimple.g:1111:1: rule__Graph__ShapesGraphAssignment_1 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1115:1: ( ( ruleShapesGraph ) )
            // InternalSimple.g:1116:2: ( ruleShapesGraph )
            {
            // InternalSimple.g:1116:2: ( ruleShapesGraph )
            // InternalSimple.g:1117:3: ruleShapesGraph
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
    // InternalSimple.g:1126:1: rule__ShapesGraph__TargetsAssignment_1 : ( ruleTarget ) ;
    public final void rule__ShapesGraph__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1130:1: ( ( ruleTarget ) )
            // InternalSimple.g:1131:2: ( ruleTarget )
            {
            // InternalSimple.g:1131:2: ( ruleTarget )
            // InternalSimple.g:1132:3: ruleTarget
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
    // InternalSimple.g:1141:1: rule__ShapesGraph__ShapeConstraintsAssignment_2 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1145:1: ( ( ruleShapeConstraint ) )
            // InternalSimple.g:1146:2: ( ruleShapeConstraint )
            {
            // InternalSimple.g:1146:2: ( ruleShapeConstraint )
            // InternalSimple.g:1147:3: ruleShapeConstraint
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
    // InternalSimple.g:1156:1: rule__Target__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Target__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1160:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1161:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1161:2: ( RULE_UNICODE )
            // InternalSimple.g:1162:3: RULE_UNICODE
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


    // $ANTLR start "rule__Target__TermAssignment_2_1"
    // InternalSimple.g:1171:1: rule__Target__TermAssignment_2_1 : ( RULE_UNICODE ) ;
    public final void rule__Target__TermAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1175:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1176:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1176:2: ( RULE_UNICODE )
            // InternalSimple.g:1177:3: RULE_UNICODE
            {
             before(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_2_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Target__TermAssignment_2_1"


    // $ANTLR start "rule__ShapeConstraint__ShapeNameAssignment_1"
    // InternalSimple.g:1186:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1190:1: ( ( ruleShapeName ) )
            // InternalSimple.g:1191:2: ( ruleShapeName )
            {
            // InternalSimple.g:1191:2: ( ruleShapeName )
            // InternalSimple.g:1192:3: ruleShapeName
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
    // InternalSimple.g:1201:1: rule__ShapeConstraint__ShapeExpressionsAssignment_3 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1205:1: ( ( ruleShapeExpression ) )
            // InternalSimple.g:1206:2: ( ruleShapeExpression )
            {
            // InternalSimple.g:1206:2: ( ruleShapeExpression )
            // InternalSimple.g:1207:3: ruleShapeExpression
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
    // InternalSimple.g:1216:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1220:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1221:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1221:2: ( RULE_UNICODE )
            // InternalSimple.g:1222:3: RULE_UNICODE
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
    // InternalSimple.g:1231:1: rule__ShapeExpression__ValuesAssignment_0_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1235:1: ( ( ruleValue ) )
            // InternalSimple.g:1236:2: ( ruleValue )
            {
            // InternalSimple.g:1236:2: ( ruleValue )
            // InternalSimple.g:1237:3: ruleValue
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
    // InternalSimple.g:1246:1: rule__ShapeExpression__TypeAssignment_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1250:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1251:2: ( rulePropertyType )
            {
            // InternalSimple.g:1251:2: ( rulePropertyType )
            // InternalSimple.g:1252:3: rulePropertyType
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
    // InternalSimple.g:1261:1: rule__ShapeExpression__ValuesAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1265:1: ( ( ruleValue ) )
            // InternalSimple.g:1266:2: ( ruleValue )
            {
            // InternalSimple.g:1266:2: ( ruleValue )
            // InternalSimple.g:1267:3: ruleValue
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
    // InternalSimple.g:1276:1: rule__ShapeExpression__ValuesAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1280:1: ( ( ruleValue ) )
            // InternalSimple.g:1281:2: ( ruleValue )
            {
            // InternalSimple.g:1281:2: ( ruleValue )
            // InternalSimple.g:1282:3: ruleValue
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
    // InternalSimple.g:1291:1: rule__ShapeExpression__TypeAssignment_2_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1295:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1296:2: ( rulePropertyType )
            {
            // InternalSimple.g:1296:2: ( rulePropertyType )
            // InternalSimple.g:1297:3: rulePropertyType
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
    // InternalSimple.g:1306:1: rule__ShapeExpression__ValuesAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1310:1: ( ( ruleValue ) )
            // InternalSimple.g:1311:2: ( ruleValue )
            {
            // InternalSimple.g:1311:2: ( ruleValue )
            // InternalSimple.g:1312:3: ruleValue
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
    // InternalSimple.g:1321:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1325:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1326:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1326:2: ( RULE_UNICODE )
            // InternalSimple.g:1327:3: RULE_UNICODE
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007F002L});

}