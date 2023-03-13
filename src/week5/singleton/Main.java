package week5.singleton;
/*
Melvin Moes 500905603
13-03-2023
Singleton Pattern
 */
public class Main {
    public static void main(String[] args) {
        Aarde a1 = new Aarde();
        Aarde a2 = new Aarde();
        System.out.println(a1.getInstance());
        System.out.println(a2.getInstance());
    }
}
