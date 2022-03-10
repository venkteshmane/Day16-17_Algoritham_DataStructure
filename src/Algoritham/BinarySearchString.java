package Algoritham;

import java.util.Scanner;

public class BinarySearchString {

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

        Scanner sc = new Scanner(System.in);

        String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "xyz"};
        String x = "xyz";

        int result = binarySearchString(arr, x);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element fount at psition " + result);
        }
    }
}