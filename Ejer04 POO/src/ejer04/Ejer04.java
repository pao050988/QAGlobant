/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejer04;
import ejerAprendizaje04.Rectangulo;
/**
 *
 * @author Asus
 */
public class Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de Rectangulo usando el constructor sin parámetros
        Rectangulo rectangulo = new Rectangulo();

        // Usar el método crearRectangulo para solicitar los datos al usuario
        rectangulo.crearRectangulo();

        // Obtener la base y la altura usando los métodos get
        double base = rectangulo.getBase();
        double altura = rectangulo.getAltura();

        // Calcular la superficie y el perímetro
        double superficie = rectangulo.calcularSuperficie();
        double perimetro = rectangulo.calcularPerimetro();

        // Imprimir la superficie y el perímetro
        System.out.println("Superficie: " + superficie);
        System.out.println("Perímetro: " + perimetro);

        // Dibujar el rectángulo
        rectangulo.dibujarRectangulo();
    }
    
}
