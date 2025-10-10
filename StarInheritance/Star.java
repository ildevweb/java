package StarInheritance;

public class Star extends CelestialObject {
    
    public Star() {
        getName();
        getX();
        getY();
        getZ();
        getMagnitude();
    }

    public String getName() {
        return name;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double getMagnitude() {
        return magnitude;
    }
}


class CelestialObject {
    double x = 0.0;
    double y = 0.0;
    double z = 0.0;
    double magnitude = 0.0;
    String name = "Soleil";
}