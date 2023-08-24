package chap02_02encap.prev_code;

public class PreviousCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                null,
                100,
                0
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
