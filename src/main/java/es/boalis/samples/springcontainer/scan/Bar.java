package es.boalis.samples.springcontainer.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bar")
@Qualifier("barNormal")
public class Bar {

    @Autowired
    @Qualifier("mockDrinkServer")
    DrinkServer drinkServer;

    public void serveDrink(){
        System.out.println("bar is being served by : "+drinkServer.toString());
    }
}
