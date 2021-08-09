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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IRI", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sh:targetClass'", "'sh:targetNode'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:path'", "'sh:inversePath'", "'sh:property'", "'sh:name'", "'sh:message'", "'sh:equals'", "'sh:minExclusive'", "'sh:minInclusive'", "'sh:maxExclusive'", "'sh:maxInclusive'", "'sh:maxLength'", "'sh:minLength'", "'sh:qualifiedValueShape'", "'sh:qualifiedMaxCount'", "'sh:qualifiedMinCount'", "'a'", "'rdfs:label'", "'sh:description'", "'@prefix'", "'.'", "';'", "'^^'", "','", "'('", "')'", "'['", "']'"
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
            else if ( ((LA2_0>=14 && LA2_0<=44)||LA2_0==52) ) {
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
            else if ( ((LA8_0>=14 && LA8_0<=44)||(LA8_0>=51 && LA8_0<=52)) ) {
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

                        if ( ((LA7_0>=14 && LA7_0<=44)||LA7_0==52) ) {
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
    // InternalTurtle.g:638:1: rule__PropertyType__Alternatives : ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:equals' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) | ( ( 'sh:qualifiedValueShape' ) ) | ( ( 'sh:qualifiedMaxCount' ) ) | ( ( 'sh:qualifiedMinCount' ) ) | ( ( 'a' ) ) | ( ( 'rdfs:label' ) ) | ( ( 'sh:description' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:642:1: ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:equals' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) | ( ( 'sh:qualifiedValueShape' ) ) | ( ( 'sh:qualifiedMaxCount' ) ) | ( ( 'sh:qualifiedMinCount' ) ) | ( ( 'a' ) ) | ( ( 'rdfs:label' ) ) | ( ( 'sh:description' ) ) )
            int alt11=31;
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
                    // InternalTurtle.g:685:2: ( ( 'sh:nodeKind' ) )
                    {
                    // InternalTurtle.g:685:2: ( ( 'sh:nodeKind' ) )
                    // InternalTurtle.g:686:3: ( 'sh:nodeKind' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 
                    // InternalTurtle.g:687:3: ( 'sh:nodeKind' )
                    // InternalTurtle.g:687:4: 'sh:nodeKind'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:691:2: ( ( 'sh:node' ) )
                    {
                    // InternalTurtle.g:691:2: ( ( 'sh:node' ) )
                    // InternalTurtle.g:692:3: ( 'sh:node' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 
                    // InternalTurtle.g:693:3: ( 'sh:node' )
                    // InternalTurtle.g:693:4: 'sh:node'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:697:2: ( ( 'sh:datatype' ) )
                    {
                    // InternalTurtle.g:697:2: ( ( 'sh:datatype' ) )
                    // InternalTurtle.g:698:3: ( 'sh:datatype' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 
                    // InternalTurtle.g:699:3: ( 'sh:datatype' )
                    // InternalTurtle.g:699:4: 'sh:datatype'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:703:2: ( ( 'sh:pattern' ) )
                    {
                    // InternalTurtle.g:703:2: ( ( 'sh:pattern' ) )
                    // InternalTurtle.g:704:3: ( 'sh:pattern' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 
                    // InternalTurtle.g:705:3: ( 'sh:pattern' )
                    // InternalTurtle.g:705:4: 'sh:pattern'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:709:2: ( ( 'sh:closed' ) )
                    {
                    // InternalTurtle.g:709:2: ( ( 'sh:closed' ) )
                    // InternalTurtle.g:710:3: ( 'sh:closed' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 
                    // InternalTurtle.g:711:3: ( 'sh:closed' )
                    // InternalTurtle.g:711:4: 'sh:closed'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:715:2: ( ( 'sh:ignoredProperties' ) )
                    {
                    // InternalTurtle.g:715:2: ( ( 'sh:ignoredProperties' ) )
                    // InternalTurtle.g:716:3: ( 'sh:ignoredProperties' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 
                    // InternalTurtle.g:717:3: ( 'sh:ignoredProperties' )
                    // InternalTurtle.g:717:4: 'sh:ignoredProperties'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:721:2: ( ( 'sh:path' ) )
                    {
                    // InternalTurtle.g:721:2: ( ( 'sh:path' ) )
                    // InternalTurtle.g:722:3: ( 'sh:path' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 
                    // InternalTurtle.g:723:3: ( 'sh:path' )
                    // InternalTurtle.g:723:4: 'sh:path'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:727:2: ( ( 'sh:inversePath' ) )
                    {
                    // InternalTurtle.g:727:2: ( ( 'sh:inversePath' ) )
                    // InternalTurtle.g:728:3: ( 'sh:inversePath' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 
                    // InternalTurtle.g:729:3: ( 'sh:inversePath' )
                    // InternalTurtle.g:729:4: 'sh:inversePath'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:733:2: ( ( 'sh:property' ) )
                    {
                    // InternalTurtle.g:733:2: ( ( 'sh:property' ) )
                    // InternalTurtle.g:734:3: ( 'sh:property' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 
                    // InternalTurtle.g:735:3: ( 'sh:property' )
                    // InternalTurtle.g:735:4: 'sh:property'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:739:2: ( ( 'sh:name' ) )
                    {
                    // InternalTurtle.g:739:2: ( ( 'sh:name' ) )
                    // InternalTurtle.g:740:3: ( 'sh:name' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 
                    // InternalTurtle.g:741:3: ( 'sh:name' )
                    // InternalTurtle.g:741:4: 'sh:name'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:745:2: ( ( 'sh:message' ) )
                    {
                    // InternalTurtle.g:745:2: ( ( 'sh:message' ) )
                    // InternalTurtle.g:746:3: ( 'sh:message' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17()); 
                    // InternalTurtle.g:747:3: ( 'sh:message' )
                    // InternalTurtle.g:747:4: 'sh:message'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:751:2: ( ( 'sh:equals' ) )
                    {
                    // InternalTurtle.g:751:2: ( ( 'sh:equals' ) )
                    // InternalTurtle.g:752:3: ( 'sh:equals' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18()); 
                    // InternalTurtle.g:753:3: ( 'sh:equals' )
                    // InternalTurtle.g:753:4: 'sh:equals'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTurtle.g:757:2: ( ( 'sh:minExclusive' ) )
                    {
                    // InternalTurtle.g:757:2: ( ( 'sh:minExclusive' ) )
                    // InternalTurtle.g:758:3: ( 'sh:minExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19()); 
                    // InternalTurtle.g:759:3: ( 'sh:minExclusive' )
                    // InternalTurtle.g:759:4: 'sh:minExclusive'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTurtle.g:763:2: ( ( 'sh:minInclusive' ) )
                    {
                    // InternalTurtle.g:763:2: ( ( 'sh:minInclusive' ) )
                    // InternalTurtle.g:764:3: ( 'sh:minInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20()); 
                    // InternalTurtle.g:765:3: ( 'sh:minInclusive' )
                    // InternalTurtle.g:765:4: 'sh:minInclusive'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTurtle.g:769:2: ( ( 'sh:maxExclusive' ) )
                    {
                    // InternalTurtle.g:769:2: ( ( 'sh:maxExclusive' ) )
                    // InternalTurtle.g:770:3: ( 'sh:maxExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21()); 
                    // InternalTurtle.g:771:3: ( 'sh:maxExclusive' )
                    // InternalTurtle.g:771:4: 'sh:maxExclusive'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalTurtle.g:775:2: ( ( 'sh:maxInclusive' ) )
                    {
                    // InternalTurtle.g:775:2: ( ( 'sh:maxInclusive' ) )
                    // InternalTurtle.g:776:3: ( 'sh:maxInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22()); 
                    // InternalTurtle.g:777:3: ( 'sh:maxInclusive' )
                    // InternalTurtle.g:777:4: 'sh:maxInclusive'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalTurtle.g:781:2: ( ( 'sh:maxLength' ) )
                    {
                    // InternalTurtle.g:781:2: ( ( 'sh:maxLength' ) )
                    // InternalTurtle.g:782:3: ( 'sh:maxLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23()); 
                    // InternalTurtle.g:783:3: ( 'sh:maxLength' )
                    // InternalTurtle.g:783:4: 'sh:maxLength'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalTurtle.g:787:2: ( ( 'sh:minLength' ) )
                    {
                    // InternalTurtle.g:787:2: ( ( 'sh:minLength' ) )
                    // InternalTurtle.g:788:3: ( 'sh:minLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24()); 
                    // InternalTurtle.g:789:3: ( 'sh:minLength' )
                    // InternalTurtle.g:789:4: 'sh:minLength'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalTurtle.g:793:2: ( ( 'sh:qualifiedValueShape' ) )
                    {
                    // InternalTurtle.g:793:2: ( ( 'sh:qualifiedValueShape' ) )
                    // InternalTurtle.g:794:3: ( 'sh:qualifiedValueShape' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25()); 
                    // InternalTurtle.g:795:3: ( 'sh:qualifiedValueShape' )
                    // InternalTurtle.g:795:4: 'sh:qualifiedValueShape'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalTurtle.g:799:2: ( ( 'sh:qualifiedMaxCount' ) )
                    {
                    // InternalTurtle.g:799:2: ( ( 'sh:qualifiedMaxCount' ) )
                    // InternalTurtle.g:800:3: ( 'sh:qualifiedMaxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26()); 
                    // InternalTurtle.g:801:3: ( 'sh:qualifiedMaxCount' )
                    // InternalTurtle.g:801:4: 'sh:qualifiedMaxCount'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalTurtle.g:805:2: ( ( 'sh:qualifiedMinCount' ) )
                    {
                    // InternalTurtle.g:805:2: ( ( 'sh:qualifiedMinCount' ) )
                    // InternalTurtle.g:806:3: ( 'sh:qualifiedMinCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27()); 
                    // InternalTurtle.g:807:3: ( 'sh:qualifiedMinCount' )
                    // InternalTurtle.g:807:4: 'sh:qualifiedMinCount'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalTurtle.g:811:2: ( ( 'a' ) )
                    {
                    // InternalTurtle.g:811:2: ( ( 'a' ) )
                    // InternalTurtle.g:812:3: ( 'a' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28()); 
                    // InternalTurtle.g:813:3: ( 'a' )
                    // InternalTurtle.g:813:4: 'a'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalTurtle.g:817:2: ( ( 'rdfs:label' ) )
                    {
                    // InternalTurtle.g:817:2: ( ( 'rdfs:label' ) )
                    // InternalTurtle.g:818:3: ( 'rdfs:label' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29()); 
                    // InternalTurtle.g:819:3: ( 'rdfs:label' )
                    // InternalTurtle.g:819:4: 'rdfs:label'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalTurtle.g:823:2: ( ( 'sh:description' ) )
                    {
                    // InternalTurtle.g:823:2: ( ( 'sh:description' ) )
                    // InternalTurtle.g:824:3: ( 'sh:description' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30()); 
                    // InternalTurtle.g:825:3: ( 'sh:description' )
                    // InternalTurtle.g:825:4: 'sh:description'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30()); 

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
    // InternalTurtle.g:833:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:837:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalTurtle.g:838:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalTurtle.g:845:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:849:1: ( ( () ) )
            // InternalTurtle.g:850:1: ( () )
            {
            // InternalTurtle.g:850:1: ( () )
            // InternalTurtle.g:851:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalTurtle.g:852:2: ()
            // InternalTurtle.g:852:3: 
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
    // InternalTurtle.g:860:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:864:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalTurtle.g:865:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalTurtle.g:872:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NamespacesAssignment_1 )* ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:876:1: ( ( ( rule__Graph__NamespacesAssignment_1 )* ) )
            // InternalTurtle.g:877:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            {
            // InternalTurtle.g:877:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            // InternalTurtle.g:878:2: ( rule__Graph__NamespacesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 
            // InternalTurtle.g:879:2: ( rule__Graph__NamespacesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtle.g:879:3: rule__Graph__NamespacesAssignment_1
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
    // InternalTurtle.g:887:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:891:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalTurtle.g:892:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalTurtle.g:899:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__DataGraphAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:903:1: ( ( ( rule__Graph__DataGraphAssignment_2 ) ) )
            // InternalTurtle.g:904:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            {
            // InternalTurtle.g:904:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            // InternalTurtle.g:905:2: ( rule__Graph__DataGraphAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 
            // InternalTurtle.g:906:2: ( rule__Graph__DataGraphAssignment_2 )
            // InternalTurtle.g:906:3: rule__Graph__DataGraphAssignment_2
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
    // InternalTurtle.g:914:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:918:1: ( rule__Graph__Group__3__Impl )
            // InternalTurtle.g:919:2: rule__Graph__Group__3__Impl
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
    // InternalTurtle.g:925:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__ShapesGraphAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:929:1: ( ( ( rule__Graph__ShapesGraphAssignment_3 ) ) )
            // InternalTurtle.g:930:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            {
            // InternalTurtle.g:930:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            // InternalTurtle.g:931:2: ( rule__Graph__ShapesGraphAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 
            // InternalTurtle.g:932:2: ( rule__Graph__ShapesGraphAssignment_3 )
            // InternalTurtle.g:932:3: rule__Graph__ShapesGraphAssignment_3
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
    // InternalTurtle.g:941:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:945:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTurtle.g:946:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
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
    // InternalTurtle.g:953:1: rule__Namespace__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:957:1: ( ( '@prefix' ) )
            // InternalTurtle.g:958:1: ( '@prefix' )
            {
            // InternalTurtle.g:958:1: ( '@prefix' )
            // InternalTurtle.g:959:2: '@prefix'
            {
             before(grammarAccess.getNamespaceAccess().getPrefixKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTurtle.g:968:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:972:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalTurtle.g:973:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
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
    // InternalTurtle.g:980:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PrefixAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:984:1: ( ( ( rule__Namespace__PrefixAssignment_1 ) ) )
            // InternalTurtle.g:985:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            {
            // InternalTurtle.g:985:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            // InternalTurtle.g:986:2: ( rule__Namespace__PrefixAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPrefixAssignment_1()); 
            // InternalTurtle.g:987:2: ( rule__Namespace__PrefixAssignment_1 )
            // InternalTurtle.g:987:3: rule__Namespace__PrefixAssignment_1
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
    // InternalTurtle.g:995:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:999:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalTurtle.g:1000:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
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
    // InternalTurtle.g:1007:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__NamespaceAssignment_2 ) ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1011:1: ( ( ( rule__Namespace__NamespaceAssignment_2 ) ) )
            // InternalTurtle.g:1012:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            {
            // InternalTurtle.g:1012:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            // InternalTurtle.g:1013:2: ( rule__Namespace__NamespaceAssignment_2 )
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceAssignment_2()); 
            // InternalTurtle.g:1014:2: ( rule__Namespace__NamespaceAssignment_2 )
            // InternalTurtle.g:1014:3: rule__Namespace__NamespaceAssignment_2
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
    // InternalTurtle.g:1022:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1026:1: ( rule__Namespace__Group__3__Impl )
            // InternalTurtle.g:1027:2: rule__Namespace__Group__3__Impl
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
    // InternalTurtle.g:1033:1: rule__Namespace__Group__3__Impl : ( '.' ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1037:1: ( ( '.' ) )
            // InternalTurtle.g:1038:1: ( '.' )
            {
            // InternalTurtle.g:1038:1: ( '.' )
            // InternalTurtle.g:1039:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTurtle.g:1049:1: rule__DataGraph__Group__0 : rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 ;
    public final void rule__DataGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1053:1: ( rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 )
            // InternalTurtle.g:1054:2: rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1
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
    // InternalTurtle.g:1061:1: rule__DataGraph__Group__0__Impl : ( () ) ;
    public final void rule__DataGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1065:1: ( ( () ) )
            // InternalTurtle.g:1066:1: ( () )
            {
            // InternalTurtle.g:1066:1: ( () )
            // InternalTurtle.g:1067:2: ()
            {
             before(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 
            // InternalTurtle.g:1068:2: ()
            // InternalTurtle.g:1068:3: 
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
    // InternalTurtle.g:1076:1: rule__DataGraph__Group__1 : rule__DataGraph__Group__1__Impl ;
    public final void rule__DataGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1080:1: ( rule__DataGraph__Group__1__Impl )
            // InternalTurtle.g:1081:2: rule__DataGraph__Group__1__Impl
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
    // InternalTurtle.g:1087:1: rule__DataGraph__Group__1__Impl : ( ( rule__DataGraph__TriplesAssignment_1 )* ) ;
    public final void rule__DataGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1091:1: ( ( ( rule__DataGraph__TriplesAssignment_1 )* ) )
            // InternalTurtle.g:1092:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            {
            // InternalTurtle.g:1092:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            // InternalTurtle.g:1093:2: ( rule__DataGraph__TriplesAssignment_1 )*
            {
             before(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 
            // InternalTurtle.g:1094:2: ( rule__DataGraph__TriplesAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case RULE_IRI:
                    {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)||LA13_2==46) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA13_3 = input.LA(2);

                    if ( ((LA13_3>=RULE_STRING && LA13_3<=RULE_ID)||LA13_3==46) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA13_4 = input.LA(2);

                    if ( ((LA13_4>=RULE_STRING && LA13_4<=RULE_ID)||LA13_4==46) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalTurtle.g:1094:3: rule__DataGraph__TriplesAssignment_1
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
    // InternalTurtle.g:1103:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1107:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalTurtle.g:1108:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
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
    // InternalTurtle.g:1115:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1119:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalTurtle.g:1120:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalTurtle.g:1120:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalTurtle.g:1121:2: ( rule__Triples__SubjectAssignment_0 )
            {
             before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            // InternalTurtle.g:1122:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalTurtle.g:1122:3: rule__Triples__SubjectAssignment_0
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
    // InternalTurtle.g:1130:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl rule__Triples__Group__2 ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1134:1: ( rule__Triples__Group__1__Impl rule__Triples__Group__2 )
            // InternalTurtle.g:1135:2: rule__Triples__Group__1__Impl rule__Triples__Group__2
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
    // InternalTurtle.g:1142:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateobjectAssignment_1 )* ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1146:1: ( ( ( rule__Triples__PredicateobjectAssignment_1 )* ) )
            // InternalTurtle.g:1147:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            {
            // InternalTurtle.g:1147:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            // InternalTurtle.g:1148:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 
            // InternalTurtle.g:1149:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTurtle.g:1149:3: rule__Triples__PredicateobjectAssignment_1
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
    // InternalTurtle.g:1157:1: rule__Triples__Group__2 : rule__Triples__Group__2__Impl ;
    public final void rule__Triples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1161:1: ( rule__Triples__Group__2__Impl )
            // InternalTurtle.g:1162:2: rule__Triples__Group__2__Impl
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
    // InternalTurtle.g:1168:1: rule__Triples__Group__2__Impl : ( '.' ) ;
    public final void rule__Triples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1172:1: ( ( '.' ) )
            // InternalTurtle.g:1173:1: ( '.' )
            {
            // InternalTurtle.g:1173:1: ( '.' )
            // InternalTurtle.g:1174:2: '.'
            {
             before(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTurtle.g:1184:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1188:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalTurtle.g:1189:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
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
    // InternalTurtle.g:1196:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__Group_0__0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1200:1: ( ( ( rule__PredicateObject__Group_0__0 ) ) )
            // InternalTurtle.g:1201:1: ( ( rule__PredicateObject__Group_0__0 ) )
            {
            // InternalTurtle.g:1201:1: ( ( rule__PredicateObject__Group_0__0 ) )
            // InternalTurtle.g:1202:2: ( rule__PredicateObject__Group_0__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup_0()); 
            // InternalTurtle.g:1203:2: ( rule__PredicateObject__Group_0__0 )
            // InternalTurtle.g:1203:3: rule__PredicateObject__Group_0__0
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
    // InternalTurtle.g:1211:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1215:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalTurtle.g:1216:2: rule__PredicateObject__Group__1__Impl
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
    // InternalTurtle.g:1222:1: rule__PredicateObject__Group__1__Impl : ( ';' ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1226:1: ( ( ';' ) )
            // InternalTurtle.g:1227:1: ( ';' )
            {
            // InternalTurtle.g:1227:1: ( ';' )
            // InternalTurtle.g:1228:2: ';'
            {
             before(grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTurtle.g:1238:1: rule__PredicateObject__Group_0__0 : rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 ;
    public final void rule__PredicateObject__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1242:1: ( rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 )
            // InternalTurtle.g:1243:2: rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1
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
    // InternalTurtle.g:1250:1: rule__PredicateObject__Group_0__0__Impl : ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) ;
    public final void rule__PredicateObject__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1254:1: ( ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) )
            // InternalTurtle.g:1255:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            {
            // InternalTurtle.g:1255:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            // InternalTurtle.g:1256:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 
            // InternalTurtle.g:1257:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            // InternalTurtle.g:1257:3: rule__PredicateObject__PredicateAssignment_0_0
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
    // InternalTurtle.g:1265:1: rule__PredicateObject__Group_0__1 : rule__PredicateObject__Group_0__1__Impl ;
    public final void rule__PredicateObject__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1269:1: ( rule__PredicateObject__Group_0__1__Impl )
            // InternalTurtle.g:1270:2: rule__PredicateObject__Group_0__1__Impl
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
    // InternalTurtle.g:1276:1: rule__PredicateObject__Group_0__1__Impl : ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) ;
    public final void rule__PredicateObject__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1280:1: ( ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) )
            // InternalTurtle.g:1281:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            {
            // InternalTurtle.g:1281:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            // InternalTurtle.g:1282:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 
            // InternalTurtle.g:1283:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            // InternalTurtle.g:1283:3: rule__PredicateObject__ObjectAssignment_0_1
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
    // InternalTurtle.g:1292:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1296:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalTurtle.g:1297:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
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
    // InternalTurtle.g:1304:1: rule__Subject__Group__0__Impl : ( () ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1308:1: ( ( () ) )
            // InternalTurtle.g:1309:1: ( () )
            {
            // InternalTurtle.g:1309:1: ( () )
            // InternalTurtle.g:1310:2: ()
            {
             before(grammarAccess.getSubjectAccess().getSubjectAction_0()); 
            // InternalTurtle.g:1311:2: ()
            // InternalTurtle.g:1311:3: 
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
    // InternalTurtle.g:1319:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1323:1: ( rule__Subject__Group__1__Impl )
            // InternalTurtle.g:1324:2: rule__Subject__Group__1__Impl
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
    // InternalTurtle.g:1330:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1334:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalTurtle.g:1335:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1335:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalTurtle.g:1336:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1337:2: ( rule__Subject__NameAssignment_1 )
            // InternalTurtle.g:1337:3: rule__Subject__NameAssignment_1
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
    // InternalTurtle.g:1346:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1350:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalTurtle.g:1351:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
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
    // InternalTurtle.g:1358:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1362:1: ( ( () ) )
            // InternalTurtle.g:1363:1: ( () )
            {
            // InternalTurtle.g:1363:1: ( () )
            // InternalTurtle.g:1364:2: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicateAction_0()); 
            // InternalTurtle.g:1365:2: ()
            // InternalTurtle.g:1365:3: 
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
    // InternalTurtle.g:1373:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1377:1: ( rule__Predicate__Group__1__Impl )
            // InternalTurtle.g:1378:2: rule__Predicate__Group__1__Impl
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
    // InternalTurtle.g:1384:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1388:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalTurtle.g:1389:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1389:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalTurtle.g:1390:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1391:2: ( rule__Predicate__NameAssignment_1 )
            // InternalTurtle.g:1391:3: rule__Predicate__NameAssignment_1
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
    // InternalTurtle.g:1400:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1404:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalTurtle.g:1405:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalTurtle.g:1412:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1416:1: ( ( () ) )
            // InternalTurtle.g:1417:1: ( () )
            {
            // InternalTurtle.g:1417:1: ( () )
            // InternalTurtle.g:1418:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalTurtle.g:1419:2: ()
            // InternalTurtle.g:1419:3: 
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
    // InternalTurtle.g:1427:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1431:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalTurtle.g:1432:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalTurtle.g:1439:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1443:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalTurtle.g:1444:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1444:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalTurtle.g:1445:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1446:2: ( rule__Object__NameAssignment_1 )
            // InternalTurtle.g:1446:3: rule__Object__NameAssignment_1
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
    // InternalTurtle.g:1454:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1458:1: ( rule__Object__Group__2__Impl )
            // InternalTurtle.g:1459:2: rule__Object__Group__2__Impl
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
    // InternalTurtle.g:1465:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1469:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalTurtle.g:1470:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalTurtle.g:1470:1: ( ( rule__Object__Group_2__0 )? )
            // InternalTurtle.g:1471:2: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // InternalTurtle.g:1472:2: ( rule__Object__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTurtle.g:1472:3: rule__Object__Group_2__0
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
    // InternalTurtle.g:1481:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1485:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalTurtle.g:1486:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
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
    // InternalTurtle.g:1493:1: rule__Object__Group_2__0__Impl : ( '^^' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1497:1: ( ( '^^' ) )
            // InternalTurtle.g:1498:1: ( '^^' )
            {
            // InternalTurtle.g:1498:1: ( '^^' )
            // InternalTurtle.g:1499:2: '^^'
            {
             before(grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTurtle.g:1508:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1512:1: ( rule__Object__Group_2__1__Impl )
            // InternalTurtle.g:1513:2: rule__Object__Group_2__1__Impl
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
    // InternalTurtle.g:1519:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__XsdTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1523:1: ( ( ( rule__Object__XsdTypeAssignment_2_1 ) ) )
            // InternalTurtle.g:1524:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            {
            // InternalTurtle.g:1524:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            // InternalTurtle.g:1525:2: ( rule__Object__XsdTypeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getXsdTypeAssignment_2_1()); 
            // InternalTurtle.g:1526:2: ( rule__Object__XsdTypeAssignment_2_1 )
            // InternalTurtle.g:1526:3: rule__Object__XsdTypeAssignment_2_1
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
    // InternalTurtle.g:1535:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1539:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalTurtle.g:1540:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalTurtle.g:1547:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1551:1: ( ( () ) )
            // InternalTurtle.g:1552:1: ( () )
            {
            // InternalTurtle.g:1552:1: ( () )
            // InternalTurtle.g:1553:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalTurtle.g:1554:2: ()
            // InternalTurtle.g:1554:3: 
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
    // InternalTurtle.g:1562:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1566:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalTurtle.g:1567:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalTurtle.g:1573:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1577:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalTurtle.g:1578:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalTurtle.g:1578:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalTurtle.g:1579:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalTurtle.g:1580:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_IRI && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTurtle.g:1580:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
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
    // InternalTurtle.g:1589:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1593:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalTurtle.g:1594:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalTurtle.g:1601:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1605:1: ( ( () ) )
            // InternalTurtle.g:1606:1: ( () )
            {
            // InternalTurtle.g:1606:1: ( () )
            // InternalTurtle.g:1607:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalTurtle.g:1608:2: ()
            // InternalTurtle.g:1608:3: 
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
    // InternalTurtle.g:1616:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1620:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalTurtle.g:1621:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
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
    // InternalTurtle.g:1628:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1632:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalTurtle.g:1633:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalTurtle.g:1633:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalTurtle.g:1634:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalTurtle.g:1635:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalTurtle.g:1635:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalTurtle.g:1643:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1647:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalTurtle.g:1648:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
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
    // InternalTurtle.g:1655:1: rule__ShapeConstraint__Group__2__Impl : ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1659:1: ( ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) ) )
            // InternalTurtle.g:1660:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) )
            {
            // InternalTurtle.g:1660:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* ) )
            // InternalTurtle.g:1661:2: ( ( rule__ShapeConstraint__Alternatives_2 ) ) ( ( rule__ShapeConstraint__Alternatives_2 )* )
            {
            // InternalTurtle.g:1661:2: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalTurtle.g:1662:3: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1663:3: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalTurtle.g:1663:4: rule__ShapeConstraint__Alternatives_2
            {
            pushFollow(FOLLOW_17);
            rule__ShapeConstraint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 

            }

            // InternalTurtle.g:1666:2: ( ( rule__ShapeConstraint__Alternatives_2 )* )
            // InternalTurtle.g:1667:3: ( rule__ShapeConstraint__Alternatives_2 )*
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1668:3: ( rule__ShapeConstraint__Alternatives_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=44)||LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTurtle.g:1668:4: rule__ShapeConstraint__Alternatives_2
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
    // InternalTurtle.g:1677:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1681:1: ( rule__ShapeConstraint__Group__3__Impl )
            // InternalTurtle.g:1682:2: rule__ShapeConstraint__Group__3__Impl
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
    // InternalTurtle.g:1688:1: rule__ShapeConstraint__Group__3__Impl : ( '.' ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1692:1: ( ( '.' ) )
            // InternalTurtle.g:1693:1: ( '.' )
            {
            // InternalTurtle.g:1693:1: ( '.' )
            // InternalTurtle.g:1694:2: '.'
            {
             before(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTurtle.g:1704:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1708:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalTurtle.g:1709:2: rule__Target__Group__0__Impl rule__Target__Group__1
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
    // InternalTurtle.g:1716:1: rule__Target__Group__0__Impl : ( () ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1720:1: ( ( () ) )
            // InternalTurtle.g:1721:1: ( () )
            {
            // InternalTurtle.g:1721:1: ( () )
            // InternalTurtle.g:1722:2: ()
            {
             before(grammarAccess.getTargetAccess().getTargetAction_0()); 
            // InternalTurtle.g:1723:2: ()
            // InternalTurtle.g:1723:3: 
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
    // InternalTurtle.g:1731:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1735:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalTurtle.g:1736:2: rule__Target__Group__1__Impl rule__Target__Group__2
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
    // InternalTurtle.g:1743:1: rule__Target__Group__1__Impl : ( ( rule__Target__TypeAssignment_1 ) ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1747:1: ( ( ( rule__Target__TypeAssignment_1 ) ) )
            // InternalTurtle.g:1748:1: ( ( rule__Target__TypeAssignment_1 ) )
            {
            // InternalTurtle.g:1748:1: ( ( rule__Target__TypeAssignment_1 ) )
            // InternalTurtle.g:1749:2: ( rule__Target__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetAccess().getTypeAssignment_1()); 
            // InternalTurtle.g:1750:2: ( rule__Target__TypeAssignment_1 )
            // InternalTurtle.g:1750:3: rule__Target__TypeAssignment_1
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
    // InternalTurtle.g:1758:1: rule__Target__Group__2 : rule__Target__Group__2__Impl rule__Target__Group__3 ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1762:1: ( rule__Target__Group__2__Impl rule__Target__Group__3 )
            // InternalTurtle.g:1763:2: rule__Target__Group__2__Impl rule__Target__Group__3
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
    // InternalTurtle.g:1770:1: rule__Target__Group__2__Impl : ( ( rule__Target__TermAssignment_2 ) ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1774:1: ( ( ( rule__Target__TermAssignment_2 ) ) )
            // InternalTurtle.g:1775:1: ( ( rule__Target__TermAssignment_2 ) )
            {
            // InternalTurtle.g:1775:1: ( ( rule__Target__TermAssignment_2 ) )
            // InternalTurtle.g:1776:2: ( rule__Target__TermAssignment_2 )
            {
             before(grammarAccess.getTargetAccess().getTermAssignment_2()); 
            // InternalTurtle.g:1777:2: ( rule__Target__TermAssignment_2 )
            // InternalTurtle.g:1777:3: rule__Target__TermAssignment_2
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
    // InternalTurtle.g:1785:1: rule__Target__Group__3 : rule__Target__Group__3__Impl ;
    public final void rule__Target__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1789:1: ( rule__Target__Group__3__Impl )
            // InternalTurtle.g:1790:2: rule__Target__Group__3__Impl
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
    // InternalTurtle.g:1796:1: rule__Target__Group__3__Impl : ( ';' ) ;
    public final void rule__Target__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1800:1: ( ( ';' ) )
            // InternalTurtle.g:1801:1: ( ';' )
            {
            // InternalTurtle.g:1801:1: ( ';' )
            // InternalTurtle.g:1802:2: ';'
            {
             before(grammarAccess.getTargetAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTurtle.g:1812:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1816:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalTurtle.g:1817:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalTurtle.g:1824:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1828:1: ( ( () ) )
            // InternalTurtle.g:1829:1: ( () )
            {
            // InternalTurtle.g:1829:1: ( () )
            // InternalTurtle.g:1830:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalTurtle.g:1831:2: ()
            // InternalTurtle.g:1831:3: 
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
    // InternalTurtle.g:1839:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1843:1: ( rule__ShapeName__Group__1__Impl )
            // InternalTurtle.g:1844:2: rule__ShapeName__Group__1__Impl
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
    // InternalTurtle.g:1850:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1854:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalTurtle.g:1855:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1855:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalTurtle.g:1856:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1857:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalTurtle.g:1857:3: rule__ShapeName__NameAssignment_1
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
    // InternalTurtle.g:1866:1: rule__ShapeExpression__Group__0 : rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 ;
    public final void rule__ShapeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1870:1: ( rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1 )
            // InternalTurtle.g:1871:2: rule__ShapeExpression__Group__0__Impl rule__ShapeExpression__Group__1
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
    // InternalTurtle.g:1878:1: rule__ShapeExpression__Group__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1882:1: ( ( () ) )
            // InternalTurtle.g:1883:1: ( () )
            {
            // InternalTurtle.g:1883:1: ( () )
            // InternalTurtle.g:1884:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0()); 
            // InternalTurtle.g:1885:2: ()
            // InternalTurtle.g:1885:3: 
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
    // InternalTurtle.g:1893:1: rule__ShapeExpression__Group__1 : rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2 ;
    public final void rule__ShapeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1897:1: ( rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2 )
            // InternalTurtle.g:1898:2: rule__ShapeExpression__Group__1__Impl rule__ShapeExpression__Group__2
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
    // InternalTurtle.g:1905:1: rule__ShapeExpression__Group__1__Impl : ( ( rule__ShapeExpression__Alternatives_1 ) ) ;
    public final void rule__ShapeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1909:1: ( ( ( rule__ShapeExpression__Alternatives_1 ) ) )
            // InternalTurtle.g:1910:1: ( ( rule__ShapeExpression__Alternatives_1 ) )
            {
            // InternalTurtle.g:1910:1: ( ( rule__ShapeExpression__Alternatives_1 ) )
            // InternalTurtle.g:1911:2: ( rule__ShapeExpression__Alternatives_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1()); 
            // InternalTurtle.g:1912:2: ( rule__ShapeExpression__Alternatives_1 )
            // InternalTurtle.g:1912:3: rule__ShapeExpression__Alternatives_1
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
    // InternalTurtle.g:1920:1: rule__ShapeExpression__Group__2 : rule__ShapeExpression__Group__2__Impl ;
    public final void rule__ShapeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1924:1: ( rule__ShapeExpression__Group__2__Impl )
            // InternalTurtle.g:1925:2: rule__ShapeExpression__Group__2__Impl
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
    // InternalTurtle.g:1931:1: rule__ShapeExpression__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ShapeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1935:1: ( ( ( ';' )? ) )
            // InternalTurtle.g:1936:1: ( ( ';' )? )
            {
            // InternalTurtle.g:1936:1: ( ( ';' )? )
            // InternalTurtle.g:1937:2: ( ';' )?
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_2()); 
            // InternalTurtle.g:1938:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTurtle.g:1938:3: ';'
                    {
                    match(input,47,FOLLOW_2); 

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
    // InternalTurtle.g:1947:1: rule__ShapeExpression__Group_1_0__0 : rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 ;
    public final void rule__ShapeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1951:1: ( rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 )
            // InternalTurtle.g:1952:2: rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1
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
    // InternalTurtle.g:1959:1: rule__ShapeExpression__Group_1_0__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1963:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) )
            // InternalTurtle.g:1964:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            {
            // InternalTurtle.g:1964:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            // InternalTurtle.g:1965:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0()); 
            // InternalTurtle.g:1966:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            // InternalTurtle.g:1966:3: rule__ShapeExpression__TypeAssignment_1_0_0
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
    // InternalTurtle.g:1974:1: rule__ShapeExpression__Group_1_0__1 : rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2 ;
    public final void rule__ShapeExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1978:1: ( rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2 )
            // InternalTurtle.g:1979:2: rule__ShapeExpression__Group_1_0__1__Impl rule__ShapeExpression__Group_1_0__2
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
    // InternalTurtle.g:1986:1: rule__ShapeExpression__Group_1_0__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1990:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) ) )
            // InternalTurtle.g:1991:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) )
            {
            // InternalTurtle.g:1991:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_1 ) )
            // InternalTurtle.g:1992:2: ( rule__ShapeExpression__ValuesAssignment_1_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_1()); 
            // InternalTurtle.g:1993:2: ( rule__ShapeExpression__ValuesAssignment_1_0_1 )
            // InternalTurtle.g:1993:3: rule__ShapeExpression__ValuesAssignment_1_0_1
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
    // InternalTurtle.g:2001:1: rule__ShapeExpression__Group_1_0__2 : rule__ShapeExpression__Group_1_0__2__Impl ;
    public final void rule__ShapeExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2005:1: ( rule__ShapeExpression__Group_1_0__2__Impl )
            // InternalTurtle.g:2006:2: rule__ShapeExpression__Group_1_0__2__Impl
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
    // InternalTurtle.g:2012:1: rule__ShapeExpression__Group_1_0__2__Impl : ( ( rule__ShapeExpression__Group_1_0_2__0 )* ) ;
    public final void rule__ShapeExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2016:1: ( ( ( rule__ShapeExpression__Group_1_0_2__0 )* ) )
            // InternalTurtle.g:2017:1: ( ( rule__ShapeExpression__Group_1_0_2__0 )* )
            {
            // InternalTurtle.g:2017:1: ( ( rule__ShapeExpression__Group_1_0_2__0 )* )
            // InternalTurtle.g:2018:2: ( rule__ShapeExpression__Group_1_0_2__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_0_2()); 
            // InternalTurtle.g:2019:2: ( rule__ShapeExpression__Group_1_0_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTurtle.g:2019:3: rule__ShapeExpression__Group_1_0_2__0
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
    // InternalTurtle.g:2028:1: rule__ShapeExpression__Group_1_0_2__0 : rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1 ;
    public final void rule__ShapeExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2032:1: ( rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1 )
            // InternalTurtle.g:2033:2: rule__ShapeExpression__Group_1_0_2__0__Impl rule__ShapeExpression__Group_1_0_2__1
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
    // InternalTurtle.g:2040:1: rule__ShapeExpression__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__ShapeExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2044:1: ( ( ',' ) )
            // InternalTurtle.g:2045:1: ( ',' )
            {
            // InternalTurtle.g:2045:1: ( ',' )
            // InternalTurtle.g:2046:2: ','
            {
             before(grammarAccess.getShapeExpressionAccess().getCommaKeyword_1_0_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTurtle.g:2055:1: rule__ShapeExpression__Group_1_0_2__1 : rule__ShapeExpression__Group_1_0_2__1__Impl ;
    public final void rule__ShapeExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2059:1: ( rule__ShapeExpression__Group_1_0_2__1__Impl )
            // InternalTurtle.g:2060:2: rule__ShapeExpression__Group_1_0_2__1__Impl
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
    // InternalTurtle.g:2066:1: rule__ShapeExpression__Group_1_0_2__1__Impl : ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) ) ;
    public final void rule__ShapeExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2070:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) ) )
            // InternalTurtle.g:2071:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) )
            {
            // InternalTurtle.g:2071:1: ( ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 ) )
            // InternalTurtle.g:2072:2: ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_2_1()); 
            // InternalTurtle.g:2073:2: ( rule__ShapeExpression__ValuesAssignment_1_0_2_1 )
            // InternalTurtle.g:2073:3: rule__ShapeExpression__ValuesAssignment_1_0_2_1
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
    // InternalTurtle.g:2082:1: rule__ShapeExpression__Group_1_1__0 : rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 ;
    public final void rule__ShapeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2086:1: ( rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 )
            // InternalTurtle.g:2087:2: rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1
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
    // InternalTurtle.g:2094:1: rule__ShapeExpression__Group_1_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2098:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) ) )
            // InternalTurtle.g:2099:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            {
            // InternalTurtle.g:2099:1: ( ( rule__ShapeExpression__TypeAssignment_1_1_0 ) )
            // InternalTurtle.g:2100:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0()); 
            // InternalTurtle.g:2101:2: ( rule__ShapeExpression__TypeAssignment_1_1_0 )
            // InternalTurtle.g:2101:3: rule__ShapeExpression__TypeAssignment_1_1_0
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
    // InternalTurtle.g:2109:1: rule__ShapeExpression__Group_1_1__1 : rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 ;
    public final void rule__ShapeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2113:1: ( rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 )
            // InternalTurtle.g:2114:2: rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2
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
    // InternalTurtle.g:2121:1: rule__ShapeExpression__Group_1_1__1__Impl : ( '(' ) ;
    public final void rule__ShapeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2125:1: ( ( '(' ) )
            // InternalTurtle.g:2126:1: ( '(' )
            {
            // InternalTurtle.g:2126:1: ( '(' )
            // InternalTurtle.g:2127:2: '('
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTurtle.g:2136:1: rule__ShapeExpression__Group_1_1__2 : rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3 ;
    public final void rule__ShapeExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2140:1: ( rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3 )
            // InternalTurtle.g:2141:2: rule__ShapeExpression__Group_1_1__2__Impl rule__ShapeExpression__Group_1_1__3
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
    // InternalTurtle.g:2148:1: rule__ShapeExpression__Group_1_1__2__Impl : ( ( rule__ShapeExpression__Alternatives_1_1_2 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2152:1: ( ( ( rule__ShapeExpression__Alternatives_1_1_2 ) ) )
            // InternalTurtle.g:2153:1: ( ( rule__ShapeExpression__Alternatives_1_1_2 ) )
            {
            // InternalTurtle.g:2153:1: ( ( rule__ShapeExpression__Alternatives_1_1_2 ) )
            // InternalTurtle.g:2154:2: ( rule__ShapeExpression__Alternatives_1_1_2 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_2()); 
            // InternalTurtle.g:2155:2: ( rule__ShapeExpression__Alternatives_1_1_2 )
            // InternalTurtle.g:2155:3: rule__ShapeExpression__Alternatives_1_1_2
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
    // InternalTurtle.g:2163:1: rule__ShapeExpression__Group_1_1__3 : rule__ShapeExpression__Group_1_1__3__Impl ;
    public final void rule__ShapeExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2167:1: ( rule__ShapeExpression__Group_1_1__3__Impl )
            // InternalTurtle.g:2168:2: rule__ShapeExpression__Group_1_1__3__Impl
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
    // InternalTurtle.g:2174:1: rule__ShapeExpression__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__ShapeExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2178:1: ( ( ')' ) )
            // InternalTurtle.g:2179:1: ( ')' )
            {
            // InternalTurtle.g:2179:1: ( ')' )
            // InternalTurtle.g:2180:2: ')'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTurtle.g:2190:1: rule__ShapeExpression__Group_1_2__0 : rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 ;
    public final void rule__ShapeExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2194:1: ( rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 )
            // InternalTurtle.g:2195:2: rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1
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
    // InternalTurtle.g:2202:1: rule__ShapeExpression__Group_1_2__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? ) ;
    public final void rule__ShapeExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2206:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? ) )
            // InternalTurtle.g:2207:1: ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? )
            {
            // InternalTurtle.g:2207:1: ( ( rule__ShapeExpression__TypeAssignment_1_2_0 )? )
            // InternalTurtle.g:2208:2: ( rule__ShapeExpression__TypeAssignment_1_2_0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_2_0()); 
            // InternalTurtle.g:2209:2: ( rule__ShapeExpression__TypeAssignment_1_2_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=14 && LA20_0<=44)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTurtle.g:2209:3: rule__ShapeExpression__TypeAssignment_1_2_0
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
    // InternalTurtle.g:2217:1: rule__ShapeExpression__Group_1_2__1 : rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2 ;
    public final void rule__ShapeExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2221:1: ( rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2 )
            // InternalTurtle.g:2222:2: rule__ShapeExpression__Group_1_2__1__Impl rule__ShapeExpression__Group_1_2__2
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
    // InternalTurtle.g:2229:1: rule__ShapeExpression__Group_1_2__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2233:1: ( ( '[' ) )
            // InternalTurtle.g:2234:1: ( '[' )
            {
            // InternalTurtle.g:2234:1: ( '[' )
            // InternalTurtle.g:2235:2: '['
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTurtle.g:2244:1: rule__ShapeExpression__Group_1_2__2 : rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3 ;
    public final void rule__ShapeExpression__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2248:1: ( rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3 )
            // InternalTurtle.g:2249:2: rule__ShapeExpression__Group_1_2__2__Impl rule__ShapeExpression__Group_1_2__3
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
    // InternalTurtle.g:2256:1: rule__ShapeExpression__Group_1_2__2__Impl : ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* ) ;
    public final void rule__ShapeExpression__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2260:1: ( ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* ) )
            // InternalTurtle.g:2261:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* )
            {
            // InternalTurtle.g:2261:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )* )
            // InternalTurtle.g:2262:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_2()); 
            // InternalTurtle.g:2263:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=44)||LA21_0==52) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTurtle.g:2263:3: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2
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
    // InternalTurtle.g:2271:1: rule__ShapeExpression__Group_1_2__3 : rule__ShapeExpression__Group_1_2__3__Impl ;
    public final void rule__ShapeExpression__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2275:1: ( rule__ShapeExpression__Group_1_2__3__Impl )
            // InternalTurtle.g:2276:2: rule__ShapeExpression__Group_1_2__3__Impl
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
    // InternalTurtle.g:2282:1: rule__ShapeExpression__Group_1_2__3__Impl : ( ']' ) ;
    public final void rule__ShapeExpression__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2286:1: ( ( ']' ) )
            // InternalTurtle.g:2287:1: ( ']' )
            {
            // InternalTurtle.g:2287:1: ( ']' )
            // InternalTurtle.g:2288:2: ']'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalTurtle.g:2298:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2302:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalTurtle.g:2303:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalTurtle.g:2310:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2314:1: ( ( () ) )
            // InternalTurtle.g:2315:1: ( () )
            {
            // InternalTurtle.g:2315:1: ( () )
            // InternalTurtle.g:2316:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalTurtle.g:2317:2: ()
            // InternalTurtle.g:2317:3: 
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
    // InternalTurtle.g:2325:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2329:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalTurtle.g:2330:2: rule__Value__Group__1__Impl rule__Value__Group__2
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
    // InternalTurtle.g:2337:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2341:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalTurtle.g:2342:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalTurtle.g:2342:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalTurtle.g:2343:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalTurtle.g:2344:2: ( rule__Value__NameAssignment_1 )
            // InternalTurtle.g:2344:3: rule__Value__NameAssignment_1
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
    // InternalTurtle.g:2352:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2356:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalTurtle.g:2357:2: rule__Value__Group__2__Impl rule__Value__Group__3
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
    // InternalTurtle.g:2364:1: rule__Value__Group__2__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2368:1: ( ( ( RULE_ID )? ) )
            // InternalTurtle.g:2369:1: ( ( RULE_ID )? )
            {
            // InternalTurtle.g:2369:1: ( ( RULE_ID )? )
            // InternalTurtle.g:2370:2: ( RULE_ID )?
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_2()); 
            // InternalTurtle.g:2371:2: ( RULE_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTurtle.g:2371:3: RULE_ID
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
    // InternalTurtle.g:2379:1: rule__Value__Group__3 : rule__Value__Group__3__Impl ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2383:1: ( rule__Value__Group__3__Impl )
            // InternalTurtle.g:2384:2: rule__Value__Group__3__Impl
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
    // InternalTurtle.g:2390:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2394:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalTurtle.g:2395:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalTurtle.g:2395:1: ( ( rule__Value__Group_3__0 )? )
            // InternalTurtle.g:2396:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalTurtle.g:2397:2: ( rule__Value__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTurtle.g:2397:3: rule__Value__Group_3__0
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
    // InternalTurtle.g:2406:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2410:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalTurtle.g:2411:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalTurtle.g:2418:1: rule__Value__Group_3__0__Impl : ( '^^' ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2422:1: ( ( '^^' ) )
            // InternalTurtle.g:2423:1: ( '^^' )
            {
            // InternalTurtle.g:2423:1: ( '^^' )
            // InternalTurtle.g:2424:2: '^^'
            {
             before(grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTurtle.g:2433:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2437:1: ( rule__Value__Group_3__1__Impl )
            // InternalTurtle.g:2438:2: rule__Value__Group_3__1__Impl
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
    // InternalTurtle.g:2444:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__XsdTypeAssignment_3_1 ) ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2448:1: ( ( ( rule__Value__XsdTypeAssignment_3_1 ) ) )
            // InternalTurtle.g:2449:1: ( ( rule__Value__XsdTypeAssignment_3_1 ) )
            {
            // InternalTurtle.g:2449:1: ( ( rule__Value__XsdTypeAssignment_3_1 ) )
            // InternalTurtle.g:2450:2: ( rule__Value__XsdTypeAssignment_3_1 )
            {
             before(grammarAccess.getValueAccess().getXsdTypeAssignment_3_1()); 
            // InternalTurtle.g:2451:2: ( rule__Value__XsdTypeAssignment_3_1 )
            // InternalTurtle.g:2451:3: rule__Value__XsdTypeAssignment_3_1
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
    // InternalTurtle.g:2460:1: rule__Graph__NamespacesAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Graph__NamespacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2464:1: ( ( ruleNamespace ) )
            // InternalTurtle.g:2465:2: ( ruleNamespace )
            {
            // InternalTurtle.g:2465:2: ( ruleNamespace )
            // InternalTurtle.g:2466:3: ruleNamespace
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
    // InternalTurtle.g:2475:1: rule__Graph__DataGraphAssignment_2 : ( ruleDataGraph ) ;
    public final void rule__Graph__DataGraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2479:1: ( ( ruleDataGraph ) )
            // InternalTurtle.g:2480:2: ( ruleDataGraph )
            {
            // InternalTurtle.g:2480:2: ( ruleDataGraph )
            // InternalTurtle.g:2481:3: ruleDataGraph
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
    // InternalTurtle.g:2490:1: rule__Graph__ShapesGraphAssignment_3 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2494:1: ( ( ruleShapesGraph ) )
            // InternalTurtle.g:2495:2: ( ruleShapesGraph )
            {
            // InternalTurtle.g:2495:2: ( ruleShapesGraph )
            // InternalTurtle.g:2496:3: ruleShapesGraph
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
    // InternalTurtle.g:2505:1: rule__Namespace__PrefixAssignment_1 : ( RULE_ID ) ;
    public final void rule__Namespace__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2509:1: ( ( RULE_ID ) )
            // InternalTurtle.g:2510:2: ( RULE_ID )
            {
            // InternalTurtle.g:2510:2: ( RULE_ID )
            // InternalTurtle.g:2511:3: RULE_ID
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
    // InternalTurtle.g:2520:1: rule__Namespace__NamespaceAssignment_2 : ( RULE_IRI ) ;
    public final void rule__Namespace__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2524:1: ( ( RULE_IRI ) )
            // InternalTurtle.g:2525:2: ( RULE_IRI )
            {
            // InternalTurtle.g:2525:2: ( RULE_IRI )
            // InternalTurtle.g:2526:3: RULE_IRI
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
    // InternalTurtle.g:2535:1: rule__DataGraph__TriplesAssignment_1 : ( ruleTriples ) ;
    public final void rule__DataGraph__TriplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2539:1: ( ( ruleTriples ) )
            // InternalTurtle.g:2540:2: ( ruleTriples )
            {
            // InternalTurtle.g:2540:2: ( ruleTriples )
            // InternalTurtle.g:2541:3: ruleTriples
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
    // InternalTurtle.g:2550:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2554:1: ( ( ruleSubject ) )
            // InternalTurtle.g:2555:2: ( ruleSubject )
            {
            // InternalTurtle.g:2555:2: ( ruleSubject )
            // InternalTurtle.g:2556:3: ruleSubject
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
    // InternalTurtle.g:2565:1: rule__Triples__PredicateobjectAssignment_1 : ( rulePredicateObject ) ;
    public final void rule__Triples__PredicateobjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2569:1: ( ( rulePredicateObject ) )
            // InternalTurtle.g:2570:2: ( rulePredicateObject )
            {
            // InternalTurtle.g:2570:2: ( rulePredicateObject )
            // InternalTurtle.g:2571:3: rulePredicateObject
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
    // InternalTurtle.g:2580:1: rule__PredicateObject__PredicateAssignment_0_0 : ( rulePredicate ) ;
    public final void rule__PredicateObject__PredicateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2584:1: ( ( rulePredicate ) )
            // InternalTurtle.g:2585:2: ( rulePredicate )
            {
            // InternalTurtle.g:2585:2: ( rulePredicate )
            // InternalTurtle.g:2586:3: rulePredicate
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
    // InternalTurtle.g:2595:1: rule__PredicateObject__ObjectAssignment_0_1 : ( ruleObject ) ;
    public final void rule__PredicateObject__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2599:1: ( ( ruleObject ) )
            // InternalTurtle.g:2600:2: ( ruleObject )
            {
            // InternalTurtle.g:2600:2: ( ruleObject )
            // InternalTurtle.g:2601:3: ruleObject
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
    // InternalTurtle.g:2610:1: rule__Subject__NameAssignment_1 : ( ( rule__Subject__NameAlternatives_1_0 ) ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2614:1: ( ( ( rule__Subject__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2615:2: ( ( rule__Subject__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2615:2: ( ( rule__Subject__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2616:3: ( rule__Subject__NameAlternatives_1_0 )
            {
             before(grammarAccess.getSubjectAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2617:3: ( rule__Subject__NameAlternatives_1_0 )
            // InternalTurtle.g:2617:4: rule__Subject__NameAlternatives_1_0
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
    // InternalTurtle.g:2625:1: rule__Predicate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2629:1: ( ( ruleEString ) )
            // InternalTurtle.g:2630:2: ( ruleEString )
            {
            // InternalTurtle.g:2630:2: ( ruleEString )
            // InternalTurtle.g:2631:3: ruleEString
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
    // InternalTurtle.g:2640:1: rule__Object__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2644:1: ( ( ruleEString ) )
            // InternalTurtle.g:2645:2: ( ruleEString )
            {
            // InternalTurtle.g:2645:2: ( ruleEString )
            // InternalTurtle.g:2646:3: ruleEString
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
    // InternalTurtle.g:2655:1: rule__Object__XsdTypeAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Object__XsdTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2659:1: ( ( ruleEString ) )
            // InternalTurtle.g:2660:2: ( ruleEString )
            {
            // InternalTurtle.g:2660:2: ( ruleEString )
            // InternalTurtle.g:2661:3: ruleEString
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
    // InternalTurtle.g:2670:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2674:1: ( ( ruleShapeConstraint ) )
            // InternalTurtle.g:2675:2: ( ruleShapeConstraint )
            {
            // InternalTurtle.g:2675:2: ( ruleShapeConstraint )
            // InternalTurtle.g:2676:3: ruleShapeConstraint
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
    // InternalTurtle.g:2685:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2689:1: ( ( ruleShapeName ) )
            // InternalTurtle.g:2690:2: ( ruleShapeName )
            {
            // InternalTurtle.g:2690:2: ( ruleShapeName )
            // InternalTurtle.g:2691:3: ruleShapeName
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
    // InternalTurtle.g:2700:1: rule__ShapeConstraint__TargetsAssignment_2_0 : ( ruleTarget ) ;
    public final void rule__ShapeConstraint__TargetsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2704:1: ( ( ruleTarget ) )
            // InternalTurtle.g:2705:2: ( ruleTarget )
            {
            // InternalTurtle.g:2705:2: ( ruleTarget )
            // InternalTurtle.g:2706:3: ruleTarget
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
    // InternalTurtle.g:2715:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2719:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2720:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2720:2: ( ruleShapeExpression )
            // InternalTurtle.g:2721:3: ruleShapeExpression
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
    // InternalTurtle.g:2730:1: rule__Target__TypeAssignment_1 : ( ( rule__Target__TypeAlternatives_1_0 ) ) ;
    public final void rule__Target__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2734:1: ( ( ( rule__Target__TypeAlternatives_1_0 ) ) )
            // InternalTurtle.g:2735:2: ( ( rule__Target__TypeAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2735:2: ( ( rule__Target__TypeAlternatives_1_0 ) )
            // InternalTurtle.g:2736:3: ( rule__Target__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getTargetAccess().getTypeAlternatives_1_0()); 
            // InternalTurtle.g:2737:3: ( rule__Target__TypeAlternatives_1_0 )
            // InternalTurtle.g:2737:4: rule__Target__TypeAlternatives_1_0
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
    // InternalTurtle.g:2745:1: rule__Target__TermAssignment_2 : ( ( rule__Target__TermAlternatives_2_0 ) ) ;
    public final void rule__Target__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2749:1: ( ( ( rule__Target__TermAlternatives_2_0 ) ) )
            // InternalTurtle.g:2750:2: ( ( rule__Target__TermAlternatives_2_0 ) )
            {
            // InternalTurtle.g:2750:2: ( ( rule__Target__TermAlternatives_2_0 ) )
            // InternalTurtle.g:2751:3: ( rule__Target__TermAlternatives_2_0 )
            {
             before(grammarAccess.getTargetAccess().getTermAlternatives_2_0()); 
            // InternalTurtle.g:2752:3: ( rule__Target__TermAlternatives_2_0 )
            // InternalTurtle.g:2752:4: rule__Target__TermAlternatives_2_0
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
    // InternalTurtle.g:2760:1: rule__ShapeName__NameAssignment_1 : ( ( rule__ShapeName__NameAlternatives_1_0 ) ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2764:1: ( ( ( rule__ShapeName__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2765:2: ( ( rule__ShapeName__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2765:2: ( ( rule__ShapeName__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2766:3: ( rule__ShapeName__NameAlternatives_1_0 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2767:3: ( rule__ShapeName__NameAlternatives_1_0 )
            // InternalTurtle.g:2767:4: rule__ShapeName__NameAlternatives_1_0
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
    // InternalTurtle.g:2775:1: rule__ShapeExpression__TypeAssignment_1_0_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2779:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2780:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2780:2: ( rulePropertyType )
            // InternalTurtle.g:2781:3: rulePropertyType
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
    // InternalTurtle.g:2790:1: rule__ShapeExpression__ValuesAssignment_1_0_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2794:1: ( ( ruleValue ) )
            // InternalTurtle.g:2795:2: ( ruleValue )
            {
            // InternalTurtle.g:2795:2: ( ruleValue )
            // InternalTurtle.g:2796:3: ruleValue
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
    // InternalTurtle.g:2805:1: rule__ShapeExpression__ValuesAssignment_1_0_2_1 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2809:1: ( ( ruleValue ) )
            // InternalTurtle.g:2810:2: ( ruleValue )
            {
            // InternalTurtle.g:2810:2: ( ruleValue )
            // InternalTurtle.g:2811:3: ruleValue
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
    // InternalTurtle.g:2820:1: rule__ShapeExpression__TypeAssignment_1_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2824:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2825:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2825:2: ( rulePropertyType )
            // InternalTurtle.g:2826:3: rulePropertyType
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
    // InternalTurtle.g:2835:1: rule__ShapeExpression__ValuesAssignment_1_1_2_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2839:1: ( ( ruleValue ) )
            // InternalTurtle.g:2840:2: ( ruleValue )
            {
            // InternalTurtle.g:2840:2: ( ruleValue )
            // InternalTurtle.g:2841:3: ruleValue
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
    // InternalTurtle.g:2850:1: rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2854:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2855:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2855:2: ( ruleShapeExpression )
            // InternalTurtle.g:2856:3: ruleShapeExpression
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
    // InternalTurtle.g:2865:1: rule__ShapeExpression__TypeAssignment_1_2_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2869:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2870:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2870:2: ( rulePropertyType )
            // InternalTurtle.g:2871:3: rulePropertyType
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
    // InternalTurtle.g:2880:1: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2 : ( ruleShapeExpression ) ;
    public final void rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2884:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2885:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2885:2: ( ruleShapeExpression )
            // InternalTurtle.g:2886:3: ruleShapeExpression
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
    // InternalTurtle.g:2895:1: rule__Value__NameAssignment_1 : ( ( rule__Value__NameAlternatives_1_0 ) ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2899:1: ( ( ( rule__Value__NameAlternatives_1_0 ) ) )
            // InternalTurtle.g:2900:2: ( ( rule__Value__NameAlternatives_1_0 ) )
            {
            // InternalTurtle.g:2900:2: ( ( rule__Value__NameAlternatives_1_0 ) )
            // InternalTurtle.g:2901:3: ( rule__Value__NameAlternatives_1_0 )
            {
             before(grammarAccess.getValueAccess().getNameAlternatives_1_0()); 
            // InternalTurtle.g:2902:3: ( rule__Value__NameAlternatives_1_0 )
            // InternalTurtle.g:2902:4: rule__Value__NameAlternatives_1_0
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
    // InternalTurtle.g:2910:1: rule__Value__XsdTypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Value__XsdTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2914:1: ( ( ruleEString ) )
            // InternalTurtle.g:2915:2: ( ruleEString )
            {
            // InternalTurtle.g:2915:2: ( ruleEString )
            // InternalTurtle.g:2916:3: ruleEString
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
    static final String dfa_1s = "\43\uffff";
    static final String dfa_2s = "\1\16\37\4\3\uffff";
    static final String dfa_3s = "\40\64\3\uffff";
    static final String dfa_4s = "\40\uffff\1\3\1\2\1\1";
    static final String dfa_5s = "\43\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\7\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
            "\3\42\53\uffff\1\41\1\uffff\1\40",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00101FFFFFFFC002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00101FFFFFFFF000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00101FFFFFFFF002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00101FFFFFFFC000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00101FFFFFFFC070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00301FFFFFFFC000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000040L});

}