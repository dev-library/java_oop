package chap03_01lsp;

public class Child extends Parent {
    @Override
    public void someMethod(int input){
        // 자식은 양수만 처리가능
        if(input <= 0){
            throw new RuntimeException("양수만 받을 수 있습니다!!!!!!!");
        }

        System.out.println("Child 젇상적으로 호출됨.");
    }
}
