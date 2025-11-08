package SolvingProblemOnArray;

import java.util.Scanner;

public class MaxConsecutiveOne {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxRange = 0;
        for (int num : nums) {
            if (num == 1) {
                 count++;
                 maxRange = Math.max(maxRange, count);
            } else count = 0;
        }
        return maxRange;
    }


    public static void main(String[] args) {
        System.out.println("size of nums :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            nums[i] = b;
        }
        int numberOfOne = findMaxConsecutiveOnes(nums);
        System.out.println("Max number of consecutive ones" + numberOfOne);
    }
}

/*
485. Max Consecutive Ones(LeetCode)
Solved
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
