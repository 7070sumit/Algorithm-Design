import java.util.Scanner;

public class _01_Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstindex = 0;
        int length = arr.length;
        int sum = Sum_Of_number(arr, firstindex, length);
        System.out.println("Sum of numbers=" + sum);
    }

    public static int Sum_Of_number(int arr[], int i, int l) {
        if (i == l)
            return 0;

        return arr[i] + Sum_Of_number(arr, i + 1, l);

    }
}