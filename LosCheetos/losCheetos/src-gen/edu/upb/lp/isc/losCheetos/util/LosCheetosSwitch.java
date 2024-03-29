/**
 * generated by Xtext 2.11.0
 */
package edu.upb.lp.isc.losCheetos.util;

import edu.upb.lp.isc.losCheetos.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.losCheetos.LosCheetosPackage
 * @generated
 */
public class LosCheetosSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LosCheetosPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LosCheetosSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LosCheetosPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LosCheetosPackage.MY_RACKET_PROGRAM:
      {
        MyRacketProgram myRacketProgram = (MyRacketProgram)theEObject;
        T result = caseMyRacketProgram(myRacketProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.DEFINE:
      {
        Define define = (Define)theEObject;
        T result = caseDefine(define);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.SIMPLE_EXPRESSION:
      {
        SimpleExpression simpleExpression = (SimpleExpression)theEObject;
        T result = caseSimpleExpression(simpleExpression);
        if (result == null) result = caseExpression(simpleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.NUMBER_EXPRESSION:
      {
        NumberExpression numberExpression = (NumberExpression)theEObject;
        T result = caseNumberExpression(numberExpression);
        if (result == null) result = caseExpression(numberExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.INT_EXPRESSION:
      {
        IntExpression intExpression = (IntExpression)theEObject;
        T result = caseIntExpression(intExpression);
        if (result == null) result = caseNumberExpression(intExpression);
        if (result == null) result = caseExpression(intExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.DOUBLE_EXPRESSION:
      {
        DoubleExpression doubleExpression = (DoubleExpression)theEObject;
        T result = caseDoubleExpression(doubleExpression);
        if (result == null) result = caseNumberExpression(doubleExpression);
        if (result == null) result = caseExpression(doubleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.FRAC_EXPRESSION:
      {
        FracExpression fracExpression = (FracExpression)theEObject;
        T result = caseFracExpression(fracExpression);
        if (result == null) result = caseNumberExpression(fracExpression);
        if (result == null) result = caseExpression(fracExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.COMP_EXPRESSION:
      {
        CompExpression compExpression = (CompExpression)theEObject;
        T result = caseCompExpression(compExpression);
        if (result == null) result = caseNumberExpression(compExpression);
        if (result == null) result = caseExpression(compExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.BOOL_EXPRESSION:
      {
        BoolExpression boolExpression = (BoolExpression)theEObject;
        T result = caseBoolExpression(boolExpression);
        if (result == null) result = caseSimpleExpression(boolExpression);
        if (result == null) result = caseExpression(boolExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseBoolExpression(boolConstant);
        if (result == null) result = caseSimpleExpression(boolConstant);
        if (result == null) result = caseExpression(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.BOOL_NUM_COMP_EXPRESSION:
      {
        BoolNumCompExpression boolNumCompExpression = (BoolNumCompExpression)theEObject;
        T result = caseBoolNumCompExpression(boolNumCompExpression);
        if (result == null) result = caseBoolExpression(boolNumCompExpression);
        if (result == null) result = caseSimpleExpression(boolNumCompExpression);
        if (result == null) result = caseExpression(boolNumCompExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.BOOL_COMP_EXPRESSION:
      {
        BoolCompExpression boolCompExpression = (BoolCompExpression)theEObject;
        T result = caseBoolCompExpression(boolCompExpression);
        if (result == null) result = caseBoolExpression(boolCompExpression);
        if (result == null) result = caseSimpleExpression(boolCompExpression);
        if (result == null) result = caseExpression(boolCompExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.STR_EXPRESSION:
      {
        StrExpression strExpression = (StrExpression)theEObject;
        T result = caseStrExpression(strExpression);
        if (result == null) result = caseSimpleExpression(strExpression);
        if (result == null) result = caseExpression(strExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.LIST_EXPRESSION:
      {
        ListExpression listExpression = (ListExpression)theEObject;
        T result = caseListExpression(listExpression);
        if (result == null) result = caseSimpleExpression(listExpression);
        if (result == null) result = caseExpression(listExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.PRINT_EXPRESSION:
      {
        PrintExpression printExpression = (PrintExpression)theEObject;
        T result = casePrintExpression(printExpression);
        if (result == null) result = caseSimpleExpression(printExpression);
        if (result == null) result = caseExpression(printExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.LIST_OP_EXPRESSION:
      {
        ListOpExpression listOpExpression = (ListOpExpression)theEObject;
        T result = caseListOpExpression(listOpExpression);
        if (result == null) result = caseSimpleExpression(listOpExpression);
        if (result == null) result = caseExpression(listOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.CAR_EXPRESSION:
      {
        CarExpression carExpression = (CarExpression)theEObject;
        T result = caseCarExpression(carExpression);
        if (result == null) result = caseListOpExpression(carExpression);
        if (result == null) result = caseSimpleExpression(carExpression);
        if (result == null) result = caseExpression(carExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.CDR_EXPRESSION:
      {
        CdrExpression cdrExpression = (CdrExpression)theEObject;
        T result = caseCdrExpression(cdrExpression);
        if (result == null) result = caseListOpExpression(cdrExpression);
        if (result == null) result = caseSimpleExpression(cdrExpression);
        if (result == null) result = caseExpression(cdrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.LENGTH_EXPRESSION:
      {
        LengthExpression lengthExpression = (LengthExpression)theEObject;
        T result = caseLengthExpression(lengthExpression);
        if (result == null) result = caseListOpExpression(lengthExpression);
        if (result == null) result = caseSimpleExpression(lengthExpression);
        if (result == null) result = caseExpression(lengthExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.EMPTY_EXPRESSION:
      {
        EmptyExpression emptyExpression = (EmptyExpression)theEObject;
        T result = caseEmptyExpression(emptyExpression);
        if (result == null) result = caseListOpExpression(emptyExpression);
        if (result == null) result = caseSimpleExpression(emptyExpression);
        if (result == null) result = caseExpression(emptyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.CONS_EXPRESSION:
      {
        ConsExpression consExpression = (ConsExpression)theEObject;
        T result = caseConsExpression(consExpression);
        if (result == null) result = caseListOpExpression(consExpression);
        if (result == null) result = caseSimpleExpression(consExpression);
        if (result == null) result = caseExpression(consExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.STR_OP_EXPRESSION:
      {
        StrOpExpression strOpExpression = (StrOpExpression)theEObject;
        T result = caseStrOpExpression(strOpExpression);
        if (result == null) result = caseSimpleExpression(strOpExpression);
        if (result == null) result = caseExpression(strOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.STR_LEN_EXPRESSION:
      {
        StrLenExpression strLenExpression = (StrLenExpression)theEObject;
        T result = caseStrLenExpression(strLenExpression);
        if (result == null) result = caseStrOpExpression(strLenExpression);
        if (result == null) result = caseSimpleExpression(strLenExpression);
        if (result == null) result = caseExpression(strLenExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.STR_APP_EXPRESSION:
      {
        StrAppExpression strAppExpression = (StrAppExpression)theEObject;
        T result = caseStrAppExpression(strAppExpression);
        if (result == null) result = caseStrOpExpression(strAppExpression);
        if (result == null) result = caseSimpleExpression(strAppExpression);
        if (result == null) result = caseExpression(strAppExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.PARAM_CALL_EXPRESSION:
      {
        ParamCallExpression paramCallExpression = (ParamCallExpression)theEObject;
        T result = caseParamCallExpression(paramCallExpression);
        if (result == null) result = caseExpression(paramCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.ARITH_EXPRESSION:
      {
        ArithExpression arithExpression = (ArithExpression)theEObject;
        T result = caseArithExpression(arithExpression);
        if (result == null) result = caseNumberExpression(arithExpression);
        if (result == null) result = caseExpression(arithExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.IF_EXPRESSION:
      {
        IfExpression ifExpression = (IfExpression)theEObject;
        T result = caseIfExpression(ifExpression);
        if (result == null) result = caseExpression(ifExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.FUNCTION_CALL_EXPRESSION:
      {
        FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
        T result = caseFunctionCallExpression(functionCallExpression);
        if (result == null) result = caseExpression(functionCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosCheetosPackage.WHILE_EXPRESSION:
      {
        WhileExpression whileExpression = (WhileExpression)theEObject;
        T result = caseWhileExpression(whileExpression);
        if (result == null) result = caseExpression(whileExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>My Racket Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>My Racket Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMyRacketProgram(MyRacketProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefine(Define object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleExpression(SimpleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberExpression(NumberExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExpression(IntExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleExpression(DoubleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frac Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frac Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFracExpression(FracExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompExpression(CompExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolExpression(BoolExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Num Comp Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Num Comp Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolNumCompExpression(BoolNumCompExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Comp Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Comp Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolCompExpression(BoolCompExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrExpression(StrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListExpression(ListExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintExpression(PrintExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOpExpression(ListOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Car Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Car Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarExpression(CarExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cdr Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cdr Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCdrExpression(CdrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthExpression(LengthExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyExpression(EmptyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cons Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cons Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsExpression(ConsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrOpExpression(StrOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Len Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Len Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrLenExpression(StrLenExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str App Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str App Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrAppExpression(StrAppExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamCallExpression(ParamCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arith Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arith Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithExpression(ArithExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpression(IfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallExpression(FunctionCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileExpression(WhileExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LosCheetosSwitch
