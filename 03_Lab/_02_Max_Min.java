import java.util.Scanner;

public class _02_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Max_Element(arr, n);
        int min = Min_Element(arr, n);
        System.out.println("Maximum Element=" + max);
        System.out.println("Minimum Element=" + min);
    }

    public static int Max_Element(int arr[], int n) {
        if (n == 1)
            return arr[0];
        return Math.max(arr[n - 1], Max_Element(arr, n - 1));
    }

    public static int Min_Element(int arr[], int n) {
        if (n == 1)
            return arr[0];
        return Math.min(arr[n - 1], Min_Element(arr, n - 1));
    }
}
