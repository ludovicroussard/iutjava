package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {
	@Override
	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		jop1 = new JOptionPane();
		jop1.showMessageDialog(null, message,"Erreur",JOptionPane.ERROR_MESSAGE);
		
	}

}
