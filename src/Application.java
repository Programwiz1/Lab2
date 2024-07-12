public class Application {

    public static void main(String[] args) {
        // Example usage of classes
        Pet pet1 = new Pet(1, "Fluffy", "Alice", "White");
        Client client1 = new Client(1, "Alice", 123456789, 1);
        Staff staff1 = new Staff(1, 987654321, "John Doe");
        Reservation reservation1 = new Reservation("Alice", 20230711, "Park", 123456789);
        Payment payment1 = new Payment(100, 1, "Credit Card");
        MedicalRecords medicalRecords1 = new MedicalRecords(1, 1, "Healthy and active.");
        Facility facility1 = new Facility("Main Street", 50, 100);
        Emergency emergency1 = new Emergency(911, "johnParker2@gmail.com");

        // Example of changing data
        pet1.setPetcolor("Brown");
        client1.setClientPhoneNum(987654321);
        staff1.updatePhoneNum(123456789);
        reservation1.changeReservationDate(20230712);
        payment1.applyDiscount(10);
        medicalRecords1.changeDescription("Routine checkup, all good.");
        facility1.changeNumClients(55);
        facility1.changeNumPets(110);
        emergency1.changeEmergencyNum(999);
        emergency1.changeEmergencyEmail("MonilPatel23@gmail.com");

        // Example of accessing data
        System.out.println("Pet: " + pet1.getName() + ", Color: " + pet1.getPetcolor());
        System.out.println("Client: " + client1.getClientName() + ", Phone: " + client1.getClientPhoneNum());
        System.out.println("Staff: " + staff1.getStaffName() + ", Phone: " + staff1.getStaffPhoneNum());
        System.out.println("Reservation: " + reservation1.getClientName() + ", Date: " + reservation1.getReservationDate());
        System.out.println("Payment: $" + payment1.getBillPayment() + ", Method: " + payment1.getPayMethod());
        System.out.println("Medical Records: " + medicalRecords1.getHealthDescription());
        System.out.println("Facility: Location: " + facility1.getLocation() + ", Clients: " + facility1.getNumClients() + ", Pets: " + facility1.getNumPets());
        System.out.println("Emergency: Number: " + emergency1.getEmergencyNum() + ", Email: " + emergency1.getEmergencyEmail());
    }

    // Static inner classes

    public static class Client {
        private int ClientID;
        private String ClientName;
        private int ClientPhoneNum;
        private int ClientPetId;

        public Client(int ClientID, String ClientName, int ClientPhoneNum, int ClientPetId) {
            this.ClientID = ClientID;
            this.ClientName = ClientName;
            this.ClientPhoneNum = ClientPhoneNum;
            this.ClientPetId = ClientPetId;
        }

        public int getClientID() {
            return ClientID;
        }

        public void setClientID(int ClientID) {
            this.ClientID = ClientID;
        }

        public String getClientName() {
            return ClientName;
        }

        public void setClientName(String ClientName) {
            this.ClientName = ClientName;
        }

        public int getClientPhoneNum() {
            return ClientPhoneNum;
        }

        public void setClientPhoneNum(int ClientPhoneNum) {
            this.ClientPhoneNum = ClientPhoneNum;
        }

        public int getClientPetId() {
            return ClientPetId;
        }

        public void setClientPetId(int ClientPetId) {
            this.ClientPetId = ClientPetId;
        }

        public void updatePhoneNum(int newPhoneNum) {
            this.ClientPhoneNum = newPhoneNum;
            System.out.println("Client phone number updated to: " + newPhoneNum);
        }

        public void removeClient() {
            System.out.println("Removing client with ID: " + this.ClientID);
            this.ClientID = 0;
            this.ClientName = null;
            this.ClientPhoneNum = 0;
            this.ClientPetId = 0;
            System.out.println("Client removed successfully.");
        }
    }

    public static class Emergency {
        private int EmergencyNum;
        private String EmergencyEmail;

        public Emergency(int EmergencyNum, String EmergencyEmail) {
            this.EmergencyNum = EmergencyNum;
            this.EmergencyEmail = EmergencyEmail;
        }

        public int getEmergencyNum() {
            return EmergencyNum;
        }

        public void setEmergencyNum(int EmergencyNum) {
            this.EmergencyNum = EmergencyNum;
        }

        public String getEmergencyEmail() {
            return EmergencyEmail;
        }

        public void setEmergencyEmail(String EmergencyEmail) {
            this.EmergencyEmail = EmergencyEmail;
        }

        public void changeEmergencyNum(int newEmergencyNum) {
            this.EmergencyNum = newEmergencyNum;
            System.out.println("Emergency number updated to: " + newEmergencyNum);
        }

        public void changeEmergencyEmail(String newEmergencyEmail) {
            this.EmergencyEmail = newEmergencyEmail;
            System.out.println("Emergency email updated to: " + newEmergencyEmail);
        }
    }

    public static class Facility {
        private String Location;
        private int NumClients;
        private int NumPets;

        public Facility(String Location, int NumClients, int NumPets) {
            this.Location = Location;
            this.NumClients = NumClients;
            this.NumPets = NumPets;
        }

        public String getLocation() {
            return Location;
        }

        public void setLocation(String Location) {
            this.Location = Location;
        }

        public int getNumClients() {
            return NumClients;
        }

        public void setNumClients(int NumClients) {
            this.NumClients = NumClients;
        }

        public int getNumPets() {
            return NumPets;
        }

        public void setNumPets(int NumPets) {
            this.NumPets = NumPets;
        }

        public void changeNumClients(int newNumClients) {
            this.NumClients = newNumClients;
            System.out.println("Number of clients updated to: " + newNumClients);
        }

        public void changeNumPets(int newNumPets) {
            this.NumPets = newNumPets;
            System.out.println("Number of pets updated to: " + newNumPets);
        }
    }

    public static class MedicalRecords {
        private int PetID;
        private int recordID;
        private String HealthDescription;

        public MedicalRecords(int PetID, int recordID, String HealthDescription) {
            this.PetID = PetID;
            this.recordID = recordID;
            this.HealthDescription = HealthDescription;
        }

        public int getPetID() {
            return PetID;
        }

        public void setPetID(int PetID) {
            this.PetID = PetID;
        }

        public int getRecordID() {
            return recordID;
        }

        public void setRecordID(int recordID) {
            this.recordID = recordID;
        }

        public String getHealthDescription() {
            return HealthDescription;
        }

        public void setHealthDescription(String HealthDescription) {
            this.HealthDescription = HealthDescription;
        }

        public void changeDescription(String newDescription) {
            this.HealthDescription = newDescription;
            System.out.println("Health description updated to: " + newDescription);
        }

        public void removeRecord() {
            System.out.println("Removing medical record with ID: " + this.recordID);
            this.PetID = 0;
            this.recordID = 0;
            this.HealthDescription = null;
            System.out.println("Medical record removed successfully.");
        }
    }

    public static class Payment {
        private int BillPayment;
        private int ClientID;
        private String PayMethod;

        public Payment(int BillPayment, int ClientID, String PayMethod) {
            this.BillPayment = BillPayment;
            this.ClientID = ClientID;
            this.PayMethod = PayMethod;
        }

        public int getBillPayment() {
            return BillPayment;
        }

        public void setBillPayment(int BillPayment) {
            this.BillPayment = BillPayment;
        }

        public int getClientID() {
            return ClientID;
        }

        public void setClientID(int ClientID) {
            this.ClientID = ClientID;
        }

        public String getPayMethod() {
            return PayMethod;
        }

        public void setPayMethod(String PayMethod) {
            this.PayMethod = PayMethod;
        }

        public void applyDiscount(double discountPercentage) {
            if (discountPercentage > 0 && discountPercentage <= 100) {
                double discountAmount = (BillPayment * discountPercentage) / 100;
                this.BillPayment -= discountAmount;
                System.out.println("Discount applied: " + discountAmount + ". New Bill Payment: " + this.BillPayment);
            } else {
                System.out.println("Invalid discount percentage.");
            }
        }

        public void changePaymentMethod(String newPayMethod) {
            this.PayMethod = newPayMethod;
            System.out.println("Payment method changed to: " + newPayMethod);
        }

        public void removePayment() {
            System.out.println("Removing payment for client ID: " + this.ClientID);
            this.BillPayment = 0;
            this.ClientID = 0;
            this.PayMethod = null;
            System.out.println("Payment removed successfully.");
        }
    }

    public static class Pet {
        private int PetID;
        private String name;
        private String ClientName;
        private String PetColor;

        public Pet(int PetID, String name, String ClientName, String PetColor) {
            this.PetID = PetID;
            this.name = name;
            this.ClientName = ClientName;
            this.PetColor = PetColor;
        }

        public int getPetID() {
            return PetID;
        }

        public void setPetID(int PetID) {
            this.PetID = PetID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClientName() {
            return ClientName;
        }

        public void setClientName(String ClientName) {
            this.ClientName = ClientName;
        }

        public String getPetcolor() {
            return PetColor;
        }

        public void setPetcolor(String PetColor) {
            this.PetColor = PetColor;
        }

        public void updateClientName(String newClientName) {
            this.ClientName = newClientName;
            System.out.println("Client name updated to: " + newClientName);
        }

        public void updatePetColor(String newPetColor) {
            this.PetColor = newPetColor;
            System.out.println("Pet color updated to: " + newPetColor);
        }
    }

    public static class Reservation {
        private String ClientName;
        private int ReservationDate;
        private String Location;
        private int ClientPetId;

        public Reservation(String ClientName, int ReservationDate, String Location, int ClientPetId) {
            this.ClientName = ClientName;
            this.ReservationDate = ReservationDate;
            this.Location = Location;
            this.ClientPetId = ClientPetId;
        }

        public String getClientName() {
            return ClientName;
        }

        public void setClientName(String ClientName) {
            this.ClientName = ClientName;
        }

        public int getReservationDate() {
            return ReservationDate;
        }

        public void setReservationDate(int ReservationDate) {
            this.ReservationDate = ReservationDate;
        }

        public String getLocation() {
            return Location;
        }

        public void setLocation(String Location) {
            this.Location = Location;
        }

        public int getClientPetId() {
            return ClientPetId;
        }

        public void setClientPetId(int ClientPetId) {
            this.ClientPetId = ClientPetId;
        }

        public void changeReservationDate(int newReservationDate) {
            this.ReservationDate = newReservationDate;
            System.out.println("Reservation date updated to: " + newReservationDate);
        }

        public void cancelReservation() {
            System.out.println("Cancelling reservation for client: " + this.ClientName);
            this.ClientName = null;
            this.ReservationDate = 0;
            this.Location = null;
            this.ClientPetId = 0;
            System.out.println("Reservation cancelled successfully.");
        }
    }

    public static class Staff {
        private int StaffID;
        private int StaffPhoneNum;
        private String StaffName;

        public Staff(int StaffID, int StaffPhoneNum, String StaffName) {
            this.StaffID = StaffID;
            this.StaffPhoneNum = StaffPhoneNum;
            this.StaffName = StaffName;
        }

        public int getStaffID() {
            return StaffID;
        }

        public void setStaffID(int StaffID) {
            this.StaffID = StaffID;
        }

        public int getStaffPhoneNum() {
            return StaffPhoneNum;
        }

        public void setStaffPhoneNum(int StaffPhoneNum) {
            this.StaffPhoneNum = StaffPhoneNum;
        }

        public String getStaffName() {
            return StaffName;
        }

        public void setStaffName(String StaffName) {
            this.StaffName = StaffName;
        }

        public void updatePhoneNum(int newPhoneNum) {
            this.StaffPhoneNum = newPhoneNum;
            System.out.println("Staff phone number updated to: " + newPhoneNum);
        }

        public void removeStaff() {
            System.out.println("Removing staff with ID: " + this.StaffID);
            this.StaffID = 0;
            this.StaffName = null;
            this.StaffPhoneNum = 0;
            System.out.println("Staff removed successfully.");
        }
    }
}
