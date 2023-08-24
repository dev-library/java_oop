package chap02_03stream.map;

import java.util.ArrayList;
import java.util.List;

public class ForMapExampleMain {
    public static void main(String[] args) {
        // [1, 2, 3, 4] 가 저장된 리스트를 [10, 20, 30, 40]으로 일괄 변경
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Integer> x10IntegerList = new ArrayList<>();

        for(int i = 0; i < integerList.size(); i++){
            // 개별 요소를 반복문으로 접근해 10 곱하고 새 리스트에 add
            x10IntegerList.add(integerList.get(i) * 10);
        }
        System.out.println(x10IntegerList);
    }
}
