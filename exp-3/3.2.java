import java.util.*;
public class insert_1 {
    public static int insert(int arr[],int tar){
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(low==high && tar<arr[low]){
                return mid;
            }
            if(tar<arr[mid]){
                high=mid-1;
            }
            else if(tar>arr[mid]){
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
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
        System.out.println("index -- "+insert(arr,tar));
    }
}
