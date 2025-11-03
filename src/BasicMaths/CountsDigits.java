package BasicMaths;

import java.util.Scanner;

public class CountsDigits {
    public static int  countDigit(int n){

        int cnt = 0;
        while(n>0){
            n = n/10;
            cnt++;
        }
        return cnt;




    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println  ("Number of digits : "+countDigit(n));

    }
}