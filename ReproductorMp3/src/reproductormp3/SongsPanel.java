package reproductormp3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Lista.List;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;


public class SongsPanel extends JPanel {

	private List songsList = new List();
	private DirectorySelect sd= new DirectorySelect();
	
	public SongsPanel() {
		setMinimumSize(new Dimension(546, 509));
		setSize(new Dimension(546, 509));
		setPreferredSize(new Dimension(546, 509));
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Songs Panel");
		lblNewLabel.setForeground(new Color(0, 173, 181));
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 22));
		lblNewLabel.setBounds(24, 11, 138, 32);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 96, 526, 402);
		scrollPane.getViewport().setBackground(new Color(57, 62, 70));
		add(scrollPane);

		scrollPane.setViewportView(songsList);
		//Table creation
		songsList.model.addElement("Cancion 1");
		songsList.model.addElement("Cancion 2");
		
		JLabel btAddDirectory = new JLabel("");
		btAddDirectory.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/SelectDirectory1.png")));
		btAddDirectory.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			 int selection= sd.showSaveDialog(btAddDirectory);
				
			}
			public void mouseEntered(MouseEvent e){btAddDirectory.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/SelectDirectory2.png")));}
			public void mouseExited(MouseEvent e) {btAddDirectory.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/SelectDirectory1.png")));}
		});
		btAddDirectory.setBounds(10, 61, 24, 24);
		add(btAddDirectory);
		
		JLabel btnAddSong = new JLabel("");
		btnAddSong.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e){btnAddSong.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/AddSong2.png")));}
			public void mouseExited(MouseEvent e) {btnAddSong.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/AddSong1.png")));}
		});
		btnAddSong.setIcon(new ImageIcon(SongsPanel.class.getResource("/imgs/AddSong1.png")));
		btnAddSong.setBounds(49, 61, 24, 24);
		add(btnAddSong);
		
	}
}

