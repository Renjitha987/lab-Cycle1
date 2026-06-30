import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction = " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication = " + (a * b));
                    break;

                case 4:
                    System.out.println("Division = " + (a / b));
                    break;

                case 5:
                    System.out.println("Modulus = " + (a % b));
                    break;
            }
        }

        sc.close();
    }
}