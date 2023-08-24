package chap01_03abstactlayer.interface_;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        SomeInterface someInterface = new ImplementsClass();
        AnotherInterface anotherInterface = new ImplementsClass();

        someInterface.someMethod();
        anotherInterface.anotherMethod();

        ImplementsClass implementsClass = new ImplementsClass();

        // 양쪽 모두를 호출하는건 불가능함
        //someInterface.anotherMethod();
        //anotherInterface.someMethod();

        // ImplementsClass 구현체 타입으로는 양쪽 모두 호출 가능
        implementsClass.someMethod();
        implementsClass.anotherMethod();
    }
}
