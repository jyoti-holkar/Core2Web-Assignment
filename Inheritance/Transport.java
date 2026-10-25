
     class Transport {
    String mode;
    int maxSpeed;

    Transport(String m, int s) {
        mode = m;
        maxSpeed = s;
    }
}

class Bus extends Transport {
    int routeNo;
    int seatCount;

    Bus(String m, int s, int r, int c) {
        super(m, s);
        routeNo = r;
        seatCount = c;
    }

    void showRoute() {
        System.out.println("Mode: " + mode);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Route Number: " + routeNo);
        System.out.println("Seat Count: " + seatCount);
    }

    public static void main(String[] args) {
        Bus b = new Bus("Road", 80, 101, 40);
        b.showRoute();
    }
}
    

