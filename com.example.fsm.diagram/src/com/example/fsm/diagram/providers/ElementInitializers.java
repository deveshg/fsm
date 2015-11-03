package com.example.fsm.diagram.providers;

import com.example.fsm.diagram.part.FsmDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = FsmDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			FsmDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
