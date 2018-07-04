import java.util.*;
import java.lang.Object;

public class BooleanPal {
	public static void main(String args[]) {
		String o;
		Scanner in = new Scanner(System.in);

		System.out.println("Scrivi una parola");
		o = in.nextLine();

		boolean sb = new StringBuilder(o).reverse().toString().equals(o);
		System.out.println(sb);

	}

}