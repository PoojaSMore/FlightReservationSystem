package FlightReservationSystem;

public abstract class Ticket {
    private int ticketPrice, seatNumber;
    private String pnr,departureLocation, arrivalLocation;
    private String dateTimeDeparture, dateTimeArrival, journeyDuration;
    private boolean ticketStatus;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String departureLocation, String arrivalLocation, Flight flight,
                  String departureDateTime, String arrivalDateTime, Passenger passenger, int seatNo,
                  int price, boolean ticketStatus, String journeyDuration){
        this.pnr = pnr;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.flight = flight;
        this.dateTimeDeparture = departureDateTime;
        this.dateTimeArrival = arrivalDateTime;
        this.passenger = passenger;
        this.seatNumber = seatNo;
        this.ticketPrice = price;
        this.ticketStatus = ticketStatus;
        this.journeyDuration = journeyDuration;
    }

    public String cancelTicket(String pnr){
        this.pnr = pnr;
        ticketStatus = false;
        return "Ticket cancelled! with PNR number: "+pnr;
    }

    public void ticketStatus(){
        System.out.println("Ticket Booked: "+ticketStatus);
    }

    public void passengerDetails(){
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
    }
    //might need or not need setter

    //Getter and Setters :
    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDateTimeDeparture() {
        return dateTimeDeparture;
    }

    public void setDateTimeDeparture(String dateTimeDeparture) {
        this.dateTimeDeparture = dateTimeDeparture;
    }

    public String getDateTimeArrival() {
        return dateTimeArrival;
    }

    public void setDateTimeArrival(String dateTimeArrival) {
        this.dateTimeArrival = dateTimeArrival;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getJourneyDuration() {
        return journeyDuration;
    }

    public void setJourneyDuration(String journeyDuration) {
        this.journeyDuration = journeyDuration;
    }
}
