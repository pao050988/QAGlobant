import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		int opcion;
		Tienda myTienda = new Tienda();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"*** MENU ***");
			System.out.println("1. AGREGAR PRODUCTO");
			System.out.println("2. VENTA DE PRODUCTO");
			System.out.println("3. REPOSICIÓN DE PRODUCTO");
			System.out.println("4. MOSTRAR PRODUCTOS");
			System.out.println("5. SALIR");
			opcion=scanner.nextInt();

			switch (opcion) {
				case 1: myTienda.crearProducto();
				break;
				case 2: myTienda.venta();
				break;
				case 3: myTienda.reposicion();
				break;
				case 4: myTienda.mostrarProductos();
				break;
				case 5: System.out.println("Adios!");
				break;
				default: System.out.println("Opción invalida.");
			}
		}while (opcion!=0);

	}
}

