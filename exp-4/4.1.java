import java.util.Scanner;

public class rotated_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no. of target");
        int tar=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                System.out.println("index -- "+i);
                return;
            }
        }
        System.out.println("index -- -1");
    }
}
