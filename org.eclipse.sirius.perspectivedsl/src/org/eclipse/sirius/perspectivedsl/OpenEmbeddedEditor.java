package org.eclipse.sirius.perspectivedsl;

import org.xtext.perspectivedsl.ui.internal.PerspectivedslActivator;
import org.obeonetwork.dsl.viewpoint.xtext.support.action.OpenXtextEmbeddedEditor;

import com.google.inject.Injector;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor {

	@Override
	protected Injector getInjector() {
		 return  PerspectivedslActivator.getInstance().getInjector("org.xtext.perspectivedsl.PerspectiveDSL.xtext");
	}

}
