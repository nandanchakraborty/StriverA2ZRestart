package BasicsHashing;


import java.util.Scanner;

public class HashingAnArray {
    public static int[] hashingArray(int []arr,int n){
        int[] hss = new int[n+1];

        for(int i=0;i<n;i++){
            hss[arr[i]]++;
        }

        return hss;
    }
    public static void main(String []args){
        System.out.println("size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int  i=0;i<n;i++){
            int b = sc.nextInt();
            arr[i] = b;
        }
        System.out.println("enter number of query :");
        int q = sc.nextInt();
        int [] hs = hashingArray(arr,n);
        while(q > 0){
            q--;
            System.out.print("enter value to find the number of occurance in the array : ");
            int v = sc.nextInt();
            System.out.println(hs[v]);

        }
    }
}
