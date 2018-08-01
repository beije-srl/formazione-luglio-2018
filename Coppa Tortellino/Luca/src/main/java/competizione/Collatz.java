package competizione;

import java.util.Scanner;

public class Collatz {
	
	public static int verificanumeri() {
		//creo 3 valori interi.
		int x = 11;
		int q = x/2;
		int resto = x - q * 2;
		/*effettuo un centro di controllo per verificare se il numero e pari o dispari.
		*se il numero ritorna resto 0 vuol dire che è pari quindi verrà diviso per 2.
		*Se questa condizione non si dovesse verificare automaticamente il numero sarà dispari,
		*quindi verrà moltiplicato per 3 e incrementato di 1.
		*/
		if(resto == 0) {
			x = x/2;
			System.out.println("Numero Pari diviso 2");
		}
		else {
			x = x * 3 + 1;
		System.out.println("Numero Dispari moltiplicato per 3 e incrementato di 1");
		}
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(verificanumeri());
	}

}
