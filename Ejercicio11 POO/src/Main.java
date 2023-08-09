//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el día: ");
		int dia = scanner.nextInt();
		System.out.print("Ingrese el mes: ");
		int mes = scanner.nextInt();
		System.out.print("Ingrese el año: ");
		int anio = scanner.nextInt();

		// Crear la fecha ingresada por el usuario
		Date fecha = new Date(anio - 1900, mes - 1, dia);

		// Obtener la fecha actual
		Date fechaActual = new Date();

		// Mostrar la fecha ingresada
		System.out.println("Fecha ingresada: " + fecha);

		// Calcular la diferencia de años entre la fecha ingresada y la fecha actual
		int aniosDiferencia = fechaActual.getYear() - fecha.getYear();

		// Mostrar la diferencia de años
		System.out.println("Diferencia de años: " + aniosDiferencia);
	}
	}
