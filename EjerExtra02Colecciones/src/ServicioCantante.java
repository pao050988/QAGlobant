import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCantante {

	ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void crearCantante(){
		String respuesta;
		do {
			System.out.println("Ingrese el nombre del cantante o agrupación");
			String nombreCantante = scanner.nextLine();
			System.out.println("Ingrese el disco con mas ventas");
			String discoConMasVentas = scanner.nextLine();
		}
	}

}
