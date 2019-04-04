package es.boalis.samples.springcontainer;

import es.boalis.samples.springcontainer.impls.SimpleDrinkServiceImpl;
import es.boalis.samples.springcontainer.interfaces.DrinkService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;


@org.springframework.context.annotation.Configuration
@ComponentScan("es.boalis.samples.springcontainer.scan")
public class Configuration {

    @Bean(name="simpleDrinkService")
    @Description("This is a sample HelloWorld Bean")
    @Scope("prototype")
    public DrinkService simpleDrinkService() {
        return new SimpleDrinkServiceImpl();
    }



}
