package chap01_01oopdesc.with_interface;

public interface MessageSender {
    // 이 인터페이스를 구현하는 구현체는 무조건 send() 인터페이스를 가져야 합니다.
    void send();
}
