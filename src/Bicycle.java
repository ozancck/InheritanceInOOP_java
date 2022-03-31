import javax.management.ObjectName;

public class Bicycle extends Vehicle {
    private boolean frontBasket;
    String yesNo;

    public Bicycle(String brand, int wheelNumber, double maxVelocity, int maxPassenger, boolean frontBasket) {
        super(brand, wheelNumber, maxVelocity, maxPassenger);
        this.frontBasket = frontBasket;


    }

    public String toString() {
        return "Brand: " + getBrand() + "\n" + "Number of wheels: " + getWheelNumber() + "\n" + "Max speed: " + getMaxVelocity() + "\n" + "Number of passenger: " +
                getMaxPassenger() + "\n" + "Front Baket: " + isFrontBasket() + "\n";
    }

    public boolean isFrontBasket() {
        return frontBasket;
    }

    public void setFrontBasket(boolean frontBasket) {
        this.frontBasket = frontBasket;
    }
}
