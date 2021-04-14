/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Body;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourExpression;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourRGB;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Content;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Head;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Heading;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Label;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Link;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.PageGeneratorLanguarePackage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Picture;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeDeclaration;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeExpression;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Text;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Title;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.WebPage;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.colourValue;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.locationexpression;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.sizeValue;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringDeclaration;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringReference;
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.stringValue;
import uk.ac.kcl.mdd.cw2.pageGenerator.services.PageGeneratorLanguareGrammarAccess;

@SuppressWarnings("all")
public class PageGeneratorLanguareSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PageGeneratorLanguareGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PageGeneratorLanguarePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PageGeneratorLanguarePackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.COLOUR_EXPRESSION:
				sequence_ColourExpression(context, (ColourExpression) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.COLOUR_RGB:
				sequence_ColourRGB(context, (ColourRGB) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.HEAD:
				sequence_Head(context, (Head) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.HEADING:
				sequence_Heading(context, (Heading) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.PICTURE:
				sequence_Picture(context, (Picture) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.SIZE_DECLARATION:
				sequence_SizeDeclaration(context, (SizeDeclaration) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.SIZE_EXPRESSION:
				sequence_SizeExpression(context, (SizeExpression) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.TITLE:
				sequence_Title(context, (Title) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.WEB_PAGE:
				sequence_WebPage(context, (WebPage) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.COLOUR_VALUE:
				sequence_colourValue(context, (colourValue) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.LOCATIONEXPRESSION:
				sequence_locationexpression(context, (locationexpression) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.SIZE_VALUE:
				sequence_sizeValue(context, (sizeValue) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.STRING_DECLARATION:
				sequence_stringDeclaration(context, (stringDeclaration) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.STRING_REFERENCE:
				sequence_stringReference(context, (stringReference) semanticObject); 
				return; 
			case PageGeneratorLanguarePackage.STRING_VALUE:
				sequence_stringValue(context, (stringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     pageElement returns Body
	 *     Body returns Body
	 *
	 * Constraint:
	 *     bodyElements+=bodyElement*
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryColour returns ColourExpression
	 *     ColourExpression returns ColourExpression
	 *
	 * Constraint:
	 *     colour=[ColourRGB|ID]
	 */
	protected void sequence_ColourExpression(ISerializationContext context, ColourExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_EXPRESSION__COLOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_EXPRESSION__COLOUR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColourExpressionAccess().getColourColourRGBIDTerminalRuleCall_0_1(), semanticObject.eGet(PageGeneratorLanguarePackage.Literals.COLOUR_EXPRESSION__COLOUR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     pageElement returns ColourRGB
	 *     bodyElement returns ColourRGB
	 *     ColourRGB returns ColourRGB
	 *
	 * Constraint:
	 *     (name=ID rgb='(' red=INT green=INT blue=INT)
	 */
	protected void sequence_ColourRGB(ISerializationContext context, ColourRGB semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.BODY_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.BODY_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__RGB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__RGB));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__RED));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__GREEN));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_RGB__BLUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColourRGBAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0(), semanticObject.getRgb());
		feeder.accept(grammarAccess.getColourRGBAccess().getRedINTTerminalRuleCall_5_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getColourRGBAccess().getGreenINTTerminalRuleCall_7_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getColourRGBAccess().getBlueINTTerminalRuleCall_9_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Content returns Content
	 *     Content.Content_1_0 returns Content
	 *
	 * Constraint:
	 *     (left=Content_Content_1_0 (separator+='+' | separator+=',') right+=primaryString)
	 */
	protected void sequence_Content(ISerializationContext context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     pageElement returns Head
	 *     Head returns Head
	 *
	 * Constraint:
	 *     headElements+=headElement*
	 */
	protected void sequence_Head(ISerializationContext context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     bodyElement returns Heading
	 *     Heading returns Heading
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         index=INT 
	 *         fontColor=primaryColour? 
	 *         location=locationexpression? 
	 *         Lpadding=INT? 
	 *         Rpadding=INT? 
	 *         Tpadding=INT? 
	 *         Bpadding=INT? 
	 *         title=STRING
	 *     )
	 */
	protected void sequence_Heading(ISerializationContext context, Heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     headElement returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     (name=STRING label=STRING)
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.HEAD_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.HEAD_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.LABEL__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.LABEL__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_6_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     bodyElement returns Link
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=STRING? 
	 *         Lpadding=INT? 
	 *         Rpadding=INT? 
	 *         Tpadding=INT? 
	 *         Bpadding=INT? 
	 *         fontColor=primaryColour? 
	 *         fontSize=INT? 
	 *         location=locationexpression? 
	 *         url=STRING
	 *     )
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     bodyElement returns Picture
	 *     Picture returns Picture
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         size=primarySize? 
	 *         alt=STRING? 
	 *         location=locationexpression? 
	 *         Lpadding=INT? 
	 *         Rpadding=INT? 
	 *         Tpadding=INT? 
	 *         Bpadding=INT? 
	 *         picUrl=STRING
	 *     )
	 */
	protected void sequence_Picture(ISerializationContext context, Picture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     bodyElement returns Section
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         bgColor=primaryColour? 
	 *         size=primarySize? 
	 *         location=locationexpression? 
	 *         textLocation=locationexpression? 
	 *         Lpadding=INT? 
	 *         Rpadding=INT? 
	 *         Tpadding=INT? 
	 *         Bpadding=INT? 
	 *         bodyElements+=bodyElement+
	 *     )
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     pageElement returns SizeDeclaration
	 *     bodyElement returns SizeDeclaration
	 *     SizeDeclaration returns SizeDeclaration
	 *
	 * Constraint:
	 *     (name=ID width=INT height=INT)
	 */
	protected void sequence_SizeDeclaration(ISerializationContext context, SizeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.BODY_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.BODY_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_DECLARATION__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_DECLARATION__WIDTH));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_DECLARATION__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_DECLARATION__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSizeDeclarationAccess().getWidthINTTerminalRuleCall_3_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeDeclarationAccess().getHeightINTTerminalRuleCall_5_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     primarySize returns SizeExpression
	 *     SizeExpression returns SizeExpression
	 *
	 * Constraint:
	 *     size=[SizeDeclaration|ID]
	 */
	protected void sequence_SizeExpression(ISerializationContext context, SizeExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_EXPRESSION__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_EXPRESSION__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(PageGeneratorLanguarePackage.Literals.SIZE_EXPRESSION__SIZE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     bodyElement returns Text
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         fontColor=primaryColour? 
	 *         fontSize=INT? 
	 *         location=locationexpression? 
	 *         Lpadding=INT? 
	 *         Rpadding=INT? 
	 *         Tpadding=INT? 
	 *         Bpadding=INT? 
	 *         content=Content
	 *     )
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     headElement returns Title
	 *     Title returns Title
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Title(ISerializationContext context, Title semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.HEAD_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.HEAD_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WebPage returns WebPage
	 *
	 * Constraint:
	 *     pageElements+=pageElement+
	 */
	protected void sequence_WebPage(ISerializationContext context, WebPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryColour returns colourValue
	 *     colourValue returns colourValue
	 *
	 * Constraint:
	 *     colour=STRING
	 */
	protected void sequence_colourValue(ISerializationContext context, colourValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_VALUE__COLOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.COLOUR_VALUE__COLOUR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColourValueAccess().getColourSTRINGTerminalRuleCall_0(), semanticObject.getColour());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     locationexpression returns locationexpression
	 *
	 * Constraint:
	 *     location=STRING
	 */
	protected void sequence_locationexpression(ISerializationContext context, locationexpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.LOCATIONEXPRESSION__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.LOCATIONEXPRESSION__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationexpressionAccess().getLocationSTRINGTerminalRuleCall_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     primarySize returns sizeValue
	 *     sizeValue returns sizeValue
	 *
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_sizeValue(ISerializationContext context, sizeValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_VALUE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_VALUE__WIDTH));
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_VALUE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.SIZE_VALUE__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeValueAccess().getWidthINTTerminalRuleCall_0_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeValueAccess().getHeightINTTerminalRuleCall_2_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     pageElement returns stringDeclaration
	 *     bodyElement returns stringDeclaration
	 *     stringDeclaration returns stringDeclaration
	 *
	 * Constraint:
	 *     (name=ID fontColor=primaryColour? fontSize=INT? word=STRING)
	 */
	protected void sequence_stringDeclaration(ISerializationContext context, stringDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Content returns stringReference
	 *     Content.Content_1_0 returns stringReference
	 *     primaryString returns stringReference
	 *     stringReference returns stringReference
	 *
	 * Constraint:
	 *     stringreference=[stringDeclaration|ID]
	 */
	protected void sequence_stringReference(ISerializationContext context, stringReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.STRING_REFERENCE__STRINGREFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.STRING_REFERENCE__STRINGREFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(PageGeneratorLanguarePackage.Literals.STRING_REFERENCE__STRINGREFERENCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Content returns stringValue
	 *     Content.Content_1_0 returns stringValue
	 *     primaryString returns stringValue
	 *     stringValue returns stringValue
	 *
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_stringValue(ISerializationContext context, stringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PageGeneratorLanguarePackage.Literals.STRING_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PageGeneratorLanguarePackage.Literals.STRING_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
}