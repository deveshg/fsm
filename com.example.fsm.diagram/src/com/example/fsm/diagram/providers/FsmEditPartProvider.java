package com.example.fsm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import com.example.fsm.diagram.edit.parts.FSMEditPart;
import com.example.fsm.diagram.edit.parts.FsmEditPartFactory;
import com.example.fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FsmEditPartProvider() {
		super(new FsmEditPartFactory(), FsmVisualIDRegistry.TYPED_INSTANCE,
				FSMEditPart.MODEL_ID);
	}

}
