import java.util.*;
import java.util.Scanner;

public class RemoveConsecutiveVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String sequence : ");
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        String result = "";

        for(int i=0; i<s.length(); i++){
            if(i>0 && v.indexOf(s.charAt(i))!=-1 && v.indexOf(s.charAt(i-1))!=-1)
            continue;
            result += s.charAt(i);
        }

        System.out.print(result);

    }
}