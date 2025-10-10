package StarGetters;

public class CelestialObject {
    double x;
    double y;
    double z;
    String name = "Soleil";
    
    public CelestialObject() {
        setX(x);
        setY(y);
        setZ(z);
        setName(name);

        getX();
        getY();
        getZ();
        getName();
    }

    public void setX(double x1) {
        x = x1;
    }
    public void setY(double y1) {
        y = y1;
    }
    public void setZ(double z1) {
        z = z1;
    }
    public void setName(String n) {
        name = n;
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
    public String getName() {
        return name;
    }
}
