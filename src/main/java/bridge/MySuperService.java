package bridge;

public class MySuperService {

    private MyPrinter printer;


    public MySuperService(MyPrinter printer) {
        this.printer = printer;

    }

    public void printData(String data){
       printer.printMessage(data);
    }
}
