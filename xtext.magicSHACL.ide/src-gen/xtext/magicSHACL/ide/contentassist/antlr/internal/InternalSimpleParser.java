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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ADom'", "'T'", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'", "':-'", "';'"
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


    // $ANTLR start "entryRuleShapeConstraint"
    // InternalSimple.g:103:1: entryRuleShapeConstraint : ruleShapeConstraint EOF ;
    public final void entryRuleShapeConstraint() throws RecognitionException {
        try {
            // InternalSimple.g:104:1: ( ruleShapeConstraint EOF )
            // InternalSimple.g:105:1: ruleShapeConstraint EOF
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
    // InternalSimple.g:112:1: ruleShapeConstraint : ( ( rule__ShapeConstraint__Group__0 ) ) ;
    public final void ruleShapeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:116:2: ( ( ( rule__ShapeConstraint__Group__0 ) ) )
            // InternalSimple.g:117:2: ( ( rule__ShapeConstraint__Group__0 ) )
            {
            // InternalSimple.g:117:2: ( ( rule__ShapeConstraint__Group__0 ) )
            // InternalSimple.g:118:3: ( rule__ShapeConstraint__Group__0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getGroup()); 
            // InternalSimple.g:119:3: ( rule__ShapeConstraint__Group__0 )
            // InternalSimple.g:119:4: rule__ShapeConstraint__Group__0
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
    // InternalSimple.g:128:1: entryRuleShapeName : ruleShapeName EOF ;
    public final void entryRuleShapeName() throws RecognitionException {
        try {
            // InternalSimple.g:129:1: ( ruleShapeName EOF )
            // InternalSimple.g:130:1: ruleShapeName EOF
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
    // InternalSimple.g:137:1: ruleShapeName : ( ( rule__ShapeName__Group__0 ) ) ;
    public final void ruleShapeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:141:2: ( ( ( rule__ShapeName__Group__0 ) ) )
            // InternalSimple.g:142:2: ( ( rule__ShapeName__Group__0 ) )
            {
            // InternalSimple.g:142:2: ( ( rule__ShapeName__Group__0 ) )
            // InternalSimple.g:143:3: ( rule__ShapeName__Group__0 )
            {
             before(grammarAccess.getShapeNameAccess().getGroup()); 
            // InternalSimple.g:144:3: ( rule__ShapeName__Group__0 )
            // InternalSimple.g:144:4: rule__ShapeName__Group__0
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
    // InternalSimple.g:153:1: entryRuleShapeExpression : ruleShapeExpression EOF ;
    public final void entryRuleShapeExpression() throws RecognitionException {
        try {
            // InternalSimple.g:154:1: ( ruleShapeExpression EOF )
            // InternalSimple.g:155:1: ruleShapeExpression EOF
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
    // InternalSimple.g:162:1: ruleShapeExpression : ( ( rule__ShapeExpression__Group__0 ) ) ;
    public final void ruleShapeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:166:2: ( ( ( rule__ShapeExpression__Group__0 ) ) )
            // InternalSimple.g:167:2: ( ( rule__ShapeExpression__Group__0 ) )
            {
            // InternalSimple.g:167:2: ( ( rule__ShapeExpression__Group__0 ) )
            // InternalSimple.g:168:3: ( rule__ShapeExpression__Group__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup()); 
            // InternalSimple.g:169:3: ( rule__ShapeExpression__Group__0 )
            // InternalSimple.g:169:4: rule__ShapeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup()); 

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
    // InternalSimple.g:178:1: entryRulePropertyValues : rulePropertyValues EOF ;
    public final void entryRulePropertyValues() throws RecognitionException {
        try {
            // InternalSimple.g:179:1: ( rulePropertyValues EOF )
            // InternalSimple.g:180:1: rulePropertyValues EOF
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
    // InternalSimple.g:187:1: rulePropertyValues : ( ( rule__PropertyValues__Group__0 ) ) ;
    public final void rulePropertyValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:191:2: ( ( ( rule__PropertyValues__Group__0 ) ) )
            // InternalSimple.g:192:2: ( ( rule__PropertyValues__Group__0 ) )
            {
            // InternalSimple.g:192:2: ( ( rule__PropertyValues__Group__0 ) )
            // InternalSimple.g:193:3: ( rule__PropertyValues__Group__0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getGroup()); 
            // InternalSimple.g:194:3: ( rule__PropertyValues__Group__0 )
            // InternalSimple.g:194:4: rule__PropertyValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getGroup()); 

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
    // InternalSimple.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSimple.g:204:1: ( ruleProperty EOF )
            // InternalSimple.g:205:1: ruleProperty EOF
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
    // InternalSimple.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalSimple.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalSimple.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalSimple.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalSimple.g:219:3: ( rule__Property__Group__0 )
            // InternalSimple.g:219:4: rule__Property__Group__0
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
    // InternalSimple.g:228:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSimple.g:229:1: ( ruleValue EOF )
            // InternalSimple.g:230:1: ruleValue EOF
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
    // InternalSimple.g:237:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:241:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSimple.g:242:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSimple.g:242:2: ( ( rule__Value__Group__0 ) )
            // InternalSimple.g:243:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSimple.g:244:3: ( rule__Value__Group__0 )
            // InternalSimple.g:244:4: rule__Value__Group__0
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
    // InternalSimple.g:253:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:257:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalSimple.g:258:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalSimple.g:258:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalSimple.g:259:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalSimple.g:260:3: ( rule__PropertyType__Alternatives )
            // InternalSimple.g:260:4: rule__PropertyType__Alternatives
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


    // $ANTLR start "rule__PropertyValues__Alternatives_4"
    // InternalSimple.g:268:1: rule__PropertyValues__Alternatives_4 : ( ( 'ADom' ) | ( 'T' ) );
    public final void rule__PropertyValues__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:272:1: ( ( 'ADom' ) | ( 'T' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimple.g:273:2: ( 'ADom' )
                    {
                    // InternalSimple.g:273:2: ( 'ADom' )
                    // InternalSimple.g:274:3: 'ADom'
                    {
                     before(grammarAccess.getPropertyValuesAccess().getADomKeyword_4_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPropertyValuesAccess().getADomKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:279:2: ( 'T' )
                    {
                    // InternalSimple.g:279:2: ( 'T' )
                    // InternalSimple.g:280:3: 'T'
                    {
                     before(grammarAccess.getPropertyValuesAccess().getTKeyword_4_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyValuesAccess().getTKeyword_4_1()); 

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
    // $ANTLR end "rule__PropertyValues__Alternatives_4"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalSimple.g:289:1: rule__PropertyType__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:293:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) | ( ( 'SOME ' ) ) | ( ( 'SOME ^' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
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
                    // InternalSimple.g:294:2: ( ( 'MIN' ) )
                    {
                    // InternalSimple.g:294:2: ( ( 'MIN' ) )
                    // InternalSimple.g:295:3: ( 'MIN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalSimple.g:296:3: ( 'MIN' )
                    // InternalSimple.g:296:4: 'MIN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:300:2: ( ( 'MAX' ) )
                    {
                    // InternalSimple.g:300:2: ( ( 'MAX' ) )
                    // InternalSimple.g:301:3: ( 'MAX' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalSimple.g:302:3: ( 'MAX' )
                    // InternalSimple.g:302:4: 'MAX'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:306:2: ( ( 'AND' ) )
                    {
                    // InternalSimple.g:306:2: ( ( 'AND' ) )
                    // InternalSimple.g:307:3: ( 'AND' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalSimple.g:308:3: ( 'AND' )
                    // InternalSimple.g:308:4: 'AND'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:312:2: ( ( 'OR' ) )
                    {
                    // InternalSimple.g:312:2: ( ( 'OR' ) )
                    // InternalSimple.g:313:3: ( 'OR' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalSimple.g:314:3: ( 'OR' )
                    // InternalSimple.g:314:4: 'OR'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:318:2: ( ( 'NOT' ) )
                    {
                    // InternalSimple.g:318:2: ( ( 'NOT' ) )
                    // InternalSimple.g:319:3: ( 'NOT' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalSimple.g:320:3: ( 'NOT' )
                    // InternalSimple.g:320:4: 'NOT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:324:2: ( ( 'SOME ' ) )
                    {
                    // InternalSimple.g:324:2: ( ( 'SOME ' ) )
                    // InternalSimple.g:325:3: ( 'SOME ' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 
                    // InternalSimple.g:326:3: ( 'SOME ' )
                    // InternalSimple.g:326:4: 'SOME '
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:330:2: ( ( 'SOME ^' ) )
                    {
                    // InternalSimple.g:330:2: ( ( 'SOME ^' ) )
                    // InternalSimple.g:331:3: ( 'SOME ^' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6()); 
                    // InternalSimple.g:332:3: ( 'SOME ^' )
                    // InternalSimple.g:332:4: 'SOME ^'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalSimple.g:340:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:344:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalSimple.g:345:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalSimple.g:352:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:356:1: ( ( () ) )
            // InternalSimple.g:357:1: ( () )
            {
            // InternalSimple.g:357:1: ( () )
            // InternalSimple.g:358:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalSimple.g:359:2: ()
            // InternalSimple.g:359:3: 
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
    // InternalSimple.g:367:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:371:1: ( rule__Graph__Group__1__Impl )
            // InternalSimple.g:372:2: rule__Graph__Group__1__Impl
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
    // InternalSimple.g:378:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ShapesGraphAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:382:1: ( ( ( rule__Graph__ShapesGraphAssignment_1 ) ) )
            // InternalSimple.g:383:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            {
            // InternalSimple.g:383:1: ( ( rule__Graph__ShapesGraphAssignment_1 ) )
            // InternalSimple.g:384:2: ( rule__Graph__ShapesGraphAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_1()); 
            // InternalSimple.g:385:2: ( rule__Graph__ShapesGraphAssignment_1 )
            // InternalSimple.g:385:3: rule__Graph__ShapesGraphAssignment_1
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
    // InternalSimple.g:394:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:398:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalSimple.g:399:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalSimple.g:406:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:410:1: ( ( () ) )
            // InternalSimple.g:411:1: ( () )
            {
            // InternalSimple.g:411:1: ( () )
            // InternalSimple.g:412:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalSimple.g:413:2: ()
            // InternalSimple.g:413:3: 
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
    // InternalSimple.g:421:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:425:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalSimple.g:426:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalSimple.g:432:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:436:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalSimple.g:437:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalSimple.g:437:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalSimple.g:438:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalSimple.g:439:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_UNICODE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimple.g:439:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "rule__ShapeConstraint__Group__0"
    // InternalSimple.g:448:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:452:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalSimple.g:453:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalSimple.g:460:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:464:1: ( ( () ) )
            // InternalSimple.g:465:1: ( () )
            {
            // InternalSimple.g:465:1: ( () )
            // InternalSimple.g:466:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalSimple.g:467:2: ()
            // InternalSimple.g:467:3: 
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
    // InternalSimple.g:475:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:479:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalSimple.g:480:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimple.g:487:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:491:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalSimple.g:492:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalSimple.g:492:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalSimple.g:493:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalSimple.g:494:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalSimple.g:494:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalSimple.g:502:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:506:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalSimple.g:507:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimple.g:514:1: rule__ShapeConstraint__Group__2__Impl : ( ':-' ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:518:1: ( ( ':-' ) )
            // InternalSimple.g:519:1: ( ':-' )
            {
            // InternalSimple.g:519:1: ( ':-' )
            // InternalSimple.g:520:2: ':-'
            {
             before(grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSimple.g:529:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:533:1: ( rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 )
            // InternalSimple.g:534:2: rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimple.g:541:1: rule__ShapeConstraint__Group__3__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:545:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) ) )
            // InternalSimple.g:546:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            {
            // InternalSimple.g:546:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 ) )
            // InternalSimple.g:547:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 
            // InternalSimple.g:548:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )
            // InternalSimple.g:548:3: rule__ShapeConstraint__ShapeExpressionsAssignment_3
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
    // InternalSimple.g:556:1: rule__ShapeConstraint__Group__4 : rule__ShapeConstraint__Group__4__Impl ;
    public final void rule__ShapeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:560:1: ( rule__ShapeConstraint__Group__4__Impl )
            // InternalSimple.g:561:2: rule__ShapeConstraint__Group__4__Impl
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
    // InternalSimple.g:567:1: rule__ShapeConstraint__Group__4__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:571:1: ( ( ';' ) )
            // InternalSimple.g:572:1: ( ';' )
            {
            // InternalSimple.g:572:1: ( ';' )
            // InternalSimple.g:573:2: ';'
            {
             before(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSimple.g:583:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:587:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalSimple.g:588:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalSimple.g:595:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:599:1: ( ( () ) )
            // InternalSimple.g:600:1: ( () )
            {
            // InternalSimple.g:600:1: ( () )
            // InternalSimple.g:601:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalSimple.g:602:2: ()
            // InternalSimple.g:602:3: 
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
    // InternalSimple.g:610:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:614:1: ( rule__ShapeName__Group__1__Impl )
            // InternalSimple.g:615:2: rule__ShapeName__Group__1__Impl
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
    // InternalSimple.g:621:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:625:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalSimple.g:626:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalSimple.g:626:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalSimple.g:627:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalSimple.g:628:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalSimple.g:628:3: rule__ShapeName__NameAssignment_1
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


    // $ANTLR start "rule__ShapeExpression__Group__0"
    // InternalSimple.g:637:1: rule__ShapeExpression__Group__0 : rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 ;
    public final void rule__ShapeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:641:1: ( rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 )
            // InternalSimple.g:642:2: rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group__1();

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
    // $ANTLR end "rule__ShapeExpression__Group__0"


    // $ANTLR start "rule__ShapeExpression__Group__0__Impl"
    // InternalSimple.g:649:1: rule__ShapeExpression__Group__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:653:1: ( ( () ) )
            // InternalSimple.g:654:1: ( () )
            {
            // InternalSimple.g:654:1: ( () )
            // InternalSimple.g:655:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0()); 
            // InternalSimple.g:656:2: ()
            // InternalSimple.g:656:3: 
            {
            }

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group__1"
    // InternalSimple.g:664:1: rule__ShapeExpression__Group__1 : rule__ShapeExpression__Group__1__Impl ;
    public final void rule__ShapeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:668:1: ( rule__ShapeExpression__Group__1__Impl )
            // InternalSimple.g:669:2: rule__ShapeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group__1"


    // $ANTLR start "rule__ShapeExpression__Group__1__Impl"
    // InternalSimple.g:675:1: rule__ShapeExpression__Group__1__Impl : ( ( rule__ShapeExpression__PropertyValuesAssignment_1 )* ) ;
    public final void rule__ShapeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:679:1: ( ( ( rule__ShapeExpression__PropertyValuesAssignment_1 )* ) )
            // InternalSimple.g:680:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1 )* )
            {
            // InternalSimple.g:680:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1 )* )
            // InternalSimple.g:681:2: ( rule__ShapeExpression__PropertyValuesAssignment_1 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1()); 
            // InternalSimple.g:682:2: ( rule__ShapeExpression__PropertyValuesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE||(LA4_0>=14 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:682:3: rule__ShapeExpression__PropertyValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ShapeExpression__PropertyValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group__0"
    // InternalSimple.g:691:1: rule__PropertyValues__Group__0 : rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 ;
    public final void rule__PropertyValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:695:1: ( rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 )
            // InternalSimple.g:696:2: rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PropertyValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__1();

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
    // $ANTLR end "rule__PropertyValues__Group__0"


    // $ANTLR start "rule__PropertyValues__Group__0__Impl"
    // InternalSimple.g:703:1: rule__PropertyValues__Group__0__Impl : ( () ) ;
    public final void rule__PropertyValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:707:1: ( ( () ) )
            // InternalSimple.g:708:1: ( () )
            {
            // InternalSimple.g:708:1: ( () )
            // InternalSimple.g:709:2: ()
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0()); 
            // InternalSimple.g:710:2: ()
            // InternalSimple.g:710:3: 
            {
            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group__1"
    // InternalSimple.g:718:1: rule__PropertyValues__Group__1 : rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 ;
    public final void rule__PropertyValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:722:1: ( rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 )
            // InternalSimple.g:723:2: rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PropertyValues__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__2();

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
    // $ANTLR end "rule__PropertyValues__Group__1"


    // $ANTLR start "rule__PropertyValues__Group__1__Impl"
    // InternalSimple.g:730:1: rule__PropertyValues__Group__1__Impl : ( ( rule__PropertyValues__ValuesAssignment_1 )? ) ;
    public final void rule__PropertyValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:734:1: ( ( ( rule__PropertyValues__ValuesAssignment_1 )? ) )
            // InternalSimple.g:735:1: ( ( rule__PropertyValues__ValuesAssignment_1 )? )
            {
            // InternalSimple.g:735:1: ( ( rule__PropertyValues__ValuesAssignment_1 )? )
            // InternalSimple.g:736:2: ( rule__PropertyValues__ValuesAssignment_1 )?
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1()); 
            // InternalSimple.g:737:2: ( rule__PropertyValues__ValuesAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_UNICODE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimple.g:737:3: rule__PropertyValues__ValuesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValues__ValuesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__PropertyValues__Group__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group__2"
    // InternalSimple.g:745:1: rule__PropertyValues__Group__2 : rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 ;
    public final void rule__PropertyValues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:749:1: ( rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 )
            // InternalSimple.g:750:2: rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyValues__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__3();

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
    // $ANTLR end "rule__PropertyValues__Group__2"


    // $ANTLR start "rule__PropertyValues__Group__2__Impl"
    // InternalSimple.g:757:1: rule__PropertyValues__Group__2__Impl : ( ( rule__PropertyValues__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyValues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:761:1: ( ( ( rule__PropertyValues__PropertyAssignment_2 ) ) )
            // InternalSimple.g:762:1: ( ( rule__PropertyValues__PropertyAssignment_2 ) )
            {
            // InternalSimple.g:762:1: ( ( rule__PropertyValues__PropertyAssignment_2 ) )
            // InternalSimple.g:763:2: ( rule__PropertyValues__PropertyAssignment_2 )
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_2()); 
            // InternalSimple.g:764:2: ( rule__PropertyValues__PropertyAssignment_2 )
            // InternalSimple.g:764:3: rule__PropertyValues__PropertyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_2()); 

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
    // $ANTLR end "rule__PropertyValues__Group__2__Impl"


    // $ANTLR start "rule__PropertyValues__Group__3"
    // InternalSimple.g:772:1: rule__PropertyValues__Group__3 : rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 ;
    public final void rule__PropertyValues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:776:1: ( rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 )
            // InternalSimple.g:777:2: rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PropertyValues__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__4();

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
    // $ANTLR end "rule__PropertyValues__Group__3"


    // $ANTLR start "rule__PropertyValues__Group__3__Impl"
    // InternalSimple.g:784:1: rule__PropertyValues__Group__3__Impl : ( ( rule__PropertyValues__ValuesAssignment_3 )* ) ;
    public final void rule__PropertyValues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:788:1: ( ( ( rule__PropertyValues__ValuesAssignment_3 )* ) )
            // InternalSimple.g:789:1: ( ( rule__PropertyValues__ValuesAssignment_3 )* )
            {
            // InternalSimple.g:789:1: ( ( rule__PropertyValues__ValuesAssignment_3 )* )
            // InternalSimple.g:790:2: ( rule__PropertyValues__ValuesAssignment_3 )*
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_3()); 
            // InternalSimple.g:791:2: ( rule__PropertyValues__ValuesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_UNICODE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimple.g:791:3: rule__PropertyValues__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PropertyValues__ValuesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__PropertyValues__Group__3__Impl"


    // $ANTLR start "rule__PropertyValues__Group__4"
    // InternalSimple.g:799:1: rule__PropertyValues__Group__4 : rule__PropertyValues__Group__4__Impl ;
    public final void rule__PropertyValues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:803:1: ( rule__PropertyValues__Group__4__Impl )
            // InternalSimple.g:804:2: rule__PropertyValues__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__4__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group__4"


    // $ANTLR start "rule__PropertyValues__Group__4__Impl"
    // InternalSimple.g:810:1: rule__PropertyValues__Group__4__Impl : ( ( rule__PropertyValues__Alternatives_4 )? ) ;
    public final void rule__PropertyValues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:814:1: ( ( ( rule__PropertyValues__Alternatives_4 )? ) )
            // InternalSimple.g:815:1: ( ( rule__PropertyValues__Alternatives_4 )? )
            {
            // InternalSimple.g:815:1: ( ( rule__PropertyValues__Alternatives_4 )? )
            // InternalSimple.g:816:2: ( rule__PropertyValues__Alternatives_4 )?
            {
             before(grammarAccess.getPropertyValuesAccess().getAlternatives_4()); 
            // InternalSimple.g:817:2: ( rule__PropertyValues__Alternatives_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimple.g:817:3: rule__PropertyValues__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValues__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyValuesAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__PropertyValues__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalSimple.g:826:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:830:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalSimple.g:831:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimple.g:838:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:842:1: ( ( () ) )
            // InternalSimple.g:843:1: ( () )
            {
            // InternalSimple.g:843:1: ( () )
            // InternalSimple.g:844:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalSimple.g:845:2: ()
            // InternalSimple.g:845:3: 
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
    // InternalSimple.g:853:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:857:1: ( rule__Property__Group__1__Impl )
            // InternalSimple.g:858:2: rule__Property__Group__1__Impl
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
    // InternalSimple.g:864:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:868:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // InternalSimple.g:869:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // InternalSimple.g:869:1: ( ( rule__Property__TypeAssignment_1 ) )
            // InternalSimple.g:870:2: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // InternalSimple.g:871:2: ( rule__Property__TypeAssignment_1 )
            // InternalSimple.g:871:3: rule__Property__TypeAssignment_1
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
    // InternalSimple.g:880:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:884:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSimple.g:885:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalSimple.g:892:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:896:1: ( ( () ) )
            // InternalSimple.g:897:1: ( () )
            {
            // InternalSimple.g:897:1: ( () )
            // InternalSimple.g:898:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSimple.g:899:2: ()
            // InternalSimple.g:899:3: 
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
    // InternalSimple.g:907:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:911:1: ( rule__Value__Group__1__Impl )
            // InternalSimple.g:912:2: rule__Value__Group__1__Impl
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
    // InternalSimple.g:918:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:922:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalSimple.g:923:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalSimple.g:923:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalSimple.g:924:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalSimple.g:925:2: ( rule__Value__NameAssignment_1 )
            // InternalSimple.g:925:3: rule__Value__NameAssignment_1
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
    // InternalSimple.g:934:1: rule__Graph__ShapesGraphAssignment_1 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:938:1: ( ( ruleShapesGraph ) )
            // InternalSimple.g:939:2: ( ruleShapesGraph )
            {
            // InternalSimple.g:939:2: ( ruleShapesGraph )
            // InternalSimple.g:940:3: ruleShapesGraph
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
    // InternalSimple.g:949:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:953:1: ( ( ruleShapeConstraint ) )
            // InternalSimple.g:954:2: ( ruleShapeConstraint )
            {
            // InternalSimple.g:954:2: ( ruleShapeConstraint )
            // InternalSimple.g:955:3: ruleShapeConstraint
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


    // $ANTLR start "rule__ShapeConstraint__ShapeNameAssignment_1"
    // InternalSimple.g:964:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:968:1: ( ( ruleShapeName ) )
            // InternalSimple.g:969:2: ( ruleShapeName )
            {
            // InternalSimple.g:969:2: ( ruleShapeName )
            // InternalSimple.g:970:3: ruleShapeName
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
    // InternalSimple.g:979:1: rule__ShapeConstraint__ShapeExpressionsAssignment_3 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:983:1: ( ( ruleShapeExpression ) )
            // InternalSimple.g:984:2: ( ruleShapeExpression )
            {
            // InternalSimple.g:984:2: ( ruleShapeExpression )
            // InternalSimple.g:985:3: ruleShapeExpression
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
    // InternalSimple.g:994:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:998:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:999:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:999:2: ( RULE_UNICODE )
            // InternalSimple.g:1000:3: RULE_UNICODE
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


    // $ANTLR start "rule__ShapeExpression__PropertyValuesAssignment_1"
    // InternalSimple.g:1009:1: rule__ShapeExpression__PropertyValuesAssignment_1 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1013:1: ( ( rulePropertyValues ) )
            // InternalSimple.g:1014:2: ( rulePropertyValues )
            {
            // InternalSimple.g:1014:2: ( rulePropertyValues )
            // InternalSimple.g:1015:3: rulePropertyValues
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


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_1"
    // InternalSimple.g:1024:1: rule__PropertyValues__ValuesAssignment_1 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1028:1: ( ( ruleValue ) )
            // InternalSimple.g:1029:2: ( ruleValue )
            {
            // InternalSimple.g:1029:2: ( ruleValue )
            // InternalSimple.g:1030:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_1"


    // $ANTLR start "rule__PropertyValues__PropertyAssignment_2"
    // InternalSimple.g:1039:1: rule__PropertyValues__PropertyAssignment_2 : ( ruleProperty ) ;
    public final void rule__PropertyValues__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1043:1: ( ( ruleProperty ) )
            // InternalSimple.g:1044:2: ( ruleProperty )
            {
            // InternalSimple.g:1044:2: ( ruleProperty )
            // InternalSimple.g:1045:3: ruleProperty
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PropertyValues__PropertyAssignment_2"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_3"
    // InternalSimple.g:1054:1: rule__PropertyValues__ValuesAssignment_3 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1058:1: ( ( ruleValue ) )
            // InternalSimple.g:1059:2: ( ruleValue )
            {
            // InternalSimple.g:1059:2: ( ruleValue )
            // InternalSimple.g:1060:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_3"


    // $ANTLR start "rule__Property__TypeAssignment_1"
    // InternalSimple.g:1069:1: rule__Property__TypeAssignment_1 : ( rulePropertyType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1073:1: ( ( rulePropertyType ) )
            // InternalSimple.g:1074:2: ( rulePropertyType )
            {
            // InternalSimple.g:1074:2: ( rulePropertyType )
            // InternalSimple.g:1075:3: rulePropertyType
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
    // InternalSimple.g:1084:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimple.g:1088:1: ( ( RULE_UNICODE ) )
            // InternalSimple.g:1089:2: ( RULE_UNICODE )
            {
            // InternalSimple.g:1089:2: ( RULE_UNICODE )
            // InternalSimple.g:1090:3: RULE_UNICODE
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FC010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001FC012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003010L});

}