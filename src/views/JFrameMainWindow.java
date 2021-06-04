package views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JFrameMainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPMainPanel mainPanel;
	
	public JFrameMainWindow() {
		setExtendedState(MAXIMIZED_BOTH);
		setIconImage(new ImageIcon(getClass().getResource(ConstantsGUI.LOGO_PAGE)).getImage());
		setTitle(ConstantsGUI.TEXT_POLLO_TROPICAL);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		mainPanel = new JPMainPanel();
		JScrollPane jsPMainPanel = new JScrollPane();
		jsPMainPanel.setViewportView(mainPanel);
		jsPMainPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(jsPMainPanel);
	}
}
