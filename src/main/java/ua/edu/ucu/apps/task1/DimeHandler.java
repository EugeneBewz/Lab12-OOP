package ua.edu.ucu.apps.task1;

public class DimeHandler implements CoinHandler {
    private CoinHandler nextHandler;

    @Override
    public void handleRequest(int target) {
        if (target >= 10 && target < 25) {
            int noOfDimes = target / 10;
            System.out.println("Dispensing "+ noOfDimes +" dime(-s)");
            target %= 10;
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(target);
        }
    }

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
