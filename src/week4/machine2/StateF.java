package week4.machine2;

public class StateF extends State {
    public StateF(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        System.out.println("Final state reached");
        return machine.stateF;
    }
    @Override
    public State b() {
        System.out.println("Final state reached");
        return machine.stateF;
    }
    public String toString(){
        return "StateF";
    }
}
