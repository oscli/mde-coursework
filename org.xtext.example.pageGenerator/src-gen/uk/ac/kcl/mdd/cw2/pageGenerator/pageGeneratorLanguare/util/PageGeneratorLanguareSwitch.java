/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage
 * @generated
 */
public class PageGeneratorLanguareSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PageGeneratorLanguarePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageGeneratorLanguareSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PageGeneratorLanguarePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PageGeneratorLanguarePackage.WEB_PAGE:
      {
        WebPage webPage = (WebPage)theEObject;
        T result = caseWebPage(webPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.PAGE_ELEMENT:
      {
        pageElement pageElement = (pageElement)theEObject;
        T result = casepageElement(pageElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.HEAD:
      {
        Head head = (Head)theEObject;
        T result = caseHead(head);
        if (result == null) result = casepageElement(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.HEAD_ELEMENT:
      {
        headElement headElement = (headElement)theEObject;
        T result = caseheadElement(headElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.TITLE:
      {
        Title title = (Title)theEObject;
        T result = caseTitle(title);
        if (result == null) result = caseheadElement(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseheadElement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = casepageElement(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.BODY_ELEMENT:
      {
        bodyElement bodyElement = (bodyElement)theEObject;
        T result = casebodyElement(bodyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.HEADING:
      {
        Heading heading = (Heading)theEObject;
        T result = caseHeading(heading);
        if (result == null) result = casebodyElement(heading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = casebodyElement(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.PICTURE:
      {
        Picture picture = (Picture)theEObject;
        T result = casePicture(picture);
        if (result == null) result = casebodyElement(picture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = casebodyElement(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = casebodyElement(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.LOCATIONEXPRESSION:
      {
        locationexpression locationexpression = (locationexpression)theEObject;
        T result = caselocationexpression(locationexpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.PRIMARY_SIZE:
      {
        primarySize primarySize = (primarySize)theEObject;
        T result = caseprimarySize(primarySize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.SIZE_DECLARATION:
      {
        SizeDeclaration sizeDeclaration = (SizeDeclaration)theEObject;
        T result = caseSizeDeclaration(sizeDeclaration);
        if (result == null) result = casepageElement(sizeDeclaration);
        if (result == null) result = casebodyElement(sizeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.SIZE_VALUE:
      {
        sizeValue sizeValue = (sizeValue)theEObject;
        T result = casesizeValue(sizeValue);
        if (result == null) result = caseprimarySize(sizeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.SIZE_EXPRESSION:
      {
        SizeExpression sizeExpression = (SizeExpression)theEObject;
        T result = caseSizeExpression(sizeExpression);
        if (result == null) result = caseprimarySize(sizeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.PRIMARY_COLOUR:
      {
        primaryColour primaryColour = (primaryColour)theEObject;
        T result = caseprimaryColour(primaryColour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.COLOUR_VALUE:
      {
        colourValue colourValue = (colourValue)theEObject;
        T result = casecolourValue(colourValue);
        if (result == null) result = caseprimaryColour(colourValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.COLOUR_RGB:
      {
        ColourRGB colourRGB = (ColourRGB)theEObject;
        T result = caseColourRGB(colourRGB);
        if (result == null) result = casepageElement(colourRGB);
        if (result == null) result = casebodyElement(colourRGB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.COLOUR_EXPRESSION:
      {
        ColourExpression colourExpression = (ColourExpression)theEObject;
        T result = caseColourExpression(colourExpression);
        if (result == null) result = caseprimaryColour(colourExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.PRIMARY_STRING:
      {
        primaryString primaryString = (primaryString)theEObject;
        T result = caseprimaryString(primaryString);
        if (result == null) result = caseContent(primaryString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.STRING_VALUE:
      {
        stringValue stringValue = (stringValue)theEObject;
        T result = casestringValue(stringValue);
        if (result == null) result = caseprimaryString(stringValue);
        if (result == null) result = caseContent(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.STRING_REFERENCE:
      {
        stringReference stringReference = (stringReference)theEObject;
        T result = casestringReference(stringReference);
        if (result == null) result = caseprimaryString(stringReference);
        if (result == null) result = caseContent(stringReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PageGeneratorLanguarePackage.STRING_DECLARATION:
      {
        stringDeclaration stringDeclaration = (stringDeclaration)theEObject;
        T result = casestringDeclaration(stringDeclaration);
        if (result == null) result = casepageElement(stringDeclaration);
        if (result == null) result = casebodyElement(stringDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebPage(WebPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>page Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>page Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepageElement(pageElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHead(Head object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>head Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>head Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseheadElement(headElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitle(Title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>body Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>body Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebodyElement(bodyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading(Heading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Picture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Picture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePicture(Picture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>locationexpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>locationexpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselocationexpression(locationexpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimarySize(primarySize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeDeclaration(SizeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>size Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>size Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesizeValue(sizeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeExpression(SizeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary Colour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary Colour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryColour(primaryColour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>colour Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>colour Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecolourValue(colourValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colour RGB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colour RGB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColourRGB(ColourRGB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colour Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colour Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColourExpression(ColourExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryString(primaryString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>string Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>string Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestringValue(stringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>string Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>string Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestringReference(stringReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>string Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>string Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestringDeclaration(stringDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PageGeneratorLanguareSwitch
