public class MedicalRecords {
    // Private data members
    private int PetID;
    private int recordID;
    private String HealthDescription;

    // Constructor
    public MedicalRecords(int PetID, int recordID, String HealthDescription) {
        this.PetID = PetID;
        this.recordID = recordID;
        this.HealthDescription = HealthDescription;
    }

    // Default Constructor
    public MedicalRecords() {
    }

    // Getter for PetID
    public int getPetID() {
        return PetID;
    }

    // Setter for PetID
    public void setPetID(int PetID) {
        this.PetID = PetID;
    }

    // Getter for recordID
    public int getRecordID() {
        return recordID;
    }

    // Setter for recordID
    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    // Getter for HealthDescription
    public String getHealthDescription() {
        return HealthDescription;
    }

    // Setter for HealthDescription
    public void setHealthDescription(String HealthDescription) {
        this.HealthDescription = HealthDescription;
    }

    // Method to change the health description
    public void changeDescription(String newDescription) {
        this.HealthDescription = newDescription;
        System.out.println("Health description updated to: " + newDescription);
    }

    // Method to simulate removing the medical record
    public void removeRecord() {
        // Perform cleanup actions if necessary
        System.out.println("Removing medical record with ID: " + this.recordID);
        
        // Reset fields or other cleanup actions
        this.PetID = 0;
        this.recordID = 0;
        this.HealthDescription = null;
        
        System.out.println("Medical record removed successfully.");
    }
}
