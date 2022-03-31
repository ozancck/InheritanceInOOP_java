public class Scooter extends Vehicle {
    private boolean seatForPassenger2;

    public Scooter(String brand, int wheelNumber, double maxVelocity, int maxPassenger, boolean seatForPassenger2) {
        super(brand, wheelNumber, maxVelocity, maxPassenger);
        this.seatForPassenger2 = seatForPassenger2;
    }

    public String toString() {
        return "Brand: " + getBrand() + "\n" + "Number of wheels: " + getWheelNumber() + "\n" + "Max. speed: " + getMaxVelocity() + "\n" + "Number of passenger: " +
                getMaxPassenger() + "\n" + "Passenger Seat " + isSeatForPassenger2() + "\n" ;
    }

    public boolean isSeatForPassenger2() {
        return seatForPassenger2;
    }

    public void setSeatForPassenger2(boolean seatForPassenger2) {
        this.seatForPassenger2 = seatForPassenger2;
    }
}
