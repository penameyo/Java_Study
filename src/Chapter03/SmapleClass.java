package Chapter03;

public class SmapleClass {
    public static void main(String[] args) {
//        int score = 95;
//        char grade = (score>95)?'A': 'B';
//        System.out.println(grade);

        //if 조건절
        //90점 이상일 때 A
        //85점 이상일 때 B

        int score = 55;
        char grade = (score>=80)? 'A' : ((score>=70)? 'B' : 'C');
        System.out.println(grade);
    }

}