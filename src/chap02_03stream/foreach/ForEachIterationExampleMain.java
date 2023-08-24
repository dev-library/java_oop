package chap02_03stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachIterationExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);
                                    // 익명함수를 내부에서 받는 반복문
        integerList.stream().forEach(integer -> { //integer변수에 매번 10, 20, 30... 을 번갈아가면서 대입
            System.out.println(integer);// 해서 콘솔창에 해당 값을 찍어줌
        });
    }
}
