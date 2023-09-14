public class Main {
    public static void main(String[] args) {
        Continent C1 = new Continent("Asia");

        String[] contries = {"pakistan", "India"};
        C1.setcountries(contries, "Asia");

        String[] pak_cities = {"hyderabad", "karachi", "golarchi", "islamabad"};
        long[] cities_population = {200, 400, 100, 1000};
        C1.set_cities_to_country(pak_cities, cities_population, "pakistan");
        C1.set_capital("pakistan", "islamabad");

        String[] india_cities = {"Dehli", "bombay", "kolkata", "chennai"};
        long[] cities_Population = {2500, 2000, 1000, 500};
        C1.set_cities_to_country(india_cities, cities_Population, "India");
        C1.calculate_population();
        C1.set_capital("India", "Dehli");
        System.out.println("continent population :" + C1.getcontinent_population());
        C1.display_data();
        C1.search_city("bombay");
    }
}

