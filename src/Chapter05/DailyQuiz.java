package Chapter05;

public class DailyQuiz {

    final int time =3;
    String name;

    void setName(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }

    void sleep() {
        System.out.println(name + "이 " + time+"시에 쿨쿨 자고 있어요~");
    }

    DailyQuiz(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    }
}
