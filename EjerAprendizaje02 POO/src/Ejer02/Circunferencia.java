/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer02;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio= scanner.nextDouble();      
        
    }
    
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }


    
}
