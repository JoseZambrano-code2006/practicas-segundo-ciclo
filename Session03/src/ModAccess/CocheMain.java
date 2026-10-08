
package ModAccess;


public class CocheMain {


    public static void main(String[] args) {
     
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 20000);

        // Acceso a miembros public
        coche1.mostrarDetalles();

        // Acceso a miembros con modificador por defecto (package-private)
        System.out.println("Marca: " + coche1.marca);

        // Acceso a miembros protected
        coche1.actualizarYear(2021);
        System.out.println("Anio actualizado: " + coche1.year);

        // Acceso a miembros private (esto causará un error de compilación)
        //coche1.ajustarPrecio(19000);
        // System.out.println("Precio ajustado: " + coche1.precio);
        
    }
    
}
