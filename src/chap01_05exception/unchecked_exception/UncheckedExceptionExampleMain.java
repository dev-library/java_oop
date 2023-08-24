package chap01_05exception.unchecked_exception;

public class UncheckedExceptionExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        // throws로 던져진 예외이지만 try~catch를 강요받지는 않음
        // try~catch를 사용하는게 불가능하지는 않음
        // try~catch 주석을 풀어도 돌아가고 안 풀어도 돌아가고.

        //try {
            client.throwsUncheckedExceptionMethod();
        //} catch(UncheckedException e){
            // 예외처리 구문
        //    e.printStackTrace();
        //}


        // throws가 아닌 특정 메서드 내부에서 예외를 발생시키는데 예외처리를 해주지 않은 경우도 마찬가지
        client.tryCatchUncheckedExceptionMethod();
    }
}
