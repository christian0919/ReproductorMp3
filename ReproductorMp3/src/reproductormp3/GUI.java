package reproductormp3;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel Content;
	private WelcomePage pageBienvenida = new WelcomePage();
	private QueueGUI pageQueue=new QueueGUI();
	private PlaylistPanel pagePlaylist=new PlaylistPanel();
	private SongsPanel pageSongs=new SongsPanel();
	public JFileChooser SelectDyrectory = new JFileChooser();

	
	
	
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
		setTitle("Muplij");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/imgs/Pause.png")));
		initComponents();
		changePanel(0);
		setUndecorated(true);

		
	}
	
	private void changePanel(int nmPanel){
		
		Content.removeAll();
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
		setBounds(0, 0, 704, 619);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(contentPane);
		JPanel VerticalPanel = new JPanel();
		VerticalPanel.setBounds(0, 0, 160, 533);
		VerticalPanel.setBackground(new Color(34, 40, 49));
		contentPane.add(VerticalPanel);
		
		SelectDyrectory.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		VerticalPanel.setLayout(null);
		
		
		JLabel Disco = new JLabel("");
		Disco.setBounds(12, 12, 48, 48);
		Disco.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Disc.png")));
		VerticalPanel.add(Disco);
		
		JLabel TituloLabel = new JLabel("Muplij");
		TituloLabel.setBounds(63, 25, 77, 27);
		TituloLabel.setForeground(new Color(0, 173, 181));
		TituloLabel.setFont(new Font("Roboto", Font.PLAIN, 25));
		VerticalPanel.add(TituloLabel);
		
		JPanel BtnList = new JPanel();
		BtnList.setBounds(0, 115, 161, 27);

		BtnList.setBackground(new Color(34, 40, 49));
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
		BtnSongs.setBounds(0, 142, 161, 27);

		BtnSongs.setBackground(new Color(34, 40, 49));
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
		
		pageBienvenida.setBounds(0, 0, 546, 509);
		pageBienvenida.setPreferredSize(new Dimension(546, 509));

		JPanel BtnPlaylist = new JPanel();
		BtnPlaylist.setBounds(0, 169, 161, 27);

		BtnPlaylist.setBackground(new Color(34, 40, 49));
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
		InfoIcon.setBounds(0, 473, 26, 36);
		InfoIcon.setIcon(new ImageIcon(GUI.class.getResource("/imgs/Pregunta1.png")));
		VerticalPanel.add(InfoIcon);
		
		JPanel ControlPanel = new JPanel();
		ControlPanel.setBounds(0, 532, 706, 87);
		contentPane.add(ControlPanel);
		ControlPanel.setBackground(new Color(34, 40, 49));
		
		Content = new JPanel();
		Content.setMinimumSize(new Dimension(546, 509));
		Content.setBackground(Color.WHITE);
		Content.setBounds(160, 24, 546, 509);
		contentPane.add(Content);
		
		JPanel bar = new JPanel();
		bar.setBounds(160, 0, 544, 24);
		bar.setBackground(new Color(34, 40, 49));
		contentPane.add(bar);
		bar.setLayout(null);
		
		JLabel MinimazeBTN = new JLabel();
		MinimazeBTN.setBounds(476, 0, 24, 24);
		MinimazeBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgminimizar1.png")));
		bar.add(MinimazeBTN);
		
		JLabel ExitBTN = new JLabel("");

		ExitBTN.setBounds(510, 0, 24, 24);
		ExitBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgexit1.png")));
		bar.add(ExitBTN);
		
		/*Buttons events*/
		
		ExitBTN.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {ExitBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgexit2.png")));}
			public void mouseExited(MouseEvent e) {ExitBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgexit1.png")));			}
			public void mouseClicked(MouseEvent e) {System.exit(1);}
		});
		MinimazeBTN.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {MinimazeBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgminimizar2.png")));}
			public void mouseExited(MouseEvent e) {MinimazeBTN.setIcon(new ImageIcon(GUI.class.getResource("/imgs/imgminimizar1.png")));			}
			//public void mouseClicked(MouseEvent e) {this.setExtendedState(ICONIFIED); }
		});
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
				BtnPlaylist.setBackground(new Color(34, 40, 49));
				BtnList.setBackground(new Color(34, 40, 49));
				BtnSongs.setBackground(new Color(34, 40, 49));
				changePanel(0);
			}
		});
		/*End button events*/	
	} 
}
