import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingUnion {
    public static void main(String[]args)
    {
        System.out.println("size of 1st array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar1[i] = b;
        }
        System.out.println("size of 2nd array :");
        int n1 = sc.nextInt();
        int[] ar2 = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar2[i] = b;
        }
        findingUnionOf2Array(ar1,ar2,n,n1);   }

    private static void findingUnionOf2Array(int[] arr1, int[] arr2,int n,int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Union vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
       System.out.println(Union);
    }
    }

