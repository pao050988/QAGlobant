import java.util.ArrayList;
import java.util.Scanner;

public class ServicioNumero {

	ArrayList<Integer> numeros = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void crearNumero(){
		int numero;
		do{
			System.out.println("Ingrese un numero entero, use -99 para salir del programa");
			numero = scanner.nextInt();
			if(numero != -99){
				numeros.add(numero);
			}
		}while (numero != -99);
	}

	public void calcularNum(){
		int valores = numeros.size();
		int suma = 0;
		for (int n : numeros){
			suma += n;
		}
		double media = (double) suma / valores;
		System.out.println("Numero de valores leidos: " + valores + '\n' + "suma de los valores: " + suma + '\n' + "Media de los valores: " + media);
	}
}
