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
    public String describeClimate() {
        System.out.println("The climate of " + name + " is " + climate + ".");
        return climate;
    } // method describeClimate

    public int population() {
        System.out.println("The population of " + name + " is " + population + ", as of 2022.");
        return population;
    } // method population

    public boolean hasAirport() {
        if (!hasAirport)
            System.out.println("There is no airport in" + name + ".");
        else
            System.out.println(name + " has an airport!");
        return hasAirport;
    } // method hasAirport

    public String nameOfAirport() {
        if (!hasAirport)
            System.out.println("There is no airport in" + name + ".");
        else
            System.out.println("The name of the airport in " + name + " is " + nameOfAirport + ".");
        return nameOfAirport;
    } // method nameOfAirport

    public boolean hasHarbor() {
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        else
            System.out.println(name + " has a harbor!");
        return hasHarbor;
    } // method hasHarbor

    public String nameOfHarbor() {
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        else
            System.out.println("The name of the harbor in " + name + " is " + nameOfHarbor + ".");
        return nameOfHarbor;
    } // method nameOfHarbor

    public boolean hasTrainStation() {
        if (!hasTrainStation)
            System.out.println("There is no train station in " + name + ".");
        else
            System.out.println(name + " has a train station!");
        return hasTrainStation;
    } // method hasTrainStation

    public String nameOfTrainStation() {
        if (!hasTrainStation)
            System.out.println("There is no train station in " + name + ".");
        else
            System.out.println("The name of the train station in " + name + " is " + nameOfTrainStation + ".");
        return nameOfTrainStation;
    } // method nameOfTrainStation

    public boolean hasBusService() {
        if (!hasBusService)
            System.out.println("There is no bus service in " + name + ".");
        else
            System.out.println(name + " has a bus service!");
        return hasBusService;
    } // method hasBusService

    public boolean hasSubwayNetwork() {
        if (!hasSubwayNetwork)
            System.out.println("There is no subway network in " + name + ".");
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