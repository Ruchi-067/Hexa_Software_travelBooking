
import java.util.ArrayList;

public class BookingService {
    private ArrayList<String> bookings = new ArrayList<>();

    public void addBooking(String bookingDetails) {
        bookings.add(bookingDetails);
        System.out.println("Booking added: " + bookingDetails);
    }

    public void viewBookings() {
        System.out.println("\nYour Bookings:");
        for (String booking : bookings) {
            System.out.println(booking);
        }
    }
}
