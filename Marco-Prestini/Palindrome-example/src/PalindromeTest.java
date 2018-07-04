import java.util.Scanner;

public class PalindromeTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Scrivi una parola");
		String o = in.nextLine();
		System.out.println(Palindrome.isPalindrome(o));

	}
}
