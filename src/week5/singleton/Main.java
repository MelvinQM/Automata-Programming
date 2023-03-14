package week5.singleton;
/*
Melvin Moes 500905603
13-03-2023
Singleton Pattern
 */
public class Main {
    public static void main(String[] args) {
        Aarde a1 = Aarde.getInstance();
        Aarde a2 = Aarde.getInstance();
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
