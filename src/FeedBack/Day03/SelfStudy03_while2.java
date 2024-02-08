package FeedBack.Day03;

public class SelfStudy03_while2 {
    public static void main(String[] args) {
        int i = 1;

        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        while (true) {
            int cur = i++; //i 증가

            if (cur == 100) break; // 100이 되는 순간 조건식 종료
            if (cur % 3 != 0) continue; // 조건에 충족하면 바로 넘어가버리기!

            System.out.println(cur); //즉, 3의 배수만 출력된다 이말이야

        }
    }
}
