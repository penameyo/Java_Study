package Chapter02;

public class QuizExample2 {
    public static void main(String[] args) {
        String str = "jongho";
        String str2 = new String("jongho");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
