
import java.util.Scanner;

public class TravelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();

        // Sample Data
        Flight flight = new Flight("AB123", "New York", "London", 500);
        Hotel hotel = new Hotel("Grand Palace", "London", 150);
        Transportation transport = new Transportation("Car Rental", "Hertz", 50);

        System.out.println("Welcome to the Travel Booking System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Book Flight");
            System.out.println("2. Book Hotel");
            System.out.println("3. Book Transportation");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookingService.addBooking(flight.getFlightDetails());
                    break;
                case 2:
                    bookingService.addBooking(hotel.getHotelDetails());
                    break;
                case 3:
                    bookingService.addBooking(transport.getTransportDetails());
                    break;
                case 4:
                    bookingService.viewBookings();
                    break;
                case 5:
                    System.out.println("Thank you for using the Travel Booking System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
