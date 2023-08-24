package chap01_07optional.with_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapRepository {
    private Map<String, String> map = new HashMap<>();

    MapRepository() {
        map.put("EXIST_KEY", "value");
    }

    public Optional<String> getOptionalValue(String key){
        return Optional.ofNullable(map.get(key)); // 옵셔널 생성
    }

    public String getValue(String key){
        return map.get(key);// 입력받은 key에 매칭된 value 리턴
    }
}
