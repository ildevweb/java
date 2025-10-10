package StarConstructors;

public class CelestialObject {
    double x;
    double y;
    double z;
    String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String n, double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
        name = n;
    }
}
