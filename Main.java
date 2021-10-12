package FlightReservationSystem;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(123,"Air India",120,68);

        Passenger passenger = new Passenger("Pooja","+91 9786453120","pooja@mail.com",
                                            "MG Road","Mumbai","Maharashtra");

        // creating regularTicket and touristTicket objects (as mentioned in Project Checkpoints).
        RegularTicket regularTicket = new RegularTicket("A001","Mumbai","Delhi",flight,
                "20/10/2021 - 10:50 pm IST","21/10/2021 - 01:50 am IST",passenger,056
        ,230000, true, "Food", "3H");

        TouristTicket touristTicket = new TouristTicket("A002","Pune","Goa", flight,
                "22/10/2021 - 08:30 am IST","22/10/2021 - 10:00 am IST", passenger, 011,
                25000, true, "Hotel Kohinoor",new String[]{"a","b","c","d"}, "1H 30M");

        //printing ticket details (as mentioned in Project Checkpoints).
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

        //testing methods:
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getPassengerCount());

        System.out.println(flight.getFlightDetails());
        flight.checkAvailability();

        regularTicket.ticketStatus();
        System.out.println(regularTicket.getSplServicesAvailed());
        System.out.println(regularTicket.getJourneyDuration());

        System.out.println(Arrays.toString(touristTicket.getSelectedLocations()));
        System.out.println(touristTicket.getHotelAddress());

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
