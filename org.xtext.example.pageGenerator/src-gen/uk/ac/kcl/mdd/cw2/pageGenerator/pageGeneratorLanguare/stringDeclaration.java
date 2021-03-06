/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>string Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getWord <em>Word</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getstringDeclaration()
 * @model
 * @generated
 */
public interface stringDeclaration extends pageElement, bodyElement
{
  /**
   * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Color</em>' containment reference.
   * @see #setFontColor(primaryColour)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getstringDeclaration_FontColor()
   * @model containment="true"
   * @generated
   */
  primaryColour getFontColor();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getFontColor <em>Font Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Color</em>' containment reference.
   * @see #getFontColor()
   * @generated
   */
  void setFontColor(primaryColour value);

  /**
   * Returns the value of the '<em><b>Font Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Size</em>' attribute.
   * @see #setFontSize(int)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getstringDeclaration_FontSize()
   * @model
   * @generated
   */
  int getFontSize();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getFontSize <em>Font Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Size</em>' attribute.
   * @see #getFontSize()
   * @generated
   */
  void setFontSize(int value);

  /**
   * Returns the value of the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' attribute.
   * @see #setWord(String)
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage#getstringDeclaration_Word()
   * @model
   * @generated
   */
  String getWord();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see #getWord()
   * @generated
   */
  void setWord(String value);

} // stringDeclaration
