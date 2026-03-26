import java.util.Scanner;

class FirstRepeating{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elements : ");
            a[i] = s.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]);
                    return;
                }
            }
        }
    }
}