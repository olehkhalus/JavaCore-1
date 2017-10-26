package homework3;

public class Country {
    private String name;
    private Enum.Continents continents;

    public void setName(String name) {
        this.name = name;
    }

    public Enum.Continents getContinents() {
        return continents;
    }

    public void setContinents(Enum.Continents continents) {
        this.continents = continents;
    }

    public String getName() {
        return name;
    }

}
