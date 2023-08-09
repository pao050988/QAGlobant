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
package EjerAprendizaje06;

/**
 *
 * @author Asus
 */
public class Cafetera {
    public int capMax=1000;
    public int cantActual;

    public Cafetera() {
    }

    public Cafetera(int cantActual) {

        this.cantActual = cantActual;
    }


    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    public void consultarCafetera() {
        System.out.println("Cafetera actual: " + getCantActual());
    }

    
    public void llenarCafetera(){
        setCantActual(capMax);        
        System.out.println("La cafetera esta llena");
    }
    
    public void servir(int tamanoTaza){
        if (getCantActual() > tamanoTaza) {
            setCantActual(getCantActual() - tamanoTaza);
            System.out.println("Se ha servido una taza de café");
        } else if (getCantActual() == tamanoTaza) {

            setCantActual(getCantActual() - tamanoTaza);
            System.out.println("Se ha servido una taza de café y quedó vacia la cafetera");
            
            
        } else if(getCantActual() < tamanoTaza){
            
            System.out.println(" No se pudo llenar la taza, quedó con  " + getCantActual());
            vaciar();
        }
             
    }
    public void vaciar(){
        setCantActual(0);
        System.out.println("La cafetera fue vaciada");
            
        }
    
    public void agregarCafe(int cantidadCafe){
              
        if(getCantActual() + cantidadCafe> capMax){
            System.out.println("Error, no se puede superar la capacidad de la cafetera");
        }else{
            setCantActual(getCantActual()+cantidadCafe);
            System.out.println("Se ha agregado cafe a la cafetera");
        }
        
    }


}
