package Algoritham;

import java.util.*;
import java.lang.*;

public class MergeSort {
    int[] tempArray;
    static int length;
    static int[] array;

    public static void main(String[] args) {
        int[] inputArray = {5, 12, 10, 9, 1};
        MergeSort ms = new MergeSort();
        ms.sort(inputArray);
    }

    public void sort(int[] inputArray) {
        this.array = inputArray;
        this.length = array.length;
        this.tempArray = new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int low, int high) {
        if(low<high)
        {
            int mid = (low + high)/2;

            divideArray(low, mid);
            divideArray(mid+1, high);
            mergeArray(low,mid,high);
            print();
        }
    }


    public void mergeArray(int low, int mid, int high) {
        for(int i = low ; i<=high ;i++)
        {
            tempArray[i] = array[i];
        }

        int i = low;         //Initial 1st index for sub array
        int j = mid+1;
        int k = low;         //Initial 2nd index for sub array

        while(i<=mid && j<=high)
        {
            if(tempArray[i] <= tempArray[j])
            {
                array[k] = tempArray[i];
                i++;
            }
            else
            {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static void print() {
        for(int print = 0; print<length; ) {
            System.out.println(array[print]);   // sorted array
        }
    }
}