package views.body;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.ConstantsGUI;

public class JPpageStart extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPpageStart() {
		setBackground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_WHITE));
		initComponents();
	}

	private void initComponents() {
		addTitle();
	}

	private void addTitle() {
		
		JLabel jlTitleBody = new JLabel(ConstantsGUI.TEXT_PAGE_START);
		jlTitleBody.setForeground(Color.BLACK);
		jlTitleBody.setFont(new Font("Garage Gothic Bd", Font.BOLD, 30));
		jlTitleBody.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
		jlTitleBody.setAlignmentX(CENTER_ALIGNMENT);
		this.add(jlTitleBody);
		
	}

}
