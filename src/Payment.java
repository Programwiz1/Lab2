public class Payment {
    // Private data members
    private int BillPayment;
    private int ClientID;
    private String PayMethod;

    // Constructor
    public Payment(int BillPayment, int ClientID, String PayMethod) {
        this.BillPayment = BillPayment;
        this.ClientID = ClientID;
        this.PayMethod = PayMethod;
    }


    // Getter for BillPayment
    public int getBillPayment() {
        return BillPayment;
    }

    // Setter for BillPayment
    public void setBillPayment(int BillPayment) {
        this.BillPayment = BillPayment;
    }

    // Getter for ClientID
    public int getClientID() {
        return ClientID;
    }

    // Setter for ClientID
    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

    // Getter for PayMethod
    public String getPayMethod() {
        return PayMethod;
    }

    // Setter for PayMethod
    public void setPayMethod(String PayMethod) {
        this.PayMethod = PayMethod;
    }
    
    // Method to apply a discount to the bill payment
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = (BillPayment * discountPercentage) / 100;
            this.BillPayment -= discountAmount;
            System.out.println("Discount applied: " + discountAmount + ". New Bill Payment: " + this.BillPayment);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to change the payment method
    public void changePaymentMethod(String newPayMethod) {
        this.PayMethod = newPayMethod;
        System.out.println("Payment method changed to: " + newPayMethod);
    }

    // Method to simulate removing the payment
    public void removePayment() {
        // Perform cleanup actions if necessary
        System.out.println("Removing payment for client ID: " + this.ClientID);
        
        // Reset fields or other cleanup actions
        this.BillPayment = 0;
        this.ClientID = 0;
        this.PayMethod = null;
        
        System.out.println("Payment removed successfully.");
    }
}
