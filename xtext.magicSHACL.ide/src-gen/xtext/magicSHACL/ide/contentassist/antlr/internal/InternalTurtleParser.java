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
import xtext.magicSHACL.services.TurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IRI", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sh:targetClass'", "'sh:targetNode'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:hasClass'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:path'", "'sh:inversePath'", "'sh:property'", "'sh:name'", "'sh:message'", "'sh:equals'", "'sh:minExclusive'", "'sh:minInclusive'", "'sh:maxExclusive'", "'sh:maxInclusive'", "'sh:maxLength'", "'sh:minLength'", "'sh:qualifiedValueShape'", "'sh:qualifiedMaxCount'", "'sh:qualifiedMinCount'", "'a'", "'rdfs:label'", "'sh:description'", "'@prefix'", "'.'", "';'", "'^^'", "','", "'('", "')'", "'['", "']'"
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
    public static final int T__54=54;
    public static final int RULE_ID=6;
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
    public static final int RULE_IRI=4;
    public static final int RULE_STRING=5;
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

    	public void setGrammarAccess(TurtleGrammarAccess grammarAccess) {
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
    // InternalTurtle.g:53:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalTurtle.g:54:1: ( ruleGraph EOF )
            // InternalTurtle.g:55:1: ruleGraph EOF
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
    // InternalTurtle.g:62:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:66:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalTurtle.g:67:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalTurtle.g:67:2: ( ( rule__Graph__Group__0 ) )
            // InternalTurtle.g:68:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalTurtle.g:69:3: ( rule__Graph__Group__0 )
            // InternalTurtle.g:69:4: rule__Graph__Group__0
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


    // $ANTLR start "entryRuleNamespace"
    // InternalTurtle.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalTurtle.g:79:1: ( ruleNamespace EOF )
            // InternalTurtle.g:80:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalTurtle.g:87:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:91:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalTurtle.g:92:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalTurtle.g:92:2: ( ( rule__Namespace__Group__0 ) )
            // InternalTurtle.g:93:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalTurtle.g:94:3: ( rule__Namespace__Group__0 )
            // InternalTurtle.g:94:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDataGraph"
    // InternalTurtle.g:103:1: entryRuleDataGraph : ruleDataGraph EOF ;
    public final void entryRuleDataGraph() throws RecognitionException {
        try {
            // InternalTurtle.g:104:1: ( ruleDataGraph EOF )
            // InternalTurtle.g:105:1: ruleDataGraph EOF
            {
             before(grammarAccess.getDataGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleDataGraph();

            state._fsp--;

             after(grammarAccess.getDataGraphRule()); 
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
    // $ANTLR end "entryRuleDataGraph"


    // $ANTLR start "ruleDataGraph"
    // InternalTurtle.g:112:1: ruleDataGraph : ( ( rule__DataGraph__Group__0 ) ) ;
    public final void ruleDataGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:116:2: ( ( ( rule__DataGraph__Group__0 ) ) )
            // InternalTurtle.g:117:2: ( ( rule__DataGraph__Group__0 ) )
            {
            // InternalTurtle.g:117:2: ( ( rule__DataGraph__Group__0 ) )
            // InternalTurtle.g:118:3: ( rule__DataGraph__Group__0 )
            {
             before(grammarAccess.getDataGraphAccess().getGroup()); 
            // InternalTurtle.g:119:3: ( rule__DataGraph__Group__0 )
            // InternalTurtle.g:119:4: rule__DataGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataGraphAccess().getGroup()); 

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
    // $ANTLR end "ruleDataGraph"


    // $ANTLR start "entryRuleTriples"
    // InternalTurtle.g:128:1: entryRuleTriples : ruleTriples EOF ;
    public final void entryRuleTriples() throws RecognitionException {
        try {
            // InternalTurtle.g:129:1: ( ruleTriples EOF )
            // InternalTurtle.g:130:1: ruleTriples EOF
            {
             before(grammarAccess.getTriplesRule()); 
            pushFollow(FOLLOW_1);
            ruleTriples();

            state._fsp--;

             after(grammarAccess.getTriplesRule()); 
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
    // $ANTLR end "entryRuleTriples"


    // $ANTLR start "ruleTriples"
    // InternalTurtle.g:137:1: ruleTriples : ( ( rule__Triples__Group__0 ) ) ;
    public final void ruleTriples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:141:2: ( ( ( rule__Triples__Group__0 ) ) )
            // InternalTurtle.g:142:2: ( ( rule__Triples__Group__0 ) )
            {
            // InternalTurtle.g:142:2: ( ( rule__Triples__Group__0 ) )
            // InternalTurtle.g:143:3: ( rule__Triples__Group__0 )
            {
             before(grammarAccess.getTriplesAccess().getGroup()); 
            // InternalTurtle.g:144:3: ( rule__Triples__Group__0 )
            // InternalTurtle.g:144:4: rule__Triples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Triples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriplesAccess().getGroup()); 

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
    // $ANTLR end "ruleTriples"


    // $ANTLR start "entryRulePredicateObject"
    // InternalTurtle.g:153:1: entryRulePredicateObject : rulePredicateObject EOF ;
    public final void entryRulePredicateObject() throws RecognitionException {
        try {
            // InternalTurtle.g:154:1: ( rulePredicateObject EOF )
            // InternalTurtle.g:155:1: rulePredicateObject EOF
            {
             before(grammarAccess.getPredicateObjectRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateObject();

            state._fsp--;

             after(grammarAccess.getPredicateObjectRule()); 
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
    // $ANTLR end "entryRulePredicateObject"


    // $ANTLR start "rulePredicateObject"
    // InternalTurtle.g:162:1: rulePredicateObject : ( ( rule__PredicateObject__Group__0 ) ) ;
    public final void rulePredicateObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:166:2: ( ( ( rule__PredicateObject__Group__0 ) ) )
            // InternalTurtle.g:167:2: ( ( rule__PredicateObject__Group__0 ) )
            {
            // InternalTurtle.g:167:2: ( ( rule__PredicateObject__Group__0 ) )
            // InternalTurtle.g:168:3: ( rule__PredicateObject__Group__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup()); 
            // InternalTurtle.g:169:3: ( rule__PredicateObject__Group__0 )
            // InternalTurtle.g:169:4: rule__PredicateObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectAccess().getGroup()); 

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
    // $ANTLR end "rulePredicateObject"


    // $ANTLR start "entryRuleSubject"
    // InternalTurtle.g:178:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalTurtle.g:179:1: ( ruleSubject EOF )
            // InternalTurtle.g:180:1: ruleSubject EOF
            {
             before(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getSubjectRule()); 
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
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalTurtle.g:187:1: ruleSubject : ( ( rule__Subject__Group__0 ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:191:2: ( ( ( rule__Subject__Group__0 ) ) )
            // InternalTurtle.g:192:2: ( ( rule__Subject__Group__0 ) )
            {
            // InternalTurtle.g:192:2: ( ( rule__Subject__Group__0 ) )
            // InternalTurtle.g:193:3: ( rule__Subject__Group__0 )
            {
             before(grammarAccess.getSubjectAccess().getGroup()); 
            // InternalTurtle.g:194:3: ( rule__Subject__Group__0 )
            // InternalTurtle.g:194:4: rule__Subject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getGroup()); 

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
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePredicate"
    // InternalTurtle.g:203:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalTurtle.g:204:1: ( rulePredicate EOF )
            // InternalTurtle.g:205:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalTurtle.g:212:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:216:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalTurtle.g:217:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalTurtle.g:217:2: ( ( rule__Predicate__Group__0 ) )
            // InternalTurtle.g:218:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalTurtle.g:219:3: ( rule__Predicate__Group__0 )
            // InternalTurtle.g:219:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleObject"
    // InternalTurtle.g:228:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalTurtle.g:229:1: ( ruleObject EOF )
            // InternalTurtle.g:230:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalTurtle.g:237:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:241:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalTurtle.g:242:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalTurtle.g:242:2: ( ( rule__Object__Group__0 ) )
            // InternalTurtle.g:243:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalTurtle.g:244:3: ( rule__Object__Group__0 )
            // InternalTurtle.g:244:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalTurtle.g:253:1: entryRuleShapesGraph : ruleShapesGraph EOF ;
    public final void entryRuleShapesGraph() throws RecognitionException {
        try {
            // InternalTurtle.g:254:1: ( ruleShapesGraph EOF )
            // InternalTurtle.g:255:1: ruleShapesGraph EOF
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
    // InternalTurtle.g:262:1: ruleShapesGraph : ( ( rule__ShapesGraph__Group__0 ) ) ;
    public final void ruleShapesGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:266:2: ( ( ( rule__ShapesGraph__Group__0 ) ) )
            // InternalTurtle.g:267:2: ( ( rule__ShapesGraph__Group__0 ) )
            {
            // InternalTurtle.g:267:2: ( ( rule__ShapesGraph__Group__0 ) )
            // InternalTurtle.g:268:3: ( rule__ShapesGraph__Group__0 )
            {
             before(grammarAccess.getShapesGraphAccess().getGroup()); 
            // InternalTurtle.g:269:3: ( rule__ShapesGraph__Group__0 )
            // InternalTurtle.g:269:4: rule__ShapesGraph__Group__0
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
    // InternalTurtle.g:278:1: entryRuleShapeConstraint : ruleShapeConstraint EOF ;
    public final void entryRuleShapeConstraint() throws RecognitionException {
        try {
            // InternalTurtle.g:279:1: ( ruleShapeConstraint EOF )
            // InternalTurtle.g:280:1: ruleShapeConstraint EOF
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
    // InternalTurtle.g:287:1: ruleShapeConstraint : ( ( rule__ShapeConstraint__Group__0 ) ) ;
    public final void ruleShapeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:291:2: ( ( ( rule__ShapeConstraint__Group__0 ) ) )
            // InternalTurtle.g:292:2: ( ( rule__ShapeConstraint__Group__0 ) )
            {
            // InternalTurtle.g:292:2: ( ( rule__ShapeConstraint__Group__0 ) )
            // InternalTurtle.g:293:3: ( rule__ShapeConstraint__Group__0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getGroup()); 
            // InternalTurtle.g:294:3: ( rule__ShapeConstraint__Group__0 )
            // InternalTurtle.g:294:4: rule__ShapeConstraint__Group__0
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


    // $ANTLR start "entryRuleTarget"
    // InternalTurtle.g:303:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalTurtle.g:304:1: ( ruleTarget EOF )
            // InternalTurtle.g:305:1: ruleTarget EOF
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
    // InternalTurtle.g:312:1: ruleTarget : ( ( rule__Target__Group__0 ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:316:2: ( ( ( rule__Target__Group__0 ) ) )
            // InternalTurtle.g:317:2: ( ( rule__Target__Group__0 ) )
            {
            // InternalTurtle.g:317:2: ( ( rule__Target__Group__0 ) )
            // InternalTurtle.g:318:3: ( rule__Target__Group__0 )
            {
             before(grammarAccess.getTargetAccess().getGroup()); 
            // InternalTurtle.g:319:3: ( rule__Target__Group__0 )
            // InternalTurtle.g:319:4: rule__Target__Group__0
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


    // $ANTLR start "entryRuleShapeName"
    // InternalTurtle.g:328:1: entryRuleShapeName : ruleShapeName EOF ;
    public final void entryRuleShapeName() throws RecognitionException {
        try {
            // InternalTurtle.g:329:1: ( ruleShapeName EOF )
            // InternalTurtle.g:330:1: ruleShapeName EOF
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
    // InternalTurtle.g:337:1: ruleShapeName : ( ( rule__ShapeName__Group__0 ) ) ;
    public final void ruleShapeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:341:2: ( ( ( rule__ShapeName__Group__0 ) ) )
            // InternalTurtle.g:342:2: ( ( rule__ShapeName__Group__0 ) )
            {
            // InternalTurtle.g:342:2: ( ( rule__ShapeName__Group__0 ) )
            // InternalTurtle.g:343:3: ( rule__ShapeName__Group__0 )
            {
             before(grammarAccess.getShapeNameAccess().getGroup()); 
            // InternalTurtle.g:344:3: ( rule__ShapeName__Group__0 )
            // InternalTurtle.g:344:4: rule__ShapeName__Group__0
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
    // InternalTurtle.g:353:1: entryRuleShapeExpression : ruleShapeExpression EOF ;
    public final void entryRuleShapeExpression() throws RecognitionException {
        try {
            // InternalTurtle.g:354:1: ( ruleShapeExpression EOF )
            // InternalTurtle.g:355:1: ruleShapeExpression EOF
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
    // InternalTurtle.g:362:1: ruleShapeExpression : ( ( rule__ShapeExpression__Group__0 ) ) ;
    public final void ruleShapeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:366:2: ( ( ( rule__ShapeExpression__Group__0 ) ) )
            // InternalTurtle.g:367:2: ( ( rule__ShapeExpression__Group__0 ) )
            {
            // InternalTurtle.g:367:2: ( ( rule__ShapeExpression__Group__0 ) )
            // InternalTurtle.g:368:3: ( rule__ShapeExpression__Group__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup()); 
            // InternalTurtle.g:369:3: ( rule__ShapeExpression__Group__0 )
            // InternalTurtle.g:369:4: rule__ShapeExpression__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalTurtle.g:378:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalTurtle.g:379:1: ( ruleValue EOF )
            // InternalTurtle.g:380:1: ruleValue EOF
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
    // InternalTurtle.g:387:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:391:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalTurtle.g:392:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalTurtle.g:392:2: ( ( rule__Value__Group__0 ) )
            // InternalTurtle.g:393:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalTurtle.g:394:3: ( rule__Value__Group__0 )
            // InternalTurtle.g:394:4: rule__Value__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalTurtle.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTurtle.g:404:1: ( ruleEString EOF )
            // InternalTurtle.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTurtle.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTurtle.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTurtle.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalTurtle.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTurtle.g:419:3: ( rule__EString__Alternatives )
            // InternalTurtle.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rulePropertyType"
    // InternalTurtle.g:428:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:432:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalTurtle.g:433:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalTurtle.g:433:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalTurtle.g:434:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalTurtle.g:435:3: ( rule__PropertyType__Alternatives )
            // InternalTurtle.g:435:4: rule__PropertyType__Alternatives
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


    // $ANTLR start "rule__Subject__NameAlternatives_1_0"
    // InternalTurtle.g:443:1: rule__Subject__NameAlternatives_1_0 : ( ( ruleEString ) | ( RULE_IRI ) );
    public final void rule__Subject__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:447:1: ( ( ruleEString ) | ( RULE_IRI ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_IRI) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTurtle.g:448:2: ( ruleEString )
                    {
                    // InternalTurtle.g:448:2: ( ruleEString )
                    // InternalTurtle.g:449:3: ruleEString
                    {
                     before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:454:2: ( RULE_IRI )
                    {
                    // InternalTurtle.g:454:2: ( RULE_IRI )
                    // InternalTurtle.g:455:3: RULE_IRI
                    {
                     before(grammarAccess.getSubjectAccess().getNameIRITerminalRuleCall_1_0_1()); 
                    match(input,RULE_IRI,FOLLOW_2); 
                     after(grammarAccess.getSubjectAccess().getNameIRITerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Subject__NameAlternatives_1_0"


    // $ANTLR start "rule__ShapeConstraint__Alternatives_2"
    // InternalTurtle.g:464:1: rule__ShapeConstraint__Alternatives_2 : ( ( ( rule__ShapeConstraint__TargetsAssignment_2_0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) );
    public final void rule__ShapeConstraint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:468:1: ( ( ( rule__ShapeConstraint__TargetsAssignment_2_0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=45)||LA2_0==53) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTurtle.g:469:2: ( ( rule__ShapeConstraint__TargetsAssignment_2_0 ) )
                    {
                    // InternalTurtle.g:469:2: ( ( rule__ShapeConstraint__TargetsAssignment_2_0 ) )
                    // InternalTurtle.g:470:3: ( rule__ShapeConstraint__TargetsAssignment_2_0 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0()); 
                    // InternalTurtle.g:471:3: ( rule__ShapeConstraint__TargetsAssignment_2_0 )
                    // InternalTurtle.g:471:4: rule__ShapeConstraint__TargetsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstraint__TargetsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:475:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    {
                    // InternalTurtle.g:475:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    // InternalTurtle.g:476:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1()); 
                    // InternalTurtle.g:477:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    // InternalTurtle.g:477:4: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstraint__ShapeExpressionsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1()); 

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


    // $ANTLR start "rule__Target__TypeAlternatives_1_0"
    // InternalTurtle.g:485:1: rule__Target__TypeAlternatives_1_0 : ( ( 'sh:targetClass' ) | ( 'sh:targetNode' ) );
    public final void rule__Target__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:489:1: ( ( 'sh:targetClass' ) | ( 'sh:targetNode' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:490:2: ( 'sh:targetClass' )
                    {
                    // InternalTurtle.g:490:2: ( 'sh:targetClass' )
                    // InternalTurtle.g:491:3: 'sh:targetClass'
                    {
                     before(grammarAccess.getTargetAccess().getTypeShTargetClassKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getTypeShTargetClassKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:496:2: ( 'sh:targetNode' )
                    {
                    // InternalTurtle.g:496:2: ( 'sh:targetNode' )
                    // InternalTurtle.g:497:3: 'sh:targetNode'
                    {
                     before(grammarAccess.getTargetAccess().getTypeShTargetNodeKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getTypeShTargetNodeKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Target__TypeAlternatives_1_0"


    // $ANTLR start "rule__Target__TermAlternatives_2_0"
    // InternalTurtle.g:506:1: rule__Target__TermAlternatives_2_0 : ( ( ruleEString ) | ( RULE_IRI ) );
    public final void rule__Target__TermAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:510:1: ( ( ruleEString ) | ( RULE_IRI ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
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
                    // InternalTurtle.g:511:2: ( ruleEString )
                    {
                    // InternalTurtle.g:511:2: ( ruleEString )
                    // InternalTurtle.g:512:3: ruleEString
                    {
                     before(grammarAccess.getTargetAccess().getTermEStringParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getTargetAccess().getTermEStringParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:517:2: ( RULE_IRI )
                    {
                    // InternalTurtle.g:517:2: ( RULE_IRI )
                    // InternalTurtle.g:518:3: RULE_IRI
                    {
                     before(grammarAccess.getTargetAccess().getTermIRITerminalRuleCall_2_0_1()); 
                    match(input,RULE_IRI,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getTermIRITerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Target__TermAlternatives_2_0"


    // $ANTLR start "rule__ShapeName__NameAlternatives_1_0"
    // InternalTurtle.g:527:1: rule__ShapeName__NameAlternatives_1_0 : ( ( RULE_IRI ) | ( ruleEString ) );
    public final void rule__ShapeName__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:531:1: ( ( RULE_IRI ) | ( ruleEString ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IRI) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtle.g:532:2: ( RULE_IRI )
                    {
                    // InternalTurtle.g:532:2: ( RULE_IRI )
                    // InternalTurtle.g:533:3: RULE_IRI
                    {
                     before(grammarAccess.getShapeNameAccess().getNameIRITerminalRuleCall_1_0_0()); 
                    match(input,RULE_IRI,FOLLOW_2); 
                     after(grammarAccess.getShapeNameAccess().getNameIRITerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:538:2: ( ruleEString )
                    {
                    // InternalTurtle.g:538:2: ( ruleEString )
                    // InternalTurtle.g:539:3: ruleEString
                    {
                     before(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__ShapeName__NameAlternatives_1_0"


    // $ANTLR start "rule__ShapeExpression__Alternatives_1"
    // InternalTurtle.g:548:1: rule__ShapeExpression__Alternatives_1 : ( ( ( rule__ShapeExpression__Group_1_0__0 ) ) | ( ( rule__ShapeExpression__Group_1_1__0 ) ) | ( ( rule__ShapeExpression__Group_1_2__0 ) ) );
    public final void rule__ShapeExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:552:1: ( ( ( rule__ShapeExpression__Group_1_0__0 ) ) | ( ( rule__ShapeExpression__Group_1_1__0 ) ) | ( ( rule__ShapeExpression__Group_1_2__0 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalTurtle.g:553:2: ( ( rule__ShapeExpression__Group_1_0__0 ) )
                    {
                    // InternalTurtle.g:553:2: ( ( rule__ShapeExpression__Group_1_0__0 ) )
                    // InternalTurtle.g:554:3: ( rule__ShapeExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1_0()); 
                    // InternalTurtle.g:555:3: ( rule__ShapeExpression__Group_1_0__0 )
                    // InternalTurtle.g:555:4: rule__ShapeExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:559:2: ( ( rule__ShapeExpression__Group_1_1__0 ) )
                    {
                    // InternalTurtle.g:559:2: ( ( rule__ShapeExpression__Group_1_1__0 ) )
                    // InternalTurtle.g:560:3: ( rule__ShapeExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 
                    // InternalTurtle.g:561:3: ( rule__ShapeExpression__Group_1_1__0 )
                    // InternalTurtle.g:561:4: rule__ShapeExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:565:2: ( ( rule__ShapeExpression__Group_1_2__0 ) )
                    {
                    // InternalTurtle.g:565:2: ( ( rule__ShapeExpression__Group_1_2__0 ) )
                    // InternalTurtle.g:566:3: ( rule__ShapeExpression__Group_1_2__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1_2()); 
                    // InternalTurtle.g:567:3: ( rule__ShapeExpression__Group_1_2__0 )
                    // InternalTurtle.g:567:4: rule__ShapeExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives_1"


    // $ANTLR start "rule__ShapeExpression__Alternatives_1_1_2"
    // InternalTurtle.g:575:1: rule__ShapeExpression__Alternatives_1_1_2 : ( ( ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 ) ) | ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )* ) );
    public final void rule__ShapeExpression__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:579:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 ) ) | ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )* ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_IRI && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=14 && LA8_0<=45)||(LA8_0>=52 && LA8_0<=53)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtle.g:580:2: ( ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 ) )
                    {
                    // InternalTurtle.g:580:2: ( ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 ) )
                    // InternalTurtle.g:581:3: ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1_2_0()); 
                    // InternalTurtle.g:582:3: ( rule__ShapeExpression__ValuesAssignment_1_1_2_0 )
                    // InternalTurtle.g:582:4: rule__ShapeExpression__ValuesAssignment_1_1_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__ValuesAssignment_1_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:586:2: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )* )
                    {
                    // InternalTurtle.g:586:2: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )* )
                    // InternalTurtle.g:587:3: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )*
                    {
                     before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_1_2_1()); 
                    // InternalTurtle.g:588:3: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=14 && LA7_0<=45)||LA7_0==53) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTurtle.g:588:4: rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_1_2_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives_1_1_2"


    // $ANTLR start "rule__Value__NameAlternatives_1_0"
    // InternalTurtle.g:596:1: rule__Value__NameAlternatives_1_0 : ( ( ruleEString ) | ( RULE_IRI ) );
    public final void rule__Value__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:600:1: ( ( ruleEString ) | ( RULE_IRI ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
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
                    // InternalTurtle.g:601:2: ( ruleEString )
                    {
                    // InternalTurtle.g:601:2: ( ruleEString )
                    // InternalTurtle.g:602:3: ruleEString
                    {
                     before(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:607:2: ( RULE_IRI )
                    {
                    // InternalTurtle.g:607:2: ( RULE_IRI )
                    // InternalTurtle.g:608:3: RULE_IRI
                    {
                     before(grammarAccess.getValueAccess().getNameIRITerminalRuleCall_1_0_1()); 
                    match(input,RULE_IRI,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getNameIRITerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Value__NameAlternatives_1_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTurtle.g:617:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:621:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTurtle.g:622:2: ( RULE_STRING )
                    {
                    // InternalTurtle.g:622:2: ( RULE_STRING )
                    // InternalTurtle.g:623:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:628:2: ( RULE_ID )
                    {
                    // InternalTurtle.g:628:2: ( RULE_ID )
                    // InternalTurtle.g:629:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalTurtle.g:638:1: rule__PropertyType__Alternatives : ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:hasClass' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:equals' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) | ( ( 'sh:qualifiedValueShape' ) ) | ( ( 'sh:qualifiedMaxCount' ) ) | ( ( 'sh:qualifiedMinCount' ) ) | ( ( 'a' ) ) | ( ( 'rdfs:label' ) ) | ( ( 'sh:description' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:642:1: ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:hasClass' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:equals' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) | ( ( 'sh:qualifiedValueShape' ) ) | ( ( 'sh:qualifiedMaxCount' ) ) | ( ( 'sh:qualifiedMinCount' ) ) | ( ( 'a' ) ) | ( ( 'rdfs:label' ) ) | ( ( 'sh:description' ) ) )
            int alt11=32;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt11=1;
                }
                break;
            case 15:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
                }
                break;
            case 17:
                {
                alt11=4;
                }
                break;
            case 18:
                {
                alt11=5;
                }
                break;
            case 19:
                {
                alt11=6;
                }
                break;
            case 20:
                {
                alt11=7;
                }
                break;
            case 21:
                {
                alt11=8;
                }
                break;
            case 22:
                {
                alt11=9;
                }
                break;
            case 23:
                {
                alt11=10;
                }
                break;
            case 24:
                {
                alt11=11;
                }
                break;
            case 25:
                {
                alt11=12;
                }
                break;
            case 26:
                {
                alt11=13;
                }
                break;
            case 27:
                {
                alt11=14;
                }
                break;
            case 28:
                {
                alt11=15;
                }
                break;
            case 29:
                {
                alt11=16;
                }
                break;
            case 30:
                {
                alt11=17;
                }
                break;
            case 31:
                {
                alt11=18;
                }
                break;
            case 32:
                {
                alt11=19;
                }
                break;
            case 33:
                {
                alt11=20;
                }
                break;
            case 34:
                {
                alt11=21;
                }
                break;
            case 35:
                {
                alt11=22;
                }
                break;
            case 36:
                {
                alt11=23;
                }
                break;
            case 37:
                {
                alt11=24;
                }
                break;
            case 38:
                {
                alt11=25;
                }
                break;
            case 39:
                {
                alt11=26;
                }
                break;
            case 40:
                {
                alt11=27;
                }
                break;
            case 41:
                {
                alt11=28;
                }
                break;
            case 42:
                {
                alt11=29;
                }
                break;
            case 43:
                {
                alt11=30;
                }
                break;
            case 44:
                {
                alt11=31;
                }
                break;
            case 45:
                {
                alt11=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTurtle.g:643:2: ( ( 'sh:minCount' ) )
                    {
                    // InternalTurtle.g:643:2: ( ( 'sh:minCount' ) )
                    // InternalTurtle.g:644:3: ( 'sh:minCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalTurtle.g:645:3: ( 'sh:minCount' )
                    // InternalTurtle.g:645:4: 'sh:minCount'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:649:2: ( ( 'sh:maxCount' ) )
                    {
                    // InternalTurtle.g:649:2: ( ( 'sh:maxCount' ) )
                    // InternalTurtle.g:650:3: ( 'sh:maxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalTurtle.g:651:3: ( 'sh:maxCount' )
                    // InternalTurtle.g:651:4: 'sh:maxCount'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:655:2: ( ( 'sh:and' ) )
                    {
                    // InternalTurtle.g:655:2: ( ( 'sh:and' ) )
                    // InternalTurtle.g:656:3: ( 'sh:and' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalTurtle.g:657:3: ( 'sh:and' )
                    // InternalTurtle.g:657:4: 'sh:and'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:661:2: ( ( 'sh:or' ) )
                    {
                    // InternalTurtle.g:661:2: ( ( 'sh:or' ) )
                    // InternalTurtle.g:662:3: ( 'sh:or' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalTurtle.g:663:3: ( 'sh:or' )
                    // InternalTurtle.g:663:4: 'sh:or'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:667:2: ( ( 'sh:not' ) )
                    {
                    // InternalTurtle.g:667:2: ( ( 'sh:not' ) )
                    // InternalTurtle.g:668:3: ( 'sh:not' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalTurtle.g:669:3: ( 'sh:not' )
                    // InternalTurtle.g:669:4: 'sh:not'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:673:2: ( ( 'sh:class' ) )
                    {
                    // InternalTurtle.g:673:2: ( ( 'sh:class' ) )
                    // InternalTurtle.g:674:3: ( 'sh:class' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 
                    // InternalTurtle.g:675:3: ( 'sh:class' )
                    // InternalTurtle.g:675:4: 'sh:class'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:679:2: ( ( 'sh:hasValue' ) )
                    {
                    // InternalTurtle.g:679:2: ( ( 'sh:hasValue' ) )
                    // InternalTurtle.g:680:3: ( 'sh:hasValue' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 
                    // InternalTurtle.g:681:3: ( 'sh:hasValue' )
                    // InternalTurtle.g:681:4: 'sh:hasValue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:685:2: ( ( 'sh:hasClass' ) )
                    {
                    // InternalTurtle.g:685:2: ( ( 'sh:hasClass' ) )
                    // InternalTurtle.g:686:3: ( 'sh:hasClass' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getHasClassConstraintComponentEnumLiteralDeclaration_7()); 
                    // InternalTurtle.g:687:3: ( 'sh:hasClass' )
                    // InternalTurtle.g:687:4: 'sh:hasClass'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getHasClassConstraintComponentEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:691:2: ( ( 'sh:nodeKind' ) )
                    {
                    // InternalTurtle.g:691:2: ( ( 'sh:nodeKind' ) )
                    // InternalTurtle.g:692:3: ( 'sh:nodeKind' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_8()); 
                    // InternalTurtle.g:693:3: ( 'sh:nodeKind' )
                    // InternalTurtle.g:693:4: 'sh:nodeKind'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:697:2: ( ( 'sh:node' ) )
                    {
                    // InternalTurtle.g:697:2: ( ( 'sh:node' ) )
                    // InternalTurtle.g:698:3: ( 'sh:node' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_9()); 
                    // InternalTurtle.g:699:3: ( 'sh:node' )
                    // InternalTurtle.g:699:4: 'sh:node'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:703:2: ( ( 'sh:datatype' ) )
                    {
                    // InternalTurtle.g:703:2: ( ( 'sh:datatype' ) )
                    // InternalTurtle.g:704:3: ( 'sh:datatype' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_10()); 
                    // InternalTurtle.g:705:3: ( 'sh:datatype' )
                    // InternalTurtle.g:705:4: 'sh:datatype'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:709:2: ( ( 'sh:pattern' ) )
                    {
                    // InternalTurtle.g:709:2: ( ( 'sh:pattern' ) )
                    // InternalTurtle.g:710:3: ( 'sh:pattern' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_11()); 
                    // InternalTurtle.g:711:3: ( 'sh:pattern' )
                    // InternalTurtle.g:711:4: 'sh:pattern'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:715:2: ( ( 'sh:closed' ) )
                    {
                    // InternalTurtle.g:715:2: ( ( 'sh:closed' ) )
                    // InternalTurtle.g:716:3: ( 'sh:closed' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_12()); 
                    // InternalTurtle.g:717:3: ( 'sh:closed' )
                    // InternalTurtle.g:717:4: 'sh:closed'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:721:2: ( ( 'sh:ignoredProperties' ) )
                    {
                    // InternalTurtle.g:721:2: ( ( 'sh:ignoredProperties' ) )
                    // InternalTurtle.g:722:3: ( 'sh:ignoredProperties' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_13()); 
                    // InternalTurtle.g:723:3: ( 'sh:ignoredProperties' )
                    // InternalTurtle.g:723:4: 'sh:ignoredProperties'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:727:2: ( ( 'sh:path' ) )
                    {
                    // InternalTurtle.g:727:2: ( ( 'sh:path' ) )
                    // InternalTurtle.g:728:3: ( 'sh:path' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_14()); 
                    // InternalTurtle.g:729:3: ( 'sh:path' )
                    // InternalTurtle.g:729:4: 'sh:path'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:733:2: ( ( 'sh:inversePath' ) )
                    {
                    // InternalTurtle.g:733:2: ( ( 'sh:inversePath' ) )
                    // InternalTurtle.g:734:3: ( 'sh:inversePath' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_15()); 
                    // InternalTurtle.g:735:3: ( 'sh:inversePath' )
                    // InternalTurtle.g:735:4: 'sh:inversePath'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:739:2: ( ( 'sh:property' ) )
                    {
                    // InternalTurtle.g:739:2: ( ( 'sh:property' ) )
                    // InternalTurtle.g:740:3: ( 'sh:property' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_16()); 
                    // InternalTurtle.g:741:3: ( 'sh:property' )
                    // InternalTurtle.g:741:4: 'sh:property'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:745:2: ( ( 'sh:name' ) )
                    {
                    // InternalTurtle.g:745:2: ( ( 'sh:name' ) )
                    // InternalTurtle.g:746:3: ( 'sh:name' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_17()); 
                    // InternalTurtle.g:747:3: ( 'sh:name' )
                    // InternalTurtle.g:747:4: 'sh:name'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:751:2: ( ( 'sh:message' ) )
                    {
                    // InternalTurtle.g:751:2: ( ( 'sh:message' ) )
                    // InternalTurtle.g:752:3: ( 'sh:message' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_18()); 
                    // InternalTurtle.g:753:3: ( 'sh:message' )
                    // InternalTurtle.g:753:4: 'sh:message'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTurtle.g:757:2: ( ( 'sh:equals' ) )
                    {
                    // InternalTurtle.g:757:2: ( ( 'sh:equals' ) )
                    // InternalTurtle.g:758:3: ( 'sh:equals' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_19()); 
                    // InternalTurtle.g:759:3: ( 'sh:equals' )
                    // InternalTurtle.g:759:4: 'sh:equals'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTurtle.g:763:2: ( ( 'sh:minExclusive' ) )
                    {
                    // InternalTurtle.g:763:2: ( ( 'sh:minExclusive' ) )
                    // InternalTurtle.g:764:3: ( 'sh:minExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20()); 
                    // InternalTurtle.g:765:3: ( 'sh:minExclusive' )
                    // InternalTurtle.g:765:4: 'sh:minExclusive'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTurtle.g:769:2: ( ( 'sh:minInclusive' ) )
                    {
                    // InternalTurtle.g:769:2: ( ( 'sh:minInclusive' ) )
                    // InternalTurtle.g:770:3: ( 'sh:minInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21()); 
                    // InternalTurtle.g:771:3: ( 'sh:minInclusive' )
                    // InternalTurtle.g:771:4: 'sh:minInclusive'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalTurtle.g:775:2: ( ( 'sh:maxExclusive' ) )
                    {
                    // InternalTurtle.g:775:2: ( ( 'sh:maxExclusive' ) )
                    // InternalTurtle.g:776:3: ( 'sh:maxExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22()); 
                    // InternalTurtle.g:777:3: ( 'sh:maxExclusive' )
                    // InternalTurtle.g:777:4: 'sh:maxExclusive'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalTurtle.g:781:2: ( ( 'sh:maxInclusive' ) )
                    {
                    // InternalTurtle.g:781:2: ( ( 'sh:maxInclusive' ) )
                    // InternalTurtle.g:782:3: ( 'sh:maxInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23()); 
                    // InternalTurtle.g:783:3: ( 'sh:maxInclusive' )
                    // InternalTurtle.g:783:4: 'sh:maxInclusive'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalTurtle.g:787:2: ( ( 'sh:maxLength' ) )
                    {
                    // InternalTurtle.g:787:2: ( ( 'sh:maxLength' ) )
                    // InternalTurtle.g:788:3: ( 'sh:maxLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24()); 
                    // InternalTurtle.g:789:3: ( 'sh:maxLength' )
                    // InternalTurtle.g:789:4: 'sh:maxLength'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalTurtle.g:793:2: ( ( 'sh:minLength' ) )
                    {
                    // InternalTurtle.g:793:2: ( ( 'sh:minLength' ) )
                    // InternalTurtle.g:794:3: ( 'sh:minLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25()); 
                    // InternalTurtle.g:795:3: ( 'sh:minLength' )
                    // InternalTurtle.g:795:4: 'sh:minLength'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalTurtle.g:799:2: ( ( 'sh:qualifiedValueShape' ) )
                    {
                    // InternalTurtle.g:799:2: ( ( 'sh:qualifiedValueShape' ) )
                    // InternalTurtle.g:800:3: ( 'sh:qualifiedValueShape' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_26()); 
                    // InternalTurtle.g:801:3: ( 'sh:qualifiedValueShape' )
                    // InternalTurtle.g:801:4: 'sh:qualifiedValueShape'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalTurtle.g:805:2: ( ( 'sh:qualifiedMaxCount' ) )
                    {
                    // InternalTurtle.g:805:2: ( ( 'sh:qualifiedMaxCount' ) )
                    // InternalTurtle.g:806:3: ( 'sh:qualifiedMaxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_27()); 
                    // InternalTurtle.g:807:3: ( 'sh:qualifiedMaxCount' )
                    // InternalTurtle.g:807:4: 'sh:qualifiedMaxCount'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalTurtle.g:811:2: ( ( 'sh:qualifiedMinCount' ) )
                    {
                    // InternalTurtle.g:811:2: ( ( 'sh:qualifiedMinCount' ) )
                    // InternalTurtle.g:812:3: ( 'sh:qualifiedMinCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_28()); 
                    // InternalTurtle.g:813:3: ( 'sh:qualifiedMinCount' )
                    // InternalTurtle.g:813:4: 'sh:qualifiedMinCount'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalTurtle.g:817:2: ( ( 'a' ) )
                    {
                    // InternalTurtle.g:817:2: ( ( 'a' ) )
                    // InternalTurtle.g:818:3: ( 'a' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_29()); 
                    // InternalTurtle.g:819:3: ( 'a' )
                    // InternalTurtle.g:819:4: 'a'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalTurtle.g:823:2: ( ( 'rdfs:label' ) )
                    {
                    // InternalTurtle.g:823:2: ( ( 'rdfs:label' ) )
                    // InternalTurtle.g:824:3: ( 'rdfs:label' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_30()); 
                    // InternalTurtle.g:825:3: ( 'rdfs:label' )
                    // InternalTurtle.g:825:4: 'rdfs:label'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalTurtle.g:829:2: ( ( 'sh:description' ) )
                    {
                    // InternalTurtle.g:829:2: ( ( 'sh:description' ) )
                    // InternalTurtle.g:830:3: ( 'sh:description' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_31()); 
                    // InternalTurtle.g:831:3: ( 'sh:description' )
                    // InternalTurtle.g:831:4: 'sh:description'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_31()); 

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
    // InternalTurtle.g:839:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:843:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalTurtle.g:844:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTurtle.g:851:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:855:1: ( ( () ) )
            // InternalTurtle.g:856:1: ( () )
            {
            // InternalTurtle.g:856:1: ( () )
            // InternalTurtle.g:857:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalTurtle.g:858:2: ()
            // InternalTurtle.g:858:3: 
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
    // InternalTurtle.g:866:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:870:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalTurtle.g:871:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

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
    // InternalTurtle.g:878:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NamespacesAssignment_1 )* ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:882:1: ( ( ( rule__Graph__NamespacesAssignment_1 )* ) )
            // InternalTurtle.g:883:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            {
            // InternalTurtle.g:883:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            // InternalTurtle.g:884:2: ( rule__Graph__NamespacesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 
            // InternalTurtle.g:885:2: ( rule__Graph__NamespacesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtle.g:885:3: rule__Graph__NamespacesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Graph__NamespacesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 

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


    // $ANTLR start "rule__Graph__Group__2"
    // InternalTurtle.g:893:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:897:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalTurtle.g:898:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__3();

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
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalTurtle.g:905:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__DataGraphAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:909:1: ( ( ( rule__Graph__DataGraphAssignment_2 ) ) )
            // InternalTurtle.g:910:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            {
            // InternalTurtle.g:910:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            // InternalTurtle.g:911:2: ( rule__Graph__DataGraphAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 
            // InternalTurtle.g:912:2: ( rule__Graph__DataGraphAssignment_2 )
            // InternalTurtle.g:912:3: rule__Graph__DataGraphAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Graph__DataGraphAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 

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
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // InternalTurtle.g:920:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:924:1: ( rule__Graph__Group__3__Impl )
            // InternalTurtle.g:925:2: rule__Graph__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__3__Impl();

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
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // InternalTurtle.g:931:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__ShapesGraphAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:935:1: ( ( ( rule__Graph__ShapesGraphAssignment_3 ) ) )
            // InternalTurtle.g:936:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            {
            // InternalTurtle.g:936:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            // InternalTurtle.g:937:2: ( rule__Graph__ShapesGraphAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 
            // InternalTurtle.g:938:2: ( rule__Graph__ShapesGraphAssignment_3 )
            // InternalTurtle.g:938:3: rule__Graph__ShapesGraphAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Graph__ShapesGraphAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 

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
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalTurtle.g:947:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:951:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTurtle.g:952:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

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
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalTurtle.g:959:1: rule__Namespace__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:963:1: ( ( '@prefix' ) )
            // InternalTurtle.g:964:1: ( '@prefix' )
            {
            // InternalTurtle.g:964:1: ( '@prefix' )
            // InternalTurtle.g:965:2: '@prefix'
            {
             before(grammarAccess.getNamespaceAccess().getPrefixKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getPrefixKeyword_0()); 

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
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalTurtle.g:974:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:978:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalTurtle.g:979:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2();

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
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalTurtle.g:986:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PrefixAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:990:1: ( ( ( rule__Namespace__PrefixAssignment_1 ) ) )
            // InternalTurtle.g:991:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            {
            // InternalTurtle.g:991:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            // InternalTurtle.g:992:2: ( rule__Namespace__PrefixAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPrefixAssignment_1()); 
            // InternalTurtle.g:993:2: ( rule__Namespace__PrefixAssignment_1 )
            // InternalTurtle.g:993:3: rule__Namespace__PrefixAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getPrefixAssignment_1()); 

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
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // InternalTurtle.g:1001:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1005:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalTurtle.g:1006:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3();

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
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // InternalTurtle.g:1013:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__NamespaceAssignment_2 ) ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1017:1: ( ( ( rule__Namespace__NamespaceAssignment_2 ) ) )
            // InternalTurtle.g:1018:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            {
            // InternalTurtle.g:1018:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            // InternalTurtle.g:1019:2: ( rule__Namespace__NamespaceAssignment_2 )
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceAssignment_2()); 
            // InternalTurtle.g:1020:2: ( rule__Namespace__NamespaceAssignment_2 )
            // InternalTurtle.g:1020:3: rule__Namespace__NamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__NamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNamespaceAssignment_2()); 

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
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // InternalTurtle.g:1028:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1032:1: ( rule__Namespace__Group__3__Impl )
            // InternalTurtle.g:1033:2: rule__Namespace__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3__Impl();

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
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // InternalTurtle.g:1039:1: rule__Namespace__Group__3__Impl : ( '.' ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1043:1: ( ( '.' ) )
            // InternalTurtle.g:1044:1: ( '.' )
            {
            // InternalTurtle.g:1044:1: ( '.' )
            // InternalTurtle.g:1045:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__DataGraph__Group__0"
    // InternalTurtle.g:1055:1: rule__DataGraph__Group__0 : rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 ;
    public final void rule__DataGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1059:1: ( rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 )
            // InternalTurtle.g:1060:2: rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataGraph__Group__1();

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
    // $ANTLR end "rule__DataGraph__Group__0"


    // $ANTLR start "rule__DataGraph__Group__0__Impl"
    // InternalTurtle.g:1067:1: rule__DataGraph__Group__0__Impl : ( () ) ;
    public final void rule__DataGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1071:1: ( ( () ) )
            // InternalTurtle.g:1072:1: ( () )
            {
            // InternalTurtle.g:1072:1: ( () )
            // InternalTurtle.g:1073:2: ()
            {
             before(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 
            // InternalTurtle.g:1074:2: ()
            // InternalTurtle.g:1074:3: 
            {
            }

             after(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataGraph__Group__0__Impl"


    // $ANTLR start "rule__DataGraph__Group__1"
    // InternalTurtle.g:1082:1: rule__DataGraph__Group__1 : rule__DataGraph__Group__1__Impl ;
    public final void rule__DataGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1086:1: ( rule__DataGraph__Group__1__Impl )
            // InternalTurtle.g:1087:2: rule__DataGraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataGraph__Group__1__Impl();

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
    // $ANTLR end "rule__DataGraph__Group__1"


    // $ANTLR start "rule__DataGraph__Group__1__Impl"
    // InternalTurtle.g:1093:1: rule__DataGraph__Group__1__Impl : ( ( rule__DataGraph__TriplesAssignment_1 )* ) ;
    public final void rule__DataGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1097:1: ( ( ( rule__DataGraph__TriplesAssignment_1 )* ) )
            // InternalTurtle.g:1098:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            {
            // InternalTurtle.g:1098:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            // InternalTurtle.g:1099:2: ( rule__DataGraph__TriplesAssignment_1 )*
            {
             before(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 
            // InternalTurtle.g:1100:2: ( rule__DataGraph__TriplesAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case RULE_IRI:
                    {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)||LA13_2==47) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA13_3 = input.LA(2);

                    if ( ((LA13_3>=RULE_STRING && LA13_3<=RULE_ID)||LA13_3==47) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA13_4 = input.LA(2);

                    if ( ((LA13_4>=RULE_STRING && LA13_4<=RULE_ID)||LA13_4==47) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalTurtle.g:1100:3: rule__DataGraph__TriplesAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DataGraph__TriplesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 

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
    // $ANTLR end "rule__DataGraph__Group__1__Impl"


    // $ANTLR start "rule__Triples__Group__0"
    // InternalTurtle.g:1109:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1113:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalTurtle.g:1114:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Triples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triples__Group__1();

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
    // $ANTLR end "rule__Triples__Group__0"


    // $ANTLR start "rule__Triples__Group__0__Impl"
    // InternalTurtle.g:1121:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1125:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalTurtle.g:1126:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalTurtle.g:1126:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalTurtle.g:1127:2: ( rule__Triples__SubjectAssignment_0 )
            {
             before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            // InternalTurtle.g:1128:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalTurtle.g:1128:3: rule__Triples__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Triples__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 

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
    // $ANTLR end "rule__Triples__Group__0__Impl"


    // $ANTLR start "rule__Triples__Group__1"
    // InternalTurtle.g:1136:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl rule__Triples__Group__2 ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1140:1: ( rule__Triples__Group__1__Impl rule__Triples__Group__2 )
            // InternalTurtle.g:1141:2: rule__Triples__Group__1__Impl rule__Triples__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Triples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triples__Group__2();

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
    // $ANTLR end "rule__Triples__Group__1"


    // $ANTLR start "rule__Triples__Group__1__Impl"
    // InternalTurtle.g:1148:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateobjectAssignment_1 )* ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1152:1: ( ( ( rule__Triples__PredicateobjectAssignment_1 )* ) )
            // InternalTurtle.g:1153:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            {
            // InternalTurtle.g:1153:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            // InternalTurtle.g:1154:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 
            // InternalTurtle.g:1155:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTurtle.g:1155:3: rule__Triples__PredicateobjectAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Triples__PredicateobjectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 

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
    // $ANTLR end "rule__Triples__Group__1__Impl"


    // $ANTLR start "rule__Triples__Group__2"
    // InternalTurtle.g:1163:1: rule__Triples__Group__2 : rule__Triples__Group__2__Impl ;
    public final void rule__Triples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1167:1: ( rule__Triples__Group__2__Impl )
            // InternalTurtle.g:1168:2: rule__Triples__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triples__Group__2__Impl();

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
    // $ANTLR end "rule__Triples__Group__2"


    // $ANTLR start "rule__Triples__Group__2__Impl"
    // InternalTurtle.g:1174:1: rule__Triples__Group__2__Impl : ( '.' ) ;
    public final void rule__Triples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1178:1: ( ( '.' ) )
            // InternalTurtle.g:1179:1: ( '.' )
            {
            // InternalTurtle.g:1179:1: ( '.' )
            // InternalTurtle.g:1180:2: '.'
            {
             before(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Triples__Group__2__Impl"


    // $ANTLR start "rule__PredicateObject__Group__0"
    // InternalTurtle.g:1190:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1194:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalTurtle.g:1195:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PredicateObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__1();

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
    // $ANTLR end "rule__PredicateObject__Group__0"


    // $ANTLR start "rule__PredicateObject__Group__0__Impl"
    // InternalTurtle.g:1202:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__Group_0__0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1206:1: ( ( ( rule__PredicateObject__Group_0__0 ) ) )
            // InternalTurtle.g:1207:1: ( ( rule__PredicateObject__Group_0__0 ) )
            {
            // InternalTurtle.g:1207:1: ( ( rule__PredicateObject__Group_0__0 ) )
            // InternalTurtle.g:1208:2: ( rule__PredicateObject__Group_0__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup_0()); 
            // InternalTurtle.g:1209:2: ( rule__PredicateObject__Group_0__0 )
            // InternalTurtle.g:1209:3: rule__PredicateObject__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectAccess().getGroup_0()); 

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
    // $ANTLR end "rule__PredicateObject__Group__0__Impl"


    // $ANTLR start "rule__PredicateObject__Group__1"
    // InternalTurtle.g:1217:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1221:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalTurtle.g:1222:2: rule__PredicateObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__1__Impl();

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
    // $ANTLR end "rule__PredicateObject__Group__1"


    // $ANTLR start "rule__PredicateObject__Group__1__Impl"
    // InternalTurtle.g:1228:1: rule__PredicateObject__Group__1__Impl : ( ';' ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1232:1: ( ( ';' ) )
            // InternalTurtle.g:1233:1: ( ';' )
            {
            // InternalTurtle.g:1233:1: ( ';' )
            // InternalTurtle.g:1234:2: ';'
            {
             before(grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__PredicateObject__Group__1__Impl"


    // $ANTLR start "rule__PredicateObject__Group_0__0"
    // InternalTurtle.g:1244:1: rule__PredicateObject__Group_0__0 : rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 ;
    public final void rule__PredicateObject__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1248:1: ( rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 )
            // InternalTurtle.g:1249:2: rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__PredicateObject__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group_0__1();

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
    // $ANTLR end "rule__PredicateObject__Group_0__0"


    // $ANTLR start "rule__PredicateObject__Group_0__0__Impl"
    // InternalTurtle.g:1256:1: rule__PredicateObject__Group_0__0__Impl : ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) ;
    public final void rule__PredicateObject__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1260:1: ( ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) )
            // InternalTurtle.g:1261:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            {
            // InternalTurtle.g:1261:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            // InternalTurtle.g:1262:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 
            // InternalTurtle.g:1263:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            // InternalTurtle.g:1263:3: rule__PredicateObject__PredicateAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__PredicateAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 

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
    // $ANTLR end "rule__PredicateObject__Group_0__0__Impl"


    // $ANTLR start "rule__PredicateObject__Group_0__1"
    // InternalTurtle.g:1271:1: rule__PredicateObject__Group_0__1 : rule__PredicateObject__Group_0__1__Impl ;
    public final void rule__PredicateObject__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1275:1: ( rule__PredicateObject__Group_0__1__Impl )
            // InternalTurtle.g:1276:2: rule__PredicateObject__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group_0__1__Impl();

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
    // $ANTLR end "rule__PredicateObject__Group_0__1"


    // $ANTLR start "rule__PredicateObject__Group_0__1__Impl"
    // InternalTurtle.g:1282:1: rule__PredicateObject__Group_0__1__Impl : ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) ;
    public final void rule__PredicateObject__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1286:1: ( ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) )
            // InternalTurtle.g:1287:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            {
            // InternalTurtle.g:1287:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            // InternalTurtle.g:1288:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 
            // InternalTurtle.g:1289:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            // InternalTurtle.g:1289:3: rule__PredicateObject__ObjectAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__ObjectAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 

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
    // $ANTLR end "rule__PredicateObject__Group_0__1__Impl"


    // $ANTLR start "rule__Subject__Group__0"
    // InternalTurtle.g:1298:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1302:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalTurtle.g:1303:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Subject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__1();

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
    // $ANTLR end "rule__Subject__Group__0"


    // $ANTLR start "rule__Subject__Group__0__Impl"
    // InternalTurtle.g:1310:1: rule__Subject__Group__0__Impl : ( () ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1314:1: ( ( () ) )
            // InternalTurtle.g:1315:1: ( () )
            {
            // InternalTurtle.g:1315:1: ( () )
            // InternalTurtle.g:1316:2: ()
            {
             before(grammarAccess.getSubjectAccess().getSubjectAction_0()); 
            // InternalTurtle.g:1317:2: ()
            // InternalTurtle.g:1317:3: 
            {
            }

             after(grammarAccess.getSubjectAccess().getSubjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0__Impl"


    // $ANTLR start "rule__Subject__Group__1"
    // InternalTurtle.g:1325:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1329:1: ( rule__Subject__Group__1__Impl )
            // InternalTurtle.g:1330:2: rule__Subject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__1__Impl();

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
    // $ANTLR end "rule__Subject__Group__1"


    // $ANTLR start "rule__Subject__Group__1__Impl"
    // InternalTurtle.g:1336:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1340:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalTurtle.g:1341:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1341:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalTurtle.g:1342:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1343:2: ( rule__Subject__NameAssignment_1 )
            // InternalTurtle.g:1343:3: rule__Subject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Subject__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalTurtle.g:1352:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1356:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalTurtle.g:1357:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalTurtle.g:1364:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1368:1: ( ( () ) )
            // InternalTurtle.g:1369:1: ( () )
            {
            // InternalTurtle.g:1369:1: ( () )
            // InternalTurtle.g:1370:2: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicateAction_0()); 
            // InternalTurtle.g:1371:2: ()
            // InternalTurtle.g:1371:3: 
            {
            }

             after(grammarAccess.getPredicateAccess().getPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalTurtle.g:1379:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1383:1: ( rule__Predicate__Group__1__Impl )
            // InternalTurtle.g:1384:2: rule__Predicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalTurtle.g:1390:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1394:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalTurtle.g:1395:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1395:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalTurtle.g:1396:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1397:2: ( rule__Predicate__NameAssignment_1 )
            // InternalTurtle.g:1397:3: rule__Predicate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalTurtle.g:1406:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1410:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalTurtle.g:1411:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

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
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalTurtle.g:1418:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1422:1: ( ( () ) )
            // InternalTurtle.g:1423:1: ( () )
            {
            // InternalTurtle.g:1423:1: ( () )
            // InternalTurtle.g:1424:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalTurtle.g:1425:2: ()
            // InternalTurtle.g:1425:3: 
            {
            }

             after(grammarAccess.getObjectAccess().getObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalTurtle.g:1433:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1437:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalTurtle.g:1438:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

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
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalTurtle.g:1445:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1449:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalTurtle.g:1450:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1450:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalTurtle.g:1451:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1452:2: ( rule__Object__NameAssignment_1 )
            // InternalTurtle.g:1452:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalTurtle.g:1460:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1464:1: ( rule__Object__Group__2__Impl )
            // InternalTurtle.g:1465:2: rule__Object__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__2__Impl();

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
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalTurtle.g:1471:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1475:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalTurtle.g:1476:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalTurtle.g:1476:1: ( ( rule__Object__Group_2__0 )? )
            // InternalTurtle.g:1477:2: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // InternalTurtle.g:1478:2: ( rule__Object__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTurtle.g:1478:3: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalTurtle.g:1487:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1491:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalTurtle.g:1492:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

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
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalTurtle.g:1499:1: rule__Object__Group_2__0__Impl : ( '^^' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1503:1: ( ( '^^' ) )
            // InternalTurtle.g:1504:1: ( '^^' )
            {
            // InternalTurtle.g:1504:1: ( '^^' )
            // InternalTurtle.g:1505:2: '^^'
            {
             before(grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 

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
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalTurtle.g:1514:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1518:1: ( rule__Object__Group_2__1__Impl )
            // InternalTurtle.g:1519:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

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
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalTurtle.g:1525:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__XsdTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1529:1: ( ( ( rule__Object__XsdTypeAssignment_2_1 ) ) )
            // InternalTurtle.g:1530:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            {
            // InternalTurtle.g:1530:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            // InternalTurtle.g:1531:2: ( rule__Object__XsdTypeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getXsdTypeAssignment_2_1()); 
            // InternalTurtle.g:1532:2: ( rule__Object__XsdTypeAssignment_2_1 )
            // InternalTurtle.g:1532:3: rule__Object__XsdTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__XsdTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getXsdTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__ShapesGraph__Group__0"
    // InternalTurtle.g:1541:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1545:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalTurtle.g:1546:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:1553:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1557:1: ( ( () ) )
            // InternalTurtle.g:1558:1: ( () )
            {
            // InternalTurtle.g:1558:1: ( () )
            // InternalTurtle.g:1559:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalTurtle.g:1560:2: ()
            // InternalTurtle.g:1560:3: 
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
    // InternalTurtle.g:1568:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1572:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalTurtle.g:1573:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalTurtle.g:1579:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1583:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalTurtle.g:1584:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalTurtle.g:1584:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalTurtle.g:1585:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalTurtle.g:1586:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_IRI && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTurtle.g:1586:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTurtle.g:1595:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1599:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalTurtle.g:1600:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:1607:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1611:1: ( ( () ) )
            // InternalTurtle.g:1612:1: ( () )
            {
            // InternalTurtle.g:1612:1: ( () )
            // InternalTurtle.g:1613:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalTurtle.g:1614:2: ()
            // InternalTurtle.g:1614:3: 
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
    // InternalTurtle.g:1622:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1626:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalTurtle.g:1627:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalTurtle.g:1634:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1638:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalTurtle.g:1639:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalTurtle.g:1639:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalTurtle.g:1640:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalTurtle.g:1641:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalTurtle.g:1641:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalTurtle.g:1649:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1653:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalTurtle.g:1654:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalTurtle.g:1661:1: rule__ShapeConstraint__Group__2__Impl : ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1665:1: ( ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) ) )
            // InternalTurtle.g:1666:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) )
            {
            // InternalTurtle.g:1666:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) )
            // InternalTurtle.g:1667:2: ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* )
            {
            // InternalTurtle.g:1667:2: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalTurtle.g:1668:3: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1669:3: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalTurtle.g:1669:4: rule__ShapeConstraint__Alternatives_2
            {
            pushFollow(FOLLOW_17);
            rule__ShapeConstraint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 

            }

            // InternalTurtle.g:1672:2: ( ( rule__ShapeConstraint__Alternatives_2 )* )
            // InternalTurtle.g:1673:3: ( rule__ShapeConstraint__Alternatives_2 )*
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1674:3: ( rule__ShapeConstraint__Alternatives_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=45)||LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTurtle.g:1674:4: rule__ShapeConstraint__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ShapeConstraint__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ShapeConstraint__Group__2__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group__3"
    // InternalTurtle.g:1683:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1687:1: ( rule__ShapeConstraint__Group__3__Impl )
            // InternalTurtle.g:1688:2: rule__ShapeConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__3__Impl();

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
    // InternalTurtle.g:1694:1: rule__ShapeConstraint__Group__3__Impl : ( '.' ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1698:1: ( ( '.' ) )
            // InternalTurtle.g:1699:1: ( '.' )
            {
            // InternalTurtle.g:1699:1: ( '.' )
            // InternalTurtle.g:1700:2: '.'
            {
             before(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3()); 

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


    // $ANTLR start "rule__Target__Group__0"
    // InternalTurtle.g:1710:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1714:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalTurtle.g:1715:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTurtle.g:1722:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1726:1: ( ( () ) )
            // InternalTurtle.g:1727:1: ( () )
            {
            // InternalTurtle.g:1727:1: ( () )
            // InternalTurtle.g:1728:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalTurtle.g:1729:2: ()
            // InternalTurtle.g:1729:3: 
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
    // InternalTurtle.g:1737:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1741:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalTurtle.g:1742:2: rule__Target__Group__1__Impl rule__Target__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:1749:1: rule__Target__Group__1__Impl : ( ( rule__Target__TypeAssignment_1 ) ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1753:1: ( ( ( rule__Target__TypeAssignment_1 ) ) )
            // InternalTurtle.g:1754:1: ( ( rule__Target__TypeAssignment_1 ) )
            {
            // InternalTurtle.g:1754:1: ( ( rule__Target__TypeAssignment_1 ) )
            // InternalTurtle.g:1755:2: ( rule__Target__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetAccess().getTypeAssignment_1()); 
            // InternalTurtle.g:1756:2: ( rule__Target__TypeAssignment_1 )
            // InternalTurtle.g:1756:3: rule__Target__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTypeAssignment_1()); 

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
    // InternalTurtle.g:1764:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1768:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalTurtle.g:1769:2: rule__Target__Group__2__Impl rule__Target__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalTurtle.g:1776:1: rule__Target__Group__2__Impl : ( ( rule__Target__TermAssignment_2 ) ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1780:1: ( ( ( rule__Target__TermAssignment_2 ) ) )
            // InternalTurtle.g:1781:1: ( ( rule__Target__TermAssignment_2 ) )
            {
            // InternalTurtle.g:1781:1: ( ( rule__Target__TermAssignment_2 ) )
            // InternalTurtle.g:1782:2: ( rule__Target__TermAssignment_2 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_2()); 
            // InternalTurtle.g:1783:2: ( rule__Target__TermAssignment_2 )
            // InternalTurtle.g:1783:3: rule__Target__TermAssignment_2
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
    // InternalTurtle.g:1791:1: rule__Target__Group__3 : rule__Target__Group__3__Impl ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1795:1: ( rule__Target__Group__3__Impl )
            // InternalTurtle.g:1796:2: rule__Target__Group__3__Impl
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
    // InternalTurtle.g:1802:1: rule__Target__Group__3__Impl : ( ';' ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1806:1: ( ( ';' ) )
            // InternalTurtle.g:1807:1: ( ';' )
            {
            // InternalTurtle.g:1807:1: ( ';' )
            // InternalTurtle.g:1808:2: ';'
            {
             before(grammarAccess.getTargetAccess().getSemicolonKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getSemicolonKeyword_3()); 

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


    // $ANTLR start "rule__ShapeName__Group__0"
    // InternalTurtle.g:1818:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1822:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalTurtle.g:1823:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:1830:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1834:1: ( ( () ) )
            // InternalTurtle.g:1835:1: ( () )
            {
            // InternalTurtle.g:1835:1: ( () )
            // InternalTurtle.g:1836:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalTurtle.g:1837:2: ()
            // InternalTurtle.g:1837:3: 
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
    // InternalTurtle.g:1845:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1849:1: ( rule__ShapeName__Group__1__Impl )
            // InternalTurtle.g:1850:2: rule__ShapeName__Group__1__Impl
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
    // InternalTurtle.g:1856:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1860:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalTurtle.g:1861:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1861:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalTurtle.g:1862:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1863:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalTurtle.g:1863:3: rule__ShapeName__NameAssignment_1
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
    // InternalTurtle.g:1872:1: rule__ShapeExpression__Group__0 : rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 ;
    public final void rule__ShapeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1876:1: ( rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 )
            // InternalTurtle.g:1877:2: rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:1884:1: rule__ShapeExpression__Group__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1888:1: ( ( () ) )
            // InternalTurtle.g:1889:1: ( () )
            {
            // InternalTurtle.g:1889:1: ( () )
            // InternalTurtle.g:1890:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0()); 
            // InternalTurtle.g:1891:2: ()
            // InternalTurtle.g:1891:3: 
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
    // InternalTurtle.g:1899:1: rule__ShapeExpression__Group__1 : rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2 ;
    public final void rule__ShapeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1903:1: ( rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2 )
            // InternalTurtle.g:1904:2: rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ShapeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group__2();

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
    // InternalTurtle.g:1911:1: rule__ShapeExpression__Group__1__Impl : ( ( rule__ShapeExpression__Alternatives_1 ) ) ;
    public final void rule__ShapeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1915:1: ( ( ( rule__ShapeExpression__Alternatives_1 ) ) )
            // InternalTurtle.g:1916:1: ( ( rule__ShapeExpression__Alternatives_1 ) )
            {
            // InternalTurtle.g:1916:1: ( ( rule__ShapeExpression__Alternatives_1 ) )
            // InternalTurtle.g:1917:2: ( rule__ShapeExpression__Alternatives_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1()); 
            // InternalTurtle.g:1918:2: ( rule__ShapeExpression__Alternatives_1 )
            // InternalTurtle.g:1918:3: rule__ShapeExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__ShapeExpression__Group__2"
    // InternalTurtle.g:1926:1: rule__ShapeExpression__Group__2 : rule__ShapeExpression__Group__2__Impl ;
    public final void rule__ShapeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1930:1: ( rule__ShapeExpression__Group__2__Impl )
            // InternalTurtle.g:1931:2: rule__ShapeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group__2"


    // $ANTLR start "rule__ShapeExpression__Group__2__Impl"
    // InternalTurtle.g:1937:1: rule__ShapeExpression__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ShapeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1941:1: ( ( ( ';' )? ) )
            // InternalTurtle.g:1942:1: ( ( ';' )? )
            {
            // InternalTurtle.g:1942:1: ( ( ';' )? )
            // InternalTurtle.g:1943:2: ( ';' )?
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_2()); 
            // InternalTurtle.g:1944:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTurtle.g:1944:3: ';'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__0"
    // InternalTurtle.g:1953:1: rule__ShapeExpression__Group_1_0__0 : rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 ;
    public final void rule__ShapeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1957:1: ( rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 )
            // InternalTurtle.g:1958:2: rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__0__Impl"
    // InternalTurtle.g:1965:1: rule__ShapeExpression__Group_1_0__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1969:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) )
            // InternalTurtle.g:1970:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            {
            // InternalTurtle.g:1970:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            // InternalTurtle.g:1971:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0()); 
            // InternalTurtle.g:1972:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            // InternalTurtle.g:1972:3: rule__ShapeExpression__TypeAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__1"
    // InternalTurtle.g:1980:1: rule__ShapeExpression__Group_1_0__1 : rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2 ;
    public final void rule__ShapeExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1984:1: ( rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2 )
            // InternalTurtle.g:1985:2: rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__ShapeExpression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__1__Impl"
    // InternalTurtle.g:1992:1: rule__ShapeExpression__Group_1_0__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1996:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) ) )
            // InternalTurtle.g:1997:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) )
            {
            // InternalTurtle.g:1997:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) )
            // InternalTurtle.g:1998:2: ( rule__ShapeExpression__ValuesAssignment_1_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_1()); 
            // InternalTurtle.g:1999:2: ( rule__ShapeExpression__ValuesAssignment_1_0_1 )
            // InternalTurtle.g:1999:3: rule__ShapeExpression__ValuesAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__2"
    // InternalTurtle.g:2007:1: rule__ShapeExpression__Group_1_0__2 : rule__ShapeExpression__Group_1_0__2__Impl ;
    public final void rule__ShapeExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2011:1: ( rule__ShapeExpression__Group_1_0__2__Impl )
            // InternalTurtle.g:2012:2: rule__ShapeExpression__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__2"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__2__Impl"
    // InternalTurtle.g:2018:1: rule__ShapeExpression__Group_1_0__2__Impl : ( ( rule__ShapeExpression__Group_1_0_2__0 )* ) ;
    public final void rule__ShapeExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2022:1: ( ( ( rule__ShapeExpression__Group_1_0_2__0 )* ) )
            // InternalTurtle.g:2023:1: ( ( rule__ShapeExpression__Group_1_0_2__0 )* )
            {
            // InternalTurtle.g:2023:1: ( ( rule__ShapeExpression__Group_1_0_2__0 )* )
            // InternalTurtle.g:2024:2: ( rule__ShapeExpression__Group_1_0_2__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_0_2()); 
            // InternalTurtle.g:2025:2: ( rule__ShapeExpression__Group_1_0_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTurtle.g:2025:3: rule__ShapeExpression__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ShapeExpression__Group_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_0_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0_2__0"
    // InternalTurtle.g:2034:1: rule__ShapeExpression__Group_1_0_2__0 : rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1 ;
    public final void rule__ShapeExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2038:1: ( rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1 )
            // InternalTurtle.g:2039:2: rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeExpression__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0_2__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0_2__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_0_2__0__Impl"
    // InternalTurtle.g:2046:1: rule__ShapeExpression__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__ShapeExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2050:1: ( ( ',' ) )
            // InternalTurtle.g:2051:1: ( ',' )
            {
            // InternalTurtle.g:2051:1: ( ',' )
            // InternalTurtle.g:2052:2: ','
            {
             before(grammarAccess.getShapeExpressionAccess().getCommaKeyword_1_0_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getCommaKeyword_1_0_2_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0_2__1"
    // InternalTurtle.g:2061:1: rule__ShapeExpression__Group_1_0_2__1 : rule__ShapeExpression__Group_1_0_2__1__Impl ;
    public final void rule__ShapeExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2065:1: ( rule__ShapeExpression__Group_1_0_2__1__Impl )
            // InternalTurtle.g:2066:2: rule__ShapeExpression__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0_2__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_0_2__1__Impl"
    // InternalTurtle.g:2072:1: rule__ShapeExpression__Group_1_0_2__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) ) ;
    public final void rule__ShapeExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2076:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) ) )
            // InternalTurtle.g:2077:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) )
            {
            // InternalTurtle.g:2077:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) )
            // InternalTurtle.g:2078:2: ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_2_1()); 
            // InternalTurtle.g:2079:2: ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 )
            // InternalTurtle.g:2079:3: rule__ShapeExpression__ValuesAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__ValuesAssignment_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_2_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__0"
    // InternalTurtle.g:2088:1: rule__ShapeExpression__Group_1_1__0 : rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 ;
    public final void rule__ShapeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2092:1: ( rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 )
            // InternalTurtle.g:2093:2: rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ShapeExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__0__Impl"
    // InternalTurtle.g:2100:1: rule__ShapeExpression__Group_1_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2104:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) )
            // InternalTurtle.g:2105:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            {
            // InternalTurtle.g:2105:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            // InternalTurtle.g:2106:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0()); 
            // InternalTurtle.g:2107:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            // InternalTurtle.g:2107:3: rule__ShapeExpression__TypeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__1"
    // InternalTurtle.g:2115:1: rule__ShapeExpression__Group_1_1__1 : rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 ;
    public final void rule__ShapeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2119:1: ( rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 )
            // InternalTurtle.g:2120:2: rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_23);
            rule__ShapeExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__1__Impl"
    // InternalTurtle.g:2127:1: rule__ShapeExpression__Group_1_1__1__Impl : ( '(' ) ;
    public final void rule__ShapeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2131:1: ( ( '(' ) )
            // InternalTurtle.g:2132:1: ( '(' )
            {
            // InternalTurtle.g:2132:1: ( '(' )
            // InternalTurtle.g:2133:2: '('
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__2"
    // InternalTurtle.g:2142:1: rule__ShapeExpression__Group_1_1__2 : rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3 ;
    public final void rule__ShapeExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2146:1: ( rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3 )
            // InternalTurtle.g:2147:2: rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3
            {
            pushFollow(FOLLOW_24);
            rule__ShapeExpression__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__3();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__2"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__2__Impl"
    // InternalTurtle.g:2154:1: rule__ShapeExpression__Group_1_1__2__Impl : ( ( rule__ShapeExpression__Alternatives_1_1_2 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2158:1: ( ( ( rule__ShapeExpression__Alternatives_1_1_2 ) ) )
            // InternalTurtle.g:2159:1: ( ( rule__ShapeExpression__Alternatives_1_1_2 ) )
            {
            // InternalTurtle.g:2159:1: ( ( rule__ShapeExpression__Alternatives_1_1_2 ) )
            // InternalTurtle.g:2160:2: ( rule__ShapeExpression__Alternatives_1_1_2 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_2()); 
            // InternalTurtle.g:2161:2: ( rule__ShapeExpression__Alternatives_1_1_2 )
            // InternalTurtle.g:2161:3: rule__ShapeExpression__Alternatives_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__3"
    // InternalTurtle.g:2169:1: rule__ShapeExpression__Group_1_1__3 : rule__ShapeExpression__Group_1_1__3__Impl ;
    public final void rule__ShapeExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2173:1: ( rule__ShapeExpression__Group_1_1__3__Impl )
            // InternalTurtle.g:2174:2: rule__ShapeExpression__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__3__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__3"


    // $ANTLR start "rule__ShapeExpression__Group_1_1__3__Impl"
    // InternalTurtle.g:2180:1: rule__ShapeExpression__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__ShapeExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2184:1: ( ( ')' ) )
            // InternalTurtle.g:2185:1: ( ')' )
            {
            // InternalTurtle.g:2185:1: ( ')' )
            // InternalTurtle.g:2186:2: ')'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_1_3()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_1__3__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__0"
    // InternalTurtle.g:2196:1: rule__ShapeExpression__Group_1_2__0 : rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 ;
    public final void rule__ShapeExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2200:1: ( rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 )
            // InternalTurtle.g:2201:2: rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_19);
            rule__ShapeExpression__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__0__Impl"
    // InternalTurtle.g:2208:1: rule__ShapeExpression__Group_1_2__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? ) ;
    public final void rule__ShapeExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2212:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? ) )
            // InternalTurtle.g:2213:1: ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? )
            {
            // InternalTurtle.g:2213:1: ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? )
            // InternalTurtle.g:2214:2: ( rule__ShapeExpression__TypeAssignment_1_2_0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_2_0()); 
            // InternalTurtle.g:2215:2: ( rule__ShapeExpression__TypeAssignment_1_2_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=14 && LA20_0<=45)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTurtle.g:2215:3: rule__ShapeExpression__TypeAssignment_1_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__TypeAssignment_1_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_2_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__1"
    // InternalTurtle.g:2223:1: rule__ShapeExpression__Group_1_2__1 : rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2 ;
    public final void rule__ShapeExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2227:1: ( rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2 )
            // InternalTurtle.g:2228:2: rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2
            {
            pushFollow(FOLLOW_25);
            rule__ShapeExpression__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__1__Impl"
    // InternalTurtle.g:2235:1: rule__ShapeExpression__Group_1_2__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2239:1: ( ( '[' ) )
            // InternalTurtle.g:2240:1: ( '[' )
            {
            // InternalTurtle.g:2240:1: ( '[' )
            // InternalTurtle.g:2241:2: '['
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__2"
    // InternalTurtle.g:2250:1: rule__ShapeExpression__Group_1_2__2 : rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3 ;
    public final void rule__ShapeExpression__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2254:1: ( rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3 )
            // InternalTurtle.g:2255:2: rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3
            {
            pushFollow(FOLLOW_25);
            rule__ShapeExpression__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2__3();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__2"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__2__Impl"
    // InternalTurtle.g:2262:1: rule__ShapeExpression__Group_1_2__2__Impl : ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* ) ;
    public final void rule__ShapeExpression__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2266:1: ( ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* ) )
            // InternalTurtle.g:2267:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* )
            {
            // InternalTurtle.g:2267:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* )
            // InternalTurtle.g:2268:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_2()); 
            // InternalTurtle.g:2269:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=45)||LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTurtle.g:2269:3: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__3"
    // InternalTurtle.g:2277:1: rule__ShapeExpression__Group_1_2__3 : rule__ShapeExpression__Group_1_2__3__Impl ;
    public final void rule__ShapeExpression__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2281:1: ( rule__ShapeExpression__Group_1_2__3__Impl )
            // InternalTurtle.g:2282:2: rule__ShapeExpression__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2__3__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__3"


    // $ANTLR start "rule__ShapeExpression__Group_1_2__3__Impl"
    // InternalTurtle.g:2288:1: rule__ShapeExpression__Group_1_2__3__Impl : ( ']' ) ;
    public final void rule__ShapeExpression__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2292:1: ( ( ']' ) )
            // InternalTurtle.g:2293:1: ( ']' )
            {
            // InternalTurtle.g:2293:1: ( ']' )
            // InternalTurtle.g:2294:2: ']'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_3()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2__3__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalTurtle.g:2304:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2308:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalTurtle.g:2309:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:2316:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2320:1: ( ( () ) )
            // InternalTurtle.g:2321:1: ( () )
            {
            // InternalTurtle.g:2321:1: ( () )
            // InternalTurtle.g:2322:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalTurtle.g:2323:2: ()
            // InternalTurtle.g:2323:3: 
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
    // InternalTurtle.g:2331:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2335:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalTurtle.g:2336:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

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
    // InternalTurtle.g:2343:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2347:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalTurtle.g:2348:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalTurtle.g:2348:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalTurtle.g:2349:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalTurtle.g:2350:2: ( rule__Value__NameAssignment_1 )
            // InternalTurtle.g:2350:3: rule__Value__NameAssignment_1
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


    // $ANTLR start "rule__Value__Group__2"
    // InternalTurtle.g:2358:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2362:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalTurtle.g:2363:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__3();

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
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalTurtle.g:2370:1: rule__Value__Group__2__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2374:1: ( ( ( RULE_ID )? ) )
            // InternalTurtle.g:2375:1: ( ( RULE_ID )? )
            {
            // InternalTurtle.g:2375:1: ( ( RULE_ID )? )
            // InternalTurtle.g:2376:2: ( RULE_ID )?
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_2()); 
            // InternalTurtle.g:2377:2: ( RULE_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTurtle.g:2377:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__3"
    // InternalTurtle.g:2385:1: rule__Value__Group__3 : rule__Value__Group__3__Impl ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2389:1: ( rule__Value__Group__3__Impl )
            // InternalTurtle.g:2390:2: rule__Value__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__3__Impl();

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
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // InternalTurtle.g:2396:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2400:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalTurtle.g:2401:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalTurtle.g:2401:1: ( ( rule__Value__Group_3__0 )? )
            // InternalTurtle.g:2402:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalTurtle.g:2403:2: ( rule__Value__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTurtle.g:2403:3: rule__Value__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__Value__Group_3__0"
    // InternalTurtle.g:2412:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2416:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalTurtle.g:2417:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Value__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1();

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
    // $ANTLR end "rule__Value__Group_3__0"


    // $ANTLR start "rule__Value__Group_3__0__Impl"
    // InternalTurtle.g:2424:1: rule__Value__Group_3__0__Impl : ( '^^' ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2428:1: ( ( '^^' ) )
            // InternalTurtle.g:2429:1: ( '^^' )
            {
            // InternalTurtle.g:2429:1: ( '^^' )
            // InternalTurtle.g:2430:2: '^^'
            {
             before(grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_3_0()); 

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
    // $ANTLR end "rule__Value__Group_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3__1"
    // InternalTurtle.g:2439:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2443:1: ( rule__Value__Group_3__1__Impl )
            // InternalTurtle.g:2444:2: rule__Value__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1__Impl();

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
    // $ANTLR end "rule__Value__Group_3__1"


    // $ANTLR start "rule__Value__Group_3__1__Impl"
    // InternalTurtle.g:2450:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__XsdTypeAssignment_3_1 ) ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2454:1: ( ( ( rule__Value__XsdTypeAssignment_3_1 ) ) )
            // InternalTurtle.g:2455:1: ( ( rule__Value__XsdTypeAssignment_3_1 ) )
            {
            // InternalTurtle.g:2455:1: ( ( rule__Value__XsdTypeAssignment_3_1 ) )
            // InternalTurtle.g:2456:2: ( rule__Value__XsdTypeAssignment_3_1 )
            {
             before(grammarAccess.getValueAccess().getXsdTypeAssignment_3_1()); 
            // InternalTurtle.g:2457:2: ( rule__Value__XsdTypeAssignment_3_1 )
            // InternalTurtle.g:2457:3: rule__Value__XsdTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__XsdTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getXsdTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Value__Group_3__1__Impl"


    // $ANTLR start "rule__Graph__NamespacesAssignment_1"
    // InternalTurtle.g:2466:1: rule__Graph__NamespacesAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Graph__NamespacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2470:1: ( ( ruleNamespace ) )
            // InternalTurtle.g:2471:2: ( ruleNamespace )
            {
            // InternalTurtle.g:2471:2: ( ruleNamespace )
            // InternalTurtle.g:2472:3: ruleNamespace
            {
             before(grammarAccess.getGraphAccess().getNamespacesNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getNamespacesNamespaceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Graph__NamespacesAssignment_1"


    // $ANTLR start "rule__Graph__DataGraphAssignment_2"
    // InternalTurtle.g:2481:1: rule__Graph__DataGraphAssignment_2 : ( ruleDataGraph ) ;
    public final void rule__Graph__DataGraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2485:1: ( ( ruleDataGraph ) )
            // InternalTurtle.g:2486:2: ( ruleDataGraph )
            {
            // InternalTurtle.g:2486:2: ( ruleDataGraph )
            // InternalTurtle.g:2487:3: ruleDataGraph
            {
             before(grammarAccess.getGraphAccess().getDataGraphDataGraphParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataGraph();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getDataGraphDataGraphParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Graph__DataGraphAssignment_2"


    // $ANTLR start "rule__Graph__ShapesGraphAssignment_3"
    // InternalTurtle.g:2496:1: rule__Graph__ShapesGraphAssignment_3 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2500:1: ( ( ruleShapesGraph ) )
            // InternalTurtle.g:2501:2: ( ruleShapesGraph )
            {
            // InternalTurtle.g:2501:2: ( ruleShapesGraph )
            // InternalTurtle.g:2502:3: ruleShapesGraph
            {
             before(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShapesGraph();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Graph__ShapesGraphAssignment_3"


    // $ANTLR start "rule__Namespace__PrefixAssignment_1"
    // InternalTurtle.g:2511:1: rule__Namespace__PrefixAssignment_1 : ( RULE_ID ) ;
    public final void rule__Namespace__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2515:1: ( ( RULE_ID ) )
            // InternalTurtle.g:2516:2: ( RULE_ID )
            {
            // InternalTurtle.g:2516:2: ( RULE_ID )
            // InternalTurtle.g:2517:3: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getPrefixIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getPrefixIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Namespace__PrefixAssignment_1"


    // $ANTLR start "rule__Namespace__NamespaceAssignment_2"
    // InternalTurtle.g:2526:1: rule__Namespace__NamespaceAssignment_2 : ( RULE_IRI ) ;
    public final void rule__Namespace__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2530:1: ( ( RULE_IRI ) )
            // InternalTurtle.g:2531:2: ( RULE_IRI )
            {
            // InternalTurtle.g:2531:2: ( RULE_IRI )
            // InternalTurtle.g:2532:3: RULE_IRI
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceIRITerminalRuleCall_2_0()); 
            match(input,RULE_IRI,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceIRITerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Namespace__NamespaceAssignment_2"


    // $ANTLR start "rule__DataGraph__TriplesAssignment_1"
    // InternalTurtle.g:2541:1: rule__DataGraph__TriplesAssignment_1 : ( ruleTriples ) ;
    public final void rule__DataGraph__TriplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2545:1: ( ( ruleTriples ) )
            // InternalTurtle.g:2546:2: ( ruleTriples )
            {
            // InternalTurtle.g:2546:2: ( ruleTriples )
            // InternalTurtle.g:2547:3: ruleTriples
            {
             before(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTriples();

            state._fsp--;

             after(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataGraph__TriplesAssignment_1"


    // $ANTLR start "rule__Triples__SubjectAssignment_0"
    // InternalTurtle.g:2556:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2560:1: ( ( ruleSubject ) )
            // InternalTurtle.g:2561:2: ( ruleSubject )
            {
            // InternalTurtle.g:2561:2: ( ruleSubject )
            // InternalTurtle.g:2562:3: ruleSubject
            {
             before(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Triples__SubjectAssignment_0"


    // $ANTLR start "rule__Triples__PredicateobjectAssignment_1"
    // InternalTurtle.g:2571:1: rule__Triples__PredicateobjectAssignment_1 : ( rulePredicateObject ) ;
    public final void rule__Triples__PredicateobjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2575:1: ( ( rulePredicateObject ) )
            // InternalTurtle.g:2576:2: ( rulePredicateObject )
            {
            // InternalTurtle.g:2576:2: ( rulePredicateObject )
            // InternalTurtle.g:2577:3: rulePredicateObject
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateObject();

            state._fsp--;

             after(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Triples__PredicateobjectAssignment_1"


    // $ANTLR start "rule__PredicateObject__PredicateAssignment_0_0"
    // InternalTurtle.g:2586:1: rule__PredicateObject__PredicateAssignment_0_0 : ( rulePredicate ) ;
    public final void rule__PredicateObject__PredicateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2590:1: ( ( rulePredicate ) )
            // InternalTurtle.g:2591:2: ( rulePredicate )
            {
            // InternalTurtle.g:2591:2: ( rulePredicate )
            // InternalTurtle.g:2592:3: rulePredicate
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicatePredicateParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateObjectAccess().getPredicatePredicateParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__PredicateObject__PredicateAssignment_0_0"


    // $ANTLR start "rule__PredicateObject__ObjectAssignment_0_1"
    // InternalTurtle.g:2601:1: rule__PredicateObject__ObjectAssignment_0_1 : ( ruleObject ) ;
    public final void rule__PredicateObject__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2605:1: ( ( ruleObject ) )
            // InternalTurtle.g:2606:2: ( ruleObject )
            {
            // InternalTurtle.g:2606:2: ( ruleObject )
            // InternalTurtle.g:2607:3: ruleObject
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PredicateObject__ObjectAssignment_0_1"


    // $ANTLR start "rule__Subject__NameAssignment_1"
    // InternalTurtle.g:2616:1: rule__Subject__NameAssignment_1 : ( ( rule__Subject__NameAlternatives_1_0 ) ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2620:1: ( ( ( rule__Subject__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2621:2: ( ( rule__Subject__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2621:2: ( ( rule__Subject__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2622:3: ( rule__Subject__NameAlternatives_1_0 )
            {
             before(grammarAccess.getSubjectAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2623:3: ( rule__Subject__NameAlternatives_1_0 )
            // InternalTurtle.g:2623:4: rule__Subject__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Subject__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Subject__NameAssignment_1"


    // $ANTLR start "rule__Predicate__NameAssignment_1"
    // InternalTurtle.g:2631:1: rule__Predicate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2635:1: ( ( ruleEString ) )
            // InternalTurtle.g:2636:2: ( ruleEString )
            {
            // InternalTurtle.g:2636:2: ( ruleEString )
            // InternalTurtle.g:2637:3: ruleEString
            {
             before(grammarAccess.getPredicateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Predicate__NameAssignment_1"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // InternalTurtle.g:2646:1: rule__Object__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2650:1: ( ( ruleEString ) )
            // InternalTurtle.g:2651:2: ( ruleEString )
            {
            // InternalTurtle.g:2651:2: ( ruleEString )
            // InternalTurtle.g:2652:3: ruleEString
            {
             before(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Object__XsdTypeAssignment_2_1"
    // InternalTurtle.g:2661:1: rule__Object__XsdTypeAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Object__XsdTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2665:1: ( ( ruleEString ) )
            // InternalTurtle.g:2666:2: ( ruleEString )
            {
            // InternalTurtle.g:2666:2: ( ruleEString )
            // InternalTurtle.g:2667:3: ruleEString
            {
             before(grammarAccess.getObjectAccess().getXsdTypeEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getXsdTypeEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Object__XsdTypeAssignment_2_1"


    // $ANTLR start "rule__ShapesGraph__ShapeConstraintsAssignment_1"
    // InternalTurtle.g:2676:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2680:1: ( ( ruleShapeConstraint ) )
            // InternalTurtle.g:2681:2: ( ruleShapeConstraint )
            {
            // InternalTurtle.g:2681:2: ( ruleShapeConstraint )
            // InternalTurtle.g:2682:3: ruleShapeConstraint
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
    // InternalTurtle.g:2691:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2695:1: ( ( ruleShapeName ) )
            // InternalTurtle.g:2696:2: ( ruleShapeName )
            {
            // InternalTurtle.g:2696:2: ( ruleShapeName )
            // InternalTurtle.g:2697:3: ruleShapeName
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


    // $ANTLR start "rule__ShapeConstraint__TargetsAssignment_2_0"
    // InternalTurtle.g:2706:1: rule__ShapeConstraint__TargetsAssignment_2_0 : ( ruleTarget ) ;
    public final void rule__ShapeConstraint__TargetsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2710:1: ( ( ruleTarget ) )
            // InternalTurtle.g:2711:2: ( ruleTarget )
            {
            // InternalTurtle.g:2711:2: ( ruleTarget )
            // InternalTurtle.g:2712:3: ruleTarget
            {
             before(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ShapeConstraint__TargetsAssignment_2_0"


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1"
    // InternalTurtle.g:2721:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2725:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2726:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2726:2: ( ruleShapeExpression )
            // InternalTurtle.g:2727:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1"


    // $ANTLR start "rule__Target__TypeAssignment_1"
    // InternalTurtle.g:2736:1: rule__Target__TypeAssignment_1 : ( ( rule__Target__TypeAlternatives_1_0 ) ) ;
    public final void rule__Target__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2740:1: ( ( ( rule__Target__TypeAlternatives_1_0 ) ) )
            // InternalTurtle.g:2741:2: ( ( rule__Target__TypeAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2741:2: ( ( rule__Target__TypeAlternatives_1_0 ) )
            // InternalTurtle.g:2742:3: ( rule__Target__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getTargetAccess().getTypeAlternatives_1_0()); 
            // InternalTurtle.g:2743:3: ( rule__Target__TypeAlternatives_1_0 )
            // InternalTurtle.g:2743:4: rule__Target__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Target__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Target__TypeAssignment_1"


    // $ANTLR start "rule__Target__TermAssignment_2"
    // InternalTurtle.g:2751:1: rule__Target__TermAssignment_2 : ( ( rule__Target__TermAlternatives_2_0 ) ) ;
    public final void rule__Target__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2755:1: ( ( ( rule__Target__TermAlternatives_2_0 ) ) )
            // InternalTurtle.g:2756:2: ( ( rule__Target__TermAlternatives_2_0 ) )
            {
            // InternalTurtle.g:2756:2: ( ( rule__Target__TermAlternatives_2_0 ) )
            // InternalTurtle.g:2757:3: ( rule__Target__TermAlternatives_2_0 )
            {
             before(grammarAccess.getTargetAccess().getTermAlternatives_2_0()); 
            // InternalTurtle.g:2758:3: ( rule__Target__TermAlternatives_2_0 )
            // InternalTurtle.g:2758:4: rule__Target__TermAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Target__TermAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getTermAlternatives_2_0()); 

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


    // $ANTLR start "rule__ShapeName__NameAssignment_1"
    // InternalTurtle.g:2766:1: rule__ShapeName__NameAssignment_1 : ( ( rule__ShapeName__NameAlternatives_1_0 ) ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2770:1: ( ( ( rule__ShapeName__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2771:2: ( ( rule__ShapeName__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2771:2: ( ( rule__ShapeName__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2772:3: ( rule__ShapeName__NameAlternatives_1_0 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2773:3: ( rule__ShapeName__NameAlternatives_1_0 )
            // InternalTurtle.g:2773:4: rule__ShapeName__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeName__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeNameAccess().getNameAlternatives_1_0()); 

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


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_0_0"
    // InternalTurtle.g:2781:1: rule__ShapeExpression__TypeAssignment_1_0_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2785:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2786:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2786:2: ( rulePropertyType )
            // InternalTurtle.g:2787:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_0_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_0_1"
    // InternalTurtle.g:2796:1: rule__ShapeExpression__ValuesAssignment_1_0_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2800:1: ( ( ruleValue ) )
            // InternalTurtle.g:2801:2: ( ruleValue )
            {
            // InternalTurtle.g:2801:2: ( ruleValue )
            // InternalTurtle.g:2802:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_0_1"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_0_2_1"
    // InternalTurtle.g:2811:1: rule__ShapeExpression__ValuesAssignment_1_0_2_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2815:1: ( ( ruleValue ) )
            // InternalTurtle.g:2816:2: ( ruleValue )
            {
            // InternalTurtle.g:2816:2: ( ruleValue )
            // InternalTurtle.g:2817:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_2_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_0_2_1"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_1_0"
    // InternalTurtle.g:2826:1: rule__ShapeExpression__TypeAssignment_1_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2830:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2831:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2831:2: ( rulePropertyType )
            // InternalTurtle.g:2832:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_1_2_0"
    // InternalTurtle.g:2841:1: rule__ShapeExpression__ValuesAssignment_1_1_2_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2845:1: ( ( ruleValue ) )
            // InternalTurtle.g:2846:2: ( ruleValue )
            {
            // InternalTurtle.g:2846:2: ( ruleValue )
            // InternalTurtle.g:2847:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_2_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_1_2_0"


    // $ANTLR start "rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1"
    // InternalTurtle.g:2856:1: rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2860:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2861:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2861:2: ( ruleShapeExpression )
            // InternalTurtle.g:2862:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_1_2_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_2_0"
    // InternalTurtle.g:2871:1: rule__ShapeExpression__TypeAssignment_1_2_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2875:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2876:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2876:2: ( rulePropertyType )
            // InternalTurtle.g:2877:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_2_0"


    // $ANTLR start "rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2"
    // InternalTurtle.g:2886:1: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 : ( ruleShapeExpression ) ;
    public final void rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2890:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2891:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2891:2: ( ruleShapeExpression )
            // InternalTurtle.g:2892:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalTurtle.g:2901:1: rule__Value__NameAssignment_1 : ( ( rule__Value__NameAlternatives_1_0 ) ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2905:1: ( ( ( rule__Value__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2906:2: ( ( rule__Value__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2906:2: ( ( rule__Value__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2907:3: ( rule__Value__NameAlternatives_1_0 )
            {
             before(grammarAccess.getValueAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2908:3: ( rule__Value__NameAlternatives_1_0 )
            // InternalTurtle.g:2908:4: rule__Value__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAlternatives_1_0()); 

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


    // $ANTLR start "rule__Value__XsdTypeAssignment_3_1"
    // InternalTurtle.g:2916:1: rule__Value__XsdTypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Value__XsdTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2920:1: ( ( ruleEString ) )
            // InternalTurtle.g:2921:2: ( ruleEString )
            {
            // InternalTurtle.g:2921:2: ( ruleEString )
            // InternalTurtle.g:2922:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Value__XsdTypeAssignment_3_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\44\uffff";
    static final String dfa_2s = "\1\16\40\4\3\uffff";
    static final String dfa_3s = "\41\65\3\uffff";
    static final String dfa_4s = "\41\uffff\1\3\1\2\1\1";
    static final String dfa_5s = "\44\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\7\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
            "\3\43\54\uffff\1\42\1\uffff\1\41",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "548:1: rule__ShapeExpression__Alternatives_1 : ( ( ( rule__ShapeExpression__Group_1_0__0 ) ) | ( ( rule__ShapeExpression__Group_1_1__0 ) ) | ( ( rule__ShapeExpression__Group_1_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00203FFFFFFFC002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00203FFFFFFFF000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00203FFFFFFFF002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00203FFFFFFFC000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00203FFFFFFFC070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00603FFFFFFFC000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000040L});

}