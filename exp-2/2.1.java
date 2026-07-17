import java .util.*;
public class multiple {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int mul=1;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mul*=arr[i];
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=mul/arr[i];
            System.out.print(res[i]+" ");
        }
    }
}