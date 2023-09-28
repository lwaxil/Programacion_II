package EJERCICIO_INTEGRADOR;

public class Main {
    //Se le pide abstraerse y encapsular un conjunto de clases utilizando como referencia un delfin, un halcon y un gato, que incluyan al menos un atributo, una propiedad y un método para demostrar los siguientes conceptos teóricos:
    //
    //1.Principio de Ocultamiento.
    //2.Composición.
    //3.Construtores (por defecto y con parámetros)
    //4.Herencia entre clases.
    //5.Polimorfismo.
    //6.Métodos de Clase.
    //7.Sobrecarga de métodos.
    //8.Definir e Implementar una Interfaz.

    public static void main(String[] args) {
        //usar la clase zoo
        Zoo zoo = new Zoo();
        //definir delfin
        Delfin delfin = new Delfin("Flipper");
        zoo.agregarAnimal(delfin);
        //definir halcon
        Halcon halcon = new Halcon("Hawkeye");
        zoo.agregarAnimal(halcon);
        //definir gato
        Gato gato = new Gato("Garfield");
        zoo.agregarAnimal(gato);
        zoo.mostrarAnimales();
        //polimorfismo para comer
        delfin.comer();
        halcon.comer();
        gato.comer();
        //sobrecarga para comer
        delfin.comer("pescado");
        halcon.comer("ratones");
        gato.comer("h");
    }
}

