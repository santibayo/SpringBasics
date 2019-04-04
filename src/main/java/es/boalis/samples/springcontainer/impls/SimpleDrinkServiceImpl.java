package es.boalis.samples.springcontainer.impls;

import es.boalis.samples.springcontainer.Drink;
import es.boalis.samples.springcontainer.DrinkType;
import es.boalis.samples.springcontainer.interfaces.DrinkService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleDrinkServiceImpl implements DrinkService, InitializingBean, DisposableBean {
    public Drink prepareDrink(DrinkType type, int subtype) {
        Drink drink = new Drink("1",true);
        return drink;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct");

    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre destroy");

    }


    public void destroy() throws Exception {
        System.out.println("destroying");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties");
    }
}
