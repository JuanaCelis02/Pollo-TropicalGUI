package views.body;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import views.ConstantsGUI;

public class JPCenterBody extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPanelCenterImageOne jpanelCenterOne;
	private JPanelCenterImageTwo jpanelCenterTwo;
	private JPanelCenterImageThree jpanelCenterThree;
	
	public JPCenterBody() {
		setAlignmentX(LEFT_ALIGNMENT);
		setLayout(new GridLayout(0,3,10,10));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		initComponents();
		
	}

	private void initComponents() {
		jpanelCenterOne = new JPanelCenterImageOne();
		add(jpanelCenterOne);
		
		jpanelCenterTwo = new JPanelCenterImageTwo();
		add(jpanelCenterTwo);
		
		jpanelCenterThree = new JPanelCenterImageThree();
		add(jpanelCenterThree);
		
	}	

}
