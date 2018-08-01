package esercizi;

public class Primi {

	String stringa = "";
	public Primi(int a){
		
		while(true){
		if(a%5==0){a=a/5; stringa = stringa + "Fattore Primo:5, il numero ora è "+a+". ";}
		else if(a%3==0){a=a/3; stringa = stringa + "Fattore Primo:3, il numero ora è "+a+". ";}
		else if(a%2==0){a=a/2; stringa = stringa + "Fattore Primo:2, il numero ora è "+a+". ";}
		else{break;}
		}
		if(stringa=="")System.out.println("Il numero è primo");
		else System.out.println(stringa+"che non è fattorizzabile");
	}
}
