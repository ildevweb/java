package Factory;

public class Plane implements Transport {
    public int distance;

    public Plane(int d) {
        this.distance = d;
    }

    public int getDistance() {
        return this.distance;
    }
}
