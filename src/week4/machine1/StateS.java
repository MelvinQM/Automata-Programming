package week4.machine1;

public class StateS extends State{
    //Constructor to make sure on
    public StateS(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        //Go back to state Q
        System.out.println("Heading from S back to Q");
        return machine.stateQ;
    }
    @Override
    public State b() {
        //Go to state T
        System.out.println("Heading from S to T");
        return machine.stateT;
    }
    public String toString(){
        return "StateS";
    }
}
