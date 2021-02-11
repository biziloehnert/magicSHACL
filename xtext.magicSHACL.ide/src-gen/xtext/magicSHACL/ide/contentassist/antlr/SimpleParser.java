/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.magicSHACL.ide.contentassist.antlr.internal.InternalSimpleParser;
import xtext.magicSHACL.services.SimpleGrammarAccess;

public class SimpleParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SimpleGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SimpleGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getShapeExpressionAccess().getAlternatives(), "rule__ShapeExpression__Alternatives");
			builder.put(grammarAccess.getPropertyValuesAccess().getAlternatives(), "rule__PropertyValues__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getPropertyTypeAccess().getAlternatives(), "rule__PropertyType__Alternatives");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getShapesGraphAccess().getGroup(), "rule__ShapesGraph__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup(), "rule__Target__Group__0");
			builder.put(grammarAccess.getShapeConstraintAccess().getGroup(), "rule__ShapeConstraint__Group__0");
			builder.put(grammarAccess.getShapeNameAccess().getGroup(), "rule__ShapeName__Group__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup_0(), "rule__ShapeExpression__Group_0__0");
			builder.put(grammarAccess.getPropertyValuesAccess().getGroup_0(), "rule__PropertyValues__Group_0__0");
			builder.put(grammarAccess.getPropertyValuesAccess().getGroup_0_1(), "rule__PropertyValues__Group_0_1__0");
			builder.put(grammarAccess.getPropertyValuesAccess().getGroup_0_1_3(), "rule__PropertyValues__Group_0_1_3__0");
			builder.put(grammarAccess.getPropertyValuesAccess().getGroup_1(), "rule__PropertyValues__Group_1__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
			builder.put(grammarAccess.getGraphAccess().getShapesGraphAssignment_1(), "rule__Graph__ShapesGraphAssignment_1");
			builder.put(grammarAccess.getShapesGraphAccess().getTargetsAssignment_1(), "rule__ShapesGraph__TargetsAssignment_1");
			builder.put(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_2(), "rule__ShapesGraph__ShapeConstraintsAssignment_2");
			builder.put(grammarAccess.getTargetAccess().getNameAssignment_1(), "rule__Target__NameAssignment_1");
			builder.put(grammarAccess.getTargetAccess().getTermAssignment_3(), "rule__Target__TermAssignment_3");
			builder.put(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1(), "rule__ShapeConstraint__ShapeNameAssignment_1");
			builder.put(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_3(), "rule__ShapeConstraint__ShapeExpressionsAssignment_3");
			builder.put(grammarAccess.getShapeNameAccess().getNameAssignment_1(), "rule__ShapeName__NameAssignment_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getValueAssignment_0_1(), "rule__ShapeExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getPropertyValuesAssignment_1(), "rule__ShapeExpression__PropertyValuesAssignment_1");
			builder.put(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_0(), "rule__PropertyValues__ValuesAssignment_0_1_0");
			builder.put(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_0_1_1(), "rule__PropertyValues__PropertyAssignment_0_1_1");
			builder.put(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_2(), "rule__PropertyValues__ValuesAssignment_0_1_2");
			builder.put(grammarAccess.getPropertyValuesAccess().getValuesAssignment_0_1_3_1(), "rule__PropertyValues__ValuesAssignment_0_1_3_1");
			builder.put(grammarAccess.getPropertyValuesAccess().getPropertyAssignment_1_0(), "rule__PropertyValues__PropertyAssignment_1_0");
			builder.put(grammarAccess.getPropertyValuesAccess().getValuesAssignment_1_1(), "rule__PropertyValues__ValuesAssignment_1_1");
			builder.put(grammarAccess.getPropertyAccess().getTypeAssignment_1(), "rule__Property__TypeAssignment_1");
			builder.put(grammarAccess.getValueAccess().getNameAssignment_1(), "rule__Value__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SimpleGrammarAccess grammarAccess;

	@Override
	protected InternalSimpleParser createParser() {
		InternalSimpleParser result = new InternalSimpleParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SimpleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimpleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
