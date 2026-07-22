import java.util.*;
public class insert {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        System.out.println("enter sorted elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int tar=sc.nextInt();
        if(tar<arr[0]){
            System.out.println("index -- 0");
        }
        if(tar>arr[n-1]){
            System.out.println("index -- "+n);
        }
        for(int i=0;i<n-1;i++){
            if(tar>arr[i] && tar<arr[i+1]){
                System.out.println("index -- "+i+1);
                return;
            }
        }
    }
}
