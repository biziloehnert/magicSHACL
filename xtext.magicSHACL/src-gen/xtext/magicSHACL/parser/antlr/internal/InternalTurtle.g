/*
 * generated by Xtext 2.24.0
 */
grammar InternalTurtle;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package xtext.magicSHACL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	iv_ruleGraph=ruleGraph
	{ $current=$iv_ruleGraph.current; }
	EOF;

// Rule Graph
ruleGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGraphAccess().getGraphAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphAccess().getNamespacesNamespaceParserRuleCall_1_0());
				}
				lv_namespaces_1_0=ruleNamespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRule());
					}
					add(
						$current,
						"namespaces",
						lv_namespaces_1_0,
						"xtext.magicSHACL.Turtle.Namespace");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphAccess().getDataGraphDataGraphParserRuleCall_2_0());
				}
				lv_dataGraph_2_0=ruleDataGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRule());
					}
					set(
						$current,
						"dataGraph",
						lv_dataGraph_2_0,
						"xtext.magicSHACL.Turtle.DataGraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphAccess().getShapesGraphShapesGraphParserRuleCall_3_0());
				}
				lv_shapesGraph_3_0=ruleShapesGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRule());
					}
					set(
						$current,
						"shapesGraph",
						lv_shapesGraph_3_0,
						"xtext.magicSHACL.Turtle.ShapesGraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@prefix'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getPrefixKeyword_0());
		}
		(
			(
				lv_prefix_1_0=RULE_ID
				{
					newLeafNode(lv_prefix_1_0, grammarAccess.getNamespaceAccess().getPrefixIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamespaceRule());
					}
					setWithLastConsumed(
						$current,
						"prefix",
						lv_prefix_1_0,
						"xtext.magicSHACL.Turtle.ID");
				}
			)
		)
		(
			(
				lv_namespace_2_0=RULE_IRI
				{
					newLeafNode(lv_namespace_2_0, grammarAccess.getNamespaceAccess().getNamespaceIRITerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamespaceRule());
					}
					setWithLastConsumed(
						$current,
						"namespace",
						lv_namespace_2_0,
						"xtext.magicSHACL.Turtle.IRI");
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getNamespaceAccess().getFullStopKeyword_3());
		}
	)
;

// Entry rule entryRuleDataGraph
entryRuleDataGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataGraphRule()); }
	iv_ruleDataGraph=ruleDataGraph
	{ $current=$iv_ruleDataGraph.current; }
	EOF;

// Rule DataGraph
ruleDataGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDataGraphAccess().getDataGraphAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDataGraphAccess().getTriplesTriplesParserRuleCall_1_0());
				}
				lv_triples_1_0=ruleTriples
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataGraphRule());
					}
					add(
						$current,
						"triples",
						lv_triples_1_0,
						"xtext.magicSHACL.Turtle.Triples");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTriples
entryRuleTriples returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriplesRule()); }
	iv_ruleTriples=ruleTriples
	{ $current=$iv_ruleTriples.current; }
	EOF;

// Rule Triples
ruleTriples returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0());
				}
				lv_subject_0_0=ruleSubject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTriplesRule());
					}
					set(
						$current,
						"subject",
						lv_subject_0_0,
						"xtext.magicSHACL.Turtle.Subject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTriplesAccess().getPredicateobjectPredicateObjectParserRuleCall_1_0());
				}
				lv_predicateobject_1_0=rulePredicateObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTriplesRule());
					}
					add(
						$current,
						"predicateobject",
						lv_predicateobject_1_0,
						"xtext.magicSHACL.Turtle.PredicateObject");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getTriplesAccess().getFullStopKeyword_2());
		}
	)
;

// Entry rule entryRulePredicateObject
entryRulePredicateObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateObjectRule()); }
	iv_rulePredicateObject=rulePredicateObject
	{ $current=$iv_rulePredicateObject.current; }
	EOF;

// Rule PredicateObject
rulePredicateObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPredicateObjectAccess().getPredicatePredicateParserRuleCall_0_0_0());
					}
					lv_predicate_0_0=rulePredicate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
						}
						set(
							$current,
							"predicate",
							lv_predicate_0_0,
							"xtext.magicSHACL.Turtle.Predicate");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPredicateObjectAccess().getObjectObjectParserRuleCall_0_1_0());
					}
					lv_object_1_0=ruleObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
						}
						set(
							$current,
							"object",
							lv_object_1_0,
							"xtext.magicSHACL.Turtle.Object");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getPredicateObjectAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleSubject
entryRuleSubject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubjectRule()); }
	iv_ruleSubject=ruleSubject
	{ $current=$iv_ruleSubject.current; }
	EOF;

// Rule Subject
ruleSubject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSubjectAccess().getSubjectAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0_0());
					}
					lv_name_1_1=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubjectRule());
						}
						set(
							$current,
							"name",
							lv_name_1_1,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
					    |
					lv_name_1_2=RULE_IRI
					{
						newLeafNode(lv_name_1_2, grammarAccess.getSubjectAccess().getNameIRITerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSubjectRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"xtext.magicSHACL.Turtle.IRI");
					}
				)
			)
		)
	)
;

// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	iv_rulePredicate=rulePredicate
	{ $current=$iv_rulePredicate.current; }
	EOF;

// Rule Predicate
rulePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPredicateAccess().getPredicateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPredicateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPredicateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"xtext.magicSHACL.Turtle.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getObjectAccess().getObjectAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"xtext.magicSHACL.Turtle.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='^^'
			{
				newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getCircumflexAccentCircumflexAccentKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getObjectAccess().getXsdTypeEStringParserRuleCall_2_1_0());
					}
					lv_xsdType_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getObjectRule());
						}
						set(
							$current,
							"xsdType",
							lv_xsdType_3_0,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleShapesGraph
entryRuleShapesGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapesGraphRule()); }
	iv_ruleShapesGraph=ruleShapesGraph
	{ $current=$iv_ruleShapesGraph.current; }
	EOF;

// Rule ShapesGraph
ruleShapesGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShapesGraphAccess().getShapesGraphAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getShapesGraphAccess().getShapeConstraintsShapeConstraintParserRuleCall_1_0());
				}
				lv_shapeConstraints_1_0=ruleShapeConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShapesGraphRule());
					}
					add(
						$current,
						"shapeConstraints",
						lv_shapeConstraints_1_0,
						"xtext.magicSHACL.Turtle.ShapeConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleShapeConstraint
entryRuleShapeConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapeConstraintRule()); }
	iv_ruleShapeConstraint=ruleShapeConstraint
	{ $current=$iv_ruleShapeConstraint.current; }
	EOF;

// Rule ShapeConstraint
ruleShapeConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShapeConstraintAccess().getShapeConstraintAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeNameShapeNameParserRuleCall_1_0());
				}
				lv_shapeName_1_0=ruleShapeName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
					}
					set(
						$current,
						"shapeName",
						lv_shapeName_1_0,
						"xtext.magicSHACL.Turtle.ShapeName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getShapeConstraintAccess().getTargetsTargetParserRuleCall_2_0_0());
					}
					lv_targets_2_0=ruleTarget
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
						}
						add(
							$current,
							"targets",
							lv_targets_2_0,
							"xtext.magicSHACL.Turtle.Target");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getShapeConstraintAccess().getShapeExpressionsShapeExpressionParserRuleCall_2_1_0());
					}
					lv_shapeExpressions_3_0=ruleShapeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getShapeConstraintRule());
						}
						add(
							$current,
							"shapeExpressions",
							lv_shapeExpressions_3_0,
							"xtext.magicSHACL.Turtle.ShapeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_4='.'
		{
			newLeafNode(otherlv_4, grammarAccess.getShapeConstraintAccess().getFullStopKeyword_3());
		}
	)
;

// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	iv_ruleTarget=ruleTarget
	{ $current=$iv_ruleTarget.current; }
	EOF;

// Rule Target
ruleTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTargetAccess().getTargetAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_type_1_1='sh:targetClass'
					{
						newLeafNode(lv_type_1_1, grammarAccess.getTargetAccess().getTypeShTargetClassKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_1, null);
					}
					    |
					lv_type_1_2='sh:targetNode'
					{
						newLeafNode(lv_type_1_2, grammarAccess.getTargetAccess().getTypeShTargetNodeKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_2, null);
					}
				)
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTargetAccess().getTermEStringParserRuleCall_2_0_0());
					}
					lv_term_2_1=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTargetRule());
						}
						set(
							$current,
							"term",
							lv_term_2_1,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
					    |
					lv_term_2_2=RULE_IRI
					{
						newLeafNode(lv_term_2_2, grammarAccess.getTargetAccess().getTermIRITerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetRule());
						}
						setWithLastConsumed(
							$current,
							"term",
							lv_term_2_2,
							"xtext.magicSHACL.Turtle.IRI");
					}
				)
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleShapeName
entryRuleShapeName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapeNameRule()); }
	iv_ruleShapeName=ruleShapeName
	{ $current=$iv_ruleShapeName.current; }
	EOF;

// Rule ShapeName
ruleShapeName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShapeNameAccess().getShapeNameAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_name_1_1=RULE_IRI
					{
						newLeafNode(lv_name_1_1, grammarAccess.getShapeNameAccess().getNameIRITerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getShapeNameRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_1,
							"xtext.magicSHACL.Turtle.IRI");
					}
					    |
					{
						newCompositeNode(grammarAccess.getShapeNameAccess().getNameEStringParserRuleCall_1_0_1());
					}
					lv_name_1_2=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getShapeNameRule());
						}
						set(
							$current,
							"name",
							lv_name_1_2,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleShapeExpression
entryRuleShapeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapeExpressionRule()); }
	iv_ruleShapeExpression=ruleShapeExpression
	{ $current=$iv_ruleShapeExpression.current; }
	EOF;

// Rule ShapeExpression
ruleShapeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShapeExpressionAccess().getShapeExpressionAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_0_0_0());
						}
						lv_type_1_0=rulePropertyType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
							}
							set(
								$current,
								"type",
								lv_type_1_0,
								"xtext.magicSHACL.Turtle.PropertyType");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_1_0());
						}
						lv_values_2_0=ruleValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
							}
							add(
								$current,
								"values",
								lv_values_2_0,
								"xtext.magicSHACL.Turtle.Value");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3=','
					{
						newLeafNode(otherlv_3, grammarAccess.getShapeExpressionAccess().getCommaKeyword_1_0_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_0_2_1_0());
							}
							lv_values_4_0=ruleValue
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
								}
								add(
									$current,
									"values",
									lv_values_4_0,
									"xtext.magicSHACL.Turtle.Value");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_1_0_0());
						}
						lv_type_5_0=rulePropertyType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
							}
							set(
								$current,
								"type",
								lv_type_5_0,
								"xtext.magicSHACL.Turtle.PropertyType");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_6='('
				{
					newLeafNode(otherlv_6, grammarAccess.getShapeExpressionAccess().getLeftParenthesisKeyword_1_1_1());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getShapeExpressionAccess().getValuesValueParserRuleCall_1_1_2_0_0());
							}
							lv_values_7_0=ruleValue
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
								}
								add(
									$current,
									"values",
									lv_values_7_0,
									"xtext.magicSHACL.Turtle.Value");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							{
								newCompositeNode(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_1_2_1_0());
							}
							lv_shapeExpressions_8_0=ruleShapeExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
								}
								add(
									$current,
									"shapeExpressions",
									lv_shapeExpressions_8_0,
									"xtext.magicSHACL.Turtle.ShapeExpression");
								afterParserOrEnumRuleCall();
							}
						)
					)*
				)
				otherlv_9=')'
				{
					newLeafNode(otherlv_9, grammarAccess.getShapeExpressionAccess().getRightParenthesisKeyword_1_1_3());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getShapeExpressionAccess().getTypePropertyTypeEnumRuleCall_1_2_0_0());
						}
						lv_type_10_0=rulePropertyType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
							}
							set(
								$current,
								"type",
								lv_type_10_0,
								"xtext.magicSHACL.Turtle.PropertyType");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				otherlv_11='['
				{
					newLeafNode(otherlv_11, grammarAccess.getShapeExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getShapeExpressionAccess().getShapeExpressionsShapeExpressionParserRuleCall_1_2_2_0());
						}
						lv_shapeExpressions_12_0=ruleShapeExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShapeExpressionRule());
							}
							add(
								$current,
								"shapeExpressions",
								lv_shapeExpressions_12_0,
								"xtext.magicSHACL.Turtle.ShapeExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_13=']'
				{
					newLeafNode(otherlv_13, grammarAccess.getShapeExpressionAccess().getRightSquareBracketKeyword_1_2_3());
				}
			)
		)
		(
			otherlv_14=';'
			{
				newLeafNode(otherlv_14, grammarAccess.getShapeExpressionAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getValueAccess().getValueAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getValueAccess().getNameEStringParserRuleCall_1_0_0());
					}
					lv_name_1_1=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getValueRule());
						}
						set(
							$current,
							"name",
							lv_name_1_1,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
					    |
					lv_name_1_2=RULE_IRI
					{
						newLeafNode(lv_name_1_2, grammarAccess.getValueAccess().getNameIRITerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"xtext.magicSHACL.Turtle.IRI");
					}
				)
			)
		)
		(
			this_ID_2=RULE_ID
			{
				newLeafNode(this_ID_2, grammarAccess.getValueAccess().getIDTerminalRuleCall_2());
			}
		)?
		(
			otherlv_3='^^'
			{
				newLeafNode(otherlv_3, grammarAccess.getValueAccess().getCircumflexAccentCircumflexAccentKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getValueAccess().getXsdTypeEStringParserRuleCall_3_1_0());
					}
					lv_xsdType_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getValueRule());
						}
						set(
							$current,
							"xsdType",
							lv_xsdType_4_0,
							"xtext.magicSHACL.Turtle.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule PropertyType
rulePropertyType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='sh:minCount'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getMinCountConstraintComponentEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sh:maxCount'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getMaxCountConstraintComponentEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='sh:and'
			{
				$current = grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getAndConstraintComponentEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='sh:or'
			{
				$current = grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getOrConstraintComponentEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='sh:not'
			{
				$current = grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getNotConstraintComponentEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='sh:class'
			{
				$current = grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getClassConstraintComponentEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='sh:hasValue'
			{
				$current = grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getHasValueConstraintComponentEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='sh:nodeKind'
			{
				$current = grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getNodeKindConstraintComponentEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='sh:node'
			{
				$current = grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getNodeConstraintComponentEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='sh:datatype'
			{
				$current = grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getDatatypeConstraintComponentEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='sh:pattern'
			{
				$current = grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getPatternConstraintComponentEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='sh:closed'
			{
				$current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponentEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='sh:ignoredProperties'
			{
				$current = grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getClosedConstraintComponent_ignoreEnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='sh:path'
			{
				$current = grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getPropertyTypeAccess().getPredicatePathEnumLiteralDeclaration_13());
			}
		)
		    |
		(
			enumLiteral_14='sh:inversePath'
			{
				$current = grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_14, grammarAccess.getPropertyTypeAccess().getInversePathEnumLiteralDeclaration_14());
			}
		)
		    |
		(
			enumLiteral_15='sh:property'
			{
				$current = grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_15, grammarAccess.getPropertyTypeAccess().getPropertyEnumLiteralDeclaration_15());
			}
		)
		    |
		(
			enumLiteral_16='sh:name'
			{
				$current = grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_16, grammarAccess.getPropertyTypeAccess().getNameEnumLiteralDeclaration_16());
			}
		)
		    |
		(
			enumLiteral_17='sh:message'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_17, grammarAccess.getPropertyTypeAccess().getMessageEnumLiteralDeclaration_17());
			}
		)
		    |
		(
			enumLiteral_18='sh:equals'
			{
				$current = grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_18, grammarAccess.getPropertyTypeAccess().getEqualsConstraintComponentEnumLiteralDeclaration_18());
			}
		)
		    |
		(
			enumLiteral_19='sh:minExclusive'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_19, grammarAccess.getPropertyTypeAccess().getMinExclusiveConstraintComponentEnumLiteralDeclaration_19());
			}
		)
		    |
		(
			enumLiteral_20='sh:minInclusive'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_20, grammarAccess.getPropertyTypeAccess().getMinInclusiveConstraintComponentEnumLiteralDeclaration_20());
			}
		)
		    |
		(
			enumLiteral_21='sh:maxExclusive'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_21, grammarAccess.getPropertyTypeAccess().getMaxExclusiveConstraintComponentEnumLiteralDeclaration_21());
			}
		)
		    |
		(
			enumLiteral_22='sh:maxInclusive'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_22, grammarAccess.getPropertyTypeAccess().getMaxInclusiveConstraintComponentEnumLiteralDeclaration_22());
			}
		)
		    |
		(
			enumLiteral_23='sh:maxLength'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_23, grammarAccess.getPropertyTypeAccess().getMaxLengthConstraintComponentEnumLiteralDeclaration_23());
			}
		)
		    |
		(
			enumLiteral_24='sh:minLength'
			{
				$current = grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_24, grammarAccess.getPropertyTypeAccess().getMinLengthConstraintComponentEnumLiteralDeclaration_24());
			}
		)
		    |
		(
			enumLiteral_25='sh:qualifiedValueShape'
			{
				$current = grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_25, grammarAccess.getPropertyTypeAccess().getQualifiedValueShapeEnumLiteralDeclaration_25());
			}
		)
		    |
		(
			enumLiteral_26='sh:qualifiedMaxCount'
			{
				$current = grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_26, grammarAccess.getPropertyTypeAccess().getQualifiedMaxCountEnumLiteralDeclaration_26());
			}
		)
		    |
		(
			enumLiteral_27='sh:qualifiedMinCount'
			{
				$current = grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_27, grammarAccess.getPropertyTypeAccess().getQualifiedMinCountEnumLiteralDeclaration_27());
			}
		)
		    |
		(
			enumLiteral_28='a'
			{
				$current = grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_28, grammarAccess.getPropertyTypeAccess().getInstanceOfEnumLiteralDeclaration_28());
			}
		)
		    |
		(
			enumLiteral_29='rdfs:label'
			{
				$current = grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_29, grammarAccess.getPropertyTypeAccess().getRdfsLabelEnumLiteralDeclaration_29());
			}
		)
		    |
		(
			enumLiteral_30='sh:description'
			{
				$current = grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_30, grammarAccess.getPropertyTypeAccess().getDescriptionEnumLiteralDeclaration_30());
			}
		)
	)
;

RULE_SL_COMMENT : ('#'|'//') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_IRI : '<' ~(('<'|'>'|'"'|'{'|'}'|'|'|'^'|'`'|'\\'|'\u0000'..' '))* '>';

RULE_ID : '@'? ('a'..'z'|'A'..'Z'|'_'|'0'..'9' ('.' '0'..'9')?|':'|'-')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
