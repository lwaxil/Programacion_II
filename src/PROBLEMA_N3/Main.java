package PROBLEMA_N3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Electrodomesticos[] electrodomesticos = new Electrodomesticos[1];

        for (int i = 0; i < electrodomesticos.length; i++) {
            System.out.println("Elija el tipo de electrodoméstico a cargar:");
            System.out.println("1. Electrodoméstico");
            System.out.println("2. Lavarropas");
            System.out.println("3. Televisión");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> electrodomesticos[i] = cargarElectrodomestico(scanner);
                case 2 -> electrodomesticos[i] = cargarLavarropas(scanner);
                case 3 -> electrodomesticos[i] = cargarTelevision(scanner);
                default -> {
                    System.out.println("Opción no válida. Se cargará un Electrodoméstico por defecto.");
                    electrodomesticos[i] = new Electrodomesticos();
                }
            }
        }

        double totalTelevisores = 0;
        double totalLavadoras = 0;
        double totalElectrodomesticos = 0;

        for (Electrodomesticos Electrodomesticos : electrodomesticos) {
            if (Electrodomesticos instanceof Television) {
                totalTelevisores += Electrodomesticos.precioFinal();
            } else if (Electrodomesticos instanceof Lavarropas) {
                totalLavadoras += Electrodomesticos.precioFinal();
            }
            totalElectrodomesticos += Electrodomesticos.precioFinal();
        }

        System.out.println("Precio total de televisores: " + totalTelevisores);
        System.out.println("Precio total de lavadoras: " + totalLavadoras);
        System.out.println("Precio total de electrodomésticos: " + totalElectrodomesticos);

        
        scanner.close();
    }

    public static Electrodomesticos cargarElectrodomestico(Scanner scanner) {
        System.out.println("Ingrese el precio base del electrodoméstico:");
        double precioBase = scanner.nextDouble();
        System.out.println("Ingrese el peso del electrodoméstico:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese el consumo energético (letra entre A y F):");
        char consumoEnergetico = scanner.next().charAt(0);
        System.out.println("Ingrese el color (blanco, negro, rojo, azul o gris):");
        String color = scanner.next();

        return new Electrodomesticos(precioBase, peso, consumoEnergetico, color);
    }

    public static Lavarropas cargarLavarropas(Scanner scanner) {
        System.out.println("Ingrese el precio base del lavarropas:");
        double precioBase = scanner.nextDouble();
        System.out.println("Ingrese el peso del lavarropas:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la carga del lavarropas:");
        int carga = scanner.nextInt();
        System.out.println("Ingrese el consumo energético (letra entre A y F):");
        char consumoEnergetico = scanner.next().charAt(0);
        System.out.println("Ingrese el color (blanco, negro, rojo, azul o gris):");
        String color = scanner.next();

        return new Lavarropas(precioBase, peso, consumoEnergetico, color, carga);
    }

    public static Television cargarTelevision(Scanner scanner) {
        System.out.println("Ingrese el precio base de la televisión:");
        double precioBase = scanner.nextDouble();
        System.out.println("Ingrese el peso de la televisión:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la resolución de la televisión (en pulgadas):");
        int resolucion = scanner.nextInt();
        System.out.println("¿Tiene sintonizador TDT? (true/false):");
        boolean sintonizadorTDT = scanner.nextBoolean();
        System.out.println("Ingrese el consumo energético (letra entre A y F):");
        char consumoEnergetico = scanner.next().charAt(0);
        System.out.println("Ingrese el color (blanco, negro, rojo, azul o gris):");
        String color = scanner.next();

        return new Television(precioBase, peso, consumoEnergetico, color, resolucion, sintonizadorTDT);
    }
}
