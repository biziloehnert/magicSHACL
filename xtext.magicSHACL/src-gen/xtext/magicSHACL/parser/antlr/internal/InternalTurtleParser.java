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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PREFIX", "RULE_UNICODE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<>'", "'.'", "'@prefix'", "'<'", "'>'", "';'", "'a'", "'sh:NodeShape'", "'['", "'sh:property'", "'sh:path'", "']'", "'('", "')'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:inversePath'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'"
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    // InternalTurtle.g:72:1: ruleGraph returns [EObject current=null] : ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ( ( ruleEString )* otherlv_6= '.' )? ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_namespaces_1_0 = null;

        EObject lv_dataGraph_2_0 = null;

        EObject lv_shapesGraph_3_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:78:2: ( ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ( ( ruleEString )* otherlv_6= '.' )? ) )
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ( ( ruleEString )* otherlv_6= '.' )? )
            {
            // InternalTurtle.g:79:2: ( () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ( ( ruleEString )* otherlv_6= '.' )? )
            // InternalTurtle.g:80:3: () ( (lv_namespaces_1_0= ruleNamespace ) )* ( (lv_dataGraph_2_0= ruleDataGraph ) ) ( (lv_shapesGraph_3_0= ruleShapesGraph ) ) otherlv_4= '<>' ( ( ruleEString )* otherlv_6= '.' )?
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

                if ( (LA1_0==15) ) {
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

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getLessThanSignGreaterThanSignKeyword_4());
            		
            // InternalTurtle.g:148:3: ( ( ruleEString )* otherlv_6= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:149:4: ( ruleEString )* otherlv_6= '.'
                    {
                    // InternalTurtle.g:149:4: ( ruleEString )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTurtle.g:150:5: ruleEString
                    	    {

                    	    					newCompositeNode(grammarAccess.getGraphAccess().getEStringParserRuleCall_5_0());
                    	    				
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getFullStopKeyword_5_1());
                    			

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleNamespace"
    // InternalTurtle.g:167:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalTurtle.g:167:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalTurtle.g:168:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalTurtle.g:174:1: ruleNamespace returns [EObject current=null] : (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' ) ;
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
            // InternalTurtle.g:180:2: ( (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' ) )
            // InternalTurtle.g:181:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' )
            {
            // InternalTurtle.g:181:2: (otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.' )
            // InternalTurtle.g:182:3: otherlv_0= '@prefix' ( (lv_prefix_1_0= RULE_PREFIX ) ) otherlv_2= '<' ( (lv_namespace_3_0= RULE_UNICODE ) ) otherlv_4= '>' otherlv_5= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getPrefixKeyword_0());
            		
            // InternalTurtle.g:186:3: ( (lv_prefix_1_0= RULE_PREFIX ) )
            // InternalTurtle.g:187:4: (lv_prefix_1_0= RULE_PREFIX )
            {
            // InternalTurtle.g:187:4: (lv_prefix_1_0= RULE_PREFIX )
            // InternalTurtle.g:188:5: lv_prefix_1_0= RULE_PREFIX
            {
            lv_prefix_1_0=(Token)match(input,RULE_PREFIX,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLessThanSignKeyword_2());
            		
            // InternalTurtle.g:208:3: ( (lv_namespace_3_0= RULE_UNICODE ) )
            // InternalTurtle.g:209:4: (lv_namespace_3_0= RULE_UNICODE )
            {
            // InternalTurtle.g:209:4: (lv_namespace_3_0= RULE_UNICODE )
            // InternalTurtle.g:210:5: lv_namespace_3_0= RULE_UNICODE
            {
            lv_namespace_3_0=(Token)match(input,RULE_UNICODE,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalTurtle.g:238:1: entryRuleDataGraph returns [EObject current=null] : iv_ruleDataGraph= ruleDataGraph EOF ;
    public final EObject entryRuleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataGraph = null;


        try {
            // InternalTurtle.g:238:50: (iv_ruleDataGraph= ruleDataGraph EOF )
            // InternalTurtle.g:239:2: iv_ruleDataGraph= ruleDataGraph EOF
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
    // InternalTurtle.g:245:1: ruleDataGraph returns [EObject current=null] : ( () ( (lv_triples_1_0= ruleTriples ) )* ) ;
    public final EObject ruleDataGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_triples_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:251:2: ( ( () ( (lv_triples_1_0= ruleTriples ) )* ) )
            // InternalTurtle.g:252:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            {
            // InternalTurtle.g:252:2: ( () ( (lv_triples_1_0= ruleTriples ) )* )
            // InternalTurtle.g:253:3: () ( (lv_triples_1_0= ruleTriples ) )*
            {
            // InternalTurtle.g:253:3: ()
            // InternalTurtle.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataGraphAccess().getDataGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:260:3: ( (lv_triples_1_0= ruleTriples ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_UNICODE) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_UNICODE) ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3==RULE_UNICODE) ) {
                            alt4=1;
                        }


                    }
                    else if ( (LA4_1==14) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalTurtle.g:261:4: (lv_triples_1_0= ruleTriples )
            	    {
            	    // InternalTurtle.g:261:4: (lv_triples_1_0= ruleTriples )
            	    // InternalTurtle.g:262:5: lv_triples_1_0= ruleTriples
            	    {

            	    					newCompositeNode(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleDataGraph"


    // $ANTLR start "entryRuleTriples"
    // InternalTurtle.g:283:1: entryRuleTriples returns [EObject current=null] : iv_ruleTriples= ruleTriples EOF ;
    public final EObject entryRuleTriples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriples = null;


        try {
            // InternalTurtle.g:283:48: (iv_ruleTriples= ruleTriples EOF )
            // InternalTurtle.g:284:2: iv_ruleTriples= ruleTriples EOF
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
    // InternalTurtle.g:290:1: ruleTriples returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) ;
    public final EObject ruleTriples() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_subject_0_0 = null;

        EObject lv_predicateobject_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:296:2: ( ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' ) )
            // InternalTurtle.g:297:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            {
            // InternalTurtle.g:297:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.' )
            // InternalTurtle.g:298:3: ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateobject_1_0= rulePredicateObject ) )* otherlv_2= '.'
            {
            // InternalTurtle.g:298:3: ( (lv_subject_0_0= ruleSubject ) )
            // InternalTurtle.g:299:4: (lv_subject_0_0= ruleSubject )
            {
            // InternalTurtle.g:299:4: (lv_subject_0_0= ruleSubject )
            // InternalTurtle.g:300:5: lv_subject_0_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalTurtle.g:317:3: ( (lv_predicateobject_1_0= rulePredicateObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_UNICODE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:318:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    {
            	    // InternalTurtle.g:318:4: (lv_predicateobject_1_0= rulePredicateObject )
            	    // InternalTurtle.g:319:5: lv_predicateobject_1_0= rulePredicateObject
            	    {

            	    					newCompositeNode(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop5;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalTurtle.g:344:1: entryRulePredicateObject returns [EObject current=null] : iv_rulePredicateObject= rulePredicateObject EOF ;
    public final EObject entryRulePredicateObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObject = null;


        try {
            // InternalTurtle.g:344:56: (iv_rulePredicateObject= rulePredicateObject EOF )
            // InternalTurtle.g:345:2: iv_rulePredicateObject= rulePredicateObject EOF
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
    // InternalTurtle.g:351:1: rulePredicateObject returns [EObject current=null] : ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePredicateObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_object_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:357:2: ( ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' ) )
            // InternalTurtle.g:358:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            {
            // InternalTurtle.g:358:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';' )
            // InternalTurtle.g:359:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) ) otherlv_2= ';'
            {
            // InternalTurtle.g:359:3: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) ) )
            // InternalTurtle.g:360:4: ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_object_1_0= ruleObject ) )
            {
            // InternalTurtle.g:360:4: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalTurtle.g:361:5: (lv_predicate_0_0= rulePredicate )
            {
            // InternalTurtle.g:361:5: (lv_predicate_0_0= rulePredicate )
            // InternalTurtle.g:362:6: lv_predicate_0_0= rulePredicate
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

            // InternalTurtle.g:379:4: ( (lv_object_1_0= ruleObject ) )
            // InternalTurtle.g:380:5: (lv_object_1_0= ruleObject )
            {
            // InternalTurtle.g:380:5: (lv_object_1_0= ruleObject )
            // InternalTurtle.g:381:6: lv_object_1_0= ruleObject
            {

            						newCompositeNode(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:407:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalTurtle.g:407:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalTurtle.g:408:2: iv_ruleSubject= ruleSubject EOF
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
    // InternalTurtle.g:414:1: ruleSubject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:420:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:421:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:421:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:422:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:422:3: ()
            // InternalTurtle.g:423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubjectAccess().getSubjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:429:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:430:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:430:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:431:5: lv_name_1_0= RULE_UNICODE
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
    // InternalTurtle.g:451:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalTurtle.g:451:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalTurtle.g:452:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalTurtle.g:458:1: rulePredicate returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:464:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:465:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:465:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:466:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:466:3: ()
            // InternalTurtle.g:467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredicateAccess().getPredicateAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:473:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:474:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:474:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:475:5: lv_name_1_0= RULE_UNICODE
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
    // InternalTurtle.g:495:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTurtle.g:497:2: (iv_ruleObject= ruleObject EOF )
            // InternalTurtle.g:498:2: iv_ruleObject= ruleObject EOF
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
    // InternalTurtle.g:507:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTurtle.g:514:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:515:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:515:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:516:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:516:3: ()
            // InternalTurtle.g:517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:523:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:524:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:524:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:525:5: lv_name_1_0= RULE_UNICODE
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
    // InternalTurtle.g:548:1: entryRuleShapesGraph returns [EObject current=null] : iv_ruleShapesGraph= ruleShapesGraph EOF ;
    public final EObject entryRuleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapesGraph = null;


        try {
            // InternalTurtle.g:548:52: (iv_ruleShapesGraph= ruleShapesGraph EOF )
            // InternalTurtle.g:549:2: iv_ruleShapesGraph= ruleShapesGraph EOF
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
    // InternalTurtle.g:555:1: ruleShapesGraph returns [EObject current=null] : ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) ;
    public final EObject ruleShapesGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_shapeConstraints_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:561:2: ( ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* ) )
            // InternalTurtle.g:562:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            {
            // InternalTurtle.g:562:2: ( () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )* )
            // InternalTurtle.g:563:3: () ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            {
            // InternalTurtle.g:563:3: ()
            // InternalTurtle.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:570:3: ( (lv_shapeConstraints_1_0= ruleShapeConstraint ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_UNICODE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTurtle.g:571:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    {
            	    // InternalTurtle.g:571:4: (lv_shapeConstraints_1_0= ruleShapeConstraint )
            	    // InternalTurtle.g:572:5: lv_shapeConstraints_1_0= ruleShapeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // InternalTurtle.g:593:1: entryRuleShapeConstraint returns [EObject current=null] : iv_ruleShapeConstraint= ruleShapeConstraint EOF ;
    public final EObject entryRuleShapeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstraint = null;


        try {
            // InternalTurtle.g:593:56: (iv_ruleShapeConstraint= ruleShapeConstraint EOF )
            // InternalTurtle.g:594:2: iv_ruleShapeConstraint= ruleShapeConstraint EOF
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
    // InternalTurtle.g:600:1: ruleShapeConstraint returns [EObject current=null] : ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' ) ;
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
            // InternalTurtle.g:606:2: ( ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' ) )
            // InternalTurtle.g:607:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' )
            {
            // InternalTurtle.g:607:2: ( () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.' )
            // InternalTurtle.g:608:3: () ( (lv_shapeName_1_0= ruleShapeName ) ) ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) ) ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )* otherlv_8= '.'
            {
            // InternalTurtle.g:608:3: ()
            // InternalTurtle.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:615:3: ( (lv_shapeName_1_0= ruleShapeName ) )
            // InternalTurtle.g:616:4: (lv_shapeName_1_0= ruleShapeName )
            {
            // InternalTurtle.g:616:4: (lv_shapeName_1_0= ruleShapeName )
            // InternalTurtle.g:617:5: lv_shapeName_1_0= ruleShapeName
            {

            					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalTurtle.g:634:3: ( ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' ) | ( (lv_shapeExpressions_6_0= ruleShapeExpression ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_UNICODE||LA8_0==19) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=22 && LA8_0<=23)||(LA8_0>=27 && LA8_0<=43)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtle.g:635:4: ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' )
                    {
                    // InternalTurtle.g:635:4: ( (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';' )
                    // InternalTurtle.g:636:5: (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' ) otherlv_4= 'sh:NodeShape' otherlv_5= ';'
                    {
                    // InternalTurtle.g:636:5: (this_UNICODE_2= RULE_UNICODE | otherlv_3= 'a' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_UNICODE) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==19) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTurtle.g:637:6: this_UNICODE_2= RULE_UNICODE
                            {
                            this_UNICODE_2=(Token)match(input,RULE_UNICODE,FOLLOW_17); 

                            						newLeafNode(this_UNICODE_2, grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTurtle.g:642:6: otherlv_3= 'a'
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_17); 

                            						newLeafNode(otherlv_3, grammarAccess.getShapeConstraintAccess().getAKeyword_2_0_0_1());
                            					

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getShapeConstraintAccess().getShNodeShapeKeyword_2_0_1());
                    				
                    otherlv_5=(Token)match(input,18,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:657:4: ( (lv_shapeExpressions_6_0= ruleShapeExpression ) )
                    {
                    // InternalTurtle.g:657:4: ( (lv_shapeExpressions_6_0= ruleShapeExpression ) )
                    // InternalTurtle.g:658:5: (lv_shapeExpressions_6_0= ruleShapeExpression )
                    {
                    // InternalTurtle.g:658:5: (lv_shapeExpressions_6_0= ruleShapeExpression )
                    // InternalTurtle.g:659:6: lv_shapeExpressions_6_0= ruleShapeExpression
                    {

                    						newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalTurtle.g:677:3: ( (lv_shapeExpressions_7_0= ruleShapeExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=23)||(LA9_0>=27 && LA9_0<=43)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTurtle.g:678:4: (lv_shapeExpressions_7_0= ruleShapeExpression )
            	    {
            	    // InternalTurtle.g:678:4: (lv_shapeExpressions_7_0= ruleShapeExpression )
            	    // InternalTurtle.g:679:5: lv_shapeExpressions_7_0= ruleShapeExpression
            	    {

            	    					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalTurtle.g:704:1: entryRuleShapeName returns [EObject current=null] : iv_ruleShapeName= ruleShapeName EOF ;
    public final EObject entryRuleShapeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeName = null;


        try {
            // InternalTurtle.g:704:50: (iv_ruleShapeName= ruleShapeName EOF )
            // InternalTurtle.g:705:2: iv_ruleShapeName= ruleShapeName EOF
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
    // InternalTurtle.g:711:1: ruleShapeName returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleShapeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:717:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:718:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:718:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:719:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:719:3: ()
            // InternalTurtle.g:720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:726:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:727:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:727:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:728:5: lv_name_1_0= RULE_UNICODE
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
    // InternalTurtle.g:748:1: entryRuleShapeExpression returns [EObject current=null] : iv_ruleShapeExpression= ruleShapeExpression EOF ;
    public final EObject entryRuleShapeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeExpression = null;


        try {
            // InternalTurtle.g:748:56: (iv_ruleShapeExpression= ruleShapeExpression EOF )
            // InternalTurtle.g:749:2: iv_ruleShapeExpression= ruleShapeExpression EOF
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
    // InternalTurtle.g:755:1: ruleShapeExpression returns [EObject current=null] : ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) ) ;
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
            // InternalTurtle.g:761:2: ( ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) ) )
            // InternalTurtle.g:762:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )
            {
            // InternalTurtle.g:762:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalTurtle.g:763:3: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) )
                    {
                    // InternalTurtle.g:763:3: ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) )
                    // InternalTurtle.g:764:4: () ( (lv_propertyValues_1_0= rulePropertyValues ) )
                    {
                    // InternalTurtle.g:764:4: ()
                    // InternalTurtle.g:765:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTurtle.g:771:4: ( (lv_propertyValues_1_0= rulePropertyValues ) )
                    // InternalTurtle.g:772:5: (lv_propertyValues_1_0= rulePropertyValues )
                    {
                    // InternalTurtle.g:772:5: (lv_propertyValues_1_0= rulePropertyValues )
                    // InternalTurtle.g:773:6: lv_propertyValues_1_0= rulePropertyValues
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
                    // InternalTurtle.g:792:3: ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ )
                    {
                    // InternalTurtle.g:792:3: ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ )
                    // InternalTurtle.g:793:4: ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+
                    {
                    // InternalTurtle.g:793:4: ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' )
                    // InternalTurtle.g:794:5: ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '['
                    {
                    // InternalTurtle.g:794:5: ( (lv_type_2_0= rulePropertyType ) )
                    // InternalTurtle.g:795:6: (lv_type_2_0= rulePropertyType )
                    {
                    // InternalTurtle.g:795:6: (lv_type_2_0= rulePropertyType )
                    // InternalTurtle.g:796:7: lv_type_2_0= rulePropertyType
                    {

                    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_19);
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

                    otherlv_3=(Token)match(input,21,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_0_1());
                    				

                    }

                    // InternalTurtle.g:818:4: ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_UNICODE||LA11_0==19) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTurtle.g:819:5: (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';'
                            {
                            // InternalTurtle.g:819:5: (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' )
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==RULE_UNICODE) ) {
                                alt10=1;
                            }
                            else if ( (LA10_0==19) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalTurtle.g:820:6: this_UNICODE_4= RULE_UNICODE
                                    {
                                    this_UNICODE_4=(Token)match(input,RULE_UNICODE,FOLLOW_17); 

                                    						newLeafNode(this_UNICODE_4, grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalTurtle.g:825:6: otherlv_5= 'a'
                                    {
                                    otherlv_5=(Token)match(input,19,FOLLOW_17); 

                                    						newLeafNode(otherlv_5, grammarAccess.getShapeExpressionAccess().getAKeyword_1_1_0_1());
                                    					

                                    }
                                    break;

                            }

                            otherlv_6=(Token)match(input,20,FOLLOW_15); 

                            					newLeafNode(otherlv_6, grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_1_1_1());
                            				
                            otherlv_7=(Token)match(input,18,FOLLOW_21); 

                            					newLeafNode(otherlv_7, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_1_2());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:839:4: ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==21) ) {
                            alt13=1;
                        }
                    }
                    else if ( (LA13_0==23) ) {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==21) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTurtle.g:840:5: (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '['
                            {
                            // InternalTurtle.g:840:5: (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==22) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==23) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // InternalTurtle.g:841:6: otherlv_8= 'sh:property'
                                    {
                                    otherlv_8=(Token)match(input,22,FOLLOW_19); 

                                    						newLeafNode(otherlv_8, grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalTurtle.g:846:6: otherlv_9= 'sh:path'
                                    {
                                    otherlv_9=(Token)match(input,23,FOLLOW_19); 

                                    						newLeafNode(otherlv_9, grammarAccess.getShapeExpressionAccess().getShPathKeyword_1_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            otherlv_10=(Token)match(input,21,FOLLOW_21); 

                            					newLeafNode(otherlv_10, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalTurtle.g:856:4: ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // InternalTurtle.g:857:5: ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';'
                    	    {
                    	    // InternalTurtle.g:857:5: ( (lv_propertyValues_11_0= rulePropertyValues ) )*
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( ((LA14_0>=22 && LA14_0<=23)||(LA14_0>=27 && LA14_0<=43)) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // InternalTurtle.g:858:6: (lv_propertyValues_11_0= rulePropertyValues )
                    	    	    {
                    	    	    // InternalTurtle.g:858:6: (lv_propertyValues_11_0= rulePropertyValues )
                    	    	    // InternalTurtle.g:859:7: lv_propertyValues_11_0= rulePropertyValues
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_3_0_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_21);
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
                    	    	    break loop14;
                    	        }
                    	    } while (true);

                    	    otherlv_12=(Token)match(input,24,FOLLOW_15); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_3_1());
                    	    				
                    	    otherlv_13=(Token)match(input,18,FOLLOW_22); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_3_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // InternalTurtle.g:890:1: entryRulePropertyValues returns [EObject current=null] : iv_rulePropertyValues= rulePropertyValues EOF ;
    public final EObject entryRulePropertyValues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValues = null;


        try {
            // InternalTurtle.g:890:55: (iv_rulePropertyValues= rulePropertyValues EOF )
            // InternalTurtle.g:891:2: iv_rulePropertyValues= rulePropertyValues EOF
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
    // InternalTurtle.g:897:1: rulePropertyValues returns [EObject current=null] : ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' ) ;
    public final EObject rulePropertyValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_property_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:903:2: ( ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' ) )
            // InternalTurtle.g:904:2: ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' )
            {
            // InternalTurtle.g:904:2: ( ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';' )
            // InternalTurtle.g:905:3: ( (lv_property_0_0= ruleProperty ) ) (otherlv_1= '(' )? ( (lv_values_2_0= ruleValue ) )* (otherlv_3= ')' )? otherlv_4= ';'
            {
            // InternalTurtle.g:905:3: ( (lv_property_0_0= ruleProperty ) )
            // InternalTurtle.g:906:4: (lv_property_0_0= ruleProperty )
            {
            // InternalTurtle.g:906:4: (lv_property_0_0= ruleProperty )
            // InternalTurtle.g:907:5: lv_property_0_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalTurtle.g:924:3: (otherlv_1= '(' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTurtle.g:925:4: otherlv_1= '('
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertyValuesAccess().getLeftParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTurtle.g:930:3: ( (lv_values_2_0= ruleValue ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_UNICODE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTurtle.g:931:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalTurtle.g:931:4: (lv_values_2_0= ruleValue )
            	    // InternalTurtle.g:932:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop18;
                }
            } while (true);

            // InternalTurtle.g:949:3: (otherlv_3= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTurtle.g:950:4: otherlv_3= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_15); 

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
    // InternalTurtle.g:963:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalTurtle.g:963:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalTurtle.g:964:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalTurtle.g:970:1: ruleProperty returns [EObject current=null] : ( () ( (lv_type_1_0= rulePropertyType ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalTurtle.g:976:2: ( ( () ( (lv_type_1_0= rulePropertyType ) ) ) )
            // InternalTurtle.g:977:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            {
            // InternalTurtle.g:977:2: ( () ( (lv_type_1_0= rulePropertyType ) ) )
            // InternalTurtle.g:978:3: () ( (lv_type_1_0= rulePropertyType ) )
            {
            // InternalTurtle.g:978:3: ()
            // InternalTurtle.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:985:3: ( (lv_type_1_0= rulePropertyType ) )
            // InternalTurtle.g:986:4: (lv_type_1_0= rulePropertyType )
            {
            // InternalTurtle.g:986:4: (lv_type_1_0= rulePropertyType )
            // InternalTurtle.g:987:5: lv_type_1_0= rulePropertyType
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
    // InternalTurtle.g:1008:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalTurtle.g:1008:46: (iv_ruleValue= ruleValue EOF )
            // InternalTurtle.g:1009:2: iv_ruleValue= ruleValue EOF
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
    // InternalTurtle.g:1015:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTurtle.g:1021:2: ( ( () ( (lv_name_1_0= RULE_UNICODE ) ) ) )
            // InternalTurtle.g:1022:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            {
            // InternalTurtle.g:1022:2: ( () ( (lv_name_1_0= RULE_UNICODE ) ) )
            // InternalTurtle.g:1023:3: () ( (lv_name_1_0= RULE_UNICODE ) )
            {
            // InternalTurtle.g:1023:3: ()
            // InternalTurtle.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalTurtle.g:1030:3: ( (lv_name_1_0= RULE_UNICODE ) )
            // InternalTurtle.g:1031:4: (lv_name_1_0= RULE_UNICODE )
            {
            // InternalTurtle.g:1031:4: (lv_name_1_0= RULE_UNICODE )
            // InternalTurtle.g:1032:5: lv_name_1_0= RULE_UNICODE
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


    // $ANTLR start "entryRuleEString"
    // InternalTurtle.g:1052:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTurtle.g:1052:47: (iv_ruleEString= ruleEString EOF )
            // InternalTurtle.g:1053:2: iv_ruleEString= ruleEString EOF
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
    // InternalTurtle.g:1059:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTurtle.g:1065:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTurtle.g:1066:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTurtle.g:1066:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTurtle.g:1067:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1075:3: this_ID_1= RULE_ID
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
    // InternalTurtle.g:1086:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) ) ;
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
            // InternalTurtle.g:1092:2: ( ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) ) )
            // InternalTurtle.g:1093:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) )
            {
            // InternalTurtle.g:1093:2: ( (enumLiteral_0= 'sh:minCount' ) | (enumLiteral_1= 'sh:maxCount' ) | (enumLiteral_2= 'sh:and' ) | (enumLiteral_3= 'sh:or' ) | (enumLiteral_4= 'sh:not' ) | (enumLiteral_5= 'sh:class' ) | (enumLiteral_6= 'sh:hasValue' ) | (enumLiteral_7= 'sh:nodeKind' ) | (enumLiteral_8= 'sh:node' ) | (enumLiteral_9= 'sh:datatype' ) | (enumLiteral_10= 'sh:pattern' ) | (enumLiteral_11= 'sh:closed' ) | (enumLiteral_12= 'sh:ignoredProperties' ) | (enumLiteral_13= 'sh:path' ) | (enumLiteral_14= 'sh:inversePath' ) | (enumLiteral_15= 'sh:property' ) | (enumLiteral_16= 'sh:name' ) | (enumLiteral_17= 'sh:targetClass' ) | (enumLiteral_18= 'sh:targetNode' ) )
            int alt21=19;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
                }
                break;
            case 31:
                {
                alt21=5;
                }
                break;
            case 32:
                {
                alt21=6;
                }
                break;
            case 33:
                {
                alt21=7;
                }
                break;
            case 34:
                {
                alt21=8;
                }
                break;
            case 35:
                {
                alt21=9;
                }
                break;
            case 36:
                {
                alt21=10;
                }
                break;
            case 37:
                {
                alt21=11;
                }
                break;
            case 38:
                {
                alt21=12;
                }
                break;
            case 39:
                {
                alt21=13;
                }
                break;
            case 23:
                {
                alt21=14;
                }
                break;
            case 40:
                {
                alt21=15;
                }
                break;
            case 22:
                {
                alt21=16;
                }
                break;
            case 41:
                {
                alt21=17;
                }
                break;
            case 42:
                {
                alt21=18;
                }
                break;
            case 43:
                {
                alt21=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalTurtle.g:1094:3: (enumLiteral_0= 'sh:minCount' )
                    {
                    // InternalTurtle.g:1094:3: (enumLiteral_0= 'sh:minCount' )
                    // InternalTurtle.g:1095:4: enumLiteral_0= 'sh:minCount'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:1102:3: (enumLiteral_1= 'sh:maxCount' )
                    {
                    // InternalTurtle.g:1102:3: (enumLiteral_1= 'sh:maxCount' )
                    // InternalTurtle.g:1103:4: enumLiteral_1= 'sh:maxCount'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:1110:3: (enumLiteral_2= 'sh:and' )
                    {
                    // InternalTurtle.g:1110:3: (enumLiteral_2= 'sh:and' )
                    // InternalTurtle.g:1111:4: enumLiteral_2= 'sh:and'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:1118:3: (enumLiteral_3= 'sh:or' )
                    {
                    // InternalTurtle.g:1118:3: (enumLiteral_3= 'sh:or' )
                    // InternalTurtle.g:1119:4: enumLiteral_3= 'sh:or'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:1126:3: (enumLiteral_4= 'sh:not' )
                    {
                    // InternalTurtle.g:1126:3: (enumLiteral_4= 'sh:not' )
                    // InternalTurtle.g:1127:4: enumLiteral_4= 'sh:not'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:1134:3: (enumLiteral_5= 'sh:class' )
                    {
                    // InternalTurtle.g:1134:3: (enumLiteral_5= 'sh:class' )
                    // InternalTurtle.g:1135:4: enumLiteral_5= 'sh:class'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:1142:3: (enumLiteral_6= 'sh:hasValue' )
                    {
                    // InternalTurtle.g:1142:3: (enumLiteral_6= 'sh:hasValue' )
                    // InternalTurtle.g:1143:4: enumLiteral_6= 'sh:hasValue'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:1150:3: (enumLiteral_7= 'sh:nodeKind' )
                    {
                    // InternalTurtle.g:1150:3: (enumLiteral_7= 'sh:nodeKind' )
                    // InternalTurtle.g:1151:4: enumLiteral_7= 'sh:nodeKind'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:1158:3: (enumLiteral_8= 'sh:node' )
                    {
                    // InternalTurtle.g:1158:3: (enumLiteral_8= 'sh:node' )
                    // InternalTurtle.g:1159:4: enumLiteral_8= 'sh:node'
                    {
                    enumLiteral_8=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:1166:3: (enumLiteral_9= 'sh:datatype' )
                    {
                    // InternalTurtle.g:1166:3: (enumLiteral_9= 'sh:datatype' )
                    // InternalTurtle.g:1167:4: enumLiteral_9= 'sh:datatype'
                    {
                    enumLiteral_9=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:1174:3: (enumLiteral_10= 'sh:pattern' )
                    {
                    // InternalTurtle.g:1174:3: (enumLiteral_10= 'sh:pattern' )
                    // InternalTurtle.g:1175:4: enumLiteral_10= 'sh:pattern'
                    {
                    enumLiteral_10=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:1182:3: (enumLiteral_11= 'sh:closed' )
                    {
                    // InternalTurtle.g:1182:3: (enumLiteral_11= 'sh:closed' )
                    // InternalTurtle.g:1183:4: enumLiteral_11= 'sh:closed'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:1190:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    {
                    // InternalTurtle.g:1190:3: (enumLiteral_12= 'sh:ignoredProperties' )
                    // InternalTurtle.g:1191:4: enumLiteral_12= 'sh:ignoredProperties'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:1198:3: (enumLiteral_13= 'sh:path' )
                    {
                    // InternalTurtle.g:1198:3: (enumLiteral_13= 'sh:path' )
                    // InternalTurtle.g:1199:4: enumLiteral_13= 'sh:path'
                    {
                    enumLiteral_13=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:1206:3: (enumLiteral_14= 'sh:inversePath' )
                    {
                    // InternalTurtle.g:1206:3: (enumLiteral_14= 'sh:inversePath' )
                    // InternalTurtle.g:1207:4: enumLiteral_14= 'sh:inversePath'
                    {
                    enumLiteral_14=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:1214:3: (enumLiteral_15= 'sh:property' )
                    {
                    // InternalTurtle.g:1214:3: (enumLiteral_15= 'sh:property' )
                    // InternalTurtle.g:1215:4: enumLiteral_15= 'sh:property'
                    {
                    enumLiteral_15=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:1222:3: (enumLiteral_16= 'sh:name' )
                    {
                    // InternalTurtle.g:1222:3: (enumLiteral_16= 'sh:name' )
                    // InternalTurtle.g:1223:4: enumLiteral_16= 'sh:name'
                    {
                    enumLiteral_16=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:1230:3: (enumLiteral_17= 'sh:targetClass' )
                    {
                    // InternalTurtle.g:1230:3: (enumLiteral_17= 'sh:targetClass' )
                    // InternalTurtle.g:1231:4: enumLiteral_17= 'sh:targetClass'
                    {
                    enumLiteral_17=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:1238:3: (enumLiteral_18= 'sh:targetNode' )
                    {
                    // InternalTurtle.g:1238:3: (enumLiteral_18= 'sh:targetNode' )
                    // InternalTurtle.g:1239:4: enumLiteral_18= 'sh:targetNode'
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA15 dfa15 = new DFA15(this);
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
            return "762:2: ( ( () ( (lv_propertyValues_1_0= rulePropertyValues ) ) ) | ( ( ( (lv_type_2_0= rulePropertyType ) ) otherlv_3= '[' ) ( (this_UNICODE_4= RULE_UNICODE | otherlv_5= 'a' ) otherlv_6= 'sh:NodeShape' otherlv_7= ';' )? ( (otherlv_8= 'sh:property' | otherlv_9= 'sh:path' ) otherlv_10= '[' )? ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+ ) )";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\24\31\uffff";
    static final String dfa_9s = "\1\16\23\5\2\uffff\2\5\1\22\1\16";
    static final String dfa_10s = "\1\53\23\32\2\uffff\2\32\1\22\1\53";
    static final String dfa_11s = "\24\uffff\1\2\1\1\4\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\24\7\uffff\1\20\1\16\1\25\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23",
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
            "\1\24\7\uffff\1\20\1\16\1\25\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 856:4: ( ( (lv_propertyValues_11_0= rulePropertyValues ) )* otherlv_12= ']' otherlv_13= ';' )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000040C2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000040C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000FFFF8C80020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000FFFF8C84020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000FFFF9C80020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000FFFF9C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000FFFF9C00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006040020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004040020L});

}