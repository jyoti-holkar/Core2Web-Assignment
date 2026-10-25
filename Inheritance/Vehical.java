     class Vehicle {
    String brand;
    String model;

    Vehicle(String b, String m) {
        brand = b;
        model = m;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    double price;
    String fuelType;

    Car(String b, String m, double p, String f) {
        super(b, m);
        price = p;
        fuelType = f;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Price: Rs. " + price);
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        Car c = new Car("Tata", "Nexon", 900000, "Petrol");
        c.displayCar();
    }
}
    

