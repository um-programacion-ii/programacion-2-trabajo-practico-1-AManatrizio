package main;

import clases.Auto;
import clases.Camion;
import clases.Vehiculo;
import clases.VehiculoPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();

        // Agregar vehículos
        vehiculos.add(new Auto("Toyota", "Corolla", 5));
        vehiculos.add(new Camion("Volvo", "FH", true));
        vehiculos.add(new Auto("Ford", "Focus", 4));
        vehiculos.add(new Camion("Scania", "R450", false));

        // Crear impresora
        VehiculoPrinter printer = new VehiculoPrinter();

        // Recorrer e imprimir vehículos
        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
        }

        System.out.println();

    }


}