/*
 * generated by Xtext 2.11.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.losCheetos.ArithExpression;
import edu.upb.lp.isc.losCheetos.BoolCompExpression;
import edu.upb.lp.isc.losCheetos.BoolConstant;
import edu.upb.lp.isc.losCheetos.BoolNumCompExpression;
import edu.upb.lp.isc.losCheetos.CarExpression;
import edu.upb.lp.isc.losCheetos.CdrExpression;
import edu.upb.lp.isc.losCheetos.CompExpression;
import edu.upb.lp.isc.losCheetos.ConsExpression;
import edu.upb.lp.isc.losCheetos.Define;
import edu.upb.lp.isc.losCheetos.DoubleExpression;
import edu.upb.lp.isc.losCheetos.EmptyExpression;
import edu.upb.lp.isc.losCheetos.FracExpression;
import edu.upb.lp.isc.losCheetos.FunctionCallExpression;
import edu.upb.lp.isc.losCheetos.IfExpression;
import edu.upb.lp.isc.losCheetos.IntExpression;
import edu.upb.lp.isc.losCheetos.LengthExpression;
import edu.upb.lp.isc.losCheetos.ListExpression;
import edu.upb.lp.isc.losCheetos.LosCheetosPackage;
import edu.upb.lp.isc.losCheetos.MyRacketProgram;
import edu.upb.lp.isc.losCheetos.ParamCallExpression;
import edu.upb.lp.isc.losCheetos.PrintExpression;
import edu.upb.lp.isc.losCheetos.StrAppExpression;
import edu.upb.lp.isc.losCheetos.StrExpression;
import edu.upb.lp.isc.losCheetos.StrLenExpression;
import edu.upb.lp.isc.losCheetos.WhileExpression;
import edu.upb.lp.isc.services.LosCheetosGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LosCheetosSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LosCheetosGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LosCheetosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LosCheetosPackage.ARITH_EXPRESSION:
				sequence_ArithExpression(context, (ArithExpression) semanticObject); 
				return; 
			case LosCheetosPackage.BOOL_COMP_EXPRESSION:
				sequence_BoolCompExpression(context, (BoolCompExpression) semanticObject); 
				return; 
			case LosCheetosPackage.BOOL_CONSTANT:
				sequence_BoolConstant(context, (BoolConstant) semanticObject); 
				return; 
			case LosCheetosPackage.BOOL_NUM_COMP_EXPRESSION:
				sequence_BoolNumCompExpression(context, (BoolNumCompExpression) semanticObject); 
				return; 
			case LosCheetosPackage.CAR_EXPRESSION:
				sequence_CarExpression(context, (CarExpression) semanticObject); 
				return; 
			case LosCheetosPackage.CDR_EXPRESSION:
				sequence_CdrExpression(context, (CdrExpression) semanticObject); 
				return; 
			case LosCheetosPackage.COMP_EXPRESSION:
				sequence_CompExpression(context, (CompExpression) semanticObject); 
				return; 
			case LosCheetosPackage.CONS_EXPRESSION:
				sequence_ConsExpression(context, (ConsExpression) semanticObject); 
				return; 
			case LosCheetosPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case LosCheetosPackage.DOUBLE_EXPRESSION:
				sequence_DoubleExpression(context, (DoubleExpression) semanticObject); 
				return; 
			case LosCheetosPackage.EMPTY_EXPRESSION:
				sequence_EmptyExpression(context, (EmptyExpression) semanticObject); 
				return; 
			case LosCheetosPackage.FRAC_EXPRESSION:
				sequence_FracExpression(context, (FracExpression) semanticObject); 
				return; 
			case LosCheetosPackage.FUNCTION_CALL_EXPRESSION:
				sequence_FunctionCallExpression(context, (FunctionCallExpression) semanticObject); 
				return; 
			case LosCheetosPackage.IF_EXPRESSION:
				sequence_IfExpression(context, (IfExpression) semanticObject); 
				return; 
			case LosCheetosPackage.INT_EXPRESSION:
				sequence_IntExpression(context, (IntExpression) semanticObject); 
				return; 
			case LosCheetosPackage.LENGTH_EXPRESSION:
				sequence_LengthExpression(context, (LengthExpression) semanticObject); 
				return; 
			case LosCheetosPackage.LIST_EXPRESSION:
				sequence_ListExpression(context, (ListExpression) semanticObject); 
				return; 
			case LosCheetosPackage.MY_RACKET_PROGRAM:
				sequence_MyRacketProgram(context, (MyRacketProgram) semanticObject); 
				return; 
			case LosCheetosPackage.PARAM_CALL_EXPRESSION:
				sequence_ParamCallExpression(context, (ParamCallExpression) semanticObject); 
				return; 
			case LosCheetosPackage.PRINT_EXPRESSION:
				sequence_PrintExpression(context, (PrintExpression) semanticObject); 
				return; 
			case LosCheetosPackage.STR_APP_EXPRESSION:
				sequence_StrAppExpression(context, (StrAppExpression) semanticObject); 
				return; 
			case LosCheetosPackage.STR_EXPRESSION:
				sequence_StrExpression(context, (StrExpression) semanticObject); 
				return; 
			case LosCheetosPackage.STR_LEN_EXPRESSION:
				sequence_StrLenExpression(context, (StrLenExpression) semanticObject); 
				return; 
			case LosCheetosPackage.WHILE_EXPRESSION:
				sequence_WhileExpression(context, (WhileExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns ArithExpression
	 *     NumberExpression returns ArithExpression
	 *     ArithExpression returns ArithExpression
	 *
	 * Constraint:
	 *     (
	 *         (op='+' | op='-' | op='*' | op='/') 
	 *         (arg1=NumberExpression | arg1=ParamCallExpression | arg1=FunctionCallExpression) 
	 *         (oargs+=NumberExpression | oargs+=ParamCallExpression | oargs+=FunctionCallExpression)+
	 *     )
	 */
	protected void sequence_ArithExpression(ISerializationContext context, ArithExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolCompExpression
	 *     SimpleExpression returns BoolCompExpression
	 *     BoolExpression returns BoolCompExpression
	 *     BoolCompExpression returns BoolCompExpression
	 *
	 * Constraint:
	 *     (e1=Expression e2=Expression)
	 */
	protected void sequence_BoolCompExpression(ISerializationContext context, BoolCompExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.BOOL_COMP_EXPRESSION__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.BOOL_COMP_EXPRESSION__E1));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.BOOL_COMP_EXPRESSION__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.BOOL_COMP_EXPRESSION__E2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolCompExpressionAccess().getE1ExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getBoolCompExpressionAccess().getE2ExpressionParserRuleCall_3_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolConstant
	 *     SimpleExpression returns BoolConstant
	 *     BoolExpression returns BoolConstant
	 *     BoolConstant returns BoolConstant
	 *
	 * Constraint:
	 *     value?='#t'?
	 */
	protected void sequence_BoolConstant(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolNumCompExpression
	 *     SimpleExpression returns BoolNumCompExpression
	 *     BoolExpression returns BoolNumCompExpression
	 *     BoolNumCompExpression returns BoolNumCompExpression
	 *
	 * Constraint:
	 *     (
	 *         (comp='<' | comp='>' | comp='=' | comp='<=' | comp='>=') 
	 *         (e1=NumberExpression | e1=ParamCallExpression | e1=FunctionCallExpression) 
	 *         (e2=NumberExpression | e2=ParamCallExpression | e2=FunctionCallExpression)
	 *     )
	 */
	protected void sequence_BoolNumCompExpression(ISerializationContext context, BoolNumCompExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CarExpression
	 *     SimpleExpression returns CarExpression
	 *     ListOpExpression returns CarExpression
	 *     CarExpression returns CarExpression
	 *
	 * Constraint:
	 *     (list=ListExpression | list=CdrExpression | list=ParamCallExpression | list=FunctionCallExpression)
	 */
	protected void sequence_CarExpression(ISerializationContext context, CarExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CdrExpression
	 *     SimpleExpression returns CdrExpression
	 *     ListOpExpression returns CdrExpression
	 *     CdrExpression returns CdrExpression
	 *
	 * Constraint:
	 *     (list=ListExpression | list=CdrExpression | list=ParamCallExpression | list=FunctionCallExpression)
	 */
	protected void sequence_CdrExpression(ISerializationContext context, CdrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CompExpression
	 *     NumberExpression returns CompExpression
	 *     CompExpression returns CompExpression
	 *
	 * Constraint:
	 *     (real=INT imag=INT)
	 */
	protected void sequence_CompExpression(ISerializationContext context, CompExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.COMP_EXPRESSION__REAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.COMP_EXPRESSION__REAL));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.COMP_EXPRESSION__IMAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.COMP_EXPRESSION__IMAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompExpressionAccess().getRealINTTerminalRuleCall_3_0(), semanticObject.getReal());
		feeder.accept(grammarAccess.getCompExpressionAccess().getImagINTTerminalRuleCall_4_0(), semanticObject.getImag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ConsExpression
	 *     SimpleExpression returns ConsExpression
	 *     ListOpExpression returns ConsExpression
	 *     ConsExpression returns ConsExpression
	 *
	 * Constraint:
	 *     (expr=Expression list=ListExpression)
	 */
	protected void sequence_ConsExpression(ISerializationContext context, ConsExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.CONS_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.CONS_EXPRESSION__EXPR));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.CONS_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.CONS_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConsExpressionAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getConsExpressionAccess().getListListExpressionParserRuleCall_3_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Define returns Define
	 *
	 * Constraint:
	 *     (name=ID params+=ID* body+=Expression+)
	 */
	protected void sequence_Define(ISerializationContext context, Define semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns DoubleExpression
	 *     NumberExpression returns DoubleExpression
	 *     DoubleExpression returns DoubleExpression
	 *
	 * Constraint:
	 *     (int=INT dec=INT)
	 */
	protected void sequence_DoubleExpression(ISerializationContext context, DoubleExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.DOUBLE_EXPRESSION__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.DOUBLE_EXPRESSION__INT));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.DOUBLE_EXPRESSION__DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.DOUBLE_EXPRESSION__DEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleExpressionAccess().getIntINTTerminalRuleCall_3_0(), semanticObject.getInt());
		feeder.accept(grammarAccess.getDoubleExpressionAccess().getDecINTTerminalRuleCall_4_0(), semanticObject.getDec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns EmptyExpression
	 *     SimpleExpression returns EmptyExpression
	 *     ListOpExpression returns EmptyExpression
	 *     EmptyExpression returns EmptyExpression
	 *
	 * Constraint:
	 *     (list=ListExpression | list=ListOpExpression | list=FunctionCallExpression)
	 */
	protected void sequence_EmptyExpression(ISerializationContext context, EmptyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FracExpression
	 *     NumberExpression returns FracExpression
	 *     FracExpression returns FracExpression
	 *
	 * Constraint:
	 *     (num=INT dec=INT)
	 */
	protected void sequence_FracExpression(ISerializationContext context, FracExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.FRAC_EXPRESSION__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.FRAC_EXPRESSION__NUM));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.FRAC_EXPRESSION__DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.FRAC_EXPRESSION__DEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFracExpressionAccess().getNumINTTerminalRuleCall_3_0(), semanticObject.getNum());
		feeder.accept(grammarAccess.getFracExpressionAccess().getDecINTTerminalRuleCall_4_0(), semanticObject.getDec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FunctionCallExpression
	 *     FunctionCallExpression returns FunctionCallExpression
	 *
	 * Constraint:
	 *     (function=[Define|ID] args+=Expression*)
	 */
	protected void sequence_FunctionCallExpression(ISerializationContext context, FunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IfExpression
	 *     IfExpression returns IfExpression
	 *
	 * Constraint:
	 *     (cond=BoolExpression then=Expression else=Expression)
	 */
	protected void sequence_IfExpression(ISerializationContext context, IfExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__COND));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__THEN));
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.IF_EXPRESSION__ELSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIfExpressionAccess().getCondBoolExpressionParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_3_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntExpression
	 *     NumberExpression returns IntExpression
	 *     IntExpression returns IntExpression
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntExpression(ISerializationContext context, IntExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.INT_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.INT_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntExpressionAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns LengthExpression
	 *     SimpleExpression returns LengthExpression
	 *     ListOpExpression returns LengthExpression
	 *     LengthExpression returns LengthExpression
	 *
	 * Constraint:
	 *     (list=ListExpression | list=CdrExpression | list=ParamCallExpression | list=ConsExpression | list=FunctionCallExpression)
	 */
	protected void sequence_LengthExpression(ISerializationContext context, LengthExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListExpression
	 *     SimpleExpression returns ListExpression
	 *     ListExpression returns ListExpression
	 *
	 * Constraint:
	 *     args+=Expression*
	 */
	protected void sequence_ListExpression(ISerializationContext context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MyRacketProgram returns MyRacketProgram
	 *
	 * Constraint:
	 *     (defines+=Define* executions+=Expression+)
	 */
	protected void sequence_MyRacketProgram(ISerializationContext context, MyRacketProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ParamCallExpression
	 *     ParamCallExpression returns ParamCallExpression
	 *
	 * Constraint:
	 *     param=ID
	 */
	protected void sequence_ParamCallExpression(ISerializationContext context, ParamCallExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.PARAM_CALL_EXPRESSION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.PARAM_CALL_EXPRESSION__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamCallExpressionAccess().getParamIDTerminalRuleCall_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PrintExpression
	 *     SimpleExpression returns PrintExpression
	 *     PrintExpression returns PrintExpression
	 *
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_PrintExpression(ISerializationContext context, PrintExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.PRINT_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.PRINT_EXPRESSION__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintExpressionAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StrAppExpression
	 *     SimpleExpression returns StrAppExpression
	 *     StrOpExpression returns StrAppExpression
	 *     StrAppExpression returns StrAppExpression
	 *
	 * Constraint:
	 *     (
	 *         (str1=StrExpression | str1=ParamCallExpression | str1=FunctionCallExpression) 
	 *         (str2=StrExpression | str2=ParamCallExpression | str2=FunctionCallExpression)
	 *     )
	 */
	protected void sequence_StrAppExpression(ISerializationContext context, StrAppExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StrExpression
	 *     SimpleExpression returns StrExpression
	 *     StrExpression returns StrExpression
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StrExpression(ISerializationContext context, StrExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.STR_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.STR_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStrExpressionAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StrLenExpression
	 *     SimpleExpression returns StrLenExpression
	 *     StrOpExpression returns StrLenExpression
	 *     StrLenExpression returns StrLenExpression
	 *
	 * Constraint:
	 *     str=StrExpression
	 */
	protected void sequence_StrLenExpression(ISerializationContext context, StrLenExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LosCheetosPackage.Literals.STR_LEN_EXPRESSION__STR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LosCheetosPackage.Literals.STR_LEN_EXPRESSION__STR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStrLenExpressionAccess().getStrStrExpressionParserRuleCall_2_0(), semanticObject.getStr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns WhileExpression
	 *     WhileExpression returns WhileExpression
	 *
	 * Constraint:
	 *     (cond=BoolExpression do+=Expression+)
	 */
	protected void sequence_WhileExpression(ISerializationContext context, WhileExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
