public class Car extends Vehicle {
    private boolean engineOn;

    public Car(boolean engineOn, int numWheels, String make) {
        super(numWheels, make);
        this.engineOn = engineOn;
    }

    public void drive() {
        if(engineOn) {
            System.out.println("The " + getMake() + " car is driving.");
        } else {
            System.out.println("Your " + getMake() + " is not on!");
        }
    }

    public void turnOn() {
        engineOn = true;
    }
}
