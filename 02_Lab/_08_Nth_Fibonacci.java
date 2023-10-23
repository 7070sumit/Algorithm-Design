import java.util.Scanner;

public class _08_Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int number = Fibonacci(n);
        System.out.println("Fibonacci Number=" + number);

    }

    public static int Fibonacci(int n) {
        int secondlast = 0;
        int last = 1;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int num = 0;
        for (int i = 2; i <= n; i++) {
            num = last + secondlast;
            secondlast = last;
            last = num;
        }
        return num;
    }

}
