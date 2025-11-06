package SolvingProblemOnArray;

import java.util.Scanner;

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        System.out.println("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar[i] = b;
        }
        System.out.println("enter number of rotation");
        int k = sc.nextInt();
        k = k % n;  // to handle k greater than n

        rotation(ar, 0, n - 1);
        rotation(ar, 0, k - 1);
        rotation(ar, k, n - 1);
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }


    private static void rotation(int[] ar, int start, int end) {
        while(start<= end){
            int temp = ar[start];
            ar[start] =ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }
}
