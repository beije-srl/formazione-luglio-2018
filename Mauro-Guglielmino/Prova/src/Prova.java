public class Prova {

	public static void main(String[] args) {

		Prova prova = new Prova();
		System.out.println(prova.pal("otto"));

	}

	public boolean pal(String a) {

		int lunghezza = a.length();
		String palindromo = "";

		for (int i = lunghezza - 1; i >= 0; i--) {
			palindromo = palindromo + a.charAt(i);
		}
		System.out.println(palindromo);
		if (palindromo.equals(a)) {
			return true;
		} else {
			return false;
		}
	}
}