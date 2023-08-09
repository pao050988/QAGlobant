/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejer09;

import EjerAprendizaje09.Matematica;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Ejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        double num1= random.nextInt(100) + 1;
        double num2 = random.nextInt(100) + 1;
        

//        double num1 = 4;
//        double num2 = 8;
        Matematica matematica = new Matematica(num1, num2);
        System.out.println("Número 1: " + matematica.getNum1());
        System.out.println("Número 2: " + matematica.getNum2());

        double mayor = matematica.devolverMayor();
        System.out.println("El mayor valor es: " + mayor);

        double potencia = matematica.calcularPotencia();
        System.out.println("La potencia del mayor valor elevado al menor valor es: " + potencia);

        double raiz = matematica.calcularRaiz();
        System.out.println("La raíz cuadrada del menor valor (en valor absoluto) es: " + raiz);
    }

}
