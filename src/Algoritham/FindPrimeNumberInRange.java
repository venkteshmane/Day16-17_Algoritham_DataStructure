package Algoritham;

public class FindPrimeNumberInRange {
	 //method to find  prime numbers from 0 to 1000
    public static int Prime() {
        for(int no = 2; no<=1000 ; no++) {
            int temp = 0;

            for(int i = 2 ; i< no/2 ; i++) {
                if(no % i == 0) {
                    temp++;
                }
            }
            if(temp == 0)
            {
                System.out.println(no);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(Prime());
    }
}