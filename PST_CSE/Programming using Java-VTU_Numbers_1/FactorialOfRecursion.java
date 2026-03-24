import java.util.Scanner;

public class FactorialOfRecursion{
    static int Recursion(int n){
        if(n==0 || n==1){
            return 1;
        } else{
            return n*Recursion(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value to perfom Recursive factorial : ");
        int n = s.nextInt();
        System.out.print("The Factorial of Recursive is : "+Recursion(n));
    }
}