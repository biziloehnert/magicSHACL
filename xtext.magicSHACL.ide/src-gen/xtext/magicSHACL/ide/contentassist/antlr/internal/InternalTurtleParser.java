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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_PREFIX", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'sh:property'", "'sh:path'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:inversePath'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'", "'<>'", "'@prefix'", "'<'", "'>'", "'.'", "';'", "'sh:NodeShape'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_PREFIX=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_UNICODE=4;
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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTurtle.g:232:1: ( ruleObject EOF )
            // InternalTurtle.g:233:1: ruleObject EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalTurtle.g:243:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:248:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalTurtle.g:249:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalTurtle.g:249:2: ( ( rule__Object__Group__0 ) )
            // InternalTurtle.g:250:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalTurtle.g:251:3: ( rule__Object__Group__0 )
            // InternalTurtle.g:251:4: rule__Object__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleShapesGraph"
    // InternalTurtle.g:261:1: entryRuleShapesGraph : ruleShapesGraph EOF ;
    public final void entryRuleShapesGraph() throws RecognitionException {
        try {
            // InternalTurtle.g:262:1: ( ruleShapesGraph EOF )
            // InternalTurtle.g:263:1: ruleShapesGraph EOF
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
    // InternalTurtle.g:270:1: ruleShapesGraph : ( ( rule__ShapesGraph__Group__0 ) ) ;
    public final void ruleShapesGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:274:2: ( ( ( rule__ShapesGraph__Group__0 ) ) )
            // InternalTurtle.g:275:2: ( ( rule__ShapesGraph__Group__0 ) )
            {
            // InternalTurtle.g:275:2: ( ( rule__ShapesGraph__Group__0 ) )
            // InternalTurtle.g:276:3: ( rule__ShapesGraph__Group__0 )
            {
             before(grammarAccess.getShapesGraphAccess().getGroup()); 
            // InternalTurtle.g:277:3: ( rule__ShapesGraph__Group__0 )
            // InternalTurtle.g:277:4: rule__ShapesGraph__Group__0
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
    // InternalTurtle.g:286:1: entryRuleShapeConstraint : ruleShapeConstraint EOF ;
    public final void entryRuleShapeConstraint() throws RecognitionException {
        try {
            // InternalTurtle.g:287:1: ( ruleShapeConstraint EOF )
            // InternalTurtle.g:288:1: ruleShapeConstraint EOF
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
    // InternalTurtle.g:295:1: ruleShapeConstraint : ( ( rule__ShapeConstraint__Group__0 ) ) ;
    public final void ruleShapeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:299:2: ( ( ( rule__ShapeConstraint__Group__0 ) ) )
            // InternalTurtle.g:300:2: ( ( rule__ShapeConstraint__Group__0 ) )
            {
            // InternalTurtle.g:300:2: ( ( rule__ShapeConstraint__Group__0 ) )
            // InternalTurtle.g:301:3: ( rule__ShapeConstraint__Group__0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getGroup()); 
            // InternalTurtle.g:302:3: ( rule__ShapeConstraint__Group__0 )
            // InternalTurtle.g:302:4: rule__ShapeConstraint__Group__0
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
    // InternalTurtle.g:311:1: entryRuleShapeName : ruleShapeName EOF ;
    public final void entryRuleShapeName() throws RecognitionException {
        try {
            // InternalTurtle.g:312:1: ( ruleShapeName EOF )
            // InternalTurtle.g:313:1: ruleShapeName EOF
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
    // InternalTurtle.g:320:1: ruleShapeName : ( ( rule__ShapeName__Group__0 ) ) ;
    public final void ruleShapeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:324:2: ( ( ( rule__ShapeName__Group__0 ) ) )
            // InternalTurtle.g:325:2: ( ( rule__ShapeName__Group__0 ) )
            {
            // InternalTurtle.g:325:2: ( ( rule__ShapeName__Group__0 ) )
            // InternalTurtle.g:326:3: ( rule__ShapeName__Group__0 )
            {
             before(grammarAccess.getShapeNameAccess().getGroup()); 
            // InternalTurtle.g:327:3: ( rule__ShapeName__Group__0 )
            // InternalTurtle.g:327:4: rule__ShapeName__Group__0
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
    // InternalTurtle.g:336:1: entryRuleShapeExpression : ruleShapeExpression EOF ;
    public final void entryRuleShapeExpression() throws RecognitionException {
        try {
            // InternalTurtle.g:337:1: ( ruleShapeExpression EOF )
            // InternalTurtle.g:338:1: ruleShapeExpression EOF
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
    // InternalTurtle.g:345:1: ruleShapeExpression : ( ( rule__ShapeExpression__Alternatives ) ) ;
    public final void ruleShapeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:349:2: ( ( ( rule__ShapeExpression__Alternatives ) ) )
            // InternalTurtle.g:350:2: ( ( rule__ShapeExpression__Alternatives ) )
            {
            // InternalTurtle.g:350:2: ( ( rule__ShapeExpression__Alternatives ) )
            // InternalTurtle.g:351:3: ( rule__ShapeExpression__Alternatives )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives()); 
            // InternalTurtle.g:352:3: ( rule__ShapeExpression__Alternatives )
            // InternalTurtle.g:352:4: rule__ShapeExpression__Alternatives
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


    // $ANTLR start "entryRulePropertyValues"
    // InternalTurtle.g:361:1: entryRulePropertyValues : rulePropertyValues EOF ;
    public final void entryRulePropertyValues() throws RecognitionException {
        try {
            // InternalTurtle.g:362:1: ( rulePropertyValues EOF )
            // InternalTurtle.g:363:1: rulePropertyValues EOF
            {
             before(grammarAccess.getPropertyValuesRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValues();

            state._fsp--;

             after(grammarAccess.getPropertyValuesRule()); 
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
    // $ANTLR end "entryRulePropertyValues"


    // $ANTLR start "rulePropertyValues"
    // InternalTurtle.g:370:1: rulePropertyValues : ( ( rule__PropertyValues__Group__0 ) ) ;
    public final void rulePropertyValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:374:2: ( ( ( rule__PropertyValues__Group__0 ) ) )
            // InternalTurtle.g:375:2: ( ( rule__PropertyValues__Group__0 ) )
            {
            // InternalTurtle.g:375:2: ( ( rule__PropertyValues__Group__0 ) )
            // InternalTurtle.g:376:3: ( rule__PropertyValues__Group__0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getGroup()); 
            // InternalTurtle.g:377:3: ( rule__PropertyValues__Group__0 )
            // InternalTurtle.g:377:4: rule__PropertyValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValues"


    // $ANTLR start "entryRuleProperty"
    // InternalTurtle.g:386:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalTurtle.g:387:1: ( ruleProperty EOF )
            // InternalTurtle.g:388:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalTurtle.g:395:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:399:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalTurtle.g:400:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalTurtle.g:400:2: ( ( rule__Property__Group__0 ) )
            // InternalTurtle.g:401:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalTurtle.g:402:3: ( rule__Property__Group__0 )
            // InternalTurtle.g:402:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValue"
    // InternalTurtle.g:411:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalTurtle.g:412:1: ( ruleValue EOF )
            // InternalTurtle.g:413:1: ruleValue EOF
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
    // InternalTurtle.g:420:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:424:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalTurtle.g:425:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalTurtle.g:425:2: ( ( rule__Value__Group__0 ) )
            // InternalTurtle.g:426:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalTurtle.g:427:3: ( rule__Value__Group__0 )
            // InternalTurtle.g:427:4: rule__Value__Group__0
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


    // $ANTLR start "rulePropertyType"
    // InternalTurtle.g:436:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:440:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalTurtle.g:441:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalTurtle.g:441:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalTurtle.g:442:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalTurtle.g:443:3: ( rule__PropertyType__Alternatives )
            // InternalTurtle.g:443:4: rule__PropertyType__Alternatives
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


    // $ANTLR start "rule__ShapeConstraint__Alternatives_2"
    // InternalTurtle.g:451:1: rule__ShapeConstraint__Alternatives_2 : ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) );
    public final void rule__ShapeConstraint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:455:1: ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_UNICODE||LA1_0==13) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=32)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTurtle.g:456:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    {
                    // InternalTurtle.g:456:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    // InternalTurtle.g:457:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getGroup_2_0()); 
                    // InternalTurtle.g:458:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    // InternalTurtle.g:458:4: rule__ShapeConstraint__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstraint__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeConstraintAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:462:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    {
                    // InternalTurtle.g:462:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    // InternalTurtle.g:463:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1()); 
                    // InternalTurtle.g:464:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    // InternalTurtle.g:464:4: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1
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


    // $ANTLR start "rule__ShapeConstraint__Alternatives_2_0_0"
    // InternalTurtle.g:472:1: rule__ShapeConstraint__Alternatives_2_0_0 : ( ( RULE_UNICODE ) | ( 'a' ) );
    public final void rule__ShapeConstraint__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:476:1: ( ( RULE_UNICODE ) | ( 'a' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_UNICODE) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTurtle.g:477:2: ( RULE_UNICODE )
                    {
                    // InternalTurtle.g:477:2: ( RULE_UNICODE )
                    // InternalTurtle.g:478:3: RULE_UNICODE
                    {
                     before(grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_UNICODE,FOLLOW_2); 
                     after(grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:483:2: ( 'a' )
                    {
                    // InternalTurtle.g:483:2: ( 'a' )
                    // InternalTurtle.g:484:3: 'a'
                    {
                     before(grammarAccess.getShapeConstraintAccess().getAKeyword_2_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getShapeConstraintAccess().getAKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__ShapeConstraint__Alternatives_2_0_0"


    // $ANTLR start "rule__ShapeExpression__Alternatives"
    // InternalTurtle.g:493:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:497:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:498:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalTurtle.g:498:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalTurtle.g:499:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalTurtle.g:500:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalTurtle.g:500:4: rule__ShapeExpression__Group_0__0
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
                    // InternalTurtle.g:504:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    {
                    // InternalTurtle.g:504:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    // InternalTurtle.g:505:3: ( rule__ShapeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1()); 
                    // InternalTurtle.g:506:3: ( rule__ShapeExpression__Group_1__0 )
                    // InternalTurtle.g:506:4: rule__ShapeExpression__Group_1__0
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


    // $ANTLR start "rule__ShapeExpression__Alternatives_1_1_0"
    // InternalTurtle.g:514:1: rule__ShapeExpression__Alternatives_1_1_0 : ( ( RULE_UNICODE ) | ( 'a' ) );
    public final void rule__ShapeExpression__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:518:1: ( ( RULE_UNICODE ) | ( 'a' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_UNICODE) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTurtle.g:519:2: ( RULE_UNICODE )
                    {
                    // InternalTurtle.g:519:2: ( RULE_UNICODE )
                    // InternalTurtle.g:520:3: RULE_UNICODE
                    {
                     before(grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_UNICODE,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:525:2: ( 'a' )
                    {
                    // InternalTurtle.g:525:2: ( 'a' )
                    // InternalTurtle.g:526:3: 'a'
                    {
                     before(grammarAccess.getShapeExpressionAccess().getAKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getAKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives_1_1_0"


    // $ANTLR start "rule__ShapeExpression__Alternatives_1_2_0"
    // InternalTurtle.g:535:1: rule__ShapeExpression__Alternatives_1_2_0 : ( ( 'sh:property' ) | ( 'sh:path' ) );
    public final void rule__ShapeExpression__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:539:1: ( ( 'sh:property' ) | ( 'sh:path' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTurtle.g:540:2: ( 'sh:property' )
                    {
                    // InternalTurtle.g:540:2: ( 'sh:property' )
                    // InternalTurtle.g:541:3: 'sh:property'
                    {
                     before(grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:546:2: ( 'sh:path' )
                    {
                    // InternalTurtle.g:546:2: ( 'sh:path' )
                    // InternalTurtle.g:547:3: 'sh:path'
                    {
                     before(grammarAccess.getShapeExpressionAccess().getShPathKeyword_1_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getShPathKeyword_1_2_0_1()); 

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
    // $ANTLR end "rule__ShapeExpression__Alternatives_1_2_0"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalTurtle.g:556:1: rule__PropertyType__Alternatives : ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:560:1: ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) )
            int alt6=19;
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
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            case 25:
                {
                alt6=10;
                }
                break;
            case 26:
                {
                alt6=11;
                }
                break;
            case 27:
                {
                alt6=12;
                }
                break;
            case 28:
                {
                alt6=13;
                }
                break;
            case 15:
                {
                alt6=14;
                }
                break;
            case 29:
                {
                alt6=15;
                }
                break;
            case 14:
                {
                alt6=16;
                }
                break;
            case 30:
                {
                alt6=17;
                }
                break;
            case 31:
                {
                alt6=18;
                }
                break;
            case 32:
                {
                alt6=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTurtle.g:561:2: ( ( 'sh:minCount' ) )
                    {
                    // InternalTurtle.g:561:2: ( ( 'sh:minCount' ) )
                    // InternalTurtle.g:562:3: ( 'sh:minCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalTurtle.g:563:3: ( 'sh:minCount' )
                    // InternalTurtle.g:563:4: 'sh:minCount'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:567:2: ( ( 'sh:maxCount' ) )
                    {
                    // InternalTurtle.g:567:2: ( ( 'sh:maxCount' ) )
                    // InternalTurtle.g:568:3: ( 'sh:maxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalTurtle.g:569:3: ( 'sh:maxCount' )
                    // InternalTurtle.g:569:4: 'sh:maxCount'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:573:2: ( ( 'sh:and' ) )
                    {
                    // InternalTurtle.g:573:2: ( ( 'sh:and' ) )
                    // InternalTurtle.g:574:3: ( 'sh:and' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalTurtle.g:575:3: ( 'sh:and' )
                    // InternalTurtle.g:575:4: 'sh:and'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:579:2: ( ( 'sh:or' ) )
                    {
                    // InternalTurtle.g:579:2: ( ( 'sh:or' ) )
                    // InternalTurtle.g:580:3: ( 'sh:or' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalTurtle.g:581:3: ( 'sh:or' )
                    // InternalTurtle.g:581:4: 'sh:or'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:585:2: ( ( 'sh:not' ) )
                    {
                    // InternalTurtle.g:585:2: ( ( 'sh:not' ) )
                    // InternalTurtle.g:586:3: ( 'sh:not' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalTurtle.g:587:3: ( 'sh:not' )
                    // InternalTurtle.g:587:4: 'sh:not'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:591:2: ( ( 'sh:class' ) )
                    {
                    // InternalTurtle.g:591:2: ( ( 'sh:class' ) )
                    // InternalTurtle.g:592:3: ( 'sh:class' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 
                    // InternalTurtle.g:593:3: ( 'sh:class' )
                    // InternalTurtle.g:593:4: 'sh:class'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:597:2: ( ( 'sh:hasValue' ) )
                    {
                    // InternalTurtle.g:597:2: ( ( 'sh:hasValue' ) )
                    // InternalTurtle.g:598:3: ( 'sh:hasValue' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 
                    // InternalTurtle.g:599:3: ( 'sh:hasValue' )
                    // InternalTurtle.g:599:4: 'sh:hasValue'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:603:2: ( ( 'sh:nodeKind' ) )
                    {
                    // InternalTurtle.g:603:2: ( ( 'sh:nodeKind' ) )
                    // InternalTurtle.g:604:3: ( 'sh:nodeKind' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 
                    // InternalTurtle.g:605:3: ( 'sh:nodeKind' )
                    // InternalTurtle.g:605:4: 'sh:nodeKind'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:609:2: ( ( 'sh:node' ) )
                    {
                    // InternalTurtle.g:609:2: ( ( 'sh:node' ) )
                    // InternalTurtle.g:610:3: ( 'sh:node' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 
                    // InternalTurtle.g:611:3: ( 'sh:node' )
                    // InternalTurtle.g:611:4: 'sh:node'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:615:2: ( ( 'sh:datatype' ) )
                    {
                    // InternalTurtle.g:615:2: ( ( 'sh:datatype' ) )
                    // InternalTurtle.g:616:3: ( 'sh:datatype' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 
                    // InternalTurtle.g:617:3: ( 'sh:datatype' )
                    // InternalTurtle.g:617:4: 'sh:datatype'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:621:2: ( ( 'sh:pattern' ) )
                    {
                    // InternalTurtle.g:621:2: ( ( 'sh:pattern' ) )
                    // InternalTurtle.g:622:3: ( 'sh:pattern' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 
                    // InternalTurtle.g:623:3: ( 'sh:pattern' )
                    // InternalTurtle.g:623:4: 'sh:pattern'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:627:2: ( ( 'sh:closed' ) )
                    {
                    // InternalTurtle.g:627:2: ( ( 'sh:closed' ) )
                    // InternalTurtle.g:628:3: ( 'sh:closed' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 
                    // InternalTurtle.g:629:3: ( 'sh:closed' )
                    // InternalTurtle.g:629:4: 'sh:closed'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:633:2: ( ( 'sh:ignoredProperties' ) )
                    {
                    // InternalTurtle.g:633:2: ( ( 'sh:ignoredProperties' ) )
                    // InternalTurtle.g:634:3: ( 'sh:ignoredProperties' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 
                    // InternalTurtle.g:635:3: ( 'sh:ignoredProperties' )
                    // InternalTurtle.g:635:4: 'sh:ignoredProperties'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:639:2: ( ( 'sh:path' ) )
                    {
                    // InternalTurtle.g:639:2: ( ( 'sh:path' ) )
                    // InternalTurtle.g:640:3: ( 'sh:path' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 
                    // InternalTurtle.g:641:3: ( 'sh:path' )
                    // InternalTurtle.g:641:4: 'sh:path'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:645:2: ( ( 'sh:inversePath' ) )
                    {
                    // InternalTurtle.g:645:2: ( ( 'sh:inversePath' ) )
                    // InternalTurtle.g:646:3: ( 'sh:inversePath' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 
                    // InternalTurtle.g:647:3: ( 'sh:inversePath' )
                    // InternalTurtle.g:647:4: 'sh:inversePath'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:651:2: ( ( 'sh:property' ) )
                    {
                    // InternalTurtle.g:651:2: ( ( 'sh:property' ) )
                    // InternalTurtle.g:652:3: ( 'sh:property' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 
                    // InternalTurtle.g:653:3: ( 'sh:property' )
                    // InternalTurtle.g:653:4: 'sh:property'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:657:2: ( ( 'sh:name' ) )
                    {
                    // InternalTurtle.g:657:2: ( ( 'sh:name' ) )
                    // InternalTurtle.g:658:3: ( 'sh:name' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 
                    // InternalTurtle.g:659:3: ( 'sh:name' )
                    // InternalTurtle.g:659:4: 'sh:name'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:663:2: ( ( 'sh:targetClass' ) )
                    {
                    // InternalTurtle.g:663:2: ( ( 'sh:targetClass' ) )
                    // InternalTurtle.g:664:3: ( 'sh:targetClass' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 
                    // InternalTurtle.g:665:3: ( 'sh:targetClass' )
                    // InternalTurtle.g:665:4: 'sh:targetClass'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:669:2: ( ( 'sh:targetNode' ) )
                    {
                    // InternalTurtle.g:669:2: ( ( 'sh:targetNode' ) )
                    // InternalTurtle.g:670:3: ( 'sh:targetNode' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18()); 
                    // InternalTurtle.g:671:3: ( 'sh:targetNode' )
                    // InternalTurtle.g:671:4: 'sh:targetNode'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18()); 

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
    // InternalTurtle.g:679:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:683:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalTurtle.g:684:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalTurtle.g:691:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:695:1: ( ( () ) )
            // InternalTurtle.g:696:1: ( () )
            {
            // InternalTurtle.g:696:1: ( () )
            // InternalTurtle.g:697:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalTurtle.g:698:2: ()
            // InternalTurtle.g:698:3: 
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
    // InternalTurtle.g:706:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:710:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalTurtle.g:711:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalTurtle.g:718:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NamespacesAssignment_1 )* ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:722:1: ( ( ( rule__Graph__NamespacesAssignment_1 )* ) )
            // InternalTurtle.g:723:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            {
            // InternalTurtle.g:723:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            // InternalTurtle.g:724:2: ( rule__Graph__NamespacesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 
            // InternalTurtle.g:725:2: ( rule__Graph__NamespacesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTurtle.g:725:3: rule__Graph__NamespacesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Graph__NamespacesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTurtle.g:733:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:737:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalTurtle.g:738:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalTurtle.g:745:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__DataGraphAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:749:1: ( ( ( rule__Graph__DataGraphAssignment_2 ) ) )
            // InternalTurtle.g:750:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            {
            // InternalTurtle.g:750:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            // InternalTurtle.g:751:2: ( rule__Graph__DataGraphAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 
            // InternalTurtle.g:752:2: ( rule__Graph__DataGraphAssignment_2 )
            // InternalTurtle.g:752:3: rule__Graph__DataGraphAssignment_2
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
    // InternalTurtle.g:760:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:764:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalTurtle.g:765:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__4();

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
    // InternalTurtle.g:772:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__ShapesGraphAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:776:1: ( ( ( rule__Graph__ShapesGraphAssignment_3 ) ) )
            // InternalTurtle.g:777:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            {
            // InternalTurtle.g:777:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            // InternalTurtle.g:778:2: ( rule__Graph__ShapesGraphAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 
            // InternalTurtle.g:779:2: ( rule__Graph__ShapesGraphAssignment_3 )
            // InternalTurtle.g:779:3: rule__Graph__ShapesGraphAssignment_3
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


    // $ANTLR start "rule__Graph__Group__4"
    // InternalTurtle.g:787:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:791:1: ( rule__Graph__Group__4__Impl )
            // InternalTurtle.g:792:2: rule__Graph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__4__Impl();

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
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // InternalTurtle.g:798:1: rule__Graph__Group__4__Impl : ( '<>' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:802:1: ( ( '<>' ) )
            // InternalTurtle.g:803:1: ( '<>' )
            {
            // InternalTurtle.g:803:1: ( '<>' )
            // InternalTurtle.g:804:2: '<>'
            {
             before(grammarAccess.getGraphAccess().getLessThanSignGreaterThanSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getLessThanSignGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalTurtle.g:814:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:818:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTurtle.g:819:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
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
    // InternalTurtle.g:826:1: rule__Namespace__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:830:1: ( ( '@prefix' ) )
            // InternalTurtle.g:831:1: ( '@prefix' )
            {
            // InternalTurtle.g:831:1: ( '@prefix' )
            // InternalTurtle.g:832:2: '@prefix'
            {
             before(grammarAccess.getNamespaceAccess().getPrefixKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTurtle.g:841:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:845:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalTurtle.g:846:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
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
    // InternalTurtle.g:853:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__PrefixAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:857:1: ( ( ( rule__Namespace__PrefixAssignment_1 ) ) )
            // InternalTurtle.g:858:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            {
            // InternalTurtle.g:858:1: ( ( rule__Namespace__PrefixAssignment_1 ) )
            // InternalTurtle.g:859:2: ( rule__Namespace__PrefixAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getPrefixAssignment_1()); 
            // InternalTurtle.g:860:2: ( rule__Namespace__PrefixAssignment_1 )
            // InternalTurtle.g:860:3: rule__Namespace__PrefixAssignment_1
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
    // InternalTurtle.g:868:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:872:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalTurtle.g:873:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalTurtle.g:880:1: rule__Namespace__Group__2__Impl : ( '<' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:884:1: ( ( '<' ) )
            // InternalTurtle.g:885:1: ( '<' )
            {
            // InternalTurtle.g:885:1: ( '<' )
            // InternalTurtle.g:886:2: '<'
            {
             before(grammarAccess.getNamespaceAccess().getLessThanSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalTurtle.g:895:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:899:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // InternalTurtle.g:900:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Namespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__4();

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
    // InternalTurtle.g:907:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__NamespaceAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:911:1: ( ( ( rule__Namespace__NamespaceAssignment_3 ) ) )
            // InternalTurtle.g:912:1: ( ( rule__Namespace__NamespaceAssignment_3 ) )
            {
            // InternalTurtle.g:912:1: ( ( rule__Namespace__NamespaceAssignment_3 ) )
            // InternalTurtle.g:913:2: ( rule__Namespace__NamespaceAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceAssignment_3()); 
            // InternalTurtle.g:914:2: ( rule__Namespace__NamespaceAssignment_3 )
            // InternalTurtle.g:914:3: rule__Namespace__NamespaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__NamespaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNamespaceAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Namespace__Group__4"
    // InternalTurtle.g:922:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:926:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // InternalTurtle.g:927:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Namespace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__5();

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
    // $ANTLR end "rule__Namespace__Group__4"


    // $ANTLR start "rule__Namespace__Group__4__Impl"
    // InternalTurtle.g:934:1: rule__Namespace__Group__4__Impl : ( '>' ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:938:1: ( ( '>' ) )
            // InternalTurtle.g:939:1: ( '>' )
            {
            // InternalTurtle.g:939:1: ( '>' )
            // InternalTurtle.g:940:2: '>'
            {
             before(grammarAccess.getNamespaceAccess().getGreaterThanSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__5"
    // InternalTurtle.g:949:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:953:1: ( rule__Namespace__Group__5__Impl )
            // InternalTurtle.g:954:2: rule__Namespace__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__5__Impl();

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
    // $ANTLR end "rule__Namespace__Group__5"


    // $ANTLR start "rule__Namespace__Group__5__Impl"
    // InternalTurtle.g:960:1: rule__Namespace__Group__5__Impl : ( '.' ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:964:1: ( ( '.' ) )
            // InternalTurtle.g:965:1: ( '.' )
            {
            // InternalTurtle.g:965:1: ( '.' )
            // InternalTurtle.g:966:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5__Impl"


    // $ANTLR start "rule__DataGraph__Group__0"
    // InternalTurtle.g:976:1: rule__DataGraph__Group__0 : rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 ;
    public final void rule__DataGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:980:1: ( rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 )
            // InternalTurtle.g:981:2: rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1
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
    // InternalTurtle.g:988:1: rule__DataGraph__Group__0__Impl : ( () ) ;
    public final void rule__DataGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:992:1: ( ( () ) )
            // InternalTurtle.g:993:1: ( () )
            {
            // InternalTurtle.g:993:1: ( () )
            // InternalTurtle.g:994:2: ()
            {
             before(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 
            // InternalTurtle.g:995:2: ()
            // InternalTurtle.g:995:3: 
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
    // InternalTurtle.g:1003:1: rule__DataGraph__Group__1 : rule__DataGraph__Group__1__Impl ;
    public final void rule__DataGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1007:1: ( rule__DataGraph__Group__1__Impl )
            // InternalTurtle.g:1008:2: rule__DataGraph__Group__1__Impl
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
    // InternalTurtle.g:1014:1: rule__DataGraph__Group__1__Impl : ( ( rule__DataGraph__TriplesAssignment_1 )* ) ;
    public final void rule__DataGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1018:1: ( ( ( rule__DataGraph__TriplesAssignment_1 )* ) )
            // InternalTurtle.g:1019:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            {
            // InternalTurtle.g:1019:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            // InternalTurtle.g:1020:2: ( rule__DataGraph__TriplesAssignment_1 )*
            {
             before(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 
            // InternalTurtle.g:1021:2: ( rule__DataGraph__TriplesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_UNICODE) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_UNICODE) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==RULE_UNICODE) ) {
                            alt8=1;
                        }


                    }
                    else if ( (LA8_2==37) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalTurtle.g:1021:3: rule__DataGraph__TriplesAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataGraph__TriplesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTurtle.g:1030:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1034:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalTurtle.g:1035:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTurtle.g:1042:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1046:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalTurtle.g:1047:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalTurtle.g:1047:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalTurtle.g:1048:2: ( rule__Triples__SubjectAssignment_0 )
            {
             before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            // InternalTurtle.g:1049:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalTurtle.g:1049:3: rule__Triples__SubjectAssignment_0
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
    // InternalTurtle.g:1057:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl rule__Triples__Group__2 ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1061:1: ( rule__Triples__Group__1__Impl rule__Triples__Group__2 )
            // InternalTurtle.g:1062:2: rule__Triples__Group__1__Impl rule__Triples__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTurtle.g:1069:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateobjectAssignment_1 )* ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1073:1: ( ( ( rule__Triples__PredicateobjectAssignment_1 )* ) )
            // InternalTurtle.g:1074:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            {
            // InternalTurtle.g:1074:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            // InternalTurtle.g:1075:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 
            // InternalTurtle.g:1076:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_UNICODE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTurtle.g:1076:3: rule__Triples__PredicateobjectAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Triples__PredicateobjectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTurtle.g:1084:1: rule__Triples__Group__2 : rule__Triples__Group__2__Impl ;
    public final void rule__Triples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1088:1: ( rule__Triples__Group__2__Impl )
            // InternalTurtle.g:1089:2: rule__Triples__Group__2__Impl
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
    // InternalTurtle.g:1095:1: rule__Triples__Group__2__Impl : ( '.' ) ;
    public final void rule__Triples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1099:1: ( ( '.' ) )
            // InternalTurtle.g:1100:1: ( '.' )
            {
            // InternalTurtle.g:1100:1: ( '.' )
            // InternalTurtle.g:1101:2: '.'
            {
             before(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTurtle.g:1111:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1115:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalTurtle.g:1116:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
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
    // InternalTurtle.g:1123:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__Group_0__0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1127:1: ( ( ( rule__PredicateObject__Group_0__0 ) ) )
            // InternalTurtle.g:1128:1: ( ( rule__PredicateObject__Group_0__0 ) )
            {
            // InternalTurtle.g:1128:1: ( ( rule__PredicateObject__Group_0__0 ) )
            // InternalTurtle.g:1129:2: ( rule__PredicateObject__Group_0__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup_0()); 
            // InternalTurtle.g:1130:2: ( rule__PredicateObject__Group_0__0 )
            // InternalTurtle.g:1130:3: rule__PredicateObject__Group_0__0
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
    // InternalTurtle.g:1138:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1142:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalTurtle.g:1143:2: rule__PredicateObject__Group__1__Impl
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
    // InternalTurtle.g:1149:1: rule__PredicateObject__Group__1__Impl : ( ';' ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1153:1: ( ( ';' ) )
            // InternalTurtle.g:1154:1: ( ';' )
            {
            // InternalTurtle.g:1154:1: ( ';' )
            // InternalTurtle.g:1155:2: ';'
            {
             before(grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTurtle.g:1165:1: rule__PredicateObject__Group_0__0 : rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 ;
    public final void rule__PredicateObject__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1169:1: ( rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 )
            // InternalTurtle.g:1170:2: rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1
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
    // InternalTurtle.g:1177:1: rule__PredicateObject__Group_0__0__Impl : ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) ;
    public final void rule__PredicateObject__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1181:1: ( ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) )
            // InternalTurtle.g:1182:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            {
            // InternalTurtle.g:1182:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            // InternalTurtle.g:1183:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 
            // InternalTurtle.g:1184:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            // InternalTurtle.g:1184:3: rule__PredicateObject__PredicateAssignment_0_0
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
    // InternalTurtle.g:1192:1: rule__PredicateObject__Group_0__1 : rule__PredicateObject__Group_0__1__Impl ;
    public final void rule__PredicateObject__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1196:1: ( rule__PredicateObject__Group_0__1__Impl )
            // InternalTurtle.g:1197:2: rule__PredicateObject__Group_0__1__Impl
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
    // InternalTurtle.g:1203:1: rule__PredicateObject__Group_0__1__Impl : ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) ;
    public final void rule__PredicateObject__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1207:1: ( ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) )
            // InternalTurtle.g:1208:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            {
            // InternalTurtle.g:1208:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            // InternalTurtle.g:1209:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 
            // InternalTurtle.g:1210:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            // InternalTurtle.g:1210:3: rule__PredicateObject__ObjectAssignment_0_1
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
    // InternalTurtle.g:1219:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1223:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalTurtle.g:1224:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
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
    // InternalTurtle.g:1231:1: rule__Subject__Group__0__Impl : ( () ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1235:1: ( ( () ) )
            // InternalTurtle.g:1236:1: ( () )
            {
            // InternalTurtle.g:1236:1: ( () )
            // InternalTurtle.g:1237:2: ()
            {
             before(grammarAccess.getSubjectAccess().getSubjectAction_0()); 
            // InternalTurtle.g:1238:2: ()
            // InternalTurtle.g:1238:3: 
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
    // InternalTurtle.g:1246:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1250:1: ( rule__Subject__Group__1__Impl )
            // InternalTurtle.g:1251:2: rule__Subject__Group__1__Impl
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
    // InternalTurtle.g:1257:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1261:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalTurtle.g:1262:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1262:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalTurtle.g:1263:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1264:2: ( rule__Subject__NameAssignment_1 )
            // InternalTurtle.g:1264:3: rule__Subject__NameAssignment_1
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
    // InternalTurtle.g:1273:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1277:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalTurtle.g:1278:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
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
    // InternalTurtle.g:1285:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1289:1: ( ( () ) )
            // InternalTurtle.g:1290:1: ( () )
            {
            // InternalTurtle.g:1290:1: ( () )
            // InternalTurtle.g:1291:2: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicateAction_0()); 
            // InternalTurtle.g:1292:2: ()
            // InternalTurtle.g:1292:3: 
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
    // InternalTurtle.g:1300:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1304:1: ( rule__Predicate__Group__1__Impl )
            // InternalTurtle.g:1305:2: rule__Predicate__Group__1__Impl
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
    // InternalTurtle.g:1311:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1315:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalTurtle.g:1316:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1316:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalTurtle.g:1317:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1318:2: ( rule__Predicate__NameAssignment_1 )
            // InternalTurtle.g:1318:3: rule__Predicate__NameAssignment_1
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
    // InternalTurtle.g:1327:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1331:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalTurtle.g:1332:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalTurtle.g:1339:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1343:1: ( ( () ) )
            // InternalTurtle.g:1344:1: ( () )
            {
            // InternalTurtle.g:1344:1: ( () )
            // InternalTurtle.g:1345:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalTurtle.g:1346:2: ()
            // InternalTurtle.g:1346:3: 
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
    // InternalTurtle.g:1354:1: rule__Object__Group__1 : rule__Object__Group__1__Impl ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1358:1: ( rule__Object__Group__1__Impl )
            // InternalTurtle.g:1359:2: rule__Object__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__1__Impl();

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
    // InternalTurtle.g:1365:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1369:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalTurtle.g:1370:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1370:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalTurtle.g:1371:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1372:2: ( rule__Object__NameAssignment_1 )
            // InternalTurtle.g:1372:3: rule__Object__NameAssignment_1
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


    // $ANTLR start "rule__ShapesGraph__Group__0"
    // InternalTurtle.g:1381:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1385:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalTurtle.g:1386:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalTurtle.g:1393:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1397:1: ( ( () ) )
            // InternalTurtle.g:1398:1: ( () )
            {
            // InternalTurtle.g:1398:1: ( () )
            // InternalTurtle.g:1399:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalTurtle.g:1400:2: ()
            // InternalTurtle.g:1400:3: 
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
    // InternalTurtle.g:1408:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1412:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalTurtle.g:1413:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalTurtle.g:1419:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1423:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalTurtle.g:1424:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalTurtle.g:1424:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalTurtle.g:1425:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalTurtle.g:1426:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_UNICODE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTurtle.g:1426:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTurtle.g:1435:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1439:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalTurtle.g:1440:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalTurtle.g:1447:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1451:1: ( ( () ) )
            // InternalTurtle.g:1452:1: ( () )
            {
            // InternalTurtle.g:1452:1: ( () )
            // InternalTurtle.g:1453:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalTurtle.g:1454:2: ()
            // InternalTurtle.g:1454:3: 
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
    // InternalTurtle.g:1462:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1466:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalTurtle.g:1467:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalTurtle.g:1474:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1478:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalTurtle.g:1479:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalTurtle.g:1479:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalTurtle.g:1480:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalTurtle.g:1481:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalTurtle.g:1481:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalTurtle.g:1489:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1493:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalTurtle.g:1494:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:1501:1: rule__ShapeConstraint__Group__2__Impl : ( ( rule__ShapeConstraint__Alternatives_2 ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1505:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) )
            // InternalTurtle.g:1506:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            {
            // InternalTurtle.g:1506:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalTurtle.g:1507:2: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1508:2: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalTurtle.g:1508:3: rule__ShapeConstraint__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalTurtle.g:1516:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1520:1: ( rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 )
            // InternalTurtle.g:1521:2: rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ShapeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__4();

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
    // InternalTurtle.g:1528:1: rule__ShapeConstraint__Group__3__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1532:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* ) )
            // InternalTurtle.g:1533:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* )
            {
            // InternalTurtle.g:1533:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* )
            // InternalTurtle.g:1534:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )*
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 
            // InternalTurtle.g:1535:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTurtle.g:1535:3: rule__ShapeConstraint__ShapeExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ShapeConstraint__ShapeExpressionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeConstraint__Group__4"
    // InternalTurtle.g:1543:1: rule__ShapeConstraint__Group__4 : rule__ShapeConstraint__Group__4__Impl ;
    public final void rule__ShapeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1547:1: ( rule__ShapeConstraint__Group__4__Impl )
            // InternalTurtle.g:1548:2: rule__ShapeConstraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group__4__Impl();

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
    // $ANTLR end "rule__ShapeConstraint__Group__4"


    // $ANTLR start "rule__ShapeConstraint__Group__4__Impl"
    // InternalTurtle.g:1554:1: rule__ShapeConstraint__Group__4__Impl : ( '.' ) ;
    public final void rule__ShapeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1558:1: ( ( '.' ) )
            // InternalTurtle.g:1559:1: ( '.' )
            {
            // InternalTurtle.g:1559:1: ( '.' )
            // InternalTurtle.g:1560:2: '.'
            {
             before(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group__4__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__0"
    // InternalTurtle.g:1570:1: rule__ShapeConstraint__Group_2_0__0 : rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 ;
    public final void rule__ShapeConstraint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1574:1: ( rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 )
            // InternalTurtle.g:1575:2: rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__ShapeConstraint__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_0__1();

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
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__0"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__0__Impl"
    // InternalTurtle.g:1582:1: rule__ShapeConstraint__Group_2_0__0__Impl : ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) ) ;
    public final void rule__ShapeConstraint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1586:1: ( ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) ) )
            // InternalTurtle.g:1587:1: ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) )
            {
            // InternalTurtle.g:1587:1: ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) )
            // InternalTurtle.g:1588:2: ( rule__ShapeConstraint__Alternatives_2_0_0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2_0_0()); 
            // InternalTurtle.g:1589:2: ( rule__ShapeConstraint__Alternatives_2_0_0 )
            // InternalTurtle.g:1589:3: rule__ShapeConstraint__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstraintAccess().getAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__0__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__1"
    // InternalTurtle.g:1597:1: rule__ShapeConstraint__Group_2_0__1 : rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2 ;
    public final void rule__ShapeConstraint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1601:1: ( rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2 )
            // InternalTurtle.g:1602:2: rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2
            {
            pushFollow(FOLLOW_13);
            rule__ShapeConstraint__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_0__2();

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
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__1"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__1__Impl"
    // InternalTurtle.g:1609:1: rule__ShapeConstraint__Group_2_0__1__Impl : ( 'sh:NodeShape' ) ;
    public final void rule__ShapeConstraint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1613:1: ( ( 'sh:NodeShape' ) )
            // InternalTurtle.g:1614:1: ( 'sh:NodeShape' )
            {
            // InternalTurtle.g:1614:1: ( 'sh:NodeShape' )
            // InternalTurtle.g:1615:2: 'sh:NodeShape'
            {
             before(grammarAccess.getShapeConstraintAccess().getShNodeShapeKeyword_2_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getShNodeShapeKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__1__Impl"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__2"
    // InternalTurtle.g:1624:1: rule__ShapeConstraint__Group_2_0__2 : rule__ShapeConstraint__Group_2_0__2__Impl ;
    public final void rule__ShapeConstraint__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1628:1: ( rule__ShapeConstraint__Group_2_0__2__Impl )
            // InternalTurtle.g:1629:2: rule__ShapeConstraint__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstraint__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__2"


    // $ANTLR start "rule__ShapeConstraint__Group_2_0__2__Impl"
    // InternalTurtle.g:1635:1: rule__ShapeConstraint__Group_2_0__2__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1639:1: ( ( ';' ) )
            // InternalTurtle.g:1640:1: ( ';' )
            {
            // InternalTurtle.g:1640:1: ( ';' )
            // InternalTurtle.g:1641:2: ';'
            {
             before(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_0_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapeConstraintAccess().getSemicolonKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__Group_2_0__2__Impl"


    // $ANTLR start "rule__ShapeName__Group__0"
    // InternalTurtle.g:1651:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1655:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalTurtle.g:1656:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalTurtle.g:1663:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1667:1: ( ( () ) )
            // InternalTurtle.g:1668:1: ( () )
            {
            // InternalTurtle.g:1668:1: ( () )
            // InternalTurtle.g:1669:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalTurtle.g:1670:2: ()
            // InternalTurtle.g:1670:3: 
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
    // InternalTurtle.g:1678:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1682:1: ( rule__ShapeName__Group__1__Impl )
            // InternalTurtle.g:1683:2: rule__ShapeName__Group__1__Impl
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
    // InternalTurtle.g:1689:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1693:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalTurtle.g:1694:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1694:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalTurtle.g:1695:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1696:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalTurtle.g:1696:3: rule__ShapeName__NameAssignment_1
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
    // InternalTurtle.g:1705:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1709:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalTurtle.g:1710:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTurtle.g:1717:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1721:1: ( ( () ) )
            // InternalTurtle.g:1722:1: ( () )
            {
            // InternalTurtle.g:1722:1: ( () )
            // InternalTurtle.g:1723:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalTurtle.g:1724:2: ()
            // InternalTurtle.g:1724:3: 
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
    // InternalTurtle.g:1732:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1736:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalTurtle.g:1737:2: rule__ShapeExpression__Group_0__1__Impl
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
    // InternalTurtle.g:1743:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1747:1: ( ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) ) )
            // InternalTurtle.g:1748:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) )
            {
            // InternalTurtle.g:1748:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) )
            // InternalTurtle.g:1749:2: ( rule__ShapeExpression__PropertyValuesAssignment_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_0_1()); 
            // InternalTurtle.g:1750:2: ( rule__ShapeExpression__PropertyValuesAssignment_0_1 )
            // InternalTurtle.g:1750:3: rule__ShapeExpression__PropertyValuesAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__PropertyValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeExpression__Group_1__0"
    // InternalTurtle.g:1759:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1763:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalTurtle.g:1764:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:1771:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__Group_1_0__0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1775:1: ( ( ( rule__ShapeExpression__Group_1_0__0 ) ) )
            // InternalTurtle.g:1776:1: ( ( rule__ShapeExpression__Group_1_0__0 ) )
            {
            // InternalTurtle.g:1776:1: ( ( rule__ShapeExpression__Group_1_0__0 ) )
            // InternalTurtle.g:1777:2: ( rule__ShapeExpression__Group_1_0__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_0()); 
            // InternalTurtle.g:1778:2: ( rule__ShapeExpression__Group_1_0__0 )
            // InternalTurtle.g:1778:3: rule__ShapeExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_0()); 

            }


            }

        }
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
    // InternalTurtle.g:1786:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1790:1: ( rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 )
            // InternalTurtle.g:1791:2: rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:1798:1: rule__ShapeExpression__Group_1__1__Impl : ( ( rule__ShapeExpression__Group_1_1__0 )? ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1802:1: ( ( ( rule__ShapeExpression__Group_1_1__0 )? ) )
            // InternalTurtle.g:1803:1: ( ( rule__ShapeExpression__Group_1_1__0 )? )
            {
            // InternalTurtle.g:1803:1: ( ( rule__ShapeExpression__Group_1_1__0 )? )
            // InternalTurtle.g:1804:2: ( rule__ShapeExpression__Group_1_1__0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 
            // InternalTurtle.g:1805:2: ( rule__ShapeExpression__Group_1_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_UNICODE||LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTurtle.g:1805:3: rule__ShapeExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 

            }


            }

        }
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
    // InternalTurtle.g:1813:1: rule__ShapeExpression__Group_1__2 : rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 ;
    public final void rule__ShapeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1817:1: ( rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 )
            // InternalTurtle.g:1818:2: rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:1825:1: rule__ShapeExpression__Group_1__2__Impl : ( ( rule__ShapeExpression__Group_1_2__0 )? ) ;
    public final void rule__ShapeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1829:1: ( ( ( rule__ShapeExpression__Group_1_2__0 )? ) )
            // InternalTurtle.g:1830:1: ( ( rule__ShapeExpression__Group_1_2__0 )? )
            {
            // InternalTurtle.g:1830:1: ( ( rule__ShapeExpression__Group_1_2__0 )? )
            // InternalTurtle.g:1831:2: ( rule__ShapeExpression__Group_1_2__0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_2()); 
            // InternalTurtle.g:1832:2: ( rule__ShapeExpression__Group_1_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==40) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==15) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==40) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalTurtle.g:1832:3: rule__ShapeExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeExpression__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_2()); 

            }


            }

        }
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
    // InternalTurtle.g:1840:1: rule__ShapeExpression__Group_1__3 : rule__ShapeExpression__Group_1__3__Impl ;
    public final void rule__ShapeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1844:1: ( rule__ShapeExpression__Group_1__3__Impl )
            // InternalTurtle.g:1845:2: rule__ShapeExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1__3__Impl();

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
    // InternalTurtle.g:1851:1: rule__ShapeExpression__Group_1__3__Impl : ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) ) ;
    public final void rule__ShapeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1855:1: ( ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) ) )
            // InternalTurtle.g:1856:1: ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) )
            {
            // InternalTurtle.g:1856:1: ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) )
            // InternalTurtle.g:1857:2: ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* )
            {
            // InternalTurtle.g:1857:2: ( ( rule__ShapeExpression__Group_1_3__0 ) )
            // InternalTurtle.g:1858:3: ( rule__ShapeExpression__Group_1_3__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 
            // InternalTurtle.g:1859:3: ( rule__ShapeExpression__Group_1_3__0 )
            // InternalTurtle.g:1859:4: rule__ShapeExpression__Group_1_3__0
            {
            pushFollow(FOLLOW_20);
            rule__ShapeExpression__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 

            }

            // InternalTurtle.g:1862:2: ( ( rule__ShapeExpression__Group_1_3__0 )* )
            // InternalTurtle.g:1863:3: ( rule__ShapeExpression__Group_1_3__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 
            // InternalTurtle.g:1864:3: ( rule__ShapeExpression__Group_1_3__0 )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalTurtle.g:1864:4: rule__ShapeExpression__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ShapeExpression__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__ShapeExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_0__0"
    // InternalTurtle.g:1874:1: rule__ShapeExpression__Group_1_0__0 : rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 ;
    public final void rule__ShapeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1878:1: ( rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 )
            // InternalTurtle.g:1879:2: rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:1886:1: rule__ShapeExpression__Group_1_0__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1890:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) )
            // InternalTurtle.g:1891:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            {
            // InternalTurtle.g:1891:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            // InternalTurtle.g:1892:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0()); 
            // InternalTurtle.g:1893:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            // InternalTurtle.g:1893:3: rule__ShapeExpression__TypeAssignment_1_0_0
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
    // InternalTurtle.g:1901:1: rule__ShapeExpression__Group_1_0__1 : rule__ShapeExpression__Group_1_0__1__Impl ;
    public final void rule__ShapeExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1905:1: ( rule__ShapeExpression__Group_1_0__1__Impl )
            // InternalTurtle.g:1906:2: rule__ShapeExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_0__1__Impl();

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
    // InternalTurtle.g:1912:1: rule__ShapeExpression__Group_1_0__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1916:1: ( ( '[' ) )
            // InternalTurtle.g:1917:1: ( '[' )
            {
            // InternalTurtle.g:1917:1: ( '[' )
            // InternalTurtle.g:1918:2: '['
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeExpression__Group_1_1__0"
    // InternalTurtle.g:1928:1: rule__ShapeExpression__Group_1_1__0 : rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 ;
    public final void rule__ShapeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1932:1: ( rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 )
            // InternalTurtle.g:1933:2: rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTurtle.g:1940:1: rule__ShapeExpression__Group_1_1__0__Impl : ( ( rule__ShapeExpression__Alternatives_1_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1944:1: ( ( ( rule__ShapeExpression__Alternatives_1_1_0 ) ) )
            // InternalTurtle.g:1945:1: ( ( rule__ShapeExpression__Alternatives_1_1_0 ) )
            {
            // InternalTurtle.g:1945:1: ( ( rule__ShapeExpression__Alternatives_1_1_0 ) )
            // InternalTurtle.g:1946:2: ( rule__ShapeExpression__Alternatives_1_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_0()); 
            // InternalTurtle.g:1947:2: ( rule__ShapeExpression__Alternatives_1_1_0 )
            // InternalTurtle.g:1947:3: rule__ShapeExpression__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_0()); 

            }


            }

        }
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
    // InternalTurtle.g:1955:1: rule__ShapeExpression__Group_1_1__1 : rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 ;
    public final void rule__ShapeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1959:1: ( rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 )
            // InternalTurtle.g:1960:2: rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTurtle.g:1967:1: rule__ShapeExpression__Group_1_1__1__Impl : ( 'sh:NodeShape' ) ;
    public final void rule__ShapeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1971:1: ( ( 'sh:NodeShape' ) )
            // InternalTurtle.g:1972:1: ( 'sh:NodeShape' )
            {
            // InternalTurtle.g:1972:1: ( 'sh:NodeShape' )
            // InternalTurtle.g:1973:2: 'sh:NodeShape'
            {
             before(grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_1_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getShNodeShapeKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalTurtle.g:1982:1: rule__ShapeExpression__Group_1_1__2 : rule__ShapeExpression__Group_1_1__2__Impl ;
    public final void rule__ShapeExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1986:1: ( rule__ShapeExpression__Group_1_1__2__Impl )
            // InternalTurtle.g:1987:2: rule__ShapeExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_1__2__Impl();

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
    // InternalTurtle.g:1993:1: rule__ShapeExpression__Group_1_1__2__Impl : ( ';' ) ;
    public final void rule__ShapeExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1997:1: ( ( ';' ) )
            // InternalTurtle.g:1998:1: ( ';' )
            {
            // InternalTurtle.g:1998:1: ( ';' )
            // InternalTurtle.g:1999:2: ';'
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeExpression__Group_1_2__0"
    // InternalTurtle.g:2009:1: rule__ShapeExpression__Group_1_2__0 : rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 ;
    public final void rule__ShapeExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2013:1: ( rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 )
            // InternalTurtle.g:2014:2: rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:2021:1: rule__ShapeExpression__Group_1_2__0__Impl : ( ( rule__ShapeExpression__Alternatives_1_2_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2025:1: ( ( ( rule__ShapeExpression__Alternatives_1_2_0 ) ) )
            // InternalTurtle.g:2026:1: ( ( rule__ShapeExpression__Alternatives_1_2_0 ) )
            {
            // InternalTurtle.g:2026:1: ( ( rule__ShapeExpression__Alternatives_1_2_0 ) )
            // InternalTurtle.g:2027:2: ( rule__ShapeExpression__Alternatives_1_2_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_2_0()); 
            // InternalTurtle.g:2028:2: ( rule__ShapeExpression__Alternatives_1_2_0 )
            // InternalTurtle.g:2028:3: rule__ShapeExpression__Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getAlternatives_1_2_0()); 

            }


            }

        }
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
    // InternalTurtle.g:2036:1: rule__ShapeExpression__Group_1_2__1 : rule__ShapeExpression__Group_1_2__1__Impl ;
    public final void rule__ShapeExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2040:1: ( rule__ShapeExpression__Group_1_2__1__Impl )
            // InternalTurtle.g:2041:2: rule__ShapeExpression__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_2__1__Impl();

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
    // InternalTurtle.g:2047:1: rule__ShapeExpression__Group_1_2__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2051:1: ( ( '[' ) )
            // InternalTurtle.g:2052:1: ( '[' )
            {
            // InternalTurtle.g:2052:1: ( '[' )
            // InternalTurtle.g:2053:2: '['
            {
             before(grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1()); 
            match(input,40,FOLLOW_2); 
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


    // $ANTLR start "rule__ShapeExpression__Group_1_3__0"
    // InternalTurtle.g:2063:1: rule__ShapeExpression__Group_1_3__0 : rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1 ;
    public final void rule__ShapeExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2067:1: ( rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1 )
            // InternalTurtle.g:2068:2: rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_19);
            rule__ShapeExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_3__1();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_3__0"


    // $ANTLR start "rule__ShapeExpression__Group_1_3__0__Impl"
    // InternalTurtle.g:2075:1: rule__ShapeExpression__Group_1_3__0__Impl : ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* ) ;
    public final void rule__ShapeExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2079:1: ( ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* ) )
            // InternalTurtle.g:2080:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* )
            {
            // InternalTurtle.g:2080:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* )
            // InternalTurtle.g:2081:2: ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1_3_0()); 
            // InternalTurtle.g:2082:2: ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTurtle.g:2082:3: rule__ShapeExpression__PropertyValuesAssignment_1_3_0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ShapeExpression__PropertyValuesAssignment_1_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_3__1"
    // InternalTurtle.g:2090:1: rule__ShapeExpression__Group_1_3__1 : rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2 ;
    public final void rule__ShapeExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2094:1: ( rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2 )
            // InternalTurtle.g:2095:2: rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_13);
            rule__ShapeExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_3__2();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_3__1"


    // $ANTLR start "rule__ShapeExpression__Group_1_3__1__Impl"
    // InternalTurtle.g:2102:1: rule__ShapeExpression__Group_1_3__1__Impl : ( ']' ) ;
    public final void rule__ShapeExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2106:1: ( ( ']' ) )
            // InternalTurtle.g:2107:1: ( ']' )
            {
            // InternalTurtle.g:2107:1: ( ']' )
            // InternalTurtle.g:2108:2: ']'
            {
             before(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_3_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__ShapeExpression__Group_1_3__2"
    // InternalTurtle.g:2117:1: rule__ShapeExpression__Group_1_3__2 : rule__ShapeExpression__Group_1_3__2__Impl ;
    public final void rule__ShapeExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2121:1: ( rule__ShapeExpression__Group_1_3__2__Impl )
            // InternalTurtle.g:2122:2: rule__ShapeExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeExpression__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__ShapeExpression__Group_1_3__2"


    // $ANTLR start "rule__ShapeExpression__Group_1_3__2__Impl"
    // InternalTurtle.g:2128:1: rule__ShapeExpression__Group_1_3__2__Impl : ( ';' ) ;
    public final void rule__ShapeExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2132:1: ( ( ';' ) )
            // InternalTurtle.g:2133:1: ( ';' )
            {
            // InternalTurtle.g:2133:1: ( ';' )
            // InternalTurtle.g:2134:2: ';'
            {
             before(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_3_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__PropertyValues__Group__0"
    // InternalTurtle.g:2144:1: rule__PropertyValues__Group__0 : rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 ;
    public final void rule__PropertyValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2148:1: ( rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 )
            // InternalTurtle.g:2149:2: rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__PropertyValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__1();

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
    // $ANTLR end "rule__PropertyValues__Group__0"


    // $ANTLR start "rule__PropertyValues__Group__0__Impl"
    // InternalTurtle.g:2156:1: rule__PropertyValues__Group__0__Impl : ( ( rule__PropertyValues__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2160:1: ( ( ( rule__PropertyValues__PropertyAssignment_0 ) ) )
            // InternalTurtle.g:2161:1: ( ( rule__PropertyValues__PropertyAssignment_0 ) )
            {
            // InternalTurtle.g:2161:1: ( ( rule__PropertyValues__PropertyAssignment_0 ) )
            // InternalTurtle.g:2162:2: ( rule__PropertyValues__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0()); 
            // InternalTurtle.g:2163:2: ( rule__PropertyValues__PropertyAssignment_0 )
            // InternalTurtle.g:2163:3: rule__PropertyValues__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__0__Impl"


    // $ANTLR start "rule__PropertyValues__Group__1"
    // InternalTurtle.g:2171:1: rule__PropertyValues__Group__1 : rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 ;
    public final void rule__PropertyValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2175:1: ( rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 )
            // InternalTurtle.g:2176:2: rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__PropertyValues__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__2();

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
    // $ANTLR end "rule__PropertyValues__Group__1"


    // $ANTLR start "rule__PropertyValues__Group__1__Impl"
    // InternalTurtle.g:2183:1: rule__PropertyValues__Group__1__Impl : ( ( '(' )? ) ;
    public final void rule__PropertyValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2187:1: ( ( ( '(' )? ) )
            // InternalTurtle.g:2188:1: ( ( '(' )? )
            {
            // InternalTurtle.g:2188:1: ( ( '(' )? )
            // InternalTurtle.g:2189:2: ( '(' )?
            {
             before(grammarAccess.getPropertyValuesAccess().getLeftParenthesisKeyword_1()); 
            // InternalTurtle.g:2190:2: ( '(' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTurtle.g:2190:3: '('
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPropertyValuesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__1__Impl"


    // $ANTLR start "rule__PropertyValues__Group__2"
    // InternalTurtle.g:2198:1: rule__PropertyValues__Group__2 : rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 ;
    public final void rule__PropertyValues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2202:1: ( rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 )
            // InternalTurtle.g:2203:2: rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PropertyValues__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__3();

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
    // $ANTLR end "rule__PropertyValues__Group__2"


    // $ANTLR start "rule__PropertyValues__Group__2__Impl"
    // InternalTurtle.g:2210:1: rule__PropertyValues__Group__2__Impl : ( ( rule__PropertyValues__ValuesAssignment_2 )* ) ;
    public final void rule__PropertyValues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2214:1: ( ( ( rule__PropertyValues__ValuesAssignment_2 )* ) )
            // InternalTurtle.g:2215:1: ( ( rule__PropertyValues__ValuesAssignment_2 )* )
            {
            // InternalTurtle.g:2215:1: ( ( rule__PropertyValues__ValuesAssignment_2 )* )
            // InternalTurtle.g:2216:2: ( rule__PropertyValues__ValuesAssignment_2 )*
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_2()); 
            // InternalTurtle.g:2217:2: ( rule__PropertyValues__ValuesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_UNICODE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTurtle.g:2217:3: rule__PropertyValues__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PropertyValues__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPropertyValuesAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__2__Impl"


    // $ANTLR start "rule__PropertyValues__Group__3"
    // InternalTurtle.g:2225:1: rule__PropertyValues__Group__3 : rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 ;
    public final void rule__PropertyValues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2229:1: ( rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 )
            // InternalTurtle.g:2230:2: rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__PropertyValues__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__4();

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
    // $ANTLR end "rule__PropertyValues__Group__3"


    // $ANTLR start "rule__PropertyValues__Group__3__Impl"
    // InternalTurtle.g:2237:1: rule__PropertyValues__Group__3__Impl : ( ( ')' )? ) ;
    public final void rule__PropertyValues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2241:1: ( ( ( ')' )? ) )
            // InternalTurtle.g:2242:1: ( ( ')' )? )
            {
            // InternalTurtle.g:2242:1: ( ( ')' )? )
            // InternalTurtle.g:2243:2: ( ')' )?
            {
             before(grammarAccess.getPropertyValuesAccess().getRightParenthesisKeyword_3()); 
            // InternalTurtle.g:2244:2: ( ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTurtle.g:2244:3: ')'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPropertyValuesAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__3__Impl"


    // $ANTLR start "rule__PropertyValues__Group__4"
    // InternalTurtle.g:2252:1: rule__PropertyValues__Group__4 : rule__PropertyValues__Group__4__Impl ;
    public final void rule__PropertyValues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2256:1: ( rule__PropertyValues__Group__4__Impl )
            // InternalTurtle.g:2257:2: rule__PropertyValues__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValues__Group__4__Impl();

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
    // $ANTLR end "rule__PropertyValues__Group__4"


    // $ANTLR start "rule__PropertyValues__Group__4__Impl"
    // InternalTurtle.g:2263:1: rule__PropertyValues__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyValues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2267:1: ( ( ';' ) )
            // InternalTurtle.g:2268:1: ( ';' )
            {
            // InternalTurtle.g:2268:1: ( ';' )
            // InternalTurtle.g:2269:2: ';'
            {
             before(grammarAccess.getPropertyValuesAccess().getSemicolonKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPropertyValuesAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalTurtle.g:2279:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2283:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalTurtle.g:2284:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalTurtle.g:2291:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2295:1: ( ( () ) )
            // InternalTurtle.g:2296:1: ( () )
            {
            // InternalTurtle.g:2296:1: ( () )
            // InternalTurtle.g:2297:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalTurtle.g:2298:2: ()
            // InternalTurtle.g:2298:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalTurtle.g:2306:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2310:1: ( rule__Property__Group__1__Impl )
            // InternalTurtle.g:2311:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__1__Impl();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalTurtle.g:2317:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2321:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // InternalTurtle.g:2322:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // InternalTurtle.g:2322:1: ( ( rule__Property__TypeAssignment_1 ) )
            // InternalTurtle.g:2323:2: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // InternalTurtle.g:2324:2: ( rule__Property__TypeAssignment_1 )
            // InternalTurtle.g:2324:3: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalTurtle.g:2333:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2337:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalTurtle.g:2338:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalTurtle.g:2345:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2349:1: ( ( () ) )
            // InternalTurtle.g:2350:1: ( () )
            {
            // InternalTurtle.g:2350:1: ( () )
            // InternalTurtle.g:2351:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalTurtle.g:2352:2: ()
            // InternalTurtle.g:2352:3: 
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
    // InternalTurtle.g:2360:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2364:1: ( rule__Value__Group__1__Impl )
            // InternalTurtle.g:2365:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__1__Impl();

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
    // InternalTurtle.g:2371:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2375:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalTurtle.g:2376:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalTurtle.g:2376:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalTurtle.g:2377:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalTurtle.g:2378:2: ( rule__Value__NameAssignment_1 )
            // InternalTurtle.g:2378:3: rule__Value__NameAssignment_1
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


    // $ANTLR start "rule__Graph__NamespacesAssignment_1"
    // InternalTurtle.g:2387:1: rule__Graph__NamespacesAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Graph__NamespacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2391:1: ( ( ruleNamespace ) )
            // InternalTurtle.g:2392:2: ( ruleNamespace )
            {
            // InternalTurtle.g:2392:2: ( ruleNamespace )
            // InternalTurtle.g:2393:3: ruleNamespace
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
    // InternalTurtle.g:2402:1: rule__Graph__DataGraphAssignment_2 : ( ruleDataGraph ) ;
    public final void rule__Graph__DataGraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2406:1: ( ( ruleDataGraph ) )
            // InternalTurtle.g:2407:2: ( ruleDataGraph )
            {
            // InternalTurtle.g:2407:2: ( ruleDataGraph )
            // InternalTurtle.g:2408:3: ruleDataGraph
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
    // InternalTurtle.g:2417:1: rule__Graph__ShapesGraphAssignment_3 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2421:1: ( ( ruleShapesGraph ) )
            // InternalTurtle.g:2422:2: ( ruleShapesGraph )
            {
            // InternalTurtle.g:2422:2: ( ruleShapesGraph )
            // InternalTurtle.g:2423:3: ruleShapesGraph
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
    // InternalTurtle.g:2432:1: rule__Namespace__PrefixAssignment_1 : ( RULE_PREFIX ) ;
    public final void rule__Namespace__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2436:1: ( ( RULE_PREFIX ) )
            // InternalTurtle.g:2437:2: ( RULE_PREFIX )
            {
            // InternalTurtle.g:2437:2: ( RULE_PREFIX )
            // InternalTurtle.g:2438:3: RULE_PREFIX
            {
             before(grammarAccess.getNamespaceAccess().getPrefixPREFIXTerminalRuleCall_1_0()); 
            match(input,RULE_PREFIX,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getPrefixPREFIXTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Namespace__NamespaceAssignment_3"
    // InternalTurtle.g:2447:1: rule__Namespace__NamespaceAssignment_3 : ( RULE_UNICODE ) ;
    public final void rule__Namespace__NamespaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2451:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2452:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2452:2: ( RULE_UNICODE )
            // InternalTurtle.g:2453:3: RULE_UNICODE
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceUNICODETerminalRuleCall_3_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceUNICODETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NamespaceAssignment_3"


    // $ANTLR start "rule__DataGraph__TriplesAssignment_1"
    // InternalTurtle.g:2462:1: rule__DataGraph__TriplesAssignment_1 : ( ruleTriples ) ;
    public final void rule__DataGraph__TriplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2466:1: ( ( ruleTriples ) )
            // InternalTurtle.g:2467:2: ( ruleTriples )
            {
            // InternalTurtle.g:2467:2: ( ruleTriples )
            // InternalTurtle.g:2468:3: ruleTriples
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
    // InternalTurtle.g:2477:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2481:1: ( ( ruleSubject ) )
            // InternalTurtle.g:2482:2: ( ruleSubject )
            {
            // InternalTurtle.g:2482:2: ( ruleSubject )
            // InternalTurtle.g:2483:3: ruleSubject
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
    // InternalTurtle.g:2492:1: rule__Triples__PredicateobjectAssignment_1 : ( rulePredicateObject ) ;
    public final void rule__Triples__PredicateobjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2496:1: ( ( rulePredicateObject ) )
            // InternalTurtle.g:2497:2: ( rulePredicateObject )
            {
            // InternalTurtle.g:2497:2: ( rulePredicateObject )
            // InternalTurtle.g:2498:3: rulePredicateObject
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
    // InternalTurtle.g:2507:1: rule__PredicateObject__PredicateAssignment_0_0 : ( rulePredicate ) ;
    public final void rule__PredicateObject__PredicateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2511:1: ( ( rulePredicate ) )
            // InternalTurtle.g:2512:2: ( rulePredicate )
            {
            // InternalTurtle.g:2512:2: ( rulePredicate )
            // InternalTurtle.g:2513:3: rulePredicate
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
    // InternalTurtle.g:2522:1: rule__PredicateObject__ObjectAssignment_0_1 : ( ruleObject ) ;
    public final void rule__PredicateObject__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2526:1: ( ( ruleObject ) )
            // InternalTurtle.g:2527:2: ( ruleObject )
            {
            // InternalTurtle.g:2527:2: ( ruleObject )
            // InternalTurtle.g:2528:3: ruleObject
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
    // InternalTurtle.g:2537:1: rule__Subject__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2541:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2542:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2542:2: ( RULE_UNICODE )
            // InternalTurtle.g:2543:3: RULE_UNICODE
            {
             before(grammarAccess.getSubjectAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTurtle.g:2552:1: rule__Predicate__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2556:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2557:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2557:2: ( RULE_UNICODE )
            // InternalTurtle.g:2558:3: RULE_UNICODE
            {
             before(grammarAccess.getPredicateAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTurtle.g:2567:1: rule__Object__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2571:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2572:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2572:2: ( RULE_UNICODE )
            // InternalTurtle.g:2573:3: RULE_UNICODE
            {
             before(grammarAccess.getObjectAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapesGraph__ShapeConstraintsAssignment_1"
    // InternalTurtle.g:2582:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2586:1: ( ( ruleShapeConstraint ) )
            // InternalTurtle.g:2587:2: ( ruleShapeConstraint )
            {
            // InternalTurtle.g:2587:2: ( ruleShapeConstraint )
            // InternalTurtle.g:2588:3: ruleShapeConstraint
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
    // InternalTurtle.g:2597:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2601:1: ( ( ruleShapeName ) )
            // InternalTurtle.g:2602:2: ( ruleShapeName )
            {
            // InternalTurtle.g:2602:2: ( ruleShapeName )
            // InternalTurtle.g:2603:3: ruleShapeName
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


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1"
    // InternalTurtle.g:2612:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2616:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2617:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2617:2: ( ruleShapeExpression )
            // InternalTurtle.g:2618:3: ruleShapeExpression
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


    // $ANTLR start "rule__ShapeConstraint__ShapeExpressionsAssignment_3"
    // InternalTurtle.g:2627:1: rule__ShapeConstraint__ShapeExpressionsAssignment_3 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2631:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2632:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2632:2: ( ruleShapeExpression )
            // InternalTurtle.g:2633:3: ruleShapeExpression
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeExpression();

            state._fsp--;

             after(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstraint__ShapeExpressionsAssignment_3"


    // $ANTLR start "rule__ShapeName__NameAssignment_1"
    // InternalTurtle.g:2642:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2646:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2647:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2647:2: ( RULE_UNICODE )
            // InternalTurtle.g:2648:3: RULE_UNICODE
            {
             before(grammarAccess.getShapeNameAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getShapeNameAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeExpression__PropertyValuesAssignment_0_1"
    // InternalTurtle.g:2657:1: rule__ShapeExpression__PropertyValuesAssignment_0_1 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2661:1: ( ( rulePropertyValues ) )
            // InternalTurtle.g:2662:2: ( rulePropertyValues )
            {
            // InternalTurtle.g:2662:2: ( rulePropertyValues )
            // InternalTurtle.g:2663:3: rulePropertyValues
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValues();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__PropertyValuesAssignment_0_1"


    // $ANTLR start "rule__ShapeExpression__TypeAssignment_1_0_0"
    // InternalTurtle.g:2672:1: rule__ShapeExpression__TypeAssignment_1_0_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2676:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2677:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2677:2: ( rulePropertyType )
            // InternalTurtle.g:2678:3: rulePropertyType
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


    // $ANTLR start "rule__ShapeExpression__PropertyValuesAssignment_1_3_0"
    // InternalTurtle.g:2687:1: rule__ShapeExpression__PropertyValuesAssignment_1_3_0 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2691:1: ( ( rulePropertyValues ) )
            // InternalTurtle.g:2692:2: ( rulePropertyValues )
            {
            // InternalTurtle.g:2692:2: ( rulePropertyValues )
            // InternalTurtle.g:2693:3: rulePropertyValues
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValues();

            state._fsp--;

             after(grammarAccess.getShapeExpressionAccess().getPropertyValuesPropertyValuesParserRuleCall_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeExpression__PropertyValuesAssignment_1_3_0"


    // $ANTLR start "rule__PropertyValues__PropertyAssignment_0"
    // InternalTurtle.g:2702:1: rule__PropertyValues__PropertyAssignment_0 : ( ruleProperty ) ;
    public final void rule__PropertyValues__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2706:1: ( ( ruleProperty ) )
            // InternalTurtle.g:2707:2: ( ruleProperty )
            {
            // InternalTurtle.g:2707:2: ( ruleProperty )
            // InternalTurtle.g:2708:3: ruleProperty
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getPropertyPropertyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__PropertyAssignment_0"


    // $ANTLR start "rule__PropertyValues__ValuesAssignment_2"
    // InternalTurtle.g:2717:1: rule__PropertyValues__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2721:1: ( ( ruleValue ) )
            // InternalTurtle.g:2722:2: ( ruleValue )
            {
            // InternalTurtle.g:2722:2: ( ruleValue )
            // InternalTurtle.g:2723:3: ruleValue
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyValuesAccess().getValuesValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValues__ValuesAssignment_2"


    // $ANTLR start "rule__Property__TypeAssignment_1"
    // InternalTurtle.g:2732:1: rule__Property__TypeAssignment_1 : ( rulePropertyType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2736:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2737:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2737:2: ( rulePropertyType )
            // InternalTurtle.g:2738:3: rulePropertyType
            {
             before(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypePropertyTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_1"


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalTurtle.g:2747:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2751:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2752:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2752:2: ( RULE_UNICODE )
            // InternalTurtle.g:2753:3: RULE_UNICODE
            {
             before(grammarAccess.getValueAccess().getNameUNICODETerminalRuleCall_1_0()); 
            match(input,RULE_UNICODE,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getNameUNICODETerminalRuleCall_1_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\16\23\4\2\uffff";
    static final String dfa_3s = "\1\40\23\53\2\uffff";
    static final String dfa_4s = "\24\uffff\1\2\1\1";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "\1\25\41\uffff\1\25\1\uffff\1\24\1\uffff\2\25",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "493:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\1\31\uffff";
    static final String dfa_9s = "\1\16\1\uffff\23\4\1\uffff\2\4\1\46\1\16";
    static final String dfa_10s = "\1\51\1\uffff\23\53\1\uffff\2\53\1\46\1\51";
    static final String dfa_11s = "\1\uffff\1\2\23\uffff\1\1\4\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\21\1\17\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\22\1\23\1\24\4\uffff\1\1\3\uffff\1\25",
            "",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "\1\27\41\uffff\1\31\1\uffff\1\1\1\uffff\1\26\1\30",
            "",
            "\1\27\41\uffff\1\31\4\uffff\1\30",
            "\1\27\41\uffff\1\31\4\uffff\1\30",
            "\1\31",
            "\1\21\1\17\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\22\1\23\1\24\4\uffff\1\1\3\uffff\1\25"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1864:3: ( rule__ShapeExpression__Group_1_3__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FFFFE010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000021FFFFE010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FFFFE012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001FFFFC000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000201FFFFE010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000201FFFFE012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001FFFFC002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C4000000010L});

}