package week4.machine1;

public class StateR extends State{
    public StateR(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        //Go back to state Q
        System.out.println("Heading from R back to Q");
        return machine.stateQ;
    }
    @Override
    public State b() {
        //Go to state S
        System.out.println("Heading from R to state S");
        return machine.stateS;
    }
    public String toString(){
        return "StateR";
    }
}

