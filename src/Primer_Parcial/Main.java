package Primer_Parcial;

import java.util.LinkedList;

class Marvel{
    LinkedList <Avengers> avengers = new LinkedList<Avengers>();
    public void agregarAvenger(Avengers avenger){
        avengers.add(avenger);
    }
    public void mostrarAvengers() {
        for (Avengers avenger : avengers) {
            System.out.println(avenger.getNombre());
        }
    }

}
class Avengers {
    //principio de ocultamiento
    private String nombre;
    private String poder;
    private String nombre_nave;

    //constructor
    public Avengers(String nombre, String poder){
    }
    //constructor con parametros
    public Avengers(String nombre, String poder, String nombre_nave){
        this.nombre = nombre;
        this.poder = poder;
        this.nombre_nave = nombre_nave;
    }
    //metodos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPoder(String poder){
        this.poder = poder;
    }
    public String getPoder(){
        return this.poder;
    }
    public String getNombre_nave() {
        return nombre_nave;
    }
    public void setNombre_nave(String nombre_nave) {
        this.nombre_nave = nombre_nave;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Poder: " + getPoder());
        System.out.println("Nombre de la nave: " + getNombre_nave());
    }
    class Superheroes extends Avengers{
        private String nombre;
        private String poder;
        private String tipo;

        public Superheroes(String nombre, String poder, String tipo){
            super(nombre, poder);
            this.tipo = tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        public String getTipo(){
            return this.tipo;
        }
        //polimorfismo
        public void mostrarDatos(){
            System.out.println("Nombre: " + getNombre());
            System.out.println("Poder: " + getPoder());
            System.out.println("Tipo: " + getTipo());
        }

        //sobrecarga de metodo
        public void mostrarDatos(String nombre, String poder){
            System.out.println("Nombre: " + nombre);
            System.out.println("Poder: " + poder);
        }
    }
}

public class Main {
}
