import java.util.Scanner;

public class InsertAtMiddle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = s.nextInt();
        int[] array = new int[n+1];

        
        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            array[i] = s.nextInt();
        }
        
        System.out.print("Enter the element to be insert at Middle : ");
        int x = s.nextInt();
        int mid = n/2;

        for(int i=n; i>mid; i--){
            array[i] = array[i-1];
        }
        array[mid] = x;

        for(int i=0; i<n; i++){
            if(i==n+1) System.out.print(array[i]);
            else System.out.print(array[i]+" ");
        }
    }
}