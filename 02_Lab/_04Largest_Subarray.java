//Largest sum contigous sum using Kaden's Algorithm 

import java.util.Scanner;

public class _04Largest_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = Largest_Subarray(arr);
        System.out.println("Maximum contigous subarray=" + sum);
    }

    public static int Largest_Subarray(int arr[]) {
        int maxsum = arr[0];
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum > maxsum)
                maxsum = currsum;
            if (currsum < 0)
                currsum = 0;
        }
        return maxsum;
    }
}
