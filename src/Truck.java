import java.util.Objects;

public class Truck extends Vehicle {

    private double maxTonnage;
    private String engine;
    private int cylinders;

    public Truck(String brand, int wheelNumber, double maxVelocity, int maxPassenger, double maxTonnage, String engine, int cylinders) {
        super(brand, wheelNumber, maxVelocity, maxPassenger);
        this.maxTonnage = maxTonnage;
        this.engine = engine;
        this.cylinders = cylinders;

        if (Objects.equals(getEngine(), "1")) {
            setEngine("Gasoline");
        }
        if (Objects.equals(getEngine(), "2")) {
            setEngine("Diesel");
        }
        if (Objects.equals(getEngine(), "3")) {
            setEngine("LPG");
        }
        if (Objects.equals(getEngine(), "4")) {
            setEngine("Electric");
        }

    }

    public String toString() {
        return "Brand: " + getBrand() + "\n" + "Number of wheels: " + getWheelNumber() + "\n" + "Max. speed: " + getMaxVelocity() + "\n" + "Number of passenger: " +
                getMaxPassenger() + "\n" + "Engine type: " + getEngine() + "\n" + "Number of cylinders: " + getCylinders() + "\n" + "Tonnager: " + getMaxTonnage() + "\n";
    }

    public double getMaxTonnage() {
        return maxTonnage;
    }

    public void setMaxTonnage(double maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
