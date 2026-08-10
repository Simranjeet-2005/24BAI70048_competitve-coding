import java.util.*;
public class rotated {
    public static int rotatearr(int arr[], int tar){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(tar==arr[mid]){
                return mid;
            }
            if(arr[low]<arr[mid]){
                if(arr[low]<=tar && arr[mid]>=tar){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(tar>=arr[mid]&& tar<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
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
        System.out.println("index -- "+rotatearr(arr,tar));
    }
}
