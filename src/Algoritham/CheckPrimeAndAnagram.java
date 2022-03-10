package Algoritham;

public class CheckPrimeAndAnagram {
	// Method for Prime with Anagram
    public static int primeAnagram() {
        int newarray[] = new int[1000];
        for(int no = 2; no<=1000 ; no++) {
            int temp = 0;
            for(int i = 2 ; i< no/2 ; i++) {
                if(no % i == 0) {
                    temp++;
                }
            }
            int j = 0;
            if(temp == 0) {
                newarray[j] = no;
                j++;
            }
        }
        for(int i = 0;i < newarray.length;i++) {
            System.out.println(newarray[i]);
        }
        return 0;
    }

    public static void main(String[] args) {

        primeAnagram();
    }
}