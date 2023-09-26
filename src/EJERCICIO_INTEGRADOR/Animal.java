package EJERCICIO_INTEGRADOR;

public class Animal {
    protected String nombre;
    protected String tipo;
    private String sonido;
    private String movimiento;

    public Animal() {
        this.nombre = "";
        this.tipo = "";
        this.sonido = "";
        this.movimiento = "";
    }

    public Animal(String nombre, String tipo, String sonido, String movimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
        this.movimiento = movimiento;
    }

    public void comer() {
        System.out.println("El " + this.tipo + " " + this.nombre + " come.");
    }

    public void sonido() {
        System.out.println("El " + this.tipo + " " + this.nombre + " hace " + this.sonido + ".");
    }

    public void moverse() {
        System.out.println("El " + this.tipo + " " + this.nombre + " se mueve " + this.movimiento + ".");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public String getMovimiento() {
        return movimiento;
    }
}
