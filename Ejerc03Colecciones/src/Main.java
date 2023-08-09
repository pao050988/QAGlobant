
import java.util.Scanner;
import java.util.ArrayList;

//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
public class Main {


	public static void main(String[] args) {
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);


		do {
			Alumno nuevoAlumno = servicio.crearAlumno();
			listaAlumnos.add((nuevoAlumno));

			System.out.println("¿Desea agregar otro alumno? (S/N)");
		} while (servicio.continuar());

		// Mostrar la información de todos los alumnos agregados
		servicio.mostrarAlumnos(listaAlumnos);

		System.out.println("\nIngrese el nombre del alumno para calcular su nota final:");
		String nombreBuscado = scanner.nextLine();

		Alumno alumnoEncontrado = servicio.buscarAlumnoPorNombre(listaAlumnos, nombreBuscado);
		if (alumnoEncontrado != null) {
			double notaFinal = alumnoEncontrado.notaFinal();
			System.out.println("La nota final de " + nombreBuscado + " es: " + notaFinal);
		} else {
			System.out.println("El alumno " + nombreBuscado + " no se encontró en la lista.");
		}
	}
}
