class Invoice {
    int invoiceId;
    String customerName;
    double totalAmount;

    Invoice(int id, String name, double amount) {
        invoiceId = id;
        customerName = name;
        totalAmount = amount;
    }

    void applyGST() {
        double gst = totalAmount * 0.18;
        double finalBill = totalAmount + gst;

        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {
        Invoice i = new Invoice(101, "Jyoti", 1000);
        i.applyGST();
    }
}