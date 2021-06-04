package views.header;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPBanner extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPBanner() {
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		setPreferredSize(new Dimension(1349, 241));
		initComponents();
		
	}
		
	private void initComponents() {
		addBannerImage();
		
	}

	private void addBannerImage() {
		JLabel jlBanner = new JLabel();
		jlBanner.setHorizontalTextPosition(JLabel.CENTER);
		jlBanner.setVerticalAlignment(JLabel.BOTTOM);
		jlBanner.setPreferredSize(new Dimension(1355,241));
		jlBanner.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.BANNER_HEADER)));
		jlBanner.setBorder(null);
		this.add(jlBanner);
	}
	

}
