package chap01_04enum.adv;

public class Client {
    public int someMethod(CalculateCommand calculateCommand){
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = calculateType.calculate(num1, num2);

        return result;
    }
}
