package reproductormp3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlaylistPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlaylistPanel() {
		setMinimumSize(new Dimension(546, 509));
		setSize(new Dimension(546, 509));
		setPreferredSize(new Dimension(546, 509));
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PlaylistPanel");
		lblNewLabel.setForeground(new Color(0, 173, 181));
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 22));
		lblNewLabel.setBounds(24, 11, 138, 32);
		add(lblNewLabel);
	}

}
