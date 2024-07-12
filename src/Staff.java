public class Staff {
    // Private data members
    private int StaffID;
    private int StaffPhoneNum;
    private String StaffName;

    // Constructor
    public Staff(int StaffID, int StaffPhoneNum, String StaffName) {
        this.StaffID = StaffID;
        this.StaffPhoneNum = StaffPhoneNum;
        this.StaffName = StaffName;
    }



    // Getter for StaffID
    public int getStaffID() {
        return StaffID;
    }

    // Setter for StaffID
    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    // Getter for StaffPhoneNum
    public int getStaffPhoneNum() {
        return StaffPhoneNum;
    }

    // Setter for StaffPhoneNum
    public void setStaffPhoneNum(int StaffPhoneNum) {
        this.StaffPhoneNum = StaffPhoneNum;
    }

    // Getter for StaffName
    public String getStaffName() {
        return StaffName;
    }

    // Setter for StaffName
    public void setStaffName(String StaffName) {
        this.StaffName = StaffName;
    }
    
    //Update Phone Number
     public void updatePhoneNum(int newPhoneNum) {
        this.StaffPhoneNum = newPhoneNum;
        System.out.println("Staff phone number updated to: " + newPhoneNum);
    }

    // Method to simulate removing the staff
    public void removeStaff() {
        // Perform cleanup actions if necessary
        System.out.println("Removing staff with ID: " + this.StaffID);
        
        // Reset fields or other cleanup actions
        this.StaffID = 0;
        this.StaffPhoneNum = 0;
        this.StaffName = null;
        
        System.out.println("Staff removed successfully.");
    }
}