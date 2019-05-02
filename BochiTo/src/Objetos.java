import java.util.HashMap;
import java.util.Map;

public class Objetos {

	private Map<Integer, String> mapa = new HashMap<Integer, String>();
	static int contadorjugador;
	static int contadoria;

	public Objetos() {

		mapa.put(1, "Piedra");
		mapa.put(2, "Papel");
		mapa.put(3, "Tijera");
		this.contadoria = 0;
		this.contadorjugador = 0;
	}

	public void jugadorgana(int jugador, int ia) {
		System.out.println("Tu sacas " + mapa.get(jugador));
		System.out.println("La Máquina saca " + mapa.get(ia));
		contadorjugador++;
	}

	public void iagana(int jugador, int ia) {
		System.out.println("Tu sacas " + mapa.get(jugador));
		System.out.println("La Máquina saca " + mapa.get(ia));
		contadoria++;
	}

	public void mostrarpuntuacion() {
		System.out.println("Tu tienes " + contadorjugador + " puntos");
		System.out.println("La Máquina tiene " + contadoria + " puntos");

	}

	public void jugar(int jugador, int ia) {
		if (jugador == 1 && ia == 1) {
			System.out.println("Empate");
			mostrarpuntuacion();
		}

		else if (jugador == 1 && ia == 2) {
			iagana(jugador, ia);
			System.out.println("Papel envuelve a Piedra");
			mostrarpuntuacion();
		}

		else if (jugador == 1 && ia == 3) {
			jugadorgana(jugador, ia);
			System.out.println("Piedra rompe a Tijera");
			mostrarpuntuacion();
		}

		else if (jugador == 2 && ia == 1) {
			jugadorgana(jugador, ia);
			System.out.println("Papel envuelve a Piedra");
			mostrarpuntuacion();
		}

		else if (jugador == 2 && ia == 2) {
			System.out.println("Empate");
			mostrarpuntuacion();
		}

		else if (jugador == 2 && ia == 3) {
			iagana(jugador, ia);
			System.out.println("Tijera corta Papel");
			mostrarpuntuacion();

		} else if (jugador == 3 && ia == 1) {
			iagana(jugador, ia);
			System.out.println("Piedra rompe a Tijera");
			mostrarpuntuacion();

		} else if (jugador == 3 && ia == 2) {
			jugadorgana(jugador, ia);
			System.out.println("Tijera corta Papel");
			mostrarpuntuacion();
		} else if (jugador == 3 && ia == 3) {
			System.out.println("Empate");
			mostrarpuntuacion();
		}
	}

	public int getContadorjugador() {
		return contadorjugador;
	}

	public int getContadoria() {
		return contadoria;
	}

}
