
package model;


public class pago {
    
    private int idPago;  

    private String metodoPago;
    
    private String montoResibido;
    
    private int vuelto;

    public pago() {
    }

    public pago(int idPago, String metodoPago, String montoResibido, int vuelto) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.montoResibido = montoResibido;
        this.vuelto = vuelto;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMontoResibido() {
        return montoResibido;
    }

    public void setMontoResibido(String montoResibido) {
        this.montoResibido = montoResibido;
    }

    public int getVuelto() {
        return vuelto;
    }

    public void setVuelto(int vuelto) {
        this.vuelto = vuelto;
    }

      
    
}
