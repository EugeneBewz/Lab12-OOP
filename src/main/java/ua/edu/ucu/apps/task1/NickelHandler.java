package ua.edu.ucu.apps.task1;

public class NickelHandler implements CoinHandler {
    private CoinHandler nextHandler;

    @Override
    public void handleRequest(int target) {
        if (target >= 5 && target < 10) {
            int noOfNickels = target / 5;
            System.out.println("Dispensing "+ noOfNickels +" nickel(-s)");
            target %= 5;
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(target);
        }
    }

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
