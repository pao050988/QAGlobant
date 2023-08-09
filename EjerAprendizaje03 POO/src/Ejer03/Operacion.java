/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer03;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Operacion {

    public  int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public  void setNum2(int num2) {
        this.num2 = num2;
    }

    public Operacion() {
    }


    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    private int num1;
    private int num2;
    
    public  void crearOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        this.num1 = scanner.nextInt();
        System.out.println("Ingresa otro numero");
        this.num2 = scanner.nextInt();
    }
      
    public void sumar(){
        int sum = this.num1 + this.num2;
        
        System.out.println("El resultado es: " + sum);
        
    }
    
        public void restar(){
        int resta = this.num1 -  this.num2;
        
        System.out.println("El resultado es: " + resta);
        
    }
        public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public double dividir() {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
  


