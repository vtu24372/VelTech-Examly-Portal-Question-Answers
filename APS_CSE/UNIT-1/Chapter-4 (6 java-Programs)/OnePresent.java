import java.util.Scanner;

class OnePresent{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.nextInt()==1)
                count++;
        }
        System.out.print(" Total 1's count : " + count);
    }
}