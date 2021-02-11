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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'?'", "':-'", "';'", "'AND'", "'MIN'", "'MAX'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'"
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
    // InternalSimple.g:117:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_targets_1_0= ruleTarget ) )* ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_targets_1_0 = null;

        EObject lv_shapeConstraints_2_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:123:2: ( ( () ( (lv_targets_1_0= ruleTarget ) )* ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )* ) )
            // InternalSimple.g:124:2: ( () ( (lv_targets_1_0= ruleTarget ) )* ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )* )
            {
            // InternalSimple.g:124:2: ( () ( (lv_targets_1_0= ruleTarget ) )* ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )* )
            // InternalSimple.g:125:3: () ( (lv_targets_1_0= ruleTarget ) )* ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )*
            {
            // InternalSimple.g:125:3: ()
            // InternalSimple.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalSimple.g:132:3: ( (lv_targets_1_0= ruleTarget ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_UNICODE) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==12) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimple.g:133:4: (lv_targets_1_0= ruleTarget )
            	    {
            	    // InternalSimple.g:133:4: (lv_targets_1_0= ruleTarget )
            	    // InternalSimple.g:134:5: lv_targets_1_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getTargetsTargetParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_targets_1_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_1_0,
            	    						"xtext.magicSHACL.Simple.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSimple.g:151:3: ( (lv_shapeConstraints_2_0= ruleShapeConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_UNICODE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimple.g:152:4: (lv_shapeConstraints_2_0= ruleShapeConstraint )
            	    {
            	    // InternalSimple.g:152:4: (lv_shapeConstraints_2_0= ruleShapeConstraint )
            	    // InternalSimple.g:153:5: lv_shapeConstraints_2_0= ruleShapeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_shapeConstraints_2_0=ruleShapeConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapeConstraints",
            	    						lv_shapeConstraints_2_0,
            	    						"xtext.magicSHACL.Simple.ShapeConstraint");
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
    // $ANTLR end "ruleShapesGraph"


    // $ANTLR start "entryRuleTarget"
    // InternalSimple.g:174:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalSimple.g:174:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalSimple.g:175:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalSimple.g:181:1: ruleTarget returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' otherlv_5= '?' ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_term_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSimple.g:187:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' otherlv_5= '?' ) )
            // InternalSimple.g:188:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' otherlv_5= '?' )
            {
            // InternalSimple.g:188:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' otherlv_5= '?' )
            // InternalSimple.g:189:3: () ( (lv_name_1_0= RULE_UNICODE ) ) otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' otherlv_5= '?'
            {
            // InternalSimple.g:189:3: ()
            // InternalSimple.g:190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetAccess().getTargetAction_0(),
            					current);
            			

            }

            // InternalSimple.g:196:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:197:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:197:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:198:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTargetAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Simple.UNICODE");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimple.g:218:3: ( (lv_term_3_0= RULE_UNICODE ) )
            // InternalSimple.g:219:4: (lv_term_3_0= RULE_UNICODE )
            {
            // InternalSimple.g:219:4: (lv_term_3_0= RULE_UNICODE )
            // InternalSimple.g:220:5: lv_term_3_0= RULE_UNICODE
            {
            lv_term_3_0=(Token)match(input,RULE_UNICODE,FOLLOW_6); 

            					newLeafNode(lv_term_3_0, grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"term",
            						lv_term_3_0,
            						"xtext.magicSHACL.Simple.UNICODE");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTargetAccess().getQuestionMarkKeyword_5());
            		

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleShapeConstraint"
    // InternalSimple.g:248:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalSimple.g:248:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalSimple.g:249:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalSimple.g:255:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_shapeExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:261:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) )
            // InternalSimple.g:262:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            {
            // InternalSimple.g:262:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            // InternalSimple.g:263:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';'
            {
            // InternalSimple.g:263:3: ()
            // InternalSimple.g:264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalSimple.g:270:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalSimple.g:271:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalSimple.g:271:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalSimple.g:272:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeConstraintAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSimple.g:293:3: ( (lv_shapeExpressions_3_0= ruleShapeExpression ) )
            // InternalSimple.g:294:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            {
            // InternalSimple.g:294:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            // InternalSimple.g:295:5: lv_shapeExpressions_3_0= ruleShapeExpression
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSimple.g:320:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalSimple.g:320:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalSimple.g:321:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalSimple.g:327:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:333:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:334:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:334:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:335:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:335:3: ()
            // InternalSimple.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalSimple.g:342:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:343:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:343:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:344:5: lv_name_1_0= RULE_UNICODE
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
    // InternalSimple.g:364:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalSimple.g:364:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalSimple.g:365:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalSimple.g:371:1: ruleShapeExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_UNICODE ) ) ) | ( (lv_propertyValues_2_0= rulePropertyValues ) ) ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_propertyValues_2_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:377:2: ( ( ( () ( (lv_value_1_0= RULE_UNICODE ) ) ) | ( (lv_propertyValues_2_0= rulePropertyValues ) ) ) )
            // InternalSimple.g:378:2: ( ( () ( (lv_value_1_0= RULE_UNICODE ) ) ) | ( (lv_propertyValues_2_0= rulePropertyValues ) ) )
            {
            // InternalSimple.g:378:2: ( ( () ( (lv_value_1_0= RULE_UNICODE ) ) ) | ( (lv_propertyValues_2_0= rulePropertyValues ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_UNICODE) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=17 && LA3_1<=23)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==16) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=17 && LA3_0<=23)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimple.g:379:3: ( () ( (lv_value_1_0= RULE_UNICODE ) ) )
                    {
                    // InternalSimple.g:379:3: ( () ( (lv_value_1_0= RULE_UNICODE ) ) )
                    // InternalSimple.g:380:4: () ( (lv_value_1_0= RULE_UNICODE ) )
                    {
                    // InternalSimple.g:380:4: ()
                    // InternalSimple.g:381:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSimple.g:387:4: ( (lv_value_1_0= RULE_UNICODE ) )
                    // InternalSimple.g:388:5: (lv_value_1_0= RULE_UNICODE )
                    {
                    // InternalSimple.g:388:5: (lv_value_1_0= RULE_UNICODE )
                    // InternalSimple.g:389:6: lv_value_1_0= RULE_UNICODE
                    {
                    lv_value_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getShapeExpressionAccess().getValueUNICODETerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShapeExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"xtext.magicSHACL.Simple.UNICODE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:407:3: ( (lv_propertyValues_2_0= rulePropertyValues ) )
                    {
                    // InternalSimple.g:407:3: ( (lv_propertyValues_2_0= rulePropertyValues ) )
                    // InternalSimple.g:408:4: (lv_propertyValues_2_0= rulePropertyValues )
                    {
                    // InternalSimple.g:408:4: (lv_propertyValues_2_0= rulePropertyValues )
                    // InternalSimple.g:409:5: lv_propertyValues_2_0= rulePropertyValues
                    {

                    					newCompositeNode(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyValues_2_0=rulePropertyValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    					}
                    					add(
                    						current,
                    						"propertyValues",
                    						lv_propertyValues_2_0,
                    						"xtext.magicSHACL.Simple.PropertyValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleShapeExpression"


    // $ANTLR start "entryRulePropertyValues"
    // InternalSimple.g:430:1: entryRulePropertyValues returns [EObject current=null] : iv_rulePropertyValues= rulePropertyValues EOF ;
    public final EObject entryRulePropertyValues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValues = null;


        try {
            // InternalSimple.g:430:55: (iv_rulePropertyValues= rulePropertyValues EOF )
            // InternalSimple.g:431:2: iv_rulePropertyValues= rulePropertyValues EOF
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
    // InternalSimple.g:437:1: rulePropertyValues returns [EObject current=null] : ( ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) ) | ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ ) ) ;
    public final EObject rulePropertyValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_property_2_0 = null;

        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;

        EObject lv_property_6_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:443:2: ( ( ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) ) | ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ ) ) )
            // InternalSimple.g:444:2: ( ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) ) | ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ ) )
            {
            // InternalSimple.g:444:2: ( ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) ) | ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_UNICODE) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=23)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimple.g:445:3: ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) )
                    {
                    // InternalSimple.g:445:3: ( () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* ) )
                    // InternalSimple.g:446:4: () ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* )
                    {
                    // InternalSimple.g:446:4: ()
                    // InternalSimple.g:447:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPropertyValuesAccess().getPropertyValuesAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSimple.g:453:4: ( ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )* )
                    // InternalSimple.g:454:5: ( (lv_values_1_0= ruleValue ) ) ( (lv_property_2_0= ruleProperty ) ) ( (lv_values_3_0= ruleValue ) ) (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )*
                    {
                    // InternalSimple.g:454:5: ( (lv_values_1_0= ruleValue ) )
                    // InternalSimple.g:455:6: (lv_values_1_0= ruleValue )
                    {
                    // InternalSimple.g:455:6: (lv_values_1_0= ruleValue )
                    // InternalSimple.g:456:7: lv_values_1_0= ruleValue
                    {

                    							newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_9);
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

                    // InternalSimple.g:473:5: ( (lv_property_2_0= ruleProperty ) )
                    // InternalSimple.g:474:6: (lv_property_2_0= ruleProperty )
                    {
                    // InternalSimple.g:474:6: (lv_property_2_0= ruleProperty )
                    // InternalSimple.g:475:7: lv_property_2_0= ruleProperty
                    {

                    							newCompositeNode(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_5);
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

                    // InternalSimple.g:492:5: ( (lv_values_3_0= ruleValue ) )
                    // InternalSimple.g:493:6: (lv_values_3_0= ruleValue )
                    {
                    // InternalSimple.g:493:6: (lv_values_3_0= ruleValue )
                    // InternalSimple.g:494:7: lv_values_3_0= ruleValue
                    {

                    							newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_11);
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

                    // InternalSimple.g:511:5: (otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimple.g:512:6: otherlv_4= 'AND' ( (lv_values_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_5); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getPropertyValuesAccess().getANDKeyword_0_1_3_0());
                    	    					
                    	    // InternalSimple.g:516:6: ( (lv_values_5_0= ruleValue ) )
                    	    // InternalSimple.g:517:7: (lv_values_5_0= ruleValue )
                    	    {
                    	    // InternalSimple.g:517:7: (lv_values_5_0= ruleValue )
                    	    // InternalSimple.g:518:8: lv_values_5_0= ruleValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_0_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_11);
                    	    lv_values_5_0=ruleValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"values",
                    	    									lv_values_5_0,
                    	    									"xtext.magicSHACL.Simple.Value");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:539:3: ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ )
                    {
                    // InternalSimple.g:539:3: ( ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+ )
                    // InternalSimple.g:540:4: ( (lv_property_6_0= ruleProperty ) ) ( (lv_values_7_0= ruleValue ) )+
                    {
                    // InternalSimple.g:540:4: ( (lv_property_6_0= ruleProperty ) )
                    // InternalSimple.g:541:5: (lv_property_6_0= ruleProperty )
                    {
                    // InternalSimple.g:541:5: (lv_property_6_0= ruleProperty )
                    // InternalSimple.g:542:6: lv_property_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_property_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
                    						}
                    						set(
                    							current,
                    							"property",
                    							lv_property_6_0,
                    							"xtext.magicSHACL.Simple.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimple.g:559:4: ( (lv_values_7_0= ruleValue ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_UNICODE) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimple.g:560:5: (lv_values_7_0= ruleValue )
                    	    {
                    	    // InternalSimple.g:560:5: (lv_values_7_0= ruleValue )
                    	    // InternalSimple.g:561:6: lv_values_7_0= ruleValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_values_7_0=ruleValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_7_0,
                    	    							"xtext.magicSHACL.Simple.Value");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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
    // $ANTLR end "rulePropertyValues"


    // $ANTLR start "entryRuleProperty"
    // InternalSimple.g:583:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSimple.g:583:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSimple.g:584:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSimple.g:590:1: ruleProperty returns [EObject current=null] : ( () ( (lv_type_1_0= rulePropertyType ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:596:2: ( ( () ( (lv_type_1_0= rulePropertyType ) ) ) )
            // InternalSimple.g:597:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            {
            // InternalSimple.g:597:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            // InternalSimple.g:598:3: () ( (lv_type_1_0= rulePropertyType ) )
            {
            // InternalSimple.g:598:3: ()
            // InternalSimple.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalSimple.g:605:3: ( (lv_type_1_0= rulePropertyType ) )
            // InternalSimple.g:606:4: (lv_type_1_0= rulePropertyType )
            {
            // InternalSimple.g:606:4: (lv_type_1_0= rulePropertyType )
            // InternalSimple.g:607:5: lv_type_1_0= rulePropertyType
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
    // InternalSimple.g:628:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSimple.g:628:46: (iv_ruleValue= ruleValue EOF )
            // InternalSimple.g:629:2: iv_ruleValue= ruleValue EOF
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
    // InternalSimple.g:635:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:641:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:642:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:642:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:643:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:643:3: ()
            // InternalSimple.g:644:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalSimple.g:650:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:651:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:651:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:652:5: lv_name_1_0= RULE_UNICODE
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
    // InternalSimple.g:672:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) ;
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
            // InternalSimple.g:678:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) )
            // InternalSimple.g:679:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            {
            // InternalSimple.g:679:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSimple.g:680:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalSimple.g:680:3: (enumLiteral_0= 'MIN' )
                    // InternalSimple.g:681:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:688:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalSimple.g:688:3: (enumLiteral_1= 'MAX' )
                    // InternalSimple.g:689:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:696:3: (enumLiteral_2= 'AND' )
                    {
                    // InternalSimple.g:696:3: (enumLiteral_2= 'AND' )
                    // InternalSimple.g:697:4: enumLiteral_2= 'AND'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:704:3: (enumLiteral_3= 'OR' )
                    {
                    // InternalSimple.g:704:3: (enumLiteral_3= 'OR' )
                    // InternalSimple.g:705:4: enumLiteral_3= 'OR'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:712:3: (enumLiteral_4= 'NOT' )
                    {
                    // InternalSimple.g:712:3: (enumLiteral_4= 'NOT' )
                    // InternalSimple.g:713:4: enumLiteral_4= 'NOT'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:720:3: (enumLiteral_5= 'SOME ' )
                    {
                    // InternalSimple.g:720:3: (enumLiteral_5= 'SOME ' )
                    // InternalSimple.g:721:4: enumLiteral_5= 'SOME '
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:728:3: (enumLiteral_6= 'SOME ^' )
                    {
                    // InternalSimple.g:728:3: (enumLiteral_6= 'SOME ^' )
                    // InternalSimple.g:729:4: enumLiteral_6= 'SOME ^'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FE0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}