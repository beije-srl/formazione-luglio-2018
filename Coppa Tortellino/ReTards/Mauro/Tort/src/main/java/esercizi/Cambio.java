package esercizi;

public class Cambio {

	public Cambio(double costo, double soldidati) {

		double resto = soldidati - costo;		//il resto è dato dai soldi forniti meno il costo del prodotto acquistato
		String rest = new String("");			//dichiariamo una stringa per poter andare in seguito a dividere i numeri decimali da quelli prima della virgola
		String dollari = "";					//numeri prima della virgola
		String centesimi = "";					//numeri dopo la virgola
		int quarters = 0;						//quarters, dimes, nickels, pennies di dollaro
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		rest = rest + resto;					//immettiamo nella stringa il resto trovato
		int contatore = 0;
		while (true) {

			if (rest.charAt(contatore) == '.') {				//dividiamo il resto trovato in parte intera e decimale
				dollari = rest.substring(0, contatore);
				centesimi = rest.substring(contatore + 1, contatore + 2);
				if (centesimi.length() == 1) {					//se il numero decimale è solo uno ciò vuol dire che dobbiamo aggiungere uno zero (java lo ha omesso)
					centesimi = centesimi + "0";
				}
				int cent = Integer.parseInt(centesimi);
				while (true) {									//divisione del resto nei tipi di monete

					if (cent - 25 > 0) {
						quarters = quarters + 1;
						cent = cent - 25;
					} else if (cent - 10 > 0) {
						dimes = dimes + 1;
						cent = cent - 10;
					} else if (cent - 5 > 0) {
						nickels = nickels + 1;
						cent = cent - 5;
					} else {
						pennies = pennies + 1;
						cent = cent - 1;
						if (pennies == 5) {						// 5 penny = 1 nickels
							pennies = 0;
							nickels = nickels + 1;
						}
						if (cent == 0)
							break;
					}
				}
				break;
			}
			contatore = contatore + 1;
		}
		System.out.println(dollari + " dollari. " + quarters + " quarters. " + dimes + " dimes. " + nickels
				+ " nickels. " + pennies + " pennies");
	}
}