package Oefentoets;

public class Date implements IState{
    @Override
    public IState onLongPress(Watch watch) {
        return watch.off;
    }
    @Override
    public IState onShortPress(Watch watch) {
        return watch.time;
    }
}
