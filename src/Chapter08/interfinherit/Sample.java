package Chapter08.interfinherit;

public class Sample {

    public static void main(String[] args) {
        InterfaceC implC = new InterfaceC() {
            @Override
            public void methodC() {

            }

            @Override
            public void methodB() {

            }

            @Override
            public void methodA() {

            }
        };

        InterfaceA interA = implC;
        interA.methodA();
        System.out.println("---------------");

        InterfaceB interB = implC;
        interB.methodB();
        System.out.println("---------------");

        InterfaceC interC = implC;
        interC.methodA();
        interC.methodB();
        interC.methodC();
    }

}