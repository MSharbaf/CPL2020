/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.cpl.cPL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.completeoclcs.impl.CompleteOCLDocumentCSImpl;
import org.eclipse.ocl.xtext.completeoclcs.ContextDeclCS;

import org.xtext.example.cpl.cPL.CPLPackage;
import org.xtext.example.cpl.cPL.MessageCP;
import org.xtext.example.cpl.cPL.RelationCP;
import org.xtext.example.cpl.cPL.TopLevelCP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cpl.cPL.impl.TopLevelCPImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.cpl.cPL.impl.TopLevelCPImpl#getOwnedImports <em>Owned Imports</em>}</li>
 *   <li>{@link org.xtext.example.cpl.cPL.impl.TopLevelCPImpl#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link org.xtext.example.cpl.cPL.impl.TopLevelCPImpl#getOwnedRelation <em>Owned Relation</em>}</li>
 *   <li>{@link org.xtext.example.cpl.cPL.impl.TopLevelCPImpl#getOwnedMessage <em>Owned Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopLevelCPImpl extends CompleteOCLDocumentCSImpl implements TopLevelCP
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
   * The cached value of the '{@link #getOwnedImports() <em>Owned Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedImports()
   * @generated
   * @ordered
   */
  protected EList<ImportCS> ownedImports;

  /**
   * The cached value of the '{@link #getOwnedContexts() <em>Owned Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedContexts()
   * @generated
   * @ordered
   */
  protected EList<ContextDeclCS> ownedContexts;

  /**
   * The cached value of the '{@link #getOwnedRelation() <em>Owned Relation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedRelation()
   * @generated
   * @ordered
   */
  protected EList<RelationCP> ownedRelation;

  /**
   * The cached value of the '{@link #getOwnedMessage() <em>Owned Message</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedMessage()
   * @generated
   * @ordered
   */
  protected EList<MessageCP> ownedMessage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelCPImpl()
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
    return CPLPackage.Literals.TOP_LEVEL_CP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPLPackage.TOP_LEVEL_CP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportCS> getOwnedImports()
  {
    if (ownedImports == null)
    {
      ownedImports = new EObjectContainmentEList<ImportCS>(ImportCS.class, this, CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS);
    }
    return ownedImports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContextDeclCS> getOwnedContexts()
  {
    if (ownedContexts == null)
    {
      ownedContexts = new EObjectContainmentEList<ContextDeclCS>(ContextDeclCS.class, this, CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS);
    }
    return ownedContexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationCP> getOwnedRelation()
  {
    if (ownedRelation == null)
    {
      ownedRelation = new EObjectContainmentEList<RelationCP>(RelationCP.class, this, CPLPackage.TOP_LEVEL_CP__OWNED_RELATION);
    }
    return ownedRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageCP> getOwnedMessage()
  {
    if (ownedMessage == null)
    {
      ownedMessage = new EObjectContainmentEList<MessageCP>(MessageCP.class, this, CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE);
    }
    return ownedMessage;
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
      case CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS:
        return ((InternalEList<?>)getOwnedImports()).basicRemove(otherEnd, msgs);
      case CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS:
        return ((InternalEList<?>)getOwnedContexts()).basicRemove(otherEnd, msgs);
      case CPLPackage.TOP_LEVEL_CP__OWNED_RELATION:
        return ((InternalEList<?>)getOwnedRelation()).basicRemove(otherEnd, msgs);
      case CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE:
        return ((InternalEList<?>)getOwnedMessage()).basicRemove(otherEnd, msgs);
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
      case CPLPackage.TOP_LEVEL_CP__NAME:
        return getName();
      case CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS:
        return getOwnedImports();
      case CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS:
        return getOwnedContexts();
      case CPLPackage.TOP_LEVEL_CP__OWNED_RELATION:
        return getOwnedRelation();
      case CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE:
        return getOwnedMessage();
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
      case CPLPackage.TOP_LEVEL_CP__NAME:
        setName((String)newValue);
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS:
        getOwnedImports().clear();
        getOwnedImports().addAll((Collection<? extends ImportCS>)newValue);
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS:
        getOwnedContexts().clear();
        getOwnedContexts().addAll((Collection<? extends ContextDeclCS>)newValue);
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_RELATION:
        getOwnedRelation().clear();
        getOwnedRelation().addAll((Collection<? extends RelationCP>)newValue);
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE:
        getOwnedMessage().clear();
        getOwnedMessage().addAll((Collection<? extends MessageCP>)newValue);
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
      case CPLPackage.TOP_LEVEL_CP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS:
        getOwnedImports().clear();
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS:
        getOwnedContexts().clear();
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_RELATION:
        getOwnedRelation().clear();
        return;
      case CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE:
        getOwnedMessage().clear();
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
      case CPLPackage.TOP_LEVEL_CP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CPLPackage.TOP_LEVEL_CP__OWNED_IMPORTS:
        return ownedImports != null && !ownedImports.isEmpty();
      case CPLPackage.TOP_LEVEL_CP__OWNED_CONTEXTS:
        return ownedContexts != null && !ownedContexts.isEmpty();
      case CPLPackage.TOP_LEVEL_CP__OWNED_RELATION:
        return ownedRelation != null && !ownedRelation.isEmpty();
      case CPLPackage.TOP_LEVEL_CP__OWNED_MESSAGE:
        return ownedMessage != null && !ownedMessage.isEmpty();
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

} //TopLevelCPImpl