/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.locationexpression;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryColour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getLpadding <em>Lpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getRpadding <em>Rpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getTpadding <em>Tpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getBpadding <em>Bpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl.HeadingImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadingImpl extends bodyElementImpl implements Heading
{
  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeadingImpl()
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
    return PageGeneratorLanguarePackage.Literals.HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__INDEX, oldIndex, index));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__FONT_COLOR, oldFontColor, newFontColor);
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
        msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.HEADING__FONT_COLOR, null, msgs);
      if (newFontColor != null)
        msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.HEADING__FONT_COLOR, null, msgs);
      msgs = basicSetFontColor(newFontColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__FONT_COLOR, newFontColor, newFontColor));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__LOCATION, oldLocation, newLocation);
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
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.HEADING__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PageGeneratorLanguarePackage.HEADING__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__LOCATION, newLocation, newLocation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__LPADDING, oldLpadding, lpadding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__RPADDING, oldRpadding, rpadding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__TPADDING, oldTpadding, tpadding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__BPADDING, oldBpadding, bpadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PageGeneratorLanguarePackage.HEADING__TITLE, oldTitle, title));
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
      case PageGeneratorLanguarePackage.HEADING__FONT_COLOR:
        return basicSetFontColor(null, msgs);
      case PageGeneratorLanguarePackage.HEADING__LOCATION:
        return basicSetLocation(null, msgs);
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
      case PageGeneratorLanguarePackage.HEADING__INDEX:
        return getIndex();
      case PageGeneratorLanguarePackage.HEADING__FONT_COLOR:
        return getFontColor();
      case PageGeneratorLanguarePackage.HEADING__LOCATION:
        return getLocation();
      case PageGeneratorLanguarePackage.HEADING__LPADDING:
        return getLpadding();
      case PageGeneratorLanguarePackage.HEADING__RPADDING:
        return getRpadding();
      case PageGeneratorLanguarePackage.HEADING__TPADDING:
        return getTpadding();
      case PageGeneratorLanguarePackage.HEADING__BPADDING:
        return getBpadding();
      case PageGeneratorLanguarePackage.HEADING__TITLE:
        return getTitle();
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
      case PageGeneratorLanguarePackage.HEADING__INDEX:
        setIndex((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__FONT_COLOR:
        setFontColor((primaryColour)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__LOCATION:
        setLocation((locationexpression)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__LPADDING:
        setLpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__RPADDING:
        setRpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__TPADDING:
        setTpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__BPADDING:
        setBpadding((Integer)newValue);
        return;
      case PageGeneratorLanguarePackage.HEADING__TITLE:
        setTitle((String)newValue);
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
      case PageGeneratorLanguarePackage.HEADING__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.HEADING__FONT_COLOR:
        setFontColor((primaryColour)null);
        return;
      case PageGeneratorLanguarePackage.HEADING__LOCATION:
        setLocation((locationexpression)null);
        return;
      case PageGeneratorLanguarePackage.HEADING__LPADDING:
        setLpadding(LPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.HEADING__RPADDING:
        setRpadding(RPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.HEADING__TPADDING:
        setTpadding(TPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.HEADING__BPADDING:
        setBpadding(BPADDING_EDEFAULT);
        return;
      case PageGeneratorLanguarePackage.HEADING__TITLE:
        setTitle(TITLE_EDEFAULT);
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
      case PageGeneratorLanguarePackage.HEADING__INDEX:
        return index != INDEX_EDEFAULT;
      case PageGeneratorLanguarePackage.HEADING__FONT_COLOR:
        return fontColor != null;
      case PageGeneratorLanguarePackage.HEADING__LOCATION:
        return location != null;
      case PageGeneratorLanguarePackage.HEADING__LPADDING:
        return lpadding != LPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.HEADING__RPADDING:
        return rpadding != RPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.HEADING__TPADDING:
        return tpadding != TPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.HEADING__BPADDING:
        return bpadding != BPADDING_EDEFAULT;
      case PageGeneratorLanguarePackage.HEADING__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
    result.append(" (index: ");
    result.append(index);
    result.append(", Lpadding: ");
    result.append(lpadding);
    result.append(", Rpadding: ");
    result.append(rpadding);
    result.append(", Tpadding: ");
    result.append(tpadding);
    result.append(", Bpadding: ");
    result.append(bpadding);
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //HeadingImpl
