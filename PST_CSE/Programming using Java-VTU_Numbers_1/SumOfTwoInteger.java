import java.util.Scanner;

public class SumOfTwoInteger{
    static int SumOfInteger(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n1 :");
        int n1=s.nextInt();
        System.out.print("Enter the value of n2 :");
        int n2=s.nextInt();
        int a=SumOfInteger(n1, n2);
        System.out.print("The sum of 2 integer is : "+a);
    }
}