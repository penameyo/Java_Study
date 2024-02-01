package Chapter05;

public class Car {
    String company;
    int speed = 100;
    String sw = "Hyundai Mobis";
    String color = "Black";
    String owner = "TaeYun Kim";
    String sheet = "cool";


    Car(String company, int speed, String color, String owner, String sheet) {
        this.company = company;
        this.speed = speed;
        this.color = color;
        this.owner = owner;

    }

    Car() {
        company = "shevolet";
        speed = 120;
        color = "gray";
        owner = "JongHo Park";
        Sheet sheet = new Sheet("type");
    }

    void changeSoftware() {
        sw = "튜닝의 끝은 순정이란다";
    }

    void changeColor(String color) {
        color = "양카 만들지 마라";
    }

    public void setSpeed(int speed){
        if(speed<0){
            this.speed = 0;
        }
        else {
            this.speed = speed;
        }
    }

    void printSpec() {
        System.out.println("company = " + company + ", " + "speed = " + speed + ", "
                + "color = " + " " + color + ", " + "owner = " + owner + ", " + "sheet = "+"bage");
    }

}

