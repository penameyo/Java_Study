package Chapter09;

public class Sample {
    public static void main(String[] args) {
        try {
            int[] a = {1,2,3};
            System.out.println(a[4]);
        } catch (Exception e) {
            // 오류가 났을 때 처리!
            System.out.println(" Exception 처리해!!");
        }
    }
}
