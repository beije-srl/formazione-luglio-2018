package competizione;

import java.util.Scanner;

public class Calcolatrice {
	
	public static String addizione() {
		//creo uno scanner per leggere dalla console
		Scanner in = new Scanner(System.in);		
		System.out.print("Inserisci il primo numero da sommare :");
		String a = "";
		a = in.nextLine();
		System.out.print("Inserisci il secondo numero da sommare :");
		String b = "";
		b = in.nextLine();
		String somma = "";
	/*effettuo un centro di comando per verificare se l'utente sta inserende realmente qualcosa senza
	 * lasciare dei campi vuoti 
	 */
		if(a.equals("") ||b.equals("")) {
			//in caso di campi vuoti stamperò il seguente messaggio
			System.out.println("ATTENZIONE,RIEMPIRE TUTTI I CAMPI PER PROSEGURIRE!");
			return addizione();
		}
		else {
			somma = Double.parseDouble(a) + Double.parseDouble(b) + "";
		}
		return somma;
	}
	public static String sottrazione() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il primo numero da sottrarre :");
		String a = "";
		a = in.nextLine();
		System.out.print("Inserisci il secondo numero da sottrarre :");
		String b = "";
		b = in.nextLine();
		String sottrazione = ""; 
		if(a.equals("")   || b.equals(""))    {
			System.out.println("ATTENZIONE, I VALORI DI UNO O PIU' CAMPI SONO ERRATI!");
			return sottrazione();
		}
		else {
			sottrazione = Double.parseDouble(a) - Double.parseDouble(b) + "";
		}
		return sottrazione;
	}
	public static String divisione() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il primo numero da dividere :");
		String a = "";
		a = in.nextLine();
		System.out.print("Inserisci il secondo numero da dividere :");
		String b = "";
		b = in.nextLine();
		String divisione = "";
		if(a.equals("")   || b.equals(""))    {
			System.out.println("ATTENZIONE, I VALORI DI UNO O PIU' CAMPI SONO ERRATI!");
			return divisione();
		}
		else {
			divisione = Double.parseDouble(a) / Double.parseDouble(b) + "";
		}
		return divisione;
	}
	public static String moltiplicazione() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il primo numero da moltiplicare :");
		String a = "";
		a = in.nextLine();
		System.out.print("Inserisci il secondo numero da moltiplicare :");
		String b = "";
		b = in.nextLine();
		String moltiplicare = "";
		
		if(a.equals("")   || b.equals(""))    {
			System.out.println("ATTENZIONE, I VALORI DI UNO O PIU' CAMPI SONO ERRATI!");
			return moltiplicazione();
		}
		else {
			moltiplicare = Double.parseDouble(a) * Double.parseDouble(b) + "";
		}
		return moltiplicare;
	}
	public static String radicequadrata() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero per calcolare la radice quadrata :");
		String a = "";
		a = in.nextLine();

		String radice = "";
		
		if(a.equals(""))  {
			System.out.println("ATTENZIONE, I VALORI DI UNO O PIU' CAMPI SONO ERRATI!");
			return radicequadrata();
		}
		else {
			radice = Math.sqrt(Double.parseDouble(a)) + "";
		}
		return radice;
	}
	public static String pigreco() {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero per calcolare il PI :");
		String a = "";
		a = in.nextLine();
		String pigreco = "";
		if(a.equals(""))    {
			System.out.println("ATTENZIONE, I VALORI DI UNO O PIU' CAMPI SONO ERRATI!");
			return pigreco();
		}
		else {
			pigreco = Double.parseDouble(a) * 3.14159265359 + "";
		}
		return pigreco;
	}
	public static void main(String[] args) {
		//stampo i risultati di tutte le operazioni
		System.out.println("La somma è :" + " " + addizione() + "\n");
		System.out.println("La sottrazione è :" + " " + sottrazione() + "\n");
		System.out.println("La divisione è :" + " " + divisione() + "\n");
		System.out.println("La moltiplicazione è :" + " " + moltiplicazione() + "\n");
		System.out.println("La radie quadrata è :" + " " + radicequadrata() + "\n");
		System.out.println("Il PI è :" + " " + pigreco() + "\n");
	}
}
