import java.util.Scanner;
public class Cliente {
    private String DNI;
    private String codigoCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String mail;
    private String dato ="";
    Scanner leerDato = new Scanner(System.in);

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Cliente() {
        this.DNI = "Sin especificar";
        this.codigoCliente = "Sin especificar";
        this.nombre = "Sin especificar";
        this.apellido = "Sin especificar";
        this.telefono = "Sin especificar";
        this.direccion = "Sin especificar";
        this.mail = "Sin especificar";
        System.out.println("Se ha creado espacio para ingresar cliente");
    }
    public void llamarCliente(){
        System.out.println("Llamando al numero "+telefono);
    }
    public void verDatosCliente(){
       System.out.println(nombre +" "+ apellido+ " DNI: "+DNI); 
    }
    public void avalarCliente(){
       System.out.println("Has avalado a otro cliente"); 
    }
    public void registrarCliente (){
        System.out.println("Ingrese los datos de cliente que se le pide a conticuacion");
         System.out.print("Ingrese nombre: ");
         dato= leerDato.nextLine();
        nombre = dato;
         System.out.print("Ingrese apellido: ");
         dato= leerDato.nextLine();
        apellido = dato;
         System.out.print("Ingrese DNI: ");
         dato= leerDato.nextLine();
        DNI = dato;
         System.out.print("Ingrese telefono: ");
         dato= leerDato.nextLine();
        telefono = dato;
         System.out.print("Ingrese direccion: ");
         dato= leerDato.nextLine();
        direccion=dato;
         System.out.print("Ingrese mail: ");
         dato= leerDato.nextLine();
        mail=dato;
    }
}
