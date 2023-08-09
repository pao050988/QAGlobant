import java.util.HashSet;
import java.util.Scanner;

// Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
public class Main {
	public static void main(String[] args) {
		int opcion;
		ServicioPaises myServicio = new ServicioPaises();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"*** MENU ***");
			System.out.println("1. Agrega nuevo pais");
			System.out.println("2. Muestra los paises");
			System.out.println("3. Muestra los paises ordenados alfabeticamente");
			System.out.println("4. Elimina un pais que sumerce ingrese");

			System.out.println("0. SALIR");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					myServicio.crearPais();
					break;
				case 2:
					myServicio.mostrarPaises();
					break;
				case 3:
					myServicio.ordenAlfabetico();
					break;
				case 4:
					myServicio.eliminarPais();
					break;
				/*//case 5:
					myServicio.ordenarPelisMenorDuracion();
					break;
				case 6:
					myServicio.ordenAlfabetico();
					break;
				case 7:
					myServicio.ordenPorDirector();
					break;*/
				case 0:
					System.out.println("Adios!!!!!");
					break;
				default:
					System.out.println("Opción invalida.");
			}
		} while (opcion != 0);
	}

	}
