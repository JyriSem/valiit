package day.five;

public class Car {
    // Properties (fields) of the class
    String brand;
    String model;
    int year;

    //Default Constructor
    public Car() {
        //Initialize default values
        brand = "default";
        model = "default";
        year = 0;
    }

    //Parameterized Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void mmm() {
        System.out.println("s");
    }
//}
//    //Parameterized Simpler Constructor
//    public Car(String brand, String model) {
//        this.brand = brand;
//        this.model = model;
//    }
//}

    //    public static void main(String[] args) {
//        // Creating objects of the Car class
//        Car car1 = new Car("x", "y", 200);
//        Car car2 = new Car();
//        Car car3 = new Car("ba", "da");
//
//        // Calling the method to display details of each car
//        car1.displayDetails();
//        car2.displayDetails();
//        car3.displayDetails();
//    }
//
//
//    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
//    }
//}