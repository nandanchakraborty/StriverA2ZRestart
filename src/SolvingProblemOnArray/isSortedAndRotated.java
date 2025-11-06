package SolvingProblemOnArray;

import java.util.Scanner;
/*Given an array nums, return true if the array was originally sorted in
 non-decreasing order, then rotated some number of positions (including zero).
  Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the
same length such that B[i] == A[(i+x) % A.length] for every valid index i.
 */
public class isSortedAndRotated {
    public static boolean isSorted(int []ar,int n){
        int cnt =0;
        for(int i=1;i<n;i++){
            if(ar[i-1]> ar[i])
                cnt++;
        }
        if(ar[n-1] > ar[0])
            cnt++;

        return cnt<=1;
    }
    public static void main(String[]args)
    {
        System.out.println("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar[i] = b;
        }
        System.out.println("is sorted :"+ isSorted(ar,n));
    }
}

