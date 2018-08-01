package competizione;

import java.util.Scanner;

public class ContaLettere {
	
public static  int nlettere() {
//creo uno scannere per leggere la stringa inserita dall'utente tramite la console	
	Scanner in = new Scanner(System.in);
	String frase = new String();
	System.out.println("inserisci una frase");
	frase = in.nextLine();
	
	int parola = 0;
	int contatore = 0;
	//effettuo un ciclo for per ciclare interamente la stringa aggiungendo 1 al contatore per ogni carattere incontrato
	for(int i=0;i<frase.length();i++) {
		
			parola = frase.charAt(i);
			contatore ++;
			}
			System.out.println(contatore);
		return contatore;
		}

 public static void main(String[] args) {
	 //stampo il metodo
	int a=nlettere();
}
}


