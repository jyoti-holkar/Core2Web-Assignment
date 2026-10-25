 
     class Event {
    String eventName;
    String location;

    Event(String name, String loc) {
        eventName = name;
        location = loc;
    }
}

class SportsEvent extends Event {
    String sportType;

    SportsEvent(String name, String loc, String sport) {
        super(name, loc);
        sportType = sport;
    }

    void display() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Sport Type: " + sportType);
    }

    public static void main(String[] args) {
        SportsEvent s = new SportsEvent("Annual Sports", "Pune", "Cricket");
        s.display();
    }
}
    

