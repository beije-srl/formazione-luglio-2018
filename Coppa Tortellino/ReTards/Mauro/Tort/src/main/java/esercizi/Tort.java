package esercizi;

import java.io.IOException;

public class Tort {

	public static void main(String[] args) throws IOException {
		//Valoree a= new Valoree(6);
		//Primi primi=new Primi(114);
		//Pavimento a = new Pavimento(); a.costoPiastrelle(15, 30, 30, a.dimPiastrelle(15, 30));
		//Cambio c = new Cambio(15.70, 70);
		//Timer t= new Timer(); t.secondi(5); oppure t.minuti(1);
		//Fattoriale f = new Fattoriale(7);
		//CoinFlip c= new CoinFlip(15);
		//CountWords cw= new CountWords("C:\\Users\\Nuovo Utente\\Desktop\\wf.txt");
		//CollatzAlgoritmo a=new CollatzAlgoritmo(6);
		Inventario i = new Inventario();
		i.inserisciProdotto("Iphone", "8", "cell bello");
		i.inserisciProdotto("Iphone", "3", "macchina bella");
		i.inserisciProdotto("Beto", "7", "wat");
		i.getProdotto("iphone");
		i.getProdotto("beto");
	}

}
