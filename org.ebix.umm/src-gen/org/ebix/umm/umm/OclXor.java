/**
 */
package org.ebix.umm.umm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Xor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.OclXor#getLeft <em>Left</em>}</li>
 *   <li>{@link org.ebix.umm.umm.OclXor#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getOclXor()
 * @model
 * @generated
 */
public interface OclXor extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(OclExpression)
   * @see org.ebix.umm.umm.UmmPackage#getOclXor_Left()
   * @model containment="true"
   * @generated
   */
  OclExpression getLeft();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclXor#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(OclExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(OclExpression)
   * @see org.ebix.umm.umm.UmmPackage#getOclXor_Right()
   * @model containment="true"
   * @generated
   */
  OclExpression getRight();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclXor#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(OclExpression value);

} // OclXor
