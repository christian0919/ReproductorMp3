package reproductormp3;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class QueueGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public QueueGUI() {
		setMinimumSize(new Dimension(546, 509));
		setSize(new Dimension(546, 509));
		setPreferredSize(new Dimension(546, 509));
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queue Panel");
		lblNewLabel.setForeground(new Color(0, 173, 181));
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 22));
		lblNewLabel.setBounds(24, 11, 138, 32);
		add(lblNewLabel);
	}

}
