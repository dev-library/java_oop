package chap04_02singleton;

public class Singleton {
    // 1. 싱글턴 클래스는 자기 자신 타입을 멤버변수로 가지게 합니다.
    // static을 설정해서 공용변수로 만들어야 여러 경우에 레퍼런스를 받아갈 수 있습니다.
    private static Singleton instance;

    // 2. 생성자를 private로 막아서 외부 에서 인스턴스를 새롭게 생성하는걸 막습니다.
    // 이러면 위와 같이 자기 클래스 내부에서만 생성자를 호출할 수 있게 됩니다.
    private Singleton(){
        System.out.println("객체 생성 완료!");
    }

    // 3. getInstance()와 같이, 이미 생성된 instance 멤버변수를 리턴해주는 메서드를 추가작성합니다.
    // 이 때, instance가 생성된적이 없다면, 생성자를 호출해서 instance에 대입해주는 로직을 추가합니다.
    public static Singleton getInstance(){// 객체 없이 호출할 수 있어야 하기 때문에 static 추가
        if(instance == null){ // 최초 호출시에 객체를 단 한번 생성해줌. 이후로는 instance가 null일수 없으므로 생성자 호출 안됨
            instance = new Singleton();
        }
        return instance;
    }


}

