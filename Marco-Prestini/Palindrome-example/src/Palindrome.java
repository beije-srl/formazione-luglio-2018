
public class Palindrome {
	public static boolean isPalindrome(String o) {
		String r = new StringBuilder(o).reverse().toString();
		return (r.equals(o)); 

		

	}

}
