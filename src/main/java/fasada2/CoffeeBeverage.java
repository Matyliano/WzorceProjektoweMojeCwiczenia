package fasada2;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBeverage {

   List<CoffeIngredient> list = new ArrayList<CoffeIngredient>();



    @Override
    public String toString() {
        return "CoffeeBeverage{" +
                "list=" + list +
                '}';
    }
}
