package Chapter07;

public abstract class Friends {
    String kind;

    public abstract void sound();  // 추상메소드 - 메소드의 타입과 이름만 정의

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}