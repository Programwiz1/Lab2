public class Pet {
    // Private data members
    private int PetID;
    private String name;
    private String Clientname;
    private String Petcolor;

    // Constructor
    public Pet(int PetID, String name, String Clientname, String Petcolor) {
        this.PetID = PetID;
        this.name = name;
        this.Clientname = Clientname;
        this.Petcolor = Petcolor;
    }


    // Getter for PetID
    public int getPetID() {
        return PetID;
    }

    // Setter for PetID
    public void setPetID(int PetID) {
        this.PetID = PetID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Clientname
    public String getClientname() {
        return Clientname;
    }

    // Setter for Clientname
    public void setClientname(String Clientname) {
        this.Clientname = Clientname;
    }

    // Getter for Petcolor
    public String getPetcolor() {
        return Petcolor;
    }

    // Setter for Petcolor
    public void setPetcolor(String Petcolor) {
        this.Petcolor = Petcolor;
    }

    public void removePet() {
        // Perform cleanup actions if necessary
        System.out.println("Removing pet with ID: " + this.PetID);
        
        // Reset fields or other cleanup actions
        this.PetID = 0;
        this.name = null;
        this.Clientname = null;
        this.Petcolor = null;
        
        System.out.println("Pet removed successfully.");
    }
}