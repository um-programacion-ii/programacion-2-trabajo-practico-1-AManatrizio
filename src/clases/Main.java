package clases;


public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos de la clase Vehículo
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2015, 1500.0);
        Vehiculo vehiculo2 = new Vehiculo("XYZ987", "Ford", 2020, 2000.0);
        Vehiculo vehiculo3 = new Vehiculo("LMN456", "Chevrolet", 1999, 1800.0);

        // Imprimir información de los vehículos
        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();
    }
}