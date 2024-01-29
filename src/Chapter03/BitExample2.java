package Chapter03;

public class BitExample2 {
    public static void main(String[] args) {
        float a = 45F;
        double b = 54.56;
        double sum = (a+b);
        System.out.println(sum); // 99.56

        long result = Math.round(sum); // round = 반올림!
        double result2 = Math.floor(sum); // floor = 내림!
        System.out.println(result);
        System.out.println(result2);
    }
}