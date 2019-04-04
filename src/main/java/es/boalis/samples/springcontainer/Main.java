package es.boalis.samples.springcontainer;

import es.boalis.samples.springcontainer.interfaces.DrinkService;
import es.boalis.samples.springcontainer.scan.Bar;
import es.boalis.samples.springcontainer.scan.DrinkServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public Main() {
    }

    // ciclos de vida
    // https://howtodoinjava.com/spring-core/spring-bean-life-cycle/

    // anotaciones
    // https://www.baeldung.com/spring-bean-annotations a

    // scopes
    // https://howtodoinjava.com/spring-core/spring-bean-scopes/

    public static void main (String ... args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        DrinkService service = (DrinkService)context.getBean("simpleDrinkService");
        System.out.println(service.toString());
        DrinkServer server = (DrinkServer)context.getBean(DrinkServer.class);
        System.out.println(server.toString());
        Bar bar = (Bar)context.getBean("bar");
        bar.serveDrink();
        context.destroy();
    }
}
