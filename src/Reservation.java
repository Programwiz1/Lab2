public class Reservation {
    // Private data members
    private String ClientName;
    private int ReservationDate;
    private String location;
    private int ClientPhoneNum;

    // Constructor
    public Reservation(String ClientName, int ReservationDate, String location, int ClientPhoneNum) {
        this.ClientName = ClientName;
        this.ReservationDate = ReservationDate;
        this.location = location;
        this.ClientPhoneNum = ClientPhoneNum;
    }


    // Getter for ClientName
    public String getClientName() {
        return ClientName;
    }

    // Setter for ClientName
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    // Getter for ReservationDate
    public int getReservationDate() {
        return ReservationDate;
    }

    // Setter for ReservationDate
    public void setReservationDate(int ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for ClientPhoneNum
    public int getClientPhoneNum() {
        return ClientPhoneNum;
    }

    // Setter for ClientPhoneNum
    public void setClientPhoneNum(int ClientPhoneNum) {
        this.ClientPhoneNum = ClientPhoneNum;
    }
    
    //updating phone number
    public void updatePhoneNum(int newPhoneNum) {
        this.ClientPhoneNum = newPhoneNum;
        System.out.println("Client phone number updated to: " + newPhoneNum);
    }
    //For Changing Reservation Date
    public void changeReservationDate(int newReservationDate) {
        this.ReservationDate = newReservationDate;
        System.out.println("Reservation date updated to: " + newReservationDate);
    }

    // Method to simulate removing the reservation
    public void removeReservation() {
        // Perform cleanup actions if necessary
        System.out.println("Removing reservation for client: " + this.ClientName);
        
        // Reset fields or other cleanup actions
        this.ClientName = null;
        this.ReservationDate = 0;
        this.location = null;
        this.ClientPhoneNum = 0;
        
        System.out.println("Reservation removed successfully.");
    }
}
