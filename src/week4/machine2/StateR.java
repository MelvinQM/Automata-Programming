package week4.machine2;

public class StateR extends State {
    public StateR(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        System.out.println("Heading from R back to Q");
        return machine.stateQ;
    }
    @Override
    public State b() {
        System.out.println("Heading from R to state S");
        return machine.stateS;
    }
    public String toString(){
        return "StateR";
    }
}

