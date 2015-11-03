package com.example.fsm.diagram.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @generated
 */
public class DiagramEditorPerspective implements IPerspectiveFactory {
	/**
	 * @generated
	 */
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		IFolderLayout leftFolder = layout.createFolder("leftArea", 1, 0.2F, editorArea);
		leftFolder.addView(IPageLayout.ID_RES_NAV);

		IFolderLayout rightFolder = layout.createFolder("rightArea", 2, 0.7F,editorArea);
		rightFolder.addView(IPageLayout.ID_OUTLINE);

		
		
		IFolderLayout bottomFolder = layout.createFolder("bottomArea", 4, 0.75F, editorArea);
		bottomFolder.addView(IPageLayout.ID_PROP_SHEET);;
		bottomFolder.addView(IPageLayout.ID_PROBLEM_VIEW);		
		bottomFolder.addView(IPageLayout.ID_TASK_LIST);

		layout.addPerspectiveShortcut(DiagramEditorWorkbenchAdvisor.PERSPECTIVE_ID);
		layout.addPerspectiveShortcut("org.eclipse.mylyn.tasks.ui.perspectives.planning");	
	}

}
