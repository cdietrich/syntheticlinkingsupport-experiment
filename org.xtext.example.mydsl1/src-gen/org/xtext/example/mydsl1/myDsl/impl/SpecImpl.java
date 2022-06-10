/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl1.myDsl.Interface;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.Part;
import org.xtext.example.mydsl1.myDsl.Spec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.SpecImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.SpecImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecImpl extends MinimalEObjectImpl.Container implements Spec
{
  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected Part part;

  /**
   * The cached value of the '{@link #getUsedInterfaces() <em>Used Interfaces</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> usedInterfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecImpl()
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
    return MyDslPackage.Literals.SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Part getPart()
  {
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPart(Part newPart, NotificationChain msgs)
  {
    Part oldPart = part;
    part = newPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__PART, oldPart, newPart);
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
  public void setPart(Part newPart)
  {
    if (newPart != part)
    {
      NotificationChain msgs = null;
      if (part != null)
        msgs = ((InternalEObject)part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__PART, null, msgs);
      if (newPart != null)
        msgs = ((InternalEObject)newPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__PART, null, msgs);
      msgs = basicSetPart(newPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__PART, newPart, newPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Interface> getUsedInterfaces()
  {
    if (usedInterfaces == null)
    {
      usedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, MyDslPackage.SPEC__USED_INTERFACES);
    }
    return usedInterfaces;
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
      case MyDslPackage.SPEC__PART:
        return basicSetPart(null, msgs);
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
      case MyDslPackage.SPEC__PART:
        return getPart();
      case MyDslPackage.SPEC__USED_INTERFACES:
        return getUsedInterfaces();
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
      case MyDslPackage.SPEC__PART:
        setPart((Part)newValue);
        return;
      case MyDslPackage.SPEC__USED_INTERFACES:
        getUsedInterfaces().clear();
        getUsedInterfaces().addAll((Collection<? extends Interface>)newValue);
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
      case MyDslPackage.SPEC__PART:
        setPart((Part)null);
        return;
      case MyDslPackage.SPEC__USED_INTERFACES:
        getUsedInterfaces().clear();
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
      case MyDslPackage.SPEC__PART:
        return part != null;
      case MyDslPackage.SPEC__USED_INTERFACES:
        return usedInterfaces != null && !usedInterfaces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SpecImpl