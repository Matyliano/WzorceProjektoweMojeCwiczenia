package grinder;

import fasada2.CoffeeBean;

public class CoffeeGrinder {

    private int wasteContainerCount;

    public int empty(){
        return wasteContainerCount =0;
    }
    //zapisać na papierze w celu utrwalenia. podpunkt b do zadania
    public CoffeePowderIngredient  grind(Object CoffeeBean) throws CoffeeGrinderExcepion {
        if (wasteContainerCount > 3) {
            throw new CoffeeGrinderExcepion();
        } else {
            wasteContainerCount++;
            System.out.println(" waste container zapełniony ");
            return new CoffeePowderIngredient();
        }

    }
}
