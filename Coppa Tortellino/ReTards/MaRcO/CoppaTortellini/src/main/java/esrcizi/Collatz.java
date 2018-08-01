package esrcizi;

import java.util.*;

public class Collatz {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int num = console.nextInt();
		System.out.println("servoni " + solve(num) + " passi per raggiungere 1 usando la Congettura di Collatz,");
		System.out.println("inizianso dal numero " + num + ".");

	}

	public static int solve(int n) {
		if (n == 1) {
			return 0;
		} else if (n % 2 == 0) {
			return 1 + solve(n / 2);
		} else {
			return 1 + solve(n * 3 + 1);
		}
	}

}
