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

public class Main {
	public static void main(String[] args) {
		Movil movil = new Movil();
		movil.cargarCelular();

		// Obtener los datos del móvil ingresado
		String marca = movil.getMarca();
		double precio = movil.getPrecio();
		String modelo = movil.getModelo();
		int memoriaRam = movil.getMemoriaRam();
		int almacenamiento = movil.getAlmacenamiento();
		int[] codigo = movil.getCodigo();

		// Mostrar los datos del móvil
		System.out.println("Datos del móvil:");
		System.out.println("Marca: " + marca);
		System.out.println("Precio: $" + precio);
		System.out.println("Modelo: " + modelo);
		System.out.println("Memoria RAM: " + memoriaRam + " GB");
		System.out.println("Almacenamiento: " + almacenamiento + " GB");
		System.out.print("Código: ");

		for (int i = 0; i < codigo.length; i++) {
			System.out.print(codigo[i]);
		}
		System.out.println();
	}
}