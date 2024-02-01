package Chapter06.Inherit;

public class Motorcycle extends Vehicle {               //상속 + Motorcycle이 자식 클래스로
    public void print() {
        System.out.println("Child(Motorecycle):" + model + ", " + speed + ", " + stop + ", " + color + ", "
                + wheelCount + ", " + onOff);
    }
    void setSpeed(int i) {
        this.speed = speed;
    }
}
