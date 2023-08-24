package chap01_07optional.without_optional;

public class WithoutOptionalExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
                                                // 존재하지 않는 키로 조회(결과가 NULL)
        String string = mapRepository.getValue("NOT_EXIST_KEY");

        System.out.println("string=" + string);

        //System.out.println(string.toUpperCase());// 다 대문자로 바꿔서 출력하나, 여기서 NullPointerException 발생

        if(string != null){ // 조건문으로 널 검사 후에
            System.out.println(string.toUpperCase());
        }
    }
}
