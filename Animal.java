package Animales;

public abstract class Animal {
    //Atributos protegidos usables dentro del mismo paquete 
    protected String sonido;  //Atributo asignado a el sonido que hace el animal
    protected String dieta;   //Atributo asignado a la forma de alimentarse que tiene el animal
    protected String habitat;  //Atributo asignado a el habitat en el que convive un animal
    protected String nombreCientifico; //Atributo asignado a el nombre cientifico del animal
    
    
    // Metodos abstractos que nos dan datos de los animales 
    public abstract String AnimalNombreCientifico(); //Permite obtener el nombre cientifico
    public abstract String AnimalSonido(); //Permite obtener el sonido
    public abstract String AnimalDieta(); //Permite obtener la dieta llevada
    public abstract String AnimalHabitat(); //Permite obtener el habitat
}
