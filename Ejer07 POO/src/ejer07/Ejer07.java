/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ejer07;

import EjerAprendizaje07.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejer07 {

    public List<Double> listaImc = new ArrayList<>();
    public List<Boolean> listaMayorEdad = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> listaImc = new ArrayList<>();
        List<Boolean> listaMayorEdad = new ArrayList<>();

        Persona persona1 = new Persona("Mauricio", 'H', 39, 89, 1.70);
        Persona persona2 = new Persona("Cristian", 'H', 18, 85, 1.75);
        Persona persona3 = new Persona("Paola", 'M', 35, 80, 1.65);
        Persona persona4 = new Persona("Danna", 'M', 10, 44, 1.45);

        listaImc.add(persona1.calcularIMC());
        listaImc.add(persona2.calcularIMC());
        listaImc.add(persona3.calcularIMC());
        listaImc.add(persona4.calcularIMC());

        listaMayorEdad.add(persona1.esMayorDeEdad());
        listaMayorEdad.add(persona2.esMayorDeEdad());
        listaMayorEdad.add(persona3.esMayorDeEdad());
        listaMayorEdad.add(persona4.esMayorDeEdad());

        calcularPorcentajePeso(listaImc);
        calcularPorcentajeEdad(listaMayorEdad);

    }

    public static void calcularPorcentajePeso(List<Integer> listaImc) {
        double cantidadPesoIdeal = 0;
        double cantidadSobrePeso = 0;
        double cantidadBajoPeso = 0;

        for (int i = 0; i < listaImc.size(); i++) {
            if (listaImc.get(i) == -1) {
                cantidadBajoPeso++;
            }
            if (listaImc.get(i) == 0) {
                cantidadPesoIdeal++;
            }
            if (listaImc.get(i) == 1) {
                cantidadSobrePeso++;
            }
        }
        System.out.println("Cantidad de personas con peso ideal: " + cantidadPesoIdeal);
        System.out.println("Cantidad de personas con sobrepeso: " + cantidadSobrePeso);
        System.out.println("Cantidad de personas con bajo peso: " + cantidadBajoPeso);

        System.out.println("Porcentaje de personas con  peso ideal: " + ((cantidadPesoIdeal / listaImc.size()) * 100) + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + ((cantidadSobrePeso / listaImc.size()) * 100) + "%");
        System.out.println("Porcentaje de personas con bajo peso: " + ((cantidadBajoPeso / listaImc.size()) * 100) + "%");

    }

    public static void calcularPorcentajeEdad(List<Boolean> listaMayorEdad) {
        double cantidadMayorEdad = 0;
        double cantidadMenorEdad = 0;

        for (int i = 0; i < listaMayorEdad.size(); i++) {
            if (listaMayorEdad.get(i) == true) {
                cantidadMayorEdad++;
            } else {
                cantidadMenorEdad++;
            }
        }
        System.out.println("Cantidad de personas mayores de edad: " + cantidadMayorEdad);
        System.out.println("Cantidad de personas menores  de edad: " + cantidadMenorEdad);

        System.out.println("Porcentaje de personas mayores de edad: " + ((cantidadMayorEdad / listaMayorEdad.size()) * 100) + "%");
        System.out.println("Porcentaje de personas menores de edad: " + ((cantidadMenorEdad / listaMayorEdad.size()) * 100) + "%");
    }

    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el sexo (H - hombre, M - mujer, O - otro): ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();

        Persona persona = new Persona(nombre, sexo, edad, peso, altura);
        return persona;
    }

}
