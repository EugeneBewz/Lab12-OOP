package ua.edu.ucu.apps.task1;

public class DollarHandler implements CoinHandler {
    private CoinHandler nextHandler;

    @Override
    public void handleRequest(int target) {
        if (target >= 100) {
            int noOfDollars = target / 100;
            System.out.println("Dispensing "+ noOfDollars +" dollar(-s)");
            target %= 100;
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(target);
        }
    }

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
