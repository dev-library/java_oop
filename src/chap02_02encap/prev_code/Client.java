package chap02_02encap.prev_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        // 연산 요청에 필요한 모든 정보를 얻어왔음
        // calculateCommand 내부에 무슨 멤버변수가 존재하는지 확인 가능.
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        // 그래도 호출은 객체지향적으로 정리된 메서드로 할 수 있음
        int result = calculateType.calculate(num1, num2);

        return result;

    }
}
