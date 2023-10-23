import java.util.Scanner;

public class _04_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n");
        int n = sc.nextInt();
        int number = Fibonacci(n);
        System.out.println("Fibonacci Number=" + number);
    }

    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
