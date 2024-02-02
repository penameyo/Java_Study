package Chapter07;

public class Dog extends Animal {

    void sleep(double hour, int a) {
        System.out.println(this.name + " Zzz...");
    }

    void sleep(int hour) {   // 메소드 오버로딩
        System.out.println(this.name + " Zzz... for " + 7 + " hours");
    }
}
