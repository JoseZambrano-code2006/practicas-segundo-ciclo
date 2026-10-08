
package vehiculo;


public class Camion extends vehiculo {
    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int año, double capacidadDeCarga) {
        super(marca, modelo, año);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Capacidad de carga: " + capacidadDeCarga + " toneladas");
    }
}

