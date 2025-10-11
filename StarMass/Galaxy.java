package StarMass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Galaxy {
    private List<CelestialObject> celestialObjects = new ArrayList<>();
    int smass;
    int pmass;
    int omass;
    
    public void addCelestialObject(CelestialObject obj) {
        celestialObjects.add(obj);
    }

    public String computeMassRepartition() {

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                smass += obj.mass;
            } else if (obj instanceof Planet) {
                pmass += obj.mass;
            } else {
                omass += obj.mass;
            }
        }

        return "{Star=%d, Planet=%d, Other=%d}".formatted(smass, pmass, omass);
    }

}



class Planet extends CelestialObject {
    private Star centerStar;
    
    public Planet(String n, double x1, double y1, double z1, Star s1, int ma) {
        name = n;
        x = x1;
        y = y1;
        z = z1;
        centerStar = s1;
        mass = ma;
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

    public Star(String s, double x1, double y1, double z1, double m, int ma) {
        name = s;
        x = x1;
        y = y1;
        z = z1;
        magnitude = m;
        mass = ma;
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
    int mass;


    public CelestialObject() {
        this.name = "Unknown";
        this.x = this.y = this.z = 0.0;
    }


    public CelestialObject(String name, double x, double y, double z, int m) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = m;
        this.magnitude = 0.0;
    }


    public static double distanceBetween(CelestialObject a, CelestialObject b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        double dz = a.z - b.z;
        double dm = a.magnitude - b.magnitude;
        return Math.sqrt(dx * dx + dy * dy + dz * dz + dm * dm);
    }
}