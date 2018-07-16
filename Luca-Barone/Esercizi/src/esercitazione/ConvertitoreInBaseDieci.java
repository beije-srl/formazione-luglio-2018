package esercitazione;

public class ConvertitoreInBaseDieci {

	public static int daBaseXaBase10(String valore, int base) {
		double tot = 0;
		valore = new StringBuilder(valore).reverse().toString();
		
//		if(base !=2 || base !=8 || base!=16)
//		{
//			System.out.println("La base può essere 2, 8 o 16!");
//			return 0;
//		}
		
		for (int i = 0; i < valore.length(); i++) {
			char currChar = valore.charAt(i);
			int charToInt;

			if (currChar >= 'A') {
				charToInt = Integer.parseInt(currChar - 55 + "");
			} else {
				charToInt = Integer.parseInt(currChar + "");
			}
			tot += charToInt * Math.pow(base, i);
		}
		return  (int) tot;
	}
	
	public static String daBase10aBaseX(int valore, int base)
	{
		String val = "";
		int valTemp = valore;
		

		
//		if(base !=2 || base !=8 || base!=16)
//		{
//			System.out.println("La base può essere 2, 8 o 16!");
//			return null;
//					
//		}
		
		while(valTemp > 0)
		{
			int resto = valTemp % base;
			if(resto > 9)
			{
				val += Character.toString((char)(resto + 55));
				
			}
			else
				val +=Character.toString((char)(resto + 48));
			
			valTemp = Math.abs(valTemp / base);
			
		}
		
		return new StringBuilder(val).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(daBaseXaBase10("2", 8));
		System.out.println(daBase10aBaseX(26, 16));

	}

}
