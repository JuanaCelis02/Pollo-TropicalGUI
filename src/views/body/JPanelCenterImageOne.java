package views.body;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.ConstantsGUI;

public class JPanelCenterImageOne extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPanelCenterImageOne() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		setPreferredSize(new Dimension(430,547));
		initComponents();
		
	}

	private void initComponents() {
		addImageOne();
	}
	

	private void addImageOne() {
		
		JLabel imageCenterPanel = new JLabel();
		imageCenterPanel.setIcon(new ImageIcon(getClass().getResource(ConstantsGUI.BODY_IMAGE_ONE)));
		imageCenterPanel.setBorder(BorderFactory.createMatteBorder(20, 20, 0, 20, Color.WHITE));
		add(imageCenterPanel);
				
		JLabel titleCenterPanel = new JLabel(ConstantsGUI.TITLE_FIRST_IMAGE);
		titleCenterPanel.setFont(new Font("Garage Gothic Bd", Font.BOLD, 20));
		titleCenterPanel.setBorder(BorderFactory.createMatteBorder(20, 140, 20, 20, Color.WHITE));
		add(titleCenterPanel);
		
		JLabel textCenterPanel = new JLabel(ConstantsGUI.TEXT_FIRST_IMAGE);
		textCenterPanel.setFont(new Font("Garage Gothic Bd", Font.PLAIN, 15));
		textCenterPanel.setBorder(BorderFactory.createMatteBorder(0, 30, 20, 20, Color.WHITE));
		add(textCenterPanel);
		
		
	}

}
