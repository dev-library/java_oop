package chap02_02encap.encap_code;

// 연산에 필요한 모든 정보를 담고 있는 코드
public class CalculateCommand {
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public CalculateCommand(CalculateType calculateType, int num1, int num2){
        if(calculateType == null){
            throw new RuntimeException("CalculateType은 필수 값 입니다.");
        }

        if(calculateType == CalculateType.DIVIDE && num2 == 0){
            throw new RuntimeException("0으로 나눌 수 없습니다.");
        }

        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    // 기존 getter 삭제
    // 그럼에도 불구하고 어쨌든 연산 결과를 만들어서 돌려주긴 해야 함
    public int getCalculateResult(){
        CalculateType calculateType = this.calculateType;
        int num1 = this.num1;
        int num2 = this.num2;

        // 생성자에서 이미 유효성 검사가 완료되었고 setter가 없으므로 값이 변경되지 않았음도 보장되므로 바로 연산 가능
        int result = calculateType.calculate(num1, num2);

        return result;
    }
}
