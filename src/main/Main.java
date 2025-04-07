package main;

import clases.Auto;
import clases.Camion;
import clases.Vehiculo;
import clases.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota", "Corolla", 5);
        Camion camion = new Camion("Volvo", "FH", true);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(auto);
        printer.imprimir(camion);
    }
}