package week4.machine2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating all states
        State.stateF = new StateF();
        State.stateQ = new StateQ();
        State.stateR = new StateR();
        State.stateS = new StateS();

        //Assigning the current to the starting state Q
        State.current = State.stateQ;
        Scanner s = new Scanner(System.in);
        char input;

        //Main stateloop
        while (true){
            //Entering the state and printing which state it is
            State.current.start();
            //Receiving input
            System.out.println("Input only 'a' or 'b'");
            input = s.next().charAt(0);
            //Conditions being tested to see where to transition to
            State.current.setState(input);
        }
    }
}
