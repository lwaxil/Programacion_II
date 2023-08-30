package PROBLEMA_N3;

public class Lavarropas extends Electrodomesticos{
    private int carga;
    private final int CARGA_DEFECTO = 5;

    public Lavarropas() {
        this.carga = CARGA_DEFECTO;
    }

    public Lavarropas(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFECTO;
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

    @Override
    public String toString() {
        return "Lavarropas{" +
                "carga=" + carga +
                ", CARGA_DEFECTO=" + CARGA_DEFECTO +
                '}';
    }
}
