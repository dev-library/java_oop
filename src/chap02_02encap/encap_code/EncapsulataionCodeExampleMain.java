package chap02_02encap.encap_code;

public class EncapsulataionCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD,
                100,
                3
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
