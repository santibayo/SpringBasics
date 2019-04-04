package es.boalis.samples.springcontainer;

public class Drink {
    private String name;
    private boolean alcoholic;

    public Drink(String name, boolean alcoholic) {
        this.name = name;
        this.alcoholic = alcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
}
