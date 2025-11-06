package SolvingProblemOnArray;

import java.util.Scanner;

public class LargestElement {
    public static int FindingLargestElement(int[] arr, int n){
        int large = 0;
        int l=0 ,r = n-1;
        while(l <= r){

            if(arr[l] < arr[r]){


                if(arr[r] > large){
                    large = arr[r];
                }

            }
            else{
                if(arr[l]> large){
                    large = arr[l];
                }
            }
            r--;
            l++;
        }
        return large;


    }

    public static void main(String[] args) {
        System.out.println("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        int largest = LargestElement.FindingLargestElement(arr, n);
        System.out.println("large element of that array is : "+largest);
    }
}
