package ua.edu.ucu.apps.task1;

public class QuarterHandler implements CoinHandler {
    private CoinHandler nextHandler;

    @Override
    public void handleRequest(int target) {
        if (target >= 25 && target < 100) {
            int noOfQuarters = target / 25;
            System.out.println("Dispensing "+ noOfQuarters +" quarters(-s)");
            target %= 25;
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(target);
        }
    }

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
