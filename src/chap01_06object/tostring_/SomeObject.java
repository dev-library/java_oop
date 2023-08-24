package chap01_06object.tostring_;

public class SomeObject {
    private int intField;
    private String stringField;

    public SomeObject(int intField, String stringField){
        this.intField = intField;
        this.stringField = stringField;
    }

    // 우클릭 -> generate -> toString()
    @Override
    public String toString() {
        return "SomeObject{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
