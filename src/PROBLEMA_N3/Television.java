package PROBLEMA_N3;

public class Television extends Electrodomesticos {
    private double resolucion;
    private boolean sintonizador_TDT;
    private final double RESOLUCION_DEFECTO = 20.0;
    private final boolean SINTONIZADOR_DEFECTO = false;

    public Television() {
        this.resolucion=RESOLUCION_DEFECTO;
        this.sintonizador_TDT=SINTONIZADOR_DEFECTO;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion=RESOLUCION_DEFECTO;
        this.sintonizador_TDT=SINTONIZADOR_DEFECTO;
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean sintonizador_TDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }
    //getters
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }
    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (resolucion > 40){
            precioFinal = precioFinal * 1.30;
        }
        if (sintonizador_TDT) {
            precioFinal += 50.0;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", sintonizador_TDT=" + sintonizador_TDT +
                ", RESOLUCION_DEFECTO=" + RESOLUCION_DEFECTO +
                ", SINTONIZADOR_DEFECTO=" + SINTONIZADOR_DEFECTO +
                '}';
    }
}
