package chap01_03abstactlayer.interface_;

public class ImplementsClass implements SomeInterface, AnotherInterface {
    @Override
    public void anotherMethod() {
        System.out.println("ImplementsClass anotherMethod");
    }

    @Override
    public void someMethod() {
        System.out.println("ImplementsClass someMethod");
    }
}
