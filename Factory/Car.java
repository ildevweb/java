package Factory;

public class Car implements Transport {
    public int distance;

    public Car(int d) {
        this.distance = d;
    }

    public int getDistance() {
        return this.distance;
    }
}
