package EJERCICIO_INTEGRADOR;

public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre, "Gato", "maulla", "corriendo");
    }
    @Override
    public void comer() {
        System.out.println("El " + this.tipo + " " + this.nombre + " come pajaros.");
    }
    //sobrecarga
    public void comer(String comida) {
        System.out.println("El " + this.tipo + " " + this.nombre + " come " + comida + ".");
    }
}
