import java.util.Scanner;

public class Showroom {

    // Base class Vehicle
    public static class Vehicle {
        
        private String brand;
        private String model;
        private int year;

        
        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Method to display vehicle details
        public void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    // Subclass Car that inherits from Vehicle
    public static class Car extends Vehicle {
        
        private String fuelType;

       
        public Car(String brand, String model, int year, String fuelType) {
           
            super(brand, model, year);
            this.fuelType = fuelType;
        }

        
        @Override
        public void displayDetails() {
            super.displayDetails(); 
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    // Main class to interact with the user and display car details
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for car details
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter fuel type: ");
        String fuelType = scanner.nextLine();

        // Create a Car object using the user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Call the displayDetails method to display the car's details
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
