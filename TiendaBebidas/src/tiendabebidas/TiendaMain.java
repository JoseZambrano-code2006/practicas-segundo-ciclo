package tiendabebidas;

import java.util.ArrayList;
import java.util.List;

public class TiendaMain {

    public static void main(String[] args) {

        List<ProductoBebida> productos = new ArrayList<>();

        // Crea un objeto de tipo Energizante con ID 111, nombre "red bull", precio 12 
        ProductoBebida energizante = new Energizantes(1, "red bull", 12);

        // Crea un objeto de tipo Gaseosa con ID 111, tamaño "1.5L", precio 3 y marca "Inka-Cola"
        ProductoBebida gaseosa = new Gaseosa(1, " 1.5L ", 3, "Inka-Cola");

        // Crea un objeto de tipo Gaseosa con ID 112, tamaño "1.5L", precio 3.5 y marca "Fanta"
        ProductoBebida gaseosaFanta = new Gaseosa(1, "1.5L", 3.5, "Fanta");

        // Agrega los productos a la lista
        productos.add(energizante);
        productos.add(gaseosa);
        productos.add(gaseosaFanta);

        // Crea un objeto de tipo Entrega con un ID (1) y el nombre del cliente "Usuario"
        Entrega entrega = new Entrega(1, "usuario");

        for (ProductoBebida producto : productos) {
            entrega.agregarProducto(producto);
        }

        // Muestra por consola la información de la entrega, incluidos los productos agregados
        entrega.mostrarEntrega();
    }

}
