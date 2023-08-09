import java.util.ArrayList;
import java.util.Scanner;
public class Alumno {
	private String nombre;
	private ArrayList<Integer> notas;



	public Alumno(String nombre, ArrayList<Integer> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Notas: " + notas;
	}
	public double notaFinal() {
		if (notas.isEmpty()) {
			return 0;
		}

		int sum = 0;
		for (Integer nota : notas) {
			sum += nota;
		}

		return (double) sum / notas.size();
	}
}