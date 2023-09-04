package chap04_03proxy;

public class Service implements SomeInterface{
    @Override
    public void someMethod() {
        System.out.println("실제 객체의 someMethod를 실행했습니다.");
    }
}
