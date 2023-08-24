package chap01_02inheritance.extend;

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();// 부모타입 변수에 부모타입 객체 대입
        Parent parentTypeChild = new Child(); // 부모타입 변수에 자식타입 객체 대입, 다형성
        Child child = new Child(); // 자식타입 변수에 자식타입 객체 대입

        parent.someMethod();
        System.out.println("-----------------");
        parentTypeChild.someMethod();
        //parentTypeChild.anotherMethod(); // Child타입 객체 내부 요소는 Parent타입 변수로 호출 불가능
        System.out.println("------------------");
        child.someMethod();
        child.anotherMethod();
    }
}
