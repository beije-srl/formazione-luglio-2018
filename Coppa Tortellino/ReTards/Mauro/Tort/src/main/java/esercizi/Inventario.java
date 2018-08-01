package esercizi;

import java.util.ArrayList;

public class Inventario {

	ArrayList<String[][]> prodotti = new ArrayList<String[][]>();
	String a;
	boolean boleano;

	public void inserisciProdotto(String nomeprodotto, String quantitaprodotto, String descrizione) {
		if (nomeprodotto != null && quantitaprodotto != null && descrizione != null) {			//check se sono state inserite tutti i dati richiesti

			try {
				Integer stringatoint = Integer.parseInt(quantitaprodotto);						//check se la quantità è un valore numerico altrimenti viene lanciata eccezione gestita nel catch
				if (prodotti.size() > 0) {														//se ci sono già prodotti nell'inventario bisogna fare un check per vedere se quelli che si stanno aggiungendo sono già presenti andando ad aumentare solo la quantità di essi senza crearne di nuovi
					for (int x = 0; x < prodotti.size(); x++) {	
						String[][] array = prodotti.get(x);
						if (array[0][0].equalsIgnoreCase(nomeprodotto)) {
							Integer intero = Integer.parseInt(array[0][1]);
							Integer somma = 0;
							somma = intero + stringatoint;
							array[0][1] = somma.toString();
							array[0][2] = descrizione;
						} else {																//se non ci sono prodotti uguali o se non ci sono proprio prodotti nell'inventario se ne aggiungono di nuovi
							String[][] a = new String[1][3];
							a[0][0] = nomeprodotto;
							a[0][1] = quantitaprodotto;
							a[0][2] = descrizione;
							prodotti.add(a);
							System.out.println(nomeprodotto + " inserito nell'inventario.");
						}
					}
				} else {
					String[][] a = new String[1][3];
					a[0][0] = nomeprodotto;
					a[0][1] = quantitaprodotto;
					a[0][2] = descrizione;
					prodotti.add(a);
					System.out.println(nomeprodotto + " inserito nell'inventario.");
				}
			} catch (Exception e) {
				System.out.println("La quantità inserita non è valida: inserire un valore numerico");
			}
		}
	}

	public void getProdotto(String prodottocercato) {			//cerca nell'inventario il prodotto e restituisce tutti i dati relativi ad esso
		for (int x = 0; x < prodotti.size(); x++) {
			String[][] array = prodotti.get(x);
			if (array[0][0].equalsIgnoreCase(prodottocercato)) {
				a = array[0][0] + " " + array[0][1] + " " + array[0][2];
				boleano = true;
				System.out.println("Prodotto trovato");
				System.out.println(a);
			}
		}
		if (boleano == false) {
			System.out.println("Prodotto non trovato");
		}
	}

}