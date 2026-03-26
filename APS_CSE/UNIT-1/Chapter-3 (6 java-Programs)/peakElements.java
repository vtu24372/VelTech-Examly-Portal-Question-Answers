import java.util.Scanner;

class peakElements{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            a[i] = s.nextInt();
        }

        System.out.print("{");

        for(int i=1; i<n-1; i++){
            if(a[i]>=a[i-1] && a[i]>=a[i+1])
                System.out.print(a[i] + " ");
        }

        System.out.print("}");
    }
}