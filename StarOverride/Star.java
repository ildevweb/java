package StarOverride;


public class Star extends CelestialObject {
    
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
}


class CelestialObject {
    double x = 0.0;
    double y = 0.0;
    double z = 0.0;
    double magnitude = 0.0;
    String name = "Soleil";
}
