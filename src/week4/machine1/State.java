package week4.machine1;

public class State implements IState{
    protected Machine machine;

    public State(Machine machine) {
        this.machine = machine;
    }

    @Override
    public State a() {
        return null;
    }

    @Override
    public State b() {
        return null;
    }
}
