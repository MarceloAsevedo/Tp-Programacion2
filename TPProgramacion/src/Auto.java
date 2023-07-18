
public class Auto {
    private String modelo;
    private String color;
    private String matricula;
    private String marca;
    private boolean disponible;
    private double precio;
    private double nafta;

    public double getNafta() {
        return nafta;
    }

    public void setNafta(double nafta) {
        this.nafta = nafta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDiponible() {
        return disponible;
    }

    public void setDiponible(boolean diponible) {
        this.disponible = diponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Auto() {
        this.modelo = "0";
        this.color = "No especificado";
        this.matricula = "No especificado";
        this.marca = "No especifidaco";
        this.disponible = true;
        this.precio = 0.0;
        this.nafta = 0.0;
        System.out.println("Auto Agregado al Sistema, realice modificaciones correspondientes");
    }
    
    public void verDisponibilidad() {
        if (disponible==true){
            System.out.println("Esta disponible");
        }
        else{
                System.out.println("Este auto esta alquilado");
        }
    }
    public void cuantaNaftaTiene(){
        System.out.println("Este auto tiene "+nafta+" litros de nafta." );
    }
    public void consultarPrecio(){
       System.out.println("El precio de alquiler de este auto es de: $"+precio); 
    }
}
