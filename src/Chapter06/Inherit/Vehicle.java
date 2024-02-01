package Chapter06.Inherit;

public class Vehicle {
    String model; //모델
    int speed; //속도
    boolean stop; //이동 유무
    String color; //색상
    int wheelCount; // 바퀴 갯수
    boolean onOff; //시동 유무

    public void print() {
        System.out.println("Parents:" + model + ", " + speed + ", " + color + ", "
                + stop + ", " + wheelCount + ", " + onOff);
    }

    public Vehicle() {
        model = "Tesla model Y";
        color = "Black";
        speed = 130;
        stop = true;
    }
}
