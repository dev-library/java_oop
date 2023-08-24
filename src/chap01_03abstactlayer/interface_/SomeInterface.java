package chap01_03abstactlayer.interface_;

public interface SomeInterface {

    void someMethod();

    default void defaultMehtod() {
        // default 키워드를 메서드에 붙이면 인터페이스 내부에서도 구현된 메서드를 가질 수 있습니다.
        this.someMethod(); // 정의되지 않은 메서드를 호출하는게 가능합니다.
    }
}
