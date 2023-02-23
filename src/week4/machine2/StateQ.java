package week4.machine2;

public class StateQ extends State {
    public StateQ(Machine machine) {
        super(machine);
    }
    @Override
    public State a(){
        System.out.println("Nothing happened??");
        return this;
    }
    @Override
    public State b() {
        System.out.println("Heading from Q to R");
        return machine.stateR;
    }
    public String toString(){
        return "StateQ";
    }
}
