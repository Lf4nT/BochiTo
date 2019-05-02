import java.util.Random;
import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int ia;
		Objetos contadores = new Objetos();
		int k = 0;
		int k2 = 0;

		do {
			k = 0;
			k2 = 0;
			do {
				ia = r.nextInt(3) + 1;
				System.out.println("¿Piedra, Papel o Tijera?");
				System.out.println("Seleciona una opción:");
				System.out.println("1. Piedra");
				System.out.println("2. Papel");
				System.out.println("3. Tijera");
				int opcion = s.nextInt();
				contadores.jugar(opcion, ia);
				System.out.println();

				if (contadores.getContadorjugador() == 3) {
					System.out.println();
					System.out.println("¡JUGADOR GANA!");
					k += 1;
				}
				if (contadores.getContadoria() == 3) {
					System.out.println();
					System.out.println("¡JUGADOR PIERDE!");
					k += 1;
				}
			} while (k != 1);

			System.out.println("Introduce '1' Si Quieres Jugar de Nuevo");
			k2 = s.nextInt();
			if (k2 == 1) {
				Objetos.contadorjugador = 0;
				Objetos.contadoria = 0;
			}
			System.out.println();
		} while (k2 == 1);
		s.close();
	}
}