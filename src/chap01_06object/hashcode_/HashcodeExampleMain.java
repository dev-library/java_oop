package chap01_06object.hashcode_;

public class HashcodeExampleMain {
    public static void main(String[] args) {
        // Hash 관련 컬렉션이 같은 인스턴스를 구분하는 방법
        // HashCode를 비교해서 필터링 한 다음 ->  equals로 필터링된 자료들간 비교
        // 이렇게 하는 이유는 equals비교를 처음부터 끝까지 하는것보다
        // HashCode를 이용한 필터링이 자원을 덜 소모하기 때문. 다만 HashCode의 결과값은 중복값이 나올 수 있는 구조이므로
        // equals 없이 HashCode만으로 값을 정확하게 조회할 수 있다는 보장은 없음.

        SomeObject sameObject1 = new SomeObject(1, "asdf");
        SomeObject sameObject2 = new SomeObject(1, "asdf");

        System.out.println(sameObject1.hashCode());
        System.out.println(sameObject2.hashCode());
    }
}
