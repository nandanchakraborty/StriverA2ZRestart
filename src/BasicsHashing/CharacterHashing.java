package BasicsHashing;



import java.util.Scanner;

public class CharacterHashing {
    public static int[] hashingCharacter(String s){
        int[] hss = new int[256];

        for(int i=0;i<s.length();i++){
            hss[s.charAt(i )- 'a'] ++;
        }

        return hss;
    }
    public static void main(String []args){
        System.out.println("enter string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("enter number of query :");
        int q = sc.nextInt();
        int [] hs = hashingCharacter(s);
        while(q > 0){
            q--;
            System.out.print(" enter char to find the number of occurance in the array : ");
            char ch = sc.next().charAt(0);
            System.out.println(hs[ch- 'a']);

        }
    }
}
