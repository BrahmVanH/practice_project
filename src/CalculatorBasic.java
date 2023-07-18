import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {

        System.out.println("Odin Tech Basic Calculator");
        System.out.println("Capable of basic addition, subtraction, multiplication, and division");

        Scanner Calc = new Scanner(System.in);
        int n1;
        int n2;
        int solution;

        System.out.println("Please enter first integer...");
        n1 = Calc.nextInt();
        System.out.println("Please enter second integer...");
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
