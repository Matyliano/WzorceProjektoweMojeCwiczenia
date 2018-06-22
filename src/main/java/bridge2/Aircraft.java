package bridge2;

public class Aircraft implements IVehicle{

    private String name;

    public Aircraft( String name ) {
        this.name = name;
    }



    @Override
    public void moveRight() {
        System.out.println(name + " rusza się w prawo ");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + " rusza się w lewo ");
    }

    @Override
    public void moveUp() {
        System.out.println(name + " rusza się w górę ");
    }

    @Override
    public void moveDown() {
        System.out.println(name + " rusza się w dół ");
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                '}';
    }
}
