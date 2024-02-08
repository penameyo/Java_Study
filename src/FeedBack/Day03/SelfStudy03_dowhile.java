package FeedBack.Day03;

public class SelfStudy03_dowhile {
    public static void main(String[] args) {
        int enemies = 3;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies > 0) enemies--; //사격 후 적이 0보다 많으면 적 1 감소
        } while (enemies > 0); //

        System.out.println("사격중지 아군이다");

        System.out.println("\n- - - - -\n");

        int x = 1; // 10 이상으로 바꿔서 다시 실행해보면 결과는? -> while은 실행x, do while은 일단 1번 실행
        int y = x;

        while (x < 10) {
            System.out.println("while 문: " + x++);
        }

        do {
            System.out.println("do ... while 문: " + y++);
        } while (y < 10);
    }
}
