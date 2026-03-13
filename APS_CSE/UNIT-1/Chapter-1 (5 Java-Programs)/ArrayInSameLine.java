
import java.util.Scanner;

public class ArrayInSameLine{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter the elements : ");
            array[i] = s.nextInt();
        }

        for(int i=0; i<5; i++){
            if(i==4){
                System.out.print(array[i]);
            } else{
                System.out.print(array[i]+" ");
            }
        }
    }
}