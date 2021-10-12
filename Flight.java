package FlightReservationSystem;

public class Flight {
    private int flightNumber, flightCapacity, noOfSeatsBooked;
    private String flightAirline;

    public Flight(int flightNumber, String flightAirline, int flightCapacity, int noOfSeatsBooked){
        this.flightNumber = flightNumber;
        this.flightAirline = flightAirline;
        this.flightCapacity = flightCapacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
    }

    public String getFlightDetails(){
        return "Flight no.: "+flightNumber+", Flight Airline: "+flightAirline+
                ", Flight Capacity: "+flightCapacity+", No. of seats booked: "+noOfSeatsBooked+".";

    }
    //might need or not need setter
    public void checkAvailability(){
        int availableSeats = flightCapacity - noOfSeatsBooked;
        System.out.println("Available Seats: "+availableSeats);
    }
    public void updateNumofSeatsBooked(){
        noOfSeatsBooked++;
    }

}
