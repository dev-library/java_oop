package chap04_03proxy;

public class Client {
    private final SomeInterface someInterface;

    public Client(SomeInterface someInterface){
        this.someInterface = someInterface;
    }

    public void someClientMethod(){
        someInterface.someMethod();
    }
}
