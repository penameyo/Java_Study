package Chapter05;

public class DailyQuizRunning {
    public static void main(String[] args) {
        DailyQuiz dailyQuiz = new DailyQuiz("김건혁");
        dailyQuiz.sleep();
        System.out.println("이름은 " + dailyQuiz.getName() + "입니다~");
    }
}
