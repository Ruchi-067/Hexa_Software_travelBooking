
public class Hotel {
    private String name;
    private String location;
    private double pricePerNight;

    public Hotel(String name, String location, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
    }

    public String getHotelDetails() {
        return "Hotel: " + name + ", Location: " + location + ", Price per Night: $" + pricePerNight;
    }
}
