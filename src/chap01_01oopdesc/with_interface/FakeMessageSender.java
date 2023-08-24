package chap01_01oopdesc.with_interface;

public class FakeMessageSender implements MessageSender {

    @Override
    public void send() {
        System.out.println("FakeMessageSender, 실제로는 메세지를 전송하지 않습니다.");
    }
}
