package org.xtext.example.mydsl1.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.linking.lazy.SyntheticLinkingSupport;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.xtext.example.mydsl1.myDsl.Model;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.Part;
import org.xtext.example.mydsl1.myDsl.Spec;

import com.google.inject.Inject;

public class MyDslLazyLinker extends LazyLinker {
	
	@Inject
	private SyntheticLinkingSupport sls;
	
	@Override
	protected void afterModelLinked(EObject o, IDiagnosticConsumer diagnosticsConsumer) {
		if (o instanceof Model) {
			Model model = (Model) o;
			for (Spec s : model.getSpecs()) {
				Part part = s.getPart();
				for (INode n : NodeModelUtils.findNodesForFeature(part, MyDslPackage.Literals.PART__INTERFACES)) {
					sls.createAndSetProxy(s, MyDslPackage.Literals.SPEC__USED_INTERFACES, NodeModelUtils.getTokenText(n));
				}
			}
		}
		super.afterModelLinked(o, diagnosticsConsumer);
	}
	

}
