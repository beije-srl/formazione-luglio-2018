package competizione;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args)
	{
		
//		Pig Latin - Pig Latin è un gioco di alterazioni giocato 
//		nel gioco di lingua inglese. Per creare la forma di Maiale
//		latino di una parola inglese, il suono della consonante iniziale 
//		viene trasposto alla fine della parola e viene aggiunto un ay 
//		(Es .: "banana" produrrebbe anana-bay). Leggi Wikipedia per 
//		maggiori informazioni sulle regole.
		
		String s = "banana";
		String t = "";
		int l = s.length();
		
		t= s.substring(1, l) + "-" + s.charAt(0) + "ay";
		System.out.println(t);
		
		//QUESTO E' UN METODO PER STAMPARE L'ORA CORRENTE DELLA GIORNATA.
		
//   	int hourOfDay = LocalTime.now().get(ChronoField.HOUR_OF_DAY);
//		
//		if(hourOfDay < 11)    
//		{
//			System.out.println("Good Morning");
//		}
//		else 
//		{
//			System.out.println("Good Night");
//		}


	}

}