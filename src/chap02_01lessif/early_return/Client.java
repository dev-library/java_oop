package chap02_01lessif.early_return;

public class Client {
    public int someMethod(CalculateCommand calculateCommand){
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        // early return은 핵심 로직 수행 전에 아예 리턴구문과 함께 앞쪽에 검사로직을 배치하는것입니다.
        // return이 실행되는 순간 메서드는 종료되기 때문에 핵심 로직을 불완전한 상태로 수행하지 않습니다.

        if(calculateType == null){
            return result;
        }

        // num2가 0인지 아닌지 여부만 확인하면, 더하기 빼기 곱하기 등 0이어도 상관없는 연산까지 막으므로
        // 조건식은 DIVIDE이면서 동시에 num2가 0인경우만 처리
        if(calculateType.equals(CalculateType.DIVIDE) && num2 == 0){
            throw new RuntimeException("0으로 나눌 수 없습니다.");
        }

        if(calculateType.equals(CalculateType.ADD)){
            result = num1 + num2;
        } else if(calculateType.equals(CalculateType.MINUS)){
            result = num1 - num2;
        } else if(calculateType.equals(CalculateType.MULTIPLY)){
            result = num1 * num2;
        } else if(calculateType.equals(CalculateType.DIVIDE)){
            result = num1 / num2;
        }
        return result;
    }
}
