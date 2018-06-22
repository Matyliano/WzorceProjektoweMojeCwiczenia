package bridge;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFilePrinter implements IPrinter {
    @Override
    public void printMessage(String message) throws FileNotFoundException {
      //  PrintWriter writer = new PrintWriter("C:\\Users\\joann\\Desktop\\java materiały\\Wzorce Projektowe\\Bridge3.txt");
      //  writer.println(message);
       // writer.close();
    }
}
