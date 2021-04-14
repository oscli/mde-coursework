/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.bodyElement;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryColour;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>string Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.stringDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.stringDeclarationImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.stringDeclarationImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.stringDeclarationImpl#getWord <em>Word</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stringDeclarationImpl extends pageElementImpl implements stringDeclaration
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
   * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontColor()
   * @generated
   * @ordered
   */
  protected primaryColour fontColor;

  /**
   * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontSize()
   * @generated
   * @ordered
   */
  protected static final int FONT_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontSize()
   * @generated
   * @ordered
   */
  protected int fontSize = FONT_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected static final String WORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected String word = WORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stringDeclarationImpl()
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
    return PageGeneratorLanguarePackage.Literals.STRING_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.STRING_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public primaryColour getFontColor()
  {
    return fontColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontColor(primaryColour newFontColor, NotificationChain msgs)
  {
    primaryColour oldFontColor = fontColor;
    fontColor = newFontColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR, oldFontColor, newFontColor);
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
  public void setFontColor(primaryColour newFontColor)
  {
    if (newFontColor != fontColor)
    {
      NotificationChain msgs = null;
      if (fontColor != null)
        msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR, null, msgs);
      if (newFontColor != null)
        msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR, null, msgs);
      msgs = basicSetFontColor(newFontColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR, newFontColor, newFontColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getFontSize()
  {
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFontSize(int newFontSize)
  {
    int oldFontSize = fontSize;
    fontSize = newFontSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_SIZE, oldFontSize, fontSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWord()
  {
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWord(String newWord)
  {
    String oldWord = word;
    word = newWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.STRING_DECLARATION__WORD, oldWord, word));
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
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR:
        return basicSetFontColor(null, msgs);
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
      case PageGeneratorLanguarePackage.STRING_DECLARATION__NAME:
        return getName();
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR:
        return getFontColor();
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_SIZE:
        return getFontSize();
      case PageGeneratorLanguarePackage.STRING_DECLARATION__WORD:
        return getWord();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PageGeneratorLanguarePackage.STRING_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR:
        setFontColor((primaryColour)newValue);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_SIZE:
        setFontSize((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__WORD:
        setWord((String)newValue);
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
      case PageGeneratorLanguarePackage.STRING_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR:
        setFontColor((primaryColour)null);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_SIZE:
        setFontSize(FONT_SIZE_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__WORD:
        setWord(WORD_EDEFAULT);
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
      case PageGeneratorLanguarePackage.STRING_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_COLOR:
        return fontColor != null;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__FONT_SIZE:
        return fontSize != FONT_SIZE_EDEFAULT;
      case PageGeneratorLanguarePackage.STRING_DECLARATION__WORD:
        return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == bodyElement.class)
    {
      switch (derivedFeatureID)
      {
        case PageGeneratorLanguarePackage.STRING_DECLARATION__NAME: return PageGeneratorLanguarePackage.BODY_ELEMENT__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == bodyElement.class)
    {
      switch (baseFeatureID)
      {
        case PageGeneratorLanguarePackage.BODY_ELEMENT__NAME: return PageGeneratorLanguarePackage.STRING_DECLARATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", fontSize: ");
    result.append(fontSize);
    result.append(", word: ");
    result.append(word);
    result.append(')');
    return result.toString();
  }

} //stringDeclarationImpl
