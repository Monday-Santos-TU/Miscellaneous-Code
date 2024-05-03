public class Vehicle {
    private int numWheels;
    private String make;

    public Vehicle(int numWheels, String make) {
        this.numWheels = numWheels;
        this.make = make;
    }

    public void drive() {
        System.out.println("The " + numWheels + " wheeled vehicle is driving.");
    }

    public String getMake() {
        return make;
    }
}
