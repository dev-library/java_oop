package chap01_03abstactlayer.abstract_class;

public class AbstractClassExampleMain {
    public static void main(String[] args) {
        // 추상 클래스의 인스턴스를 직접 생성해주고 싶다면?
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                // 생성자에서 추상메서드를 직접 구현해주면 가능
                System.out.println("AbstractClass abstractMethod");
            }
        };

        abstractClass.implementedMethod();
        abstractClass.abstractMethod();

        System.out.println("-----------------------");

        AbstractClass extendedClass = new ExtendedClass();
        extendedClass.implementedMethod();
        extendedClass.abstractMethod();

    }
}
