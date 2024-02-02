package Chapter03.DailyQuiz;

public class Quiz04 {
    public static void main(String args[]) {
        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.

        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!"); //primitive 타입이 아닌 참조타입(객체)

        System.out.println(str1.equals(str2));
    }
}
