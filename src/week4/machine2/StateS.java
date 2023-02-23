package week4.machine2;

public class StateS extends State {
    //Constructor to make sure when an object is created the machine used is provided
    public StateS(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        System.out.println("Heading from S back to Q");
        return machine.stateQ;
    }
    @Override
    public State b() {
        System.out.println("Heading from S to T");
        return machine.stateT;
    }
    public String toString(){
        return "StateS";
    }
}
