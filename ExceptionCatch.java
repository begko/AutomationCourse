import java.util.Scanner;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class ExceptionCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number (b): ");
            int b = scanner.nextInt();

            if (b == 0) {
                throw new MyCustomException("Error: Division by zero!");
            }

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (MyCustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Operation completed (finally block executed).");
            scanner.close();
        }
    }
}
