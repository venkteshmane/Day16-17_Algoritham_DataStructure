package Algoritham;
import java.util.Scanner;

public class BinarySearch {

    // Method for Binary Search For Integer
    public static int BinarySearch(int[] arr, int number) {

        int low = 0,high = arr.length - 1;

        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid] == number) {
                return mid;
            } else if(arr[mid] > number) {
                high = mid -1;
            } else if(arr[mid] < number) {
                low = mid + 1;
            }
        }
        return 0;
    }

    //BINARY SEARCH FOR STRING
    public static int binarySearchString(String[] arr, String x) {

        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = (low +high)/2;
            int res = x.compareTo(arr[mid]);

            if(res == 0) {
                return mid;
            } else if(res> 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n, size;
        Scanner sc = new Scanner(System.in);
        size  = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size ;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        int number = sc.nextInt();

        int ret = BinarySearch(arr,number);

        if(ret == -1) {
            System.out.println("number not found");
        } else {
            System.out.println("number found at"+ret+1);
        }
    }
}