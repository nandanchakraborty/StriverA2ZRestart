package SolvingProblemOnArray;

import java.util.Scanner;

public class FindingMissingValues {

        public static int missingNumber(int[] nums) {

            int sum=0;
            int j=0;
            for(int i = 1;i<=nums.length;i++){
                sum = sum+nums[i-1];
                j = j+i;

            }
            return j - sum;

        }

    public static void main(String []args){
        System.out.println("size of nums :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            nums[i] = b;
        }
       int missingValue =  missingNumber(nums);
        System.out.println("missing value "+ missingValue);
    }}

/*
268. Missing Number
Solved(LeetCode)

Given an array nums containing n distinct numbers in the range [0, n], return the only number in
the range that is missing from the array
 */
