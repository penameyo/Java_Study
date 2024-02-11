package FeedBack.Day06.ex01;

public class Main {
    public static void main(String[] args) {
        //Button은 인스턴스의 자료형이 된다!
        Button button1 = new Button('1', 1, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonClear = new Button('C', 2, "DARK");

        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
