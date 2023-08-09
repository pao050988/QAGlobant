public class CantanteFamoso {
	String nombreCantante;
	String discoConMasVentas;

	public CantanteFamoso() {
	}

	public CantanteFamoso(String nombreCantante, String discoConMasVentas) {
		this.nombreCantante = nombreCantante;
		this.discoConMasVentas = discoConMasVentas;
	}

	public String getNombreCantante() {
		return nombreCantante;
	}

	public void setNombreCantante(String nombreCantante) {
		this.nombreCantante = nombreCantante;
	}

	public String getDiscoConMasVentas() {
		return discoConMasVentas;
	}

	public void setDiscoConMasVentas(String discoConMasVentas) {
		this.discoConMasVentas = discoConMasVentas;
	}

	@Override
	public String toString() {
		return "CantanteFamoso{" +
				"nombreCantante='" + nombreCantante + '\'' +
				", discoConMasVentas='" + discoConMasVentas + '\'' +
				'}';
	}
}
