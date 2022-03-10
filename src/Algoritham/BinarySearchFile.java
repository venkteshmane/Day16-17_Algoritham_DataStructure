package Algoritham;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFile {

    // BINARY SEARCH FOR STRING
    public static int binarySearchString(String[] arr, String x) {

        int low = 0;
        int high = arr.length - 1;

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
        File file = new File("/home/ubuntu/Desktop/ABC.java");
        try
        {
            Scanner sc = new Scanner(file);
            String name = sc.nextLine();
            String[] arr = name.split(" ");
            Arrays.sort(arr);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the word to be searched:");
            String word = sc1.next();

            int iret = binarySearchString(arr,word);

            if(iret == -1) {
                System.out.println("Not found");
            } else {
                System.out.println("Found at position :"+iret);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}