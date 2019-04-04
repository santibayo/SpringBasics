package es.boalis.samples.springcontainer.impls;

import es.boalis.samples.springcontainer.Drink;
import es.boalis.samples.springcontainer.DrinkType;
import es.boalis.samples.springcontainer.interfaces.DrinkService;

public class AdvancedDrinkServiceImpl implements DrinkService {
    public Drink prepareDrink(DrinkType type, int subtype) {
        String strSubType = Integer.toString(subtype);
        if (type.equals(DrinkType.WITH_ALCOHOL)){
            Drink drink = new Drink(strSubType,true);
            return drink;
        }else{

            Drink drink = new Drink(strSubType,false);
            return drink;
        }
    }


}
