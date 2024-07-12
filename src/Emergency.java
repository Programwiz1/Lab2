public class Emergency {
    // Private data members
    private int EmergencyNum;
    private String EmergencyEmail;

    // Constructor
    public Emergency(int EmergencyNum, String EmergencyEmail) {
        this.EmergencyNum = EmergencyNum;
        this.EmergencyEmail = EmergencyEmail;
    }

    // Getter for EmergencyNum
    public int getEmergencyNum() {
        return EmergencyNum;
    }

    // Setter for EmergencyNum
    public void setEmergencyNum(int EmergencyNum) {
        this.EmergencyNum = EmergencyNum;
    }

    // Getter for EmergencyEmail
    public String getEmergencyEmail() {
        return EmergencyEmail;
    }

    // Setter for EmergencyEmail
    public void setEmergencyEmail(String EmergencyEmail) {
        this.EmergencyEmail = EmergencyEmail;
    }

    // Additional member functions

    // Method to change the emergency number
    public void changeEmergencyNum(int newEmergencyNum) {
        this.EmergencyNum = newEmergencyNum;
        System.out.println("Emergency number updated to: " + newEmergencyNum);
    }

    // Method to change the emergency email
    public void changeEmergencyEmail(String newEmergencyEmail) {
        this.EmergencyEmail = newEmergencyEmail;
        System.out.println("Emergency email updated to: " + newEmergencyEmail);
    }


}
