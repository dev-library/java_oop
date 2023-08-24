package chap02_02encap.encap_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        // 클라이언트는 연산 결과를 달라고만 주문하면 됨.
        // 결합도가 낮아짐 -> 다른 클래스 호출 구문의 개수가 줄어듬
        int result = calculateCommand.getCalculateResult();

        return result;
    }
}
