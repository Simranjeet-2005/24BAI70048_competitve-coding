import java.util.Scanner;
public class insert_2 {
    public static int insert(int arr[],int tar){
        int n=arr.length;
        int low=0;
        int high=n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<tar){
                low=mid+1;
            }else{
                high=mid;
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
        System.out.println("index -- " + insert(arr, tar));
    }
}
