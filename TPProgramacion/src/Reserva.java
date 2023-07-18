
public class Reserva {
    private double precioTotal;
    private String fechaReserva;
    private String fechaVencimientoReserva;
    private Cliente cliente;
    private String nroReserva;
    

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaVencimientoReserva() {
        return fechaVencimientoReserva;
    }

    public void setFechaVencimientoReserva(String fechaVencimientoReserva) {
        this.fechaVencimientoReserva = fechaVencimientoReserva;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

  

    public Reserva(double p, String fr, String fv) {
        precioTotal = p;
        fechaReserva = fr;
        fechaVencimientoReserva = fv;
        this.cliente=cliente;
        this.nroReserva=nroReserva;
        System.out.println("Reserva guardada");
    }
   
     public void cancelarReserva (){
        System.out.println("Reserva cancelada correctamente");
    }
      public void adelantarPago (){
        System.out.println("Pago realizado");
    }
      public void verVencimiento(){
          System.out.println("La reserva vence en la siguiente fecha: "+fechaVencimientoReserva);
      }
      public void verFechaReserva(){
          System.out.println("La reserva ha sido realizada en la siguiente fecha: "+fechaReserva);
      }
}
