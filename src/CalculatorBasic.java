import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {

        System.out.println("Odin Tech Basic Calculator");
        System.out.println("Capable of basic addition, subtraction, multiplication, and division to the 100th decimal.");

        Scanner Calc = new Scanner(System.in);
        double n1;
        double n2;
        double solution;

        System.out.println("Please enter first number...");
        n1 = Calc.nextInt();
        System.out.println("Please enter second number...");
        n2 = Calc.nextInt();
        System.out.println("Please enter order of operation...");
        char operator = Calc.next().charAt(0);

        if (operator == '+') {
            solution = (n1 + n2);
            System.out.println(solution);
        }

        if (operator == '-') {
            solution = (n1 - n2);
            System.out.println(solution);
        }

        if (operator == '*') {
            solution = (n1 * n2);
            System.out.println(solution);
        }

        if (operator == '/') {
            solution = (n1 / n2);
            System.out.println(solution);
        }

    }
}
