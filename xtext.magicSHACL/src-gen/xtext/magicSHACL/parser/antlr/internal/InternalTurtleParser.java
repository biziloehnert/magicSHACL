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
import xtext.magicSHACL.services.TurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PREFIX", "RULE_UNICODE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<>'", "'@prefix'", "'<'", "'>'", "'.'", "';'", "'a'", "'sh:NodeShape'", "'['", "'sh:property'", "'sh:path'", "']'", "'('", "')'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:inversePath'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'"
    };
    public static final int RULE_PREFIX=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_UNICODE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTurtleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTurtleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTurtleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTurtle.g"; }



     	private TurtleGrammarAccess grammarAccess;

        public InternalTurtleParser(TokenStream input, TurtleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Graph";
       	}

       	@Override
       	protected TurtleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraph"
    // InternalTurtle.g:65:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalTurtle.g:65:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalTurtle.g:66:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalTurtle.g:72:1: ruleGraph returns [EObject current=null] : ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_namespaces_1_0 = null;

        EObject lv_dataGraph_2_0 = null;

        EObject lv_shapesGraph_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:78:2: ( ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ) )
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' )
            {
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' )
            // InternalTurtle.g:80:3: () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>'
            {
            // InternalTurtle.g:80:3: ()
            // InternalTurtle.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAccess().getGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:87:3: ( (lv_namespaces_1_0= ruleNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTurtle.g:88:4: (lv_namespaces_1_0= ruleNamespace )
            	    {
            	    // InternalTurtle.g:88:4: (lv_namespaces_1_0= ruleNamespace )
            	    // InternalTurtle.g:89:5: lv_namespaces_1_0= ruleNamespace
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getNamespacesNamespaceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_namespaces_1_0=ruleNamespace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"namespaces",
            	    						lv_namespaces_1_0,
            	    						"xtext.magicSHACL.Turtle.Namespace");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTurtle.g:106:3: ( (lv_dataGraph_2_0= ruleDataGraph ) )
            // InternalTurtle.g:107:4: (lv_dataGraph_2_0= ruleDataGraph )
            {
            // InternalTurtle.g:107:4: (lv_dataGraph_2_0= ruleDataGraph )
            // InternalTurtle.g:108:5: lv_dataGraph_2_0= ruleDataGraph
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getDataGraphDataGraphParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_dataGraph_2_0=ruleDataGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"dataGraph",
            						lv_dataGraph_2_0,
            						"xtext.magicSHACL.Turtle.DataGraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:125:3: ( (lv_shapesGraph_3_0= ruleShapesGraph ) )
            // InternalTurtle.g:126:4: (lv_shapesGraph_3_0= ruleShapesGraph )
            {
            // InternalTurtle.g:126:4: (lv_shapesGraph_3_0= ruleShapesGraph )
            // InternalTurtle.g:127:5: lv_shapesGraph_3_0= ruleShapesGraph
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_shapesGraph_3_0=ruleShapesGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"shapesGraph",
            						lv_shapesGraph_3_0,
            						"xtext.magicSHACL.Turtle.ShapesGraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getLessThanSignGreaterThanSignKeyword_4());
            		

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


    // $ANTLR start "entryRuleNamespace"
    // InternalTurtle.g:152:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalTurtle.g:152:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalTurtle.g:153:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalTurtle.g:159:1: ruleNamespace returns [EObject current=null] : (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_prefix_1_0=null;
        Token otherlv_2=null;
        Token lv_namespace_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTurtle.g:165:2: ( (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' ) )
            // InternalTurtle.g:166:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' )
            {
            // InternalTurtle.g:166:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' )
            // InternalTurtle.g:167:3: otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getPrefixKeyword_0());
            		
            // InternalTurtle.g:171:3: ( (lv_prefix_1_0= RULE_PREFIX ) )
            // InternalTurtle.g:172:4: (lv_prefix_1_0= RULE_PREFIX )
            {
            // InternalTurtle.g:172:4: (lv_prefix_1_0= RULE_PREFIX )
            // InternalTurtle.g:173:5: lv_prefix_1_0= RULE_PREFIX
            {
            lv_prefix_1_0=(Token)match(input,RULE_PREFIX,FOLLOW_7); 

            					newLeafNode(lv_prefix_1_0, grammarAccess.getNamespaceAccess().getPrefixPREFIXTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_1_0,
            						"xtext.magicSHACL.Turtle.PREFIX");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLessThanSignKeyword_2());
            		
            // InternalTurtle.g:193:3: ( (lv_namespace_3_0= RULE_UNICODE ) )
            // InternalTurtle.g:194:4: (lv_namespace_3_0= RULE_UNICODE )
            {
            // InternalTurtle.g:194:4: (lv_namespace_3_0= RULE_UNICODE )
            // InternalTurtle.g:195:5: lv_namespace_3_0= RULE_UNICODE
            {
            lv_namespace_3_0=(Token)match(input,RULE_UNICODE,FOLLOW_9); 

            					newLeafNode(lv_namespace_3_0, grammarAccess.getNamespaceAccess().getNamespaceUNICODETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"namespace",
            						lv_namespace_3_0,
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNamespaceAccess().getFullStopKeyword_5());
            		

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDataGraph"
    // InternalTurtle.g:223:1: entryRuleDataGraph returns [EObject current=null] : iv_ruleDataGraph= ruleDataGraph EOF ;
    public final EObject entryRuleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataGraph = null;


        try {
            // InternalTurtle.g:223:50: (iv_ruleDataGraph= ruleDataGraph EOF )
            // InternalTurtle.g:224:2: iv_ruleDataGraph= ruleDataGraph EOF
            {
             newCompositeNode(grammarAccess.getDataGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataGraph=ruleDataGraph();

            state._fsp--;

             current =iv_ruleDataGraph; 
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
    // $ANTLR end "entryRuleDataGraph"


    // $ANTLR start "ruleDataGraph"
    // InternalTurtle.g:230:1: ruleDataGraph returns [EObject current=null] : ( () ( (lv_triples_1_0= ruleTriples ) )* ) ;
    public final EObject ruleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_triples_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:236:2: ( ( () ( (lv_triples_1_0= ruleTriples ) )* ) )
            // InternalTurtle.g:237:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            {
            // InternalTurtle.g:237:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            // InternalTurtle.g:238:3: () ( (lv_triples_1_0= ruleTriples ) )*
            {
            // InternalTurtle.g:238:3: ()
            // InternalTurtle.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataGraphAccess().getDataGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:245:3: ( (lv_triples_1_0= ruleTriples ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_UNICODE) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_UNICODE) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==RULE_UNICODE) ) {
                            alt2=1;
                        }


                    }
                    else if ( (LA2_1==17) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTurtle.g:246:4: (lv_triples_1_0= ruleTriples )
            	    {
            	    // InternalTurtle.g:246:4: (lv_triples_1_0= ruleTriples )
            	    // InternalTurtle.g:247:5: lv_triples_1_0= ruleTriples
            	    {

            	    					newCompositeNode(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_triples_1_0=ruleTriples();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triples",
            	    						lv_triples_1_0,
            	    						"xtext.magicSHACL.Turtle.Triples");
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
    // $ANTLR end "ruleDataGraph"


    // $ANTLR start "entryRuleTriples"
    // InternalTurtle.g:268:1: entryRuleTriples returns [EObject current=null] : iv_ruleTriples= ruleTriples EOF ;
    public final EObject entryRuleTriples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriples = null;


        try {
            // InternalTurtle.g:268:48: (iv_ruleTriples= ruleTriples EOF )
            // InternalTurtle.g:269:2: iv_ruleTriples= ruleTriples EOF
            {
             newCompositeNode(grammarAccess.getTriplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriples=ruleTriples();

            state._fsp--;

             current =iv_ruleTriples; 
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
    // $ANTLR end "entryRuleTriples"


    // $ANTLR start "ruleTriples"
    // InternalTurtle.g:275:1: ruleTriples returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) ;
    public final EObject ruleTriples() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_subject_0_0 = null;

        EObject lv_predicateobject_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:281:2: ( ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) )
            // InternalTurtle.g:282:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            {
            // InternalTurtle.g:282:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            // InternalTurtle.g:283:3: ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.'
            {
            // InternalTurtle.g:283:3: ( (lv_subject_0_0= ruleSubject ) )
            // InternalTurtle.g:284:4: (lv_subject_0_0= ruleSubject )
            {
            // InternalTurtle.g:284:4: (lv_subject_0_0= ruleSubject )
            // InternalTurtle.g:285:5: lv_subject_0_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_subject_0_0=ruleSubject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriplesRule());
            					}
            					set(
            						current,
            						"subject",
            						lv_subject_0_0,
            						"xtext.magicSHACL.Turtle.Subject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:302:3: ( (lv_predicateobject_1_0= rulePredicateObject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_UNICODE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTurtle.g:303:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    {
            	    // InternalTurtle.g:303:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    // InternalTurtle.g:304:5: lv_predicateobject_1_0= rulePredicateObject
            	    {

            	    					newCompositeNode(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_predicateobject_1_0=rulePredicateObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriplesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"predicateobject",
            	    						lv_predicateobject_1_0,
            	    						"xtext.magicSHACL.Turtle.PredicateObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTriplesAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleTriples"


    // $ANTLR start "entryRulePredicateObject"
    // InternalTurtle.g:329:1: entryRulePredicateObject returns [EObject current=null] : iv_rulePredicateObject= rulePredicateObject EOF ;
    public final EObject entryRulePredicateObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObject = null;


        try {
            // InternalTurtle.g:329:56: (iv_rulePredicateObject= rulePredicateObject EOF )
            // InternalTurtle.g:330:2: iv_rulePredicateObject= rulePredicateObject EOF
            {
             newCompositeNode(grammarAccess.getPredicateObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateObject=rulePredicateObject();

            state._fsp--;

             current =iv_rulePredicateObject; 
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
    // $ANTLR end "entryRulePredicateObject"


    // $ANTLR start "rulePredicateObject"
    // InternalTurtle.g:336:1: rulePredicateObject returns [EObject current=null] : ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePredicateObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_object_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:342:2: ( ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) )
            // InternalTurtle.g:343:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            {
            // InternalTurtle.g:343:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            // InternalTurtle.g:344:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';'
            {
            // InternalTurtle.g:344:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) )
            // InternalTurtle.g:345:4: ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) )
            {
            // InternalTurtle.g:345:4: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalTurtle.g:346:5: (lv_predicate_0_0= rulePredicate )
            {
            // InternalTurtle.g:346:5: (lv_predicate_0_0= rulePredicate )
            // InternalTurtle.g:347:6: lv_predicate_0_0= rulePredicate
            {

            						newCompositeNode(grammarAccess.getPredicateObjectAccess().getPredicatePredicateParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
            						}
            						set(
            							current,
            							"predicate",
            							lv_predicate_0_0,
            							"xtext.magicSHACL.Turtle.Predicate");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalTurtle.g:364:4: ( (lv_object_1_0= ruleObject ) )
            // InternalTurtle.g:365:5: (lv_object_1_0= ruleObject )
            {
            // InternalTurtle.g:365:5: (lv_object_1_0= ruleObject )
            // InternalTurtle.g:366:6: lv_object_1_0= ruleObject
            {

            						newCompositeNode(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_13);
            lv_object_1_0=ruleObject();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
            						}
            						set(
            							current,
            							"object",
            							lv_object_1_0,
            							"xtext.magicSHACL.Turtle.Object");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "rulePredicateObject"


    // $ANTLR start "entryRuleSubject"
    // InternalTurtle.g:392:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalTurtle.g:392:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalTurtle.g:393:2: iv_ruleSubject= ruleSubject EOF
            {
             newCompositeNode(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;

             current =iv_ruleSubject; 
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
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalTurtle.g:399:1: ruleSubject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:405:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:406:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:406:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:407:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:407:3: ()
            // InternalTurtle.g:408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubjectAccess().getSubjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:414:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:415:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:415:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:416:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubjectAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

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
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePredicate"
    // InternalTurtle.g:436:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalTurtle.g:436:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalTurtle.g:437:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalTurtle.g:443:1: rulePredicate returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:449:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:450:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:450:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:451:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:451:3: ()
            // InternalTurtle.g:452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateAccess().getPredicateAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:458:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:459:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:459:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:460:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPredicateAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleObject"
    // InternalTurtle.g:480:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTurtle.g:482:2: (iv_ruleObject= ruleObject EOF )
            // InternalTurtle.g:483:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalTurtle.g:492:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTurtle.g:499:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:500:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:500:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:501:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:501:3: ()
            // InternalTurtle.g:502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:508:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:509:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:509:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:510:5: lv_name_1_0= RULE_UNICODE
            {
            lv_name_1_0=(Token)match(input,RULE_UNICODE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameUNICODETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalTurtle.g:533:1: entryRuleShapesGraph returns [EObject current=null] : iv_ruleShapesGraph= ruleShapesGraph EOF ;
    public final EObject entryRuleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapesGraph = null;


        try {
            // InternalTurtle.g:533:52: (iv_ruleShapesGraph= ruleShapesGraph EOF )
            // InternalTurtle.g:534:2: iv_ruleShapesGraph= ruleShapesGraph EOF
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
    // InternalTurtle.g:540:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeConstraints_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:546:2: ( ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) )
            // InternalTurtle.g:547:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            {
            // InternalTurtle.g:547:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            // InternalTurtle.g:548:3: () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            {
            // InternalTurtle.g:548:3: ()
            // InternalTurtle.g:549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:555:3: ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTurtle.g:556:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    {
            	    // InternalTurtle.g:556:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    // InternalTurtle.g:557:5: lv_shapeConstraints_1_0= ruleShapeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_shapeConstraints_1_0=ruleShapeConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapeConstraints",
            	    						lv_shapeConstraints_1_0,
            	    						"xtext.magicSHACL.Turtle.ShapeConstraint");
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
    // InternalTurtle.g:578:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalTurtle.g:578:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalTurtle.g:579:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalTurtle.g:585:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token this_UNICODE_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_shapeExpressions_6_0 = null;

        EObject lv_shapeExpressions_7_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:591:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' ) )
            // InternalTurtle.g:592:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' )
            {
            // InternalTurtle.g:592:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' )
            // InternalTurtle.g:593:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.'
            {
            // InternalTurtle.g:593:3: ()
            // InternalTurtle.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:600:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalTurtle.g:601:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalTurtle.g:601:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalTurtle.g:602:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_shapeName_1_0=ruleShapeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            					}
            					set(
            						current,
            						"shapeName",
            						lv_shapeName_1_0,
            						"xtext.magicSHACL.Turtle.ShapeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:619:3: ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_UNICODE||LA6_0==19) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=22 && LA6_0<=23)||(LA6_0>=27 && LA6_0<=43)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTurtle.g:620:4: ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' )
                    {
                    // InternalTurtle.g:620:4: ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' )
                    // InternalTurtle.g:621:5: (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';'
                    {
                    // InternalTurtle.g:621:5: (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_UNICODE) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==19) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTurtle.g:622:6: this_UNICODE_2= RULE_UNICODE
                            {
                            this_UNICODE_2=(Token)match(input,RULE_UNICODE,FOLLOW_15); 

                            						newLeafNode(this_UNICODE_2, grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTurtle.g:627:6: otherlv_3= 'a'
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_15); 

                            						newLeafNode(otherlv_3, grammarAccess.getShapeConstraintAccess().getAKeyword_2_0_0_1());
                            					

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getShapeConstraintAccess().getShNodeShapeKeyword_2_0_1());
                    				
                    otherlv_5=(Token)match(input,18,FOLLOW_16); 

                    					newLeafNode(otherlv_5, grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:642:4: ( (lv_shapeExpressions_6_0= ruleShapeExpression ) )
                    {
                    // InternalTurtle.g:642:4: ( (lv_shapeExpressions_6_0= ruleShapeExpression ) )
                    // InternalTurtle.g:643:5: (lv_shapeExpressions_6_0= ruleShapeExpression )
                    {
                    // InternalTurtle.g:643:5: (lv_shapeExpressions_6_0= ruleShapeExpression )
                    // InternalTurtle.g:644:6: lv_shapeExpressions_6_0= ruleShapeExpression
                    {

                    						newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_shapeExpressions_6_0=ruleShapeExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
                    						}
                    						add(
                    							current,
                    							"shapeExpressions",
                    							lv_shapeExpressions_6_0,
                    							"xtext.magicSHACL.Turtle.ShapeExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTurtle.g:662:3: ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=23)||(LA7_0>=27 && LA7_0<=43)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTurtle.g:663:4: (lv_shapeExpressions_7_0= ruleShapeExpression )
            	    {
            	    // InternalTurtle.g:663:4: (lv_shapeExpressions_7_0= ruleShapeExpression )
            	    // InternalTurtle.g:664:5: lv_shapeExpressions_7_0= ruleShapeExpression
            	    {

            	    					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_shapeExpressions_7_0=ruleShapeExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapeExpressions",
            	    						lv_shapeExpressions_7_0,
            	    						"xtext.magicSHACL.Turtle.ShapeExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getShapeConstraintAccess().getFullStopKeyword_4());
            		

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
    // InternalTurtle.g:689:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalTurtle.g:689:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalTurtle.g:690:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalTurtle.g:696:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:702:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:703:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:703:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:704:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:704:3: ()
            // InternalTurtle.g:705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:711:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:712:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:712:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:713:5: lv_name_1_0= RULE_UNICODE
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
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

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
    // InternalTurtle.g:733:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalTurtle.g:733:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalTurtle.g:734:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalTurtle.g:740:1: ruleShapeExpression returns [EObject current=null] : ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token this_UNICODE_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_propertyValues_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_propertyValues_11_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:746:2: ( ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) ) )
            // InternalTurtle.g:747:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )
            {
            // InternalTurtle.g:747:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalTurtle.g:748:3: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) )
                    {
                    // InternalTurtle.g:748:3: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) )
                    // InternalTurtle.g:749:4: () ( (lv_propertyValues_1_0= rulePropertyValues ) )
                    {
                    // InternalTurtle.g:749:4: ()
                    // InternalTurtle.g:750:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTurtle.g:756:4: ( (lv_propertyValues_1_0= rulePropertyValues ) )
                    // InternalTurtle.g:757:5: (lv_propertyValues_1_0= rulePropertyValues )
                    {
                    // InternalTurtle.g:757:5: (lv_propertyValues_1_0= rulePropertyValues )
                    // InternalTurtle.g:758:6: lv_propertyValues_1_0= rulePropertyValues
                    {

                    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_propertyValues_1_0=rulePropertyValues();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    						}
                    						add(
                    							current,
                    							"propertyValues",
                    							lv_propertyValues_1_0,
                    							"xtext.magicSHACL.Turtle.PropertyValues");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:777:3: ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ )
                    {
                    // InternalTurtle.g:777:3: ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ )
                    // InternalTurtle.g:778:4: ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+
                    {
                    // InternalTurtle.g:778:4: ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' )
                    // InternalTurtle.g:779:5: ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '['
                    {
                    // InternalTurtle.g:779:5: ( (lv_type_2_0= rulePropertyType ) )
                    // InternalTurtle.g:780:6: (lv_type_2_0= rulePropertyType )
                    {
                    // InternalTurtle.g:780:6: (lv_type_2_0= rulePropertyType )
                    // InternalTurtle.g:781:7: lv_type_2_0= rulePropertyType
                    {

                    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_type_2_0=rulePropertyType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_2_0,
                    								"xtext.magicSHACL.Turtle.PropertyType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_18); 

                    					newLeafNode(otherlv_3, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_0_1());
                    				

                    }

                    // InternalTurtle.g:803:4: ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_UNICODE||LA9_0==19) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTurtle.g:804:5: (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';'
                            {
                            // InternalTurtle.g:804:5: (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==RULE_UNICODE) ) {
                                alt8=1;
                            }
                            else if ( (LA8_0==19) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // InternalTurtle.g:805:6: this_UNICODE_4= RULE_UNICODE
                                    {
                                    this_UNICODE_4=(Token)match(input,RULE_UNICODE,FOLLOW_15); 

                                    						newLeafNode(this_UNICODE_4, grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalTurtle.g:810:6: otherlv_5= 'a'
                                    {
                                    otherlv_5=(Token)match(input,19,FOLLOW_15); 

                                    						newLeafNode(otherlv_5, grammarAccess.getShapeExpressionAccess().getAKeyword_1_1_0_1());
                                    					

                                    }
                                    break;

                            }

                            otherlv_6=(Token)match(input,20,FOLLOW_13); 

                            					newLeafNode(otherlv_6, grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_1_1_1());
                            				
                            otherlv_7=(Token)match(input,18,FOLLOW_19); 

                            					newLeafNode(otherlv_7, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_1_2());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:824:4: ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==21) ) {
                            alt11=1;
                        }
                    }
                    else if ( (LA11_0==23) ) {
                        int LA11_2 = input.LA(2);

                        if ( (LA11_2==21) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTurtle.g:825:5: (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '['
                            {
                            // InternalTurtle.g:825:5: (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' )
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==22) ) {
                                alt10=1;
                            }
                            else if ( (LA10_0==23) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalTurtle.g:826:6: otherlv_8= 'sh:property'
                                    {
                                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                                    						newLeafNode(otherlv_8, grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalTurtle.g:831:6: otherlv_9= 'sh:path'
                                    {
                                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                                    						newLeafNode(otherlv_9, grammarAccess.getShapeExpressionAccess().getShPathKeyword_1_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            otherlv_10=(Token)match(input,21,FOLLOW_19); 

                            					newLeafNode(otherlv_10, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:841:4: ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // InternalTurtle.g:842:5: ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';'
                    	    {
                    	    // InternalTurtle.g:842:5: ( (lv_propertyValues_11_0= rulePropertyValues ) )*
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( ((LA12_0>=22 && LA12_0<=23)||(LA12_0>=27 && LA12_0<=43)) ) {
                    	            alt12=1;
                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // InternalTurtle.g:843:6: (lv_propertyValues_11_0= rulePropertyValues )
                    	    	    {
                    	    	    // InternalTurtle.g:843:6: (lv_propertyValues_11_0= rulePropertyValues )
                    	    	    // InternalTurtle.g:844:7: lv_propertyValues_11_0= rulePropertyValues
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_3_0_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_19);
                    	    	    lv_propertyValues_11_0=rulePropertyValues();

                    	    	    state._fsp--;


                    	    	    							if (current==null) {
                    	    	    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    	    							}
                    	    	    							add(
                    	    	    								current,
                    	    	    								"propertyValues",
                    	    	    								lv_propertyValues_11_0,
                    	    	    								"xtext.magicSHACL.Turtle.PropertyValues");
                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop12;
                    	        }
                    	    } while (true);

                    	    otherlv_12=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_3_1());
                    	    				
                    	    otherlv_13=(Token)match(input,18,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_3_2());
                    	    				

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
    // InternalTurtle.g:875:1: entryRulePropertyValues returns [EObject current=null] : iv_rulePropertyValues= rulePropertyValues EOF ;
    public final EObject entryRulePropertyValues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValues = null;


        try {
            // InternalTurtle.g:875:55: (iv_rulePropertyValues= rulePropertyValues EOF )
            // InternalTurtle.g:876:2: iv_rulePropertyValues= rulePropertyValues EOF
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
    // InternalTurtle.g:882:1: rulePropertyValues returns [EObject current=null] : ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' ) ;
    public final EObject rulePropertyValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_property_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:888:2: ( ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' ) )
            // InternalTurtle.g:889:2: ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' )
            {
            // InternalTurtle.g:889:2: ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' )
            // InternalTurtle.g:890:3: ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';'
            {
            // InternalTurtle.g:890:3: ( (lv_property_0_0= ruleProperty ) )
            // InternalTurtle.g:891:4: (lv_property_0_0= ruleProperty )
            {
            // InternalTurtle.g:891:4: (lv_property_0_0= ruleProperty )
            // InternalTurtle.g:892:5: lv_property_0_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_property_0_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_0_0,
            						"xtext.magicSHACL.Turtle.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:909:3: (otherlv_1= '(' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTurtle.g:910:4: otherlv_1= '('
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertyValuesAccess().getLeftParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTurtle.g:915:3: ( (lv_values_2_0= ruleValue ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_UNICODE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTurtle.g:916:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalTurtle.g:916:4: (lv_values_2_0= ruleValue )
            	    // InternalTurtle.g:917:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyValuesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"xtext.magicSHACL.Turtle.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalTurtle.g:934:3: (otherlv_3= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTurtle.g:935:4: otherlv_3= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyValuesAccess().getRightParenthesisKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyValuesAccess().getSemicolonKeyword_4());
            		

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
    // InternalTurtle.g:948:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalTurtle.g:948:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalTurtle.g:949:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalTurtle.g:955:1: ruleProperty returns [EObject current=null] : ( () ( (lv_type_1_0= rulePropertyType ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:961:2: ( ( () ( (lv_type_1_0= rulePropertyType ) ) ) )
            // InternalTurtle.g:962:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            {
            // InternalTurtle.g:962:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            // InternalTurtle.g:963:3: () ( (lv_type_1_0= rulePropertyType ) )
            {
            // InternalTurtle.g:963:3: ()
            // InternalTurtle.g:964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:970:3: ( (lv_type_1_0= rulePropertyType ) )
            // InternalTurtle.g:971:4: (lv_type_1_0= rulePropertyType )
            {
            // InternalTurtle.g:971:4: (lv_type_1_0= rulePropertyType )
            // InternalTurtle.g:972:5: lv_type_1_0= rulePropertyType
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
            						"xtext.magicSHACL.Turtle.PropertyType");
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
    // InternalTurtle.g:993:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalTurtle.g:993:46: (iv_ruleValue= ruleValue EOF )
            // InternalTurtle.g:994:2: iv_ruleValue= ruleValue EOF
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
    // InternalTurtle.g:1000:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:1006:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:1007:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:1007:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:1008:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:1008:3: ()
            // InternalTurtle.g:1009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:1015:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:1016:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:1016:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:1017:5: lv_name_1_0= RULE_UNICODE
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
            						"xtext.magicSHACL.Turtle.UNICODE");
            				

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
    // InternalTurtle.g:1037:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;


        	enterRule();

        try {
            // InternalTurtle.g:1043:2: ( ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) ) )
            // InternalTurtle.g:1044:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) )
            {
            // InternalTurtle.g:1044:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) )
            int alt18=19;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            case 30:
                {
                alt18=4;
                }
                break;
            case 31:
                {
                alt18=5;
                }
                break;
            case 32:
                {
                alt18=6;
                }
                break;
            case 33:
                {
                alt18=7;
                }
                break;
            case 34:
                {
                alt18=8;
                }
                break;
            case 35:
                {
                alt18=9;
                }
                break;
            case 36:
                {
                alt18=10;
                }
                break;
            case 37:
                {
                alt18=11;
                }
                break;
            case 38:
                {
                alt18=12;
                }
                break;
            case 39:
                {
                alt18=13;
                }
                break;
            case 23:
                {
                alt18=14;
                }
                break;
            case 40:
                {
                alt18=15;
                }
                break;
            case 22:
                {
                alt18=16;
                }
                break;
            case 41:
                {
                alt18=17;
                }
                break;
            case 42:
                {
                alt18=18;
                }
                break;
            case 43:
                {
                alt18=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTurtle.g:1045:3: (enumLiteral_0= 'sh:minCount' )
                    {
                    // InternalTurtle.g:1045:3: (enumLiteral_0= 'sh:minCount' )
                    // InternalTurtle.g:1046:4: enumLiteral_0= 'sh:minCount'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1053:3: (enumLiteral_1= 'sh:maxCount' )
                    {
                    // InternalTurtle.g:1053:3: (enumLiteral_1= 'sh:maxCount' )
                    // InternalTurtle.g:1054:4: enumLiteral_1= 'sh:maxCount'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:1061:3: (enumLiteral_2= 'sh:and' )
                    {
                    // InternalTurtle.g:1061:3: (enumLiteral_2= 'sh:and' )
                    // InternalTurtle.g:1062:4: enumLiteral_2= 'sh:and'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:1069:3: (enumLiteral_3= 'sh:or' )
                    {
                    // InternalTurtle.g:1069:3: (enumLiteral_3= 'sh:or' )
                    // InternalTurtle.g:1070:4: enumLiteral_3= 'sh:or'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:1077:3: (enumLiteral_4= 'sh:not' )
                    {
                    // InternalTurtle.g:1077:3: (enumLiteral_4= 'sh:not' )
                    // InternalTurtle.g:1078:4: enumLiteral_4= 'sh:not'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:1085:3: (enumLiteral_5= 'sh:class' )
                    {
                    // InternalTurtle.g:1085:3: (enumLiteral_5= 'sh:class' )
                    // InternalTurtle.g:1086:4: enumLiteral_5= 'sh:class'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:1093:3: (enumLiteral_6= 'sh:hasValue' )
                    {
                    // InternalTurtle.g:1093:3: (enumLiteral_6= 'sh:hasValue' )
                    // InternalTurtle.g:1094:4: enumLiteral_6= 'sh:hasValue'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:1101:3: (enumLiteral_7= 'sh:nodeKind' )
                    {
                    // InternalTurtle.g:1101:3: (enumLiteral_7= 'sh:nodeKind' )
                    // InternalTurtle.g:1102:4: enumLiteral_7= 'sh:nodeKind'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:1109:3: (enumLiteral_8= 'sh:node' )
                    {
                    // InternalTurtle.g:1109:3: (enumLiteral_8= 'sh:node' )
                    // InternalTurtle.g:1110:4: enumLiteral_8= 'sh:node'
                    {
                    enumLiteral_8=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:1117:3: (enumLiteral_9= 'sh:datatype' )
                    {
                    // InternalTurtle.g:1117:3: (enumLiteral_9= 'sh:datatype' )
                    // InternalTurtle.g:1118:4: enumLiteral_9= 'sh:datatype'
                    {
                    enumLiteral_9=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:1125:3: (enumLiteral_10= 'sh:pattern' )
                    {
                    // InternalTurtle.g:1125:3: (enumLiteral_10= 'sh:pattern' )
                    // InternalTurtle.g:1126:4: enumLiteral_10= 'sh:pattern'
                    {
                    enumLiteral_10=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:1133:3: (enumLiteral_11= 'sh:closed' )
                    {
                    // InternalTurtle.g:1133:3: (enumLiteral_11= 'sh:closed' )
                    // InternalTurtle.g:1134:4: enumLiteral_11= 'sh:closed'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:1141:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    {
                    // InternalTurtle.g:1141:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    // InternalTurtle.g:1142:4: enumLiteral_12= 'sh:ignoredProperties'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:1149:3: (enumLiteral_13= 'sh:path' )
                    {
                    // InternalTurtle.g:1149:3: (enumLiteral_13= 'sh:path' )
                    // InternalTurtle.g:1150:4: enumLiteral_13= 'sh:path'
                    {
                    enumLiteral_13=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:1157:3: (enumLiteral_14= 'sh:inversePath' )
                    {
                    // InternalTurtle.g:1157:3: (enumLiteral_14= 'sh:inversePath' )
                    // InternalTurtle.g:1158:4: enumLiteral_14= 'sh:inversePath'
                    {
                    enumLiteral_14=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:1165:3: (enumLiteral_15= 'sh:property' )
                    {
                    // InternalTurtle.g:1165:3: (enumLiteral_15= 'sh:property' )
                    // InternalTurtle.g:1166:4: enumLiteral_15= 'sh:property'
                    {
                    enumLiteral_15=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:1173:3: (enumLiteral_16= 'sh:name' )
                    {
                    // InternalTurtle.g:1173:3: (enumLiteral_16= 'sh:name' )
                    // InternalTurtle.g:1174:4: enumLiteral_16= 'sh:name'
                    {
                    enumLiteral_16=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:1181:3: (enumLiteral_17= 'sh:targetClass' )
                    {
                    // InternalTurtle.g:1181:3: (enumLiteral_17= 'sh:targetClass' )
                    // InternalTurtle.g:1182:4: enumLiteral_17= 'sh:targetClass'
                    {
                    enumLiteral_17=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:1189:3: (enumLiteral_18= 'sh:targetNode' )
                    {
                    // InternalTurtle.g:1189:3: (enumLiteral_18= 'sh:targetNode' )
                    // InternalTurtle.g:1190:4: enumLiteral_18= 'sh:targetNode'
                    {
                    enumLiteral_18=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18());
                    			

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\26\23\5\2\uffff";
    static final String dfa_3s = "\1\53\23\32\2\uffff";
    static final String dfa_4s = "\24\uffff\1\1\1\2";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\1\16\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "\1\24\14\uffff\1\24\2\uffff\1\25\3\uffff\2\24",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "747:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\24\31\uffff";
    static final String dfa_9s = "\1\21\23\5\2\uffff\2\5\1\22\1\21";
    static final String dfa_10s = "\1\53\23\32\2\uffff\2\32\1\22\1\53";
    static final String dfa_11s = "\24\uffff\1\2\1\1\4\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\24\4\uffff\1\20\1\16\1\25\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "\1\27\14\uffff\1\31\2\uffff\1\24\3\uffff\1\26\1\30",
            "",
            "",
            "\1\27\14\uffff\1\31\7\uffff\1\30",
            "\1\27\14\uffff\1\31\7\uffff\1\30",
            "\1\31",
            "\1\24\4\uffff\1\20\1\16\1\25\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 841:4: ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000FFFF8C80020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000FFFF8CA0020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000FFFF9C80020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000FFFF9C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000FFFF9C00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006040020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004040020L});

}