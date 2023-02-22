package week4.machine1;

public class Machine {
    //Creating empty states to fill with the state objects below so multiple objects are not required.
    public State currentState, stateQ, stateR, stateS, stateT, stateF;
    public Machine() {
        //Assigning objects for the states so only one object needs to be made
        stateQ = new StateQ(this);
        stateR = new StateR(this);
        stateS = new StateS(this);
        stateF = new StateF(this);
        //Adding an extra StateT
        stateT = new StateT(this);
        currentState = stateQ;
    }
    public void processA(){
        //Run the function 'a' of the current state and update currentState with its return value
        currentState = currentState.a();
    }
    public void processB(){
        //Run the function 'b' of the current state and update currentState with its return value
        currentState = currentState.b();
    }
    public String toString(){
        return "This is the machine";
    }
}
