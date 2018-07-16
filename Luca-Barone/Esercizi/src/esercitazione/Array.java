package esercitazione;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		int[] Array;
		Array = new int[22];
		Array[0] = 21;
		Array[1] = 13;
		Array[2] = 29;
		Array[3] = 50;
		Array[4] = -8;
		for (int i = 0; i < Array.length; i++) {
			int n = Array[i];

			for (int k = i + 1; k < Array.length; k++) {
				int m = Array[k];
				int tot = n + m;

				if (tot == 42) {
					System.out.println("La somma tra" + " " + n + " " + m + " " + "é 42");
				}

			}
		}

	}
}
