public class Habitacion {
	String numHabitacion;
	String estadoHabitacion;

	int numPersonas;

	public Habitacion() {
	}

	public Habitacion(String numHabitacion, String estadoHabitacion, int numPersonas) {
		this.numHabitacion = numHabitacion;
		this.estadoHabitacion = estadoHabitacion;
		this.numPersonas = numPersonas;
	}

	public String getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public String getEstadoHabitacion() {
		return estadoHabitacion;
	}

	public void setEstadoHabitacion(String estadoHabitacion) {
		this.estadoHabitacion = estadoHabitacion;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	@Override
	public String toString() {
		return "Habitacion{" +
				"numHabitacion='" + numHabitacion + '\'' +
				", estadoHabitacion='" + estadoHabitacion + '\'' +
				", numPersonas=" + numPersonas +
				'}';
	}
}
