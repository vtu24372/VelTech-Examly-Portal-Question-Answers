import java.util.Scanner;

public class SumOfAnNaturalNumber{
    static int naturalNumber(int n){
        int sum = 0;
        sum = (n*(n+1))/2;
        return sum;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value to perform the sum of natural number : ");
        int n = s.nextInt();
        System.out.print("The sum of n natural number for the input is : "+naturalNumber(n));
    }
}
