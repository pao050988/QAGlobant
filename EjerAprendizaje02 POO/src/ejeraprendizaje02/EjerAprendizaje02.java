/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio*2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
 */
package ejeraprendizaje02;
import Ejer02.Circunferencia;

public class EjerAprendizaje02 {

    public static void main(String[] args) {

        Circunferencia circunferencia = new Circunferencia(0); 
        circunferencia.crearCircunferencia(); 

       
        System.out.println("Área de la circunferencia: " + circunferencia.calcularArea());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.calcularPerimetro());
    }
}

    