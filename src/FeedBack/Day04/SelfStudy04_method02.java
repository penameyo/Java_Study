package FeedBack.Day04;

public class SelfStudy04_method02 {
    public static void main(String[] args) {
        int int1 = add(3, 4);
        System.out.println(int1);
        System.out.println(add(4,5));

        System.out.println("\n- - - - -\n");

        if (
                checkIfContain(
                        "Hello World",
                        "hello"
                )
        ) {
            System.out.println("포함됨");
        } else {
            System.out.println("포함 안 됨");
        }
//삼항 연산자료 표현
        System.out.println(
                checkIfContain(
                        "Hello World",
                        "hello"
                ) ? "포함됨" : "포함 안 됨"
        );
    }

    // add 메소드는 num1과 num2를 더해서 반황하는 메소드!
    //괄호 내부에 들어간 변수는 인자라고 합니당
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static boolean checkIfContain (String text, String token) {
        return text.toLowerCase().contains(token.toLowerCase());
        //텍스트를 소문자로 변환 후 또 소문자로 변환한 토큰을 포함하는가??
    }
}
