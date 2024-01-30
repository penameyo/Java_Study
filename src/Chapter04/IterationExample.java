package Chapter04;

public class IterationExample {
    public static void main(String[] args) {
        // 1 ~ 5 -> 초기화; 조건; 증감식
       for (int i=89; i<100; i++){
           System.out.println(i);
        }


       //arr List로 표현해보기

       int[] arr={89,90,91,92,93,94,95,96,97,98,99};
       for (int i =0; i<arr.length; i++){
           System.out.println(arr[i]);
       }
    }

}
