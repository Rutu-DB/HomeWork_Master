package homeworkWeek8;

public class SimpleCalculator {
    double firstNumber, secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubstractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiResult());
        System.out.println("Division = " + calculator.getdivisionResult());


    }

    public double getFirstNumber() {
        return firstNumber;

    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double number1) {
        this.firstNumber = number1;
    }

    public void setSecondNumber(double number2) {
        this.secondNumber = number2;
    }

    public double getAdditionResult() {
        double add;
        add = firstNumber + secondNumber;
        return add;
    }

    public double getSubstractionResult() {
        double sub;
        sub = firstNumber - secondNumber;
        return sub;
    }

    public double getMultiResult() {
        double multi;
        multi = firstNumber * secondNumber;
        return multi;
    }

    public double getdivisionResult() {
        double div;
        div = firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0;
        } else {
            return div;
        }
    }
}
