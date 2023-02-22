package week4.machine1;

public class StateQ extends State{
    public StateQ(Machine machine) {
        super(machine);
    }
    @Override
    public State a(){
        //Stay in state Q
        System.out.println("Nothing happened??");
        return machine.stateQ;
    }
    @Override
    public State b() {
        //Go to state R
        System.out.println("Heading from Q to R");
        return machine.stateR;
    }
    public String toString(){
        return "StateQ";
    }
}
