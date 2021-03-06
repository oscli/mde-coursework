/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getSize <em>Size</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getTextLocation <em>Text Location</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getLpadding <em>Lpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getRpadding <em>Rpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getTpadding <em>Tpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getBpadding <em>Bpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends bodyElement
{
  /**
   * Returns the value of the '<em><b>Bg Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bg Color</em>' containment reference.
   * @see #setBgColor(primaryColour)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_BgColor()
   * @model containment="true"
   * @generated
   */
  primaryColour getBgColor();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getBgColor <em>Bg Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bg Color</em>' containment reference.
   * @see #getBgColor()
   * @generated
   */
  void setBgColor(primaryColour value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(primarySize)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Size()
   * @model containment="true"
   * @generated
   */
  primarySize getSize();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(primarySize value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(locationexpression)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Location()
   * @model containment="true"
   * @generated
   */
  locationexpression getLocation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(locationexpression value);

  /**
   * Returns the value of the '<em><b>Text Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Location</em>' containment reference.
   * @see #setTextLocation(locationexpression)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_TextLocation()
   * @model containment="true"
   * @generated
   */
  locationexpression getTextLocation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getTextLocation <em>Text Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Location</em>' containment reference.
   * @see #getTextLocation()
   * @generated
   */
  void setTextLocation(locationexpression value);

  /**
   * Returns the value of the '<em><b>Lpadding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lpadding</em>' attribute.
   * @see #setLpadding(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Lpadding()
   * @model
   * @generated
   */
  int getLpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getLpadding <em>Lpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lpadding</em>' attribute.
   * @see #getLpadding()
   * @generated
   */
  void setLpadding(int value);

  /**
   * Returns the value of the '<em><b>Rpadding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rpadding</em>' attribute.
   * @see #setRpadding(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Rpadding()
   * @model
   * @generated
   */
  int getRpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getRpadding <em>Rpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rpadding</em>' attribute.
   * @see #getRpadding()
   * @generated
   */
  void setRpadding(int value);

  /**
   * Returns the value of the '<em><b>Tpadding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tpadding</em>' attribute.
   * @see #setTpadding(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Tpadding()
   * @model
   * @generated
   */
  int getTpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getTpadding <em>Tpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tpadding</em>' attribute.
   * @see #getTpadding()
   * @generated
   */
  void setTpadding(int value);

  /**
   * Returns the value of the '<em><b>Bpadding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bpadding</em>' attribute.
   * @see #setBpadding(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_Bpadding()
   * @model
   * @generated
   */
  int getBpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section#getBpadding <em>Bpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bpadding</em>' attribute.
   * @see #getBpadding()
   * @generated
   */
  void setBpadding(int value);

  /**
   * Returns the value of the '<em><b>Body Elements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.bodyElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Elements</em>' containment reference list.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getSection_BodyElements()
   * @model containment="true"
   * @generated
   */
  EList<bodyElement> getBodyElements();

} // Section
