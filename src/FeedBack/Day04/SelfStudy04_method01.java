package FeedBack.Day04;

public class SelfStudy04_method01 {
    public static void main(String[] args) {
//        double x = 3, y = 4;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 10; y = 2;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 7; y = 5;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);

        double xx = 3, yy = 4;
        addSubtMultDiv(xx, yy); //띠용? 외부에서 선언한 메소드를 가져왔네?
                                // 그리고 메소드의 변수까지 집어 넣었잖아?

        xx = 10; yy = 2;
        addSubtMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubtMultDiv(xx, yy);
    }
    //  ⭐️ 메인 메소드 외부에 선언할 것
    static void addSubtMultDiv (double a, double b) { //addSubtMultDiv 메소드 정의 했슴당
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }
}
