
public class Administrador {
    private String usuario;
    private String contrasena;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Administrador(String u, String c) {
        usuario = u;
        contrasena = c;
        System.out.println("Administrador creado");
    }
    public void ValidarAdmin(){
        System.out.println("Administrador validado");
    }
 
}
