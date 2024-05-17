public class FactorialCalculator {

    // Iterative approach
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive approach
    public static int factorialRecursive(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " (Iterative): " + factorialIterative(number));
        System.out.println("Factorial of " + number + " (Recursive): " + factorialRecursive(number));
    }
}
