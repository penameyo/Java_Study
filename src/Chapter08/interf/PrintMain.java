package Chapter08.interf;

public class PrintMain {
    public static void main(String[] args) {
        Child child = new Child();
        Adult adult = new Adult();
        Baby baby = new Baby();
        Walk child2 = new Child();
        Run child3 = new Child(); //이렇게 타입들이 선언될 수 있다!
    }

    static void print(Baby baby){
        baby.crawl();
    }
}
