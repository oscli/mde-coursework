/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeExpression
import org.eclipse.emf.ecore.EReference

import static org.eclipse.xtext.scoping.Scopes.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.Section
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.WebPage
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.SizeDeclaration
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.mdd.cw2.pageGenerator.pageGeneratorLanguare.ColourExpression

/** 
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class PageGeneratorLanguareScopeProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_sizeExpression (SizeExpression context, EReference ref){
		val containgBodyElement = context.getContainerOfType(Section)
		
		if(containgBodyElement !== null){
			containgBodyElement.visibleSizeVariableScope
		} else{
			val containPage = context.getContainerOfType(WebPage)
			
			scopeFor(containPage.pageElements.filter(SizeDeclaration))
		}
	}
	
	def IScope visibleSizeVariableScope(EObject context){
		if (context instanceof Section){
			scopeFor(context.bodyElements.filter(SizeDeclaration), context.eContainer.visibleSizeVariableScope)
		}else if (context instanceof WebPage){
			scopeFor(context.pageElements.filter(SizeDeclaration))
		}
	}
	
	
	def IScope scope_colourExpression (ColourExpression context, EReference ref){
		val containgBodyElement = context.getContainerOfType(Section)
		
		if(containgBodyElement !== null){
			containgBodyElement.visibleSizeVariableScope
		} else{
			val containPage = context.getContainerOfType(WebPage)
			
			scopeFor(containPage.pageElements.filter(ColourExpression))
		}
	}
	
	def IScope visibleColourVariableScope(EObject context){
		if (context instanceof Section){
			scopeFor(context.bodyElements.filter(ColourExpression), context.eContainer.visibleSizeVariableScope)
		}else if (context instanceof WebPage){
			scopeFor(context.pageElements.filter(ColourExpression))
		}
	}
}
