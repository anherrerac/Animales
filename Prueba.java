package Animales;

public class Prueba {
    
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];  //Creacion de array con 4 elementos
        animales[0] = new Gato(); //
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (int i = 0; i < animales.length; i++) { //Ciclo para recorrer el array
            System.out.println(animales[i].AnimalNombreCientifico()); //Impresion del nombre cientifico del animal
            System.out.println("Sonido: " + animales[i].AnimalSonido()); //Impresion del sonido del animal
            System.out.println("Dieta: " + animales[i].AnimalDieta()); //Impresion del tipo de dieta del animal
            System.out.println("Habitat: " + animales[i].AnimalHabitat()); //Impresion del habitat del animal
            System.out.println(); // Impresion de espacio entre los atributos de un animal y otro
        }
    }
}
