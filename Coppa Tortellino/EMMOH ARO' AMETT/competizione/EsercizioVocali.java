package competizione;

public class EsercizioVocali {

	public static void  main(String[] args) {

		String s = "forzanapolipersempre";
		 
		int conteggioA = 0;
		int conteggioE = 0;
		int conteggioI = 0;
		int conteggioO = 0;
		int conteggioU = 0;
		float a = 0;
	
		
		System.out.println(a);
		
//	for(int i = 0; i<s.length();i++)
//		{
//			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
//			   s.charAt(i) == 'o' || s.charAt(i) == 'u')
//			{
//				count ++;
//			}
//		}
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				conteggioA++;
			} else if (s.charAt(i) == 'e') {
				conteggioE++;
			} else if (s.charAt(i) == 'i') {
				conteggioI++;
			} else if (s.charAt(i) == 'o') {
				conteggioO++;
			} else if (s.charAt(i) == 'u') {
				conteggioU++;
			}
		}

		System.out.println("la lettera A compare:" + conteggioA);
		System.out.println("la lettera E compare:" + conteggioE);
		System.out.println("la lettera I compare:" + conteggioI);
		System.out.println("la lettera O compare:" + conteggioO);
		System.out.println("la lettera U compare:" + conteggioU);
	}

}
