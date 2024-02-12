package FeedBack.Day08.ex01;

public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name); // 다음 예제에서 다룰 것
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder() {
//        System.out.printf(
//                "%d호 %s점 드라이브스루 주문 %s%n",
//                no, name, // 상속은 받을 수 있지만 변경 불가
//                (driveThruOpen ? "받음" : "불가")
//        );
  }
}
