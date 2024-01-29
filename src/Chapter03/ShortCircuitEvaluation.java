package Chapter03;

public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        int a= 1;
        int b= 1;

        boolean result = (a>b)&&(++a>b);
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println("------------------");

        int a2 = 1;
        int b2 = 2;

        boolean result2 = (a<b)&&(++a>b);
        System.out.println(result2);
    }


}
