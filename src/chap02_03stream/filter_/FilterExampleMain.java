package chap02_03stream.filter_;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);
                                                    // 40을 찾는 익명함수
        Integer findNumber = integerList.stream().filter(integer -> {
            System.out.println(integer);

            if(integer.equals(40)){
                return true; // true를 리턴하는것이 아니고, 필터로 찾을 자료가 맞다는 인증
            }
            return false;// false를 리턴하는것이 아니고 필터로 거를 자료라는 인증
        }).findAny().get();
        System.out.println("findNumber=" + findNumber);
    }
}
