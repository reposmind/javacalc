import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean work = true;

        while (work) {
            System.out.println("Welcome to the super puper calculator!");

            System.out.print("Please enter first number: ");
            double a = scan.nextDouble();

            System.out.print("Please enter second number: ");
            double b = scan.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = scan.next();

            double result = 0;
            boolean validOp = true;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        validOp = false;
                    } else {
                        result = a / b;
                    }
                    break;
                default:
                    System.out.println("Unknown operator: " + op);
                    validOp = false;
                    break;
            }

            if (validOp) {
                System.out.printf("Result is: %.2f%n", result);
            }

            System.out.print("Start again? (1 = Yes / 0 = No): ");
            int choice = scan.nextInt();

            if (choice == 0) {
                work = false;
                System.out.println("Goodbye!");
            }
            // Entering 1 naturally loops back around without hitting a return statement
        }

        scan.close();
    }
}