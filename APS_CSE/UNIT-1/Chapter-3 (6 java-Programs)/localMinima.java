import java.util.Scanner;

class localMinima{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            a[i] = s.nextInt();
        }

        for(int i=1; i<n; i++){
            if(a[i]<a[i-1] && a[i]<a[i+1]){
                System.out.print(a[i]);
                return;
            }
        }
    }
}