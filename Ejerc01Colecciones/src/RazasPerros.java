import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazasPerros {
	private ArrayList<String> razas = new ArrayList<>();
	private Scanner scanner;

	public RazasPerros(){
		razas = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void agregarRazas(){
		System.out.println("Ingrese la raza del perro: ");
		String razaPerro = scanner.nextLine();
		razas.add(razaPerro);
	}

	public void mostrarRaza(){
		System.out.println("Razas de perros ya guardadas: ");
		for (String raza : razas){
			System.out.println(raza);
		}
	}

	public boolean agregarOtroPerro(){
		System.out.println("Desea agregar otro perro? (s/n)");
		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("s");
	}

	public void ejecutar(){
		boolean seguirAgregando = true;
		while (seguirAgregando){
			agregarRazas();
			seguirAgregando = agregarOtroPerro();
		}
		mostrarRaza();
		BuscarYEliminar();
	}

	public void BuscarYEliminar(){
		System.out.println("Ingrese la raza que desea buscar y eliminar: ");
		String buscarEliminar = scanner.nextLine();

		Iterator<String> iterator = razas.iterator();
		boolean encontrado = false;

		while (iterator.hasNext()){
			String razas = iterator.next();
			if (razas.equalsIgnoreCase(buscarEliminar)){
				iterator.remove();
				encontrado = true;
			}
		}
		if (encontrado){
			System.out.println("Perro eliminado. Lista Ordenada");

		}else {
			System.out.println("Perro no encontrado en la lista. Lista ordenada");
		}
		Collections.sort(razas);
		mostrarRaza();
	}




}
