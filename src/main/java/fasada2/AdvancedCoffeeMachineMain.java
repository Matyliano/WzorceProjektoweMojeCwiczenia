package fasada2;

import frother.MilkFrother;
import frother.MilkFrotherException;
import grinder.CoffeeGrinder;
import grinder.CoffeeGrinderExcepion;

public class AdvancedCoffeeMachineMain {
    public static void main( String[] args ) throws CoffeeGrinderExcepion, MilkFrotherException {

        AdvancedCoffeeMachine machine = new AdvancedCoffeeMachine();
        CoffeeGrinder grinder = new CoffeeGrinder();
        MilkFrother frother = new MilkFrother();

        machine.addIngredient(grinder.grind(new CoffeeBean()));
        machine.addIngredient(new WaterIngredient(100));
        machine.addIngredient(frother.froth(new MilkIngredient()));
        System.out.println(machine.makeCoffeeBeverage());



    }
}
