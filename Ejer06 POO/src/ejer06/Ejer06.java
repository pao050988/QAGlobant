/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package ejer06;

import EjerAprendizaje06.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera();

        int opcion;
        do {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Menú de opciones");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar Café");
            System.out.println("5.Consultar cafetera");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Cual es el tamaño de la taza");                    
                    int tamanoTaza = scanner.nextInt();
                    cafetera.servir( tamanoTaza);
                    break;
                case 3:
                    
                    cafetera.vaciar();
                    break;
                case 4:
                    System.out.println("Cuanto cafe va a agregar");                    
                    int cantidadCafe = scanner.nextInt();
                    cafetera.agregarCafe(cantidadCafe
                    );
                    break;
                    
                case 5:
                    cafetera.consultarCafetera();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    }

}

