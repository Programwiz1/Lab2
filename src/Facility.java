public class Facility {
    // Private data members
    private String Location;
    private int NumClients;
    private int NumPets;

    // Constructor
    public Facility(String Location, int NumClients, int NumPets) {
        this.Location = Location;
        this.NumClients = NumClients;
        this.NumPets = NumPets;
    }

    // Getter for Location
    public String getLocation() {
        return Location;
    }

    // Setter for Location
    public void setLocation(String Location) {
        this.Location = Location;
    }

    // Getter for NumClients
    public int getNumClients() {
        return NumClients;
    }

    // Setter for NumClients
    public void setNumClients(int NumClients) {
        this.NumClients = NumClients;
    }

    // Getter for NumPets
    public int getNumPets() {
        return NumPets;
    }

    // Setter for NumPets
    public void setNumPets(int NumPets) {
        this.NumPets = NumPets;
    }

    // Method to change the number of clients
    public void changeNumClients(int newNumClients) {
        this.NumClients = newNumClients;
        System.out.println("Number of clients updated to: " + newNumClients);
    }

    // Method to change the number of pets
    public void changeNumPets(int newNumPets) {
        this.NumPets = newNumPets;
        System.out.println("Number of pets updated to: " + newNumPets);
    }

    // Method to change the location
    public void changeLoc(String newLocation) {
        this.Location = newLocation;
        System.out.println("Location updated to: " + newLocation);
    }


}
