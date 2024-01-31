package Chapter05;

public class Calculator {

    double result;

    double add(double x, double y) {
        double result;
        result = x + y;
        return result;
    }

    double delete(double x, double y) {
        return x - y;
    }

    double divide(double x, double y) {
        return x / y;
    }

    double multi(double x, double y) {
        return x * y;
    }

    int postfixOperator(int a) { //후위증감식 즉시 출력
        a++;
        return a;

    }

    int prepfixOperator(int a) { //call by value / call by address
        return ++a;
    }

    void changeArrayValue(int[] array) {
        array[0] = 10;
    }

    void changeValue(String value) {
        value = "change";
    }

    public static void main(String[] args) {
        String b = new String("init");

        int a = 1;
        int[] array = {1, 2, 3};
        // 생성자를 통한 객체 생성
        Calculator calculator = new Calculator();
        calculator.postfixOperator(a);
        //변수 선언 후 매개변수 입력 후 출력
        double result = calculator.add(3, 4);
        System.out.println(result);
        double divresult = calculator.divide(12, 3);
        System.out.println(divresult);

        //즉시 출력
        System.out.println(calculator.multi(3, 4));

        System.out.println(calculator.postfixOperator(a));          //a=2
        System.out.println(calculator.prepfixOperator(a));

        System.out.println(array[0]);//호출 전
        calculator.changeArrayValue(array); //호! 출!
        System.out.println(array[0]); //호출 후
        System.out.println("hello! " + b);
        calculator.changeValue(b);

    }
}
