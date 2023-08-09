import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;

public class Servicio {
	ArrayList<Pelicula> peliculas = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void crearpelicula(){
		String respuesta;
		do {
			System.out.println("Ingrese el nombre de la pelicula");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese el nombre del Director de la pelicula");
			String director = scanner.nextLine();
			System.out.println("Ingrese el tiempo que dura la pelicula");
			double duracion = scanner.nextDouble();
			Pelicula nuevaPelicula = new Pelicula(nombre, director, duracion);

			peliculas.add((nuevaPelicula));
			System.out.println("¿Desea agregar otro producto? (S/N)");
			respuesta = scanner.nextLine();

		}while (continuar());
	}

	public  boolean continuar() {

		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("S");
	}

	public void mostrarPeliculas(){
		Iterator iterator = peliculas.iterator();
		while (iterator.hasNext()){
			Pelicula peliculas = (Pelicula) iterator.next();
			System.out.println(peliculas.toString());
		}
	}

	public void mostrarPeliDuracion(){
		if (peliculas.isEmpty()){
			System.out.println("No hay peliculas disponibles");
		}else {
			System.out.println("Peliculas con duracion mayor a 1 hora");
			System.out.println();
			for (Pelicula pelicula : peliculas){
				if(pelicula.getDuracion()>60){
					System.out.println("Titulo: " + pelicula.getTitulo() + '\n' + "Director: " + pelicula.getDirector() + '\n' + "Duracion: " + pelicula.getDuracion() + " minutos");
					System.out.println();
				}
			}
		}
	}

	public void ordenarPelisMayorDuracion(){
		if (peliculas.isEmpty()){
			System.out.println("No hay peliculas disponibles");
		}else {
			peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
			System.out.println("Peliculas ordenadas por duracion(mayor a menor) ");
			System.out.println();
			for (Pelicula pelicula : peliculas){
				System.out.println("Titulo: " + pelicula.getTitulo() + '\n' + "Director: " + pelicula.getDirector() + '\n' + "Duracion: " + pelicula.getDuracion() + " minutos");
			}
		}
	}
	public void ordenarPelisMenorDuracion(){
		if (peliculas.isEmpty()){
			System.out.println("No hay peliculas disponibles");
		}else {
			peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
			System.out.println("Peliculas ordenadas por duracion(mayor a menor) ");
			System.out.println();
			for (Pelicula pelicula : peliculas){
				System.out.println("Titulo: " + pelicula.getTitulo() + '\n' + "Director: " + pelicula.getDirector() + '\n' + "Duracion: " + pelicula.getDuracion() + " minutos");
			}
		}
	}

	public void ordenAlfabetico(){
		if (peliculas.isEmpty()){
			System.out.println("No hay peliculas disponibles");
		}else {
			peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
			System.out.println("Peliculas ordenadas alfabeticamente por titulo");
			System.out.println();
			for (Pelicula pelicula:peliculas){
				System.out.println("Titulo: " + pelicula.getTitulo() + '\n' + "Director: " + pelicula.getDirector() + '\n' + "Duracion: " + pelicula.getDuracion() + " minutos");
				System.out.println();
			}
		}
	}

	public void ordenPorDirector(){
		if (peliculas.isEmpty()){
			System.out.println("No hay peliculas disponibles");
		}else {
			peliculas.sort(Comparator.comparing(Pelicula::getDirector));
			System.out.println("Peliculas ordenadas por director");
			System.out.println();
			for (Pelicula pelicula:peliculas){
				System.out.println("Titulo: " + pelicula.getTitulo() + '\n' + "Director: " + pelicula.getDirector() + '\n' + "Duracion: " + pelicula.getDuracion() + " minutos");
				System.out.println();
			}
		}
	}
}

