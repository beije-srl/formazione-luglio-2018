package esercizi;

public class CollatzAlgoritmo {
	public CollatzAlgoritmo(int a) {		//dato un intero quanti passaggi richiesti dall'esercizio servono per arrivare ad 1?

		int numero = a;
		int numeropassaggi = 0;

		if (numero < 1) {
			System.out.println("Numero non valido");
		} else {
			while (true) {
				if (numero % 2 == 0) {
					numero = numero / 2;
				} else if (numero == 1) {
					numeropassaggi += 1;
					break;
				} else {
					numero = numero * 3 + 1;
				}
				numeropassaggi += 1;
			}

		}
		System.out.println("Il numero di passaggi per arrivare ad uno è: " + numeropassaggi);
	}
}