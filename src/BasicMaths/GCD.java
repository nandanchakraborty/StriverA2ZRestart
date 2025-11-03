package BasicMaths;

import java.util.Scanner;

public class GCD {
    public static  int findGcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number to find gcd : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println  ("gcd of "+ n  +" and "+ m +" is "+findGcd(n,m));

    }
}
