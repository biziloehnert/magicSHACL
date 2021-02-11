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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNICODE", "RULE_STRING", "RULE_ID", "RULE_PREFIX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'sh:property'", "'sh:path'", "'sh:minCount'", "'sh:maxCount'", "'sh:and'", "'sh:or'", "'sh:not'", "'sh:class'", "'sh:hasValue'", "'sh:nodeKind'", "'sh:node'", "'sh:datatype'", "'sh:pattern'", "'sh:closed'", "'sh:ignoredProperties'", "'sh:inversePath'", "'sh:name'", "'sh:targetClass'", "'sh:targetNode'", "'<>'", "'.'", "'@prefix'", "'<'", "'>'", "';'", "'sh:NodeShape'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_PREFIX=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int RULE_UNICODE=4;
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
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleEString"
    // InternalTurtle.g:436:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTurtle.g:437:1: ( ruleEString EOF )
            // InternalTurtle.g:438:1: ruleEString EOF
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
    // InternalTurtle.g:445:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:449:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTurtle.g:450:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTurtle.g:450:2: ( ( rule__EString__Alternatives ) )
            // InternalTurtle.g:451:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTurtle.g:452:3: ( rule__EString__Alternatives )
            // InternalTurtle.g:452:4: rule__EString__Alternatives
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
    // InternalTurtle.g:461:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:465:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalTurtle.g:466:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalTurtle.g:466:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalTurtle.g:467:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalTurtle.g:468:3: ( rule__PropertyType__Alternatives )
            // InternalTurtle.g:468:4: rule__PropertyType__Alternatives
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
    // InternalTurtle.g:476:1: rule__ShapeConstraint__Alternatives_2 : ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) );
    public final void rule__ShapeConstraint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:480:1: ( ( ( rule__ShapeConstraint__Group_2_0__0 ) ) | ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) ) )
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
                    // InternalTurtle.g:481:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    {
                    // InternalTurtle.g:481:2: ( ( rule__ShapeConstraint__Group_2_0__0 ) )
                    // InternalTurtle.g:482:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getGroup_2_0()); 
                    // InternalTurtle.g:483:3: ( rule__ShapeConstraint__Group_2_0__0 )
                    // InternalTurtle.g:483:4: rule__ShapeConstraint__Group_2_0__0
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
                    // InternalTurtle.g:487:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    {
                    // InternalTurtle.g:487:2: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 ) )
                    // InternalTurtle.g:488:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    {
                     before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1()); 
                    // InternalTurtle.g:489:3: ( rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 )
                    // InternalTurtle.g:489:4: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1
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
    // InternalTurtle.g:497:1: rule__ShapeConstraint__Alternatives_2_0_0 : ( ( RULE_UNICODE ) | ( 'a' ) );
    public final void rule__ShapeConstraint__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:501:1: ( ( RULE_UNICODE ) | ( 'a' ) )
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
                    // InternalTurtle.g:502:2: ( RULE_UNICODE )
                    {
                    // InternalTurtle.g:502:2: ( RULE_UNICODE )
                    // InternalTurtle.g:503:3: RULE_UNICODE
                    {
                     before(grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_UNICODE,FOLLOW_2); 
                     after(grammarAccess.getShapeConstraintAccess().getUNICODETerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:508:2: ( 'a' )
                    {
                    // InternalTurtle.g:508:2: ( 'a' )
                    // InternalTurtle.g:509:3: 'a'
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
    // InternalTurtle.g:518:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );
    public final void rule__ShapeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:522:1: ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalTurtle.g:523:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    {
                    // InternalTurtle.g:523:2: ( ( rule__ShapeExpression__Group_0__0 ) )
                    // InternalTurtle.g:524:3: ( rule__ShapeExpression__Group_0__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_0()); 
                    // InternalTurtle.g:525:3: ( rule__ShapeExpression__Group_0__0 )
                    // InternalTurtle.g:525:4: rule__ShapeExpression__Group_0__0
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
                    // InternalTurtle.g:529:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    {
                    // InternalTurtle.g:529:2: ( ( rule__ShapeExpression__Group_1__0 ) )
                    // InternalTurtle.g:530:3: ( rule__ShapeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getShapeExpressionAccess().getGroup_1()); 
                    // InternalTurtle.g:531:3: ( rule__ShapeExpression__Group_1__0 )
                    // InternalTurtle.g:531:4: rule__ShapeExpression__Group_1__0
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
    // InternalTurtle.g:539:1: rule__ShapeExpression__Alternatives_1_1_0 : ( ( RULE_UNICODE ) | ( 'a' ) );
    public final void rule__ShapeExpression__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:543:1: ( ( RULE_UNICODE ) | ( 'a' ) )
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
                    // InternalTurtle.g:544:2: ( RULE_UNICODE )
                    {
                    // InternalTurtle.g:544:2: ( RULE_UNICODE )
                    // InternalTurtle.g:545:3: RULE_UNICODE
                    {
                     before(grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_UNICODE,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getUNICODETerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:550:2: ( 'a' )
                    {
                    // InternalTurtle.g:550:2: ( 'a' )
                    // InternalTurtle.g:551:3: 'a'
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
    // InternalTurtle.g:560:1: rule__ShapeExpression__Alternatives_1_2_0 : ( ( 'sh:property' ) | ( 'sh:path' ) );
    public final void rule__ShapeExpression__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:564:1: ( ( 'sh:property' ) | ( 'sh:path' ) )
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
                    // InternalTurtle.g:565:2: ( 'sh:property' )
                    {
                    // InternalTurtle.g:565:2: ( 'sh:property' )
                    // InternalTurtle.g:566:3: 'sh:property'
                    {
                     before(grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getShapeExpressionAccess().getShPropertyKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:571:2: ( 'sh:path' )
                    {
                    // InternalTurtle.g:571:2: ( 'sh:path' )
                    // InternalTurtle.g:572:3: 'sh:path'
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTurtle.g:581:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:585:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTurtle.g:586:2: ( RULE_STRING )
                    {
                    // InternalTurtle.g:586:2: ( RULE_STRING )
                    // InternalTurtle.g:587:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:592:2: ( RULE_ID )
                    {
                    // InternalTurtle.g:592:2: ( RULE_ID )
                    // InternalTurtle.g:593:3: RULE_ID
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
    // InternalTurtle.g:602:1: rule__PropertyType__Alternatives : ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:606:1: ( ( ( 'sh:minCount' ) ) | ( ( 'sh:maxCount' ) ) | ( ( 'sh:and' ) ) | ( ( 'sh:or' ) ) | ( ( 'sh:not' ) ) | ( ( 'sh:class' ) ) | ( ( 'sh:hasValue' ) ) | ( ( 'sh:nodeKind' ) ) | ( ( 'sh:node' ) ) | ( ( 'sh:datatype' ) ) | ( ( 'sh:pattern' ) ) | ( ( 'sh:closed' ) ) | ( ( 'sh:ignoredProperties' ) ) | ( ( 'sh:path' ) ) | ( ( 'sh:inversePath' ) ) | ( ( 'sh:property' ) ) | ( ( 'sh:name' ) ) | ( ( 'sh:targetClass' ) ) | ( ( 'sh:targetNode' ) ) )
            int alt7=19;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            case 28:
                {
                alt7=13;
                }
                break;
            case 15:
                {
                alt7=14;
                }
                break;
            case 29:
                {
                alt7=15;
                }
                break;
            case 14:
                {
                alt7=16;
                }
                break;
            case 30:
                {
                alt7=17;
                }
                break;
            case 31:
                {
                alt7=18;
                }
                break;
            case 32:
                {
                alt7=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTurtle.g:607:2: ( ( 'sh:minCount' ) )
                    {
                    // InternalTurtle.g:607:2: ( ( 'sh:minCount' ) )
                    // InternalTurtle.g:608:3: ( 'sh:minCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 
                    // InternalTurtle.g:609:3: ( 'sh:minCount' )
                    // InternalTurtle.g:609:4: 'sh:minCount'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTurtle.g:613:2: ( ( 'sh:maxCount' ) )
                    {
                    // InternalTurtle.g:613:2: ( ( 'sh:maxCount' ) )
                    // InternalTurtle.g:614:3: ( 'sh:maxCount' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 
                    // InternalTurtle.g:615:3: ( 'sh:maxCount' )
                    // InternalTurtle.g:615:4: 'sh:maxCount'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTurtle.g:619:2: ( ( 'sh:and' ) )
                    {
                    // InternalTurtle.g:619:2: ( ( 'sh:and' ) )
                    // InternalTurtle.g:620:3: ( 'sh:and' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 
                    // InternalTurtle.g:621:3: ( 'sh:and' )
                    // InternalTurtle.g:621:4: 'sh:and'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTurtle.g:625:2: ( ( 'sh:or' ) )
                    {
                    // InternalTurtle.g:625:2: ( ( 'sh:or' ) )
                    // InternalTurtle.g:626:3: ( 'sh:or' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 
                    // InternalTurtle.g:627:3: ( 'sh:or' )
                    // InternalTurtle.g:627:4: 'sh:or'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTurtle.g:631:2: ( ( 'sh:not' ) )
                    {
                    // InternalTurtle.g:631:2: ( ( 'sh:not' ) )
                    // InternalTurtle.g:632:3: ( 'sh:not' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 
                    // InternalTurtle.g:633:3: ( 'sh:not' )
                    // InternalTurtle.g:633:4: 'sh:not'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTurtle.g:637:2: ( ( 'sh:class' ) )
                    {
                    // InternalTurtle.g:637:2: ( ( 'sh:class' ) )
                    // InternalTurtle.g:638:3: ( 'sh:class' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 
                    // InternalTurtle.g:639:3: ( 'sh:class' )
                    // InternalTurtle.g:639:4: 'sh:class'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTurtle.g:643:2: ( ( 'sh:hasValue' ) )
                    {
                    // InternalTurtle.g:643:2: ( ( 'sh:hasValue' ) )
                    // InternalTurtle.g:644:3: ( 'sh:hasValue' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 
                    // InternalTurtle.g:645:3: ( 'sh:hasValue' )
                    // InternalTurtle.g:645:4: 'sh:hasValue'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTurtle.g:649:2: ( ( 'sh:nodeKind' ) )
                    {
                    // InternalTurtle.g:649:2: ( ( 'sh:nodeKind' ) )
                    // InternalTurtle.g:650:3: ( 'sh:nodeKind' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 
                    // InternalTurtle.g:651:3: ( 'sh:nodeKind' )
                    // InternalTurtle.g:651:4: 'sh:nodeKind'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTurtle.g:655:2: ( ( 'sh:node' ) )
                    {
                    // InternalTurtle.g:655:2: ( ( 'sh:node' ) )
                    // InternalTurtle.g:656:3: ( 'sh:node' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 
                    // InternalTurtle.g:657:3: ( 'sh:node' )
                    // InternalTurtle.g:657:4: 'sh:node'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTurtle.g:661:2: ( ( 'sh:datatype' ) )
                    {
                    // InternalTurtle.g:661:2: ( ( 'sh:datatype' ) )
                    // InternalTurtle.g:662:3: ( 'sh:datatype' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 
                    // InternalTurtle.g:663:3: ( 'sh:datatype' )
                    // InternalTurtle.g:663:4: 'sh:datatype'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTurtle.g:667:2: ( ( 'sh:pattern' ) )
                    {
                    // InternalTurtle.g:667:2: ( ( 'sh:pattern' ) )
                    // InternalTurtle.g:668:3: ( 'sh:pattern' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 
                    // InternalTurtle.g:669:3: ( 'sh:pattern' )
                    // InternalTurtle.g:669:4: 'sh:pattern'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTurtle.g:673:2: ( ( 'sh:closed' ) )
                    {
                    // InternalTurtle.g:673:2: ( ( 'sh:closed' ) )
                    // InternalTurtle.g:674:3: ( 'sh:closed' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 
                    // InternalTurtle.g:675:3: ( 'sh:closed' )
                    // InternalTurtle.g:675:4: 'sh:closed'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTurtle.g:679:2: ( ( 'sh:ignoredProperties' ) )
                    {
                    // InternalTurtle.g:679:2: ( ( 'sh:ignoredProperties' ) )
                    // InternalTurtle.g:680:3: ( 'sh:ignoredProperties' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 
                    // InternalTurtle.g:681:3: ( 'sh:ignoredProperties' )
                    // InternalTurtle.g:681:4: 'sh:ignoredProperties'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTurtle.g:685:2: ( ( 'sh:path' ) )
                    {
                    // InternalTurtle.g:685:2: ( ( 'sh:path' ) )
                    // InternalTurtle.g:686:3: ( 'sh:path' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 
                    // InternalTurtle.g:687:3: ( 'sh:path' )
                    // InternalTurtle.g:687:4: 'sh:path'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTurtle.g:691:2: ( ( 'sh:inversePath' ) )
                    {
                    // InternalTurtle.g:691:2: ( ( 'sh:inversePath' ) )
                    // InternalTurtle.g:692:3: ( 'sh:inversePath' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 
                    // InternalTurtle.g:693:3: ( 'sh:inversePath' )
                    // InternalTurtle.g:693:4: 'sh:inversePath'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTurtle.g:697:2: ( ( 'sh:property' ) )
                    {
                    // InternalTurtle.g:697:2: ( ( 'sh:property' ) )
                    // InternalTurtle.g:698:3: ( 'sh:property' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 
                    // InternalTurtle.g:699:3: ( 'sh:property' )
                    // InternalTurtle.g:699:4: 'sh:property'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTurtle.g:703:2: ( ( 'sh:name' ) )
                    {
                    // InternalTurtle.g:703:2: ( ( 'sh:name' ) )
                    // InternalTurtle.g:704:3: ( 'sh:name' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 
                    // InternalTurtle.g:705:3: ( 'sh:name' )
                    // InternalTurtle.g:705:4: 'sh:name'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTurtle.g:709:2: ( ( 'sh:targetClass' ) )
                    {
                    // InternalTurtle.g:709:2: ( ( 'sh:targetClass' ) )
                    // InternalTurtle.g:710:3: ( 'sh:targetClass' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 
                    // InternalTurtle.g:711:3: ( 'sh:targetClass' )
                    // InternalTurtle.g:711:4: 'sh:targetClass'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTargetClassEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTurtle.g:715:2: ( ( 'sh:targetNode' ) )
                    {
                    // InternalTurtle.g:715:2: ( ( 'sh:targetNode' ) )
                    // InternalTurtle.g:716:3: ( 'sh:targetNode' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTargetNodeEnumLiteralDeclaration_18()); 
                    // InternalTurtle.g:717:3: ( 'sh:targetNode' )
                    // InternalTurtle.g:717:4: 'sh:targetNode'
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
    // InternalTurtle.g:725:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:729:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalTurtle.g:730:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalTurtle.g:737:1: rule__Graph__Group__0__Impl : ( () ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:741:1: ( ( () ) )
            // InternalTurtle.g:742:1: ( () )
            {
            // InternalTurtle.g:742:1: ( () )
            // InternalTurtle.g:743:2: ()
            {
             before(grammarAccess.getGraphAccess().getGraphAction_0()); 
            // InternalTurtle.g:744:2: ()
            // InternalTurtle.g:744:3: 
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
    // InternalTurtle.g:752:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:756:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalTurtle.g:757:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalTurtle.g:764:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NamespacesAssignment_1 )* ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:768:1: ( ( ( rule__Graph__NamespacesAssignment_1 )* ) )
            // InternalTurtle.g:769:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            {
            // InternalTurtle.g:769:1: ( ( rule__Graph__NamespacesAssignment_1 )* )
            // InternalTurtle.g:770:2: ( rule__Graph__NamespacesAssignment_1 )*
            {
             before(grammarAccess.getGraphAccess().getNamespacesAssignment_1()); 
            // InternalTurtle.g:771:2: ( rule__Graph__NamespacesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTurtle.g:771:3: rule__Graph__NamespacesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Graph__NamespacesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTurtle.g:779:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:783:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalTurtle.g:784:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalTurtle.g:791:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__DataGraphAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:795:1: ( ( ( rule__Graph__DataGraphAssignment_2 ) ) )
            // InternalTurtle.g:796:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            {
            // InternalTurtle.g:796:1: ( ( rule__Graph__DataGraphAssignment_2 ) )
            // InternalTurtle.g:797:2: ( rule__Graph__DataGraphAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getDataGraphAssignment_2()); 
            // InternalTurtle.g:798:2: ( rule__Graph__DataGraphAssignment_2 )
            // InternalTurtle.g:798:3: rule__Graph__DataGraphAssignment_2
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
    // InternalTurtle.g:806:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:810:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalTurtle.g:811:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
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
    // InternalTurtle.g:818:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__ShapesGraphAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:822:1: ( ( ( rule__Graph__ShapesGraphAssignment_3 ) ) )
            // InternalTurtle.g:823:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            {
            // InternalTurtle.g:823:1: ( ( rule__Graph__ShapesGraphAssignment_3 ) )
            // InternalTurtle.g:824:2: ( rule__Graph__ShapesGraphAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getShapesGraphAssignment_3()); 
            // InternalTurtle.g:825:2: ( rule__Graph__ShapesGraphAssignment_3 )
            // InternalTurtle.g:825:3: rule__Graph__ShapesGraphAssignment_3
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
    // InternalTurtle.g:833:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl rule__Graph__Group__5 ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:837:1: ( rule__Graph__Group__4__Impl rule__Graph__Group__5 )
            // InternalTurtle.g:838:2: rule__Graph__Group__4__Impl rule__Graph__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Graph__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__5();

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
    // InternalTurtle.g:845:1: rule__Graph__Group__4__Impl : ( '<>' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:849:1: ( ( '<>' ) )
            // InternalTurtle.g:850:1: ( '<>' )
            {
            // InternalTurtle.g:850:1: ( '<>' )
            // InternalTurtle.g:851:2: '<>'
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


    // $ANTLR start "rule__Graph__Group__5"
    // InternalTurtle.g:860:1: rule__Graph__Group__5 : rule__Graph__Group__5__Impl ;
    public final void rule__Graph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:864:1: ( rule__Graph__Group__5__Impl )
            // InternalTurtle.g:865:2: rule__Graph__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__5__Impl();

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
    // $ANTLR end "rule__Graph__Group__5"


    // $ANTLR start "rule__Graph__Group__5__Impl"
    // InternalTurtle.g:871:1: rule__Graph__Group__5__Impl : ( ( rule__Graph__Group_5__0 )? ) ;
    public final void rule__Graph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:875:1: ( ( ( rule__Graph__Group_5__0 )? ) )
            // InternalTurtle.g:876:1: ( ( rule__Graph__Group_5__0 )? )
            {
            // InternalTurtle.g:876:1: ( ( rule__Graph__Group_5__0 )? )
            // InternalTurtle.g:877:2: ( rule__Graph__Group_5__0 )?
            {
             before(grammarAccess.getGraphAccess().getGroup_5()); 
            // InternalTurtle.g:878:2: ( rule__Graph__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTurtle.g:878:3: rule__Graph__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Graph__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5__Impl"


    // $ANTLR start "rule__Graph__Group_5__0"
    // InternalTurtle.g:887:1: rule__Graph__Group_5__0 : rule__Graph__Group_5__0__Impl rule__Graph__Group_5__1 ;
    public final void rule__Graph__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:891:1: ( rule__Graph__Group_5__0__Impl rule__Graph__Group_5__1 )
            // InternalTurtle.g:892:2: rule__Graph__Group_5__0__Impl rule__Graph__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Graph__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_5__1();

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
    // $ANTLR end "rule__Graph__Group_5__0"


    // $ANTLR start "rule__Graph__Group_5__0__Impl"
    // InternalTurtle.g:899:1: rule__Graph__Group_5__0__Impl : ( ( ruleEString )* ) ;
    public final void rule__Graph__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:903:1: ( ( ( ruleEString )* ) )
            // InternalTurtle.g:904:1: ( ( ruleEString )* )
            {
            // InternalTurtle.g:904:1: ( ( ruleEString )* )
            // InternalTurtle.g:905:2: ( ruleEString )*
            {
             before(grammarAccess.getGraphAccess().getEStringParserRuleCall_5_0()); 
            // InternalTurtle.g:906:2: ( ruleEString )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTurtle.g:906:3: ruleEString
            	    {
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_5__0__Impl"


    // $ANTLR start "rule__Graph__Group_5__1"
    // InternalTurtle.g:914:1: rule__Graph__Group_5__1 : rule__Graph__Group_5__1__Impl ;
    public final void rule__Graph__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:918:1: ( rule__Graph__Group_5__1__Impl )
            // InternalTurtle.g:919:2: rule__Graph__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_5__1__Impl();

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
    // $ANTLR end "rule__Graph__Group_5__1"


    // $ANTLR start "rule__Graph__Group_5__1__Impl"
    // InternalTurtle.g:925:1: rule__Graph__Group_5__1__Impl : ( '.' ) ;
    public final void rule__Graph__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:929:1: ( ( '.' ) )
            // InternalTurtle.g:930:1: ( '.' )
            {
            // InternalTurtle.g:930:1: ( '.' )
            // InternalTurtle.g:931:2: '.'
            {
             before(grammarAccess.getGraphAccess().getFullStopKeyword_5_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getFullStopKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_5__1__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalTurtle.g:941:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:945:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTurtle.g:946:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_9);
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
            match(input,35,FOLLOW_2); 
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
            pushFollow(FOLLOW_10);
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
    // InternalTurtle.g:1007:1: rule__Namespace__Group__2__Impl : ( '<' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1011:1: ( ( '<' ) )
            // InternalTurtle.g:1012:1: ( '<' )
            {
            // InternalTurtle.g:1012:1: ( '<' )
            // InternalTurtle.g:1013:2: '<'
            {
             before(grammarAccess.getNamespaceAccess().getLessThanSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTurtle.g:1022:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1026:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // InternalTurtle.g:1027:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalTurtle.g:1034:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__NamespaceAssignment_3 ) ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1038:1: ( ( ( rule__Namespace__NamespaceAssignment_3 ) ) )
            // InternalTurtle.g:1039:1: ( ( rule__Namespace__NamespaceAssignment_3 ) )
            {
            // InternalTurtle.g:1039:1: ( ( rule__Namespace__NamespaceAssignment_3 ) )
            // InternalTurtle.g:1040:2: ( rule__Namespace__NamespaceAssignment_3 )
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceAssignment_3()); 
            // InternalTurtle.g:1041:2: ( rule__Namespace__NamespaceAssignment_3 )
            // InternalTurtle.g:1041:3: rule__Namespace__NamespaceAssignment_3
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
    // InternalTurtle.g:1049:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1053:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // InternalTurtle.g:1054:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalTurtle.g:1061:1: rule__Namespace__Group__4__Impl : ( '>' ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1065:1: ( ( '>' ) )
            // InternalTurtle.g:1066:1: ( '>' )
            {
            // InternalTurtle.g:1066:1: ( '>' )
            // InternalTurtle.g:1067:2: '>'
            {
             before(grammarAccess.getNamespaceAccess().getGreaterThanSignKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTurtle.g:1076:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1080:1: ( rule__Namespace__Group__5__Impl )
            // InternalTurtle.g:1081:2: rule__Namespace__Group__5__Impl
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
    // InternalTurtle.g:1087:1: rule__Namespace__Group__5__Impl : ( '.' ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1091:1: ( ( '.' ) )
            // InternalTurtle.g:1092:1: ( '.' )
            {
            // InternalTurtle.g:1092:1: ( '.' )
            // InternalTurtle.g:1093:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTurtle.g:1103:1: rule__DataGraph__Group__0 : rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 ;
    public final void rule__DataGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1107:1: ( rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1 )
            // InternalTurtle.g:1108:2: rule__DataGraph__Group__0__Impl rule__DataGraph__Group__1
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
    // InternalTurtle.g:1115:1: rule__DataGraph__Group__0__Impl : ( () ) ;
    public final void rule__DataGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1119:1: ( ( () ) )
            // InternalTurtle.g:1120:1: ( () )
            {
            // InternalTurtle.g:1120:1: ( () )
            // InternalTurtle.g:1121:2: ()
            {
             before(grammarAccess.getDataGraphAccess().getDataGraphAction_0()); 
            // InternalTurtle.g:1122:2: ()
            // InternalTurtle.g:1122:3: 
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
    // InternalTurtle.g:1130:1: rule__DataGraph__Group__1 : rule__DataGraph__Group__1__Impl ;
    public final void rule__DataGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1134:1: ( rule__DataGraph__Group__1__Impl )
            // InternalTurtle.g:1135:2: rule__DataGraph__Group__1__Impl
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
    // InternalTurtle.g:1141:1: rule__DataGraph__Group__1__Impl : ( ( rule__DataGraph__TriplesAssignment_1 )* ) ;
    public final void rule__DataGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1145:1: ( ( ( rule__DataGraph__TriplesAssignment_1 )* ) )
            // InternalTurtle.g:1146:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            {
            // InternalTurtle.g:1146:1: ( ( rule__DataGraph__TriplesAssignment_1 )* )
            // InternalTurtle.g:1147:2: ( rule__DataGraph__TriplesAssignment_1 )*
            {
             before(grammarAccess.getDataGraphAccess().getTriplesAssignment_1()); 
            // InternalTurtle.g:1148:2: ( rule__DataGraph__TriplesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_UNICODE) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_UNICODE) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==RULE_UNICODE) ) {
                            alt11=1;
                        }


                    }
                    else if ( (LA11_2==34) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalTurtle.g:1148:3: rule__DataGraph__TriplesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DataGraph__TriplesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTurtle.g:1157:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1161:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalTurtle.g:1162:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTurtle.g:1169:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1173:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalTurtle.g:1174:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalTurtle.g:1174:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalTurtle.g:1175:2: ( rule__Triples__SubjectAssignment_0 )
            {
             before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            // InternalTurtle.g:1176:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalTurtle.g:1176:3: rule__Triples__SubjectAssignment_0
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
    // InternalTurtle.g:1184:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl rule__Triples__Group__2 ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1188:1: ( rule__Triples__Group__1__Impl rule__Triples__Group__2 )
            // InternalTurtle.g:1189:2: rule__Triples__Group__1__Impl rule__Triples__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalTurtle.g:1196:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateobjectAssignment_1 )* ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1200:1: ( ( ( rule__Triples__PredicateobjectAssignment_1 )* ) )
            // InternalTurtle.g:1201:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            {
            // InternalTurtle.g:1201:1: ( ( rule__Triples__PredicateobjectAssignment_1 )* )
            // InternalTurtle.g:1202:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            {
             before(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1()); 
            // InternalTurtle.g:1203:2: ( rule__Triples__PredicateobjectAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_UNICODE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTurtle.g:1203:3: rule__Triples__PredicateobjectAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Triples__PredicateobjectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTurtle.g:1211:1: rule__Triples__Group__2 : rule__Triples__Group__2__Impl ;
    public final void rule__Triples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1215:1: ( rule__Triples__Group__2__Impl )
            // InternalTurtle.g:1216:2: rule__Triples__Group__2__Impl
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
    // InternalTurtle.g:1222:1: rule__Triples__Group__2__Impl : ( '.' ) ;
    public final void rule__Triples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1226:1: ( ( '.' ) )
            // InternalTurtle.g:1227:1: ( '.' )
            {
            // InternalTurtle.g:1227:1: ( '.' )
            // InternalTurtle.g:1228:2: '.'
            {
             before(grammarAccess.getTriplesAccess().getFullStopKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTurtle.g:1238:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1242:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalTurtle.g:1243:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:1250:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__Group_0__0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1254:1: ( ( ( rule__PredicateObject__Group_0__0 ) ) )
            // InternalTurtle.g:1255:1: ( ( rule__PredicateObject__Group_0__0 ) )
            {
            // InternalTurtle.g:1255:1: ( ( rule__PredicateObject__Group_0__0 ) )
            // InternalTurtle.g:1256:2: ( rule__PredicateObject__Group_0__0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getGroup_0()); 
            // InternalTurtle.g:1257:2: ( rule__PredicateObject__Group_0__0 )
            // InternalTurtle.g:1257:3: rule__PredicateObject__Group_0__0
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
    // InternalTurtle.g:1265:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1269:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalTurtle.g:1270:2: rule__PredicateObject__Group__1__Impl
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
    // InternalTurtle.g:1276:1: rule__PredicateObject__Group__1__Impl : ( ';' ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1280:1: ( ( ';' ) )
            // InternalTurtle.g:1281:1: ( ';' )
            {
            // InternalTurtle.g:1281:1: ( ';' )
            // InternalTurtle.g:1282:2: ';'
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
    // InternalTurtle.g:1292:1: rule__PredicateObject__Group_0__0 : rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 ;
    public final void rule__PredicateObject__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1296:1: ( rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1 )
            // InternalTurtle.g:1297:2: rule__PredicateObject__Group_0__0__Impl rule__PredicateObject__Group_0__1
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
    // InternalTurtle.g:1304:1: rule__PredicateObject__Group_0__0__Impl : ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) ;
    public final void rule__PredicateObject__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1308:1: ( ( ( rule__PredicateObject__PredicateAssignment_0_0 ) ) )
            // InternalTurtle.g:1309:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            {
            // InternalTurtle.g:1309:1: ( ( rule__PredicateObject__PredicateAssignment_0_0 ) )
            // InternalTurtle.g:1310:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            {
             before(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0()); 
            // InternalTurtle.g:1311:2: ( rule__PredicateObject__PredicateAssignment_0_0 )
            // InternalTurtle.g:1311:3: rule__PredicateObject__PredicateAssignment_0_0
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
    // InternalTurtle.g:1319:1: rule__PredicateObject__Group_0__1 : rule__PredicateObject__Group_0__1__Impl ;
    public final void rule__PredicateObject__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1323:1: ( rule__PredicateObject__Group_0__1__Impl )
            // InternalTurtle.g:1324:2: rule__PredicateObject__Group_0__1__Impl
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
    // InternalTurtle.g:1330:1: rule__PredicateObject__Group_0__1__Impl : ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) ;
    public final void rule__PredicateObject__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1334:1: ( ( ( rule__PredicateObject__ObjectAssignment_0_1 ) ) )
            // InternalTurtle.g:1335:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            {
            // InternalTurtle.g:1335:1: ( ( rule__PredicateObject__ObjectAssignment_0_1 ) )
            // InternalTurtle.g:1336:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1()); 
            // InternalTurtle.g:1337:2: ( rule__PredicateObject__ObjectAssignment_0_1 )
            // InternalTurtle.g:1337:3: rule__PredicateObject__ObjectAssignment_0_1
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
    // InternalTurtle.g:1346:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1350:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalTurtle.g:1351:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
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
    // InternalTurtle.g:1358:1: rule__Subject__Group__0__Impl : ( () ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1362:1: ( ( () ) )
            // InternalTurtle.g:1363:1: ( () )
            {
            // InternalTurtle.g:1363:1: ( () )
            // InternalTurtle.g:1364:2: ()
            {
             before(grammarAccess.getSubjectAccess().getSubjectAction_0()); 
            // InternalTurtle.g:1365:2: ()
            // InternalTurtle.g:1365:3: 
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
    // InternalTurtle.g:1373:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1377:1: ( rule__Subject__Group__1__Impl )
            // InternalTurtle.g:1378:2: rule__Subject__Group__1__Impl
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
    // InternalTurtle.g:1384:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1388:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalTurtle.g:1389:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1389:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalTurtle.g:1390:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1391:2: ( rule__Subject__NameAssignment_1 )
            // InternalTurtle.g:1391:3: rule__Subject__NameAssignment_1
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
    // InternalTurtle.g:1400:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1404:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalTurtle.g:1405:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
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
    // InternalTurtle.g:1412:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1416:1: ( ( () ) )
            // InternalTurtle.g:1417:1: ( () )
            {
            // InternalTurtle.g:1417:1: ( () )
            // InternalTurtle.g:1418:2: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicateAction_0()); 
            // InternalTurtle.g:1419:2: ()
            // InternalTurtle.g:1419:3: 
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
    // InternalTurtle.g:1427:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1431:1: ( rule__Predicate__Group__1__Impl )
            // InternalTurtle.g:1432:2: rule__Predicate__Group__1__Impl
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
    // InternalTurtle.g:1438:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__NameAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1442:1: ( ( ( rule__Predicate__NameAssignment_1 ) ) )
            // InternalTurtle.g:1443:1: ( ( rule__Predicate__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1443:1: ( ( rule__Predicate__NameAssignment_1 ) )
            // InternalTurtle.g:1444:2: ( rule__Predicate__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1445:2: ( rule__Predicate__NameAssignment_1 )
            // InternalTurtle.g:1445:3: rule__Predicate__NameAssignment_1
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
    // InternalTurtle.g:1454:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1458:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalTurtle.g:1459:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalTurtle.g:1466:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1470:1: ( ( () ) )
            // InternalTurtle.g:1471:1: ( () )
            {
            // InternalTurtle.g:1471:1: ( () )
            // InternalTurtle.g:1472:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalTurtle.g:1473:2: ()
            // InternalTurtle.g:1473:3: 
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
    // InternalTurtle.g:1481:1: rule__Object__Group__1 : rule__Object__Group__1__Impl ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1485:1: ( rule__Object__Group__1__Impl )
            // InternalTurtle.g:1486:2: rule__Object__Group__1__Impl
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
    // InternalTurtle.g:1492:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1496:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalTurtle.g:1497:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1497:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalTurtle.g:1498:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1499:2: ( rule__Object__NameAssignment_1 )
            // InternalTurtle.g:1499:3: rule__Object__NameAssignment_1
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
    // InternalTurtle.g:1508:1: rule__ShapesGraph__Group__0 : rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 ;
    public final void rule__ShapesGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1512:1: ( rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1 )
            // InternalTurtle.g:1513:2: rule__ShapesGraph__Group__0__Impl rule__ShapesGraph__Group__1
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
    // InternalTurtle.g:1520:1: rule__ShapesGraph__Group__0__Impl : ( () ) ;
    public final void rule__ShapesGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1524:1: ( ( () ) )
            // InternalTurtle.g:1525:1: ( () )
            {
            // InternalTurtle.g:1525:1: ( () )
            // InternalTurtle.g:1526:2: ()
            {
             before(grammarAccess.getShapesGraphAccess().getShapesGraphAction_0()); 
            // InternalTurtle.g:1527:2: ()
            // InternalTurtle.g:1527:3: 
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
    // InternalTurtle.g:1535:1: rule__ShapesGraph__Group__1 : rule__ShapesGraph__Group__1__Impl ;
    public final void rule__ShapesGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1539:1: ( rule__ShapesGraph__Group__1__Impl )
            // InternalTurtle.g:1540:2: rule__ShapesGraph__Group__1__Impl
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
    // InternalTurtle.g:1546:1: rule__ShapesGraph__Group__1__Impl : ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) ;
    public final void rule__ShapesGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1550:1: ( ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* ) )
            // InternalTurtle.g:1551:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            {
            // InternalTurtle.g:1551:1: ( ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )* )
            // InternalTurtle.g:1552:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            {
             before(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1()); 
            // InternalTurtle.g:1553:2: ( rule__ShapesGraph__ShapeConstraintsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_UNICODE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTurtle.g:1553:3: rule__ShapesGraph__ShapeConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ShapesGraph__ShapeConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTurtle.g:1562:1: rule__ShapeConstraint__Group__0 : rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 ;
    public final void rule__ShapeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1566:1: ( rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1 )
            // InternalTurtle.g:1567:2: rule__ShapeConstraint__Group__0__Impl rule__ShapeConstraint__Group__1
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
    // InternalTurtle.g:1574:1: rule__ShapeConstraint__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1578:1: ( ( () ) )
            // InternalTurtle.g:1579:1: ( () )
            {
            // InternalTurtle.g:1579:1: ( () )
            // InternalTurtle.g:1580:2: ()
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0()); 
            // InternalTurtle.g:1581:2: ()
            // InternalTurtle.g:1581:3: 
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
    // InternalTurtle.g:1589:1: rule__ShapeConstraint__Group__1 : rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 ;
    public final void rule__ShapeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1593:1: ( rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2 )
            // InternalTurtle.g:1594:2: rule__ShapeConstraint__Group__1__Impl rule__ShapeConstraint__Group__2
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
    // InternalTurtle.g:1601:1: rule__ShapeConstraint__Group__1__Impl : ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) ;
    public final void rule__ShapeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1605:1: ( ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) ) )
            // InternalTurtle.g:1606:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            {
            // InternalTurtle.g:1606:1: ( ( rule__ShapeConstraint__ShapeNameAssignment_1 ) )
            // InternalTurtle.g:1607:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1()); 
            // InternalTurtle.g:1608:2: ( rule__ShapeConstraint__ShapeNameAssignment_1 )
            // InternalTurtle.g:1608:3: rule__ShapeConstraint__ShapeNameAssignment_1
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
    // InternalTurtle.g:1616:1: rule__ShapeConstraint__Group__2 : rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 ;
    public final void rule__ShapeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1620:1: ( rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3 )
            // InternalTurtle.g:1621:2: rule__ShapeConstraint__Group__2__Impl rule__ShapeConstraint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalTurtle.g:1628:1: rule__ShapeConstraint__Group__2__Impl : ( ( rule__ShapeConstraint__Alternatives_2 ) ) ;
    public final void rule__ShapeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1632:1: ( ( ( rule__ShapeConstraint__Alternatives_2 ) ) )
            // InternalTurtle.g:1633:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            {
            // InternalTurtle.g:1633:1: ( ( rule__ShapeConstraint__Alternatives_2 ) )
            // InternalTurtle.g:1634:2: ( rule__ShapeConstraint__Alternatives_2 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2()); 
            // InternalTurtle.g:1635:2: ( rule__ShapeConstraint__Alternatives_2 )
            // InternalTurtle.g:1635:3: rule__ShapeConstraint__Alternatives_2
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
    // InternalTurtle.g:1643:1: rule__ShapeConstraint__Group__3 : rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 ;
    public final void rule__ShapeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1647:1: ( rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4 )
            // InternalTurtle.g:1648:2: rule__ShapeConstraint__Group__3__Impl rule__ShapeConstraint__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalTurtle.g:1655:1: rule__ShapeConstraint__Group__3__Impl : ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* ) ;
    public final void rule__ShapeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1659:1: ( ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* ) )
            // InternalTurtle.g:1660:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* )
            {
            // InternalTurtle.g:1660:1: ( ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )* )
            // InternalTurtle.g:1661:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )*
            {
             before(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3()); 
            // InternalTurtle.g:1662:2: ( rule__ShapeConstraint__ShapeExpressionsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=32)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTurtle.g:1662:3: rule__ShapeConstraint__ShapeExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ShapeConstraint__ShapeExpressionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalTurtle.g:1670:1: rule__ShapeConstraint__Group__4 : rule__ShapeConstraint__Group__4__Impl ;
    public final void rule__ShapeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1674:1: ( rule__ShapeConstraint__Group__4__Impl )
            // InternalTurtle.g:1675:2: rule__ShapeConstraint__Group__4__Impl
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
    // InternalTurtle.g:1681:1: rule__ShapeConstraint__Group__4__Impl : ( '.' ) ;
    public final void rule__ShapeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1685:1: ( ( '.' ) )
            // InternalTurtle.g:1686:1: ( '.' )
            {
            // InternalTurtle.g:1686:1: ( '.' )
            // InternalTurtle.g:1687:2: '.'
            {
             before(grammarAccess.getShapeConstraintAccess().getFullStopKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTurtle.g:1697:1: rule__ShapeConstraint__Group_2_0__0 : rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 ;
    public final void rule__ShapeConstraint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1701:1: ( rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1 )
            // InternalTurtle.g:1702:2: rule__ShapeConstraint__Group_2_0__0__Impl rule__ShapeConstraint__Group_2_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:1709:1: rule__ShapeConstraint__Group_2_0__0__Impl : ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) ) ;
    public final void rule__ShapeConstraint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1713:1: ( ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) ) )
            // InternalTurtle.g:1714:1: ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) )
            {
            // InternalTurtle.g:1714:1: ( ( rule__ShapeConstraint__Alternatives_2_0_0 ) )
            // InternalTurtle.g:1715:2: ( rule__ShapeConstraint__Alternatives_2_0_0 )
            {
             before(grammarAccess.getShapeConstraintAccess().getAlternatives_2_0_0()); 
            // InternalTurtle.g:1716:2: ( rule__ShapeConstraint__Alternatives_2_0_0 )
            // InternalTurtle.g:1716:3: rule__ShapeConstraint__Alternatives_2_0_0
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
    // InternalTurtle.g:1724:1: rule__ShapeConstraint__Group_2_0__1 : rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2 ;
    public final void rule__ShapeConstraint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1728:1: ( rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2 )
            // InternalTurtle.g:1729:2: rule__ShapeConstraint__Group_2_0__1__Impl rule__ShapeConstraint__Group_2_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:1736:1: rule__ShapeConstraint__Group_2_0__1__Impl : ( 'sh:NodeShape' ) ;
    public final void rule__ShapeConstraint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1740:1: ( ( 'sh:NodeShape' ) )
            // InternalTurtle.g:1741:1: ( 'sh:NodeShape' )
            {
            // InternalTurtle.g:1741:1: ( 'sh:NodeShape' )
            // InternalTurtle.g:1742:2: 'sh:NodeShape'
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
    // InternalTurtle.g:1751:1: rule__ShapeConstraint__Group_2_0__2 : rule__ShapeConstraint__Group_2_0__2__Impl ;
    public final void rule__ShapeConstraint__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1755:1: ( rule__ShapeConstraint__Group_2_0__2__Impl )
            // InternalTurtle.g:1756:2: rule__ShapeConstraint__Group_2_0__2__Impl
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
    // InternalTurtle.g:1762:1: rule__ShapeConstraint__Group_2_0__2__Impl : ( ';' ) ;
    public final void rule__ShapeConstraint__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1766:1: ( ( ';' ) )
            // InternalTurtle.g:1767:1: ( ';' )
            {
            // InternalTurtle.g:1767:1: ( ';' )
            // InternalTurtle.g:1768:2: ';'
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
    // InternalTurtle.g:1778:1: rule__ShapeName__Group__0 : rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 ;
    public final void rule__ShapeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1782:1: ( rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1 )
            // InternalTurtle.g:1783:2: rule__ShapeName__Group__0__Impl rule__ShapeName__Group__1
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
    // InternalTurtle.g:1790:1: rule__ShapeName__Group__0__Impl : ( () ) ;
    public final void rule__ShapeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1794:1: ( ( () ) )
            // InternalTurtle.g:1795:1: ( () )
            {
            // InternalTurtle.g:1795:1: ( () )
            // InternalTurtle.g:1796:2: ()
            {
             before(grammarAccess.getShapeNameAccess().getShapeNameAction_0()); 
            // InternalTurtle.g:1797:2: ()
            // InternalTurtle.g:1797:3: 
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
    // InternalTurtle.g:1805:1: rule__ShapeName__Group__1 : rule__ShapeName__Group__1__Impl ;
    public final void rule__ShapeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1809:1: ( rule__ShapeName__Group__1__Impl )
            // InternalTurtle.g:1810:2: rule__ShapeName__Group__1__Impl
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
    // InternalTurtle.g:1816:1: rule__ShapeName__Group__1__Impl : ( ( rule__ShapeName__NameAssignment_1 ) ) ;
    public final void rule__ShapeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1820:1: ( ( ( rule__ShapeName__NameAssignment_1 ) ) )
            // InternalTurtle.g:1821:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            {
            // InternalTurtle.g:1821:1: ( ( rule__ShapeName__NameAssignment_1 ) )
            // InternalTurtle.g:1822:2: ( rule__ShapeName__NameAssignment_1 )
            {
             before(grammarAccess.getShapeNameAccess().getNameAssignment_1()); 
            // InternalTurtle.g:1823:2: ( rule__ShapeName__NameAssignment_1 )
            // InternalTurtle.g:1823:3: rule__ShapeName__NameAssignment_1
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
    // InternalTurtle.g:1832:1: rule__ShapeExpression__Group_0__0 : rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 ;
    public final void rule__ShapeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1836:1: ( rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1 )
            // InternalTurtle.g:1837:2: rule__ShapeExpression__Group_0__0__Impl rule__ShapeExpression__Group_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTurtle.g:1844:1: rule__ShapeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ShapeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1848:1: ( ( () ) )
            // InternalTurtle.g:1849:1: ( () )
            {
            // InternalTurtle.g:1849:1: ( () )
            // InternalTurtle.g:1850:2: ()
            {
             before(grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0_0()); 
            // InternalTurtle.g:1851:2: ()
            // InternalTurtle.g:1851:3: 
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
    // InternalTurtle.g:1859:1: rule__ShapeExpression__Group_0__1 : rule__ShapeExpression__Group_0__1__Impl ;
    public final void rule__ShapeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1863:1: ( rule__ShapeExpression__Group_0__1__Impl )
            // InternalTurtle.g:1864:2: rule__ShapeExpression__Group_0__1__Impl
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
    // InternalTurtle.g:1870:1: rule__ShapeExpression__Group_0__1__Impl : ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) ) ;
    public final void rule__ShapeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1874:1: ( ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) ) )
            // InternalTurtle.g:1875:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) )
            {
            // InternalTurtle.g:1875:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_0_1 ) )
            // InternalTurtle.g:1876:2: ( rule__ShapeExpression__PropertyValuesAssignment_0_1 )
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_0_1()); 
            // InternalTurtle.g:1877:2: ( rule__ShapeExpression__PropertyValuesAssignment_0_1 )
            // InternalTurtle.g:1877:3: rule__ShapeExpression__PropertyValuesAssignment_0_1
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
    // InternalTurtle.g:1886:1: rule__ShapeExpression__Group_1__0 : rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 ;
    public final void rule__ShapeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1890:1: ( rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1 )
            // InternalTurtle.g:1891:2: rule__ShapeExpression__Group_1__0__Impl rule__ShapeExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:1898:1: rule__ShapeExpression__Group_1__0__Impl : ( ( rule__ShapeExpression__Group_1_0__0 ) ) ;
    public final void rule__ShapeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1902:1: ( ( ( rule__ShapeExpression__Group_1_0__0 ) ) )
            // InternalTurtle.g:1903:1: ( ( rule__ShapeExpression__Group_1_0__0 ) )
            {
            // InternalTurtle.g:1903:1: ( ( rule__ShapeExpression__Group_1_0__0 ) )
            // InternalTurtle.g:1904:2: ( rule__ShapeExpression__Group_1_0__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_0()); 
            // InternalTurtle.g:1905:2: ( rule__ShapeExpression__Group_1_0__0 )
            // InternalTurtle.g:1905:3: rule__ShapeExpression__Group_1_0__0
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
    // InternalTurtle.g:1913:1: rule__ShapeExpression__Group_1__1 : rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 ;
    public final void rule__ShapeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1917:1: ( rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2 )
            // InternalTurtle.g:1918:2: rule__ShapeExpression__Group_1__1__Impl rule__ShapeExpression__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:1925:1: rule__ShapeExpression__Group_1__1__Impl : ( ( rule__ShapeExpression__Group_1_1__0 )? ) ;
    public final void rule__ShapeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1929:1: ( ( ( rule__ShapeExpression__Group_1_1__0 )? ) )
            // InternalTurtle.g:1930:1: ( ( rule__ShapeExpression__Group_1_1__0 )? )
            {
            // InternalTurtle.g:1930:1: ( ( rule__ShapeExpression__Group_1_1__0 )? )
            // InternalTurtle.g:1931:2: ( rule__ShapeExpression__Group_1_1__0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_1()); 
            // InternalTurtle.g:1932:2: ( rule__ShapeExpression__Group_1_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_UNICODE||LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTurtle.g:1932:3: rule__ShapeExpression__Group_1_1__0
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
    // InternalTurtle.g:1940:1: rule__ShapeExpression__Group_1__2 : rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 ;
    public final void rule__ShapeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1944:1: ( rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3 )
            // InternalTurtle.g:1945:2: rule__ShapeExpression__Group_1__2__Impl rule__ShapeExpression__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:1952:1: rule__ShapeExpression__Group_1__2__Impl : ( ( rule__ShapeExpression__Group_1_2__0 )? ) ;
    public final void rule__ShapeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1956:1: ( ( ( rule__ShapeExpression__Group_1_2__0 )? ) )
            // InternalTurtle.g:1957:1: ( ( rule__ShapeExpression__Group_1_2__0 )? )
            {
            // InternalTurtle.g:1957:1: ( ( rule__ShapeExpression__Group_1_2__0 )? )
            // InternalTurtle.g:1958:2: ( rule__ShapeExpression__Group_1_2__0 )?
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_2()); 
            // InternalTurtle.g:1959:2: ( rule__ShapeExpression__Group_1_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==40) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==15) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==40) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalTurtle.g:1959:3: rule__ShapeExpression__Group_1_2__0
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
    // InternalTurtle.g:1967:1: rule__ShapeExpression__Group_1__3 : rule__ShapeExpression__Group_1__3__Impl ;
    public final void rule__ShapeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1971:1: ( rule__ShapeExpression__Group_1__3__Impl )
            // InternalTurtle.g:1972:2: rule__ShapeExpression__Group_1__3__Impl
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
    // InternalTurtle.g:1978:1: rule__ShapeExpression__Group_1__3__Impl : ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) ) ;
    public final void rule__ShapeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:1982:1: ( ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) ) )
            // InternalTurtle.g:1983:1: ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) )
            {
            // InternalTurtle.g:1983:1: ( ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* ) )
            // InternalTurtle.g:1984:2: ( ( rule__ShapeExpression__Group_1_3__0 ) ) ( ( rule__ShapeExpression__Group_1_3__0 )* )
            {
            // InternalTurtle.g:1984:2: ( ( rule__ShapeExpression__Group_1_3__0 ) )
            // InternalTurtle.g:1985:3: ( rule__ShapeExpression__Group_1_3__0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 
            // InternalTurtle.g:1986:3: ( rule__ShapeExpression__Group_1_3__0 )
            // InternalTurtle.g:1986:4: rule__ShapeExpression__Group_1_3__0
            {
            pushFollow(FOLLOW_22);
            rule__ShapeExpression__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 

            }

            // InternalTurtle.g:1989:2: ( ( rule__ShapeExpression__Group_1_3__0 )* )
            // InternalTurtle.g:1990:3: ( rule__ShapeExpression__Group_1_3__0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getGroup_1_3()); 
            // InternalTurtle.g:1991:3: ( rule__ShapeExpression__Group_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalTurtle.g:1991:4: rule__ShapeExpression__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ShapeExpression__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTurtle.g:2001:1: rule__ShapeExpression__Group_1_0__0 : rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 ;
    public final void rule__ShapeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2005:1: ( rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1 )
            // InternalTurtle.g:2006:2: rule__ShapeExpression__Group_1_0__0__Impl rule__ShapeExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTurtle.g:2013:1: rule__ShapeExpression__Group_1_0__0__Impl : ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2017:1: ( ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) ) )
            // InternalTurtle.g:2018:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            {
            // InternalTurtle.g:2018:1: ( ( rule__ShapeExpression__TypeAssignment_1_0_0 ) )
            // InternalTurtle.g:2019:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0()); 
            // InternalTurtle.g:2020:2: ( rule__ShapeExpression__TypeAssignment_1_0_0 )
            // InternalTurtle.g:2020:3: rule__ShapeExpression__TypeAssignment_1_0_0
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
    // InternalTurtle.g:2028:1: rule__ShapeExpression__Group_1_0__1 : rule__ShapeExpression__Group_1_0__1__Impl ;
    public final void rule__ShapeExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2032:1: ( rule__ShapeExpression__Group_1_0__1__Impl )
            // InternalTurtle.g:2033:2: rule__ShapeExpression__Group_1_0__1__Impl
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
    // InternalTurtle.g:2039:1: rule__ShapeExpression__Group_1_0__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2043:1: ( ( '[' ) )
            // InternalTurtle.g:2044:1: ( '[' )
            {
            // InternalTurtle.g:2044:1: ( '[' )
            // InternalTurtle.g:2045:2: '['
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
    // InternalTurtle.g:2055:1: rule__ShapeExpression__Group_1_1__0 : rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 ;
    public final void rule__ShapeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2059:1: ( rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1 )
            // InternalTurtle.g:2060:2: rule__ShapeExpression__Group_1_1__0__Impl rule__ShapeExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTurtle.g:2067:1: rule__ShapeExpression__Group_1_1__0__Impl : ( ( rule__ShapeExpression__Alternatives_1_1_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2071:1: ( ( ( rule__ShapeExpression__Alternatives_1_1_0 ) ) )
            // InternalTurtle.g:2072:1: ( ( rule__ShapeExpression__Alternatives_1_1_0 ) )
            {
            // InternalTurtle.g:2072:1: ( ( rule__ShapeExpression__Alternatives_1_1_0 ) )
            // InternalTurtle.g:2073:2: ( rule__ShapeExpression__Alternatives_1_1_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_0()); 
            // InternalTurtle.g:2074:2: ( rule__ShapeExpression__Alternatives_1_1_0 )
            // InternalTurtle.g:2074:3: rule__ShapeExpression__Alternatives_1_1_0
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
    // InternalTurtle.g:2082:1: rule__ShapeExpression__Group_1_1__1 : rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 ;
    public final void rule__ShapeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2086:1: ( rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2 )
            // InternalTurtle.g:2087:2: rule__ShapeExpression__Group_1_1__1__Impl rule__ShapeExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:2094:1: rule__ShapeExpression__Group_1_1__1__Impl : ( 'sh:NodeShape' ) ;
    public final void rule__ShapeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2098:1: ( ( 'sh:NodeShape' ) )
            // InternalTurtle.g:2099:1: ( 'sh:NodeShape' )
            {
            // InternalTurtle.g:2099:1: ( 'sh:NodeShape' )
            // InternalTurtle.g:2100:2: 'sh:NodeShape'
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
    // InternalTurtle.g:2109:1: rule__ShapeExpression__Group_1_1__2 : rule__ShapeExpression__Group_1_1__2__Impl ;
    public final void rule__ShapeExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2113:1: ( rule__ShapeExpression__Group_1_1__2__Impl )
            // InternalTurtle.g:2114:2: rule__ShapeExpression__Group_1_1__2__Impl
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
    // InternalTurtle.g:2120:1: rule__ShapeExpression__Group_1_1__2__Impl : ( ';' ) ;
    public final void rule__ShapeExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2124:1: ( ( ';' ) )
            // InternalTurtle.g:2125:1: ( ';' )
            {
            // InternalTurtle.g:2125:1: ( ';' )
            // InternalTurtle.g:2126:2: ';'
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
    // InternalTurtle.g:2136:1: rule__ShapeExpression__Group_1_2__0 : rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 ;
    public final void rule__ShapeExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2140:1: ( rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1 )
            // InternalTurtle.g:2141:2: rule__ShapeExpression__Group_1_2__0__Impl rule__ShapeExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTurtle.g:2148:1: rule__ShapeExpression__Group_1_2__0__Impl : ( ( rule__ShapeExpression__Alternatives_1_2_0 ) ) ;
    public final void rule__ShapeExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2152:1: ( ( ( rule__ShapeExpression__Alternatives_1_2_0 ) ) )
            // InternalTurtle.g:2153:1: ( ( rule__ShapeExpression__Alternatives_1_2_0 ) )
            {
            // InternalTurtle.g:2153:1: ( ( rule__ShapeExpression__Alternatives_1_2_0 ) )
            // InternalTurtle.g:2154:2: ( rule__ShapeExpression__Alternatives_1_2_0 )
            {
             before(grammarAccess.getShapeExpressionAccess().getAlternatives_1_2_0()); 
            // InternalTurtle.g:2155:2: ( rule__ShapeExpression__Alternatives_1_2_0 )
            // InternalTurtle.g:2155:3: rule__ShapeExpression__Alternatives_1_2_0
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
    // InternalTurtle.g:2163:1: rule__ShapeExpression__Group_1_2__1 : rule__ShapeExpression__Group_1_2__1__Impl ;
    public final void rule__ShapeExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2167:1: ( rule__ShapeExpression__Group_1_2__1__Impl )
            // InternalTurtle.g:2168:2: rule__ShapeExpression__Group_1_2__1__Impl
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
    // InternalTurtle.g:2174:1: rule__ShapeExpression__Group_1_2__1__Impl : ( '[' ) ;
    public final void rule__ShapeExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2178:1: ( ( '[' ) )
            // InternalTurtle.g:2179:1: ( '[' )
            {
            // InternalTurtle.g:2179:1: ( '[' )
            // InternalTurtle.g:2180:2: '['
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
    // InternalTurtle.g:2190:1: rule__ShapeExpression__Group_1_3__0 : rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1 ;
    public final void rule__ShapeExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2194:1: ( rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1 )
            // InternalTurtle.g:2195:2: rule__ShapeExpression__Group_1_3__0__Impl rule__ShapeExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTurtle.g:2202:1: rule__ShapeExpression__Group_1_3__0__Impl : ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* ) ;
    public final void rule__ShapeExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2206:1: ( ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* ) )
            // InternalTurtle.g:2207:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* )
            {
            // InternalTurtle.g:2207:1: ( ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )* )
            // InternalTurtle.g:2208:2: ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )*
            {
             before(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1_3_0()); 
            // InternalTurtle.g:2209:2: ( rule__ShapeExpression__PropertyValuesAssignment_1_3_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=14 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTurtle.g:2209:3: rule__ShapeExpression__PropertyValuesAssignment_1_3_0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ShapeExpression__PropertyValuesAssignment_1_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTurtle.g:2217:1: rule__ShapeExpression__Group_1_3__1 : rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2 ;
    public final void rule__ShapeExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2221:1: ( rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2 )
            // InternalTurtle.g:2222:2: rule__ShapeExpression__Group_1_3__1__Impl rule__ShapeExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTurtle.g:2229:1: rule__ShapeExpression__Group_1_3__1__Impl : ( ']' ) ;
    public final void rule__ShapeExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2233:1: ( ( ']' ) )
            // InternalTurtle.g:2234:1: ( ']' )
            {
            // InternalTurtle.g:2234:1: ( ']' )
            // InternalTurtle.g:2235:2: ']'
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
    // InternalTurtle.g:2244:1: rule__ShapeExpression__Group_1_3__2 : rule__ShapeExpression__Group_1_3__2__Impl ;
    public final void rule__ShapeExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2248:1: ( rule__ShapeExpression__Group_1_3__2__Impl )
            // InternalTurtle.g:2249:2: rule__ShapeExpression__Group_1_3__2__Impl
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
    // InternalTurtle.g:2255:1: rule__ShapeExpression__Group_1_3__2__Impl : ( ';' ) ;
    public final void rule__ShapeExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2259:1: ( ( ';' ) )
            // InternalTurtle.g:2260:1: ( ';' )
            {
            // InternalTurtle.g:2260:1: ( ';' )
            // InternalTurtle.g:2261:2: ';'
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
    // InternalTurtle.g:2271:1: rule__PropertyValues__Group__0 : rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 ;
    public final void rule__PropertyValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2275:1: ( rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1 )
            // InternalTurtle.g:2276:2: rule__PropertyValues__Group__0__Impl rule__PropertyValues__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTurtle.g:2283:1: rule__PropertyValues__Group__0__Impl : ( ( rule__PropertyValues__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2287:1: ( ( ( rule__PropertyValues__PropertyAssignment_0 ) ) )
            // InternalTurtle.g:2288:1: ( ( rule__PropertyValues__PropertyAssignment_0 ) )
            {
            // InternalTurtle.g:2288:1: ( ( rule__PropertyValues__PropertyAssignment_0 ) )
            // InternalTurtle.g:2289:2: ( rule__PropertyValues__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0()); 
            // InternalTurtle.g:2290:2: ( rule__PropertyValues__PropertyAssignment_0 )
            // InternalTurtle.g:2290:3: rule__PropertyValues__PropertyAssignment_0
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
    // InternalTurtle.g:2298:1: rule__PropertyValues__Group__1 : rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 ;
    public final void rule__PropertyValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2302:1: ( rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2 )
            // InternalTurtle.g:2303:2: rule__PropertyValues__Group__1__Impl rule__PropertyValues__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTurtle.g:2310:1: rule__PropertyValues__Group__1__Impl : ( ( '(' )? ) ;
    public final void rule__PropertyValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2314:1: ( ( ( '(' )? ) )
            // InternalTurtle.g:2315:1: ( ( '(' )? )
            {
            // InternalTurtle.g:2315:1: ( ( '(' )? )
            // InternalTurtle.g:2316:2: ( '(' )?
            {
             before(grammarAccess.getPropertyValuesAccess().getLeftParenthesisKeyword_1()); 
            // InternalTurtle.g:2317:2: ( '(' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTurtle.g:2317:3: '('
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
    // InternalTurtle.g:2325:1: rule__PropertyValues__Group__2 : rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 ;
    public final void rule__PropertyValues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2329:1: ( rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3 )
            // InternalTurtle.g:2330:2: rule__PropertyValues__Group__2__Impl rule__PropertyValues__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalTurtle.g:2337:1: rule__PropertyValues__Group__2__Impl : ( ( rule__PropertyValues__ValuesAssignment_2 )* ) ;
    public final void rule__PropertyValues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2341:1: ( ( ( rule__PropertyValues__ValuesAssignment_2 )* ) )
            // InternalTurtle.g:2342:1: ( ( rule__PropertyValues__ValuesAssignment_2 )* )
            {
            // InternalTurtle.g:2342:1: ( ( rule__PropertyValues__ValuesAssignment_2 )* )
            // InternalTurtle.g:2343:2: ( rule__PropertyValues__ValuesAssignment_2 )*
            {
             before(grammarAccess.getPropertyValuesAccess().getValuesAssignment_2()); 
            // InternalTurtle.g:2344:2: ( rule__PropertyValues__ValuesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_UNICODE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTurtle.g:2344:3: rule__PropertyValues__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PropertyValues__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTurtle.g:2352:1: rule__PropertyValues__Group__3 : rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 ;
    public final void rule__PropertyValues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2356:1: ( rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4 )
            // InternalTurtle.g:2357:2: rule__PropertyValues__Group__3__Impl rule__PropertyValues__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalTurtle.g:2364:1: rule__PropertyValues__Group__3__Impl : ( ( ')' )? ) ;
    public final void rule__PropertyValues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2368:1: ( ( ( ')' )? ) )
            // InternalTurtle.g:2369:1: ( ( ')' )? )
            {
            // InternalTurtle.g:2369:1: ( ( ')' )? )
            // InternalTurtle.g:2370:2: ( ')' )?
            {
             before(grammarAccess.getPropertyValuesAccess().getRightParenthesisKeyword_3()); 
            // InternalTurtle.g:2371:2: ( ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTurtle.g:2371:3: ')'
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
    // InternalTurtle.g:2379:1: rule__PropertyValues__Group__4 : rule__PropertyValues__Group__4__Impl ;
    public final void rule__PropertyValues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2383:1: ( rule__PropertyValues__Group__4__Impl )
            // InternalTurtle.g:2384:2: rule__PropertyValues__Group__4__Impl
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
    // InternalTurtle.g:2390:1: rule__PropertyValues__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyValues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2394:1: ( ( ';' ) )
            // InternalTurtle.g:2395:1: ( ';' )
            {
            // InternalTurtle.g:2395:1: ( ';' )
            // InternalTurtle.g:2396:2: ';'
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
    // InternalTurtle.g:2406:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2410:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalTurtle.g:2411:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTurtle.g:2418:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2422:1: ( ( () ) )
            // InternalTurtle.g:2423:1: ( () )
            {
            // InternalTurtle.g:2423:1: ( () )
            // InternalTurtle.g:2424:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalTurtle.g:2425:2: ()
            // InternalTurtle.g:2425:3: 
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
    // InternalTurtle.g:2433:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2437:1: ( rule__Property__Group__1__Impl )
            // InternalTurtle.g:2438:2: rule__Property__Group__1__Impl
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
    // InternalTurtle.g:2444:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2448:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // InternalTurtle.g:2449:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // InternalTurtle.g:2449:1: ( ( rule__Property__TypeAssignment_1 ) )
            // InternalTurtle.g:2450:2: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // InternalTurtle.g:2451:2: ( rule__Property__TypeAssignment_1 )
            // InternalTurtle.g:2451:3: rule__Property__TypeAssignment_1
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
    // InternalTurtle.g:2460:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2464:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalTurtle.g:2465:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalTurtle.g:2472:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2476:1: ( ( () ) )
            // InternalTurtle.g:2477:1: ( () )
            {
            // InternalTurtle.g:2477:1: ( () )
            // InternalTurtle.g:2478:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalTurtle.g:2479:2: ()
            // InternalTurtle.g:2479:3: 
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
    // InternalTurtle.g:2487:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2491:1: ( rule__Value__Group__1__Impl )
            // InternalTurtle.g:2492:2: rule__Value__Group__1__Impl
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
    // InternalTurtle.g:2498:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2502:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalTurtle.g:2503:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalTurtle.g:2503:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalTurtle.g:2504:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalTurtle.g:2505:2: ( rule__Value__NameAssignment_1 )
            // InternalTurtle.g:2505:3: rule__Value__NameAssignment_1
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
    // InternalTurtle.g:2514:1: rule__Graph__NamespacesAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Graph__NamespacesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2518:1: ( ( ruleNamespace ) )
            // InternalTurtle.g:2519:2: ( ruleNamespace )
            {
            // InternalTurtle.g:2519:2: ( ruleNamespace )
            // InternalTurtle.g:2520:3: ruleNamespace
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
    // InternalTurtle.g:2529:1: rule__Graph__DataGraphAssignment_2 : ( ruleDataGraph ) ;
    public final void rule__Graph__DataGraphAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2533:1: ( ( ruleDataGraph ) )
            // InternalTurtle.g:2534:2: ( ruleDataGraph )
            {
            // InternalTurtle.g:2534:2: ( ruleDataGraph )
            // InternalTurtle.g:2535:3: ruleDataGraph
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
    // InternalTurtle.g:2544:1: rule__Graph__ShapesGraphAssignment_3 : ( ruleShapesGraph ) ;
    public final void rule__Graph__ShapesGraphAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2548:1: ( ( ruleShapesGraph ) )
            // InternalTurtle.g:2549:2: ( ruleShapesGraph )
            {
            // InternalTurtle.g:2549:2: ( ruleShapesGraph )
            // InternalTurtle.g:2550:3: ruleShapesGraph
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
    // InternalTurtle.g:2559:1: rule__Namespace__PrefixAssignment_1 : ( RULE_PREFIX ) ;
    public final void rule__Namespace__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2563:1: ( ( RULE_PREFIX ) )
            // InternalTurtle.g:2564:2: ( RULE_PREFIX )
            {
            // InternalTurtle.g:2564:2: ( RULE_PREFIX )
            // InternalTurtle.g:2565:3: RULE_PREFIX
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
    // InternalTurtle.g:2574:1: rule__Namespace__NamespaceAssignment_3 : ( RULE_UNICODE ) ;
    public final void rule__Namespace__NamespaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2578:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2579:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2579:2: ( RULE_UNICODE )
            // InternalTurtle.g:2580:3: RULE_UNICODE
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
    // InternalTurtle.g:2589:1: rule__DataGraph__TriplesAssignment_1 : ( ruleTriples ) ;
    public final void rule__DataGraph__TriplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2593:1: ( ( ruleTriples ) )
            // InternalTurtle.g:2594:2: ( ruleTriples )
            {
            // InternalTurtle.g:2594:2: ( ruleTriples )
            // InternalTurtle.g:2595:3: ruleTriples
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
    // InternalTurtle.g:2604:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2608:1: ( ( ruleSubject ) )
            // InternalTurtle.g:2609:2: ( ruleSubject )
            {
            // InternalTurtle.g:2609:2: ( ruleSubject )
            // InternalTurtle.g:2610:3: ruleSubject
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
    // InternalTurtle.g:2619:1: rule__Triples__PredicateobjectAssignment_1 : ( rulePredicateObject ) ;
    public final void rule__Triples__PredicateobjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2623:1: ( ( rulePredicateObject ) )
            // InternalTurtle.g:2624:2: ( rulePredicateObject )
            {
            // InternalTurtle.g:2624:2: ( rulePredicateObject )
            // InternalTurtle.g:2625:3: rulePredicateObject
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
    // InternalTurtle.g:2634:1: rule__PredicateObject__PredicateAssignment_0_0 : ( rulePredicate ) ;
    public final void rule__PredicateObject__PredicateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2638:1: ( ( rulePredicate ) )
            // InternalTurtle.g:2639:2: ( rulePredicate )
            {
            // InternalTurtle.g:2639:2: ( rulePredicate )
            // InternalTurtle.g:2640:3: rulePredicate
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
    // InternalTurtle.g:2649:1: rule__PredicateObject__ObjectAssignment_0_1 : ( ruleObject ) ;
    public final void rule__PredicateObject__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2653:1: ( ( ruleObject ) )
            // InternalTurtle.g:2654:2: ( ruleObject )
            {
            // InternalTurtle.g:2654:2: ( ruleObject )
            // InternalTurtle.g:2655:3: ruleObject
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
    // InternalTurtle.g:2664:1: rule__Subject__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2668:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2669:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2669:2: ( RULE_UNICODE )
            // InternalTurtle.g:2670:3: RULE_UNICODE
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
    // InternalTurtle.g:2679:1: rule__Predicate__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Predicate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2683:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2684:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2684:2: ( RULE_UNICODE )
            // InternalTurtle.g:2685:3: RULE_UNICODE
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
    // InternalTurtle.g:2694:1: rule__Object__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2698:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2699:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2699:2: ( RULE_UNICODE )
            // InternalTurtle.g:2700:3: RULE_UNICODE
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
    // InternalTurtle.g:2709:1: rule__ShapesGraph__ShapeConstraintsAssignment_1 : ( ruleShapeConstraint ) ;
    public final void rule__ShapesGraph__ShapeConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2713:1: ( ( ruleShapeConstraint ) )
            // InternalTurtle.g:2714:2: ( ruleShapeConstraint )
            {
            // InternalTurtle.g:2714:2: ( ruleShapeConstraint )
            // InternalTurtle.g:2715:3: ruleShapeConstraint
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
    // InternalTurtle.g:2724:1: rule__ShapeConstraint__ShapeNameAssignment_1 : ( ruleShapeName ) ;
    public final void rule__ShapeConstraint__ShapeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2728:1: ( ( ruleShapeName ) )
            // InternalTurtle.g:2729:2: ( ruleShapeName )
            {
            // InternalTurtle.g:2729:2: ( ruleShapeName )
            // InternalTurtle.g:2730:3: ruleShapeName
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
    // InternalTurtle.g:2739:1: rule__ShapeConstraint__ShapeExpressionsAssignment_2_1 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2743:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2744:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2744:2: ( ruleShapeExpression )
            // InternalTurtle.g:2745:3: ruleShapeExpression
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
    // InternalTurtle.g:2754:1: rule__ShapeConstraint__ShapeExpressionsAssignment_3 : ( ruleShapeExpression ) ;
    public final void rule__ShapeConstraint__ShapeExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2758:1: ( ( ruleShapeExpression ) )
            // InternalTurtle.g:2759:2: ( ruleShapeExpression )
            {
            // InternalTurtle.g:2759:2: ( ruleShapeExpression )
            // InternalTurtle.g:2760:3: ruleShapeExpression
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
    // InternalTurtle.g:2769:1: rule__ShapeName__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__ShapeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2773:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2774:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2774:2: ( RULE_UNICODE )
            // InternalTurtle.g:2775:3: RULE_UNICODE
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
    // InternalTurtle.g:2784:1: rule__ShapeExpression__PropertyValuesAssignment_0_1 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2788:1: ( ( rulePropertyValues ) )
            // InternalTurtle.g:2789:2: ( rulePropertyValues )
            {
            // InternalTurtle.g:2789:2: ( rulePropertyValues )
            // InternalTurtle.g:2790:3: rulePropertyValues
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
    // InternalTurtle.g:2799:1: rule__ShapeExpression__TypeAssignment_1_0_0 : ( rulePropertyType ) ;
    public final void rule__ShapeExpression__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2803:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2804:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2804:2: ( rulePropertyType )
            // InternalTurtle.g:2805:3: rulePropertyType
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
    // InternalTurtle.g:2814:1: rule__ShapeExpression__PropertyValuesAssignment_1_3_0 : ( rulePropertyValues ) ;
    public final void rule__ShapeExpression__PropertyValuesAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2818:1: ( ( rulePropertyValues ) )
            // InternalTurtle.g:2819:2: ( rulePropertyValues )
            {
            // InternalTurtle.g:2819:2: ( rulePropertyValues )
            // InternalTurtle.g:2820:3: rulePropertyValues
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
    // InternalTurtle.g:2829:1: rule__PropertyValues__PropertyAssignment_0 : ( ruleProperty ) ;
    public final void rule__PropertyValues__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2833:1: ( ( ruleProperty ) )
            // InternalTurtle.g:2834:2: ( ruleProperty )
            {
            // InternalTurtle.g:2834:2: ( ruleProperty )
            // InternalTurtle.g:2835:3: ruleProperty
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
    // InternalTurtle.g:2844:1: rule__PropertyValues__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__PropertyValues__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2848:1: ( ( ruleValue ) )
            // InternalTurtle.g:2849:2: ( ruleValue )
            {
            // InternalTurtle.g:2849:2: ( ruleValue )
            // InternalTurtle.g:2850:3: ruleValue
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
    // InternalTurtle.g:2859:1: rule__Property__TypeAssignment_1 : ( rulePropertyType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2863:1: ( ( rulePropertyType ) )
            // InternalTurtle.g:2864:2: ( rulePropertyType )
            {
            // InternalTurtle.g:2864:2: ( rulePropertyType )
            // InternalTurtle.g:2865:3: rulePropertyType
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
    // InternalTurtle.g:2874:1: rule__Value__NameAssignment_1 : ( RULE_UNICODE ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTurtle.g:2878:1: ( ( RULE_UNICODE ) )
            // InternalTurtle.g:2879:2: ( RULE_UNICODE )
            {
            // InternalTurtle.g:2879:2: ( RULE_UNICODE )
            // InternalTurtle.g:2880:3: RULE_UNICODE
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
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\16\23\4\2\uffff";
    static final String dfa_3s = "\1\40\23\53\2\uffff";
    static final String dfa_4s = "\24\uffff\1\1\1\2";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\21\1\22\1\23",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
            "\1\24\41\uffff\1\24\1\uffff\1\25\1\uffff\2\24",
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
            return "518:1: rule__ShapeExpression__Alternatives : ( ( ( rule__ShapeExpression__Group_0__0 ) ) | ( ( rule__ShapeExpression__Group_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\1\31\uffff";
    static final String dfa_9s = "\1\16\1\uffff\23\4\1\uffff\2\4\1\46\1\16";
    static final String dfa_10s = "\1\51\1\uffff\23\53\1\uffff\2\53\1\46\1\51";
    static final String dfa_11s = "\1\uffff\1\2\23\uffff\1\1\4\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\21\1\17\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\22\1\23\1\24\1\uffff\1\1\6\uffff\1\25",
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
            "\1\21\1\17\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\22\1\23\1\24\1\uffff\1\1\6\uffff\1\25"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1991:3: ( rule__ShapeExpression__Group_1_3__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FFFFE010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000005FFFFE010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001FFFFE012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001FFFFC000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000201FFFFE010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000201FFFFE012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001FFFFC002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C4000000010L});

}