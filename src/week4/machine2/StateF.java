package week4.machine2;

public class StateF extends State {
    public void setState(char input) {
        if (input == 'a'){
            System.out.println("Final state reached can't transition again!!");
        } else if (input == 'b') {
            System.out.println("Final state reached can't transition again!!");
        } else {
            System.out.println("Error a false input has been given");
        }
    }
}
