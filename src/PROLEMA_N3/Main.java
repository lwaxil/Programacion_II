package PROLEMA_N3;

public class Main {
    public static void main (String[] args){
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
        // Inicializa el array con objetos de diferentes clases y atributos

        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        for (Electrodomesticos electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Electrodomesticos) {
                totalElectrodomesticos += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Lavarropas) {
                totalLavadoras += electrodomestico.precioFinal();
            }
        }

        System.out.println("Precio total de electrodomésticos: " + totalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + totalLavadoras);
    }
}

