import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		String operation;

		Scanner input = new Scanner(System.in);

		System.out.println("Digita il primo numero");
		num1 = input.nextInt();

		System.out.println("Digita il secondo numero");
		num2 = input.nextInt();

		Scanner op = new Scanner(System.in);

		System.out.println("Inserisci l'operatore");
		operation = op.next();

		switch (operation) {
		case "+":
			System.out.println("Risultato:" + (num1 + num2));
			break;

		case "-":
			System.out.println("Risultato:" + (num1 - num2));
			break;

		case "*":
			System.out.println("Risultato:" + (num1 * num2));
			break;

		case "/":
			System.out.println("Risultato:" + (num1 / num2));
			break;

		case "^":
			System.out.println("Risultato:" + Math.pow(num1, num2));
			break;

		case "r":
			System.out.println("Risultato:" + Math.pow(num2, 1 / num1));
			break;

		default:
			System.out.println("Operazione sconosciuta");
			break;
		}

	}

}
