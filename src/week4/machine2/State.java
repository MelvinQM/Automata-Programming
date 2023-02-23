package week4.machine2;
//Did not make the class abstract because of the machine constructor needed for the code to work
public class State{
    protected Machine machine;

    public State(Machine machine) {
        this.machine = machine;
    }
    public State a() {return null;}
    public State b() {return null;}
}
