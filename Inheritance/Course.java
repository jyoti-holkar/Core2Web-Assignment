
     class Course {
    String courseName;
    int duration;

    Course(String name, int d) {
        courseName = name;
        duration = d;
    }
}

class OnlineCourse extends Course {
    String platform;

    OnlineCourse(String name, int d, String p) {
        super(name, d);
        platform = p;
    }

    void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Platform: " + platform);
    }

    public static void main(String[] args) {
        OnlineCourse c = new OnlineCourse("Java", 3, "Coursera");
        c.display();
    }
}
    

