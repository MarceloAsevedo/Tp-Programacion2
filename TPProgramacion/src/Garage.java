import java.util.Scanner;
public class Garage {
    private String codigoGarage;
    private int cantidadMaxDeAutos;
    private int cantAutosDentro;
    private Auto[] autosDentro=new Auto[cantidadMaxDeAutos];
    Scanner leer = new Scanner(System.in);

    public int getCantAutosDentro() {
        return cantAutosDentro;
    }

    public void setCantAutosDentro(int cantAutosDentro) {
        this.cantAutosDentro = cantAutosDentro;
    }

    public Auto[] getAutosDentro() {
        return autosDentro;
    }

    public void setAutosDentro(Auto[] autosDentro) {
        this.autosDentro = autosDentro;
    }

    public String getCodigoGarage() {
        return codigoGarage;
    }

    public void setCodigoGarage(String codigoGarage) {
        this.codigoGarage = codigoGarage;
    }

    public int getCantidadDeAutos() {
        return cantidadMaxDeAutos;
        
    }

    public void setCantidadMaxDeAutos(int cantidadMaxDeAutos) {
        this.cantidadMaxDeAutos = cantidadMaxDeAutos;
    }

    public Garage(String cod, int cant) {
     codigoGarage=cod;
    cantidadMaxDeAutos=cant;
    cantAutosDentro=0;
   System.out.println("Garage creado correctamente");
    
    }

  

 

    public void getGarage(){
     
        System.out.println("Código: "+codigoGarage);
        System.out.println("Este garage tiene capacidad para "+cantidadMaxDeAutos+" autos.");
        System.out.println("Tiene: "+cantAutosDentro+" autos dentro.");
       
    }
   
    public void agregarAuto(Auto auto){
        if (cantAutosDentro<cantidadMaxDeAutos){
            autosDentro[cantAutosDentro]= auto;
        cantAutosDentro= cantAutosDentro+1;
        System.out.println("Auto agregado con éxito");}
        if (cantAutosDentro==cantidadMaxDeAutos){
        System.out.println("Garage lleno, saque un auto o vaya a otro garage");}
    }
    public void sacarAuto(){
        if (cantAutosDentro>0)
            cantAutosDentro= cantAutosDentro-1;
        System.out.println("Has sacado un auto del garage");
        if (cantAutosDentro==0){
        System.out.println("No hay autos dentro, no se le puede sacar");
                
                }
    }
       
    
  
}
