package adapter2;

public class CounterMain {
    public static void main(String[] args) {

        Counter show = new ShowCounter();
       // UltimateCounterAdapter adapter = new UltimateCounterAdapter();

        for(int i=0;i<10; i++) {
            show.count();
        }
            System.out.print(show.count());

        Counter adapter = new UltimateCounterAdapter();
        for(int i=0;i<12;i++) {
            adapter.count();
        }
            System.out.println(adapter.count());

        }


    }

