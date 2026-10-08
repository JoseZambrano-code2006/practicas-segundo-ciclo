
package vehiculo;


public class Auto extends vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int año, int cantidadDePuertas) {
        super(marca, modelo, año);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cantidad de puertas: " + cantidadDePuertas);
    }

}
