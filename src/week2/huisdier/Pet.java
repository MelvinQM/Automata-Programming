package week2.huisdier;

public class Pet {
    private String namePet;
    public String sound;
    /*
    Function makeSound is assigned in the respective animal classes.
    So an animal doesn't make the wrong sound
     */
    public void makeSound(){
        System.out.println(sound);
    }
    public String getName(){
        return namePet + " the " + this.getClass().getSimpleName();
    }
    /*
    Constructer below is called when a new object is made to prevent
    an object being made without the values in the constructer
     */
    public Pet(String naamDier) {
        this.namePet = naamDier;
    }
}
