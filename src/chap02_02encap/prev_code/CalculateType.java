package chap02_02encap.prev_code;

import java.util.function.BiFunction;

public enum CalculateType {
    // 제어 자료와 실제로 제어되었을때 실행할 구문까지 함께 저장해놨음
    // 응집도가 높아졌음!(관련된 로직끼리 잘 묶여있음)
    ADD((num1, num2) -> num1 + num2),
    MINUS((num1, num2) -> num1 - num2),
    MULTIPLY((num1, num2) -> num1 * num2),
    DIVIDE((num1, num2) -> num1 / num2);

    // CalculateType에 어떤 enum자료를 대입하냐에 따라 맞춰서 해당 로직을 호출할 수 있음
    CalculateType(BiFunction<Integer, Integer, Integer> expression){
        this.expression = expression;
    }

    // 각 enum 자료가 어떤 형식의 자료를 가질지 멤버변수 형식으로 정의
    // 여기에서는 각 enum자료를 expression으로 정의하고, expression은 람다식(int, int를 입력받고 int를 리턴하는)
    // 이라고 정의한 것임
    private BiFunction<Integer, Integer, Integer> expression;

    public int calculate(int num1, int num2){
        // num1, num2를 받아 해당 enum에 연결된 람다를 실행한 결과를 리턴.
        // expression이 ADD, MINUS, MULTIPLY, DIVIDE
        // expression.apply()가 바로 해당 enum에 연동된 람다를 호출하는 코드입니다.
        return this.expression.apply(num1, num2);
    }

}
