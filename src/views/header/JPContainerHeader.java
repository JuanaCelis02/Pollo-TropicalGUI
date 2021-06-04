package views.header;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPContainerHeader extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPBanner jpBanner;
	private JPButtonsHeader jpButtons;
	
	
	public JPContainerHeader() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		initComponents();

	}


	private void initComponents() {
		
		jpButtons = new JPButtonsHeader();
		this.add(jpButtons);
		
		jpBanner = new JPBanner();
		this.add(jpBanner);
	}

}
