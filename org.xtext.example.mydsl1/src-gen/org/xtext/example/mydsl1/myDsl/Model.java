/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Model#getIfs <em>Ifs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Model#getSpecs <em>Specs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Interface}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel_Ifs()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getIfs();

  /**
   * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Spec}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel_Specs()
   * @model containment="true"
   * @generated
   */
  EList<Spec> getSpecs();

} // Model
