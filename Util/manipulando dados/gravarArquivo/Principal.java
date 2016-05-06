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
		
		// GRAVAR NO ARQUIVO.
		try {
		
			// TIRANDO O "TRUE" DO PARAMETRO, QUANDO GRAVAR NO ARQUIVO, O CONTEÚDO SEMPRE SERÁ SUBSTITUIDO.
			FileWriter arq = new FileWriter(caminho, true);

			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.printf("Teestando!");
			
			arq.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
