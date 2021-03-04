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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'?'", "':-'", "';'", "'MIN'", "'MAX'", "'AND'", "'OR'", "'NOT'", "'SOME '", "'SOME ^'"
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

                    if ( (LA1_1==12||LA1_1==14) ) {
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
    // InternalSimple.g:181:1: ruleTarget returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )? otherlv_5= '?' ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_term_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSimple.g:187:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )? otherlv_5= '?' ) )
            // InternalSimple.g:188:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )? otherlv_5= '?' )
            {
            // InternalSimple.g:188:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )? otherlv_5= '?' )
            // InternalSimple.g:189:3: () ( (lv_name_1_0= RULE_UNICODE ) ) (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )? otherlv_5= '?'
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

            // InternalSimple.g:214:3: (otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimple.g:215:4: otherlv_2= '(' ( (lv_term_3_0= RULE_UNICODE ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSimple.g:219:4: ( (lv_term_3_0= RULE_UNICODE ) )
                    // InternalSimple.g:220:5: (lv_term_3_0= RULE_UNICODE )
                    {
                    // InternalSimple.g:220:5: (lv_term_3_0= RULE_UNICODE )
                    // InternalSimple.g:221:6: lv_term_3_0= RULE_UNICODE
                    {
                    lv_term_3_0=(Token)match(input,RULE_UNICODE,FOLLOW_6); 

                    						newLeafNode(lv_term_3_0, grammarAccess.getTargetAccess().getTermUNICODETerminalRuleCall_2_1_0());
                    					

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

                    				newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTargetAccess().getQuestionMarkKeyword_3());
            		

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
    // InternalSimple.g:250:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalSimple.g:250:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalSimple.g:251:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalSimple.g:257:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_shapeExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:263:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' ) )
            // InternalSimple.g:264:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            {
            // InternalSimple.g:264:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';' )
            // InternalSimple.g:265:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) otherlv_2= ':-' ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) otherlv_4= ';'
            {
            // InternalSimple.g:265:3: ()
            // InternalSimple.g:266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalSimple.g:272:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalSimple.g:273:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalSimple.g:273:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalSimple.g:274:5: lv_shapeName_1_0= ruleShapeName
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
            		
            // InternalSimple.g:295:3: ( (lv_shapeExpressions_3_0= ruleShapeExpression ) )
            // InternalSimple.g:296:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            {
            // InternalSimple.g:296:4: (lv_shapeExpressions_3_0= ruleShapeExpression )
            // InternalSimple.g:297:5: lv_shapeExpressions_3_0= ruleShapeExpression
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
    // InternalSimple.g:322:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalSimple.g:322:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalSimple.g:323:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalSimple.g:329:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:335:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:336:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:336:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:337:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:337:3: ()
            // InternalSimple.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalSimple.g:344:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:345:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:345:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:346:5: lv_name_1_0= RULE_UNICODE
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
    // InternalSimple.g:366:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalSimple.g:366:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalSimple.g:367:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalSimple.g:373:1: ruleShapeExpression returns [EObject current=null] : ( ( () ( (lv_values_1_0= ruleValue ) ) ) | ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* ) | ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ ) ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_values_3_0 = null;

        EObject lv_values_4_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalSimple.g:379:2: ( ( ( () ( (lv_values_1_0= ruleValue ) ) ) | ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* ) | ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ ) ) )
            // InternalSimple.g:380:2: ( ( () ( (lv_values_1_0= ruleValue ) ) ) | ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* ) | ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ ) )
            {
            // InternalSimple.g:380:2: ( ( () ( (lv_values_1_0= ruleValue ) ) ) | ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* ) | ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_UNICODE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==16) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=17 && LA6_1<=23)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
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
                    // InternalSimple.g:381:3: ( () ( (lv_values_1_0= ruleValue ) ) )
                    {
                    // InternalSimple.g:381:3: ( () ( (lv_values_1_0= ruleValue ) ) )
                    // InternalSimple.g:382:4: () ( (lv_values_1_0= ruleValue ) )
                    {
                    // InternalSimple.g:382:4: ()
                    // InternalSimple.g:383:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSimple.g:389:4: ( (lv_values_1_0= ruleValue ) )
                    // InternalSimple.g:390:5: (lv_values_1_0= ruleValue )
                    {
                    // InternalSimple.g:390:5: (lv_values_1_0= ruleValue )
                    // InternalSimple.g:391:6: lv_values_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_values_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"xtext.magicSHACL.Simple.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:410:3: ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* )
                    {
                    // InternalSimple.g:410:3: ( ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )* )
                    // InternalSimple.g:411:4: ( (lv_type_2_0= rulePropertyType ) ) ( (lv_values_3_0= ruleValue ) )*
                    {
                    // InternalSimple.g:411:4: ( (lv_type_2_0= rulePropertyType ) )
                    // InternalSimple.g:412:5: (lv_type_2_0= rulePropertyType )
                    {
                    // InternalSimple.g:412:5: (lv_type_2_0= rulePropertyType )
                    // InternalSimple.g:413:6: lv_type_2_0= rulePropertyType
                    {

                    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_type_2_0=rulePropertyType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"xtext.magicSHACL.Simple.PropertyType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimple.g:430:4: ( (lv_values_3_0= ruleValue ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_UNICODE) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimple.g:431:5: (lv_values_3_0= ruleValue )
                    	    {
                    	    // InternalSimple.g:431:5: (lv_values_3_0= ruleValue )
                    	    // InternalSimple.g:432:6: lv_values_3_0= ruleValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_values_3_0=ruleValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
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


                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:451:3: ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ )
                    {
                    // InternalSimple.g:451:3: ( ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+ )
                    // InternalSimple.g:452:4: ( (lv_values_4_0= ruleValue ) ) ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+
                    {
                    // InternalSimple.g:452:4: ( (lv_values_4_0= ruleValue ) )
                    // InternalSimple.g:453:5: (lv_values_4_0= ruleValue )
                    {
                    // InternalSimple.g:453:5: (lv_values_4_0= ruleValue )
                    // InternalSimple.g:454:6: lv_values_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_values_4_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_4_0,
                    							"xtext.magicSHACL.Simple.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimple.g:471:4: ( ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=17 && LA5_0<=23)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimple.g:472:5: ( (lv_type_5_0= rulePropertyType ) ) ( (lv_values_6_0= ruleValue ) )
                    	    {
                    	    // InternalSimple.g:472:5: ( (lv_type_5_0= rulePropertyType ) )
                    	    // InternalSimple.g:473:6: (lv_type_5_0= rulePropertyType )
                    	    {
                    	    // InternalSimple.g:473:6: (lv_type_5_0= rulePropertyType )
                    	    // InternalSimple.g:474:7: lv_type_5_0= rulePropertyType
                    	    {

                    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_2_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_type_5_0=rulePropertyType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"type",
                    	    								lv_type_5_0,
                    	    								"xtext.magicSHACL.Simple.PropertyType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalSimple.g:491:5: ( (lv_values_6_0= ruleValue ) )
                    	    // InternalSimple.g:492:6: (lv_values_6_0= ruleValue )
                    	    {
                    	    // InternalSimple.g:492:6: (lv_values_6_0= ruleValue )
                    	    // InternalSimple.g:493:7: lv_values_6_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_values_6_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_6_0,
                    	    								"xtext.magicSHACL.Simple.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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
    // $ANTLR end "ruleShapeExpression"


    // $ANTLR start "entryRuleValue"
    // InternalSimple.g:516:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSimple.g:516:46: (iv_ruleValue= ruleValue EOF )
            // InternalSimple.g:517:2: iv_ruleValue= ruleValue EOF
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
    // InternalSimple.g:523:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimple.g:529:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalSimple.g:530:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalSimple.g:530:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalSimple.g:531:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalSimple.g:531:3: ()
            // InternalSimple.g:532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalSimple.g:538:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalSimple.g:539:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalSimple.g:539:4: (lv_name_1_0= RULE_UNICODE )
            // InternalSimple.g:540:5: lv_name_1_0= RULE_UNICODE
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
    // InternalSimple.g:560:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) ;
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
            // InternalSimple.g:566:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) ) )
            // InternalSimple.g:567:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            {
            // InternalSimple.g:567:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AND' ) | (enumLiteral_3= 'OR' ) | (enumLiteral_4= 'NOT' ) | (enumLiteral_5= 'SOME ' ) | (enumLiteral_6= 'SOME ^' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
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
                    // InternalSimple.g:568:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalSimple.g:568:3: (enumLiteral_0= 'MIN' )
                    // InternalSimple.g:569:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimple.g:576:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalSimple.g:576:3: (enumLiteral_1= 'MAX' )
                    // InternalSimple.g:577:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimple.g:584:3: (enumLiteral_2= 'AND' )
                    {
                    // InternalSimple.g:584:3: (enumLiteral_2= 'AND' )
                    // InternalSimple.g:585:4: enumLiteral_2= 'AND'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimple.g:592:3: (enumLiteral_3= 'OR' )
                    {
                    // InternalSimple.g:592:3: (enumLiteral_3= 'OR' )
                    // InternalSimple.g:593:4: enumLiteral_3= 'OR'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimple.g:600:3: (enumLiteral_4= 'NOT' )
                    {
                    // InternalSimple.g:600:3: (enumLiteral_4= 'NOT' )
                    // InternalSimple.g:601:4: enumLiteral_4= 'NOT'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimple.g:608:3: (enumLiteral_5= 'SOME ' )
                    {
                    // InternalSimple.g:608:3: (enumLiteral_5= 'SOME ' )
                    // InternalSimple.g:609:4: enumLiteral_5= 'SOME '
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimple.g:616:3: (enumLiteral_6= 'SOME ^' )
                    {
                    // InternalSimple.g:616:3: (enumLiteral_6= 'SOME ^' )
                    // InternalSimple.g:617:4: enumLiteral_6= 'SOME ^'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FE0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000FE0002L});

}