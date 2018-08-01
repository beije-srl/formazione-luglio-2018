package esercizi;

public class Timer {

	public void secondi(int secondi) {
		System.out.println("La sveglia suonerà tra " + secondi + " secondi"); //sveglia in secondi
		int sveglia = 1000 * secondi;			

		try {
			Thread.sleep(sveglia);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		java.awt.Toolkit.getDefaultToolkit().beep();
		System.out.println("Sveglia!");
	}

	public void minuti(int minuti) {
		System.out.println("La sveglia suonerà tra " + minuti + " secondi");	//per farla in minuti basta moltiplicare per 60
		int sveglia = 1000 * 60 * minuti;

		try {
			Thread.sleep(sveglia);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		java.awt.Toolkit.getDefaultToolkit().beep();
		System.out.println("Sveglia!");
	}
}