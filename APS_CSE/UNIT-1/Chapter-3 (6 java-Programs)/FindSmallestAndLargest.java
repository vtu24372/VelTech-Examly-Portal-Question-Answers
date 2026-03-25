import java.util.Scanner;
import java.util.*;

class FindSmallestAndLargest{
    public static void main(String[] args){
    Scanner s  = new Scanner(System.in);
    System.out.print("Enter the size : ");
    int n = s.nextInt();

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    
    for(int i=0; i<n; i++){
        System.out.print("Enter the value : ");
        int num = s.nextInt();

        if(num < min) min = num;

        if(num > max) max = num;
    }
    System.out.print(min + " " + max);
}
}