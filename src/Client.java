public class Client {
    // Private data members
    private int ClientID;
    private String ClientName;
    private int ClientPhoneNum;
    private int ClientPetId;

    // Constructor
    public Client(int ClientID, String ClientName, int ClientPhoneNum, int ClientPetId) {
        this.ClientID = ClientID;
        this.ClientName = ClientName;
        this.ClientPhoneNum = ClientPhoneNum;
        this.ClientPetId = ClientPetId;
    }


    // Getter for ClientID
    public int getClientID() {
        return ClientID;
    }

    // Setter for ClientID
    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

    // Getter for ClientName
    public String getClientName() {
        return ClientName;
    }

    // Setter for ClientName
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    // Getter for ClientPhoneNum
    public int getClientPhoneNum() {
        return ClientPhoneNum;
    }

    // Setter for ClientPhoneNum
    public void setClientPhoneNum(int ClientPhoneNum) {
        this.ClientPhoneNum = ClientPhoneNum;
    }

    // Getter for ClientPetId
    public int getClientPetId() {
        return ClientPetId;
    }

    // Setter for ClientPetId
    public void setClientPetId(int ClientPetId) {
        this.ClientPetId = ClientPetId;
    }
    
    //Update Phone Number
    public void updatePhoneNum(int newPhoneNum) {
        this.ClientPhoneNum = newPhoneNum;
        System.out.println("Client phone number updated to: " + newPhoneNum);
    }

    // Method to simulate removing the client
    public void removeClient() {
        // Perform cleanup actions if necessary
        System.out.println("Removing client with ID: " + this.ClientID);
        
        // Reset fields or other cleanup actions
        this.ClientID = 0;
        this.ClientName = null;
        this.ClientPhoneNum = 0;
        this.ClientPetId = 0;
        
        System.out.println("Client removed successfully.");
    }
}