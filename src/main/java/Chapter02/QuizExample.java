package Chapter02;

public class QuizExample {
    public static void main(String[] args) {

        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String stringValue = "A";

        //short shortValue = charValue; 오류 발생!

        double var = intValue; //작은값에서 큰 값으로 형변환 되기 때문에 형변환인자 삽입 X
        byte var2 = (byte)intValue;
        int var3 = (int)doubleValue;
    }

}
