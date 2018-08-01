package esercizi;

public class Fattoriale {

	public Fattoriale(int positivo) {
		int somma = 1;
		if (positivo < 0)
			System.out.println("Il numero deve essere positivo");
		else {
			for (int x = 0; x < positivo; x++) {

				somma = somma * (positivo - x);
			}
			System.out.println(somma);
		}
		
	}
	
	public long factorial(int n) { //altro metodo più breve
	    if (n == 1) return 1; 
	    return n * factorial(n-1); 
	} 
}