package competizione;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sveglia {
	final static int ora = 07;
	final static int minuti = 30;
	public static boolean Check() {
		/*effettuo un centro di controllo affinchË l'ora e i minuti combacino con le 
		*propriet‡ da me crate.In questo caso alle 7,30 precise questo codice stamper‡
		*il metodo allarmesveglia.
		*/
		
		Date data1 = new Date();
		if(data1.getHours()==ora && data1.getMinutes()==minuti)
		{
			return true;
		}
		return false;
	
	}
		public static void  allarmesveglia() {
			while(!Check());
		
		System.out.println("SVEGLIAAAAAAAA BACCAL¡¡¡¡¡¡¡¡¡¡¡¡¡");
	
		}

	public static void main(String[] args) {
		allarmesveglia();
	}

}
