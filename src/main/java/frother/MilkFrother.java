package frother;

import fasada2.MilkIngredient;

public class MilkFrother {

    public FoamedMilkIngredient froth(Object MilkIngredient) throws MilkFrotherException {
        if(Math.random() > 0.8){
            throw new MilkFrotherException();
        }
        return new FoamedMilkIngredient();
    }
}
