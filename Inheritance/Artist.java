
     class Artist {
    String name;
    int age;

    Artist(String n, int a) {
        name = n;
        age = a;
    }
}

class Musician extends Artist {
    String instrument;

    Musician(String n, int a, String i) {
        super(n, a);
        instrument = i;
    }

    void perform() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Instrument: " + instrument);
        System.out.println(name + " is performing.");
    }

    public static void main(String[] args) {
        Musician m = new Musician("Rahul", 25, "Guitar");
        m.perform();
    }
}
    

