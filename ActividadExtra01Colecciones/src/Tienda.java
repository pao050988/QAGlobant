import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tienda {
	ArrayList<Producto> productos = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void crearProducto(){
		String respuesta;
		do {

			System.out.println("Ingrese el nombre del producto");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese la categoria del producto");
			String categoria = scanner.nextLine();
			System.out.println("Ingrese el precio del producto");
			double precio = scanner.nextDouble();
			System.out.println("Ingrese la cantidad del producto");
			int cantidad = scanner.nextInt();
			Producto nuevoProducto = new Producto(nombre, categoria, precio, cantidad);

			productos.add((nuevoProducto));


			System.out.println("¿Desea agregar otro producto? (S/N)");
			respuesta = scanner.nextLine();

		} while (continuar());
	}
	public static boolean continuar() {
		Scanner scanner = new Scanner(System.in);

		String respuesta = scanner.nextLine();
		return respuesta.equalsIgnoreCase("S");
	}

	public boolean venta(){
		System.out.println("Ingrese el nombre del producto a vender");
		String nombre = scanner.nextLine();

		boolean operacion= false;

		for(int i=0; i< productos.size();i++){

			if (productos.get(i).getNombreProducto().equals(nombre)){

				if(productos.get(i).getCantidad()>0) {

					productos.get(i).setCantidad(productos.get(i).getCantidad()-1);
					operacion = true;
					System.out.println("Venta realizada");

				}else{
					System.out.println("Producto agotado");
					operacion=false;
				}
			}else{
				System.out.println("El producto no se encuentra en el inventario");
				operacion=false;
			}
		}
		return operacion;


	}
	public boolean reposicion(){
		System.out.println("Ingrese el nombre del producto a reponer");
		String nombre = scanner.nextLine();

		boolean operacion= false;
		for(int i=0; i< productos.size();i++){
			if (productos.get(i).getNombreProducto().equals(nombre)){

				productos.get(i).setCantidad(productos.get(i).getCantidad()+1);
				operacion = true;
				System.out.println("Producto agregado");

			}else{
				System.out.println("El producto no se encuentra en el inventario");
				operacion=false;
			}
		}return operacion;

	}

	public void mostrarProductos(){
		Iterator iterator = productos.iterator();
		while (iterator.hasNext()){
			Producto producto = (Producto) iterator.next();
			System.out.println(producto.toString());
		}
	}

}
