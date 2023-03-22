package Oefentoets;

public class Time implements IState{
    @Override
    public IState onLongPress(Watch watch) {
        return watch.off;
    }

    @Override
    public IState onShortPress(Watch watch) {
        return watch.date;
    }
}
