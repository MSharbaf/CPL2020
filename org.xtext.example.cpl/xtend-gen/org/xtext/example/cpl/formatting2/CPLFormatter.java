/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.cpl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.completeoclcs.ContextDeclCS;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.cpl.cPL.MessageCP;
import org.xtext.example.cpl.cPL.RelationCP;
import org.xtext.example.cpl.cPL.TopLevelCP;
import org.xtext.example.cpl.services.CPLGrammarAccess;

@SuppressWarnings("all")
public class CPLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CPLGrammarAccess _cPLGrammarAccess;
  
  protected void _format(final TopLevelCP topLevelCP, @Extension final IFormattableDocument document) {
    EList<ImportCS> _ownedImports = topLevelCP.getOwnedImports();
    for (final ImportCS importCS : _ownedImports) {
      document.<ImportCS>format(importCS);
    }
    EList<ContextDeclCS> _ownedContexts = topLevelCP.getOwnedContexts();
    for (final ContextDeclCS contextDeclCS : _ownedContexts) {
      document.<ContextDeclCS>format(contextDeclCS);
    }
    EList<RelationCP> _ownedRelation = topLevelCP.getOwnedRelation();
    for (final RelationCP relationCP : _ownedRelation) {
      document.<RelationCP>format(relationCP);
    }
    EList<MessageCP> _ownedMessage = topLevelCP.getOwnedMessage();
    for (final MessageCP messageCP : _ownedMessage) {
      document.<MessageCP>format(messageCP);
    }
  }
  
  protected void _format(final ImportCS importCS, @Extension final IFormattableDocument document) {
    document.<PathNameCS>format(importCS.getOwnedPathName());
  }
  
  public void format(final Object topLevelCP, final IFormattableDocument document) {
    if (topLevelCP instanceof TopLevelCP) {
      _format((TopLevelCP)topLevelCP, document);
      return;
    } else if (topLevelCP instanceof ImportCS) {
      _format((ImportCS)topLevelCP, document);
      return;
    } else if (topLevelCP instanceof XtextResource) {
      _format((XtextResource)topLevelCP, document);
      return;
    } else if (topLevelCP instanceof EObject) {
      _format((EObject)topLevelCP, document);
      return;
    } else if (topLevelCP == null) {
      _format((Void)null, document);
      return;
    } else if (topLevelCP != null) {
      _format(topLevelCP, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(topLevelCP, document).toString());
    }
  }
}
