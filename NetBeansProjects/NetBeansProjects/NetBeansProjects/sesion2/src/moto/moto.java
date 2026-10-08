package moto;

public class moto {

    //stribut   
    int velocidad;
    int cilindraje;
    String color;
    int limitePasajero;

    public moto(){
    }
    
    public moto(int velocidad, int cilindraje, String color, int limitePasajero) {
        this.velocidad = velocidad;
        this.cilindraje = cilindraje;
        this.color = color;
        this.limitePasajero = limitePasajero;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLimitePasajero() {
        return limitePasajero;
    }

    public void setLimitePasajero(int limitePasajero) {
        this.limitePasajero = limitePasajero;
    }
   
    
    //metodos de accion de la moto
    
    public void acelerar() {
         System.out.println("la moto esta acelerando");
    }

    public void apagar() {
         System.out.println("la moto esta apagada");

    }

    public void encender() {
         System.out.println("la moto esta encendido");

    }

    public void girar(){
          System.out.println("la moto esta girando");

    
    }
    
    public void girar(String direccion){
         System.out.println("la moto esta girando hacia:" + direccion);
       

    
    }
}
