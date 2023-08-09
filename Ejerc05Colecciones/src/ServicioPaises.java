
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicioPaises {
	HashSet<Pais> paises = new HashSet();

	Scanner scanner = new Scanner(System.in);

	public void crearPais() {
		String respuesta;
		do {
			System.out.println("Ingrese el nombre del pais");
			String pais = scanner.nextLine();

			Pais nuevoPais = new Pais(pais);

			paises.add(nuevoPais);

			System.out.println("¿Desea agregar otro pais? (S/N)");
			respuesta = scanner.next();

		} while (continuar());
	}

	public boolean continuar() {

		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("S");
	}

	public void mostrarPaises() {

		Iterator iterator = paises.iterator();
		while (iterator.hasNext()) {
			Pais paises = (Pais) iterator.next();
			System.out.println(paises.toString());
		}
	}

	public void ordenAlfabetico() {
		ArrayList<Pais> paisesOrdenados = new ArrayList<>(paises);
		if (paises.isEmpty()) {
			System.out.println("No hay paises disponibles");
		} else {
			paisesOrdenados.sort(Comparator.comparing(Pais::getPais));

			System.out.println("Los paises ordenados alfabeticamente son: ");
			System.out.println();
			for (Pais pais : paisesOrdenados) {
				System.out.println(pais.getPais());
				System.out.println();
			}
		}
	}
	public void eliminarPais() {
		Iterator<Pais> iterator = paises.iterator();
		System.out.println("Ingrese el pais que desea eliminar");
		String nombrePaisEliminar = scanner.next();
		while (iterator.hasNext()){
			Pais pais = iterator.next();
			if (pais.getPais().equals(nombrePaisEliminar)){
				iterator.remove();
			}
			System.out.println("El pais ha sido eliminado de la lista... Gracias");

		}
}
}


