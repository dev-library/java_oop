package chap03_01lsp;

public class Client {
    public void someClientMethod(Parent parentOrChild) {

        // 부모가 할 수 있는 일은 자식도 할 수 있어야 한다.
        parentOrChild.someMethod(-1);
    }
}
