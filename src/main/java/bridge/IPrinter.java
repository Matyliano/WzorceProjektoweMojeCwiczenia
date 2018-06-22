package bridge;

import java.io.FileNotFoundException;

public interface IPrinter {
    public void printMessage(String message) throws FileNotFoundException;
}
