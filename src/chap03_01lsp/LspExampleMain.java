package chap03_01lsp;

public class LspExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        Parent parent = new Parent();
        Child child = new Child();

        // 다형성의 의미가 없어짐.
        // 부모타입변수로 자식타입 객체를 호출하는것을 허용하는것.
        // 자식타입객체를 부모타입 변수만으로도 온전히 활용할 수 있어야 한다.
        client.someClientMethod(child);
    }
}
