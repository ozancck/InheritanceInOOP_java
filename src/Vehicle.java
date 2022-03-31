public class Vehicle {
    private String brand;
    private int wheelNumber;
    private double maxVelocity;
    private int maxPassenger;

    public Vehicle(String brand, int wheelNumber, double maxVelocity, int maxPassenger) {
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.maxVelocity = maxVelocity;
        this.maxPassenger = maxPassenger;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}
