import java.util.Scanner;
class Vehicle
{
    int vehicleId;
    String modelName;
    double baseRent;
    Vehicle(int vehicleId, String modelName, double baseRent)
    {
        this.vehicleId = vehicleId;
        this.modelName = modelName;
        this.baseRent = baseRent;
    }
    double calculateRent()
    {
        return baseRent;
    }
    void display()
    {
        System.out.printf("%-15s : %d\n", "Vehicle ID", vehicleId);
        System.out.printf("%-15s : %s\n", "Model Name", modelName);
        System.out.printf("%-15s : %.2f\n", "Base Rent", baseRent);
    }
}
class Car extends Vehicle
{
    Car(int vehicleId, String modelName, double baseRent)
    {
        super(vehicleId, modelName, baseRent);
    }
    double calculateRent()
    {
        return baseRent + 500;
    }
}
class Bike extends Vehicle
{
    Bike(int vehicleId, String modelName, double baseRent)
    {
        super(vehicleId, modelName, baseRent);
    }
    double calculateRent()
    {
        return baseRent + 200;
    }
}
class VehicleRental
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Details:");
        System.out.print("Vehicle ID   : ");
        int carId = sc.nextInt();
        sc.nextLine();
        System.out.print("Model Name   : ");
        String carModel = sc.nextLine();
        System.out.print("Base Rent    : ");
        double carRent = sc.nextDouble();
        System.out.println("\nEnter Bike Details:");
        System.out.print("Vehicle ID   : ");
        int bikeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Model Name   : ");
        String bikeModel = sc.nextLine();
        System.out.print("Base Rent    : ");
        double bikeRent = sc.nextDouble();
        Car car = new Car(carId, carModel, carRent);
        Bike bike = new Bike(bikeId, bikeModel, bikeRent);
        System.out.println("\n----- Car Details -----");
        car.display();
        System.out.printf("%-15s : %.2f\n", "Total Rent", car.calculateRent());
        System.out.println("\n----- Bike Details -----");
        bike.display();
        System.out.printf("%-15s : %.2f\n", "Total Rent", bike.calculateRent());
    }
}
