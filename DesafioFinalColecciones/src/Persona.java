public class Persona {
	String nombre;
	String edad;
	String dni;
	String pais;

	public Persona() {
	}

	public Persona(String nombre, String edad, String dni, String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", edad='" + edad + '\'' +
				", dni='" + dni + '\'' +
				", pais='" + pais + '\'' +
				'}';
	}
}
