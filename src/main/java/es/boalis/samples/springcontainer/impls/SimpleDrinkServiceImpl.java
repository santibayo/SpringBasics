package es.boalis.samples.springcontainer.impls;

import es.boalis.samples.springcontainer.Drink;
import es.boalis.samples.springcontainer.DrinkType;
import es.boalis.samples.springcontainer.interfaces.DrinkService;

public class SimpleDrinkServiceImpl implements DrinkService {
    public Drink prepareDrink(DrinkType type, int subtype) {
        Drink drink = new Drink("1",true);
        return drink;
    }


}
