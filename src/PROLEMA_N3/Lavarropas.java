package PROLEMA_N3;

public class Lavarropas extends Electrodomesticos{
    private int carga;
    private static final int CARGA_DEFECTO = 5;

    public Lavarropas(int carga) {
        this.carga = CARGA_DEFECTO;
    }

    public Lavarropas(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavarropas(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga =carga;
    }
    //getter
    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (carga < 30){
            precioFinal += 50;
        }
        return  precioFinal;
    }
}
