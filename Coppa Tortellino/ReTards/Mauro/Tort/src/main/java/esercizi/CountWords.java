package esercizi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public CountWords(String pathfile) {  //dato il path di un file lo restituisce sottoforma di stringa e ne conta le parole
		BufferedReader br = null;
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		int contatoreparole = 0;

		try {

			fr = new FileReader(pathfile);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {		//ciclo tutte le righe non vuote del file di testo
				sb.append(sCurrentLine).append(" ");				//ad ogni fine riga metto uno spaio affinché l'ultima parola di una riga non sia attaccata alla prima della riga dopo
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
		sb.trimToSize();
		System.out.println(sb);

		for (int x = 0; x < sb.length(); x++) {
			if (sb.charAt(x) == ' ') {								//il numero di parole in un file equivale al numero di spazi presenti
				contatoreparole += 1;
			}
		}
		System.out.println("Le parole nel file sono " + contatoreparole);

	}
}