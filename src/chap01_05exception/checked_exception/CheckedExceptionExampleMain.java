package chap01_05exception.checked_exception;

public class CheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        // 해당 메서드가 throws로 본인을 호출하는 지역에서 예외처리를 하라고 떠넘긴 상태이므로
        // 현재 호출하고있는 CheckedExcpetionExampleMain에서 try~catch를 작성해야함
        try {
            client.throwsCheckedExceptionMethod();
        } catch(CheckedException e){
            // 예외처리 완료
            e.printStackTrace();
        }


        // 해당 메서드는 내부적으로 이미 try~catch 구문이 작성 완료된 상태이므로
        // 호출 구역에서 따로 try~catch를 처리해줄 필요가 없음
        client.tryCatchCheckedExceptionMethod();
    }
}
