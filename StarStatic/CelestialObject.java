package StarStatic;

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


    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double objx = (obj2.x - obj1.x) * (obj2.x - obj1.x);
        double objy = (obj2.y - obj1.y) * (obj2.y - obj1.y);
        double objz = (obj2.z - obj1.z) * (obj2.z - obj1.z);

        return Math.sqrt(objx+objy+objz);
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double objx = (obj2.x - obj1.x) * (obj2.x - obj1.x);
        double objy = (obj2.y - obj1.y) * (obj2.y - obj1.y);
        double objz = (obj2.z - obj1.z) * (obj2.z - obj1.z);

        return Math.sqrt(objx+objy+objz)*150000000;
    }

    public static final double KM_IN_ONE_AU = 150000000;
}
