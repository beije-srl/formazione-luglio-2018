package esercizi;

public class Valoree {

	public Valoree(int a){
	
	if(a>2 && a<17){
	double eulero = Math.E; //per maggiore precisione avremmo potuto utilizzare BigDecimal
	String val=""+eulero;
	val=val.substring(0,a+2); //togliamo la virgola e il primo numero non decimale oltre ai numeri non voluti
	System.out.println(val);
	}
	else System.out.println("Il valore inserito non è valido");
	}
	
}
