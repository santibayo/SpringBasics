package es.boalis.samples.springcontainer.scan;

import es.boalis.samples.springcontainer.Drink;
import es.boalis.samples.springcontainer.DrinkType;
import es.boalis.samples.springcontainer.interfaces.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
@Qualifier("mockDrinkServer")
public class DrinkServer {

    @Autowired
    DrinkService drinkService;


    public Drink prepareMojito(){
        return drinkService.prepareDrink(DrinkType.WITH_ALCOHOL,18);
    }


}
