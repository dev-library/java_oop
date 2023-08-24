package chap01_05exception.unchecked_exception;

import java.io.FileNotFoundException;

public class Client {
    public void throwsUncheckedExceptionMethod() throws UncheckedException {
        throw new UncheckedException();
    }

    public void tryCatchUncheckedExceptionMethod() {
        // try~catch 처리를 throws가 아닌 형태에서도 사용 가능
        //try {
            throw new UncheckedException();
        //} catch(UncheckedException e){
        //    e.printStackTrace();
        //}

    }
}
