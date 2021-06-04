package views.header;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import utils.MyUtils;
import views.ConstantsGUI;

public class JPButtonsHeader extends JPanel{

	private static final long serialVersionUID = 1L;

	public JPButtonsHeader() {
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		setPreferredSize(new Dimension(1349,91));
		initComponents();
	}

	private void initComponents() {
		addLogoPolloTropical();
		addButtonsWithoutBackground();
		addButtonGreen();
		
	}

	private void addLogoPolloTropical() {
		
		JButton jbIcon = new JButton();
		jbIcon.setBackground(null);
		jbIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_POLLO)).getImage().getScaledInstance(164,80,Image.SCALE_SMOOTH)));
		jbIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		jbIcon.setBorder(null);
		jbIcon.setBorder(BorderFactory.createEmptyBorder(0,40,0,280));
		add(jbIcon);	
	}

	private void addButtonsWithoutBackground() {
		JButton jbApps = new JButton(ConstantsGUI.TEXT_BUTTON_MENU);
		MyUtils.setFooterButtonsValues(jbApps);
		this.add(jbApps);
		
		JButton jbNosotros = new JButton(ConstantsGUI.TEXT_BUTTON_MY_POLLO);
		MyUtils.setFooterButtonsValues(jbNosotros);
		add(jbNosotros);
		
		JButton jbServicios = new JButton(ConstantsGUI.TEXT_BUTTON_CATERING);
		MyUtils.setFooterButtonsValues(jbServicios);
		add(jbServicios);
		
		JButton jbPortafolio = new JButton(ConstantsGUI.TEXT_BUTTON_LOCATIONS);
		MyUtils.setFooterButtonsValues(jbPortafolio);
		add(jbPortafolio);
	}

	private void addButtonGreen() {
		
		JButton jbOrderNow = new JButton(ConstantsGUI.TEXT_BUTTON_ORDER_NOW);
		jbOrderNow.setMaximumSize(new Dimension(169,52));
		jbOrderNow.setFont(new Font("Arial", Font.BOLD, 15));
		jbOrderNow.setForeground(Color.WHITE);
		jbOrderNow.setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_GREEN));
		add(jbOrderNow);
		
	}

}
