/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Head;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.headElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadImpl#getHeadElements <em>Head Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadImpl extends pageElementImpl implements Head
{
  /**
   * The cached value of the '{@link #getHeadElements() <em>Head Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadElements()
   * @generated
   * @ordered
   */
  protected EList<headElement> headElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeadImpl()
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
    return PageGeneratorLanguarePackage.Literals.HEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<headElement> getHeadElements()
  {
    if (headElements == null)
    {
      headElements = new EObjectContainmentEList<headElement>(headElement.class, this, PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS);
    }
    return headElements;
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
      case PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS:
        return ((InternalEList<?>)getHeadElements()).basicRemove(otherEnd, msgs);
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
      case PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS:
        return getHeadElements();
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
      case PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS:
        getHeadElements().clear();
        getHeadElements().addAll((Collection<? extends headElement>)newValue);
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
      case PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS:
        getHeadElements().clear();
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
      case PageGeneratorLanguarePackage.HEAD__HEAD_ELEMENTS:
        return headElements != null && !headElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HeadImpl
