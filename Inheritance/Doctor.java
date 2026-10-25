
    class Doctor {
    int doctorId;
    String name;
    String specialization;

    Doctor(int id, String n, String s) {
        doctorId = id;
        name = n;
        specialization = s;
    }

    void showFee() {
        int fee = 0;

        if (specialization.equalsIgnoreCase("Cardiologist")) {
            fee = 1000;
        } else if (specialization.equalsIgnoreCase("Dentist")) {
            fee = 500;
        } else if (specialization.equalsIgnoreCase("Dermatologist")) {
            fee = 800;
        }

        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: Rs. " + fee);
    }

    public static void main(String[] args) {
        Doctor d = new Doctor(101, "Rahul", "Cardiologist");
        d.showFee();
    }
}
    

