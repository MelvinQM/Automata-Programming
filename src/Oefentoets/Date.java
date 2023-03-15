package Oefentoets;

public class Date implements IState{
    @Override
    public IState lp(Watch watch) {
        return watch.off;
    }
    @Override
    public IState sp(Watch watch) {
        return watch.time;
    }
}
