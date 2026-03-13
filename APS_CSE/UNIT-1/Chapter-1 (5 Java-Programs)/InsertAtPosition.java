import java.util.Scanner;

public class InsertAtPosition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] array = new int[6];

        for(int i=0; i<5; i++){
            System.out.print("Enter the elements : ");
            array[i] = s.nextInt();
        }

        System.out.print("Enter the position of the element : ");
        int position = s.nextInt();

        System.out.print("Enter the elements to be insert : ");
        int element = s.nextInt();

        for(int i=5; i>=position; i--){
            array[i] = array[i-1];
        }
        array[position-1] = element;

        for(int i=0; i<6; i++){
            if(i==5) System.out.print(array[i]);
            else System.out.print(array[i]+" ");
        }
    }
}