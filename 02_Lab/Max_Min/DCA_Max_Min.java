//Divide and Conquer approch for finding Maximum and Minuimum element in a given array.

package Max_Min;

import java.util.Scanner;

public class DCA_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0; // First index of the array
        int j = arr.length - 1; // Last index of the array
        int arr2[] = Max_Min_Array(arr, i, j);
        System.out.println("Maximum of the array=" + arr2[0]);
        System.out.println("Mnimum of the array=" + arr2[1]);
    }

    public static int[] Max_Min_Array(int arr[], int i, int j) {
        int localmax, localmin;
        int max, min, max1, min1, mid;
        int result[] = new int[2];

        // if only one element in the array;
        if (i == j) {
            localmax = arr[i];
            localmin = arr[j];
        }

        // if only two elements in the array;
        else if (i == j - 1) {
            localmax = (arr[i] > arr[j]) ? arr[i] : arr[j];
            localmin = (arr[i] < arr[j]) ? arr[i] : arr[j];
        }

        // if more than two elements in the arry
        else {
            mid = (i + j) / 2;
            int result1[] = Max_Min_Array(arr, i, mid);
            int result2[] = Max_Min_Array(arr, mid + 1, j);
            max = result1[0];
            min = result1[1];
            max1 = result2[0];
            min1 = result2[1];
            localmax = (max > max1) ? max : max1;
            localmin = (min < min1) ? min : min1;
        }
        result[0] = localmax;
        result[1] = localmin;
        return result;
    }

}
