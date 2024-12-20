package tap;

class Heart {
    private int weight;
    private int bpm;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}

class Brain {
    private int weight;
    private String colour;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

class Bike {
    private String brand;
    private int mileage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Student {
    // Composition: Student has a Heart and a Brain, which are part of the student
     Heart heart;
     Brain brain;

    // Aggregation: Student can have a Bike and Books, which are not part of the student
    private Bike bike;
    private Book book;

    public Student() {
        // Heart and Brain are part of Student (composition)
        heart = new Heart();
        heart.setWeight(23);
        heart.setBpm(67);

        brain = new Brain();
        brain.setWeight(1400);
        brain.setColour("Gray");
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    void hasA(Bike bike)
    {
    	System.out.println(bike.getBrand());
    	System.out.println(bike.getMileage());
    }
    void hasB(Book book)
    {
    	System.out.println(book.getName());
    	System.out.println(book.getAuthor());
    }
}

public class StudentAggreCompo {
    public static void main(String[] args) {
        Student student = new Student();


        // Create Bike and Book instances
        Bike bike = new Bike();
        bike.setBrand("Yamaha");
        bike.setMileage(40);

        Book book = new Book();
        book.setName("Effective Java");
        book.setAuthor("Joshua Bloch");

        // Set Bike and Book to Student (aggregation)
        student.setBike(bike);
        student.setBook(book);
        student.hasA(bike);
        student.hasB(book);

        // Display Student details
        System.out.println("Heart Weight: " + student.heart.getWeight());
        System.out.println("Heart BPM: " +student. heart.getBpm());

        // Display Brain details
        System.out.println("Brain Weight: " + student.brain.getWeight());
        System.out.println("Brain Colour: " + student.brain.getColour());
    }
}
