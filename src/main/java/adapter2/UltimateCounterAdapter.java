package adapter2;

public class UltimateCounterAdapter implements Counter {

    private UltimateCounter ultimateCounter = new UltimateCounter();




    @Override
    public int count() {
       // ultimateCounter.ultimateCount();
        return Integer.parseInt(ultimateCounter.ultimateCount().replaceAll("TotalCount 12: ", ""));
    }
}
