package Oefentoets;

public class Watch {
    private IState currentState;
    public IState time, date, off;
    protected Watch watch;
    public Watch(){
        time = new Time();
        date = new Date();
        off = new Off();
        currentState = off;
        watch = this;
    }
    public void longPress(){
        currentState = currentState.onLongPress(this);
        System.out.println("The watch is now in the " + currentState.getClass().getSimpleName() + " State.");
    }
    public void shortPress(){
        currentState = currentState.onShortPress(this);
        System.out.println("The watch is now in the " + currentState.getClass().getSimpleName() + " State.");
    }
    public String getState(){
        return currentState.getClass().getSimpleName();
    }
}
