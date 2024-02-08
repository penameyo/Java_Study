package FeedBack;

public class SelfStudy03_breakcontinue {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if (i%3==0){
                continue; //조건 충족 즉시, 한 루프 건너 뜀
            }
            if (i==10){
                break; //조건 충족 즉시, for문 종료
            }
            System.out.println(i);
        }

        System.out.println("\n- - - - -\n");

        String str = "호";

        //  ⭐️ 무한루프 탈출에 사용 가능
        for (;;) { // 다음 강의 while을 더 많이 사용
            str += "롤";
            System.out.println(str);
            if (str.length() == 100) break;
        }

        str += "로";
        System.out.println(str);
    }
}
