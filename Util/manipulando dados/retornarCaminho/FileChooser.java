package retornarCaminho;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChooser {
	public static void main(String[] args) {
		
		String caminho;
		
		JFileChooser file = new JFileChooser();
		file.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int i = file.showSaveDialog(null);
		if (i == 1) {
			caminho = "";
		} else {
			File arquivo = file.getSelectedFile();
			caminho = arquivo.getPath();
		}
		System.out.println(caminho);
		
		
	}
}
