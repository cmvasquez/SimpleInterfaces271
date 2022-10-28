/**
 * Class City to create cities using interfaces and print information about them
 * Created by Christian Vasquez
 */
public class City
        extends Place
        implements Local, Statistical, Transportation {

    // name of city
    private String name;

    // type of climate
    private String climate;

    // amount of people in city
    private int population;

    // does the city have an Airport?
    private boolean hasAirport;

    // name of the airport
    private String nameOfAirport;

    // does the city have a harbor?
    private boolean hasHarbor;

    // name of the harbor
    private String nameOfHarbor;

    // does the city have a train station?
    private boolean hasTrainStation;

    // name of the train station
    private String nameOfTrainStation;

    // does the city have a bus service?
    private boolean hasBusService;

    // does the city have a subway network?
    private boolean hasSubwayNetwork;


    // method describeClimate prints information about the climate of the city you specify
    public String describeClimate() {
        // print the climate
        System.out.println("The climate of " + name + " is " + climate + ".");
        return climate;
    } // method describeClimate

    // method population prints the population of the city you specify
    public int population() {
        // print the population
        System.out.println("The population of " + name + " is " + population + ", as of 2022.");
        return population;
    } // method population

    // method hasAirport tells you if your city has an airport or not.
    public boolean hasAirport() {
        // if there is no airport
        if (!hasAirport)
            System.out.println("There is no airport in" + name + ".");
        // if there is an airport
        else
            System.out.println(name + " has an airport!");
        return hasAirport;
    } // method hasAirport

    // method nameOfAirport tells you the name of the airport in your city, or tells you if there is no airport.
    public String nameOfAirport() {
        // if there is no airport
        if (!hasAirport)
            System.out.println("There is no airport in" + name + ".");
        // if there is an airport
        else
            System.out.println("The name of the airport in " + name + " is " + nameOfAirport + ".");
        return nameOfAirport;
    } // method nameOfAirport

    // method hasHarbor tells you if your city has a harbor or not.
    public boolean hasHarbor() {
        // if there is no harbor
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        // if there is a harbor
        else
            System.out.println(name + " has a harbor!");
        return hasHarbor;
    } // method hasHarbor

    public String nameOfHarbor() {
        // if there is no harbor
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        // if there is a harbor
        else
            System.out.println("The name of the harbor in " + name + " is " + nameOfHarbor + ".");
        return nameOfHarbor;
    } // method nameOfHarbor

    // method hasTrainStation tells you if your city has a train station or not.
    public boolean hasTrainStation() {
        // if there is no train station
        if (!hasTrainStation)
            System.out.println("There is no train station in " + name + ".");
        // if there is a train station
        else
            System.out.println(name + " has a train station!");
        return hasTrainStation;
    } // method hasTrainStation

    public String nameOfTrainStation() {
        // if there is no train station
        if (!hasTrainStation)
            System.out.println("There is no train station in " + name + ".");
        // if there is a train station
        else
            System.out.println("The name of the train station in " + name + " is " + nameOfTrainStation + ".");
        return nameOfTrainStation;
    } // method nameOfTrainStation

    // method hasBusService tells you if your city has a bus service or not.
    public boolean hasBusService() {
        // if there is no bus service
        if (!hasBusService)
            System.out.println("There is no bus service in " + name + ".");
        // if there is a bus service
        else
            System.out.println(name + " has a bus service!");
        return hasBusService;
    } // method hasBusService

    // method hasSubwayNetwork tells you if your city has a subway network or not.
    public boolean hasSubwayNetwork() {
        // if there is no subway network
        if (!hasSubwayNetwork)
            System.out.println("There is no subway network in " + name + ".");
        // if there is a subway network
        else
            System.out.println(name + " has a subway network!");
        return hasSubwayNetwork;
    } // method hasSubwayNetwork

    // method describeCity is called to print statements about the created city
    public void describeCity() {
        System.out.println("Here is some information about " + name + ":\n");
        describeClimate();
        population();
        nameOfAirport();
        nameOfTrainStation();
        nameOfHarbor();
        hasSubwayNetwork();
        hasBusService();
        System.out.println("\n");
    } // method describeCity

    // method main is used for testing and city creation
    public static void main(String[] args) {
        // making a new city, Dallas, and applying attributes to the city
        City Dallas = new City();
        Dallas.name = "Dallas";
        Dallas.hasAirport = true;
        Dallas.nameOfAirport = "DFW";
        Dallas.hasSubwayNetwork = false;
        Dallas.hasTrainStation = true;
        Dallas.nameOfTrainStation = "DART";
        Dallas.hasHarbor = false;
        Dallas.hasBusService = true;
        Dallas.climate = "hot in the summer, warm in the winter";
        Dallas.population = 1288000;
        Dallas.setLongitude(32.7767);
        Dallas.setLatitude(96.7970);
        Dallas.setElevation(430);

        // making a new city, Chicago, and applying attributes to the city
        City Chicago = new City();
        Chicago.name = "Chicago";
        Chicago.hasAirport = true;
        Chicago.nameOfAirport = "ORD";
        Chicago.hasSubwayNetwork = false;
        Chicago.hasTrainStation = true;
        Chicago.nameOfTrainStation = "The El";
        Chicago.hasHarbor = false;
        Chicago.hasBusService = true;
        Chicago.climate = "warm in the summer, very cold in the winter";
        Chicago.population = 2697000;
        Chicago.setLongitude(41.8781);
        Chicago.setLatitude(87.6298);
        Chicago.setElevation(597);

        // testing below
        Dallas.describeCity();
        Chicago.describeCity();

    } // method main
    // Populate this class with the fields and the methods necessary to
    // fulfill the implemented interfaces.

}  // class City