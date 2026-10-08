package moto;

public class motoMain {

    public static void main(String[] args) {
        //construtctor vacio
        moto m = new moto();
        //
        moto motoXTZ = new moto(velocidad:200,cilindraje:150,color:black,lmitepasajero:2);
        
        
     System.out.println("velocidad" + motoXTZ.velocidad);
        System.out.println("cilindraje" + motoXTZ.cilindraje);
        System.out.println("color" + motoXTZ.color);
        System.out.println("numero_pasajeros" + motoXTZ.limitePasajero);
        System.out.println("velocidad" + motoXTZ.velocidad);

        m.acelerar();
        m.encender();
        m.apagar();
        m.girar(direccion:"left");
    

     
    }
    
}
