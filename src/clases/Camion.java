package clases;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String marca, String modelo, boolean tieneAcoplado) {
        super(marca, modelo);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean tieneAcoplado() {
        return tieneAcoplado;
    }

    @Override
    public String getDescripcion() {
        return "Camión - Marca: " + getMarca() + ", Modelo: " + getModelo() +
                ", Acoplado: " + (tieneAcoplado ? "Sí" : "No");
    }
}