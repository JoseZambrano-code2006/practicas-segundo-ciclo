
package class_abstrac;

/**
 *
 * @author USER
 */
public abstract class Figura {
    
    
    protected double x;//pos en x
    
    protected double y;//pos en y

    public Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
   //metodo abstracto 
   public abstract double calcularArea();
  
   

    
}
