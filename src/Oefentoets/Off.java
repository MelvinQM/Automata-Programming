package Oefentoets;

public class Off implements IState {
    @Override
    public IState lp(Watch watch) {
        return this;
    }

    @Override
    public IState sp(Watch watch) {
        return watch.time;
    }
}
