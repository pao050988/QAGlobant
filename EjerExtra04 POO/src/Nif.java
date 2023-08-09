public class Nif {
	private long DNI;
	private char letra;

	public Nif() {
	}

	public Nif(long DNI, char letra) {
		this.DNI = DNI;
		this.letra = letra;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long DNI) {
		this.DNI = DNI;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void crearNIF(){
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int resto = (int) (DNI % 23);
		letra = letras[resto];
	}

	public void mostrar(){
		System.out.println(String.format("%08d", DNI)+ "-" + Character.toUpperCase(letra));

	}
}
