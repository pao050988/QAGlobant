import java.util.ArrayList;

public class Reserva {

	String id;
	int cantidadPersonas;

	ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();

	public Reserva() {
	}

	public Reserva(String id, int cantidadPersonas, ArrayList<Habitacion> listaHabitaciones) {
		this.id = id;
		this.cantidadPersonas = cantidadPersonas;
		this.listaHabitaciones = listaHabitaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	@Override
	public String toString() {
		return "Reserva{" +
				"id='" + id + '\'' +
				", cantidadPersonas=" + cantidadPersonas +
				", listaHabitaciones=" + listaHabitaciones +
				'}';
	}
}
