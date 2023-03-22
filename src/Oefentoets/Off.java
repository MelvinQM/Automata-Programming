package Oefentoets;

public class Off implements IState {
    @Override
    public IState onLongPress(Watch watch) {
        return this;
    }

    @Override
    public IState onShortPress(Watch watch) {
        return watch.time;
    }
}
