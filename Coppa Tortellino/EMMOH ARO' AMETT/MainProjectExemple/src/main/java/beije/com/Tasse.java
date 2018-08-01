package beije.com;

import java.io.InputStream;
import java.util.Scanner;

public class Tasse {
	public double calcoloTasse(double inserito, double tasse) {
		double risultato = 0;
		risultato = inserito + tasse;
		return risultato;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int inserito = 0, tasse = 0;
		while (true) {
			System.out.println("Inserire i tuoi soldi");
			try {
				inserito = tastiera.nextInt();
				System.out.println(inserito);
				System.out.println("Inserire la tassa");
				tasse = tastiera.nextInt();
			} catch (Exception e) {
				// TODO: handle exception

				System.out.println("erroer");
				break;
			}
		}
	}
}
