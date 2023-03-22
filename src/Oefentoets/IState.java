package Oefentoets;

public interface IState {
    IState onLongPress(Watch watch);
    IState onShortPress(Watch watch);
}
