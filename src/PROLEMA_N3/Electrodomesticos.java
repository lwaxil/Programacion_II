package PROLEMA_N3;

import java.util.Arrays;

public class Electrodomesticos {
    protected double precioBase;
    protected double peso;
    protected char consumo;
    protected String color;
    private static final char CONSUMO_DEFECTO = 'F';
    String [] Arraycolores = {"blanco", "negro", "azul", "rojo", "gris"};
    public Electrodomesticos() {
        this(100.00, 5, CONSUMO_DEFECTO, "blanco");
    }

    public Electrodomesticos(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_DEFECTO, "blanco");
    }

    public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    private void comprobarConsumoEnergetico (char letra){
        if(letra >= 'A' && letra <= 'F'){
            this.consumo=letra;
        }else{
            this.consumo=CONSUMO_DEFECTO;
        }
    }
    private void comprobarColor(String colores){
        for (String arraycolore : Arraycolores) {
            if (arraycolore.equals(colores)) {
                this.color = colores;
                return;
            } else {
                this.color = "blanco";
            }
        }
    }
    public double precioFinal(){
        double precioFinal = precioBase;
        switch (consumo){
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (peso<20){
            precioFinal += 10;
        } else if (peso<50) {
            precioFinal += 50;
        } else if (peso<80) {
            precioFinal += 80;
        } else if (peso>80) {
            precioFinal += 100;
        }
        return precioFinal;
    }
    //getters
    public double getPrecioBase() {
        return precioBase;
    }
    public double getPeso() {
        return peso;
    }
    public char getConsumo() {
        return consumo;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return"El precio base es : " + precioBase +
                ", el peso: " + peso +
                ", el consumo: " + consumo +
                ", y el color: '" + color + '\'';
    }
}
