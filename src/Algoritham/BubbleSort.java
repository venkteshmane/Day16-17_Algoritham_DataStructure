package Algoritham;
import java.util.*;
public class BubbleSort {

	static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BubbleSort obj = new BubbleSort();
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the values for the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        obj.bubbleSort(arr);
    }
}