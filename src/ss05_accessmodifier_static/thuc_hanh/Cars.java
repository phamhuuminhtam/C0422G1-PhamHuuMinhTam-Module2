package ss05_accessmodifier_static.thuc_hanh;

public class Cars {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Cars(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }


}
