package DataStructuredPrograms;

import java.util.Scanner;

public class BankingCashCounterMain {

    public static void main(String[] args) {

        BankingCashCounter cash = new BankingCashCounter();

        int choice=0;

        do {
            System.out.println("*******Welcome To Bank Cash Counter******");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Number of people in queue");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Enter the Amount that you want to Deposit :");
                    cash.insert(sc.nextInt());
                    cash.display();
                    break;

                case 2:System.out.println("Enter the Amount to be Withdraw :");
                    sc.nextInt();
                    cash.remove();
                    System.out.println("The Available Account Balance is :");
                    cash.display();
                    break;

                case 3:
                    int num=cash.getSize();
                    System.out.println("The number of people in queue:"+num);
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("You have entered a wrong choice");
                    break;
            }
        }
        while(choice < 5 );
    }
}