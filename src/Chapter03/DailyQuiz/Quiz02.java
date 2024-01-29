package Chapter03.DailyQuiz;

public class Quiz02 {
        public static void main(String args[]) {
            // 아래 코드의 출력값은 무엇일까요?
            System.out.println(10 / 2 + 3 * 4); //17 아닐까?
            System.out.println("----------------------");

            int number = 10;

            int result1 = number + 1;
            int result2 = number++; // 다음 결과에 출력
            int result3 = number;
            int result4 = --number;

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println("------------------------");

            // 아래 코드의 출력값은 무엇일까요?
            int num1 = 5;
            int num2 = 7;

            System.out.println((num1 > 5) && (num2 > 5)); //false
            System.out.println((num1 > 5) || (num2 > 5)); //true
            System.out.println(!((num1 > 5) && (num2 > 5))); //true
            System.out.println("------------------------");
        }
    }
