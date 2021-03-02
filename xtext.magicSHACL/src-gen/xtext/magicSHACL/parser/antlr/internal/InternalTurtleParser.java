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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IRI", "RULE_STRING", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@prefix'", "'.'", "';'", "'^^'", "'sh:NodeShape'", "'('", "'['", "']'", "')'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:path'", "'sh:inversePath'", "'sh:property'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'", "'sh:message'", "'sh:minExclusive'", "'sh:minInclusive'", "'sh:maxExclusive'", "'sh:maxInclusive'", "'sh:maxLength'", "'sh:minLength'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_IRI=5;
    public static final int RULE_STRING=6;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalTurtle.g:72:1: ruleGraph returns [EObject current=null] : ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaces_1_0 = null;

        EObject lv_dataGraph_2_0 = null;

        EObject lv_shapesGraph_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:78:2: ( ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) ) )
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) )
            {
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) )
            // InternalTurtle.g:80:3: () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) )
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

                if ( (LA1_0==12) ) {
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
            				
            pushFollow(FOLLOW_2);
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
    // InternalTurtle.g:148:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalTurtle.g:148:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalTurtle.g:149:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalTurtle.g:155:1: ruleNamespace returns [EObject current=null] : (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_ID ) ) ( (lv_namespace_2_0= RULE_IRI ) ) otherlv_3= '.' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_prefix_1_0=null;
        Token lv_namespace_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTurtle.g:161:2: ( (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_ID ) ) ( (lv_namespace_2_0= RULE_IRI ) ) otherlv_3= '.' ) )
            // InternalTurtle.g:162:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_ID ) ) ( (lv_namespace_2_0= RULE_IRI ) ) otherlv_3= '.' )
            {
            // InternalTurtle.g:162:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_ID ) ) ( (lv_namespace_2_0= RULE_IRI ) ) otherlv_3= '.' )
            // InternalTurtle.g:163:3: otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_ID ) ) ( (lv_namespace_2_0= RULE_IRI ) ) otherlv_3= '.'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getPrefixKeyword_0());
            		
            // InternalTurtle.g:167:3: ( (lv_prefix_1_0= RULE_ID ) )
            // InternalTurtle.g:168:4: (lv_prefix_1_0= RULE_ID )
            {
            // InternalTurtle.g:168:4: (lv_prefix_1_0= RULE_ID )
            // InternalTurtle.g:169:5: lv_prefix_1_0= RULE_ID
            {
            lv_prefix_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_prefix_1_0, grammarAccess.getNamespaceAccess().getPrefixIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prefix",
            						lv_prefix_1_0,
            						"xtext.magicSHACL.Turtle.ID");
            				

            }


            }

            // InternalTurtle.g:185:3: ( (lv_namespace_2_0= RULE_IRI ) )
            // InternalTurtle.g:186:4: (lv_namespace_2_0= RULE_IRI )
            {
            // InternalTurtle.g:186:4: (lv_namespace_2_0= RULE_IRI )
            // InternalTurtle.g:187:5: lv_namespace_2_0= RULE_IRI
            {
            lv_namespace_2_0=(Token)match(input,RULE_IRI,FOLLOW_7); 

            					newLeafNode(lv_namespace_2_0, grammarAccess.getNamespaceAccess().getNamespaceIRITerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"namespace",
            						lv_namespace_2_0,
            						"xtext.magicSHACL.Turtle.IRI");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNamespaceAccess().getFullStopKeyword_3());
            		

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
    // InternalTurtle.g:211:1: entryRuleDataGraph returns [EObject current=null] : iv_ruleDataGraph= ruleDataGraph EOF ;
    public final EObject entryRuleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataGraph = null;


        try {
            // InternalTurtle.g:211:50: (iv_ruleDataGraph= ruleDataGraph EOF )
            // InternalTurtle.g:212:2: iv_ruleDataGraph= ruleDataGraph EOF
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
    // InternalTurtle.g:218:1: ruleDataGraph returns [EObject current=null] : ( () ( (lv_triples_1_0= ruleTriples ) )* ) ;
    public final EObject ruleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_triples_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:224:2: ( ( () ( (lv_triples_1_0= ruleTriples ) )* ) )
            // InternalTurtle.g:225:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            {
            // InternalTurtle.g:225:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            // InternalTurtle.g:226:3: () ( (lv_triples_1_0= ruleTriples ) )*
            {
            // InternalTurtle.g:226:3: ()
            // InternalTurtle.g:227:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataGraphAccess().getDataGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:233:3: ( (lv_triples_1_0= ruleTriples ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==RULE_ID||LA2_4==RULE_STRING) ) {
                            alt2=1;
                        }


                    }
                    else if ( (LA2_1==RULE_STRING||LA2_1==13) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_STRING||LA2_2==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==RULE_ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==RULE_ID||LA2_4==RULE_STRING) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTurtle.g:234:4: (lv_triples_1_0= ruleTriples )
            	    {
            	    // InternalTurtle.g:234:4: (lv_triples_1_0= ruleTriples )
            	    // InternalTurtle.g:235:5: lv_triples_1_0= ruleTriples
            	    {

            	    					newCompositeNode(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalTurtle.g:256:1: entryRuleTriples returns [EObject current=null] : iv_ruleTriples= ruleTriples EOF ;
    public final EObject entryRuleTriples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriples = null;


        try {
            // InternalTurtle.g:256:48: (iv_ruleTriples= ruleTriples EOF )
            // InternalTurtle.g:257:2: iv_ruleTriples= ruleTriples EOF
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
    // InternalTurtle.g:263:1: ruleTriples returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) ;
    public final EObject ruleTriples() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_subject_0_0 = null;

        EObject lv_predicateobject_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:269:2: ( ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) )
            // InternalTurtle.g:270:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            {
            // InternalTurtle.g:270:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            // InternalTurtle.g:271:3: ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.'
            {
            // InternalTurtle.g:271:3: ( (lv_subject_0_0= ruleSubject ) )
            // InternalTurtle.g:272:4: (lv_subject_0_0= ruleSubject )
            {
            // InternalTurtle.g:272:4: (lv_subject_0_0= ruleSubject )
            // InternalTurtle.g:273:5: lv_subject_0_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalTurtle.g:290:3: ( (lv_predicateobject_1_0= rulePredicateObject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTurtle.g:291:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    {
            	    // InternalTurtle.g:291:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    // InternalTurtle.g:292:5: lv_predicateobject_1_0= rulePredicateObject
            	    {

            	    					newCompositeNode(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalTurtle.g:317:1: entryRulePredicateObject returns [EObject current=null] : iv_rulePredicateObject= rulePredicateObject EOF ;
    public final EObject entryRulePredicateObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObject = null;


        try {
            // InternalTurtle.g:317:56: (iv_rulePredicateObject= rulePredicateObject EOF )
            // InternalTurtle.g:318:2: iv_rulePredicateObject= rulePredicateObject EOF
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
    // InternalTurtle.g:324:1: rulePredicateObject returns [EObject current=null] : ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePredicateObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_object_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:330:2: ( ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) )
            // InternalTurtle.g:331:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            {
            // InternalTurtle.g:331:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            // InternalTurtle.g:332:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';'
            {
            // InternalTurtle.g:332:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) )
            // InternalTurtle.g:333:4: ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) )
            {
            // InternalTurtle.g:333:4: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalTurtle.g:334:5: (lv_predicate_0_0= rulePredicate )
            {
            // InternalTurtle.g:334:5: (lv_predicate_0_0= rulePredicate )
            // InternalTurtle.g:335:6: lv_predicate_0_0= rulePredicate
            {

            						newCompositeNode(grammarAccess.getPredicateObjectAccess().getPredicatePredicateParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_4);
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

            // InternalTurtle.g:352:4: ( (lv_object_1_0= ruleObject ) )
            // InternalTurtle.g:353:5: (lv_object_1_0= ruleObject )
            {
            // InternalTurtle.g:353:5: (lv_object_1_0= ruleObject )
            // InternalTurtle.g:354:6: lv_object_1_0= ruleObject
            {

            						newCompositeNode(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalTurtle.g:380:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalTurtle.g:380:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalTurtle.g:381:2: iv_ruleSubject= ruleSubject EOF
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
    // InternalTurtle.g:387:1: ruleSubject returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:393:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTurtle.g:394:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTurtle.g:394:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTurtle.g:395:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTurtle.g:395:3: ()
            // InternalTurtle.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubjectAccess().getSubjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:402:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:403:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:403:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:404:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.EString");
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
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePredicate"
    // InternalTurtle.g:425:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalTurtle.g:425:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalTurtle.g:426:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalTurtle.g:432:1: rulePredicate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:438:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTurtle.g:439:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTurtle.g:439:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTurtle.g:440:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTurtle.g:440:3: ()
            // InternalTurtle.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateAccess().getPredicateAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:447:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:448:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:448:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:449:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.EString");
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleObject"
    // InternalTurtle.g:470:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalTurtle.g:470:47: (iv_ruleObject= ruleObject EOF )
            // InternalTurtle.g:471:2: iv_ruleObject= ruleObject EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalTurtle.g:477:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_xsdType_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:483:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) )
            // InternalTurtle.g:484:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            {
            // InternalTurtle.g:484:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            // InternalTurtle.g:485:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            {
            // InternalTurtle.g:485:3: ()
            // InternalTurtle.g:486:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:492:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:493:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:493:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:494:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:511:3: (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:512:4: otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0());
                    			
                    // InternalTurtle.g:516:4: ( (lv_xsdType_3_0= ruleEString ) )
                    // InternalTurtle.g:517:5: (lv_xsdType_3_0= ruleEString )
                    {
                    // InternalTurtle.g:517:5: (lv_xsdType_3_0= ruleEString )
                    // InternalTurtle.g:518:6: lv_xsdType_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getXsdTypeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_xsdType_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"xsdType",
                    							lv_xsdType_3_0,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalTurtle.g:540:1: entryRuleShapesGraph returns [EObject current=null] : iv_ruleShapesGraph= ruleShapesGraph EOF ;
    public final EObject entryRuleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapesGraph = null;


        try {
            // InternalTurtle.g:540:52: (iv_ruleShapesGraph= ruleShapesGraph EOF )
            // InternalTurtle.g:541:2: iv_ruleShapesGraph= ruleShapesGraph EOF
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
    // InternalTurtle.g:547:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeConstraints_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:553:2: ( ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) )
            // InternalTurtle.g:554:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            {
            // InternalTurtle.g:554:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            // InternalTurtle.g:555:3: () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            {
            // InternalTurtle.g:555:3: ()
            // InternalTurtle.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:562:3: ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:563:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    {
            	    // InternalTurtle.g:563:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    // InternalTurtle.g:564:5: lv_shapeConstraints_1_0= ruleShapeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop5;
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
    // InternalTurtle.g:585:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalTurtle.g:585:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalTurtle.g:586:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalTurtle.g:592:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+ otherlv_3= '.' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_shapeExpressions_2_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:598:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+ otherlv_3= '.' ) )
            // InternalTurtle.g:599:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+ otherlv_3= '.' )
            {
            // InternalTurtle.g:599:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+ otherlv_3= '.' )
            // InternalTurtle.g:600:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+ otherlv_3= '.'
            {
            // InternalTurtle.g:600:3: ()
            // InternalTurtle.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:607:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalTurtle.g:608:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalTurtle.g:608:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalTurtle.g:609:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalTurtle.g:626:3: ( (lv_shapeExpressions_2_0= ruleShapeExpression ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTurtle.g:627:4: (lv_shapeExpressions_2_0= ruleShapeExpression )
            	    {
            	    // InternalTurtle.g:627:4: (lv_shapeExpressions_2_0= ruleShapeExpression )
            	    // InternalTurtle.g:628:5: lv_shapeExpressions_2_0= ruleShapeExpression
            	    {

            	    					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_shapeExpressions_2_0=ruleShapeExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapeExpressions",
            	    						lv_shapeExpressions_2_0,
            	    						"xtext.magicSHACL.Turtle.ShapeExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3());
            		

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
    // InternalTurtle.g:653:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalTurtle.g:653:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalTurtle.g:654:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalTurtle.g:660:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:666:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTurtle.g:667:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTurtle.g:667:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTurtle.g:668:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTurtle.g:668:3: ()
            // InternalTurtle.g:669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:675:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:676:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:676:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:677:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.EString");
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
    // $ANTLR end "ruleShapeName"


    // $ANTLR start "entryRuleShapeExpression"
    // InternalTurtle.g:698:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalTurtle.g:698:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalTurtle.g:699:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalTurtle.g:705:1: ruleShapeExpression returns [EObject current=null] : ( ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) ) | ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? ) ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_values_6_0 = null;

        EObject lv_shapeExpressions_8_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:711:2: ( ( ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) ) | ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? ) ) )
            // InternalTurtle.g:712:2: ( ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) ) | ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            {
            // InternalTurtle.g:712:2: ( ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) ) | ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=21 && LA12_0<=46)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTurtle.g:713:3: ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) )
                    {
                    // InternalTurtle.g:713:3: ( () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' ) )
                    // InternalTurtle.g:714:4: () (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' )
                    {
                    // InternalTurtle.g:714:4: ()
                    // InternalTurtle.g:715:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTurtle.g:721:4: (this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';' )
                    // InternalTurtle.g:722:5: this_ID_1= RULE_ID otherlv_2= 'sh:NodeShape' otherlv_3= ';'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                    					newLeafNode(this_ID_1, grammarAccess.getShapeExpressionAccess().getIDTerminalRuleCall_0_1_0());
                    				
                    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_0_1_1());
                    				
                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_0_1_2());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:737:3: ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? )
                    {
                    // InternalTurtle.g:737:3: ( ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )? )
                    // InternalTurtle.g:738:4: ( (lv_type_4_0= rulePropertyType ) ) (otherlv_5= '(' )? ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )* (otherlv_10= ')' )? (otherlv_11= ';' )?
                    {
                    // InternalTurtle.g:738:4: ( (lv_type_4_0= rulePropertyType ) )
                    // InternalTurtle.g:739:5: (lv_type_4_0= rulePropertyType )
                    {
                    // InternalTurtle.g:739:5: (lv_type_4_0= rulePropertyType )
                    // InternalTurtle.g:740:6: lv_type_4_0= rulePropertyType
                    {

                    						newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_4_0=rulePropertyType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"xtext.magicSHACL.Turtle.PropertyType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTurtle.g:757:4: (otherlv_5= '(' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTurtle.g:758:5: otherlv_5= '('
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_16); 

                            					newLeafNode(otherlv_5, grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:763:4: ( ( (lv_values_6_0= ruleValue ) ) | (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' ) )*
                    loop9:
                    do {
                        int alt9=3;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==RULE_STRING||(LA9_2>=13 && LA9_2<=15)||(LA9_2>=18 && LA9_2<=46)) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            alt9=1;
                            }
                            break;
                        case 18:
                            {
                            alt9=2;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // InternalTurtle.g:764:5: ( (lv_values_6_0= ruleValue ) )
                    	    {
                    	    // InternalTurtle.g:764:5: ( (lv_values_6_0= ruleValue ) )
                    	    // InternalTurtle.g:765:6: (lv_values_6_0= ruleValue )
                    	    {
                    	    // InternalTurtle.g:765:6: (lv_values_6_0= ruleValue )
                    	    // InternalTurtle.g:766:7: lv_values_6_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_values_6_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_6_0,
                    	    								"xtext.magicSHACL.Turtle.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTurtle.g:784:5: (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' )
                    	    {
                    	    // InternalTurtle.g:784:5: (otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']' )
                    	    // InternalTurtle.g:785:6: otherlv_7= '[' ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* otherlv_9= ']'
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_17); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1_0());
                    	    					
                    	    // InternalTurtle.g:789:6: ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )*
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        int LA8_0 = input.LA(1);

                    	        if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=46)) ) {
                    	            alt8=1;
                    	        }


                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // InternalTurtle.g:790:7: (lv_shapeExpressions_8_0= ruleShapeExpression )
                    	    	    {
                    	    	    // InternalTurtle.g:790:7: (lv_shapeExpressions_8_0= ruleShapeExpression )
                    	    	    // InternalTurtle.g:791:8: lv_shapeExpressions_8_0= ruleShapeExpression
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_1_1_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_shapeExpressions_8_0=ruleShapeExpression();

                    	    	    state._fsp--;


                    	    	    								if (current==null) {
                    	    	    									current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    	    								}
                    	    	    								add(
                    	    	    									current,
                    	    	    									"shapeExpressions",
                    	    	    									lv_shapeExpressions_8_0,
                    	    	    									"xtext.magicSHACL.Turtle.ShapeExpression");
                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop8;
                    	        }
                    	    } while (true);

                    	    otherlv_9=(Token)match(input,19,FOLLOW_16); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_1_2());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalTurtle.g:814:4: (otherlv_10= ')' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTurtle.g:815:5: otherlv_10= ')'
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_18); 

                            					newLeafNode(otherlv_10, grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:820:4: (otherlv_11= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==14) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTurtle.g:821:5: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,14,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_4());
                            				

                            }
                            break;

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


    // $ANTLR start "entryRuleValue"
    // InternalTurtle.g:831:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalTurtle.g:831:46: (iv_ruleValue= ruleValue EOF )
            // InternalTurtle.g:832:2: iv_ruleValue= ruleValue EOF
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
    // InternalTurtle.g:838:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_xsdType_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:844:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) )
            // InternalTurtle.g:845:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            {
            // InternalTurtle.g:845:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            // InternalTurtle.g:846:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            {
            // InternalTurtle.g:846:3: ()
            // InternalTurtle.g:847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:853:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:854:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:854:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:855:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.magicSHACL.Turtle.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTurtle.g:872:3: (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTurtle.g:873:4: otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_2_0());
                    			
                    // InternalTurtle.g:877:4: ( (lv_xsdType_3_0= ruleEString ) )
                    // InternalTurtle.g:878:5: (lv_xsdType_3_0= ruleEString )
                    {
                    // InternalTurtle.g:878:5: (lv_xsdType_3_0= ruleEString )
                    // InternalTurtle.g:879:6: lv_xsdType_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_xsdType_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						set(
                    							current,
                    							"xsdType",
                    							lv_xsdType_3_0,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEString"
    // InternalTurtle.g:901:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTurtle.g:901:47: (iv_ruleEString= ruleEString EOF )
            // InternalTurtle.g:902:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTurtle.g:908:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTurtle.g:914:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTurtle.g:915:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTurtle.g:915:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTurtle.g:916:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:924:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rulePropertyType"
    // InternalTurtle.g:935:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) | (enumLiteral_19= 'sh:message' ) | (enumLiteral_20= 'sh:minExclusive' ) | (enumLiteral_21= 'sh:minInclusive' ) | (enumLiteral_22= 'sh:maxExclusive' ) | (enumLiteral_23= 'sh:maxInclusive' ) | (enumLiteral_24= 'sh:maxLength' ) | (enumLiteral_25= 'sh:minLength' ) ) ;
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
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;


        	enterRule();

        try {
            // InternalTurtle.g:941:2: ( ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) | (enumLiteral_19= 'sh:message' ) | (enumLiteral_20= 'sh:minExclusive' ) | (enumLiteral_21= 'sh:minInclusive' ) | (enumLiteral_22= 'sh:maxExclusive' ) | (enumLiteral_23= 'sh:maxInclusive' ) | (enumLiteral_24= 'sh:maxLength' ) | (enumLiteral_25= 'sh:minLength' ) ) )
            // InternalTurtle.g:942:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) | (enumLiteral_19= 'sh:message' ) | (enumLiteral_20= 'sh:minExclusive' ) | (enumLiteral_21= 'sh:minInclusive' ) | (enumLiteral_22= 'sh:maxExclusive' ) | (enumLiteral_23= 'sh:maxInclusive' ) | (enumLiteral_24= 'sh:maxLength' ) | (enumLiteral_25= 'sh:minLength' ) )
            {
            // InternalTurtle.g:942:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) | (enumLiteral_19= 'sh:message' ) | (enumLiteral_20= 'sh:minExclusive' ) | (enumLiteral_21= 'sh:minInclusive' ) | (enumLiteral_22= 'sh:maxExclusive' ) | (enumLiteral_23= 'sh:maxInclusive' ) | (enumLiteral_24= 'sh:maxLength' ) | (enumLiteral_25= 'sh:minLength' ) )
            int alt15=26;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 24:
                {
                alt15=4;
                }
                break;
            case 25:
                {
                alt15=5;
                }
                break;
            case 26:
                {
                alt15=6;
                }
                break;
            case 27:
                {
                alt15=7;
                }
                break;
            case 28:
                {
                alt15=8;
                }
                break;
            case 29:
                {
                alt15=9;
                }
                break;
            case 30:
                {
                alt15=10;
                }
                break;
            case 31:
                {
                alt15=11;
                }
                break;
            case 32:
                {
                alt15=12;
                }
                break;
            case 33:
                {
                alt15=13;
                }
                break;
            case 34:
                {
                alt15=14;
                }
                break;
            case 35:
                {
                alt15=15;
                }
                break;
            case 36:
                {
                alt15=16;
                }
                break;
            case 37:
                {
                alt15=17;
                }
                break;
            case 38:
                {
                alt15=18;
                }
                break;
            case 39:
                {
                alt15=19;
                }
                break;
            case 40:
                {
                alt15=20;
                }
                break;
            case 41:
                {
                alt15=21;
                }
                break;
            case 42:
                {
                alt15=22;
                }
                break;
            case 43:
                {
                alt15=23;
                }
                break;
            case 44:
                {
                alt15=24;
                }
                break;
            case 45:
                {
                alt15=25;
                }
                break;
            case 46:
                {
                alt15=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTurtle.g:943:3: (enumLiteral_0= 'sh:minCount' )
                    {
                    // InternalTurtle.g:943:3: (enumLiteral_0= 'sh:minCount' )
                    // InternalTurtle.g:944:4: enumLiteral_0= 'sh:minCount'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:951:3: (enumLiteral_1= 'sh:maxCount' )
                    {
                    // InternalTurtle.g:951:3: (enumLiteral_1= 'sh:maxCount' )
                    // InternalTurtle.g:952:4: enumLiteral_1= 'sh:maxCount'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:959:3: (enumLiteral_2= 'sh:and' )
                    {
                    // InternalTurtle.g:959:3: (enumLiteral_2= 'sh:and' )
                    // InternalTurtle.g:960:4: enumLiteral_2= 'sh:and'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:967:3: (enumLiteral_3= 'sh:or' )
                    {
                    // InternalTurtle.g:967:3: (enumLiteral_3= 'sh:or' )
                    // InternalTurtle.g:968:4: enumLiteral_3= 'sh:or'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:975:3: (enumLiteral_4= 'sh:not' )
                    {
                    // InternalTurtle.g:975:3: (enumLiteral_4= 'sh:not' )
                    // InternalTurtle.g:976:4: enumLiteral_4= 'sh:not'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:983:3: (enumLiteral_5= 'sh:class' )
                    {
                    // InternalTurtle.g:983:3: (enumLiteral_5= 'sh:class' )
                    // InternalTurtle.g:984:4: enumLiteral_5= 'sh:class'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:991:3: (enumLiteral_6= 'sh:hasValue' )
                    {
                    // InternalTurtle.g:991:3: (enumLiteral_6= 'sh:hasValue' )
                    // InternalTurtle.g:992:4: enumLiteral_6= 'sh:hasValue'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:999:3: (enumLiteral_7= 'sh:nodeKind' )
                    {
                    // InternalTurtle.g:999:3: (enumLiteral_7= 'sh:nodeKind' )
                    // InternalTurtle.g:1000:4: enumLiteral_7= 'sh:nodeKind'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:1007:3: (enumLiteral_8= 'sh:node' )
                    {
                    // InternalTurtle.g:1007:3: (enumLiteral_8= 'sh:node' )
                    // InternalTurtle.g:1008:4: enumLiteral_8= 'sh:node'
                    {
                    enumLiteral_8=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:1015:3: (enumLiteral_9= 'sh:datatype' )
                    {
                    // InternalTurtle.g:1015:3: (enumLiteral_9= 'sh:datatype' )
                    // InternalTurtle.g:1016:4: enumLiteral_9= 'sh:datatype'
                    {
                    enumLiteral_9=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:1023:3: (enumLiteral_10= 'sh:pattern' )
                    {
                    // InternalTurtle.g:1023:3: (enumLiteral_10= 'sh:pattern' )
                    // InternalTurtle.g:1024:4: enumLiteral_10= 'sh:pattern'
                    {
                    enumLiteral_10=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:1031:3: (enumLiteral_11= 'sh:closed' )
                    {
                    // InternalTurtle.g:1031:3: (enumLiteral_11= 'sh:closed' )
                    // InternalTurtle.g:1032:4: enumLiteral_11= 'sh:closed'
                    {
                    enumLiteral_11=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:1039:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    {
                    // InternalTurtle.g:1039:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    // InternalTurtle.g:1040:4: enumLiteral_12= 'sh:ignoredProperties'
                    {
                    enumLiteral_12=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:1047:3: (enumLiteral_13= 'sh:path' )
                    {
                    // InternalTurtle.g:1047:3: (enumLiteral_13= 'sh:path' )
                    // InternalTurtle.g:1048:4: enumLiteral_13= 'sh:path'
                    {
                    enumLiteral_13=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:1055:3: (enumLiteral_14= 'sh:inversePath' )
                    {
                    // InternalTurtle.g:1055:3: (enumLiteral_14= 'sh:inversePath' )
                    // InternalTurtle.g:1056:4: enumLiteral_14= 'sh:inversePath'
                    {
                    enumLiteral_14=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:1063:3: (enumLiteral_15= 'sh:property' )
                    {
                    // InternalTurtle.g:1063:3: (enumLiteral_15= 'sh:property' )
                    // InternalTurtle.g:1064:4: enumLiteral_15= 'sh:property'
                    {
                    enumLiteral_15=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:1071:3: (enumLiteral_16= 'sh:name' )
                    {
                    // InternalTurtle.g:1071:3: (enumLiteral_16= 'sh:name' )
                    // InternalTurtle.g:1072:4: enumLiteral_16= 'sh:name'
                    {
                    enumLiteral_16=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:1079:3: (enumLiteral_17= 'sh:targetClass' )
                    {
                    // InternalTurtle.g:1079:3: (enumLiteral_17= 'sh:targetClass' )
                    // InternalTurtle.g:1080:4: enumLiteral_17= 'sh:targetClass'
                    {
                    enumLiteral_17=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:1087:3: (enumLiteral_18= 'sh:targetNode' )
                    {
                    // InternalTurtle.g:1087:3: (enumLiteral_18= 'sh:targetNode' )
                    // InternalTurtle.g:1088:4: enumLiteral_18= 'sh:targetNode'
                    {
                    enumLiteral_18=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalTurtle.g:1095:3: (enumLiteral_19= 'sh:message' )
                    {
                    // InternalTurtle.g:1095:3: (enumLiteral_19= 'sh:message' )
                    // InternalTurtle.g:1096:4: enumLiteral_19= 'sh:message'
                    {
                    enumLiteral_19=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalTurtle.g:1103:3: (enumLiteral_20= 'sh:minExclusive' )
                    {
                    // InternalTurtle.g:1103:3: (enumLiteral_20= 'sh:minExclusive' )
                    // InternalTurtle.g:1104:4: enumLiteral_20= 'sh:minExclusive'
                    {
                    enumLiteral_20=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalTurtle.g:1111:3: (enumLiteral_21= 'sh:minInclusive' )
                    {
                    // InternalTurtle.g:1111:3: (enumLiteral_21= 'sh:minInclusive' )
                    // InternalTurtle.g:1112:4: enumLiteral_21= 'sh:minInclusive'
                    {
                    enumLiteral_21=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalTurtle.g:1119:3: (enumLiteral_22= 'sh:maxExclusive' )
                    {
                    // InternalTurtle.g:1119:3: (enumLiteral_22= 'sh:maxExclusive' )
                    // InternalTurtle.g:1120:4: enumLiteral_22= 'sh:maxExclusive'
                    {
                    enumLiteral_22=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalTurtle.g:1127:3: (enumLiteral_23= 'sh:maxInclusive' )
                    {
                    // InternalTurtle.g:1127:3: (enumLiteral_23= 'sh:maxInclusive' )
                    // InternalTurtle.g:1128:4: enumLiteral_23= 'sh:maxInclusive'
                    {
                    enumLiteral_23=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalTurtle.g:1135:3: (enumLiteral_24= 'sh:maxLength' )
                    {
                    // InternalTurtle.g:1135:3: (enumLiteral_24= 'sh:maxLength' )
                    // InternalTurtle.g:1136:4: enumLiteral_24= 'sh:maxLength'
                    {
                    enumLiteral_24=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalTurtle.g:1143:3: (enumLiteral_25= 'sh:minLength' )
                    {
                    // InternalTurtle.g:1143:3: (enumLiteral_25= 'sh:minLength' )
                    // InternalTurtle.g:1144:4: enumLiteral_25= 'sh:minLength'
                    {
                    enumLiteral_25=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001050L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00007FFFFFE00010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00007FFFFFE02010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000164052L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000144052L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007FFFFFE80010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004002L});

}