// src/clases/Vehiculo.java
package clases;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return "Vehículo - Marca: " + marca + ", Modelo: " + modelo;
    }
}