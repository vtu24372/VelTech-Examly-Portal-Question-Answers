import java.util.Scanner;

public class DeleteAtBeginning{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = s.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the values one after another : ");
            array[i] = s.nextInt();
        }

        for(int i=1; i<n; i++){
            System.out.print(array[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}