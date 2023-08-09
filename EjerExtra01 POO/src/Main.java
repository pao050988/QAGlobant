//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes.

public class Main {
	public static void main(String[] args) {

		Cancion cancion1 = new Cancion();

		cancion1.setAutor("Imagine Dragons");
		cancion1.setTitulo("Bones");

		Cancion cancion2 = new Cancion("Imagine dragons", "Warriors");

		System.out.println("Cancion1:");
		System.out.println("Autor: " + cancion1.getAutor());
		System.out.println("Titulo: " + cancion1.getTitulo());

		System.out.println();

		System.out.println("Cancion2: ");
		System.out.println("Autor: " + cancion2.getAutor());
		System.out.println("Titulo: " + cancion2.getTitulo());
	}
}