/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Content;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Text;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.locationexpression;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryColour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getLpadding <em>Lpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getRpadding <em>Rpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getTpadding <em>Tpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getBpadding <em>Bpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.TextImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends bodyElementImpl implements Text
{
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
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected locationexpression location;

  /**
   * The default value of the '{@link #getLpadding() <em>Lpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLpadding()
   * @generated
   * @ordered
   */
  protected static final int LPADDING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLpadding() <em>Lpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLpadding()
   * @generated
   * @ordered
   */
  protected int lpadding = LPADDING_EDEFAULT;

  /**
   * The default value of the '{@link #getRpadding() <em>Rpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRpadding()
   * @generated
   * @ordered
   */
  protected static final int RPADDING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRpadding() <em>Rpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRpadding()
   * @generated
   * @ordered
   */
  protected int rpadding = RPADDING_EDEFAULT;

  /**
   * The default value of the '{@link #getTpadding() <em>Tpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTpadding()
   * @generated
   * @ordered
   */
  protected static final int TPADDING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTpadding() <em>Tpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTpadding()
   * @generated
   * @ordered
   */
  protected int tpadding = TPADDING_EDEFAULT;

  /**
   * The default value of the '{@link #getBpadding() <em>Bpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBpadding()
   * @generated
   * @ordered
   */
  protected static final int BPADDING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBpadding() <em>Bpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBpadding()
   * @generated
   * @ordered
   */
  protected int bpadding = BPADDING_EDEFAULT;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected Content content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextImpl()
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
    return PageGeneratorLanguarePackage.Literals.TEXT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__FONT_COLOR, oldFontColor, newFontColor);
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
        msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__FONT_COLOR, null, msgs);
      if (newFontColor != null)
        msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__FONT_COLOR, null, msgs);
      msgs = basicSetFontColor(newFontColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__FONT_COLOR, newFontColor, newFontColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__FONT_SIZE, oldFontSize, fontSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public locationexpression getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(locationexpression newLocation, NotificationChain msgs)
  {
    locationexpression oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__LOCATION, oldLocation, newLocation);
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
  public void setLocation(locationexpression newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLpadding()
  {
    return lpadding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLpadding(int newLpadding)
  {
    int oldLpadding = lpadding;
    lpadding = newLpadding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__LPADDING, oldLpadding, lpadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRpadding()
  {
    return rpadding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRpadding(int newRpadding)
  {
    int oldRpadding = rpadding;
    rpadding = newRpadding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__RPADDING, oldRpadding, rpadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTpadding()
  {
    return tpadding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTpadding(int newTpadding)
  {
    int oldTpadding = tpadding;
    tpadding = newTpadding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__TPADDING, oldTpadding, tpadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBpadding()
  {
    return bpadding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBpadding(int newBpadding)
  {
    int oldBpadding = bpadding;
    bpadding = newBpadding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__BPADDING, oldBpadding, bpadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Content getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(Content newContent, NotificationChain msgs)
  {
    Content oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__CONTENT, oldContent, newContent);
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
  public void setContent(Content newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.TEXT__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.TEXT__CONTENT, newContent, newContent));
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
      case PageGeneratorLanguarePackage.TEXT__FONT_COLOR:
        return basicSetFontColor(null, msgs);
      case PageGeneratorLanguarePackage.TEXT__LOCATION:
        return basicSetLocation(null, msgs);
      case PageGeneratorLanguarePackage.TEXT__CONTENT:
        return basicSetContent(null, msgs);
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
      case PageGeneratorLanguarePackage.TEXT__FONT_COLOR:
        return getFontColor();
      case PageGeneratorLanguarePackage.TEXT__FONT_SIZE:
        return getFontSize();
      case PageGeneratorLanguarePackage.TEXT__LOCATION:
        return getLocation();
      case PageGeneratorLanguarePackage.TEXT__LPADDING:
        return getLpadding();
      case PageGeneratorLanguarePackage.TEXT__RPADDING:
        return getRpadding();
      case PageGeneratorLanguarePackage.TEXT__TPADDING:
        return getTpadding();
      case PageGeneratorLanguarePackage.TEXT__BPADDING:
        return getBpadding();
      case PageGeneratorLanguarePackage.TEXT__CONTENT:
        return getContent();
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
      case PageGeneratorLanguarePackage.TEXT__FONT_COLOR:
        setFontColor((primaryColour)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__FONT_SIZE:
        setFontSize((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__LOCATION:
        setLocation((locationexpression)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__LPADDING:
        setLpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__RPADDING:
        setRpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__TPADDING:
        setTpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__BPADDING:
        setBpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.TEXT__CONTENT:
        setContent((Content)newValue);
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
      case PageGeneratorLanguarePackage.TEXT__FONT_COLOR:
        setFontColor((primaryColour)null);
        return;
      case PageGeneratorLanguarePackage.TEXT__FONT_SIZE:
        setFontSize(FONT_SIZE_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.TEXT__LOCATION:
        setLocation((locationexpression)null);
        return;
      case PageGeneratorLanguarePackage.TEXT__LPADDING:
        setLpadding(LPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.TEXT__RPADDING:
        setRpadding(RPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.TEXT__TPADDING:
        setTpadding(TPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.TEXT__BPADDING:
        setBpadding(BPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.TEXT__CONTENT:
        setContent((Content)null);
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
      case PageGeneratorLanguarePackage.TEXT__FONT_COLOR:
        return fontColor != null;
      case PageGeneratorLanguarePackage.TEXT__FONT_SIZE:
        return fontSize != FONT_SIZE_EDEFAULT;
      case PageGeneratorLanguarePackage.TEXT__LOCATION:
        return location != null;
      case PageGeneratorLanguarePackage.TEXT__LPADDING:
        return lpadding != LPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.TEXT__RPADDING:
        return rpadding != RPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.TEXT__TPADDING:
        return tpadding != TPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.TEXT__BPADDING:
        return bpadding != BPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.TEXT__CONTENT:
        return content != null;
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
    result.append(" (fontSize: ");
    result.append(fontSize);
    result.append(", Lpadding: ");
    result.append(lpadding);
    result.append(", Rpadding: ");
    result.append(rpadding);
    result.append(", Tpadding: ");
    result.append(tpadding);
    result.append(", Bpadding: ");
    result.append(bpadding);
    result.append(')');
    return result.toString();
  }

} //TextImpl
