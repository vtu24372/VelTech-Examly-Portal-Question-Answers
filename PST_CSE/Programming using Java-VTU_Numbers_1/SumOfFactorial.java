import java.util.Scanner;

public class SumOfFactorial{
    static int sumFact(int n){
        int sum=0;
        while(n>0){
            sum = sum+n%10;
            n=n/10;
        }

        int f=1;
        for(int i=1; i<=sum; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value to perform the sum of Factorial :");
        int n = s.nextInt();
        System.out.print("The sum of factorial is : "+sumFact(n));
    }
}