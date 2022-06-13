package reproductormp3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class QueueGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public QueueGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,  559, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setBounds(0, 0, 546, 509);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Queue");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 19));
		panel.add(lblNewLabel);
	}
}
