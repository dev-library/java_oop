package chap01_05exception.checked_exception;

// Exception을 상속하는 클래스는 checked exception이 됩니다.
// 이 경우, 해당 예외를 발생시키는 상황에서는 무조건 try~catch구문을 써야 합니다.
public class CheckedException extends Exception {
}
