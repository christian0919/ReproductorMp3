package reproductormp3;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DirectorySelect extends JFileChooser {

		//private FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.mp3", "MP3");
	
	public DirectorySelect() {
		this.setCurrentDirectory(new File(".") );
		this.setDialogTitle("Escoge el direcrtorio donde tienes tus canciones.");
		this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		this.setAcceptAllFileFilterUsed(false);
		//this.setFileFilter(filtro);
		
	}

}
