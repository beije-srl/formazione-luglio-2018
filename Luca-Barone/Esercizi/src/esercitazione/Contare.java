package esercitazione;

public class Contare {

	public static void main(String[] args) {
		/*
		 * Scrivi un programma che stampa i numeri da 1 a 100. Ma per multipli di tre
		 * stampa "Fizz" invece del numero e per i multipli di cinque stampa "Buzz". Per
		 * i numeri che sono multipli di tre e cinque, stampa "FizzBuzz".
		 */

		for (int a = 1; a <= 100; a++) {
			if(a % 3 == 0 && a % 5 == 0) {
				System.out.println("FrizzBuzz");
			}

			else {
				if (a % 5 == 0) {
					System.out.println("Buzz");
				}

				else {
					if (a % 3 == 0 ) {
						System.out.println("Frizz");
					}
					else
					{
						System.out.println(a);
					}
				}
			}

		}
	}

}
