package chap02_01lessif.many_if;

public class Client {
    public int someMethod(CalculateCommand calculateCommand){
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        // 1. CalculateType이 null이라면 연산이 되지 않음. -> null 검사를 매 로직마다 합니다.
        // 2. DIVIDE 시에 num2가 0이면? -> 0인지 검사해서 0이면 예외발생, 아니면 처리
        // 위 2개 이슈를 해결할 수 있는 방식으로 if문 고치기
        if(calculateType != null && calculateType.equals(CalculateType.ADD)){
            result = num1 + num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.MINUS)){
            result = num1 - num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.MULTIPLY)){
            result = num1 * num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.DIVIDE)){
            if(num2 != 0) {
                result = num1 / num2;
            } else {
               throw new RuntimeException("0으로 나눌 수 없습니다.");
            }
        }
        return result;
    }
}
