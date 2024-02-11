package FeedBack.Day07.ex03;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);

       // Button.mode = "OCEAN"; // ⚠️ 불가 (private 접근)
        Button.switchMode();

        //button1.space = 3; // ⚠️ 불가
        button1.setSpace(3);
        button1.setSpace(-1); // 걸러짐

        // char button1Print = button1.print; // ⚠️ 불가
        String button1Info = button1.getButtonInfo();
    }
}
