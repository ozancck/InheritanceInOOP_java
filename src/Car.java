import java.util.Objects;

public class Car extends Vehicle {
    private String body;
    private String engine;
    private int cylinders;

    public Car(String brand, int wheelNumber, double maxVelocity, int maxPassenger, String body, String engine, int cylinders) {
        super(brand, wheelNumber, maxVelocity, maxPassenger);
        this.body = body;
        this.engine = engine;
        this.cylinders = cylinders;

        if (Objects.equals(getBody(), "1")) {
            setBody("Sedan");
        }
        if (Objects.equals(getBody(), "2")) {
            setBody("SUV");
        }
        if (Objects.equals(getBody(), "3")) {
            setBody("Wagon");
        }

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
                getMaxPassenger() + "\n" + "Engine type: " + getEngine() + "\n" + "Number of cylinders: " + getCylinders() + "\n" + "Body type: " + getBody() + "\n";
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
