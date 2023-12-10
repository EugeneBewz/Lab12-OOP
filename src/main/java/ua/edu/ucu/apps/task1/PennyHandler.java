package ua.edu.ucu.apps.task1;

public class PennyHandler implements CoinHandler {
    private CoinHandler nextHandler;

    @Override
    public void handleRequest(int target) {
        if (target >= 1 && target < 5) {
            int noOfPennies = target / 1;
            System.out.println("Dispensing "+ noOfPennies +" penny(-ies)");
            target %= 1;
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(target);
        }
    }

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
