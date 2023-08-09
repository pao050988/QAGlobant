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
package ejerAprendizaje05;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cuenta {

    public int getnumCuenta() {
        return numCuenta;
    }

    public void setnumCuenta(int NumCuenta) {
        this.numCuenta = NumCuenta;
    }

    public long getdni() {
        return dni;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }

    public double getsaldoActual() {
        return saldoActual;
    }

    public void setsaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numCuenta, long dni, double saldoActual) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }
    public int numCuenta;
    public long dni;
    public double saldoActual;

    public void Ingresar(double ingreso) {

        setsaldoActual(getsaldoActual() + ingreso);
        System.out.println("Se ha realizo el ingreso.");
    }

   
    public void extraccionRapida() {
        double limite = getsaldoActual() * 0.2;
        if (limite > 0) {
            setsaldoActual(getsaldoActual()-limite);
            System.out.println("Se ha realizado la extracción rápida.");
        } else {
            
            System.out.println("Saldo insuficiente para la extracción rápida.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + getsaldoActual());
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + getnumCuenta());
        System.out.println("DNI del cliente: " + getdni());
        System.out.println("Saldo actual: " + getsaldoActual());
    }

    public void retirar(double retiro) {         
        
        if (getsaldoActual() > retiro) {
            setsaldoActual(getsaldoActual()-retiro);
            System.out.println("Se ha realizado el retiro.");
        } else {
           
            System.out.println("Saldo insuficiente. No se pudo realizar el retiro.");
        }
    }
}
