package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstNumber = number % 10;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number / 100;

        System.out.println(firstNumber + "" + secondNumber + "" + thirdNumber);


    }
}
