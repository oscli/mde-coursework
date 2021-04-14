/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage
 * @generated
 */
public class PageGeneratorLanguareAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PageGeneratorLanguarePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageGeneratorLanguareAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PageGeneratorLanguarePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageGeneratorLanguareSwitch<Adapter> modelSwitch =
    new PageGeneratorLanguareSwitch<Adapter>()
    {
      @Override
      public Adapter caseWebPage(WebPage object)
      {
        return createWebPageAdapter();
      }
      @Override
      public Adapter casepageElement(pageElement object)
      {
        return createpageElementAdapter();
      }
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseheadElement(headElement object)
      {
        return createheadElementAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter casebodyElement(bodyElement object)
      {
        return createbodyElementAdapter();
      }
      @Override
      public Adapter caseHeading(Heading object)
      {
        return createHeadingAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter casePicture(Picture object)
      {
        return createPictureAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caselocationexpression(locationexpression object)
      {
        return createlocationexpressionAdapter();
      }
      @Override
      public Adapter caseprimarySize(primarySize object)
      {
        return createprimarySizeAdapter();
      }
      @Override
      public Adapter caseSizeDeclaration(SizeDeclaration object)
      {
        return createSizeDeclarationAdapter();
      }
      @Override
      public Adapter casesizeValue(sizeValue object)
      {
        return createsizeValueAdapter();
      }
      @Override
      public Adapter caseSizeExpression(SizeExpression object)
      {
        return createSizeExpressionAdapter();
      }
      @Override
      public Adapter caseprimaryColour(primaryColour object)
      {
        return createprimaryColourAdapter();
      }
      @Override
      public Adapter casecolourValue(colourValue object)
      {
        return createcolourValueAdapter();
      }
      @Override
      public Adapter caseColourRGB(ColourRGB object)
      {
        return createColourRGBAdapter();
      }
      @Override
      public Adapter caseColourExpression(ColourExpression object)
      {
        return createColourExpressionAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter caseprimaryString(primaryString object)
      {
        return createprimaryStringAdapter();
      }
      @Override
      public Adapter casestringValue(stringValue object)
      {
        return createstringValueAdapter();
      }
      @Override
      public Adapter casestringReference(stringReference object)
      {
        return createstringReferenceAdapter();
      }
      @Override
      public Adapter casestringDeclaration(stringDeclaration object)
      {
        return createstringDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.WebPage <em>Web Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.WebPage
   * @generated
   */
  public Adapter createWebPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.pageElement <em>page Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.pageElement
   * @generated
   */
  public Adapter createpageElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.headElement <em>head Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.headElement
   * @generated
   */
  public Adapter createheadElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.bodyElement <em>body Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.bodyElement
   * @generated
   */
  public Adapter createbodyElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading
   * @generated
   */
  public Adapter createHeadingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Picture <em>Picture</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Picture
   * @generated
   */
  public Adapter createPictureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.locationexpression <em>locationexpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.locationexpression
   * @generated
   */
  public Adapter createlocationexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primarySize <em>primary Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primarySize
   * @generated
   */
  public Adapter createprimarySizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeDeclaration <em>Size Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeDeclaration
   * @generated
   */
  public Adapter createSizeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.sizeValue <em>size Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.sizeValue
   * @generated
   */
  public Adapter createsizeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeExpression <em>Size Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeExpression
   * @generated
   */
  public Adapter createSizeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryColour <em>primary Colour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryColour
   * @generated
   */
  public Adapter createprimaryColourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.colourValue <em>colour Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.colourValue
   * @generated
   */
  public Adapter createcolourValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourRGB <em>Colour RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourRGB
   * @generated
   */
  public Adapter createColourRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourExpression <em>Colour Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourExpression
   * @generated
   */
  public Adapter createColourExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryString <em>primary String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.primaryString
   * @generated
   */
  public Adapter createprimaryStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringValue <em>string Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringValue
   * @generated
   */
  public Adapter createstringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringReference <em>string Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringReference
   * @generated
   */
  public Adapter createstringReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration <em>string Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration
   * @generated
   */
  public Adapter createstringDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PageGeneratorLanguareAdapterFactory
