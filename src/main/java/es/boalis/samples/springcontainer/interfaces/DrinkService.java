package es.boalis.samples.springcontainer.interfaces;

import es.boalis.samples.springcontainer.Drink;
import es.boalis.samples.springcontainer.DrinkType;

public interface DrinkService {
    public Drink prepareDrink (DrinkType type, int subtype);
}
