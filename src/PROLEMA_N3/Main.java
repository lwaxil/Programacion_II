package PROLEMA_N3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        double precioFinal = 0;
        Scanner scanner = new Scanner(System.in);

        Electrodomesticos electrodomestico = new Electrodomesticos(100,6, 'E', "negro");
        precioFinal += electrodomestico.precioFinal();
        System.out.println(new Electrodomesticos(100,6, 'E', "negro"));
        System.out.println("Precio final del electrodoméstico: " + precioFinal);

    }
}

