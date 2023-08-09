public class Tienda {
	String producto;
	double precio;

	public Tienda() {
	}

	public Tienda(String producto, double precio) {
		this.producto = producto;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tienda{" +
				"producto='" + producto + '\'' +
				", precio=" + precio +
				'}';
	}
}
