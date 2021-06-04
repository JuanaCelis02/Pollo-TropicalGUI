package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import views.ConstantsGUI;

public class MyUtils {
	
	public static void setFooterButtonsValues(JButton buttonToChange) {
		
		buttonToChange.setMaximumSize(new Dimension(169,52));
		buttonToChange.setFont(new Font("Arial", Font.BOLD, 15));
		buttonToChange.setForeground(Color.decode(ConstantsGUI.COLOR_BACKGROUND_GREEN));
		buttonToChange.setBackground(null);
		buttonToChange.setBorder(null);
	}
	
}
