package SolvingProblemOnArray;

import java.util.Scanner;

public class SecondLargestElementAndSecondSmallest {
    public static int Finding2ndSmallElement(int[] arr, int n) {
        int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
                secondSmall = arr[i];

            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    public static int Finding2ndLargestElement(int[] arr, int n) {
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
                secondLarge = arr[i];

            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }

        }


        return secondLarge;
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
        int secondSmall = SecondLargestElementAndSecondSmallest.Finding2ndSmallElement(arr, n);
        int secondLarge = SecondLargestElementAndSecondSmallest.Finding2ndLargestElement(arr, n);
        System.out.println("2nd large element of that array is : " + secondLarge);

        System.out.println("2nd small element of that array is : " + secondSmall);
    }
}
