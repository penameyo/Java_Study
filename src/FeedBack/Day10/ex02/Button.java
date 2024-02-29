package FeedBack.Day10.ex02;

public class Button extends FormElements {
    private String print;

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    @Override
    void func() {
        System.out.println(print + "입력 적용");
    }
}
