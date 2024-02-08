package FeedBack;

public class SampleStudy03_forAndwhile {
    public static void main(String[] args) {

        int lineWidth = 5;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();


        }

        System.out.println("\n - - - - - \n");
        //  for 문으로 다시 작성
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
