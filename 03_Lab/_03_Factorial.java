import java.util.Scanner;

public class _03_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n");
        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println("Factorial=" + fact);

    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * Factorial(n - 1);

    }
}
