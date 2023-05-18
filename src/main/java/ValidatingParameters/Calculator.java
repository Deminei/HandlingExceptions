package ValidatingParameters;

import java.util.Scanner;

public class Calculator {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number must be non-negative.");
        }

        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public long binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("The numbers must be non-negative.");
        }

        if (k > n) {
            throw new IllegalArgumentException("The subset size cannot exceed the set size.");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a non-negative number for factorial calculation: ");
        int number = input.nextInt();
        Calculator calc = new Calculator();

        try {
            long fact = calc.factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Enter the first number for binomial coefficient calculation: ");
        int n = input.nextInt();
        System.out.println("Enter the second number for binomial coefficient calculation: ");
        int k = input.nextInt();

        try {
            long binomial = calc.binomialCoefficient(n, k);
            System.out.println("Binomial coefficient of (" + n + ", " + k + ") is: " + binomial);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        input.close();
    }
}

