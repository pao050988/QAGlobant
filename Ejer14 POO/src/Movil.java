//Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
//almacenar cada producto con su información. Crear una entidad Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
//un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
//correspondiente al código. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo

import java.util.Scanner;

public class Movil {
	public String marca;
	public double precio;
	public String modelo;
	public int memoriaRam;
	public int almacenamiento;
	int[] codigo;

	public Movil() {
	}

	public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.almacenamiento = almacenamiento;
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int[] getCodigo() {
		return codigo;
	}

	public void setCodigo(int[] codigo) {
		this.codigo = codigo;
	}

	public void cargarCelular() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la marca del móvil: ");
		marca = scanner.nextLine();

		System.out.print("Ingrese el precio del móvil: ");
		precio = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Ingrese el modelo del móvil: ");
		modelo = scanner.nextLine();

		System.out.print("Ingrese la memoria RAM del móvil: ");
		memoriaRam = scanner.nextInt();

		System.out.print("Ingrese el almacenamiento del móvil: ");
		almacenamiento = scanner.nextInt();

		ingresarCodigo();
	}
	public void ingresarCodigo() {
		Scanner scanner = new Scanner(System.in);
		codigo = new int[7];

		System.out.println("Ingrese el código completo del móvil (7 números):");
		for (int i = 0; i < 7; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			codigo[i] = scanner.nextInt();
		}
	}
}
