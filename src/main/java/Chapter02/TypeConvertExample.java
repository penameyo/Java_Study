package Chapter02;

public class TypeConvertExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue; // 타입 변환 (byte -> int)
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("'가'의 유니코드="+intValue);

    }

}
