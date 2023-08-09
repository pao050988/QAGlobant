import java.util.Scanner;

////Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//22
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
public class Main {
	public static void main(String[] args) {
		int opcion;
		Servicio myServicio = new Servicio();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"*** MENU ***");
			System.out.println("1. Agrega nueva pelicula");
			System.out.println("2. Muestra las peliculas");
			System.out.println("3. Muestra las peliculas por duración");
			System.out.println("4. Muestra las pelis por duracion de mayor a menor");
			System.out.println("5. Muestra las pelis por duracion de menor a mayor");
			System.out.println("6. Muestra las pelis por titulo alfabeticamente");
			System.out.println("7. Muestra las pelis por director");
			System.out.println("0. SALIR");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					myServicio.crearpelicula();
					break;
				case 2:
					myServicio.mostrarPeliculas();
					break;
				case 3:
					myServicio.mostrarPeliDuracion();
					break;
				case 4:
					myServicio.ordenarPelisMayorDuracion();
					break;
				case 5:
					myServicio.ordenarPelisMenorDuracion();
					break;
				case 6:
					myServicio.ordenAlfabetico();
					break;
				case 7:
					myServicio.ordenPorDirector();
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

