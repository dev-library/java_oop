package chap04_03proxy;

public class Proxy implements SomeInterface {

    // 대리자 객체는 본체의 기능을 호출해주면서 거기에 더해 본인의 실행 메서드를 추가해야 합니다.
    private Service service;

    public Proxy(){// 대리객체 생성시 본체타입인 Service가 자동으로 주입되도록 합니다.
        this.service = new Service();
    }

    public void someMethod() {

        // 본체 위임 메서드 실행 전
        System.out.println("대리자 객체가 본체 메서드 호출 전에 사전 실행 코드를 수행합니다.");

        // 본체로부터 호출 위임(delegate)
        service.someMethod();

        // 본체 위임 메서드 실행 후
        System.out.println("대리자 객체가 본체 메서드 호출 후에 사후 실행 코드를 수행합니다.");

    }
}
