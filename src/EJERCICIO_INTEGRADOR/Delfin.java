package EJERCICIO_INTEGRADOR;

public class Delfin extends Animal{
    public Delfin(String nombre) {
        super(nombre, "Delfin", "silbido", "nadando");
    }
    @Override
    public void comer() {
        System.out.println("El " + this.tipo + " " + this.nombre + " come peces.");
    }
    //sobrecarga
    public void comer(String comida) {
        System.out.println("El " + this.tipo + " " + this.nombre + " come " + comida + ".");
    }
}
