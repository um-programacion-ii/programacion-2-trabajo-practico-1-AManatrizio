package main;

import clases.Vehiculo;
import clases.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2015, 1500.0);
        Vehiculo vehiculo2 = new Vehiculo("XYZ987", "Ford", 2020, 2000.0);
        Vehiculo vehiculo3 = new Vehiculo("LMN456", "Chevrolet", 1999, 1800.0);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(vehiculo1);
        printer.imprimir(vehiculo2);
        printer.imprimir(vehiculo3);
    }
}