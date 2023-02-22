package week4.machine1;

import java.util.Scanner;

public class TestMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char input;
        //Making a machine object that handles all the state relations
        Machine machine1 = new Machine();

        //Main stateloop
        while (machine1.currentState != machine1.stateF){
            //Receiving input
            System.out.println("Input only 'a' or 'b'");
            input = s.next().charAt(0);
            //Conditions being tested to see where to transition to
            if (input == 'a'){
                machine1.processA();
            } else if (input == 'b') {
                machine1.processB();
            } else {
                System.out.println("Error!");
            }
        }
    }
}
