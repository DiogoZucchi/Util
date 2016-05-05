package gravarArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class Principal {
	public static void main(String[] args) {
		
		// PEGAR CAMINHO DO ARQUIVO.
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
		
		// GRAVAR NO ARQUIVO.
		try {
		
			FileWriter arq = new FileWriter(caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.printf("Teestando!");
			
			arq.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
