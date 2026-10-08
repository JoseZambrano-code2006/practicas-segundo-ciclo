package vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 2020, 4));
        vehiculos.add(new Camion("Mercedes-Benz", "Actros", 2018, 20.0));
        vehiculos.add(new Auto("Honda", "Civic", 2015, 2));
        vehiculos.add(new Camion("Scania", "R450", 2022, 30.0));

        for (vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDetalles();
            System.out.println(); // Salto de línea entre cada vehículo
        }

    }

}
