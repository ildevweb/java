package Factory;

public class DriverFactory {
    
    public static Driver getDriver(String s) {
        
        if (s == "Car") {
            CarDriver c = new CarDriver(s);

            return c;
        } else {
            PlaneDriver c = new PlaneDriver(s);

            return c;
        }
    }
}
