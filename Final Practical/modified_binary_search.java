import java.util.*;
class modified_binary_search{
    public static int search_insert(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
       System.out.println("Enter the elements of array");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("Enter the target element");
       int target=sc.nextInt();
       System.out.println(search_insert(arr,target));
    }
}