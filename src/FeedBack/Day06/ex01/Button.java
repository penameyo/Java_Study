package FeedBack.Day06.ex01;

public class Button {

    char print; //무엇을 출력하는지
    int space; //공간은 얼마나 차지하는지
    String mode; //어떤 형태인지

    Button (char print, int space, String mode) {
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    //포멧 출력 메소드
    void place () {
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print,space, mode
        );
    }
}
