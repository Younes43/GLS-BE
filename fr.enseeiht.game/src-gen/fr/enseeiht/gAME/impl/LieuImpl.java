/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME.impl;

import fr.enseeiht.gAME.Connaissance;
import fr.enseeiht.gAME.Description;
import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Lieu;
import fr.enseeiht.gAME.Objet;
import fr.enseeiht.gAME.Personne;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.impl.LieuImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.LieuImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.LieuImpl#getObjets <em>Objets</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.LieuImpl#getConnaissances <em>Connaissances</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.LieuImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieuImpl extends MinimalEObjectImpl.Container implements Lieu
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptions()
   * @generated
   * @ordered
   */
  protected EList<Description> descriptions;

  /**
   * The cached value of the '{@link #getObjets() <em>Objets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjets()
   * @generated
   * @ordered
   */
  protected EList<Objet> objets;

  /**
   * The cached value of the '{@link #getConnaissances() <em>Connaissances</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnaissances()
   * @generated
   * @ordered
   */
  protected EList<Connaissance> connaissances;

  /**
   * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonnes()
   * @generated
   * @ordered
   */
  protected EList<Personne> personnes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LieuImpl()
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
    return GAMEPackage.Literals.LIEU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.LIEU__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Description> getDescriptions()
  {
    if (descriptions == null)
    {
      descriptions = new EObjectContainmentEList<Description>(Description.class, this, GAMEPackage.LIEU__DESCRIPTIONS);
    }
    return descriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Objet> getObjets()
  {
    if (objets == null)
    {
      objets = new EObjectResolvingEList<Objet>(Objet.class, this, GAMEPackage.LIEU__OBJETS);
    }
    return objets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Connaissance> getConnaissances()
  {
    if (connaissances == null)
    {
      connaissances = new EObjectResolvingEList<Connaissance>(Connaissance.class, this, GAMEPackage.LIEU__CONNAISSANCES);
    }
    return connaissances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Personne> getPersonnes()
  {
    if (personnes == null)
    {
      personnes = new EObjectResolvingEList<Personne>(Personne.class, this, GAMEPackage.LIEU__PERSONNES);
    }
    return personnes;
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
      case GAMEPackage.LIEU__DESCRIPTIONS:
        return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
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
      case GAMEPackage.LIEU__NAME:
        return getName();
      case GAMEPackage.LIEU__DESCRIPTIONS:
        return getDescriptions();
      case GAMEPackage.LIEU__OBJETS:
        return getObjets();
      case GAMEPackage.LIEU__CONNAISSANCES:
        return getConnaissances();
      case GAMEPackage.LIEU__PERSONNES:
        return getPersonnes();
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
      case GAMEPackage.LIEU__NAME:
        setName((String)newValue);
        return;
      case GAMEPackage.LIEU__DESCRIPTIONS:
        getDescriptions().clear();
        getDescriptions().addAll((Collection<? extends Description>)newValue);
        return;
      case GAMEPackage.LIEU__OBJETS:
        getObjets().clear();
        getObjets().addAll((Collection<? extends Objet>)newValue);
        return;
      case GAMEPackage.LIEU__CONNAISSANCES:
        getConnaissances().clear();
        getConnaissances().addAll((Collection<? extends Connaissance>)newValue);
        return;
      case GAMEPackage.LIEU__PERSONNES:
        getPersonnes().clear();
        getPersonnes().addAll((Collection<? extends Personne>)newValue);
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
      case GAMEPackage.LIEU__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GAMEPackage.LIEU__DESCRIPTIONS:
        getDescriptions().clear();
        return;
      case GAMEPackage.LIEU__OBJETS:
        getObjets().clear();
        return;
      case GAMEPackage.LIEU__CONNAISSANCES:
        getConnaissances().clear();
        return;
      case GAMEPackage.LIEU__PERSONNES:
        getPersonnes().clear();
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
      case GAMEPackage.LIEU__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GAMEPackage.LIEU__DESCRIPTIONS:
        return descriptions != null && !descriptions.isEmpty();
      case GAMEPackage.LIEU__OBJETS:
        return objets != null && !objets.isEmpty();
      case GAMEPackage.LIEU__CONNAISSANCES:
        return connaissances != null && !connaissances.isEmpty();
      case GAMEPackage.LIEU__PERSONNES:
        return personnes != null && !personnes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LieuImpl
