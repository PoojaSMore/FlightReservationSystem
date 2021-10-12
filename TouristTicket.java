package FlightReservationSystem;

public class TouristTicket extends Ticket{
    private int index=0;
    private String[] selectedLocations = new String[5];
    private String hotelAddress;

    public void getTouristLocations(){
        System.out.println(selectedLocations);
    }
    //might need or not need setter

    public void addTouristLocation(String selectedTouristLocation){
        selectedLocations[index] = selectedTouristLocation;
        index++;
    }
    public void removeTouristLocation(int locationIndex){
        selectedLocations[locationIndex]=null;
        System.out.println(selectedLocations);
    }

    public TouristTicket(String pnr, String departureLocation, String arrivalLocation, Flight flight,
                         String departureDateTime, String arrivalDateTime, Passenger passenger, int seatNo, int price,
                         boolean ticketStatus, String hotelAddress,String[] selectedLocations, String journeyDuration){

        super(pnr,departureLocation, arrivalLocation, flight, departureDateTime, arrivalDateTime, passenger,
                seatNo, price, ticketStatus, journeyDuration);

        this.hotelAddress = hotelAddress;
        this.selectedLocations = selectedLocations;
    }

    public String[] getSelectedLocations() {
        return selectedLocations;
    }

    public void setSelectedLocations(String[] selectedLocations) {
        this.selectedLocations = selectedLocations;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
