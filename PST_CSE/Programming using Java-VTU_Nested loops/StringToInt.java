import java.util.*;
import java.util.Scanner;

public class StringToInt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string sequence : ");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            if(! Character.isDigit(s.charAt(i))){
                System.out.print(0);
                return;
            }
        }

        System.out.print(Integer.parseInt(s));
    }
}