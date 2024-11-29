public class Flight {
    private String flightNumber;
    private String departure;
    private String destination;
    private double price;

    public Flight(String flightNumber, String departure, String destination, double price) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightDetails() {
        return "Flight: " + flightNumber + ", From: " + departure + ", To: " + destination + ", Price: $" + price;
    }
}
