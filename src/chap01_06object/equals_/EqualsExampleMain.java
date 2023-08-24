package chap01_06object.equals_;

public class EqualsExampleMain {
    public static void main(String[] args) {
        SomeObject sameObject1 = new SomeObject(1, "asdf");
        SomeObject sameObject2 = new SomeObject(1, "asdf");

        SomeObject anotherObject = new SomeObject(99, "qwer");

        // 동일성 비교(레퍼런스 주소 비교)
        System.out.println(sameObject1 == sameObject2);

        // 동등성 비교(equals를 오버라이딩 했을떄의 기준으로 비교)
        System.out.println(sameObject1.equals(sameObject2));

        // 동등성 비교
        System.out.println(sameObject1.equals(anotherObject));
    }
}
