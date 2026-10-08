
package Reserva;

import java.util.Date;

public class Reserva {
    private int id;
    private Date fecha;
    private Cliente cliente;

    public Reserva(int id, Date fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
