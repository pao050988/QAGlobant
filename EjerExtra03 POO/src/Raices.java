public class Raices {
	private double a;
	private double b;
	private double c;

	public Raices() {
	}

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}


	public double getDiscriminante(){
		return (b * b) - 4 * a * c;
	}

	public boolean tieneRaices(){
		double discriminante = getDiscriminante();
		return discriminante >= 0;
	}

	public boolean tieneRaiz(){
		double discriminante = getDiscriminante();
		return  discriminante == 0;
	}

	public void obtenerRaices(){
		if(tieneRaices()){
			double x1 = (-b + Math.sqrt(getDiscriminante())) / (2*a);
			double x2 = (-b - Math.sqrt(getDiscriminante())) / (2*a);

			System.out.println("Las raices son : " + x1 + " y " + x2);

			}else{
			System.out.println("No hay raices reales");
		}
	}

	public void obtenerRaiz(){
		if(tieneRaiz()){
			double x = -b / (2*a);
			System.out.println("La unica raiz es: " + x);

		}else{
			System.out.println("No existe una unica raiz real");
		}
	}

	public void calcular(){
		if(tieneRaices()){
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		}else{
			System.out.println("La ecuacion no tiene solucion real");
		}
	}
}
