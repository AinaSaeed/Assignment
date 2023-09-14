import java.util.ArrayList;

class Continent {
    private String continent_name;
    private long contient_population = 0;
    private ArrayList<Country> countries = new ArrayList<Country>();

    public Continent(String continent_name) {
        this.continent_name = continent_name;
    }

    public void calculate_population() {
        for (int i = 0; i < countries.size(); i++) {
            contient_population += countries.get(i).getcountry_population();
        }
    }

    public void setcountries(String[] countries_name, String continent) {
        for (int i = 0; i < countries_name.length; i++) {
            countries.add(new Country(countries_name[i], continent));
        }
    }

    public void set_cities_to_country(String[] cities, long[] cities_population, String contry_name) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getcountry_name().equals(contry_name)) {
                countries.get(i).setcities(cities, cities_population, contry_name);
            }
        }
    }

    public void set_capital(String country_name, String capital) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getcountry_name().equals(country_name)) {
                countries.get(i).setcapital(capital);
            }
        }
    }

    public long getcontinent_population() {
        return contient_population;
    }

    void display_data() {
        System.out.println("information of " + continent_name + " continent");
        System.out.println("__________________________________________");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println("country name :" + countries.get(i).getcountry_name());
            System.out.println("population\t" + countries.get(i).getcountry_population());
            System.out.println("capital city: " + countries.get(i).getcapital().getcity_name());
            System.out.println("no of cities in this country: " + countries.get(i).cities.size());
            for (int j = 0; j < countries.get(i).cities.size(); j++) {
                System.out.println(j+1 + " city :" + countries.get(i).cities.get(j).getcity_name() +
                        " population :" + countries.get(i).cities.get(j).getcity_population());
            }
            System.out.println("__________________________________________");
        }
    }

    public void search_city(String city_name) {
        for (int i = 0; i < countries.size(); i++) {
            for (int j = 0; j < countries.get(i).cities.size(); j++) {
                if (countries.get(i).cities.get(j).getcity_name().equals(city_name)) {
                    System.out.println("city found in continent:" + continent_name);
                    System.out.println("city name :" + city_name);
                    System.out.println("located in :" + countries.get(i).getcountry_name());
                    System.out.println("population :" + countries.get(i).cities.get(j).getcity_population());
                }
            }
        }
    }
}
