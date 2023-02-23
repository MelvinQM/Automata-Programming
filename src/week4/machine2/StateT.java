package week4.machine2;

public class StateT extends State {
    public StateT(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        System.out.println("Heading from T back to Q");
        return machine.stateQ;
    }
    @Override
    public State b() {
        System.out.println("Heading from T to state F");
        return machine.stateF;
    }
    public String toString(){
        return "StateT";
    }
}

