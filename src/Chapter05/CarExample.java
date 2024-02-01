package Chapter05;

public class CarExample {
    public static void main(String[] args) {
        Car anastasha = new Car("hyundai", 100, "black", "TaeYun Kim","type");
        anastasha.setSpeed(-100); // speed = 0으로 반환
        anastasha.changeSoftware();
        anastasha.printSpec();
        Car Spark = new Car();
    }
}