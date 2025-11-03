package BasicMaths;

import java.util.*;

import static java.lang.Math.sqrt;

public class PrintAllDivisors {
    public static List<Integer> PrintingDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++) {
            if ( n %i == 0) {
                list.add(i);
            if (i != n/i)
                list.add(n / i);
            }

        }
        Collections.sort(list);

        return list;





    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find divisors : ");
        int n = sc.nextInt();
       System.out.println("divisors of "+ n + " is " +PrintingDivisors(n));

    }
}