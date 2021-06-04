package views.footer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPContainerFooter extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPSocialMedia jpSocialMedia;
	
	public JPContainerFooter() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(1349, 131));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_GREEN));
		initComponents();
	}

	private void initComponents() {
		
		jpSocialMedia = new JPSocialMedia();
		add(jpSocialMedia);
		
	}

}
