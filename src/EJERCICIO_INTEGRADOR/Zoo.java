package EJERCICIO_INTEGRADOR;

import java.util.LinkedList;

public class Zoo {
    LinkedList<Animal> animales= new LinkedList<Animal>();
    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }
    public void mostrarAnimales(){
        for (Animal animal : animales) {
            System.out.println(animal.getNombre());
        }
    }
}
