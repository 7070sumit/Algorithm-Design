import java.util.Scanner;

public class _05_Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = Find_Gcd(a, b);
        System.out.println("GCD of number=" + gcd);

    }

    public static int Find_Gcd(int x, int y) {
        if (y == 0)
            return x;
        return Find_Gcd(y, x % y);
    }

}
