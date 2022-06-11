package reproductormp3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 625, 473);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel VerticalPanel = new JPanel();
		VerticalPanel.setBounds(0, 0, 183, 473);
		VerticalPanel.setBackground(new Color(34, 40, 49));
		contentPane.add(VerticalPanel);
		VerticalPanel.setLayout(null);
		
		JLabel Disco = new JLabel("");
		Disco.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Disc.png")));
		Disco.setBounds(12, 12, 48, 48);
		VerticalPanel.add(Disco);
		
		JLabel TituloLabel = new JLabel("Muplij");
		TituloLabel.setForeground(new Color(0, 173, 181));
		TituloLabel.setFont(new Font("Roboto", Font.PLAIN, 18));
		TituloLabel.setBounds(63, 25, 77, 27);
		VerticalPanel.add(TituloLabel);
		
		JPanel Content = new JPanel();
		Content.setBackground(new Color(57, 62, 70));
		Content.setBounds(183, 0, 442, 473);
		contentPane.add(Content);
	}
}
