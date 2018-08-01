package competizione;

import java.util.Scanner;

public class ConvertitoreValute {

	public static String convertiEuro() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire una somma di denaro");
		String denaro;
		denaro = in.nextLine();
		System.out.println("Inserire un tipo di valuta");
		String valuta;
		valuta = in.nextLine();

		double risultato = 0;

		if (valuta.equalsIgnoreCase("sterlina")) {
			risultato = Integer.parseInt(denaro) * 0.89;
		} else {
			risultato = Integer.parseInt(denaro);
		}

		if (valuta.equalsIgnoreCase("dollaro")) {
			risultato = Double.parseDouble(denaro) * 1.17;
		}

		else {
			risultato = Double.parseDouble(denaro);
		}
		return risultato + "";
	}

	public static void main(String[] args) {
		System.out.println(convertiEuro());
	}

}
