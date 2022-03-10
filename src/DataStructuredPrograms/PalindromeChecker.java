package DataStructuredPrograms;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String string = sc.next();
        DequeueUtility<Character> utility=new DequeueUtility<Character>();

        //adding each character to the rear of the deque
        for(int i=0;i<string.length();i++) {
            char character =string.charAt(i);
            utility.addRear(character);
        }
        int flag = 0;

        while(utility.size()>1) {
            if(utility.removeFront()!=utility.removeRear()) {
                flag=1;
                break;
            }
        }

        if(flag == 0) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }
}
class Dequeue<E>{
    public E data;
    public Dequeue<E>next;
    public Dequeue<E>pre;

    public Dequeue() {
        this.next=null;
        this.pre=null;
    }
    public Dequeue(E val) {
        this.data=val;
        this.next=null;
        this.pre=null;
    }
}
class DequeueUtility<E> {

    public DequeueUtility(){
    }
    Dequeue<E> front;
    Dequeue<E> rear;
    int size=0;

    //add front
    public void addFront(E c) {
        if(front==null) {           //if no element in list
            front.data=c;
            rear=front;
        } else {                    //if element in list
            Dequeue<E>tNode=null;
            tNode.data=c;
            tNode.next=front;
            front.pre=tNode;
            front=tNode;
        }
        size++;
    }

    //add rear
    public void addRear(E c) {
        if(front==null)  {          //if no element in list
            Dequeue<E>tNode=new Dequeue<E>(c);
            front=tNode;
            rear=front;
        } else {                   //if element in list{
            Dequeue<E>tNode=new Dequeue<>(c);
            rear.next=tNode;
            tNode.pre=rear;
            rear=tNode;
        }
        size++;
    }
    //remove front
    public E removeFront() {
        E val=null;
        if(front==null) {
            System.out.println("No elements to delete");
        } else {
            val=front.data;
            front=front.next;
        }
        size--;
        return val;
    }
    //remove rear
    public E removeRear() {
        E val=null;
        if(front==null) {
            System.out.println("No element to delete");
        } else {
            val=rear.data;
            rear=rear.pre;
            rear.next=null;
        }
        size--;
        return val;
    }

    //to remove
    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
    //return size of deque
    public int size() {
        return size;
    }
}