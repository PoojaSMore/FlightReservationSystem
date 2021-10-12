package FlightReservationSystem;

public class RegularTicket extends Ticket{
    private String splServicesAvailed;

    //getter
    public String getSplServicesAvailed(){
        return splServicesAvailed;
    }
    //might need or not need setter

    public void updateSplServicesAvailed(String updateService){
        splServicesAvailed = updateService;
    }

    public RegularTicket(String pnr, String departureLocation, String arrivalLocation, Flight flight,
                         String departureDateTime, String arrivalDateTime, Passenger passenger, int seatNo,
                         int price, boolean ticketStatus, String splServicesAvailed, String journeyDuration){

        super(pnr, departureLocation, arrivalLocation, flight, departureDateTime, arrivalDateTime, passenger,
                seatNo, price, ticketStatus, journeyDuration);

        this.splServicesAvailed = splServicesAvailed;
    }
}
