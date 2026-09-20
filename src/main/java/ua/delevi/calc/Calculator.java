package ua.delevi.calc;

public class Calculator {
    public static double calculate(double firstOperand, String operator, double secondOperand) {
        return switch (operator) {
            case "+" ->   firstOperand + secondOperand;
            case "-" ->  firstOperand - secondOperand;
            case "/" -> {
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                    yield firstOperand / secondOperand;
            }
            case "*" ->  firstOperand * secondOperand;
            default -> throw new IllegalArgumentException("Wrong operator: " + operator);

        };
    }

}