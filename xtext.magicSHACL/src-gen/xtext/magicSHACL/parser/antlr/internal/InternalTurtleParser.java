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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IRI", "RULE_STRING", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@prefix'", "'.'", "';'", "'^^'", "'sh:targetClass'", "'sh:targetNode'", "','", "'('", "')'", "'['", "']'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:path'", "'sh:inversePath'", "'sh:property'", "'sh:name'", "'sh:message'", "'sh:equals'", "'sh:minExclusive'", "'sh:minInclusive'", "'sh:maxExclusive'", "'sh:maxInclusive'", "'sh:maxLength'", "'sh:minLength'", "'sh:qualifiedValueShape'", "'sh:qualifiedMaxCount'", "'sh:qualifiedMinCount'", "'a'", "'rdfs:label'", "'sh:description'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
                switch ( input.LA(1) ) {
                case RULE_IRI:
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID||LA2_1==RULE_STRING||LA2_1==13) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID||LA2_2==RULE_STRING||LA2_2==13) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==RULE_ID||LA2_3==RULE_STRING||LA2_3==13) ) {
                        alt2=1;
                    }


                    }
                    break;

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
            					
            pushFollow(FOLLOW_10);
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
            					
            pushFollow(FOLLOW_11);
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
    // InternalTurtle.g:387:1: ruleSubject returns [EObject current=null] : ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_2=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;



        	enterRule();

        try {
            // InternalTurtle.g:393:2: ( ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) ) )
            // InternalTurtle.g:394:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) )
            {
            // InternalTurtle.g:394:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) )
            // InternalTurtle.g:395:3: () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) )
            {
            // InternalTurtle.g:395:3: ()
            // InternalTurtle.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubjectAccess().getSubjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:402:3: ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) )
            // InternalTurtle.g:403:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) )
            {
            // InternalTurtle.g:403:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) )
            // InternalTurtle.g:404:5: (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI )
            {
            // InternalTurtle.g:404:5: (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_IRI) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:405:6: lv_name_1_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_1=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubjectRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:421:6: lv_name_1_2= RULE_IRI
                    {
                    lv_name_1_2=(Token)match(input,RULE_IRI,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getSubjectAccess().getNameIRITerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"xtext.magicSHACL.Turtle.IRI");
                    					

                    }
                    break;

            }


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
    // InternalTurtle.g:442:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalTurtle.g:442:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalTurtle.g:443:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalTurtle.g:449:1: rulePredicate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:455:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTurtle.g:456:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTurtle.g:456:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTurtle.g:457:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTurtle.g:457:3: ()
            // InternalTurtle.g:458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateAccess().getPredicateAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:464:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:465:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:465:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:466:5: lv_name_1_0= ruleEString
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
    // InternalTurtle.g:487:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalTurtle.g:487:47: (iv_ruleObject= ruleObject EOF )
            // InternalTurtle.g:488:2: iv_ruleObject= ruleObject EOF
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
    // InternalTurtle.g:494:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_xsdType_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:500:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? ) )
            // InternalTurtle.g:501:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            {
            // InternalTurtle.g:501:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )? )
            // InternalTurtle.g:502:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            {
            // InternalTurtle.g:502:3: ()
            // InternalTurtle.g:503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:509:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTurtle.g:510:4: (lv_name_1_0= ruleEString )
            {
            // InternalTurtle.g:510:4: (lv_name_1_0= ruleEString )
            // InternalTurtle.g:511:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalTurtle.g:528:3: (otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtle.g:529:4: otherlv_2= '^^' ( (lv_xsdType_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0());
                    			
                    // InternalTurtle.g:533:4: ( (lv_xsdType_3_0= ruleEString ) )
                    // InternalTurtle.g:534:5: (lv_xsdType_3_0= ruleEString )
                    {
                    // InternalTurtle.g:534:5: (lv_xsdType_3_0= ruleEString )
                    // InternalTurtle.g:535:6: lv_xsdType_3_0= ruleEString
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
    // InternalTurtle.g:557:1: entryRuleShapesGraph returns [EObject current=null] : iv_ruleShapesGraph= ruleShapesGraph EOF ;
    public final EObject entryRuleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapesGraph = null;


        try {
            // InternalTurtle.g:557:52: (iv_ruleShapesGraph= ruleShapesGraph EOF )
            // InternalTurtle.g:558:2: iv_ruleShapesGraph= ruleShapesGraph EOF
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
    // InternalTurtle.g:564:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeConstraints_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:570:2: ( ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) )
            // InternalTurtle.g:571:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            {
            // InternalTurtle.g:571:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            // InternalTurtle.g:572:3: () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            {
            // InternalTurtle.g:572:3: ()
            // InternalTurtle.g:573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:579:3: ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTurtle.g:580:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    {
            	    // InternalTurtle.g:580:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    // InternalTurtle.g:581:5: lv_shapeConstraints_1_0= ruleShapeConstraint
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
            	    break loop6;
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
    // InternalTurtle.g:602:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalTurtle.g:602:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalTurtle.g:603:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalTurtle.g:609:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+ otherlv_4= '.' ) ;
    public final EObject ruleShapeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_shapeName_1_0 = null;

        EObject lv_targets_2_0 = null;

        EObject lv_shapeExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:615:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+ otherlv_4= '.' ) )
            // InternalTurtle.g:616:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+ otherlv_4= '.' )
            {
            // InternalTurtle.g:616:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+ otherlv_4= '.' )
            // InternalTurtle.g:617:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+ otherlv_4= '.'
            {
            // InternalTurtle.g:617:3: ()
            // InternalTurtle.g:618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:624:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalTurtle.g:625:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalTurtle.g:625:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalTurtle.g:626:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalTurtle.g:643:3: ( ( (lv_targets_2_0= ruleTarget ) ) | ( (lv_shapeExpressions_3_0= ruleShapeExpression ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }
                else if ( (LA7_0==21||(LA7_0>=23 && LA7_0<=53)) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTurtle.g:644:4: ( (lv_targets_2_0= ruleTarget ) )
            	    {
            	    // InternalTurtle.g:644:4: ( (lv_targets_2_0= ruleTarget ) )
            	    // InternalTurtle.g:645:5: (lv_targets_2_0= ruleTarget )
            	    {
            	    // InternalTurtle.g:645:5: (lv_targets_2_0= ruleTarget )
            	    // InternalTurtle.g:646:6: lv_targets_2_0= ruleTarget
            	    {

            	    						newCompositeNode(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_targets_2_0=ruleTarget();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targets",
            	    							lv_targets_2_0,
            	    							"xtext.magicSHACL.Turtle.Target");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTurtle.g:664:4: ( (lv_shapeExpressions_3_0= ruleShapeExpression ) )
            	    {
            	    // InternalTurtle.g:664:4: ( (lv_shapeExpressions_3_0= ruleShapeExpression ) )
            	    // InternalTurtle.g:665:5: (lv_shapeExpressions_3_0= ruleShapeExpression )
            	    {
            	    // InternalTurtle.g:665:5: (lv_shapeExpressions_3_0= ruleShapeExpression )
            	    // InternalTurtle.g:666:6: lv_shapeExpressions_3_0= ruleShapeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_shapeExpressions_3_0=ruleShapeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"shapeExpressions",
            	    							lv_shapeExpressions_3_0,
            	    							"xtext.magicSHACL.Turtle.ShapeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3());
            		

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


    // $ANTLR start "entryRuleTarget"
    // InternalTurtle.g:692:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalTurtle.g:692:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalTurtle.g:693:2: iv_ruleTarget= ruleTarget EOF
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
    // InternalTurtle.g:699:1: ruleTarget returns [EObject current=null] : ( () ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) ) ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_term_2_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_term_2_1 = null;



        	enterRule();

        try {
            // InternalTurtle.g:705:2: ( ( () ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) ) ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) ) otherlv_3= ';' ) )
            // InternalTurtle.g:706:2: ( () ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) ) ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) ) otherlv_3= ';' )
            {
            // InternalTurtle.g:706:2: ( () ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) ) ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) ) otherlv_3= ';' )
            // InternalTurtle.g:707:3: () ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) ) ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) ) otherlv_3= ';'
            {
            // InternalTurtle.g:707:3: ()
            // InternalTurtle.g:708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetAccess().getTargetAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:714:3: ( ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) ) )
            // InternalTurtle.g:715:4: ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) )
            {
            // InternalTurtle.g:715:4: ( (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' ) )
            // InternalTurtle.g:716:5: (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' )
            {
            // InternalTurtle.g:716:5: (lv_type_1_1= 'sh:targetClass' | lv_type_1_2= 'sh:targetNode' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtle.g:717:6: lv_type_1_1= 'sh:targetClass'
                    {
                    lv_type_1_1=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getTargetAccess().getTypeShTargetClassKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:728:6: lv_type_1_2= 'sh:targetNode'
                    {
                    lv_type_1_2=(Token)match(input,17,FOLLOW_4); 

                    						newLeafNode(lv_type_1_2, grammarAccess.getTargetAccess().getTypeShTargetNodeKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTurtle.g:741:3: ( ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) ) )
            // InternalTurtle.g:742:4: ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) )
            {
            // InternalTurtle.g:742:4: ( (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI ) )
            // InternalTurtle.g:743:5: (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI )
            {
            // InternalTurtle.g:743:5: (lv_term_2_1= ruleEString | lv_term_2_2= RULE_IRI )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_IRI) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTurtle.g:744:6: lv_term_2_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTargetAccess().getTermEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_term_2_1=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTargetRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_2_1,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:760:6: lv_term_2_2= RULE_IRI
                    {
                    lv_term_2_2=(Token)match(input,RULE_IRI,FOLLOW_11); 

                    						newLeafNode(lv_term_2_2, grammarAccess.getTargetAccess().getTermIRITerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"term",
                    							lv_term_2_2,
                    							"xtext.magicSHACL.Turtle.IRI");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleShapeName"
    // InternalTurtle.g:785:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalTurtle.g:785:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalTurtle.g:786:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalTurtle.g:792:1: ruleShapeName returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;



        	enterRule();

        try {
            // InternalTurtle.g:798:2: ( ( () ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) ) ) )
            // InternalTurtle.g:799:2: ( () ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) ) )
            {
            // InternalTurtle.g:799:2: ( () ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) ) )
            // InternalTurtle.g:800:3: () ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) )
            {
            // InternalTurtle.g:800:3: ()
            // InternalTurtle.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:807:3: ( ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) ) )
            // InternalTurtle.g:808:4: ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) )
            {
            // InternalTurtle.g:808:4: ( (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString ) )
            // InternalTurtle.g:809:5: (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString )
            {
            // InternalTurtle.g:809:5: (lv_name_1_1= RULE_IRI | lv_name_1_2= ruleEString )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IRI) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTurtle.g:810:6: lv_name_1_1= RULE_IRI
                    {
                    lv_name_1_1=(Token)match(input,RULE_IRI,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getShapeNameAccess().getNameIRITerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShapeNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"xtext.magicSHACL.Turtle.IRI");
                    					

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:825:6: lv_name_1_2= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_2=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeNameRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // InternalTurtle.g:847:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalTurtle.g:847:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalTurtle.g:848:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalTurtle.g:854:1: ruleShapeExpression returns [EObject current=null] : ( () ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) ) (otherlv_14= ';' )? ) ;
    public final EObject ruleShapeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_values_7_0 = null;

        EObject lv_shapeExpressions_8_0 = null;

        Enumerator lv_type_10_0 = null;

        EObject lv_shapeExpressions_12_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:860:2: ( ( () ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) ) (otherlv_14= ';' )? ) )
            // InternalTurtle.g:861:2: ( () ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) ) (otherlv_14= ';' )? )
            {
            // InternalTurtle.g:861:2: ( () ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) ) (otherlv_14= ';' )? )
            // InternalTurtle.g:862:3: () ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) ) (otherlv_14= ';' )?
            {
            // InternalTurtle.g:862:3: ()
            // InternalTurtle.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:869:3: ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalTurtle.g:870:4: ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )
                    {
                    // InternalTurtle.g:870:4: ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* )
                    // InternalTurtle.g:871:5: ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
                    {
                    // InternalTurtle.g:871:5: ( (lv_type_1_0= rulePropertyType ) )
                    // InternalTurtle.g:872:6: (lv_type_1_0= rulePropertyType )
                    {
                    // InternalTurtle.g:872:6: (lv_type_1_0= rulePropertyType )
                    // InternalTurtle.g:873:7: lv_type_1_0= rulePropertyType
                    {

                    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_4);
                    lv_type_1_0=rulePropertyType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_1_0,
                    								"xtext.magicSHACL.Turtle.PropertyType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTurtle.g:890:5: ( (lv_values_2_0= ruleValue ) )
                    // InternalTurtle.g:891:6: (lv_values_2_0= ruleValue )
                    {
                    // InternalTurtle.g:891:6: (lv_values_2_0= ruleValue )
                    // InternalTurtle.g:892:7: lv_values_2_0= ruleValue
                    {

                    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_values_2_0=ruleValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    							}
                    							add(
                    								current,
                    								"values",
                    								lv_values_2_0,
                    								"xtext.magicSHACL.Turtle.Value");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTurtle.g:909:5: (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTurtle.g:910:6: otherlv_3= ',' ( (lv_values_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getShapeExpressionAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalTurtle.g:914:6: ( (lv_values_4_0= ruleValue ) )
                    	    // InternalTurtle.g:915:7: (lv_values_4_0= ruleValue )
                    	    {
                    	    // InternalTurtle.g:915:7: (lv_values_4_0= ruleValue )
                    	    // InternalTurtle.g:916:8: lv_values_4_0= ruleValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_values_4_0=ruleValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"values",
                    	    									lv_values_4_0,
                    	    									"xtext.magicSHACL.Turtle.Value");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:936:4: ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' )
                    {
                    // InternalTurtle.g:936:4: ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' )
                    // InternalTurtle.g:937:5: ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')'
                    {
                    // InternalTurtle.g:937:5: ( (lv_type_5_0= rulePropertyType ) )
                    // InternalTurtle.g:938:6: (lv_type_5_0= rulePropertyType )
                    {
                    // InternalTurtle.g:938:6: (lv_type_5_0= rulePropertyType )
                    // InternalTurtle.g:939:7: lv_type_5_0= rulePropertyType
                    {

                    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_type_5_0=rulePropertyType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_5_0,
                    								"xtext.magicSHACL.Turtle.PropertyType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_17); 

                    					newLeafNode(otherlv_6, grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalTurtle.g:960:5: ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=20 && LA13_0<=21)||(LA13_0>=23 && LA13_0<=53)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTurtle.g:961:6: ( (lv_values_7_0= ruleValue ) )
                            {
                            // InternalTurtle.g:961:6: ( (lv_values_7_0= ruleValue ) )
                            // InternalTurtle.g:962:7: (lv_values_7_0= ruleValue )
                            {
                            // InternalTurtle.g:962:7: (lv_values_7_0= ruleValue )
                            // InternalTurtle.g:963:8: lv_values_7_0= ruleValue
                            {

                            								newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_2_0_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_values_7_0=ruleValue();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                            								}
                            								add(
                            									current,
                            									"values",
                            									lv_values_7_0,
                            									"xtext.magicSHACL.Turtle.Value");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTurtle.g:981:6: ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )*
                            {
                            // InternalTurtle.g:981:6: ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==21||(LA12_0>=23 && LA12_0<=53)) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalTurtle.g:982:7: (lv_shapeExpressions_8_0= ruleShapeExpression )
                            	    {
                            	    // InternalTurtle.g:982:7: (lv_shapeExpressions_8_0= ruleShapeExpression )
                            	    // InternalTurtle.g:983:8: lv_shapeExpressions_8_0= ruleShapeExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
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
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20); 

                    					newLeafNode(otherlv_9, grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_1_3());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:1007:4: ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' )
                    {
                    // InternalTurtle.g:1007:4: ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' )
                    // InternalTurtle.g:1008:5: ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']'
                    {
                    // InternalTurtle.g:1008:5: ( (lv_type_10_0= rulePropertyType ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=23 && LA14_0<=53)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTurtle.g:1009:6: (lv_type_10_0= rulePropertyType )
                            {
                            // InternalTurtle.g:1009:6: (lv_type_10_0= rulePropertyType )
                            // InternalTurtle.g:1010:7: lv_type_10_0= rulePropertyType
                            {

                            							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_type_10_0=rulePropertyType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_10_0,
                            								"xtext.magicSHACL.Turtle.PropertyType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_22); 

                    					newLeafNode(otherlv_11, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
                    				
                    // InternalTurtle.g:1031:5: ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21||(LA15_0>=23 && LA15_0<=53)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTurtle.g:1032:6: (lv_shapeExpressions_12_0= ruleShapeExpression )
                    	    {
                    	    // InternalTurtle.g:1032:6: (lv_shapeExpressions_12_0= ruleShapeExpression )
                    	    // InternalTurtle.g:1033:7: lv_shapeExpressions_12_0= ruleShapeExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_shapeExpressions_12_0=ruleShapeExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"shapeExpressions",
                    	    								lv_shapeExpressions_12_0,
                    	    								"xtext.magicSHACL.Turtle.ShapeExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_20); 

                    					newLeafNode(otherlv_13, grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_3());
                    				

                    }


                    }
                    break;

            }

            // InternalTurtle.g:1056:3: (otherlv_14= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTurtle.g:1057:4: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleShapeExpression"


    // $ANTLR start "entryRuleValue"
    // InternalTurtle.g:1066:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalTurtle.g:1066:46: (iv_ruleValue= ruleValue EOF )
            // InternalTurtle.g:1067:2: iv_ruleValue= ruleValue EOF
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
    // InternalTurtle.g:1073:1: ruleValue returns [EObject current=null] : ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) (this_ID_2= RULE_ID )? (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_2=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        AntlrDatatypeRuleToken lv_xsdType_4_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:1079:2: ( ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) (this_ID_2= RULE_ID )? (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )? ) )
            // InternalTurtle.g:1080:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) (this_ID_2= RULE_ID )? (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )? )
            {
            // InternalTurtle.g:1080:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) (this_ID_2= RULE_ID )? (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )? )
            // InternalTurtle.g:1081:3: () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) ) (this_ID_2= RULE_ID )? (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )?
            {
            // InternalTurtle.g:1081:3: ()
            // InternalTurtle.g:1082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:1088:3: ( ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) ) )
            // InternalTurtle.g:1089:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) )
            {
            // InternalTurtle.g:1089:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI ) )
            // InternalTurtle.g:1090:5: (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI )
            {
            // InternalTurtle.g:1090:5: (lv_name_1_1= ruleEString | lv_name_1_2= RULE_IRI )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_IRI) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTurtle.g:1091:6: lv_name_1_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_name_1_1=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"xtext.magicSHACL.Turtle.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1107:6: lv_name_1_2= RULE_IRI
                    {
                    lv_name_1_2=(Token)match(input,RULE_IRI,FOLLOW_23); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getValueAccess().getNameIRITerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"xtext.magicSHACL.Turtle.IRI");
                    					

                    }
                    break;

            }


            }


            }

            // InternalTurtle.g:1124:3: (this_ID_2= RULE_ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTurtle.g:1125:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    				newLeafNode(this_ID_2, grammarAccess.getValueAccess().getIDTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalTurtle.g:1130:3: (otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTurtle.g:1131:4: otherlv_3= '^^' ( (lv_xsdType_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_3_0());
                    			
                    // InternalTurtle.g:1135:4: ( (lv_xsdType_4_0= ruleEString ) )
                    // InternalTurtle.g:1136:5: (lv_xsdType_4_0= ruleEString )
                    {
                    // InternalTurtle.g:1136:5: (lv_xsdType_4_0= ruleEString )
                    // InternalTurtle.g:1137:6: lv_xsdType_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_xsdType_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						set(
                    							current,
                    							"xsdType",
                    							lv_xsdType_4_0,
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
    // InternalTurtle.g:1159:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTurtle.g:1159:47: (iv_ruleEString= ruleEString EOF )
            // InternalTurtle.g:1160:2: iv_ruleEString= ruleEString EOF
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
    // InternalTurtle.g:1166:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTurtle.g:1172:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTurtle.g:1173:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTurtle.g:1173:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTurtle.g:1174:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1182:3: this_ID_1= RULE_ID
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
    // InternalTurtle.g:1193:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:message' ) | (enumLiteral_18= 'sh:equals' ) | (enumLiteral_19= 'sh:minExclusive' ) | (enumLiteral_20= 'sh:minInclusive' ) | (enumLiteral_21= 'sh:maxExclusive' ) | (enumLiteral_22= 'sh:maxInclusive' ) | (enumLiteral_23= 'sh:maxLength' ) | (enumLiteral_24= 'sh:minLength' ) | (enumLiteral_25= 'sh:qualifiedValueShape' ) | (enumLiteral_26= 'sh:qualifiedMaxCount' ) | (enumLiteral_27= 'sh:qualifiedMinCount' ) | (enumLiteral_28= 'a' ) | (enumLiteral_29= 'rdfs:label' ) | (enumLiteral_30= 'sh:description' ) ) ;
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
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;


        	enterRule();

        try {
            // InternalTurtle.g:1199:2: ( ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:message' ) | (enumLiteral_18= 'sh:equals' ) | (enumLiteral_19= 'sh:minExclusive' ) | (enumLiteral_20= 'sh:minInclusive' ) | (enumLiteral_21= 'sh:maxExclusive' ) | (enumLiteral_22= 'sh:maxInclusive' ) | (enumLiteral_23= 'sh:maxLength' ) | (enumLiteral_24= 'sh:minLength' ) | (enumLiteral_25= 'sh:qualifiedValueShape' ) | (enumLiteral_26= 'sh:qualifiedMaxCount' ) | (enumLiteral_27= 'sh:qualifiedMinCount' ) | (enumLiteral_28= 'a' ) | (enumLiteral_29= 'rdfs:label' ) | (enumLiteral_30= 'sh:description' ) ) )
            // InternalTurtle.g:1200:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:message' ) | (enumLiteral_18= 'sh:equals' ) | (enumLiteral_19= 'sh:minExclusive' ) | (enumLiteral_20= 'sh:minInclusive' ) | (enumLiteral_21= 'sh:maxExclusive' ) | (enumLiteral_22= 'sh:maxInclusive' ) | (enumLiteral_23= 'sh:maxLength' ) | (enumLiteral_24= 'sh:minLength' ) | (enumLiteral_25= 'sh:qualifiedValueShape' ) | (enumLiteral_26= 'sh:qualifiedMaxCount' ) | (enumLiteral_27= 'sh:qualifiedMinCount' ) | (enumLiteral_28= 'a' ) | (enumLiteral_29= 'rdfs:label' ) | (enumLiteral_30= 'sh:description' ) )
            {
            // InternalTurtle.g:1200:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:message' ) | (enumLiteral_18= 'sh:equals' ) | (enumLiteral_19= 'sh:minExclusive' ) | (enumLiteral_20= 'sh:minInclusive' ) | (enumLiteral_21= 'sh:maxExclusive' ) | (enumLiteral_22= 'sh:maxInclusive' ) | (enumLiteral_23= 'sh:maxLength' ) | (enumLiteral_24= 'sh:minLength' ) | (enumLiteral_25= 'sh:qualifiedValueShape' ) | (enumLiteral_26= 'sh:qualifiedMaxCount' ) | (enumLiteral_27= 'sh:qualifiedMinCount' ) | (enumLiteral_28= 'a' ) | (enumLiteral_29= 'rdfs:label' ) | (enumLiteral_30= 'sh:description' ) )
            int alt22=31;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt22=1;
                }
                break;
            case 24:
                {
                alt22=2;
                }
                break;
            case 25:
                {
                alt22=3;
                }
                break;
            case 26:
                {
                alt22=4;
                }
                break;
            case 27:
                {
                alt22=5;
                }
                break;
            case 28:
                {
                alt22=6;
                }
                break;
            case 29:
                {
                alt22=7;
                }
                break;
            case 30:
                {
                alt22=8;
                }
                break;
            case 31:
                {
                alt22=9;
                }
                break;
            case 32:
                {
                alt22=10;
                }
                break;
            case 33:
                {
                alt22=11;
                }
                break;
            case 34:
                {
                alt22=12;
                }
                break;
            case 35:
                {
                alt22=13;
                }
                break;
            case 36:
                {
                alt22=14;
                }
                break;
            case 37:
                {
                alt22=15;
                }
                break;
            case 38:
                {
                alt22=16;
                }
                break;
            case 39:
                {
                alt22=17;
                }
                break;
            case 40:
                {
                alt22=18;
                }
                break;
            case 41:
                {
                alt22=19;
                }
                break;
            case 42:
                {
                alt22=20;
                }
                break;
            case 43:
                {
                alt22=21;
                }
                break;
            case 44:
                {
                alt22=22;
                }
                break;
            case 45:
                {
                alt22=23;
                }
                break;
            case 46:
                {
                alt22=24;
                }
                break;
            case 47:
                {
                alt22=25;
                }
                break;
            case 48:
                {
                alt22=26;
                }
                break;
            case 49:
                {
                alt22=27;
                }
                break;
            case 50:
                {
                alt22=28;
                }
                break;
            case 51:
                {
                alt22=29;
                }
                break;
            case 52:
                {
                alt22=30;
                }
                break;
            case 53:
                {
                alt22=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTurtle.g:1201:3: (enumLiteral_0= 'sh:minCount' )
                    {
                    // InternalTurtle.g:1201:3: (enumLiteral_0= 'sh:minCount' )
                    // InternalTurtle.g:1202:4: enumLiteral_0= 'sh:minCount'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1209:3: (enumLiteral_1= 'sh:maxCount' )
                    {
                    // InternalTurtle.g:1209:3: (enumLiteral_1= 'sh:maxCount' )
                    // InternalTurtle.g:1210:4: enumLiteral_1= 'sh:maxCount'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:1217:3: (enumLiteral_2= 'sh:and' )
                    {
                    // InternalTurtle.g:1217:3: (enumLiteral_2= 'sh:and' )
                    // InternalTurtle.g:1218:4: enumLiteral_2= 'sh:and'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:1225:3: (enumLiteral_3= 'sh:or' )
                    {
                    // InternalTurtle.g:1225:3: (enumLiteral_3= 'sh:or' )
                    // InternalTurtle.g:1226:4: enumLiteral_3= 'sh:or'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:1233:3: (enumLiteral_4= 'sh:not' )
                    {
                    // InternalTurtle.g:1233:3: (enumLiteral_4= 'sh:not' )
                    // InternalTurtle.g:1234:4: enumLiteral_4= 'sh:not'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:1241:3: (enumLiteral_5= 'sh:class' )
                    {
                    // InternalTurtle.g:1241:3: (enumLiteral_5= 'sh:class' )
                    // InternalTurtle.g:1242:4: enumLiteral_5= 'sh:class'
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:1249:3: (enumLiteral_6= 'sh:hasValue' )
                    {
                    // InternalTurtle.g:1249:3: (enumLiteral_6= 'sh:hasValue' )
                    // InternalTurtle.g:1250:4: enumLiteral_6= 'sh:hasValue'
                    {
                    enumLiteral_6=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:1257:3: (enumLiteral_7= 'sh:nodeKind' )
                    {
                    // InternalTurtle.g:1257:3: (enumLiteral_7= 'sh:nodeKind' )
                    // InternalTurtle.g:1258:4: enumLiteral_7= 'sh:nodeKind'
                    {
                    enumLiteral_7=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:1265:3: (enumLiteral_8= 'sh:node' )
                    {
                    // InternalTurtle.g:1265:3: (enumLiteral_8= 'sh:node' )
                    // InternalTurtle.g:1266:4: enumLiteral_8= 'sh:node'
                    {
                    enumLiteral_8=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:1273:3: (enumLiteral_9= 'sh:datatype' )
                    {
                    // InternalTurtle.g:1273:3: (enumLiteral_9= 'sh:datatype' )
                    // InternalTurtle.g:1274:4: enumLiteral_9= 'sh:datatype'
                    {
                    enumLiteral_9=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:1281:3: (enumLiteral_10= 'sh:pattern' )
                    {
                    // InternalTurtle.g:1281:3: (enumLiteral_10= 'sh:pattern' )
                    // InternalTurtle.g:1282:4: enumLiteral_10= 'sh:pattern'
                    {
                    enumLiteral_10=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:1289:3: (enumLiteral_11= 'sh:closed' )
                    {
                    // InternalTurtle.g:1289:3: (enumLiteral_11= 'sh:closed' )
                    // InternalTurtle.g:1290:4: enumLiteral_11= 'sh:closed'
                    {
                    enumLiteral_11=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:1297:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    {
                    // InternalTurtle.g:1297:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    // InternalTurtle.g:1298:4: enumLiteral_12= 'sh:ignoredProperties'
                    {
                    enumLiteral_12=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:1305:3: (enumLiteral_13= 'sh:path' )
                    {
                    // InternalTurtle.g:1305:3: (enumLiteral_13= 'sh:path' )
                    // InternalTurtle.g:1306:4: enumLiteral_13= 'sh:path'
                    {
                    enumLiteral_13=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:1313:3: (enumLiteral_14= 'sh:inversePath' )
                    {
                    // InternalTurtle.g:1313:3: (enumLiteral_14= 'sh:inversePath' )
                    // InternalTurtle.g:1314:4: enumLiteral_14= 'sh:inversePath'
                    {
                    enumLiteral_14=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:1321:3: (enumLiteral_15= 'sh:property' )
                    {
                    // InternalTurtle.g:1321:3: (enumLiteral_15= 'sh:property' )
                    // InternalTurtle.g:1322:4: enumLiteral_15= 'sh:property'
                    {
                    enumLiteral_15=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:1329:3: (enumLiteral_16= 'sh:name' )
                    {
                    // InternalTurtle.g:1329:3: (enumLiteral_16= 'sh:name' )
                    // InternalTurtle.g:1330:4: enumLiteral_16= 'sh:name'
                    {
                    enumLiteral_16=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:1337:3: (enumLiteral_17= 'sh:message' )
                    {
                    // InternalTurtle.g:1337:3: (enumLiteral_17= 'sh:message' )
                    // InternalTurtle.g:1338:4: enumLiteral_17= 'sh:message'
                    {
                    enumLiteral_17=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:1345:3: (enumLiteral_18= 'sh:equals' )
                    {
                    // InternalTurtle.g:1345:3: (enumLiteral_18= 'sh:equals' )
                    // InternalTurtle.g:1346:4: enumLiteral_18= 'sh:equals'
                    {
                    enumLiteral_18=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalTurtle.g:1353:3: (enumLiteral_19= 'sh:minExclusive' )
                    {
                    // InternalTurtle.g:1353:3: (enumLiteral_19= 'sh:minExclusive' )
                    // InternalTurtle.g:1354:4: enumLiteral_19= 'sh:minExclusive'
                    {
                    enumLiteral_19=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalTurtle.g:1361:3: (enumLiteral_20= 'sh:minInclusive' )
                    {
                    // InternalTurtle.g:1361:3: (enumLiteral_20= 'sh:minInclusive' )
                    // InternalTurtle.g:1362:4: enumLiteral_20= 'sh:minInclusive'
                    {
                    enumLiteral_20=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalTurtle.g:1369:3: (enumLiteral_21= 'sh:maxExclusive' )
                    {
                    // InternalTurtle.g:1369:3: (enumLiteral_21= 'sh:maxExclusive' )
                    // InternalTurtle.g:1370:4: enumLiteral_21= 'sh:maxExclusive'
                    {
                    enumLiteral_21=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalTurtle.g:1377:3: (enumLiteral_22= 'sh:maxInclusive' )
                    {
                    // InternalTurtle.g:1377:3: (enumLiteral_22= 'sh:maxInclusive' )
                    // InternalTurtle.g:1378:4: enumLiteral_22= 'sh:maxInclusive'
                    {
                    enumLiteral_22=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalTurtle.g:1385:3: (enumLiteral_23= 'sh:maxLength' )
                    {
                    // InternalTurtle.g:1385:3: (enumLiteral_23= 'sh:maxLength' )
                    // InternalTurtle.g:1386:4: enumLiteral_23= 'sh:maxLength'
                    {
                    enumLiteral_23=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalTurtle.g:1393:3: (enumLiteral_24= 'sh:minLength' )
                    {
                    // InternalTurtle.g:1393:3: (enumLiteral_24= 'sh:minLength' )
                    // InternalTurtle.g:1394:4: enumLiteral_24= 'sh:minLength'
                    {
                    enumLiteral_24=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalTurtle.g:1401:3: (enumLiteral_25= 'sh:qualifiedValueShape' )
                    {
                    // InternalTurtle.g:1401:3: (enumLiteral_25= 'sh:qualifiedValueShape' )
                    // InternalTurtle.g:1402:4: enumLiteral_25= 'sh:qualifiedValueShape'
                    {
                    enumLiteral_25=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalTurtle.g:1409:3: (enumLiteral_26= 'sh:qualifiedMaxCount' )
                    {
                    // InternalTurtle.g:1409:3: (enumLiteral_26= 'sh:qualifiedMaxCount' )
                    // InternalTurtle.g:1410:4: enumLiteral_26= 'sh:qualifiedMaxCount'
                    {
                    enumLiteral_26=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalTurtle.g:1417:3: (enumLiteral_27= 'sh:qualifiedMinCount' )
                    {
                    // InternalTurtle.g:1417:3: (enumLiteral_27= 'sh:qualifiedMinCount' )
                    // InternalTurtle.g:1418:4: enumLiteral_27= 'sh:qualifiedMinCount'
                    {
                    enumLiteral_27=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalTurtle.g:1425:3: (enumLiteral_28= 'a' )
                    {
                    // InternalTurtle.g:1425:3: (enumLiteral_28= 'a' )
                    // InternalTurtle.g:1426:4: enumLiteral_28= 'a'
                    {
                    enumLiteral_28=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalTurtle.g:1433:3: (enumLiteral_29= 'rdfs:label' )
                    {
                    // InternalTurtle.g:1433:3: (enumLiteral_29= 'rdfs:label' )
                    // InternalTurtle.g:1434:4: enumLiteral_29= 'rdfs:label'
                    {
                    enumLiteral_29=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalTurtle.g:1441:3: (enumLiteral_30= 'sh:description' )
                    {
                    // InternalTurtle.g:1441:3: (enumLiteral_30= 'sh:description' )
                    // InternalTurtle.g:1442:4: enumLiteral_30= 'sh:description'
                    {
                    enumLiteral_30=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30());
                    			

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\43\uffff";
    static final String dfa_2s = "\1\25\37\4\3\uffff";
    static final String dfa_3s = "\1\65\37\25\3\uffff";
    static final String dfa_4s = "\40\uffff\1\3\1\1\1\2";
    static final String dfa_5s = "\43\uffff}>";
    static final String[] dfa_6s = {
            "\1\40\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "\3\41\14\uffff\1\42\1\uffff\1\40",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "869:3: ( ( ( (lv_type_1_0= rulePropertyType ) ) ( (lv_values_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValue ) ) )* ) | ( ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= '(' ( ( (lv_values_7_0= ruleValue ) ) | ( (lv_shapeExpressions_8_0= ruleShapeExpression ) )* ) otherlv_9= ')' ) | ( ( (lv_type_10_0= rulePropertyType ) )? otherlv_11= '[' ( (lv_shapeExpressions_12_0= ruleShapeExpression ) )* otherlv_13= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x003FFFFFFFA30000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x003FFFFFFFA32000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003FFFFFFFB30070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x003FFFFFFFB30000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x003FFFFFFFE30000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008012L});

}