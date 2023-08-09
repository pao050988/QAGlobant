import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int opcion;
		ServicioAlojamiento myServicio = new ServicioAlojamiento();
		myServicio.inicializarHabitaciones();
		myServicio.inicializarPersonas();

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"*** MENU ***");
			System.out.println("1. Agrega un Nuevo Huesped");
			System.out.println("2. Crea la Reserva");
			System.out.println("3. Hacer Check In");
			System.out.println("4. Vaciar reserva o alojamiento");
			System.out.println("5. Muestra la lista de habitaciones");
			System.out.println("6. Muestra la lista de reservas");
			System.out.println("0. SALIR");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					myServicio.crearPersona();
					break;
				case 2:
					myServicio.hacerReserva();
					break;
				case 3:
					System.out.println("Ingrese el Id de la reserva");
					String id = scanner.nextLine();
					myServicio.Alojamiento(id);
					break;

				case 4:
					System.out.println("ingrese el Id de la reserva a vaciar");
					String id2 = scanner.nextLine();
					myServicio.vaciarHabitaciones(id2);

					break;

				case 5:
					myServicio.mostrarListaHabitaciones();
					break;
				case 6:
					myServicio.mostrarListaReservas();

				case 0:
					System.out.println("Adios!!!!!");
					break;
				default:
					System.out.println("Opción invalida.");
			}
		} while (opcion != 0);
	}
}



