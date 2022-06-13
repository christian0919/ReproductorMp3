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
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel Content;
	private WelcomePage pageBienvenida = new WelcomePage();
	private QueueGUI pageQueue=new QueueGUI();
	private PlaylistPanel pagePlaylist=new PlaylistPanel();
	private SongsPanel pageSongs=new SongsPanel();

	
	
	
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
		initComponents();
		changePanel(0);
		
	}
	
	private void changePanel(int nmPanel){
		
		Content.removeAll();
		pageBienvenida.setBounds(0, 0, 546, 509);
		pageBienvenida.setPreferredSize(new Dimension(546, 509));
		Content.setLayout(null);
		
		switch(nmPanel){
			case 0:
				Content.add(pageBienvenida);
				break;
			case 1:
				Content.add(pageQueue);
				break;
			case 2:
				Content.add(pageSongs);
				break;
				
			case 3:
				Content.add(pagePlaylist);
				break;
		}
		
		
		
		Content.revalidate();
		Content.repaint();
	}
	
	private void initComponents() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 722, 635);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(contentPane);
		JPanel VerticalPanel = new JPanel();
		VerticalPanel.setBounds(0, 0, 160, 509);
		VerticalPanel.setBackground(new Color(34, 40, 49));
		contentPane.add(VerticalPanel);
		VerticalPanel.setLayout(null);
		
		JLabel Disco = new JLabel("");
		Disco.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Disc.png")));
		Disco.setBounds(12, 12, 48, 48);
		VerticalPanel.add(Disco);
		
		JLabel TituloLabel = new JLabel("Muplij");
		TituloLabel.setForeground(new Color(0, 173, 181));
		TituloLabel.setFont(new Font("Roboto", Font.PLAIN, 25));
		TituloLabel.setBounds(63, 25, 77, 27);
		VerticalPanel.add(TituloLabel);
		
		JPanel BtnList = new JPanel();

		BtnList.setBackground(new Color(34, 40, 49));
		BtnList.setBounds(0, 115, 161, 27);
		VerticalPanel.add(BtnList);
		BtnList.setLayout(new BoxLayout(BtnList, BoxLayout.X_AXIS));
		
		JLabel Listicon = new JLabel("");
		Listicon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/List.png")));
		BtnList.add(Listicon);
		
		JLabel ListaLabel = new JLabel("    Queue");
		ListaLabel.setForeground(new Color(0, 173, 181));
		ListaLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		ListaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BtnList.add(ListaLabel);

		JPanel BtnSongs = new JPanel();

		BtnSongs.setBackground(new Color(34, 40, 49));
		BtnSongs.setBounds(0, 142, 161, 27);
		VerticalPanel.add(BtnSongs);
		BtnSongs.setLayout(new BoxLayout(BtnSongs, BoxLayout.X_AXIS));
		
		JLabel SongIcon = new JLabel("");
		SongIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/notes.png")));
		BtnSongs.add(SongIcon);
		
		JLabel SongsLabel = new JLabel("    Songs");
		SongsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SongsLabel.setForeground(new Color(0, 173, 181));
		SongsLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		BtnSongs.add(SongsLabel);
		

		JPanel BtnPlaylist = new JPanel();

		BtnPlaylist.setBackground(new Color(34, 40, 49));
		BtnPlaylist.setBounds(0, 169, 161, 27);
		VerticalPanel.add(BtnPlaylist);
		BtnPlaylist.setLayout(new BoxLayout(BtnPlaylist, BoxLayout.X_AXIS));
		
		JLabel PlaylistIcon = new JLabel("");
		PlaylistIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Playlist.png")));
		BtnPlaylist.add(PlaylistIcon);
		
		JLabel PlaylistLabel = new JLabel("    Playlist");
		PlaylistLabel.setForeground(new Color(0, 173, 181));
		PlaylistLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PlaylistLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		BtnPlaylist.add(PlaylistLabel);
		
		JLabel InfoIcon = new JLabel("");
		InfoIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Pregunta1.png")));
		InfoIcon.setBounds(0, 473, 26, 36);
		VerticalPanel.add(InfoIcon);
		
		JPanel ControlPanel = new JPanel();
		ControlPanel.setBounds(0, 509, 706, 87);
		contentPane.add(ControlPanel);
		ControlPanel.setBackground(new Color(34, 40, 49));
		
		Content = new JPanel();
		Content.setMinimumSize(new Dimension(546, 509));
		Content.setBackground(Color.WHITE);
		Content.setBounds(160, 0, 546, 509);
		contentPane.add(Content);
		
		/*Buttons events*/
		BtnList.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {ListaLabel.setForeground(new Color(0, 255, 245));}
			public void mouseExited(MouseEvent e) {ListaLabel.setForeground(new Color(0, 173, 181));}
			public void mouseClicked(MouseEvent e) {
				//Change colors
				BtnList.setBackground(new Color(57, 62, 70));
				BtnSongs.setBackground(new Color(34, 40, 49));
				BtnPlaylist.setBackground(new Color(34, 40, 49));
				changePanel(1);
				
				
			}
		});
		
		
		BtnSongs.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {SongsLabel.setForeground(new Color(0, 255, 245));}
			public void mouseExited(MouseEvent e) {SongsLabel.setForeground(new Color(0, 173, 181));}
			public void mouseClicked(MouseEvent e) {
				//change background
				BtnList.setBackground(new Color(34, 40, 49));
				BtnSongs.setBackground(new Color(57, 62, 70));
				BtnPlaylist.setBackground(new Color(34, 40, 49));
				changePanel(2);
			}
		});
		
		BtnPlaylist.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {PlaylistLabel.setForeground(new Color(0, 255, 245));}
			public void mouseExited(MouseEvent e) {PlaylistLabel.setForeground(new Color(0, 173, 181));}
			public void mouseClicked(MouseEvent e) {
				//change background
				BtnPlaylist.setBackground(new Color(57, 62, 70));
				BtnList.setBackground(new Color(34, 40, 49));
				BtnSongs.setBackground(new Color(34, 40, 49));
				changePanel(3);
			}
		});
		
		InfoIcon.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {InfoIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Pregunta2.png")));}
			public void mouseExited(MouseEvent e) {InfoIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Pregunta1.png")));}
			public void mouseClicked(MouseEvent e) {
				changePanel(0);
			}
		});
		/*End button events*/	
	} 
}
