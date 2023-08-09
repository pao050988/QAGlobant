import java.util.ArrayList;
import java.util.Scanner;

public class servicio {
	private static Scanner scanner = new Scanner(System.in);

	public static Alumno crearAlumno() {
		System.out.println("Ingrese el nombre del alumno:");
		String nombre = scanner.nextLine();

		ArrayList<Integer> notas = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Ingrese la nota " + i + " del alumno:");
			int nota = Integer.parseInt(scanner.nextLine());
			notas.add(nota);
		}

		return new Alumno(nombre, notas);
	}

	public static boolean continuar() {
		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("S");
	}

	public static void mostrarAlumnos(ArrayList<Alumno> listaAlumnos) {
		System.out.println("\nLista de alumnos registrados:");
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno.toString());
		}
	}
	public static Alumno buscarAlumnoPorNombre(ArrayList<Alumno> listaAlumnos, String nombreBuscado) {
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
				return alumno;
			}
			continue;
		}
		return null;
	}

}
