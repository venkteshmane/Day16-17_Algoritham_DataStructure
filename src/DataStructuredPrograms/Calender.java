package DataStructuredPrograms;

import java.util.Scanner;

public class Calender {

    static int[][] arr = new int[5][7];                               // weeks of month & days of week
    static int[] month = {31,29,31,30,31,30,31,30,31,30,31,30};
    static int i,j;
    static int day;

    static void initialize() {
        for (int i = 0;i<arr.length ;i++ ) {
            for(int j=0; j<arr[i].length;j++) {
                arr[i][j] = -10;
            }
        }
    }
    static void display(int m) {
        System.out.println("	Sun Mon Tue Wed Thu Fri Sat    ");
        for(i =0;i<arr.length;i++) {
            for(j =0;j<arr[i].length;j++) {
                if(arr[i][j] < 0 || arr[i][j] > month[m-1]) {
                    System.out.print("\t");
                } else if(arr[i][j] > 0) {
                    System.out.print("\t"+ arr[i][j]+" ");
                }
            }
            System.out.println("\t");
        }
    }
    static void putCalender(int day) {
        int d1 = 1;
        for(i =day;i<arr[0].length;i++) {
            arr[0][i] = d1;
            d1++;
        }
        for(i = 1;i<arr.length;i++) {
            for(j = 0; j<arr[i].length;j++) {
                arr[i][j] = d1;
                d1++;
            }
        }
    }
    static int dayOfWeek(int m, int y) {
        day =1;
        int y0,x,m0,d0;
        y0=y-(14-m)/12;
        x=y0+(y0/4)-(y0/100)+(y0/400);
        m0=m+12*((14-m)/12)-2;
        return d0=(day +x+31*m0/12)%7;
    }
    static void display(int m , int y) {
        day = dayOfWeek(m,y);
        System.out.println("day is "+ day);
        initialize();
        putCalender(day);
        display(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Entr the year");
        int year = sc.nextInt();
        display(month, year);
    }
}