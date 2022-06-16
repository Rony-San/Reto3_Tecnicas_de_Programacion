
package reto3;


public class Vendedor {
    private int anioIngreso;
    private String documento;
   private String nombre; 
   private String appelidos; 
   private int edad;
   private double ventas; 
   private String descripcion;

   
   
    public Vendedor(int anioIngreso, String documento, String nombre, String appelidos, int edad, double ventas, String descripcion) {
        this.anioIngreso = anioIngreso;
        this.documento = documento;
        this.nombre = nombre;
        this.appelidos = appelidos;
        this.edad = edad;
        this.ventas = ventas;
        this.descripcion = descripcion;
    }

   
   public String resultadoVentas(){
       
       double ventas = getVentas();
       
         if (ventas == 0){
            return " novato ";
        }else if(ventas > 0 && ventas < 500000000){
            return "Principiante";
        }else if(ventas >= 500000000  && ventas < 2000000000  ){
            return "Intermedio";
            
        }else if ( ventas >= 2000000000){
            return " Avanzado";
        }
        return "nulo";
   }
   
   
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelidos() {
        return appelidos;
    }

    public void setAppelidos(String appelidos) {
        this.appelidos = appelidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
