
public class City {

    private String city_name;
    private long population;
    private String country_name;

    public City(String city_name, long population, String country_name) {
        this.city_name = city_name;
        this.population = population;
        this.country_name = country_name;
    }

    public String getcity_name() {
        return city_name;
    }

    public String getcountry_name() {
        return country_name;
    }

    public long getcity_population() {
        return population;
    }
}

