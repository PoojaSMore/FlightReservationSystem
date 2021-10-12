package FlightReservationSystem;

public class Passenger {
    private static int idCounter;
    private int id;
    private Address address;
    private Contact contact;

    // Address class starts here...
    private static class Address{
        private String street, city, state;
        public Address(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public void updateAddressDetails(String updateStreet, String updateCity, String updateState){
            this.street = updateStreet;
            this.city = updateCity;
            this.state = updateState;
            System.out.println("The updated details are: Street: "+street+", City: "+city+", State: "+state);
        }
    }
    // ...Address class ends here.
    // Contact class starts here...
    private static class Contact {
        private String name, ph_no, email;

        public Contact(String name, String ph_no, String email){
            this.name = name;
            this.ph_no = ph_no;
            this.email = email;
        }

        public void updateContactDetails( String updateName, String updatePhone, String updateEmail){
            this.name = updateName;
            this.ph_no = updatePhone;
            this.email = updateEmail;
            System.out.println("The updated details are: Name: "+name+", Phone on.: "+ph_no+", State: "+email);
        }
    }
    // ... Contact class ends here.

    // methods and constructor of Passenger class:
    public Passenger(String name, String ph_no, String email, String street, String city, String state){
        this.id = idCounter++;
        this.contact = new Contact(name, ph_no, email);
        this.address = new Address(street, city, state);
    }

    public int getPassengerCount(){
        return idCounter;
    }
    public Address getAddress(){
        return address;
    }
    public Contact getContact(){
        return contact;
    }

    public String getAddressDetails(){
        return "Street: "+address.street+", City: "+address.city+", State: "+address.state+".";
    }
    public String getContactDetails(){
        return "Name: "+contact.name+", Phone no.: "+contact.ph_no+", email ID: "+contact.email+".";
    }

}
