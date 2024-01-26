package Chapter02;

public class DoubleFloatVariableExample {
    public static void main(String[] args) {

        double var1 =3.14;
        float var2 = 3.14F;

        //정밀도 테스트
        double var3 = 123456.123456789;
        float var4 = 1234567.123456789F;
        System.out.println(var3);
        System.out.println(var4);
    }
}
