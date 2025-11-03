package BasicMaths;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int reverse = 0, duplicateN = n;

            while(n>0){
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n/10;

            }

            if(duplicateN == reverse)
            {
              return true;
            }
            else return false;




    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println  ("Is palindrome ?: "+isPalindrome(n));

    }
}