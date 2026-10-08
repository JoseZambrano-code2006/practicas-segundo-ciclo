
package model;


public class Reserva {
    
    private int idReserva;
    private String fechaIgreso;
    private String fechaSalida;
    private String numeroPiso;
    private int numeroHabitacion;
    private double costo;
    private String estado;
    private Cliente cliente;
    private Usuario usuario;

    public Reserva() {
    }

    public Reserva(int idReserva, String fechaIgreso, String fechaSalida, String numeroPiso, int numeroHabitacion, double costo, String estado, Cliente cliente, Usuario usuario) {
        this.idReserva = idReserva;
        this.fechaIgreso = fechaIgreso;
        this.fechaSalida = fechaSalida;
        this.numeroPiso = numeroPiso;
        this.numeroHabitacion = numeroHabitacion;
        this.costo = costo;
        this.estado = estado;
        this.cliente = cliente;
        this.usuario = usuario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaIgreso() {
        return fechaIgreso;
    }

    public void setFechaIgreso(String fechaIgreso) {
        this.fechaIgreso = fechaIgreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(String numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



    
}
