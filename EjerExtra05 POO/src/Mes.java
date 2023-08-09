import java.util.Scanner;

public class Mes {
	String[] meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	String mesSecreto = meses[9]; // Mes secreto es octubre

	public Mes() {
	}

	public Mes(String[] meses, String mesSecreto) {
		this.meses = meses;
		this.mesSecreto = mesSecreto;
	}

	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public String getMesSecreto() {
		return mesSecreto;
	}

	public void setMesSecreto(String mesSecreto) {
		this.mesSecreto = mesSecreto;
	}

	public void jugar() {
		Scanner scanner = new Scanner(System.in);
		String respuesta;

		do {
			System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
			respuesta = scanner.nextLine();

			if (respuesta.equals(mesSecreto)) {
				System.out.println("¡Ha acertado!");
			} else {
				System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
			}
		} while (!respuesta.equals(mesSecreto));
	}
}
