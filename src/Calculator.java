public class Calculator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";

    static double calculate (double x, double y, String operator) throws UnknownOperatorException {
        double result = 0;

        switch (operator) {
            case PLUS:
                result = x + y;
                break;
            case MINUS:
                result = x - y;
                break;
            case MULTIPLICATION:
                result = x * y;
                break;
            case DIVISION:
                if (y == 0) {
                    throw new ArithmeticException("CANNOT BE DIVIDED BY ZERO!!!");
                }
                result = x/y;
                break;
                default:
                    throw new UnknownOperatorException("You use an undefined arthmetic operation");
        }
        return result;
    }
}
