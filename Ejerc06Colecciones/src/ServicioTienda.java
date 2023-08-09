import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ServicioTienda {
	HashMap<String, Double> productosTienda = new HashMap<>();

	Scanner scanner = new Scanner(System.in);

	public void crearProducto() {
		String respuesta;
		do {
			System.out.println("Ingrese el nombre del producto");
			String producto = scanner.nextLine();

			System.out.println("Ingrese el precio del producto");
			double precio = scanner.nextDouble();
			Tienda nuevoProducto = new Tienda(producto, precio);

			productosTienda.put(producto, precio);
			System.out.println("Producto agregado correctamente!");

			System.out.println("Desea agregar otro producto? (S/N)");
			respuesta = scanner.next();
		} while (continuar());
	}
	public boolean continuar() {

		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("S");
	}
	public void modifPrecio() {
		scanner.nextLine();
		System.out.println("Ingrese el nombre del producto a modificar: ");
		String producto = scanner.nextLine();
		if (productosTienda.containsKey(producto)) {
			System.out.println("Ingrese el nuevo precio del producto");
			double nuevoPrecio = scanner.nextDouble();
			productosTienda.put(producto, nuevoPrecio);
			System.out.println("El precio del producto ha sido modificado correctamente");

		} else {
			System.out.println("El producto no se encuentra en la tienda");
		}
	}

	public void eliminarProducto() {
		scanner.nextLine();
		System.out.println("Ingrese del producto que desea eliminar");
		String productoEliminar = scanner.nextLine();
		if (productosTienda.containsKey(productoEliminar)) {
			productosTienda.remove(productoEliminar);
			System.out.println("Producto eliminado correctamente");
		} else {
			System.out.println("El producto no se encuentra en la lista.");
		}
	}

	public void mostrarProductos(){
		System.out.println("***** PRODUCTOS EN LA TIENDA *****");
		for (Map.Entry<String, Double> entry : productosTienda.entrySet()){
			System.out.println("Producto: " + entry.getKey() + '\n' + "Precio: " + entry.getValue());
			System.out.println();
		}
	}
}









