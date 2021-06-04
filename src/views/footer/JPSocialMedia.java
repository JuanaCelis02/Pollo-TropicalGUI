package views.footer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.ConstantsGUI;

public class JPSocialMedia extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPSocialMedia() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(1349, 131));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_GREEN));
		initComponents();
	}

	private void initComponents() {
		addLogoFB();
		addLogoTw();
		addLogoIG();
		addLogoYoutube();
		addLogoTV();
		
	}

	private void addLogoFB() {
		
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_FACEBOOK)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(30,480,10,0));
		this.add(jlIcon);
	}

	private void addLogoTw() {
		
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_TWITTER)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(30,50,10,0));
		this.add(jlIcon);
		
	}

	private void addLogoIG() {
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_INSTAGRAM)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(30,50,10,0));
		this.add(jlIcon);
		
	}

	private void addLogoYoutube() {
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_YOUTUBE)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(30,50,10,0));
		this.add(jlIcon);
		
	}

	private void addLogoTV() {
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_PTV)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(30,50,10,0));
		this.add(jlIcon);
		
	}

}
