package EJERCICIO_INTEGRADOR;

public class Halcon extends Animal{

    public Halcon(String nombre) {
        super(nombre, "Halcon", "chilla", "volando");
    }
    //polimorfismo
    @Override
    public void comer() {
        System.out.println("El " + this.tipo + " " + this.nombre + " come ratones.");
    }
    //sobrecarga
    public void comer(String comida) {
        System.out.println("El " + this.tipo + " " + this.nombre + " come " + comida + ".");
    }
}
