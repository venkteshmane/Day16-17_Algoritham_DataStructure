package DataStructuredPrograms;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList {

    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(new File("/home/Desktop/ABC.java"));
            LinkedList<Integer> list = new LinkedList<Integer>();

            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                } else {
                    sc.next();
                }
            }
            Collections.sort(list);
            for (Integer i: list) System.out.println(i);

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter the number to be searched");
            int number = sc1.nextInt();

            boolean status = list.contains(number);

            if(status)
            {
                list.remove(number);
                System.out.println("list is : "+list);
            } else {
                list.push(number);
                System.out.println("list is : "+list);
            }

            boolean isEMPTY = list.isEmpty();
            if(isEMPTY)
            {
                System.out.println("The list is EMPTY");
            } else {
                System.out.println("The list is not EMPTY...");
                System.out.println("Size of the LinkedList : "+list.size());
            }

            System.out.println("Index position is : "+list.indexOf(number));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}