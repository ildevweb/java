package StarGalaxy;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;


public class Galaxy {
    private List<CelestialObject> celestialObjects = new ArrayList<>();


    public void CelestialObjects() {
        celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject l) {
        celestialObjects.add(l);
    }
}




class Planet extends CelestialObject {
    private Star centerStar;
    
    public Planet(String n, double x1, double y1, double z1, Star s1) {
        name = n;
        x = x1;
        y = y1;
        z = z1;
        centerStar = s1;
    }

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star s) {
        centerStar = s;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Planet)) return false;
        Planet other = (Planet) obj;
        return Objects.equals(centerStar, other.centerStar);
    }

    public int hashCode() {
        return Objects.hash(centerStar);
    }

    public String toString() {
        double distance = CelestialObject.distanceBetween(this, centerStar);
        return String.format("%s circles around %s at the %.3f AU", name, centerStar.name, distance);
    }
}

class Star extends CelestialObject {
    
    public Star() {
        toString();
    }

    public Star(String s, double x1, double y1, double z1, double m) {
        name = s;
        x = x1;
        y = y1;
        z = z1;
        magnitude = m;
    }

    public String toString() {
        return "%s shines at the %.3f magnitude".formatted(name, magnitude);
    }

    public boolean equals(Star s) {
        if (name == s.name && x == s.x && y == s.y && z == s.z && magnitude == s.magnitude) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(name, x, y, z, magnitude);
    }
}



class CelestialObject {
    String name;
    double x;
    double y;
    double z;
    double magnitude;

    public CelestialObject() {
        this.name = "Unknown";
        this.x = this.y = this.z = 0.0;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double distanceBetween(CelestialObject a, CelestialObject b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        double dz = a.z - b.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz );
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }
}