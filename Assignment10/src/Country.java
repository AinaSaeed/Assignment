import java.util.ArrayList;

class Country {
    private String country_name;
    private long country_population = 0;
    private City capital;
    private String continent;
    ArrayList<City> cities = new ArrayList<City>();

    public Country(String country_name, String continent) {
        this.country_name = country_name;
        this.continent = continent;
    }

    public void setcapital(String capital) {
        for (City city : cities) {
            if (city.getcity_name().equals(capital)) {
                this.capital = city;
            }
        }
    }

    public void setcities(String[] cities, long[] cities_population, String country_name) {

        for (int i = 0; i < cities.length; i++) {
            this.cities.add(new City(cities[i], cities_population[i], country_name));

        }
        set_country_population();
    }

    public void set_country_population() {
        for (int i = 0; i < cities.size(); i++) {
            country_population += cities.get(i).getcity_population();
        }
    }

    public String getcountry_name() {
        return country_name;
    }

    public long getcountry_population() {
        return country_population;
    }

    public String getcontinent() {
        return continent;
    }

    public City getcapital() {
        return capital;
    }

}

