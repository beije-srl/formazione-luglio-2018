package esercizi;

import java.util.Random;

public class CoinFlip {

	public CoinFlip(int numerolanci){						//dato un numero di lanci lanciamo la moneta n volte
		
		int testa=0;
		int croce=0;
		if(numerolanci!=0){
		while(numerolanci>0){
		Random random = new Random();
		boolean moneta = random.nextBoolean();				//simuliamo lancio moneta con random boolean
		
		if (moneta){testa=testa+1;System.out.println("E' uscito testa.");}
		else{croce=croce+1;System.out.println("E' uscito croce.");}
		--numerolanci;
		}
		System.out.println("E' uscito "+testa+" volte testa e "+croce+" volte croce.");
	}
		else System.out.println("inserire valore valido");}
}
