package ss05_accessmodifier_static.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Cars car1 = new Cars("Mazda 3","Skyactiv 3");
        System.out.println(Cars.numberOfCars);
        Cars car2 = new Cars("Mazda 6","Skyactiv 6");
        System.out.println(Cars.numberOfCars);
    }
}
