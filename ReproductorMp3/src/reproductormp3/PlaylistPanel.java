package reproductormp3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Lista.List;

public class PlaylistPanel extends JPanel {

	private List PlaylistList = new List();
	private List SongsList = new List();

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
		//Listas
		//Lista 1 muestra las playlist generadas
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBorder(null);
		scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane1.setBounds(39, 78, 236, 402);
		scrollPane1.getViewport().setBackground(new Color(57, 62, 70));
		add(scrollPane1);
		scrollPane1.setViewportView(PlaylistList);
		PlaylistList.model.addElement("playlist1");//borrar despues 

		//Lista 2 muestra las canciones de la playlist seleccionada
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane2.setBorder(null);
		scrollPane2.setBounds(277, 78, 236, 402);
		add(scrollPane2);
		scrollPane2.setViewportView(SongsList);
		SongsList.model.addElement("Cancion 1");//borrar despues 
		SongsList.model.addElement("Cancion 2");//borrar despues 

	}
}
