
    class Shape {
    String color;

    Shape(String c) {
        color = c;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(String c, double l, double b) {
        super(c);
        length = l;
        breadth = b;
    }

    void calculateArea() {
        displayColor();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Blue", 10, 5);
        r.calculateArea();
    }
}
    

