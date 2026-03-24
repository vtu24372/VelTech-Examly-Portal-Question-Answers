import java.util.*;
import java.util.Scanner;

public class UpperAndLower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the sequnce : ");
        String s = sc.nextLine();

        System.out.println("The sequnce after converted to Upper case : "+s.toUpperCase());
        System.out.println("The sequnce after converted to Lower case : "+s.toLowerCase());

    }
}