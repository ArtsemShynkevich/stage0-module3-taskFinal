package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstNumber = number / 1000;
        int secondNumber = number % 1000 / 100;
        int thirdNumber = number % 1000 % 100 / 10;
        int fourNumber = number % 1000 % 100 % 10;

        System.out.println(fourNumber + secondNumber + thirdNumber + firstNumber);


    }
}
