package competizione;

public class Palindromo {

	public static void main(String[] args) {
		String s = "otto";
		String t = "";
		int l = s.length();

	 for (int i = l - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
	 if (s.equals(t))
			System.out.println("La stringa � Palindroma");

		else
			System.out.println("La stringa non � Palindroma");
	}
	    

}
