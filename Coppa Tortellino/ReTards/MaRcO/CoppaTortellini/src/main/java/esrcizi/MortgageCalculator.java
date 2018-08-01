package esrcizi;

public class MortgageCalculator {

	// amount = durata del mutuo in anni
	// value = importo del mutuo
	// interestRate= tasso di interesse
	public MortgageCalculator(double amount, double value, double interestRate) {

		double monthlyPayment;

		// Formula per calcolare il mutuo

		monthlyPayment = (value * interestRate / (1 - Math.pow(1 / (1 + interestRate), amount)));

		System.out.println("Somma del mutuo: " + value);

		System.out.println("Tasso di interesse: " + interestRate);

		System.out.println("Numero di anni: " + amount);

		System.out.println("Rata mensile: " + monthlyPayment);
	}
}
