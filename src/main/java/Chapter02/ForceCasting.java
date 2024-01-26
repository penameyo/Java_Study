package Chapter02;

public class ForceCasting {
    public static void main(String[] args) {
        double doubleValue = 3.14;
        int intValue = (int)doubleValue;
        System.out.println(intValue);

        int intValue2 = 10;
        double doubleValue2 = 5.5;
        int result = intValue2 + (int)doubleValue2;
        System.out.println(result);
    }
}
