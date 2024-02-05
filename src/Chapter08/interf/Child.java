package Chapter08.interf;

public class Child implements Walk, Run {
    @Override
    public void run(){
        System.out.println("어린 아이가 달립니다!");

    }

    public void walk(){
        System.out.println("어린 아이가 작은 보폭으로 걷습니다!");
    }
}
