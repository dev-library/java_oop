package chap01_04enum.basic;

public class BasicEnumExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD, // 이늄타입 Add로 설정
                100, // num1에 100 대입
                3 // num2에 3 대입
        ); // 클라이언트가 요청할 때 준 데이터를 사용

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
