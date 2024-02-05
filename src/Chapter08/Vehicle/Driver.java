package Chapter08.Vehicle;
public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            System.out.println("버스 호출!");
        }

        if (vehicle instanceof Taxi) {
            System.out.println("어 그래 택시 왔어?");
        }

        vehicle.run();
    }
}
