package week5;

public class Pet {
    private String naamDier;
    public String sound;
    /*
    Function makeSound is assigned in the respective animal classes.
    So an animal doesn't make the wrong sound
     */
    public void makeSound(){
        System.out.println(sound);
    }
    public String getName(){
        return naamDier + " the " + this.getClass().getSimpleName();
    }
    /*
    Constructer below is called when a new object is made to prevent
    an object being made without the values in the constructer
     */
    public Pet(String naamDier) {
        this.naamDier = naamDier;
    }
}
