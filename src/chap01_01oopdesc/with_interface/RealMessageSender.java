package chap01_01oopdesc.with_interface;

public class RealMessageSender implements MessageSender {

    @Override
    public void send() {
        System.out.println("RealMessageSender, 실제로 메세지를 발송합니다.");
    }
}
