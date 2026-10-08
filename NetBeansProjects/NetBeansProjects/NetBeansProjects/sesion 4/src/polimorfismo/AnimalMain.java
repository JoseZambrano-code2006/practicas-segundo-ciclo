
package polimorfismo;


public class AnimalMain {

   
    public static void main(String[] args) {

  // Creando instancias de diferentes tipos de animales
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
  
        a.HacerSonido();
        
        hacerSonidoAnimal(miPerro);
        hacerSonidoAnimal(miGato);
     

    }
    //clase para verifocar el polimorfismo
    public static void hacerSonidoAnimal(Animal animal) {
        animal.hacerSonido();
    }

    
    
}
