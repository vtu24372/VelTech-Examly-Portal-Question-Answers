import java.util.Scanner;
public class Factorial{
    static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value to perform the Factorial: ");
        int n = s.nextInt();
        System.out.print("The factorial of an integer is : "+fact(n));

    }
}