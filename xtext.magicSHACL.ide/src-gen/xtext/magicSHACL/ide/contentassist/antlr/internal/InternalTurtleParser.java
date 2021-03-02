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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_IRI", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:path'", "'sh:inversePath'", "'sh:property'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'", "'sh:message'", "'sh:minExclusive'", "'sh:minInclusive'", "'sh:maxExclusive'", "'sh:maxInclusive'", "'sh:maxLength'", "'sh:minLength'", "'@prefix'", "'.'", "';'", "'^^'", "'sh:NodeShape'", "'('", "')'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_IRI=6;
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleShapeName"
    // InternalTurtle.g:303:1: entryRuleShapeName : ruleShapeName EOF ;
    public final void entryRuleShapeName() throws RecognitionException {
        try {
            // InternalTurtle.g:304:1: ( ruleShapeName EOF )
            // InternalTurtle.g:305:1: ruleShapeName EOF
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
    // InternalTurtle.g:312:1: ruleShapeName : ( ( rule__ShapeName__Group__0 ) ) ;
    public final void ruleShapeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:316:2: ( ( ( rule__ShapeName__Group__0 ) ) )
            // InternalTurtle.g:317:2: ( ( rule__ShapeName__Group__0 ) )
            {
            // InternalTurtle.g:317:2: ( ( rule__ShapeName__Group__0 ) )
            // InternalTurtle.g:318:3: ( rule__ShapeName__Group__0 )
            {
             before(grammarAccess.getShapeNameAccess().getGroup()); 
            // InternalTurtle.g:319:3: ( rule__ShapeName__Group__0 )
            // InternalTurtle.g:319:4: rule__ShapeName__Group__0
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
    // InternalTurtle.g:328:1: entryRuleShapeExpression : ruleShapeExpression EOF ;
    public final void entryRuleShapeExpression() throws RecognitionException {
        try {
            // InternalTurtle.g:329:1: ( ruleShapeExpression EOF )
            // InternalTurtle.g:330:1: ruleShapeExpression EOF
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
    // InternalTurtle.g:337:1: ruleShapeExpression : ( ( rule__ShapeExpression__Alternatives ) ) ;
    public final void ruleShapeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:341:2: ( ( ( rule__ShapeExpression__Alternatives ) ) )
            // InternalTurtle.g:342:2: ( ( rule__ShapeExpression__Alternatives ) )
            {
            // InternalTurtle.g:342:2: ( ( rule__ShapeExpression__Alternatives ) )
            // InternalTurtle.g:343:3: ( rule__ShapeExpression__Alternatives )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives()); 
            // InternalTurtle.g:344:3: ( rule__ShapeExpression__Alternatives )
            // InternalTurtle.g:344:4: rule__ShapeExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives()); 

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
    // InternalTurtle.g:353:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalTurtle.g:354:1: ( ruleValue EOF )
            // InternalTurtle.g:355:1: ruleValue EOF
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
    // InternalTurtle.g:362:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:366:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalTurtle.g:367:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalTurtle.g:367:2: ( ( rule__Value__Group__0 ) )
            // InternalTurtle.g:368:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalTurtle.g:369:3: ( rule__Value__Group__0 )
            // InternalTurtle.g:369:4: rule__Value__Group__0
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
    // InternalTurtle.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTurtle.g:379:1: ( ruleEString EOF )
            // InternalTurtle.g:380:1: ruleEString EOF
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
    // InternalTurtle.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTurtle.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTurtle.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalTurtle.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTurtle.g:394:3: ( rule__EString__Alternatives )
            // InternalTurtle.g:394:4: rule__EString__Alternatives
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
    // InternalTurtle.g:403:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:407:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalTurtle.g:408:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalTurtle.g:408:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalTurtle.g:409:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalTurtle.g:410:3: ( rule__PropertyType__Alternatives )
            // InternalTurtle.g:410:4: rule__PropertyType__Alternatives
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


    // $ANTLR start "rule__ShapeExpression__Alternatives"
    // InternalTurtle.g:418:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:422:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=37)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTurtle.g:423:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalTurtle.g:423:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalTurtle.g:424:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalTurtle.g:425:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalTurtle.g:425:4: rule__ShapeExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:429:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    {
                    // InternalTurtle.g:429:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    // InternalTurtle.g:430:3: ( rule__ShapeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1()); 
                    // InternalTurtle.g:431:3: ( rule__ShapeExpression__Group_1__0 )
                    // InternalTurtle.g:431:4: rule__ShapeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives"


    // $ANTLR start "rule__ShapeExpression__Alternatives_1_2"
    // InternalTurtle.g:439:1: rule__ShapeExpression__Alternatives_1_2 : ( ( ( rule__ShapeExpression__ValuesAssignment_1_2_0 ) ) | ( ( rule__ShapeExpression__Group_1_2_1__0 ) ) );
    public final void rule__ShapeExpression__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:443:1: ( ( ( rule__ShapeExpression__ValuesAssignment_1_2_0 ) ) | ( ( rule__ShapeExpression__Group_1_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==45) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTurtle.g:444:2: ( ( rule__ShapeExpression__ValuesAssignment_1_2_0 ) )
                    {
                    // InternalTurtle.g:444:2: ( ( rule__ShapeExpression__ValuesAssignment_1_2_0 ) )
                    // InternalTurtle.g:445:3: ( rule__ShapeExpression__ValuesAssignment_1_2_0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_2_0()); 
                    // InternalTurtle.g:446:3: ( rule__ShapeExpression__ValuesAssignment_1_2_0 )
                    // InternalTurtle.g:446:4: rule__ShapeExpression__ValuesAssignment_1_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__ValuesAssignment_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:450:2: ( ( rule__ShapeExpression__Group_1_2_1__0 ) )
                    {
                    // InternalTurtle.g:450:2: ( ( rule__ShapeExpression__Group_1_2_1__0 ) )
                    // InternalTurtle.g:451:3: ( rule__ShapeExpression__Group_1_2_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1_2_1()); 
                    // InternalTurtle.g:452:3: ( rule__ShapeExpression__Group_1_2_1__0 )
                    // InternalTurtle.g:452:4: rule__ShapeExpression__Group_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeExpressionAccess().getGroup_1_2_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives_1_2"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTurtle.g:460:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:464:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:465:2: ( RULE_STRING )
                    {
                    // InternalTurtle.g:465:2: ( RULE_STRING )
                    // InternalTurtle.g:466:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:471:2: ( RULE_ID )
                    {
                    // InternalTurtle.g:471:2: ( RULE_ID )
                    // InternalTurtle.g:472:3: RULE_ID
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
    // InternalTurtle.g:481:1: rule__PropertyType__Alternatives : ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:485:1: ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) | ( ( 'sh:message' ) ) | ( ( 'sh:minExclusive' ) ) | ( ( 'sh:minInclusive' ) ) | ( ( 'sh:maxExclusive' ) ) | ( ( 'sh:maxInclusive' ) ) | ( ( 'sh:maxLength' ) ) | ( ( 'sh:minLength' ) ) )
            int alt4=26;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            case 20:
                {
                alt4=9;
                }
                break;
            case 21:
                {
                alt4=10;
                }
                break;
            case 22:
                {
                alt4=11;
                }
                break;
            case 23:
                {
                alt4=12;
                }
                break;
            case 24:
                {
                alt4=13;
                }
                break;
            case 25:
                {
                alt4=14;
                }
                break;
            case 26:
                {
                alt4=15;
                }
                break;
            case 27:
                {
                alt4=16;
                }
                break;
            case 28:
                {
                alt4=17;
                }
                break;
            case 29:
                {
                alt4=18;
                }
                break;
            case 30:
                {
                alt4=19;
                }
                break;
            case 31:
                {
                alt4=20;
                }
                break;
            case 32:
                {
                alt4=21;
                }
                break;
            case 33:
                {
                alt4=22;
                }
                break;
            case 34:
                {
                alt4=23;
                }
                break;
            case 35:
                {
                alt4=24;
                }
                break;
            case 36:
                {
                alt4=25;
                }
                break;
            case 37:
                {
                alt4=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:486:2: ( ( 'sh:minCount' ) )
                    {
                    // InternalTurtle.g:486:2: ( ( 'sh:minCount' ) )
                    // InternalTurtle.g:487:3: ( 'sh:minCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalTurtle.g:488:3: ( 'sh:minCount' )
                    // InternalTurtle.g:488:4: 'sh:minCount'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:492:2: ( ( 'sh:maxCount' ) )
                    {
                    // InternalTurtle.g:492:2: ( ( 'sh:maxCount' ) )
                    // InternalTurtle.g:493:3: ( 'sh:maxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalTurtle.g:494:3: ( 'sh:maxCount' )
                    // InternalTurtle.g:494:4: 'sh:maxCount'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:498:2: ( ( 'sh:and' ) )
                    {
                    // InternalTurtle.g:498:2: ( ( 'sh:and' ) )
                    // InternalTurtle.g:499:3: ( 'sh:and' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalTurtle.g:500:3: ( 'sh:and' )
                    // InternalTurtle.g:500:4: 'sh:and'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:504:2: ( ( 'sh:or' ) )
                    {
                    // InternalTurtle.g:504:2: ( ( 'sh:or' ) )
                    // InternalTurtle.g:505:3: ( 'sh:or' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalTurtle.g:506:3: ( 'sh:or' )
                    // InternalTurtle.g:506:4: 'sh:or'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:510:2: ( ( 'sh:not' ) )
                    {
                    // InternalTurtle.g:510:2: ( ( 'sh:not' ) )
                    // InternalTurtle.g:511:3: ( 'sh:not' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalTurtle.g:512:3: ( 'sh:not' )
                    // InternalTurtle.g:512:4: 'sh:not'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:516:2: ( ( 'sh:class' ) )
                    {
                    // InternalTurtle.g:516:2: ( ( 'sh:class' ) )
                    // InternalTurtle.g:517:3: ( 'sh:class' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 
                    // InternalTurtle.g:518:3: ( 'sh:class' )
                    // InternalTurtle.g:518:4: 'sh:class'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:522:2: ( ( 'sh:hasValue' ) )
                    {
                    // InternalTurtle.g:522:2: ( ( 'sh:hasValue' ) )
                    // InternalTurtle.g:523:3: ( 'sh:hasValue' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 
                    // InternalTurtle.g:524:3: ( 'sh:hasValue' )
                    // InternalTurtle.g:524:4: 'sh:hasValue'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:528:2: ( ( 'sh:nodeKind' ) )
                    {
                    // InternalTurtle.g:528:2: ( ( 'sh:nodeKind' ) )
                    // InternalTurtle.g:529:3: ( 'sh:nodeKind' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 
                    // InternalTurtle.g:530:3: ( 'sh:nodeKind' )
                    // InternalTurtle.g:530:4: 'sh:nodeKind'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:534:2: ( ( 'sh:node' ) )
                    {
                    // InternalTurtle.g:534:2: ( ( 'sh:node' ) )
                    // InternalTurtle.g:535:3: ( 'sh:node' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 
                    // InternalTurtle.g:536:3: ( 'sh:node' )
                    // InternalTurtle.g:536:4: 'sh:node'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:540:2: ( ( 'sh:datatype' ) )
                    {
                    // InternalTurtle.g:540:2: ( ( 'sh:datatype' ) )
                    // InternalTurtle.g:541:3: ( 'sh:datatype' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 
                    // InternalTurtle.g:542:3: ( 'sh:datatype' )
                    // InternalTurtle.g:542:4: 'sh:datatype'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:546:2: ( ( 'sh:pattern' ) )
                    {
                    // InternalTurtle.g:546:2: ( ( 'sh:pattern' ) )
                    // InternalTurtle.g:547:3: ( 'sh:pattern' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 
                    // InternalTurtle.g:548:3: ( 'sh:pattern' )
                    // InternalTurtle.g:548:4: 'sh:pattern'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:552:2: ( ( 'sh:closed' ) )
                    {
                    // InternalTurtle.g:552:2: ( ( 'sh:closed' ) )
                    // InternalTurtle.g:553:3: ( 'sh:closed' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 
                    // InternalTurtle.g:554:3: ( 'sh:closed' )
                    // InternalTurtle.g:554:4: 'sh:closed'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:558:2: ( ( 'sh:ignoredProperties' ) )
                    {
                    // InternalTurtle.g:558:2: ( ( 'sh:ignoredProperties' ) )
                    // InternalTurtle.g:559:3: ( 'sh:ignoredProperties' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 
                    // InternalTurtle.g:560:3: ( 'sh:ignoredProperties' )
                    // InternalTurtle.g:560:4: 'sh:ignoredProperties'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:564:2: ( ( 'sh:path' ) )
                    {
                    // InternalTurtle.g:564:2: ( ( 'sh:path' ) )
                    // InternalTurtle.g:565:3: ( 'sh:path' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 
                    // InternalTurtle.g:566:3: ( 'sh:path' )
                    // InternalTurtle.g:566:4: 'sh:path'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:570:2: ( ( 'sh:inversePath' ) )
                    {
                    // InternalTurtle.g:570:2: ( ( 'sh:inversePath' ) )
                    // InternalTurtle.g:571:3: ( 'sh:inversePath' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 
                    // InternalTurtle.g:572:3: ( 'sh:inversePath' )
                    // InternalTurtle.g:572:4: 'sh:inversePath'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:576:2: ( ( 'sh:property' ) )
                    {
                    // InternalTurtle.g:576:2: ( ( 'sh:property' ) )
                    // InternalTurtle.g:577:3: ( 'sh:property' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 
                    // InternalTurtle.g:578:3: ( 'sh:property' )
                    // InternalTurtle.g:578:4: 'sh:property'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:582:2: ( ( 'sh:name' ) )
                    {
                    // InternalTurtle.g:582:2: ( ( 'sh:name' ) )
                    // InternalTurtle.g:583:3: ( 'sh:name' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 
                    // InternalTurtle.g:584:3: ( 'sh:name' )
                    // InternalTurtle.g:584:4: 'sh:name'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:588:2: ( ( 'sh:targetClass' ) )
                    {
                    // InternalTurtle.g:588:2: ( ( 'sh:targetClass' ) )
                    // InternalTurtle.g:589:3: ( 'sh:targetClass' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 
                    // InternalTurtle.g:590:3: ( 'sh:targetClass' )
                    // InternalTurtle.g:590:4: 'sh:targetClass'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:594:2: ( ( 'sh:targetNode' ) )
                    {
                    // InternalTurtle.g:594:2: ( ( 'sh:targetNode' ) )
                    // InternalTurtle.g:595:3: ( 'sh:targetNode' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18()); 
                    // InternalTurtle.g:596:3: ( 'sh:targetNode' )
                    // InternalTurtle.g:596:4: 'sh:targetNode'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTurtle.g:600:2: ( ( 'sh:message' ) )
                    {
                    // InternalTurtle.g:600:2: ( ( 'sh:message' ) )
                    // InternalTurtle.g:601:3: ( 'sh:message' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_19()); 
                    // InternalTurtle.g:602:3: ( 'sh:message' )
                    // InternalTurtle.g:602:4: 'sh:message'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTurtle.g:606:2: ( ( 'sh:minExclusive' ) )
                    {
                    // InternalTurtle.g:606:2: ( ( 'sh:minExclusive' ) )
                    // InternalTurtle.g:607:3: ( 'sh:minExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20()); 
                    // InternalTurtle.g:608:3: ( 'sh:minExclusive' )
                    // InternalTurtle.g:608:4: 'sh:minExclusive'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTurtle.g:612:2: ( ( 'sh:minInclusive' ) )
                    {
                    // InternalTurtle.g:612:2: ( ( 'sh:minInclusive' ) )
                    // InternalTurtle.g:613:3: ( 'sh:minInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21()); 
                    // InternalTurtle.g:614:3: ( 'sh:minInclusive' )
                    // InternalTurtle.g:614:4: 'sh:minInclusive'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalTurtle.g:618:2: ( ( 'sh:maxExclusive' ) )
                    {
                    // InternalTurtle.g:618:2: ( ( 'sh:maxExclusive' ) )
                    // InternalTurtle.g:619:3: ( 'sh:maxExclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22()); 
                    // InternalTurtle.g:620:3: ( 'sh:maxExclusive' )
                    // InternalTurtle.g:620:4: 'sh:maxExclusive'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalTurtle.g:624:2: ( ( 'sh:maxInclusive' ) )
                    {
                    // InternalTurtle.g:624:2: ( ( 'sh:maxInclusive' ) )
                    // InternalTurtle.g:625:3: ( 'sh:maxInclusive' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23()); 
                    // InternalTurtle.g:626:3: ( 'sh:maxInclusive' )
                    // InternalTurtle.g:626:4: 'sh:maxInclusive'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalTurtle.g:630:2: ( ( 'sh:maxLength' ) )
                    {
                    // InternalTurtle.g:630:2: ( ( 'sh:maxLength' ) )
                    // InternalTurtle.g:631:3: ( 'sh:maxLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24()); 
                    // InternalTurtle.g:632:3: ( 'sh:maxLength' )
                    // InternalTurtle.g:632:4: 'sh:maxLength'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalTurtle.g:636:2: ( ( 'sh:minLength' ) )
                    {
                    // InternalTurtle.g:636:2: ( ( 'sh:minLength' ) )
                    // InternalTurtle.g:637:3: ( 'sh:minLength' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25()); 
                    // InternalTurtle.g:638:3: ( 'sh:minLength' )
                    // InternalTurtle.g:638:4: 'sh:minLength'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_25()); 

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
    // InternalTurtle.g:646:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:650:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalTurtle.g:651:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalTurtle.g:658:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:662:1: ( ( () ) )
            // InternalTurtle.g:663:1: ( () )
            {
            // InternalTurtle.g:663:1: ( () )
            // InternalTurtle.g:664:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalTurtle.g:665:2: ()
            // InternalTurtle.g:665:3: 
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
    // InternalTurtle.g:673:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:677:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalTurtle.g:678:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalTurtle.g:685:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NamespacesAssignment_1 )* ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:689:1: ( ( ( rule__Graph__NamespacesAssignment_1 )* ) )
            // InternalTurtle.g:690:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            {
            // InternalTurtle.g:690:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            // InternalTurtle.g:691:2: ( rule__Graph__NamespacesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 
            // InternalTurtle.g:692:2: ( rule__Graph__NamespacesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTurtle.g:692:3: rule__Graph__NamespacesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Graph__NamespacesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTurtle.g:700:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:704:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalTurtle.g:705:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:712:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__DataGraphAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:716:1: ( ( ( rule__Graph__DataGraphAssignment_2 ) ) )
            // InternalTurtle.g:717:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            {
            // InternalTurtle.g:717:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            // InternalTurtle.g:718:2: ( rule__Graph__DataGraphAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 
            // InternalTurtle.g:719:2: ( rule__Graph__DataGraphAssignment_2 )
            // InternalTurtle.g:719:3: rule__Graph__DataGraphAssignment_2
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
    // InternalTurtle.g:727:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:731:1: ( rule__Graph__Group__3__Impl )
            // InternalTurtle.g:732:2: rule__Graph__Group__3__Impl
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
    // InternalTurtle.g:738:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__ShapesGraphAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:742:1: ( ( ( rule__Graph__ShapesGraphAssignment_3 ) ) )
            // InternalTurtle.g:743:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            {
            // InternalTurtle.g:743:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            // InternalTurtle.g:744:2: ( rule__Graph__ShapesGraphAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 
            // InternalTurtle.g:745:2: ( rule__Graph__ShapesGraphAssignment_3 )
            // InternalTurtle.g:745:3: rule__Graph__ShapesGraphAssignment_3
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
    // InternalTurtle.g:754:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:758:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTurtle.g:759:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTurtle.g:766:1: rule__Namespace__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:770:1: ( ( '@prefix' ) )
            // InternalTurtle.g:771:1: ( '@prefix' )
            {
            // InternalTurtle.g:771:1: ( '@prefix' )
            // InternalTurtle.g:772:2: '@prefix'
            {
             before(grammarAccess.getNamespaceAccess().getPrefixKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTurtle.g:781:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:785:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalTurtle.g:786:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTurtle.g:793:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PrefixAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:797:1: ( ( ( rule__Namespace__PrefixAssignment_1 ) ) )
            // InternalTurtle.g:798:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            {
            // InternalTurtle.g:798:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            // InternalTurtle.g:799:2: ( rule__Namespace__PrefixAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPrefixAssignment_1()); 
            // InternalTurtle.g:800:2: ( rule__Namespace__PrefixAssignment_1 )
            // InternalTurtle.g:800:3: rule__Namespace__PrefixAssignment_1
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
    // InternalTurtle.g:808:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:812:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalTurtle.g:813:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTurtle.g:820:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__NamespaceAssignment_2 ) ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:824:1: ( ( ( rule__Namespace__NamespaceAssignment_2 ) ) )
            // InternalTurtle.g:825:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            {
            // InternalTurtle.g:825:1: ( ( rule__Namespace__NamespaceAssignment_2 ) )
            // InternalTurtle.g:826:2: ( rule__Namespace__NamespaceAssignment_2 )
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceAssignment_2()); 
            // InternalTurtle.g:827:2: ( rule__Namespace__NamespaceAssignment_2 )
            // InternalTurtle.g:827:3: rule__Namespace__NamespaceAssignment_2
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
    // InternalTurtle.g:835:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:839:1: ( rule__Namespace__Group__3__Impl )
            // InternalTurtle.g:840:2: rule__Namespace__Group__3__Impl
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
    // InternalTurtle.g:846:1: rule__Namespace__Group__3__Impl : ( '.' ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:850:1: ( ( '.' ) )
            // InternalTurtle.g:851:1: ( '.' )
            {
            // InternalTurtle.g:851:1: ( '.' )
            // InternalTurtle.g:852:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTurtle.g:862:1: rule__DataGraph__Group__0 : rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 ;
    public final void rule__DataGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:866:1: ( rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 )
            // InternalTurtle.g:867:2: rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTurtle.g:874:1: rule__DataGraph__Group__0__Impl : ( () ) ;
    public final void rule__DataGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:878:1: ( ( () ) )
            // InternalTurtle.g:879:1: ( () )
            {
            // InternalTurtle.g:879:1: ( () )
            // InternalTurtle.g:880:2: ()
            {
             before(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 
            // InternalTurtle.g:881:2: ()
            // InternalTurtle.g:881:3: 
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
    // InternalTurtle.g:889:1: rule__DataGraph__Group__1 : rule__DataGraph__Group__1__Impl ;
    public final void rule__DataGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:893:1: ( rule__DataGraph__Group__1__Impl )
            // InternalTurtle.g:894:2: rule__DataGraph__Group__1__Impl
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
    // InternalTurtle.g:900:1: rule__DataGraph__Group__1__Impl : ( ( rule__DataGraph__TriplesAssignment_1 )* ) ;
    public final void rule__DataGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:904:1: ( ( ( rule__DataGraph__TriplesAssignment_1 )* ) )
            // InternalTurtle.g:905:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            {
            // InternalTurtle.g:905:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            // InternalTurtle.g:906:2: ( rule__DataGraph__TriplesAssignment_1 )*
            {
             before(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 
            // InternalTurtle.g:907:2: ( rule__DataGraph__TriplesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_4 = input.LA(3);

                        if ( ((LA6_4>=RULE_STRING && LA6_4<=RULE_ID)) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_2==RULE_STRING||LA6_2==39) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_ID) ) {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==RULE_STRING||LA6_3==39) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==RULE_ID) ) {
                        int LA6_4 = input.LA(3);

                        if ( ((LA6_4>=RULE_STRING && LA6_4<=RULE_ID)) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalTurtle.g:907:3: rule__DataGraph__TriplesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DataGraph__TriplesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalTurtle.g:916:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:920:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalTurtle.g:921:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTurtle.g:928:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:932:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalTurtle.g:933:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalTurtle.g:933:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalTurtle.g:934:2: ( rule__Triples__SubjectAssignment_0 )
            {
             before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            // InternalTurtle.g:935:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalTurtle.g:935:3: rule__Triples__SubjectAssignment_0
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
    // InternalTurtle.g:943:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl rule__Triples__Group__2 ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:947:1: ( rule__Triples__Group__1__Impl rule__Triples__Group__2 )
            // InternalTurtle.g:948:2: rule__Triples__Group__1__Impl rule__Triples__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTurtle.g:955:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateobjectAssignment_1 )* ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:959:1: ( ( ( rule__Triples__PredicateobjectAssignment_1 )* ) )
            // InternalTurtle.g:960:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            {
            // InternalTurtle.g:960:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            // InternalTurtle.g:961:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 
            // InternalTurtle.g:962:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTurtle.g:962:3: rule__Triples__PredicateobjectAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Triples__PredicateobjectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTurtle.g:970:1: rule__Triples__Group__2 : rule__Triples__Group__2__Impl ;
    public final void rule__Triples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:974:1: ( rule__Triples__Group__2__Impl )
            // InternalTurtle.g:975:2: rule__Triples__Group__2__Impl
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
    // InternalTurtle.g:981:1: rule__Triples__Group__2__Impl : ( '.' ) ;
    public final void rule__Triples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:985:1: ( ( '.' ) )
            // InternalTurtle.g:986:1: ( '.' )
            {
            // InternalTurtle.g:986:1: ( '.' )
            // InternalTurtle.g:987:2: '.'
            {
             before(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTurtle.g:997:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1001:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalTurtle.g:1002:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTurtle.g:1009:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__Group_0__0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1013:1: ( ( ( rule__PredicateObject__Group_0__0 ) ) )
            // InternalTurtle.g:1014:1: ( ( rule__PredicateObject__Group_0__0 ) )
            {
            // InternalTurtle.g:1014:1: ( ( rule__PredicateObject__Group_0__0 ) )
            // InternalTurtle.g:1015:2: ( rule__PredicateObject__Group_0__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup_0()); 
            // InternalTurtle.g:1016:2: ( rule__PredicateObject__Group_0__0 )
            // InternalTurtle.g:1016:3: rule__PredicateObject__Group_0__0
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
    // InternalTurtle.g:1024:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1028:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalTurtle.g:1029:2: rule__PredicateObject__Group__1__Impl
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
    // InternalTurtle.g:1035:1: rule__PredicateObject__Group__1__Impl : ( ';' ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1039:1: ( ( ';' ) )
            // InternalTurtle.g:1040:1: ( ';' )
            {
            // InternalTurtle.g:1040:1: ( ';' )
            // InternalTurtle.g:1041:2: ';'
            {
             before(grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTurtle.g:1051:1: rule__PredicateObject__Group_0__0 : rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 ;
    public final void rule__PredicateObject__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1055:1: ( rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 )
            // InternalTurtle.g:1056:2: rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1063:1: rule__PredicateObject__Group_0__0__Impl : ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) ;
    public final void rule__PredicateObject__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1067:1: ( ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) )
            // InternalTurtle.g:1068:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            {
            // InternalTurtle.g:1068:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            // InternalTurtle.g:1069:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 
            // InternalTurtle.g:1070:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            // InternalTurtle.g:1070:3: rule__PredicateObject__PredicateAssignment_0_0
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
    // InternalTurtle.g:1078:1: rule__PredicateObject__Group_0__1 : rule__PredicateObject__Group_0__1__Impl ;
    public final void rule__PredicateObject__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1082:1: ( rule__PredicateObject__Group_0__1__Impl )
            // InternalTurtle.g:1083:2: rule__PredicateObject__Group_0__1__Impl
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
    // InternalTurtle.g:1089:1: rule__PredicateObject__Group_0__1__Impl : ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) ;
    public final void rule__PredicateObject__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1093:1: ( ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) )
            // InternalTurtle.g:1094:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            {
            // InternalTurtle.g:1094:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            // InternalTurtle.g:1095:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 
            // InternalTurtle.g:1096:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            // InternalTurtle.g:1096:3: rule__PredicateObject__ObjectAssignment_0_1
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
    // InternalTurtle.g:1105:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1109:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalTurtle.g:1110:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1117:1: rule__Subject__Group__0__Impl : ( () ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1121:1: ( ( () ) )
            // InternalTurtle.g:1122:1: ( () )
            {
            // InternalTurtle.g:1122:1: ( () )
            // InternalTurtle.g:1123:2: ()
            {
             before(grammarAccess.getSubjectAccess().getSubjectAction_0()); 
            // InternalTurtle.g:1124:2: ()
            // InternalTurtle.g:1124:3: 
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
    // InternalTurtle.g:1132:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1136:1: ( rule__Subject__Group__1__Impl )
            // InternalTurtle.g:1137:2: rule__Subject__Group__1__Impl
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
    // InternalTurtle.g:1143:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1147:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalTurtle.g:1148:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1148:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalTurtle.g:1149:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1150:2: ( rule__Subject__NameAssignment_1 )
            // InternalTurtle.g:1150:3: rule__Subject__NameAssignment_1
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
    // InternalTurtle.g:1159:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1163:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalTurtle.g:1164:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1171:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1175:1: ( ( () ) )
            // InternalTurtle.g:1176:1: ( () )
            {
            // InternalTurtle.g:1176:1: ( () )
            // InternalTurtle.g:1177:2: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicateAction_0()); 
            // InternalTurtle.g:1178:2: ()
            // InternalTurtle.g:1178:3: 
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
    // InternalTurtle.g:1186:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1190:1: ( rule__Predicate__Group__1__Impl )
            // InternalTurtle.g:1191:2: rule__Predicate__Group__1__Impl
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
    // InternalTurtle.g:1197:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1201:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalTurtle.g:1202:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1202:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalTurtle.g:1203:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1204:2: ( rule__Predicate__NameAssignment_1 )
            // InternalTurtle.g:1204:3: rule__Predicate__NameAssignment_1
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
    // InternalTurtle.g:1213:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1217:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalTurtle.g:1218:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1225:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1229:1: ( ( () ) )
            // InternalTurtle.g:1230:1: ( () )
            {
            // InternalTurtle.g:1230:1: ( () )
            // InternalTurtle.g:1231:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalTurtle.g:1232:2: ()
            // InternalTurtle.g:1232:3: 
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
    // InternalTurtle.g:1240:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1244:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalTurtle.g:1245:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTurtle.g:1252:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1256:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalTurtle.g:1257:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1257:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalTurtle.g:1258:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1259:2: ( rule__Object__NameAssignment_1 )
            // InternalTurtle.g:1259:3: rule__Object__NameAssignment_1
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
    // InternalTurtle.g:1267:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1271:1: ( rule__Object__Group__2__Impl )
            // InternalTurtle.g:1272:2: rule__Object__Group__2__Impl
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
    // InternalTurtle.g:1278:1: rule__Object__Group__2__Impl : ( ( rule__Object__Group_2__0 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1282:1: ( ( ( rule__Object__Group_2__0 )? ) )
            // InternalTurtle.g:1283:1: ( ( rule__Object__Group_2__0 )? )
            {
            // InternalTurtle.g:1283:1: ( ( rule__Object__Group_2__0 )? )
            // InternalTurtle.g:1284:2: ( rule__Object__Group_2__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_2()); 
            // InternalTurtle.g:1285:2: ( rule__Object__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTurtle.g:1285:3: rule__Object__Group_2__0
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
    // InternalTurtle.g:1294:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1298:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalTurtle.g:1299:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1306:1: rule__Object__Group_2__0__Impl : ( '^^' ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1310:1: ( ( '^^' ) )
            // InternalTurtle.g:1311:1: ( '^^' )
            {
            // InternalTurtle.g:1311:1: ( '^^' )
            // InternalTurtle.g:1312:2: '^^'
            {
             before(grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTurtle.g:1321:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1325:1: ( rule__Object__Group_2__1__Impl )
            // InternalTurtle.g:1326:2: rule__Object__Group_2__1__Impl
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
    // InternalTurtle.g:1332:1: rule__Object__Group_2__1__Impl : ( ( rule__Object__XsdTypeAssignment_2_1 ) ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1336:1: ( ( ( rule__Object__XsdTypeAssignment_2_1 ) ) )
            // InternalTurtle.g:1337:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            {
            // InternalTurtle.g:1337:1: ( ( rule__Object__XsdTypeAssignment_2_1 ) )
            // InternalTurtle.g:1338:2: ( rule__Object__XsdTypeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAccess().getXsdTypeAssignment_2_1()); 
            // InternalTurtle.g:1339:2: ( rule__Object__XsdTypeAssignment_2_1 )
            // InternalTurtle.g:1339:3: rule__Object__XsdTypeAssignment_2_1
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
    // InternalTurtle.g:1348:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1352:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalTurtle.g:1353:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1360:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1364:1: ( ( () ) )
            // InternalTurtle.g:1365:1: ( () )
            {
            // InternalTurtle.g:1365:1: ( () )
            // InternalTurtle.g:1366:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalTurtle.g:1367:2: ()
            // InternalTurtle.g:1367:3: 
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
    // InternalTurtle.g:1375:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1379:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalTurtle.g:1380:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalTurtle.g:1386:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1390:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalTurtle.g:1391:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalTurtle.g:1391:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalTurtle.g:1392:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalTurtle.g:1393:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTurtle.g:1393:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTurtle.g:1402:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1406:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalTurtle.g:1407:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1414:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1418:1: ( ( () ) )
            // InternalTurtle.g:1419:1: ( () )
            {
            // InternalTurtle.g:1419:1: ( () )
            // InternalTurtle.g:1420:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalTurtle.g:1421:2: ()
            // InternalTurtle.g:1421:3: 
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
    // InternalTurtle.g:1429:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1433:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalTurtle.g:1434:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTurtle.g:1441:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1445:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalTurtle.g:1446:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalTurtle.g:1446:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalTurtle.g:1447:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalTurtle.g:1448:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalTurtle.g:1448:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalTurtle.g:1456:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1460:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalTurtle.g:1461:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTurtle.g:1468:1: rule__ShapeConstraint__Group__2__Impl : ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) ) ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1472:1: ( ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) ) ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* ) ) )
            // InternalTurtle.g:1473:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) ) ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* ) )
            {
            // InternalTurtle.g:1473:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) ) ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* ) )
            // InternalTurtle.g:1474:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) ) ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* )
            {
            // InternalTurtle.g:1474:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 ) )
            // InternalTurtle.g:1475:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2()); 
            // InternalTurtle.g:1476:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )
            // InternalTurtle.g:1476:4: rule__ShapeConstraint__ShapeExpressionsAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__ShapeConstraint__ShapeExpressionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2()); 

            }

            // InternalTurtle.g:1479:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )* )
            // InternalTurtle.g:1480:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )*
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2()); 
            // InternalTurtle.g:1481:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=12 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTurtle.g:1481:4: rule__ShapeConstraint__ShapeExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ShapeConstraint__ShapeExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2()); 

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
    // InternalTurtle.g:1490:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1494:1: ( rule__ShapeConstraint__Group__3__Impl )
            // InternalTurtle.g:1495:2: rule__ShapeConstraint__Group__3__Impl
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
    // InternalTurtle.g:1501:1: rule__ShapeConstraint__Group__3__Impl : ( '.' ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1505:1: ( ( '.' ) )
            // InternalTurtle.g:1506:1: ( '.' )
            {
            // InternalTurtle.g:1506:1: ( '.' )
            // InternalTurtle.g:1507:2: '.'
            {
             before(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__ShapeName__Group__0"
    // InternalTurtle.g:1517:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1521:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalTurtle.g:1522:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1529:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1533:1: ( ( () ) )
            // InternalTurtle.g:1534:1: ( () )
            {
            // InternalTurtle.g:1534:1: ( () )
            // InternalTurtle.g:1535:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalTurtle.g:1536:2: ()
            // InternalTurtle.g:1536:3: 
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
    // InternalTurtle.g:1544:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1548:1: ( rule__ShapeName__Group__1__Impl )
            // InternalTurtle.g:1549:2: rule__ShapeName__Group__1__Impl
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
    // InternalTurtle.g:1555:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1559:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalTurtle.g:1560:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1560:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalTurtle.g:1561:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1562:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalTurtle.g:1562:3: rule__ShapeName__NameAssignment_1
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


    // $ANTLR start "rule__ShapeExpression__Group_0__0"
    // InternalTurtle.g:1571:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1575:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalTurtle.g:1576:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_0__0"


    // $ANTLR start "rule__ShapeExpression__Group_0__0__Impl"
    // InternalTurtle.g:1583:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1587:1: ( ( () ) )
            // InternalTurtle.g:1588:1: ( () )
            {
            // InternalTurtle.g:1588:1: ( () )
            // InternalTurtle.g:1589:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalTurtle.g:1590:2: ()
            // InternalTurtle.g:1590:3: 
            {
            }

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0__1"
    // InternalTurtle.g:1598:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1602:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalTurtle.g:1603:2: rule__ShapeExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_0__1"


    // $ANTLR start "rule__ShapeExpression__Group_0__1__Impl"
    // InternalTurtle.g:1609:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__Group_0_1__0 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1613:1: ( ( ( rule__ShapeExpression__Group_0_1__0 ) ) )
            // InternalTurtle.g:1614:1: ( ( rule__ShapeExpression__Group_0_1__0 ) )
            {
            // InternalTurtle.g:1614:1: ( ( rule__ShapeExpression__Group_0_1__0 ) )
            // InternalTurtle.g:1615:2: ( rule__ShapeExpression__Group_0_1__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_0_1()); 
            // InternalTurtle.g:1616:2: ( rule__ShapeExpression__Group_0_1__0 )
            // InternalTurtle.g:1616:3: rule__ShapeExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__0"
    // InternalTurtle.g:1625:1: rule__ShapeExpression__Group_0_1__0 : rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1 ;
    public final void rule__ShapeExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1629:1: ( rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1 )
            // InternalTurtle.g:1630:2: rule__ShapeExpression__Group_0_1__0__Impl rule__ShapeExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ShapeExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__0__Impl"
    // InternalTurtle.g:1637:1: rule__ShapeExpression__Group_0_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ShapeExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1641:1: ( ( RULE_ID ) )
            // InternalTurtle.g:1642:1: ( RULE_ID )
            {
            // InternalTurtle.g:1642:1: ( RULE_ID )
            // InternalTurtle.g:1643:2: RULE_ID
            {
             before(grammarAccess.getShapeExpressionAccess().getIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__1"
    // InternalTurtle.g:1652:1: rule__ShapeExpression__Group_0_1__1 : rule__ShapeExpression__Group_0_1__1__Impl rule__ShapeExpression__Group_0_1__2 ;
    public final void rule__ShapeExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1656:1: ( rule__ShapeExpression__Group_0_1__1__Impl rule__ShapeExpression__Group_0_1__2 )
            // InternalTurtle.g:1657:2: rule__ShapeExpression__Group_0_1__1__Impl rule__ShapeExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_11);
            rule__ShapeExpression__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__1__Impl"
    // InternalTurtle.g:1664:1: rule__ShapeExpression__Group_0_1__1__Impl : ( 'sh:NodeShape' ) ;
    public final void rule__ShapeExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1668:1: ( ( 'sh:NodeShape' ) )
            // InternalTurtle.g:1669:1: ( 'sh:NodeShape' )
            {
            // InternalTurtle.g:1669:1: ( 'sh:NodeShape' )
            // InternalTurtle.g:1670:2: 'sh:NodeShape'
            {
             before(grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_0_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_0_1_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__2"
    // InternalTurtle.g:1679:1: rule__ShapeExpression__Group_0_1__2 : rule__ShapeExpression__Group_0_1__2__Impl ;
    public final void rule__ShapeExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1683:1: ( rule__ShapeExpression__Group_0_1__2__Impl )
            // InternalTurtle.g:1684:2: rule__ShapeExpression__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__2"


    // $ANTLR start "rule__ShapeExpression__Group_0_1__2__Impl"
    // InternalTurtle.g:1690:1: rule__ShapeExpression__Group_0_1__2__Impl : ( ';' ) ;
    public final void rule__ShapeExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1694:1: ( ( ';' ) )
            // InternalTurtle.g:1695:1: ( ';' )
            {
            // InternalTurtle.g:1695:1: ( ';' )
            // InternalTurtle.g:1696:2: ';'
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_0_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_0_1_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_0_1__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__0"
    // InternalTurtle.g:1706:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1710:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalTurtle.g:1711:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ShapeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_1__0__Impl"
    // InternalTurtle.g:1718:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1722:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0 ) ) )
            // InternalTurtle.g:1723:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            {
            // InternalTurtle.g:1723:1: ( ( rule__ShapeExpression__TypeAssignment_1_0 ) )
            // InternalTurtle.g:1724:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0()); 
            // InternalTurtle.g:1725:2: ( rule__ShapeExpression__TypeAssignment_1_0 )
            // InternalTurtle.g:1725:3: rule__ShapeExpression__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__1"
    // InternalTurtle.g:1733:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1737:1: ( rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 )
            // InternalTurtle.g:1738:2: rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ShapeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_1__1__Impl"
    // InternalTurtle.g:1745:1: rule__ShapeExpression__Group_1__1__Impl : ( ( '(' )? ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1749:1: ( ( ( '(' )? ) )
            // InternalTurtle.g:1750:1: ( ( '(' )? )
            {
            // InternalTurtle.g:1750:1: ( ( '(' )? )
            // InternalTurtle.g:1751:2: ( '(' )?
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            // InternalTurtle.g:1752:2: ( '(' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTurtle.g:1752:3: '('
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__2"
    // InternalTurtle.g:1760:1: rule__ShapeExpression__Group_1__2 : rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 ;
    public final void rule__ShapeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1764:1: ( rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 )
            // InternalTurtle.g:1765:2: rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__ShapeExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__3();

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
    // $ANTLR end "rule__ShapeExpression__Group_1__2"


    // $ANTLR start "rule__ShapeExpression__Group_1__2__Impl"
    // InternalTurtle.g:1772:1: rule__ShapeExpression__Group_1__2__Impl : ( ( rule__ShapeExpression__Alternatives_1_2 )* ) ;
    public final void rule__ShapeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1776:1: ( ( ( rule__ShapeExpression__Alternatives_1_2 )* ) )
            // InternalTurtle.g:1777:1: ( ( rule__ShapeExpression__Alternatives_1_2 )* )
            {
            // InternalTurtle.g:1777:1: ( ( rule__ShapeExpression__Alternatives_1_2 )* )
            // InternalTurtle.g:1778:2: ( rule__ShapeExpression__Alternatives_1_2 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_2()); 
            // InternalTurtle.g:1779:2: ( rule__ShapeExpression__Alternatives_1_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==EOF||(LA12_2>=RULE_STRING && LA12_2<=RULE_ID)||(LA12_2>=12 && LA12_2<=37)||(LA12_2>=39 && LA12_2<=41)||(LA12_2>=44 && LA12_2<=46)) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_STRING||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtle.g:1779:3: rule__ShapeExpression__Alternatives_1_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ShapeExpression__Alternatives_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getAlternatives_1_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__3"
    // InternalTurtle.g:1787:1: rule__ShapeExpression__Group_1__3 : rule__ShapeExpression__Group_1__3__Impl rule__ShapeExpression__Group_1__4 ;
    public final void rule__ShapeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1791:1: ( rule__ShapeExpression__Group_1__3__Impl rule__ShapeExpression__Group_1__4 )
            // InternalTurtle.g:1792:2: rule__ShapeExpression__Group_1__3__Impl rule__ShapeExpression__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__ShapeExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__4();

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
    // $ANTLR end "rule__ShapeExpression__Group_1__3"


    // $ANTLR start "rule__ShapeExpression__Group_1__3__Impl"
    // InternalTurtle.g:1799:1: rule__ShapeExpression__Group_1__3__Impl : ( ( ')' )? ) ;
    public final void rule__ShapeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1803:1: ( ( ( ')' )? ) )
            // InternalTurtle.g:1804:1: ( ( ')' )? )
            {
            // InternalTurtle.g:1804:1: ( ( ')' )? )
            // InternalTurtle.g:1805:2: ( ')' )?
            {
             before(grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_3()); 
            // InternalTurtle.g:1806:2: ( ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTurtle.g:1806:3: ')'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1__4"
    // InternalTurtle.g:1814:1: rule__ShapeExpression__Group_1__4 : rule__ShapeExpression__Group_1__4__Impl ;
    public final void rule__ShapeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1818:1: ( rule__ShapeExpression__Group_1__4__Impl )
            // InternalTurtle.g:1819:2: rule__ShapeExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__4__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1__4"


    // $ANTLR start "rule__ShapeExpression__Group_1__4__Impl"
    // InternalTurtle.g:1825:1: rule__ShapeExpression__Group_1__4__Impl : ( ( ';' )? ) ;
    public final void rule__ShapeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1829:1: ( ( ( ';' )? ) )
            // InternalTurtle.g:1830:1: ( ( ';' )? )
            {
            // InternalTurtle.g:1830:1: ( ( ';' )? )
            // InternalTurtle.g:1831:2: ( ';' )?
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_4()); 
            // InternalTurtle.g:1832:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTurtle.g:1832:3: ';'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_4()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__4__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__0"
    // InternalTurtle.g:1841:1: rule__ShapeExpression__Group_1_2_1__0 : rule__ShapeExpression__Group_1_2_1__0__Impl rule__ShapeExpression__Group_1_2_1__1 ;
    public final void rule__ShapeExpression__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1845:1: ( rule__ShapeExpression__Group_1_2_1__0__Impl rule__ShapeExpression__Group_1_2_1__1 )
            // InternalTurtle.g:1846:2: rule__ShapeExpression__Group_1_2_1__0__Impl rule__ShapeExpression__Group_1_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ShapeExpression__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2_1__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__0__Impl"
    // InternalTurtle.g:1853:1: rule__ShapeExpression__Group_1_2_1__0__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1857:1: ( ( '[' ) )
            // InternalTurtle.g:1858:1: ( '[' )
            {
            // InternalTurtle.g:1858:1: ( '[' )
            // InternalTurtle.g:1859:2: '['
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__1"
    // InternalTurtle.g:1868:1: rule__ShapeExpression__Group_1_2_1__1 : rule__ShapeExpression__Group_1_2_1__1__Impl rule__ShapeExpression__Group_1_2_1__2 ;
    public final void rule__ShapeExpression__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1872:1: ( rule__ShapeExpression__Group_1_2_1__1__Impl rule__ShapeExpression__Group_1_2_1__2 )
            // InternalTurtle.g:1873:2: rule__ShapeExpression__Group_1_2_1__1__Impl rule__ShapeExpression__Group_1_2_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ShapeExpression__Group_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2_1__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__1__Impl"
    // InternalTurtle.g:1880:1: rule__ShapeExpression__Group_1_2_1__1__Impl : ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )* ) ;
    public final void rule__ShapeExpression__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1884:1: ( ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )* ) )
            // InternalTurtle.g:1885:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )* )
            {
            // InternalTurtle.g:1885:1: ( ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )* )
            // InternalTurtle.g:1886:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_1_1()); 
            // InternalTurtle.g:1887:2: ( rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=12 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTurtle.g:1887:3: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_1_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__2"
    // InternalTurtle.g:1895:1: rule__ShapeExpression__Group_1_2_1__2 : rule__ShapeExpression__Group_1_2_1__2__Impl ;
    public final void rule__ShapeExpression__Group_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1899:1: ( rule__ShapeExpression__Group_1_2_1__2__Impl )
            // InternalTurtle.g:1900:2: rule__ShapeExpression__Group_1_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2_1__2__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__2"


    // $ANTLR start "rule__ShapeExpression__Group_1_2_1__2__Impl"
    // InternalTurtle.g:1906:1: rule__ShapeExpression__Group_1_2_1__2__Impl : ( ']' ) ;
    public final void rule__ShapeExpression__Group_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1910:1: ( ( ']' ) )
            // InternalTurtle.g:1911:1: ( ']' )
            {
            // InternalTurtle.g:1911:1: ( ']' )
            // InternalTurtle.g:1912:2: ']'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_1_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_1_2()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1_2_1__2__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalTurtle.g:1922:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1926:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalTurtle.g:1927:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:1934:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1938:1: ( ( () ) )
            // InternalTurtle.g:1939:1: ( () )
            {
            // InternalTurtle.g:1939:1: ( () )
            // InternalTurtle.g:1940:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalTurtle.g:1941:2: ()
            // InternalTurtle.g:1941:3: 
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
    // InternalTurtle.g:1949:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1953:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalTurtle.g:1954:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTurtle.g:1961:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1965:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalTurtle.g:1966:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1966:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalTurtle.g:1967:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1968:2: ( rule__Value__NameAssignment_1 )
            // InternalTurtle.g:1968:3: rule__Value__NameAssignment_1
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
    // InternalTurtle.g:1976:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1980:1: ( rule__Value__Group__2__Impl )
            // InternalTurtle.g:1981:2: rule__Value__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__2__Impl();

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
    // InternalTurtle.g:1987:1: rule__Value__Group__2__Impl : ( ( rule__Value__Group_2__0 )? ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1991:1: ( ( ( rule__Value__Group_2__0 )? ) )
            // InternalTurtle.g:1992:1: ( ( rule__Value__Group_2__0 )? )
            {
            // InternalTurtle.g:1992:1: ( ( rule__Value__Group_2__0 )? )
            // InternalTurtle.g:1993:2: ( rule__Value__Group_2__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_2()); 
            // InternalTurtle.g:1994:2: ( rule__Value__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTurtle.g:1994:3: rule__Value__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Value__Group_2__0"
    // InternalTurtle.g:2003:1: rule__Value__Group_2__0 : rule__Value__Group_2__0__Impl rule__Value__Group_2__1 ;
    public final void rule__Value__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2007:1: ( rule__Value__Group_2__0__Impl rule__Value__Group_2__1 )
            // InternalTurtle.g:2008:2: rule__Value__Group_2__0__Impl rule__Value__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_2__1();

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
    // $ANTLR end "rule__Value__Group_2__0"


    // $ANTLR start "rule__Value__Group_2__0__Impl"
    // InternalTurtle.g:2015:1: rule__Value__Group_2__0__Impl : ( '^^' ) ;
    public final void rule__Value__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2019:1: ( ( '^^' ) )
            // InternalTurtle.g:2020:1: ( '^^' )
            {
            // InternalTurtle.g:2020:1: ( '^^' )
            // InternalTurtle.g:2021:2: '^^'
            {
             before(grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_2_0()); 

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
    // $ANTLR end "rule__Value__Group_2__0__Impl"


    // $ANTLR start "rule__Value__Group_2__1"
    // InternalTurtle.g:2030:1: rule__Value__Group_2__1 : rule__Value__Group_2__1__Impl ;
    public final void rule__Value__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2034:1: ( rule__Value__Group_2__1__Impl )
            // InternalTurtle.g:2035:2: rule__Value__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_2__1__Impl();

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
    // $ANTLR end "rule__Value__Group_2__1"


    // $ANTLR start "rule__Value__Group_2__1__Impl"
    // InternalTurtle.g:2041:1: rule__Value__Group_2__1__Impl : ( ( rule__Value__XsdTypeAssignment_2_1 ) ) ;
    public final void rule__Value__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2045:1: ( ( ( rule__Value__XsdTypeAssignment_2_1 ) ) )
            // InternalTurtle.g:2046:1: ( ( rule__Value__XsdTypeAssignment_2_1 ) )
            {
            // InternalTurtle.g:2046:1: ( ( rule__Value__XsdTypeAssignment_2_1 ) )
            // InternalTurtle.g:2047:2: ( rule__Value__XsdTypeAssignment_2_1 )
            {
             before(grammarAccess.getValueAccess().getXsdTypeAssignment_2_1()); 
            // InternalTurtle.g:2048:2: ( rule__Value__XsdTypeAssignment_2_1 )
            // InternalTurtle.g:2048:3: rule__Value__XsdTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__XsdTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getXsdTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Value__Group_2__1__Impl"


    // $ANTLR start "rule__Graph__NamespacesAssignment_1"
    // InternalTurtle.g:2057:1: rule__Graph__NamespacesAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Graph__NamespacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2061:1: ( ( ruleNamespace ) )
            // InternalTurtle.g:2062:2: ( ruleNamespace )
            {
            // InternalTurtle.g:2062:2: ( ruleNamespace )
            // InternalTurtle.g:2063:3: ruleNamespace
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
    // InternalTurtle.g:2072:1: rule__Graph__DataGraphAssignment_2 : ( ruleDataGraph ) ;
    public final void rule__Graph__DataGraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2076:1: ( ( ruleDataGraph ) )
            // InternalTurtle.g:2077:2: ( ruleDataGraph )
            {
            // InternalTurtle.g:2077:2: ( ruleDataGraph )
            // InternalTurtle.g:2078:3: ruleDataGraph
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
    // InternalTurtle.g:2087:1: rule__Graph__ShapesGraphAssignment_3 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2091:1: ( ( ruleShapesGraph ) )
            // InternalTurtle.g:2092:2: ( ruleShapesGraph )
            {
            // InternalTurtle.g:2092:2: ( ruleShapesGraph )
            // InternalTurtle.g:2093:3: ruleShapesGraph
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
    // InternalTurtle.g:2102:1: rule__Namespace__PrefixAssignment_1 : ( RULE_ID ) ;
    public final void rule__Namespace__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2106:1: ( ( RULE_ID ) )
            // InternalTurtle.g:2107:2: ( RULE_ID )
            {
            // InternalTurtle.g:2107:2: ( RULE_ID )
            // InternalTurtle.g:2108:3: RULE_ID
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
    // InternalTurtle.g:2117:1: rule__Namespace__NamespaceAssignment_2 : ( RULE_IRI ) ;
    public final void rule__Namespace__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2121:1: ( ( RULE_IRI ) )
            // InternalTurtle.g:2122:2: ( RULE_IRI )
            {
            // InternalTurtle.g:2122:2: ( RULE_IRI )
            // InternalTurtle.g:2123:3: RULE_IRI
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
    // InternalTurtle.g:2132:1: rule__DataGraph__TriplesAssignment_1 : ( ruleTriples ) ;
    public final void rule__DataGraph__TriplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2136:1: ( ( ruleTriples ) )
            // InternalTurtle.g:2137:2: ( ruleTriples )
            {
            // InternalTurtle.g:2137:2: ( ruleTriples )
            // InternalTurtle.g:2138:3: ruleTriples
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
    // InternalTurtle.g:2147:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2151:1: ( ( ruleSubject ) )
            // InternalTurtle.g:2152:2: ( ruleSubject )
            {
            // InternalTurtle.g:2152:2: ( ruleSubject )
            // InternalTurtle.g:2153:3: ruleSubject
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
    // InternalTurtle.g:2162:1: rule__Triples__PredicateobjectAssignment_1 : ( rulePredicateObject ) ;
    public final void rule__Triples__PredicateobjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2166:1: ( ( rulePredicateObject ) )
            // InternalTurtle.g:2167:2: ( rulePredicateObject )
            {
            // InternalTurtle.g:2167:2: ( rulePredicateObject )
            // InternalTurtle.g:2168:3: rulePredicateObject
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
    // InternalTurtle.g:2177:1: rule__PredicateObject__PredicateAssignment_0_0 : ( rulePredicate ) ;
    public final void rule__PredicateObject__PredicateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2181:1: ( ( rulePredicate ) )
            // InternalTurtle.g:2182:2: ( rulePredicate )
            {
            // InternalTurtle.g:2182:2: ( rulePredicate )
            // InternalTurtle.g:2183:3: rulePredicate
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
    // InternalTurtle.g:2192:1: rule__PredicateObject__ObjectAssignment_0_1 : ( ruleObject ) ;
    public final void rule__PredicateObject__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2196:1: ( ( ruleObject ) )
            // InternalTurtle.g:2197:2: ( ruleObject )
            {
            // InternalTurtle.g:2197:2: ( ruleObject )
            // InternalTurtle.g:2198:3: ruleObject
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
    // InternalTurtle.g:2207:1: rule__Subject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2211:1: ( ( ruleEString ) )
            // InternalTurtle.g:2212:2: ( ruleEString )
            {
            // InternalTurtle.g:2212:2: ( ruleEString )
            // InternalTurtle.g:2213:3: ruleEString
            {
             before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 

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
    // InternalTurtle.g:2222:1: rule__Predicate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2226:1: ( ( ruleEString ) )
            // InternalTurtle.g:2227:2: ( ruleEString )
            {
            // InternalTurtle.g:2227:2: ( ruleEString )
            // InternalTurtle.g:2228:3: ruleEString
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
    // InternalTurtle.g:2237:1: rule__Object__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2241:1: ( ( ruleEString ) )
            // InternalTurtle.g:2242:2: ( ruleEString )
            {
            // InternalTurtle.g:2242:2: ( ruleEString )
            // InternalTurtle.g:2243:3: ruleEString
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
    // InternalTurtle.g:2252:1: rule__Object__XsdTypeAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Object__XsdTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2256:1: ( ( ruleEString ) )
            // InternalTurtle.g:2257:2: ( ruleEString )
            {
            // InternalTurtle.g:2257:2: ( ruleEString )
            // InternalTurtle.g:2258:3: ruleEString
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
    // InternalTurtle.g:2267:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2271:1: ( ( ruleShapeConstraint ) )
            // InternalTurtle.g:2272:2: ( ruleShapeConstraint )
            {
            // InternalTurtle.g:2272:2: ( ruleShapeConstraint )
            // InternalTurtle.g:2273:3: ruleShapeConstraint
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
    // InternalTurtle.g:2282:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2286:1: ( ( ruleShapeName ) )
            // InternalTurtle.g:2287:2: ( ruleShapeName )
            {
            // InternalTurtle.g:2287:2: ( ruleShapeName )
            // InternalTurtle.g:2288:3: ruleShapeName
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


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_2"
    // InternalTurtle.g:2297:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2301:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2302:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2302:2: ( ruleShapeExpression )
            // InternalTurtle.g:2303:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ShapeConstraint__ShapeExpressionsAssignment_2"


    // $ANTLR start "rule__ShapeName__NameAssignment_1"
    // InternalTurtle.g:2312:1: rule__ShapeName__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2316:1: ( ( ruleEString ) )
            // InternalTurtle.g:2317:2: ( ruleEString )
            {
            // InternalTurtle.g:2317:2: ( ruleEString )
            // InternalTurtle.g:2318:3: ruleEString
            {
             before(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_0"
    // InternalTurtle.g:2327:1: rule__ShapeExpression__TypeAssignment_1_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2331:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2332:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2332:2: ( rulePropertyType )
            // InternalTurtle.g:2333:3: rulePropertyType
            {
             before(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__TypeAssignment_1_0"


    // $ANTLR start "rule__ShapeExpression__ValuesAssignment_1_2_0"
    // InternalTurtle.g:2342:1: rule__ShapeExpression__ValuesAssignment_1_2_0 : ( ruleValue ) ;
    public final void rule__ShapeExpression__ValuesAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2346:1: ( ( ruleValue ) )
            // InternalTurtle.g:2347:2: ( ruleValue )
            {
            // InternalTurtle.g:2347:2: ( ruleValue )
            // InternalTurtle.g:2348:3: ruleValue
            {
             before(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ValuesAssignment_1_2_0"


    // $ANTLR start "rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1"
    // InternalTurtle.g:2357:1: rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2361:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2362:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2362:2: ( ruleShapeExpression )
            // InternalTurtle.g:2363:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_1_1_0()); 

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
    // $ANTLR end "rule__ShapeExpression__ShapeExpressionsAssignment_1_2_1_1"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalTurtle.g:2372:1: rule__Value__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2376:1: ( ( ruleEString ) )
            // InternalTurtle.g:2377:2: ( ruleEString )
            {
            // InternalTurtle.g:2377:2: ( ruleEString )
            // InternalTurtle.g:2378:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Value__XsdTypeAssignment_2_1"
    // InternalTurtle.g:2387:1: rule__Value__XsdTypeAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Value__XsdTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2391:1: ( ( ruleEString ) )
            // InternalTurtle.g:2392:2: ( ruleEString )
            {
            // InternalTurtle.g:2392:2: ( ruleEString )
            // InternalTurtle.g:2393:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Value__XsdTypeAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003FFFFFF020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003FFFFFF022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000390000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000403FFFFFF020L});

}