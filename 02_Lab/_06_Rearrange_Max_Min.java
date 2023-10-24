import java.util.Scanner;

public class _06_Rearrange_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = Rearrange_Max_Min(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] Rearrange_Max_Min(int arr[]) {
        int j = 0;
        int len = arr.length;
        int k = len - 1;
        int temp[] = new int[len];
        if (arr.length % 2 != 0) {
            int mid = len / 2;
            temp[len - 1] = arr[mid];
        }
        for (int i = 0; i < len - 1; i += 2) {
            temp[i] = arr[k];
            temp[i + 1] = arr[j];
            k--;
            j++;
        }
        return temp;
    }

}
