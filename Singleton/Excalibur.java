package Singleton;

public class Excalibur {
    private static String name;
    private static Excalibur INSTANCE;

    private Excalibur(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static Excalibur getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Excalibur("Sword");
        }

        return INSTANCE;
    }
}
