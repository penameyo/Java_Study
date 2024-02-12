package FeedBack.Day08.ex01;

public class YalcoChicken {
    private int no;
    private String name;        // protected -> private 로 변경 시, 상속은 가능하지만 자식 클래스에서 변경은 불가

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder() {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
