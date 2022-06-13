package reproductormp3;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;

public class WelcomePage extends JPanel {

	public WelcomePage() {
		setMinimumSize(new Dimension(546, 509));
		setSize(new Dimension(546, 509));
		setPreferredSize(new Dimension(546, 509));
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(0, 173, 181));
		lblNewLabel.setBounds(0, 0, 113, 31);
		add(lblNewLabel);
		
		
		
	
	}
}
