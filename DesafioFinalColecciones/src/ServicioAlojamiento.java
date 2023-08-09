import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ServicioAlojamiento {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();

	ArrayList<Habitacion> habitacionesReservadas;
	ArrayList<Persona> listaPersonas = new ArrayList<>();

	ArrayList<Reserva> listaDeReservas = new ArrayList<>();

	public void inicializarHabitaciones(){
		listaHabitaciones.add(new Habitacion("1", "vacio", 2 ));
		listaHabitaciones.add(new Habitacion("2", "vacio", 2 ));
		listaHabitaciones.add(new Habitacion("3", "vacio", 2 ));
		listaHabitaciones.add(new Habitacion("4", "vacio", 2 ));
		listaHabitaciones.add(new Habitacion("5", "vacio", 2 ));
		listaHabitaciones.add(new Habitacion("6", "vacio", 3 ));
		listaHabitaciones.add(new Habitacion("7", "vacio", 3 ));
		listaHabitaciones.add(new Habitacion("8", "vacio", 3 ));
		listaHabitaciones.add(new Habitacion("9", "vacio", 1 ));
		listaHabitaciones.add(new Habitacion("10", "vacio", 1 ));
	}

	public void inicializarPersonas(){
		listaPersonas.add(new Persona("Paola", "36", "1", "Colombia"));
		listaPersonas.add(new Persona("Marlejo", "39", "2", "Camerun"));
		listaPersonas.add(new Persona("Cristian", "36", "3", "Brazil"));
		listaPersonas.add(new Persona("Danna", "32", "4", "China"));
		listaPersonas.add(new Persona("Diego", "38", "5", "Peru"));
	}

	public void hacerReserva(){
		scanner.nextLine();
		System.out.println("Ingrese el numero de identificacion, si no esta registrado escriba nuevo");
		String dni = scanner.nextLine();
		if (dni.equals("nuevo")){
			dni = crearPersona();

		}
		System.out.println("para cuantas personas es la reservacion");
		int personasAReservar = scanner.nextInt();
		boolean reservaExitosa = reservarHabitaciones(personasAReservar);
		if (reservaExitosa){
			int idReserva = listaDeReservas.size() + 1;
			listaDeReservas.add(new Reserva(idReserva + "", personasAReservar, habitacionesReservadas));
			System.out.println("Reserva exitosa generada con el Id: " + idReserva);
		}else{
			System.out.println("No se pudo crear la reserva, intente nuevamente.");
		}

	}

	public String crearPersona(){
		scanner.nextLine();
		System.out.println("Ingrese su nombre completo");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su edad");
		String edad = scanner.nextLine();
		System.out.println("Ingrese sun DNI");
		String dni = scanner.nextLine();
		System.out.println("Ingrese su pais");
		String pais = scanner.nextLine();

		listaPersonas.add(new Persona(nombre,edad,dni,pais));
		return dni;
	}

	public boolean reservarHabitaciones(int personasAReservar){
		scanner.nextLine();
		habitacionesReservadas = new ArrayList<>();
		boolean todasLasPersonasAcomodadas = true;

		List<Habitacion> habitacionesCambiarEstado = new ArrayList<>(); // Para revertir cambios si es necesario

		for (Habitacion habitacion : listaHabitaciones) {
			if (habitacion.getEstadoHabitacion().equals("vacio") && habitacion.getNumPersonas() >= personasAReservar) {
				habitacion.setEstadoHabitacion("reservado");
				habitacionesReservadas.add(habitacion);
				habitacionesCambiarEstado.add(habitacion);

				personasAReservar -= habitacion.getNumPersonas();

				if (personasAReservar <= 0) {
					break;
				}
			}
		}

		if (personasAReservar > 0) {
			todasLasPersonasAcomodadas = false;
			// Revertir cambios en las habitaciones reservadas
			for (Habitacion habitacion : habitacionesCambiarEstado) {
				habitacion.setEstadoHabitacion("vacio");
				habitacion.setNumPersonas(habitacion.getNumPersonas() + personasAReservar);
			}
		}

		return todasLasPersonasAcomodadas;
	}

	public void Alojamiento(String id){
		scanner.nextLine();
		for (Reserva reserva : listaDeReservas){
			if (reserva.getId().equals(id)){
				for (Habitacion habitacion : reserva.getListaHabitaciones()){
					habitacion.setEstadoHabitacion("Alojado");
				}
			}else {
				System.out.println("El Id no se encuentra en la lista de reservas");
			}
		}
	}

	public void vaciarHabitaciones(String id){
		scanner.nextLine();
		for (Reserva reserva : listaDeReservas){
			if (reserva.getId().equals(id)){
				for (Habitacion habitacion : reserva.getListaHabitaciones()){
					habitacion.setEstadoHabitacion("vacio");
				}
			}else {
				System.out.println("El Id no se encuentra en la lista de reservas");
			}
		}
	}

	public void mostrarListaHabitaciones(){
		scanner.nextLine();
		Iterator iterator = listaHabitaciones.iterator();
		while (iterator.hasNext()){
			Habitacion listaHabitaciones = (Habitacion) iterator.next();
			System.out.println(listaHabitaciones.toString());
		}
	}

	public void mostrarListaReservas(){
		scanner.nextLine();
		Iterator iterator = listaDeReservas.iterator();
		while (iterator.hasNext()){
			Reserva listaDeReservas = (Reserva) iterator.next();
			System.out.println(listaDeReservas.toString());
		}
	}
}
