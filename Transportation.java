

public class Transportation {
    private String type;
    private String companyName;
    private double price;

    public Transportation(String type, String companyName, double price) {
        this.type = type;
        this.companyName = companyName;
        this.price = price;
    }

    public String getTransportDetails() {
        return "Transportation: " + type + ", Company: " + companyName + ", Price: $" + price;
    }
}
