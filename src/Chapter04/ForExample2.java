package Chapter04;

public class ForExample2 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            for (int j =0; j<4; j++){
                System.out.println("i = " + i +" "+ "j = "+ j);
            }
        }
        //이제 구구단을 해볼까요? 컷 ㅋㅋ
        for (int i = 2;i<=9;i++){
            for (int j =1; j<=9; j++){
                System.out.println(i+" x "+j+" = " +(i*j));
            }
        }
    }
}
