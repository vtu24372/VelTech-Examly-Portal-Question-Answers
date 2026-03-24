import java.util.*;
import java.util.Scanner;

public class NumberValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for validation : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String p = sb.substring(0,3);

        if(sb.indexOf("+91")==0 && p.compareTo("+91")==0 && sb.length()==13){
            System.out.print("The number is valid");
        } else{
            System.out.print("The number is invalid");
        }
    }
}