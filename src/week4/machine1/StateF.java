package week4.machine1;

public class StateF extends State{
    public StateF(Machine machine) {
        super(machine);
    }

    @Override
    public State a(){
        //Final state reached
        System.out.println("Final state reached");
        return machine.stateF;
    }
    @Override
    public State b() {
        //Final state reached
        System.out.println("Final state reached");
        return machine.stateF;
    }
    public String toString(){
        return "StateF";
    }
}
