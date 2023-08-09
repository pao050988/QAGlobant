//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.


import java.util.Scanner;

public class Curso {
	public String nombreCurso;
	public int cantidadHorasPorDia;
	public int cantDiasPorSemana;
	public String turno; //(mañana o tarde),
	public int precioPorHora;
	String[] alumnos;

	public Curso() {
	}

	public Curso(String nombreCurso, int cantidadHorasPorDia, int cantDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
		this.nombreCurso = nombreCurso;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantDiasPorSemana = cantDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}

	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}

	public int getCantDiasPorSemana() {
		return cantDiasPorSemana;
	}

	public void setCantDiasPorSemana(int cantDiasPorSemana) {
		this.cantDiasPorSemana = cantDiasPorSemana;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(int precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

	public void cargarAlumnos() {
		Scanner scanner = new Scanner(System.in);
		alumnos = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
			alumnos[i] = scanner.nextLine();
		}
	}

	public void crearCurso() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre del curso: ");
		nombreCurso = scanner.nextLine();

		System.out.print("Ingrese la cantidad de horas por día: ");
		cantidadHorasPorDia = scanner.nextInt();

		System.out.print("Ingrese la cantidad de días por semana: ");
		cantDiasPorSemana = scanner.nextInt();

		System.out.print("Ingrese el turno (mañana o tarde): ");
		turno = scanner.next();

		System.out.print("Ingrese el precio por hora: ");
		precioPorHora = scanner.nextInt();

		cargarAlumnos();
	}
	public int calcularGananciaSemanal() {
		return cantidadHorasPorDia * precioPorHora * alumnos.length * cantDiasPorSemana;
	}
}



