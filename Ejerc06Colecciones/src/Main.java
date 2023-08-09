import java.util.Scanner;

// Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class Main {
	public static void main(String[] args) {
		int opcion;
		ServicioTienda myServicio = new ServicioTienda();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"*** MENU ***");
			System.out.println("1. Agrega nuevo producto");
			System.out.println("2. Modifica el precio de un producto");
			System.out.println("3. Elimina un producto que sumerce ingrese");
			System.out.println("4. Muestra los productos");

			System.out.println("0. SALIR");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					myServicio.crearProducto();
					break;
				case 2:
					myServicio.modifPrecio();
					break;
				case 3:
					myServicio.eliminarProducto();
					break;
				case 4:
					myServicio.mostrarProductos();
					break;

				case 0:
					System.out.println("Adios!!!!!");
					break;
				default:
					System.out.println("Opción invalida.");
			}
		} while (opcion != 0);
	}

}


