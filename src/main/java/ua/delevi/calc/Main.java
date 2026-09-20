package ua.delevi.calc;

public class Main {
    public static void main(String[] args) {

        double firstOperand,secondOperand;
        String operator;

        try {
            if(args.length != 3) {
                throw new IllegalArgumentException("Expected: {number} {operator} {number}");
            }

            firstOperand = Double.parseDouble(args[0]);
            operator = args[1];
            secondOperand = Double.parseDouble(args[2]);
            double result = Calculator.calculate(firstOperand,operator,secondOperand);
            prettyPrint(result);
        }
        catch(NumberFormatException e) {
            System.err.println("Wrong number format");
            System.exit(1);
        }
        catch(IllegalArgumentException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }


    }
    private static void prettyPrint(double x) {

        if(x == (long)x) {
            System.out.println((long) x);
        } else {
            System.out.println(x);
        }

    }
}