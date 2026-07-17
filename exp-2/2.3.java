import java.util.*;
public class mutliple_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int res[]=new int[n];
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        int suffix=1;
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]*=arr[i];
        }
        for(int i=n-2;i>=0;i--){
            res[i]=prefix[i]*suffix;
            suffix*=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
