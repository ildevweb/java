package StarUtils;

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


    public String toString() {
        return "%s is positioned at (%.3f, %.3f, %.3f)".formatted(name, x, y, z);
    }

    public Boolean equals(CelestialObject obj2) {
        if (x == obj2.x && y == obj2.y && z == obj2.z && name == obj2.name) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(x, y, z, name);
    }
}