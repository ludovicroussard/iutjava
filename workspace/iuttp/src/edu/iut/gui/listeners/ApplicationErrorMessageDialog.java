package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {
	
	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		jop1 = new JOptionPane();
		jop1.showMessageDialog(null, message,level,JOptionPane.ERROR_MESSAGE);
		
	}


}
