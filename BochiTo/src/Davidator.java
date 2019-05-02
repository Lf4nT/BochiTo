import java.util.Scanner;

public class Davidator {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String David = " ";
		int k = 0;

		do {
			System.out.println("Introduce la opcion Correcta, David es...");
			System.out.println("1. Bobo");
			System.out.println("2. Inteligente");
			David = s.nextLine();
			if (David.toLowerCase().equals("bobo")) {
				System.out.println("CORRECTO");
				k = 1;
			} else if (David.toLowerCase().equals("inteligente")) {
				throw new RuntimeException("Are You Drunk?");
			} else {
				System.out.println("Inteligente o Bobo, a ver si el Bobo eres tu...");
				System.out.println("Una de las dos");
				David = " ";
			}
		} while (k == 0);
	}
}