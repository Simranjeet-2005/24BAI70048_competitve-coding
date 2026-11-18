import java.util.*;
class brute_approach{
    public static int search_insert(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target || arr[i]>target){
                return i;
            }
           
        }
        return arr.length;
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