package week2.huisdier;

public class Chihuahua extends Dog{
    public Chihuahua(String naamDier) {
        super(naamDier);
    }
    /*
    Override is used to redefine the function for this class
    instead of using a 'sound' variable the function is directly input with a string
     */
    @Override
    public void makeSound(){
        for (int i = 0; i < 10; i++) {
            System.out.println("WAF...GRRR....WAF");
        }
    }
}
