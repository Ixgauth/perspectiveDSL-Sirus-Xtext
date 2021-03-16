/**
 * generated by Xtext 2.22.0
 */
package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Type</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveActionType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Type</em>' attribute.
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveActionType
   * @see #setActionType(PerspectiveActionType)
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage#getAction_ActionType()
   * @model
   * @generated
   */
  PerspectiveActionType getActionType();

  /**
   * Sets the value of the '{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getActionType <em>Action Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Type</em>' attribute.
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveActionType
   * @see #getActionType()
   * @generated
   */
  void setActionType(PerspectiveActionType value);

  /**
   * Returns the value of the '<em><b>Role Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Name</em>' attribute.
   * @see #setRoleName(String)
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage#getAction_RoleName()
   * @model
   * @generated
   */
  String getRoleName();

  /**
   * Sets the value of the '{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getRoleName <em>Role Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Name</em>' attribute.
   * @see #getRoleName()
   * @generated
   */
  void setRoleName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Action
