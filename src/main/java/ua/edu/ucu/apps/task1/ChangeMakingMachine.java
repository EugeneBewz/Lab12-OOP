package ua.edu.ucu.apps.task1;

public class ChangeMakingMachine {
    public static void main(String[] args) {
        DollarHandler dollarHandler = new DollarHandler();
        QuarterHandler quarterHandler = new QuarterHandler();
        DimeHandler dimeHandler = new DimeHandler();
        NickelHandler nickelHandler = new NickelHandler();
        PennyHandler pennyHandler = new PennyHandler();

        dollarHandler.setNextHandler(quarterHandler);
        quarterHandler.setNextHandler(dimeHandler);
        dimeHandler.setNextHandler(nickelHandler);
        nickelHandler.setNextHandler(pennyHandler);

        int amountToChange = 73;
        System.out.println("Making change for: $" + amountToChange);
        dollarHandler.handleRequest(amountToChange);
    }
}