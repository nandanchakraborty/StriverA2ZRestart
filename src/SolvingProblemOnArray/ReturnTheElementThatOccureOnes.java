package SolvingProblemOnArray;

import java.util.Scanner;

/**
Leetcode
 * Hint
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.

 * Example 1:

 * Input: nums = [2,2,1]

 * Output: 1
 */
public class ReturnTheElementThatOccureOnes {
    public static int singleNumber(int[] nums) {
        int value =0;
        for(int i =0;i<nums.length;i++){
            value = value ^ nums[i];

        }
        return value;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar1[i] = b;
        }
        int singleValue = singleNumber(ar1);
        System.out.println("value that appear one "+singleValue);


    }
}
