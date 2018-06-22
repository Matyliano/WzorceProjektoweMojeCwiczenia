package adapter2;

public class UltimateCounter {

    private int ultimateCount;  //pole

    public String ultimateCount() {
        return String.format("TotalCount: %d",ultimateCount++);
    }
}


