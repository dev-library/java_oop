package chap04_02singleton;

public class SingletonExampleMain {
    public static void main(String[] args) {

        //Singleton s0 = new Singleton(); private 생성자는 외부에서 호출 불가능

        Singleton s1 = Singleton.getInstance();// 최초 생성
        Singleton s2 = Singleton.getInstance();// 이미 생성된 객체 정보 받기
        Singleton s3 = Singleton.getInstance();// 이미 생성된 객체 정보 받기

        System.out.println("s1 reference address : " + s1);
        System.out.println("s2 reference address : " + s2);
        System.out.println("s3 reference address : " + s3);
    }
}
