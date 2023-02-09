package week1;
/*
Melvin Moes 500905603
08-02-2023
FSAexec state checker
 */
public class FSAexec {
    public static void main(String[] args) {
        // TODO: fix it and test with 4 extra examples
        System.out.println("Made by: Melvin Moes 500905603");
        new FSAexec().fsaExec("abcabbaaba");
        new FSAexec().fsaExec("abcabaaaba");
        new FSAexec().fsaExec("bac");
        new FSAexec().fsaExec("bbbaaaccc");
    }

    void fsaExec(String input) {
        //Boolean array to identify which state ending gives out true or false
        boolean[] acceptState = {false, false, false, true};

        int[][] tranTab = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };
        System.out.printf("The inputted string: %s\n", input);

        int state = 0;  // The state indicates which group of transitions you are using
        for (int i = 0; i < input.length(); i++) { // For every char in the input it will loop so it can check every char
            char inchar = input.charAt(i);         // Which char it's checking right now
            int incharIndex = inchar - 'a';        // Checking the ASCII value of the char being checked
            System.out.printf("Current State: %d | Current Char: %c(%d) | ", state, inchar, incharIndex);
            state = tranTab[state][incharIndex];   // Taking the value of state(first iteration = 0) and the ASCII value of the char being checked
            System.out.printf("Heading to State: %d\n", state);
        }
        System.out.printf("The final transition is: %b\n\n", acceptState[state]);
    }
}
