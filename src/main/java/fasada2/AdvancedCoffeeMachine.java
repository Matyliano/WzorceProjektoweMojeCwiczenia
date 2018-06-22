package fasada2;

import fasada2.CoffeIngredient;
import java.util.List;

public class AdvancedCoffeeMachine {

    CoffeeBeverage coffeeBeverage = new CoffeeBeverage();


    public void addIngredient(CoffeIngredient coffeeIngredient){
//listę składników mamy w klasie CoffeeBeverage, więc musimy stworzyć obiekt tej klasy i dodać do kawy
        coffeeBeverage.list.add(coffeeIngredient);

    }

    public CoffeeBeverage makeCoffeeBeverage(){

        return new CoffeeBeverage();
    }
}
