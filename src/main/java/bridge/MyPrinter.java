package bridge;

public class MyPrinter implements IPrinter {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
