/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejer05;

import ejerAprendizaje05.Cuenta;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Ejer05 {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        cuenta = crearCuenta();

        
        int opcion;
        do {
            Scanner scanner = new Scanner(System.in);
            // Mostrar el menú de opciones
            System.out.println("Menú de opciones");
            System.out.println("1. Realizar un retiro");
            System.out.println("2. Realizar un ingreso");
            System.out.println("3. Realizar una extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    cuenta.Ingresar(ingreso);
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    }
    
    public static Cuenta crearCuenta() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        int numCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI: ");
        long dni = scanner.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        int saldoActual = scanner.nextInt();
        
         Cuenta cuenta = new Cuenta(numCuenta,dni,saldoActual);
         
         return cuenta;
    }
}
    
    
    

