import java.util.Scanner;
import java.util.*;

class repeatedSequence{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            a[i] = s.nextInt();
        }

        Arrays.sort(a);

        for(int i=1; i<n; i++){
            if(a[i]!=a[i-1]+1){
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}