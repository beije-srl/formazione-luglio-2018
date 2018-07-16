import java.io.IOException;

public class ConversioneNumerica {

	final int costante = 50;

	public static void main(String[] args) throws IOException {
		ConversioneNumerica prova = new ConversioneNumerica();
		ConversioneNumerica prova1 = new ConversioneNumerica();
		System.out.print(prova.DaBaseXBase10("01010", 2));
		StringBuilder sb = new StringBuilder();

		boolean boleano = true;

		java.io.BufferedReader consolenumero = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Inserisci Valore");
		String riga = consolenumero.readLine();
		int intero = Integer.parseInt(riga);
		while (boleano) {
			java.io.BufferedReader consolebase = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			System.out.println("Inserisci Base");
			String riga1 = consolebase.readLine();
			int intero1 = Integer.parseInt(riga1);

			if (intero1 == 2 || intero1 == 8 || intero1 == 16) {
				sb.append(prova.DaBase10BaseX(intero, intero1));
				sb.reverse();
				System.out.println("Il numero " + intero + " in base " + intero1 + " è uguale a: " + sb);
				boleano = false;

			} else {
				System.out.println("La base può essere solo 2, 8, 10, 16");

			}
		}

	}

	public String DaBase10BaseX(int valore, int NuovaBase) {
		int potenza = 0;
		int resto = 0;
		String stringa = "";
		int num_max = 0;
		if (NuovaBase == 2 || NuovaBase == 8 || NuovaBase == 16) {
			if (NuovaBase == 16) {
				num_max = 9;
			} else if (NuovaBase == 8) {
				num_max = 7;
			} else if (NuovaBase == 2) {
				num_max = 1;
			}

			if (valore < num_max) {
				return stringa + valore;
			} else {
				for (int i = 1; i < costante; i++) {
					potenza = i * NuovaBase;
					if (valore >= potenza || valore >= num_max) {
						while (valore > 0) {
							resto = valore % potenza;
							valore = valore / potenza;
							if (resto < 10) {
								stringa = stringa + resto;
							} else

								switch (resto) {
								case 10:
									stringa = stringa + "A";
									break;
								case 11:
									stringa = stringa + "B";
									break;
								case 12:
									stringa = stringa + "C";
									break;
								case 13:
									stringa = stringa + "D";
									break;
								case 14:
									stringa = stringa + "E";
									break;
								case 15:
									stringa = stringa + "F";
									break;

								}
						}
					}
				}
			}
		}
		return stringa;
	}

	public int DaBaseXBase10(String value, int VecchiaBase) {

		StringBuilder sbi = new StringBuilder();
		sbi.append(value);
		sbi.reverse();
		int b = 0;
		int lunghezza = sbi.length();
		int a = Integer.parseInt(value);
		/*
		 * for (int i = 0; i < lunghezza; i++) { risultato = risultato * VecchiaBase;
		 * 
		 * }
		 * 
		 * for (int i = 0; i < lunghezza; i++) { sub = "" + value.charAt(i); b =
		 * Integer.parseInt(sub); risultato = risultato * b;
		 * System.out.println(risultato);
		 * 
		 * }
		 */
		int potenza1=0;
		int c = 0;
		int potenza = 1;
		int num_max = 0;
		/*
		 * if (VecchiaBase == 2 || VecchiaBase == 8 || VecchiaBase == 16) { if
		 * (VecchiaBase == 16) { num_max = 9; } else if (VecchiaBase == 8) { num_max =
		 * 7; } else if (VecchiaBase == 2) { num_max = 1; }
		 * 
		 * if (a < num_max) { return a; } else {
		 */

		for (int i = 0; i < lunghezza ; i++) {
			{
				c = a % 10;
				 //System.out.println(c);
				a = a / 10;
				// System.out.println(a);
				if (c == 1 && i == 0) {
					b = 1;
				}else
					if (c == 0 && i == 0) {
						b = 0;
					}
				if (c == 1 && i>=1) {
					for (int cont = 0; cont < i; cont++) {
						potenza = potenza * VecchiaBase;
					}
					potenza1=potenza1+potenza;
					//System.out.println(potenza);
					b = b+ potenza1;
					System.out.println(b);
				}

			}

			// System.out.println(b);
		}
		// }

		// }
		/*
		 * int ar=0; ar=2/0; System.out.println(ar);
		 */

		return b;
	}
}
