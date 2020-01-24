import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = 0.0;
        double y = 0.0;
        String operator = null;
        boolean readComplet = false;

        while (!readComplet) {
            try {
            System.out.println("Please, give number x ");
            x = input.nextDouble();
            input.nextLine();
            System.out.println("Please, give me operator ( +,-,*,/ ) ");
            operator = input.nextLine();
            System.out.println("Please, give me nuber y ");
            y = input.nextDouble();
            readComplet = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid data entered, start again");
                input.nextLine();
            }
        }
        try {
            double result = Calculator.calculate(x, y, operator);
            System.out.println(x + " " + operator + " " + y + " = " + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Failed to calculate expression result " + x + " " + operator + " " + y);
        }

    }
}
