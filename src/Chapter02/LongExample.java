package Chapter02;

public class LongExample {
    public static void main(String[] args) {
        int a = 123;
        double b = 3.14;

        long longVar = 123L; //L을 붙여주도록 한다.

        long var1 = 10;
        long var2 = 20L;
        //long var3 =10000000000;  L을 붙이지 않으니 int로 인식한 것! -> compile 오류
        long var4 =10000000000L;

       // float var5 = 3.14; 실수형은 기본적으로 double로 인식함!
        float var6 = 3.14F;

        int var7 = 123;
        long var8 = 123;
        //int var9 = 10000000000; 10억이 넘어가는 단위까지 작성했기 때문에 long 선언 필요
    }
}