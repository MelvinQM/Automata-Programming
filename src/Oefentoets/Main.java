/*
Melvin Moes 500905603
15-03-2023
Watch Control
 */
package Oefentoets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Watch watch = new Watch();
        Scanner s = new Scanner(System.in);
        char input;
        System.out.println("The watch is now: " + watch.getState());
        while(true){
            System.out.println("Press '1' for a short press, Press '2' for a long press.");
            input = s.next().charAt(0);
            switch (input){
                case '1':
                    watch.shortPress();
                    break;
                case '2':
                    watch.longPress();
                    break;
                default:
                    System.out.println("Wrong input try again!");
                    break;
            }
        }
    }
}
