/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.Interaction#getChoix <em>Choix</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gAME.GAMEPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Choix</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gAME.Choix}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choix</em>' containment reference list.
   * @see fr.enseeiht.gAME.GAMEPackage#getInteraction_Choix()
   * @model containment="true"
   * @generated
   */
  EList<Choix> getChoix();

} // Interaction
