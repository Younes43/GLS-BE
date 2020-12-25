/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gAME.impl;

import fr.enseeiht.gAME.Condition;
import fr.enseeiht.gAME.Description;
import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Objet;
import fr.enseeiht.gAME.Visibilite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetImpl#getVisibilite <em>Visibilite</em>}</li>
 *   <li>{@link fr.enseeiht.gAME.impl.ObjetImpl#getConditionsVisibilite <em>Conditions Visibilite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetImpl extends MinimalEObjectImpl.Container implements Objet
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
   * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected static final int TAILLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected int taille = TAILLE_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibilite() <em>Visibilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilite()
   * @generated
   * @ordered
   */
  protected static final Visibilite VISIBILITE_EDEFAULT = Visibilite.VISIBLE;

  /**
   * The cached value of the '{@link #getVisibilite() <em>Visibilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilite()
   * @generated
   * @ordered
   */
  protected Visibilite visibilite = VISIBILITE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionsVisibilite() <em>Conditions Visibilite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsVisibilite()
   * @generated
   * @ordered
   */
  protected Condition conditionsVisibilite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetImpl()
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
    return GAMEPackage.Literals.OBJET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET__NAME, oldName, name));
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
      descriptions = new EObjectContainmentEList<Description>(Description.class, this, GAMEPackage.OBJET__DESCRIPTIONS);
    }
    return descriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTaille()
  {
    return taille;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaille(int newTaille)
  {
    int oldTaille = taille;
    taille = newTaille;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET__TAILLE, oldTaille, taille));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Visibilite getVisibilite()
  {
    return visibilite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibilite(Visibilite newVisibilite)
  {
    Visibilite oldVisibilite = visibilite;
    visibilite = newVisibilite == null ? VISIBILITE_EDEFAULT : newVisibilite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET__VISIBILITE, oldVisibilite, visibilite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getConditionsVisibilite()
  {
    return conditionsVisibilite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionsVisibilite(Condition newConditionsVisibilite, NotificationChain msgs)
  {
    Condition oldConditionsVisibilite = conditionsVisibilite;
    conditionsVisibilite = newConditionsVisibilite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET__CONDITIONS_VISIBILITE, oldConditionsVisibilite, newConditionsVisibilite);
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
  public void setConditionsVisibilite(Condition newConditionsVisibilite)
  {
    if (newConditionsVisibilite != conditionsVisibilite)
    {
      NotificationChain msgs = null;
      if (conditionsVisibilite != null)
        msgs = ((InternalEObject)conditionsVisibilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.OBJET__CONDITIONS_VISIBILITE, null, msgs);
      if (newConditionsVisibilite != null)
        msgs = ((InternalEObject)newConditionsVisibilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.OBJET__CONDITIONS_VISIBILITE, null, msgs);
      msgs = basicSetConditionsVisibilite(newConditionsVisibilite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.OBJET__CONDITIONS_VISIBILITE, newConditionsVisibilite, newConditionsVisibilite));
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
      case GAMEPackage.OBJET__DESCRIPTIONS:
        return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
      case GAMEPackage.OBJET__CONDITIONS_VISIBILITE:
        return basicSetConditionsVisibilite(null, msgs);
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
      case GAMEPackage.OBJET__NAME:
        return getName();
      case GAMEPackage.OBJET__DESCRIPTIONS:
        return getDescriptions();
      case GAMEPackage.OBJET__TAILLE:
        return getTaille();
      case GAMEPackage.OBJET__VISIBILITE:
        return getVisibilite();
      case GAMEPackage.OBJET__CONDITIONS_VISIBILITE:
        return getConditionsVisibilite();
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
      case GAMEPackage.OBJET__NAME:
        setName((String)newValue);
        return;
      case GAMEPackage.OBJET__DESCRIPTIONS:
        getDescriptions().clear();
        getDescriptions().addAll((Collection<? extends Description>)newValue);
        return;
      case GAMEPackage.OBJET__TAILLE:
        setTaille((Integer)newValue);
        return;
      case GAMEPackage.OBJET__VISIBILITE:
        setVisibilite((Visibilite)newValue);
        return;
      case GAMEPackage.OBJET__CONDITIONS_VISIBILITE:
        setConditionsVisibilite((Condition)newValue);
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
      case GAMEPackage.OBJET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GAMEPackage.OBJET__DESCRIPTIONS:
        getDescriptions().clear();
        return;
      case GAMEPackage.OBJET__TAILLE:
        setTaille(TAILLE_EDEFAULT);
        return;
      case GAMEPackage.OBJET__VISIBILITE:
        setVisibilite(VISIBILITE_EDEFAULT);
        return;
      case GAMEPackage.OBJET__CONDITIONS_VISIBILITE:
        setConditionsVisibilite((Condition)null);
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
      case GAMEPackage.OBJET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GAMEPackage.OBJET__DESCRIPTIONS:
        return descriptions != null && !descriptions.isEmpty();
      case GAMEPackage.OBJET__TAILLE:
        return taille != TAILLE_EDEFAULT;
      case GAMEPackage.OBJET__VISIBILITE:
        return visibilite != VISIBILITE_EDEFAULT;
      case GAMEPackage.OBJET__CONDITIONS_VISIBILITE:
        return conditionsVisibilite != null;
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
    result.append(", taille: ");
    result.append(taille);
    result.append(", visibilite: ");
    result.append(visibilite);
    result.append(')');
    return result.toString();
  }

} //ObjetImpl