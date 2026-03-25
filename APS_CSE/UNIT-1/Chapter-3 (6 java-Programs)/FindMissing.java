import java.util.Scanner;

class FindMissing{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            System.out.print("Enter the values : ");
            sum += s.nextInt();
        }
        
        int total = (n+1)*(n+2)/2;
        System.out.print("The missing elements from the input is : " + (total-sum));
    }
}