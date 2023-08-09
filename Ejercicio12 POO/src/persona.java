import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class persona {

	private String nombre;
	private Date fechaNacimiento;

	public persona() {
	}

	public persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void crearPersona() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre de la persona: ");
		String nombre = scanner.nextLine();
		setNombre(nombre);

		System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/aaaa): ");
		String fechaString = scanner.nextLine();
		// Parsear la fecha ingresada a un objeto Date
		Date fechaNacimiento;
		try {
			fechaNacimiento = parseFecha(fechaString);
			setFechaNacimiento(fechaNacimiento);
		} catch (ParseException e) {
			System.out.println("Error al parsear la fecha. Intente nuevamente.");
		}
	}

	public int calcularEdad() {
		Date fechaActual = new Date();
		int anioActual = fechaActual.getYear() + 1900;
		int mesActual = fechaActual.getMonth() + 1;
		int diaActual = fechaActual.getDate();

		int anioNacimiento = fechaNacimiento.getYear() + 1900;
		int mesNacimiento = fechaNacimiento.getMonth() + 1;
		int diaNacimiento = fechaNacimiento.getDate();

		int edad = anioActual - anioNacimiento;

		// Verificar si el mes actual es menor al mes de nacimiento, o si son iguales pero el día actual es menor al día de nacimiento
		if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
			edad--;
		}

		return edad;
	}

	public boolean menorQue(int edad) {
		int edadActual = calcularEdad();
		return edadActual < edad;
	}

	public void mostrarPersona() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaNacimientoString = sdf.format(fechaNacimiento);

		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimientoString);
		System.out.println("Edad: " + calcularEdad());
	}

	private Date parseFecha(String fechaString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(fechaString);
	}
}