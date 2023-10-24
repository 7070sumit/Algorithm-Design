//Linear search approch for finding Maximum and Minimum element of a given array. 

package _02_Max_Min;

import java.util.Scanner;

public class Linear_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter Array Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }
        System.out.println("Maximum Element=" + max);
        System.out.println("Minimum Element=" + min);
    }
}
