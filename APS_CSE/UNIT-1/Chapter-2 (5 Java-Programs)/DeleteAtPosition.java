import java.util.Scanner;

public class DeleteAtPosition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = s.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the values one by one : ");
            array[i] = s.nextInt();
        }

        System.out.print("Enter the element to remove : ");
        int position = s.nextInt();
        for(int i=position-1; i<n-1; i++){
            array[i] = array[i+1];
        }

        for(int i=0; i<n-1; i++){
            System.out.print(array[i]);
            if(i<n-2){
                System.out.print(" ");
            }
        }
    }
}