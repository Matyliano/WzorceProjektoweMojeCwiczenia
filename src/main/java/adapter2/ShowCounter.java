package adapter2;

public class ShowCounter implements Counter {

    private int count;    //pole



    @Override
    public int count() {
        return count++;
    }
}
