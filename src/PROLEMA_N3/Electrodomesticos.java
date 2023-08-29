package PROLEMA_N3;

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
        for (int i=0; i<Arraycolores.length; i++){
            if (Arraycolores[i].equals(colores)){
                this.color=colores;
                return;
            }else{
                this.color="blanco";
            }
        }
    }
}
