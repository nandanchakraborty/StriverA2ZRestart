package SolvingProblemOnArray;

import java.util.Scanner;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        System.out.println("size of nums :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            nums[i] = b;
        }
        MovedZeros(nums, n);
    }

    private static void MovedZeros(int[] nums, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
            if (j == -1) System.out.println("nothing");
            for (int i = j + 1; i < n; i++) {

                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    j++;
                }
            }


        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}



