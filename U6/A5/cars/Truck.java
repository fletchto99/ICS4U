package cars;

public class Truck extends Vehicle {

    // calculate the distance we can travel based on amount of gas
    @Override
    public double getDistance(final double value) {
        return value / 14.1 * 100;
    }

}
