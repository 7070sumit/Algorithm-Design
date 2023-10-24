import java.util.Scanner;

public class _07_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter Power");
        int p = sc.nextInt();
        int value = Power(n, p);
        System.out.println(n + "^" + p + "=" + value);

    }

    public static int Power(int num, int pow) {
        if (pow == 0)
            return 1;
        if (pow == 1)
            return num;
        return num * Power(num, pow - 1);
    }
}
