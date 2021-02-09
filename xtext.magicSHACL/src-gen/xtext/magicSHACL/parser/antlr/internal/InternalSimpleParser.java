package xtext.magicSHACL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.magicSHACL.services.SimpleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':-'", "';'", "'ADom'", "'T'", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'"
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

        public InternalSimpleParser(TokenStream input, SimpleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Graph";
       	}

       	@Override
       	protected SimpleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraph"
    // InternalSimple.g:65:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalSimple.g:65:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalSimple.g:66:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalSimple.g:72:1: ruleGraph returns [EObject current=null] : ( () ( (lv_shapesGraph_1_0= ruleShapesGraph ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapesGraph_1_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:78:2: ( ( () ( (lv_shapesGraph_1_0= ruleShapesGraph ) ) ) )
            // InternalSimple.g:79:2: ( () ( (lv_shapesGraph_1_0= ruleShapesGraph ) ) )
            {
            // InternalSimple.g:79:2: ( () ( (lv_shapesGraph_1_0= ruleShapesGraph ) ) )
            // InternalSimple.g:80:3: () ( (lv_shapesGraph_1_0= ruleShapesGraph ) )
            {
            // InternalSimple.g:80:3: ()
            // InternalSimple.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAccess().getGraphAction_0(),
            					current);
            			

            }

            // InternalSimple.g:87:3: ( (lv_shapesGraph_1_0= ruleShapesGraph ) )
            // InternalSimple.g:88:4: (lv_shapesGraph_1_0= ruleShapesGraph )
            {
            // InternalSimple.g:88:4: (lv_shapesGraph_1_0= ruleShapesGraph )
            // InternalSimple.g:89:5: lv_shapesGraph_1_0= ruleShapesGraph
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_shapesGraph_1_0=ruleShapesGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"shapesGraph",
            						lv_shapesGraph_1_0,
            						"xtext.magicSHACL.Simple.ShapesGraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalSimple.g:110:1: entryRuleShapesGraph returns [EObject current=null] : iv_ruleShapesGraph= ruleShapesGraph EOF ;
    public final EObject entryRuleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapesGraph = null;


        try {
            // InternalSimple.g:110:52: (iv_ruleShapesGraph= ruleShapesGraph EOF )
            // InternalSimple.g:111:2: iv_ruleShapesGraph= ruleShapesGraph EOF
            {
             newCompositeNode(grammarAccess.getShapesGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapesGraph=ruleShapesGraph();

            state._fsp--;

             current =iv_ruleShapesGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapesGraph"


    // $ANTLR start "ruleShapesGraph"
    // InternalSimple.g:117:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeConstraints_1_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:123:2: ( ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) )
            // InternalSimple.g:124:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            {
            // InternalSimple.g:124:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            // InternalSimple.g:125:3: () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            {
            // InternalSimple.g:125:3: ()
            // InternalSimple.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalSimple.g:132:3: ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_UNICODE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimple.g:133:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    {
            	    // InternalSimple.g:133:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    // InternalSimple.g:134:5: lv_shapeConstraints_1_0= ruleShapeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_shapeConstraints_1_0=ruleShapeConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapeConstraints",
            	    						lv_shapeConstraints_1_0,
            	    						"xtext.magicSHACL.Simple.ShapeConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapesGraph"


    // $ANTLR start "entryRuleShapeConstraint"
    // InternalSimple.g:155:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalSimple.g:155:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalSimple.g:156:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
            {
             newCompositeNode(grammarAccess.getShapeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeConstraint=ruleShapeConstraint();

            state._fsp--;

             current =iv_ruleShapeConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeConstraint"


    // $ANTLR start "ruleShapeConstraint"
    // InternalSimple.g:162:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_shapeExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:168:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) )
            // InternalSimple.g:169:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            {
            // InternalSimple.g:169:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            // InternalSimple.g:170:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';'
            {
            // InternalSimple.g:170:3: ()
            // InternalSimple.g:171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalSimple.g:177:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalSimple.g:178:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalSimple.g:178:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalSimple.g:179:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_shapeName_1_0=ruleShapeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            					}
            					set(
            						current,
            						"shapeName",
            						lv_shapeName_1_0,
            						"xtext.magicSHACL.Simple.ShapeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSimple.g:200:3: ( (lv_shapeExpressions_3_0= ruleShapeExpression ) )
            // InternalSimple.g:201:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            {
            // InternalSimple.g:201:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            // InternalSimple.g:202:5: lv_shapeExpressions_3_0= ruleShapeExpression
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_shapeExpressions_3_0=ruleShapeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            					}
            					add(
            						current,
            						"shapeExpressions",
            						lv_shapeExpressions_3_0,
            						"xtext.magicSHACL.Simple.ShapeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeConstraint"


    // $ANTLR start "entryRuleShapeName"
    // InternalSimple.g:227:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalSimple.g:227:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalSimple.g:228:2: iv_ruleShapeName= ruleShapeName EOF
            {
             newCompositeNode(grammarAccess.getShapeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeName=ruleShapeName();

            state._fsp--;

             current =iv_ruleShapeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeName"


    // $ANTLR start "ruleShapeName"
    // InternalSimple.g:234:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:240:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:241:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:241:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:242:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:242:3: ()
            // InternalSimple.g:243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalSimple.g:249:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:250:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:250:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:251:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getShapeNameAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Simple.UNICODE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeName"


    // $ANTLR start "entryRuleShapeExpression"
    // InternalSimple.g:271:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalSimple.g:271:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalSimple.g:272:2: iv_ruleShapeExpression= ruleShapeExpression EOF
            {
             newCompositeNode(grammarAccess.getShapeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeExpression=ruleShapeExpression();

            state._fsp--;

             current =iv_ruleShapeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeExpression"


    // $ANTLR start "ruleShapeExpression"
    // InternalSimple.g:278:1: ruleShapeExpression returns [EObject current=null] : ( () ( (lv_propertyValues_1_0= rulePropertyValues ) )* ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyValues_1_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:284:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) )* ) )
            // InternalSimple.g:285:2: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) )* )
            {
            // InternalSimple.g:285:2: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) )* )
            // InternalSimple.g:286:3: () ( (lv_propertyValues_1_0= rulePropertyValues ) )*
            {
            // InternalSimple.g:286:3: ()
            // InternalSimple.g:287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0(),
            					current);
            			

            }

            // InternalSimple.g:293:3: ( (lv_propertyValues_1_0= rulePropertyValues ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_UNICODE||(LA2_0>=16 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimple.g:294:4: (lv_propertyValues_1_0= rulePropertyValues )
            	    {
            	    // InternalSimple.g:294:4: (lv_propertyValues_1_0= rulePropertyValues )
            	    // InternalSimple.g:295:5: lv_propertyValues_1_0= rulePropertyValues
            	    {

            	    					newCompositeNode(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_propertyValues_1_0=rulePropertyValues();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"propertyValues",
            	    						lv_propertyValues_1_0,
            	    						"xtext.magicSHACL.Simple.PropertyValues");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeExpression"


    // $ANTLR start "entryRulePropertyValues"
    // InternalSimple.g:316:1: entryRulePropertyValues returns [EObject current=null] : iv_rulePropertyValues= rulePropertyValues EOF ;
    public final EObject entryRulePropertyValues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValues = null;


        try {
            // InternalSimple.g:316:55: (iv_rulePropertyValues= rulePropertyValues EOF )
            // InternalSimple.g:317:2: iv_rulePropertyValues= rulePropertyValues EOF
            {
             newCompositeNode(grammarAccess.getPropertyValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValues=rulePropertyValues();

            state._fsp--;

             current =iv_rulePropertyValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValues"


    // $ANTLR start "rulePropertyValues"
    // InternalSimple.g:323:1: rulePropertyValues returns [EObject current=null] : ( () ( (lv_values_1_0= ruleValue ) )? ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) )* (otherlv_4= 'ADom' | otherlv_5= 'T' )? ) ;
    public final EObject rulePropertyValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_values_1_0 = null;

        EObject lv_property_2_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:329:2: ( ( () ( (lv_values_1_0= ruleValue ) )? ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) )* (otherlv_4= 'ADom' | otherlv_5= 'T' )? ) )
            // InternalSimple.g:330:2: ( () ( (lv_values_1_0= ruleValue ) )? ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) )* (otherlv_4= 'ADom' | otherlv_5= 'T' )? )
            {
            // InternalSimple.g:330:2: ( () ( (lv_values_1_0= ruleValue ) )? ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) )* (otherlv_4= 'ADom' | otherlv_5= 'T' )? )
            // InternalSimple.g:331:3: () ( (lv_values_1_0= ruleValue ) )? ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) )* (otherlv_4= 'ADom' | otherlv_5= 'T' )?
            {
            // InternalSimple.g:331:3: ()
            // InternalSimple.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0(),
            					current);
            			

            }

            // InternalSimple.g:338:3: ( (lv_values_1_0= ruleValue ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_UNICODE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimple.g:339:4: (lv_values_1_0= ruleValue )
                    {
                    // InternalSimple.g:339:4: (lv_values_1_0= ruleValue )
                    // InternalSimple.g:340:5: lv_values_1_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_values_1_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
                    					}
                    					add(
                    						current,
                    						"values",
                    						lv_values_1_0,
                    						"xtext.magicSHACL.Simple.Value");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimple.g:357:3: ( (lv_property_2_0= ruleProperty ) )
            // InternalSimple.g:358:4: (lv_property_2_0= ruleProperty )
            {
            // InternalSimple.g:358:4: (lv_property_2_0= ruleProperty )
            // InternalSimple.g:359:5: lv_property_2_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_property_2_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_2_0,
            						"xtext.magicSHACL.Simple.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimple.g:376:3: ( (lv_values_3_0= ruleValue ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimple.g:377:4: (lv_values_3_0= ruleValue )
            	    {
            	    // InternalSimple.g:377:4: (lv_values_3_0= ruleValue )
            	    // InternalSimple.g:378:5: lv_values_3_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"xtext.magicSHACL.Simple.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSimple.g:395:3: (otherlv_4= 'ADom' | otherlv_5= 'T' )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimple.g:396:4: otherlv_4= 'ADom'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyValuesAccess().getADomKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSimple.g:401:4: otherlv_5= 'T'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyValuesAccess().getTKeyword_4_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValues"


    // $ANTLR start "entryRuleProperty"
    // InternalSimple.g:410:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSimple.g:410:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSimple.g:411:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSimple.g:417:1: ruleProperty returns [EObject current=null] : ( () ( (lv_type_1_0= rulePropertyType ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:423:2: ( ( () ( (lv_type_1_0= rulePropertyType ) ) ) )
            // InternalSimple.g:424:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            {
            // InternalSimple.g:424:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            // InternalSimple.g:425:3: () ( (lv_type_1_0= rulePropertyType ) )
            {
            // InternalSimple.g:425:3: ()
            // InternalSimple.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalSimple.g:432:3: ( (lv_type_1_0= rulePropertyType ) )
            // InternalSimple.g:433:4: (lv_type_1_0= rulePropertyType )
            {
            // InternalSimple.g:433:4: (lv_type_1_0= rulePropertyType )
            // InternalSimple.g:434:5: lv_type_1_0= rulePropertyType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=rulePropertyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"xtext.magicSHACL.Simple.PropertyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValue"
    // InternalSimple.g:455:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSimple.g:455:46: (iv_ruleValue= ruleValue EOF )
            // InternalSimple.g:456:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSimple.g:462:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:468:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:469:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:469:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:470:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:470:3: ()
            // InternalSimple.g:471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalSimple.g:477:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:478:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:478:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:479:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Simple.UNICODE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rulePropertyType"
    // InternalSimple.g:499:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSimple.g:505:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) )
            // InternalSimple.g:506:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            {
            // InternalSimple.g:506:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimple.g:507:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalSimple.g:507:3: (enumLiteral_0= 'MIN' )
                    // InternalSimple.g:508:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:515:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalSimple.g:515:3: (enumLiteral_1= 'MAX' )
                    // InternalSimple.g:516:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:523:3: (enumLiteral_2= 'AND' )
                    {
                    // InternalSimple.g:523:3: (enumLiteral_2= 'AND' )
                    // InternalSimple.g:524:4: enumLiteral_2= 'AND'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:531:3: (enumLiteral_3= 'OR' )
                    {
                    // InternalSimple.g:531:3: (enumLiteral_3= 'OR' )
                    // InternalSimple.g:532:4: enumLiteral_3= 'OR'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:539:3: (enumLiteral_4= 'NOT' )
                    {
                    // InternalSimple.g:539:3: (enumLiteral_4= 'NOT' )
                    // InternalSimple.g:540:4: enumLiteral_4= 'NOT'
                    {
                    enumLiteral_4=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:547:3: (enumLiteral_5= 'SOME ' )
                    {
                    // InternalSimple.g:547:3: (enumLiteral_5= 'SOME ' )
                    // InternalSimple.g:548:4: enumLiteral_5= 'SOME '
                    {
                    enumLiteral_5=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:555:3: (enumLiteral_6= 'SOME ^' )
                    {
                    // InternalSimple.g:555:3: (enumLiteral_6= 'SOME ^' )
                    // InternalSimple.g:556:4: enumLiteral_6= 'SOME ^'
                    {
                    enumLiteral_6=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007F2010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007F0012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007F0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C012L});

}