package chap01_01oopdesc.without_interface;

public class Client {

    public void someMethod() {
        // 메세지를 보내기 전에 실행되는 어떠한 작업.
        // 코드들....

        // 메세지를 마지막으로 발송
        FakeMessageSender messageSender = new FakeMessageSender();

        messageSender.send();
    }
}
