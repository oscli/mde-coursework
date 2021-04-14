/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PageGeneratorLanguareFactoryImpl extends EFactoryImpl implements PageGeneratorLanguareFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageGeneratorLanguareFactory init()
  {
    try
    {
      PageGeneratorLanguareFactory thePageGeneratorLanguareFactory = (PageGeneratorLanguareFactory)EPackage.Registry.INSTANCE.getEFactory(PageGeneratorLanguarePackage.eNS_URI);
      if (thePageGeneratorLanguareFactory != null)
      {
        return thePageGeneratorLanguareFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PageGeneratorLanguareFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageGeneratorLanguareFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PageGeneratorLanguarePackage.WEB_PAGE: return createWebPage();
      case PageGeneratorLanguarePackage.PAGE_ELEMENT: return createpageElement();
      case PageGeneratorLanguarePackage.HEAD: return createHead();
      case PageGeneratorLanguarePackage.HEAD_ELEMENT: return createheadElement();
      case PageGeneratorLanguarePackage.TITLE: return createTitle();
      case PageGeneratorLanguarePackage.LABEL: return createLabel();
      case PageGeneratorLanguarePackage.BODY: return createBody();
      case PageGeneratorLanguarePackage.BODY_ELEMENT: return createbodyElement();
      case PageGeneratorLanguarePackage.HEADING: return createHeading();
      case PageGeneratorLanguarePackage.LINK: return createLink();
      case PageGeneratorLanguarePackage.PICTURE: return createPicture();
      case PageGeneratorLanguarePackage.TEXT: return createText();
      case PageGeneratorLanguarePackage.SECTION: return createSection();
      case PageGeneratorLanguarePackage.LOCATIONEXPRESSION: return createlocationexpression();
      case PageGeneratorLanguarePackage.PRIMARY_SIZE: return createprimarySize();
      case PageGeneratorLanguarePackage.SIZE_DECLARATION: return createSizeDeclaration();
      case PageGeneratorLanguarePackage.SIZE_VALUE: return createsizeValue();
      case PageGeneratorLanguarePackage.SIZE_EXPRESSION: return createSizeExpression();
      case PageGeneratorLanguarePackage.PRIMARY_COLOUR: return createprimaryColour();
      case PageGeneratorLanguarePackage.COLOUR_VALUE: return createcolourValue();
      case PageGeneratorLanguarePackage.COLOUR_RGB: return createColourRGB();
      case PageGeneratorLanguarePackage.COLOUR_EXPRESSION: return createColourExpression();
      case PageGeneratorLanguarePackage.CONTENT: return createContent();
      case PageGeneratorLanguarePackage.PRIMARY_STRING: return createprimaryString();
      case PageGeneratorLanguarePackage.STRING_VALUE: return createstringValue();
      case PageGeneratorLanguarePackage.STRING_REFERENCE: return createstringReference();
      case PageGeneratorLanguarePackage.STRING_DECLARATION: return createstringDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WebPage createWebPage()
  {
    WebPageImpl webPage = new WebPageImpl();
    return webPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public pageElement createpageElement()
  {
    pageElementImpl pageElement = new pageElementImpl();
    return pageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public headElement createheadElement()
  {
    headElementImpl headElement = new headElementImpl();
    return headElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public bodyElement createbodyElement()
  {
    bodyElementImpl bodyElement = new bodyElementImpl();
    return bodyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Heading createHeading()
  {
    HeadingImpl heading = new HeadingImpl();
    return heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Picture createPicture()
  {
    PictureImpl picture = new PictureImpl();
    return picture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public locationexpression createlocationexpression()
  {
    locationexpressionImpl locationexpression = new locationexpressionImpl();
    return locationexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public primarySize createprimarySize()
  {
    primarySizeImpl primarySize = new primarySizeImpl();
    return primarySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SizeDeclaration createSizeDeclaration()
  {
    SizeDeclarationImpl sizeDeclaration = new SizeDeclarationImpl();
    return sizeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public sizeValue createsizeValue()
  {
    sizeValueImpl sizeValue = new sizeValueImpl();
    return sizeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SizeExpression createSizeExpression()
  {
    SizeExpressionImpl sizeExpression = new SizeExpressionImpl();
    return sizeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public primaryColour createprimaryColour()
  {
    primaryColourImpl primaryColour = new primaryColourImpl();
    return primaryColour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public colourValue createcolourValue()
  {
    colourValueImpl colourValue = new colourValueImpl();
    return colourValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColourRGB createColourRGB()
  {
    ColourRGBImpl colourRGB = new ColourRGBImpl();
    return colourRGB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColourExpression createColourExpression()
  {
    ColourExpressionImpl colourExpression = new ColourExpressionImpl();
    return colourExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public primaryString createprimaryString()
  {
    primaryStringImpl primaryString = new primaryStringImpl();
    return primaryString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public stringValue createstringValue()
  {
    stringValueImpl stringValue = new stringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public stringReference createstringReference()
  {
    stringReferenceImpl stringReference = new stringReferenceImpl();
    return stringReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public stringDeclaration createstringDeclaration()
  {
    stringDeclarationImpl stringDeclaration = new stringDeclarationImpl();
    return stringDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PageGeneratorLanguarePackage getPageGeneratorLanguarePackage()
  {
    return (PageGeneratorLanguarePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PageGeneratorLanguarePackage getPackage()
  {
    return PageGeneratorLanguarePackage.eINSTANCE;
  }

} //PageGeneratorLanguareFactoryImpl
