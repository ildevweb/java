package Factory;

public class PlaneDriver extends Driver {
    public String type;

    public PlaneDriver(String s) {
        this.type = s;
    }

    public Transport createTransport() {
        Plane p = new Plane(10000);

        return p;
    }
}
