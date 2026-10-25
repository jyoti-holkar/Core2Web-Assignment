
    class FlightTicket {
    int ticketNo;
    String passengerName;
    String seatClass;

    FlightTicket(int no, String name, String sc) {
        ticketNo = no;
        passengerName = name;
        seatClass = sc;
    }

    void calculateCharges() {
        double charges = 0;

        if (seatClass.equalsIgnoreCase("Economy")) {
            charges = 500;
        } else if (seatClass.equalsIgnoreCase("Business")) {
            charges = 2000;
        } else if (seatClass.equalsIgnoreCase("First")) {
            charges = 5000;
        }

        System.out.println("Ticket No: " + ticketNo);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Additional Charges: Rs. " + charges);
    }

    public static void main(String[] args) {
        FlightTicket f = new FlightTicket(201, "Jyoti", "Business");
        f.calculateCharges();
    }
}
    

