package Chapter08;

public class Sapmle {
    interface Predator {
        String getFood();

        // 디폴트 메소드
        default void printFood() {
            System.out.printf("my food is %s\n", getFood());
        }
    }
}

