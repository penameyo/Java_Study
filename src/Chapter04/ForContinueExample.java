package Chapter04;

public class ForContinueExample {
    public static void main(String[] args) {
        int[] marks = {90, 25, 67, 45, 80};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 50) {
                continue;
            }
            System.out.println((i + 1) + "번 학생 합격 츄카츄");
        }
    }
}
