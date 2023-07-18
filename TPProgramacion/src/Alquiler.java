
public class Alquiler {
    private String fechaAlquiler;
    private String fechaFin;
    private double totalPago;
    private String auto;
    private String reserva;
    private String nroAlquiler;
    private String clienteAval;

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getNroAlquiler() {
        return nroAlquiler;
    }

    public void setNroAlquiler(String nroAlquiler) {
        this.nroAlquiler = nroAlquiler;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public String getClienteAval() {
        return clienteAval;
    }

    public void setClienteAval(String clienteAval) {
        this.clienteAval = clienteAval;
    }
    

    public Alquiler(String a, String r, String ca, String na, String fa, String ff, double p) {
       auto = a;
       reserva = r;
       nroAlquiler = na;
       fechaAlquiler = fa;
       fechaFin = ff;
       totalPago = p;
       clienteAval= ca;
       System.out.println("Alquiler creado correctamente");
    }

    
    public void alquilarAuto(){
        System.out.println("Auto alquilado correctamente");
    }
    public void devolverAuto(){
        System.out.println("Auto devuelto correctamente");
    }
    public void pagarAlquiler(){
        System.out.println("Alquiler pagado correctamente");
    }
}
