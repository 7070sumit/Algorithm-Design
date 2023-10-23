import java.util.Scanner;

public class _01_Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = Sum_of_numbers(arr);
        System.out.println("Sum of the given Array==" + a);
    }

    public static int Sum_of_numbers(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
