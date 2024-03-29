/**
 * generated by Xtext 2.11.0
 */
package edu.upb.lp.isc.losCheetos.impl;

import edu.upb.lp.isc.losCheetos.BoolExpression;
import edu.upb.lp.isc.losCheetos.Expression;
import edu.upb.lp.isc.losCheetos.LosCheetosPackage;
import edu.upb.lp.isc.losCheetos.WhileExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losCheetos.impl.WhileExpressionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losCheetos.impl.WhileExpressionImpl#getDo <em>Do</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileExpressionImpl extends ExpressionImpl implements WhileExpression
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected BoolExpression cond;

  /**
   * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected EList<Expression> do_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LosCheetosPackage.Literals.WHILE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolExpression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(BoolExpression newCond, NotificationChain msgs)
  {
    BoolExpression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LosCheetosPackage.WHILE_EXPRESSION__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCond(BoolExpression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LosCheetosPackage.WHILE_EXPRESSION__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LosCheetosPackage.WHILE_EXPRESSION__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LosCheetosPackage.WHILE_EXPRESSION__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getDo()
  {
    if (do_ == null)
    {
      do_ = new EObjectContainmentEList<Expression>(Expression.class, this, LosCheetosPackage.WHILE_EXPRESSION__DO);
    }
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LosCheetosPackage.WHILE_EXPRESSION__COND:
        return basicSetCond(null, msgs);
      case LosCheetosPackage.WHILE_EXPRESSION__DO:
        return ((InternalEList<?>)getDo()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LosCheetosPackage.WHILE_EXPRESSION__COND:
        return getCond();
      case LosCheetosPackage.WHILE_EXPRESSION__DO:
        return getDo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LosCheetosPackage.WHILE_EXPRESSION__COND:
        setCond((BoolExpression)newValue);
        return;
      case LosCheetosPackage.WHILE_EXPRESSION__DO:
        getDo().clear();
        getDo().addAll((Collection<? extends Expression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LosCheetosPackage.WHILE_EXPRESSION__COND:
        setCond((BoolExpression)null);
        return;
      case LosCheetosPackage.WHILE_EXPRESSION__DO:
        getDo().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LosCheetosPackage.WHILE_EXPRESSION__COND:
        return cond != null;
      case LosCheetosPackage.WHILE_EXPRESSION__DO:
        return do_ != null && !do_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhileExpressionImpl
