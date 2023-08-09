import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Nif nif = new Nif();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese numero de DNI");

		long dni = scanner.nextLong();
		nif.setDNI(dni);
		nif.crearNIF();
		nif.mostrar();
	}
}
