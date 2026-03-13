import java.util.Scanner;

public class InsertAtEnd{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] array = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter the Elements: ");
            array[i] = s.nextInt();
        }
        
        System.out.print("Enter the element to insert at End : ");
        int element = s.nextInt();

        for(int i=0; i<5; i++){
        System.out.print(array[i]+" ");
        }
        
        System.out.print(element);
    }
}