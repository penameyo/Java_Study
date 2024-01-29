package Chapter03;

public class ForContinueExample {
    public static void main(String[] args) {
        String[] weeks = {"월","화","수","목","금","토","일"};
        System.out.println(weeks.length);
        for (int i=0; i<7; i++){
            System.out.println(weeks[i]);
        }
    }
}
