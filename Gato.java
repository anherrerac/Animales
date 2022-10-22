package Animales;

public class Gato extends Felino{ //Gato es una de las dos subclases creadas que tiene la clase Felino

    public String AnimalSonido() { //Metodo que devuelve el sonido de un Gato
        return "Maullido";
    }

    public String AnimalDieta() {  //Metodo que devuelve la alimentacion de un Gato
        return "Ratones";
    }

    public String AnimalHabitat() { //Metodo que devuelve la vivienda de un Gato
        return "Domestico";
    }

    public String AnimalNombreCientifico() { //Metodo que devuelve el nombre cientifico de un Gato
        return "Felis silvestris catus";
    }
}  

