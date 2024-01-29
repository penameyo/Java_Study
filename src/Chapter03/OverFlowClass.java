package Chapter03;

public class OverFlowClass {
    public static void main(String[] args) {
      double a = 10;
      double b = 0;
      double div = a/b;
      double c  = a%b;

        System.out.println(a/b); // infinity
        System.out.println(a%b); // NaN
        System.out.println(c);
        boolean result = div > 232323234;
        System.out.println(result);
        }
    }
