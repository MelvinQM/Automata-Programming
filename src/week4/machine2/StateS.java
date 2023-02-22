package week4.machine2;

public class StateS extends State {
    public void setState(char input) {
        if (input == 'a'){
            current = stateQ;
        } else if (input == 'b') {
            current = stateF;
        } else {
            System.out.println("Error a false input has been given");
        }
    }
}
