package clases;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String marca, String modelo, int cantidadPasajeros) {
        super(marca, modelo);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String getDescripcion() {
        return "Auto - Marca: " + getMarca() + ", Modelo: " + getModelo() +
                ", Pasajeros: " + cantidadPasajeros;
    }
}