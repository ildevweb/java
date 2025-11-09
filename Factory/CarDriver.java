package Factory;

public class CarDriver extends Driver {
    public String type;

    public CarDriver(String s) {
        this.type = s;
    }

    
    public Transport createTransport() {
        Car c = new Car(600);

        return c;
    }
}
