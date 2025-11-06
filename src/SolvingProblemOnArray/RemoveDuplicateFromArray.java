package SolvingProblemOnArray;

import java.util.Scanner;

public class RemoveDuplicateFromArray {
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
        System.out.println("unique element :"+ removeDuplicate(ar,n));
        System.out.println("unique element length without " +
                "using extra space "+remoceDuplicateWithoutExtraSpace(ar,n) ); }

    private static int remoceDuplicateWithoutExtraSpace(int[] ar, int n) {
        int i =0;
        for(int j =1;j<n;j++){
        if(ar[j] != ar[i]){
            i++;
            ar[i] = ar[j];
        }
        }
        return i+1;
    }

    private static int removeDuplicate(int[] nums, int n) {
        int [] newar = new int[n];
        newar[0] = nums[0];
        int j = 1;
        for(int i=1;i<n;i++){
            if(nums [i] != newar[j-1]){
                newar[j] = nums[i];
                j++;
            }
        }


        return j;

    }
}
