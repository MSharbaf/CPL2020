/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.cpl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.cpl.services.CPLGrammarAccess;

@SuppressWarnings("all")
public class CPLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CPLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConditionCS___EqualsSignEqualsSignKeyword_1_4_or_EqualsSignLessThanSignKeyword_1_8_or_ExclamationMarkKeyword_1_6_or_GreaterThanSignEqualsSignKeyword_1_7_or_GreaterThanSignKeyword_1_2_or_INKeyword_1_9_or_IsContradictKeyword_1_1_or_IsEquivalentKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3_or_NotINKeyword_1_10__q;
	protected AbstractElementAlias match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_ImportCP_DomainKeyword_0_1_or_ImportKeyword_0_0;
	protected AbstractElementAlias match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2;
	protected AbstractElementAlias match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q;
	protected AbstractElementAlias match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q;
	protected AbstractElementAlias match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_0_1_q;
	protected AbstractElementAlias match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_1_1_q;
	protected AbstractElementAlias match_RelationCP___AndKeyword_2_0_1_or_OrKeyword_2_0_0__q;
	protected AbstractElementAlias match_TopLevelCP___RightCurlyBracketKeyword_4_4_InmodelKeyword_4_0_UnrestrictedNameParserRuleCall_4_1_LeftCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CPLGrammarAccess) access;
		match_ConditionCS___EqualsSignEqualsSignKeyword_1_4_or_EqualsSignLessThanSignKeyword_1_8_or_ExclamationMarkKeyword_1_6_or_GreaterThanSignEqualsSignKeyword_1_7_or_GreaterThanSignKeyword_1_2_or_INKeyword_1_9_or_IsContradictKeyword_1_1_or_IsEquivalentKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3_or_NotINKeyword_1_10__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getEqualsSignEqualsSignKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getEqualsSignLessThanSignKeyword_1_8()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getExclamationMarkKeyword_1_6()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getGreaterThanSignEqualsSignKeyword_1_7()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getGreaterThanSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getINKeyword_1_9()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getIsContradictKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getIsEquivalentKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getLessThanSignGreaterThanSignKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getLessThanSignKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getConditionCSAccess().getNotINKeyword_1_10()));
		match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefOperationCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefPropertyCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_ImportCP_DomainKeyword_0_1_or_ImportKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportCPAccess().getDomainKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getImportCPAccess().getImportKeyword_0_0()));
		match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportCSAccess().getImportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getImportCSAccess().getIncludeKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getImportCSAccess().getLibraryKeyword_0_2()));
		match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
		match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q = new TokenAlias(false, true, grammarAccess.getOperationContextDeclCSAccess().getUnrestrictedNameParserRuleCall_8_2_1());
		match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_0_1_q = new TokenAlias(false, true, grammarAccess.getPropertyContextDeclCSAccess().getUnrestrictedNameParserRuleCall_4_0_1());
		match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_1_1_q = new TokenAlias(false, true, grammarAccess.getPropertyContextDeclCSAccess().getUnrestrictedNameParserRuleCall_4_1_1());
		match_RelationCP___AndKeyword_2_0_1_or_OrKeyword_2_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationCPAccess().getAndKeyword_2_0_1()), new TokenAlias(false, false, grammarAccess.getRelationCPAccess().getOrKeyword_2_0_0()));
		match_TopLevelCP___RightCurlyBracketKeyword_4_4_InmodelKeyword_4_0_UnrestrictedNameParserRuleCall_4_1_LeftCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_4_4()), new TokenAlias(false, false, grammarAccess.getTopLevelCPAccess().getInmodelKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_4_2()));
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getUnrestrictedNameRule())
			return getUnrestrictedNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * UnrestrictedName returns ecore::EString:
	 * 	EssentialOCLUnrestrictedName
	 * 						| 'import'
	 * 	| 'include'
	 * 			| 'library'
	 * 				;
	 */
	protected String getUnrestrictedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ConditionCS___EqualsSignEqualsSignKeyword_1_4_or_EqualsSignLessThanSignKeyword_1_8_or_ExclamationMarkKeyword_1_6_or_GreaterThanSignEqualsSignKeyword_1_7_or_GreaterThanSignKeyword_1_2_or_INKeyword_1_9_or_IsContradictKeyword_1_1_or_IsEquivalentKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3_or_NotINKeyword_1_10__q.equals(syntax))
				emit_ConditionCS___EqualsSignEqualsSignKeyword_1_4_or_EqualsSignLessThanSignKeyword_1_8_or_ExclamationMarkKeyword_1_6_or_GreaterThanSignEqualsSignKeyword_1_7_or_GreaterThanSignKeyword_1_2_or_INKeyword_1_9_or_IsContradictKeyword_1_1_or_IsEquivalentKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3_or_NotINKeyword_1_10__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImportCP_DomainKeyword_0_1_or_ImportKeyword_0_0.equals(syntax))
				emit_ImportCP_DomainKeyword_0_1_or_ImportKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2.equals(syntax))
				emit_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q.equals(syntax))
				emit_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q.equals(syntax))
				emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_0_1_q.equals(syntax))
				emit_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_1_1_q.equals(syntax))
				emit_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RelationCP___AndKeyword_2_0_1_or_OrKeyword_2_0_0__q.equals(syntax))
				emit_RelationCP___AndKeyword_2_0_1_or_OrKeyword_2_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TopLevelCP___RightCurlyBracketKeyword_4_4_InmodelKeyword_4_0_UnrestrictedNameParserRuleCall_4_1_LeftCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_TopLevelCP___RightCurlyBracketKeyword_4_4_InmodelKeyword_4_0_UnrestrictedNameParserRuleCall_4_1_LeftCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (
	  *         'isEquivalent' | 
	  *         'isContradict' | 
	  *         '>' | 
	  *         '<' | 
	  *         '==' | 
	  *         '<>' | 
	  *         '!' | 
	  *         '>=' | 
	  *         '=<' | 
	  *         'IN' | 
	  *         'NotIN'
	  *     )?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ownedElementB=FQN
	 *     ownedElementA=FQN (ambiguity) ownedElementB=FQN
	 */
	protected void emit_ConditionCS___EqualsSignEqualsSignKeyword_1_4_or_EqualsSignLessThanSignKeyword_1_8_or_ExclamationMarkKeyword_1_6_or_GreaterThanSignEqualsSignKeyword_1_7_or_GreaterThanSignKeyword_1_2_or_INKeyword_1_9_or_IsContradictKeyword_1_1_or_IsEquivalentKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3_or_NotINKeyword_1_10__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) ':' name=UnrestrictedName
	 *     (rule start) 'def' (ambiguity) ':' ownedSignature=TemplateSignatureCS
	 *     isStatic?='static' 'def' (ambiguity) ':' name=UnrestrictedName
	 *     isStatic?='static' 'def' (ambiguity) ':' ownedSignature=TemplateSignatureCS
	 */
	protected void emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) ':' name=UnrestrictedName
	 *     isStatic?='static' 'def' (ambiguity) ':' name=UnrestrictedName
	 */
	protected void emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'import' | 'domain'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=Identifier
	 *     (rule start) (ambiguity) ownedPathName=URIPathNameCS
	 */
	protected void emit_ImportCP_DomainKeyword_0_1_or_ImportKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'import' | 'include' | 'library'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=Identifier
	 *     (rule start) (ambiguity) ownedPathName=URIPathNameCS
	 */
	protected void emit_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '|?'?
	 *
	 * This ambiguous syntax occurs at:
	 *     lowerBound=LOWER (ambiguity) ']' (rule end)
	 *     stringBounds='*' (ambiguity) ']' (rule end)
	 *     stringBounds='+' (ambiguity) ']' (rule end)
	 *     stringBounds='?' (ambiguity) ']' (rule end)
	 *     upperBound=UPPER (ambiguity) ']' (rule end)
	 */
	protected void emit_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedBodies+=SpecificationCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedParameters+=ParameterCS ')' ':' 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPathName=PathNameCS '(' ')' ':' 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPostconditions+=ConstraintCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPreconditions+=ConstraintCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedType=TypeExpCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 */
	protected void emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedDefaultExpressions+=SpecificationCS 'derive' (ambiguity) ':' ownedDefaultExpressions+=SpecificationCS
	 *     ownedType=TypeExpCS 'derive' (ambiguity) ':' ownedDefaultExpressions+=SpecificationCS
	 */
	protected void emit_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedDefaultExpressions+=SpecificationCS 'init' (ambiguity) ':' ownedDefaultExpressions+=SpecificationCS
	 *     ownedType=TypeExpCS 'init' (ambiguity) ':' ownedDefaultExpressions+=SpecificationCS
	 */
	protected void emit_PropertyContextDeclCS_UnrestrictedNameParserRuleCall_4_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('or' | 'and')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'where' '{' (ambiguity) ownedConditions+=ConditionCS
	 *     ownedConditions+=ConditionCS (ambiguity) ownedConditions+=ConditionCS
	 */
	protected void emit_RelationCP___AndKeyword_2_0_1_or_OrKeyword_2_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'inmodel' UnrestrictedName '{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedContexts+=ContextDeclCS (ambiguity) ownedContexts+=ContextDeclCS
	 */
	protected void emit_TopLevelCP___RightCurlyBracketKeyword_4_4_InmodelKeyword_4_0_UnrestrictedNameParserRuleCall_4_1_LeftCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Tuple' (ambiguity) (rule end)
	 *     name='Tuple' (ambiguity) ownedMultiplicity=MultiplicityCS
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
