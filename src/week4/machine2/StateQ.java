package week4.machine2;

public class StateQ extends State {
    public void setState(char input) {
        if (input == 'a'){
            current = stateQ;
        } else if (input == 'b') {
            current = stateR;
        } else {
            System.out.println("Error a false input has been given");
        }
    }
}
