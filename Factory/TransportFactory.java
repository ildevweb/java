package Factory;

public class TransportFactory {
    public int getTransport(String s) {
        if (s == "Car") {
            return 600;
        } else {
            return 10000;
        }
    }
}
