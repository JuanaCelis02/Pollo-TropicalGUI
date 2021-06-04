package views.body;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPContainerBody extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPpageStart jpPageStart;
	private JPCenterBody jpCenter;
		
	public JPContainerBody() {
		
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(1349,634));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		initComponents();
		
	}

	private void initComponents() {
		
		jpPageStart = new JPpageStart();
		add(jpPageStart, BorderLayout.PAGE_START);
		
		jpCenter = new JPCenterBody();
		add(jpCenter, BorderLayout.CENTER);
		
		
	}

}
