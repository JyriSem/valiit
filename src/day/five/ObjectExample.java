package day.five;

public class ObjectExample {

    // Properties (fields) of the class
    String value1;
    String value2;
    int value3;

    //Default Constructor
    public ObjectExample() {
        //Initialize default values
        value1 = "default";
        value2 = "default";
        value3 = 0;
    }

    //Parameterized Constructor
    public ObjectExample(String value1, String value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    //Parameterized Simpler Constructor
    public ObjectExample(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public static void main(String[] args) {
        // Creating objects of the Car class
        ObjectExample objectExample1 = new ObjectExample("x", "y", 200);
        ObjectExample objectExample2 = new ObjectExample();
        ObjectExample objectExample3 = new ObjectExample("ba", "da");

        // Calling the method to display details of each car
        objectExample1.displayDetails();
        objectExample2.displayDetails();
        objectExample3.displayDetails();
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + value1);
        System.out.println("Model: " + value2);
        System.out.println("Year: " + value3);
    }
}