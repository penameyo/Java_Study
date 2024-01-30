package Chapter04;

public class WhileExample {
    public static void main(String[] args) {
        //While문을 이용해서 1~10까지 홀수만 출력하기!

        int index = 0;
        while (index<10){
            index++;
            if (index%2 !=0){
                System.out.println("홍수 나와라!" + index);
            }
        }
    }
}
