package chap03_03dip;

import java.util.NoSuchElementException;

public class Service {

    private Repository repository;

    public Object findById(Long id){
        Object obj = null;

        try {
            obj = repository.findById(id);
        } catch (RecordNotFoundException recordNotFoundException){
            // 예외에 대한 처리(DB)
        } catch (TextNotFoundException textNotFoundException) {
            // 예외에 대한 처리(파일)
        } catch (NoSuchElementException noSuchElementException){
            // 더 추상적이고 보편적인 익셉션을 써야 내부에서 무슨 형식의 매체를 사용하는지 캡슐화 가능
        }
        return obj;
    }
}
