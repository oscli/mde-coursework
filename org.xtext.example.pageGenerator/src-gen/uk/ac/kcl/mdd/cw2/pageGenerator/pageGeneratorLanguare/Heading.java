/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getIndex <em>Index</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getLpadding <em>Lpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getRpadding <em>Rpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getTpadding <em>Tpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getBpadding <em>Bpadding</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends bodyElement
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Color</em>' containment reference.
   * @see #setFontColor(primaryColour)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_FontColor()
   * @model containment="true"
   * @generated
   */
  primaryColour getFontColor();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getFontColor <em>Font Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Color</em>' containment reference.
   * @see #getFontColor()
   * @generated
   */
  void setFontColor(primaryColour value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(locationexpression)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Location()
   * @model containment="true"
   * @generated
   */
  locationexpression getLocation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(locationexpression value);

  /**
   * Returns the value of the '<em><b>Lpadding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lpadding</em>' attribute.
   * @see #setLpadding(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Lpadding()
   * @model
   * @generated
   */
  int getLpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getLpadding <em>Lpadding</em>}' attribute.
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
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Rpadding()
   * @model
   * @generated
   */
  int getRpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getRpadding <em>Rpadding</em>}' attribute.
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
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Tpadding()
   * @model
   * @generated
   */
  int getTpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getTpadding <em>Tpadding</em>}' attribute.
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
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Bpadding()
   * @model
   * @generated
   */
  int getBpadding();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getBpadding <em>Bpadding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bpadding</em>' attribute.
   * @see #getBpadding()
   * @generated
   */
  void setBpadding(int value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getHeading_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

} // Heading
