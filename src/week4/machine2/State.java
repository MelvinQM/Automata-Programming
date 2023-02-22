package week4.machine2;

public class State implements IState {
    static State stateF, stateQ, stateR, stateS, current;

    @Override
    public void start() {
        System.out.printf("You are now in: %s\n", this.getClass().getSimpleName());
    }

    @Override
    public void setState(char input) {}
}
