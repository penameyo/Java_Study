package Chapter08.interfinherit;

public class InterfaceClmpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("A 메소드 실행");    // InterfaceA의 메소드도 구현필요
    }

    @Override
    public void methodB() {
        System.out.println("B 메소드 실행");    // InterfaceB의 메소드도 구현필요
    }

    @Override
    public void methodC() {
        System.out.println("C 메소드 실행");
    }
}