package FeedBack;

public class SelfStudy02_loop {
    public static void main(String[] args) {
        //  종료조건이 없는 for 루프
//        for (;;) {
//            System.out.println("영원히");
//        }
//        //System.out.println("닿지 않아");  ⚠️ 실행되지 않음! for문이 무한 반복되어 여기까지 못오게 되는데...

        //  종료조건을 만족시키지 못하는 무한루프
        for (int i = 0; i < 10; i++) {
            System.out.println("그래도");
            i--;                       // 또 무한히 반복되는 for문이 출력되네?
        }
        System.out.println("닿지 않아"); // ⚠️ 실행되지 않음
    }
}
