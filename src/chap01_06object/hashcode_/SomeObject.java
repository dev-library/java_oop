package chap01_06object.hashcode_;

import java.util.Objects;

public class SomeObject {
    private int intField;
    private String stringField;

    public SomeObject(int intField, String stringField){
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField(){
        return intField;
    }

    public String getStringField(){
        return stringField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeObject that = (SomeObject) o;
        return intField == that.intField && Objects.equals(stringField, that.stringField);
    }

    // 해시값을 구하는 기준을 레퍼런스 주소를 기준으로 잡는지 아니면 멤버변수에 대입된 값으로 잡는지 차이를 만듦
    @Override
    public int hashCode() {
        return Objects.hash(intField, stringField);
    }
}
