package lerArquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Principal {
	public static void main(String[] args) {

		//PEGAR CAMINHO DO ARQUIVO.
		File arquivo = null;
		
		JFileChooser file = new JFileChooser();
		file.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int i = file.showSaveDialog(null);
		if (i != 1) {
			arquivo = file.getSelectedFile();
		}
		
		//LER ARQUIVO.
		try {
			
			FileReader arq = new FileReader(arquivo);
			BufferedReader lerArq = new BufferedReader(arq);
			
			String linha = lerArq.readLine(); //Lê a primeira linha.
			
			while (linha != null) {
				System.out.println(linha);
				linha = lerArq.readLine(); //Lê da segunda até a última linha do arquvio.
			}
			
			arq.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
