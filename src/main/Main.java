package main;

import clases.Camion;
import clases.Vehiculo;
import clases.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Toyota", "Corolla");
        Camion camion = new Camion("Volvo", "FH", true);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(auto);
        printer.imprimir(camion);
    }
}