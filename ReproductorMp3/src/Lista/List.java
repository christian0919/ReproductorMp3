package Lista;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

public class List extends JList{
	
	public DefaultListModel model= new DefaultListModel();

	public List() {
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setModel(model);
		this.setFont(new Font("Roboto", Font.PLAIN, 14));
		this.setForeground(new Color(0, 173, 181));
		this.setBackground(new Color(57, 62, 70));
		this.setSelectionBackground(new Color(34, 40, 49));
		this.setSelectionForeground(new Color(0, 173, 181));
		this.setBorder(new LineBorder(new Color(34, 40, 49), 1, true));
		this.clearSelection();
	}

}
