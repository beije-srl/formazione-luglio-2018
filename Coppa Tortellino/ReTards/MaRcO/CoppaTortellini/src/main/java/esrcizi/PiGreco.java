package esrcizi;

public class PiGreco {

	public PiGreco(int a) {
		if (a >= 2 & a <= 17) {
			double pgreco = Math.PI;
			String s = "" + pgreco;
			String p = s.substring(0, a);
			System.out.println(p);
		} else
			System.out.println("Numero non supportato");
	}
}