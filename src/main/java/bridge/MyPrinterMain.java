package bridge;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyPrinterMain {
    public static void main(String[] args) throws FileNotFoundException {


        MySuperService service = new MySuperService(new MyPrinter());

     service.printData("Krzyś");
        PrintWriter writer = new PrintWriter("C:\\Users\\joann\\Desktop\\java materiały\\Wzorce Projektowe\\Bridge3.txt");
       // writer.println(message);
        writer.close();
    }
}
