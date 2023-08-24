package chap02_01lessif.check_in_cons;

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

    public CalculateType getCalculateType() {
        return calculateType;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
