package chap02_02encap.setter_code;

public class SetterCodeExampleMain {
    public static void main(String[] args) {
        // 빈 객체를 기본 생성d자로 생성하기
        CalculateCommand calculateCommand = new CalculateCommand();

        // 만약 아래 구문중 하나를 까먹고 주입을 안 한다면?
        // 그래도 오류를 딱히 띄우지 않을수도 있음
        calculateCommand.setCalculateType(CalculateType.ADD);
        //calculateCommand.setNum1(100); // 주석처리시 setNum1은 0으로 초기화됨
        calculateCommand.setNum2(3);

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
