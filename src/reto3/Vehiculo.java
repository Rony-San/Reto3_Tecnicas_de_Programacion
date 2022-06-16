package reto3;

public class Vehiculo {

    private int anioFabricacion;
    private String placa;
    private String marca;
    private String modelo;
    private int kilometraje;
    private String color;
    private String descripcion;
    private double precio;
    private Vendedor vendedor;
    private Llanta[] llantas;
    private Motor motor;

    //Constructor de la clase
    public Vehiculo(int anioFabricacion, String placa, String marca, String modelo, int kilometraje, String color, String descripcion, double precio, Vendedor vendedor, Llanta[] llantas, Motor motor) {
        this.anioFabricacion = anioFabricacion;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.precio = precio;
        this.vendedor = vendedor;
        if (llantas.length <= 4) {
            this.llantas = llantas;
        }
        this.motor = motor;
    }

    public String calculasUso() {
        int kilometraje = getKilometraje();
        if (kilometraje == 0) {
            return " 0 Km ";
        } else if (kilometraje > 0 && kilometraje < 1000) {
            return "nuevo";
        } else if (kilometraje >= 1000 && kilometraje < 20000) {
            return " casi nuevo";

        } else if (kilometraje >= 20000 && kilometraje < 100000) {
            return " usado";
        } else if (kilometraje >= 100000) {
            return " muy usado";
        }
        return "nulo";
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
